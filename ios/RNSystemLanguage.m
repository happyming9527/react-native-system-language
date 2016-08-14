
#import "RNSystemLanguage.h"
#import "RCTLog.h"

#define INVOKE_FAILED (@"current system language fetch failed.")

@implementation RNSystemLanguage

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE()

RCT_REMAP_METHOD(getLanguageName,
                 resolver:(RCTPromiseResolveBlock)resolve
                 rejecter:(RCTPromiseRejectBlock)reject) {
    NSString * name = [[NSLocale preferredLanguages] objectAtIndex:0];
    if (name) {
        if (resolve) {
            resolve(name);
        }
    } else {
        if (reject) {
            NSError *error = nil;
            reject( @"-1", INVOKE_FAILED, error);
        }
    }
}

@end
  
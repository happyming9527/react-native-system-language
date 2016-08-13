
#import "RNSystemLanguage.h"

@implementation RNSystemLanguage

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

@end
  
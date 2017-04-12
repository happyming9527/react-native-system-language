
package com.publicbuy.systemlanguage;

import android.text.TextUtils;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.lang.RuntimeException;
import java.util.Locale;

public class RNSystemLanguageModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private static final String ErrorMessage = "current system language fetch failed.";
  public RNSystemLanguageModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSystemLanguage";
  }

  @ReactMethod
  public void getLanguageName(Promise promise) {
    try {
      String name = Locale.getDefault().getLanguage();
      if (TextUtils.isEmpty(name)) {
        throw new RuntimeException(ErrorMessage);
      }
      promise.resolve(name);
    } catch (RuntimeException e) {
      promise.reject(e.getMessage());
    }
  }
}
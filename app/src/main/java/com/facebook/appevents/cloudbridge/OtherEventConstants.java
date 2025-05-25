// Auto-fixed: added missing class declaration
public class OtherEventConstants {
package com.facebook.appevents.cloudbridge;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* loaded from: classes.dex */
public enum OtherEventConstants {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");
    
    private final String rawValue;

    OtherEventConstants(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

}

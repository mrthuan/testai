// Auto-fixed: added missing class declaration
public class ConversionsAPISection {
package com.facebook.appevents.cloudbridge;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* loaded from: classes.dex */
public enum ConversionsAPISection {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");
    
    private final String rawValue;

    ConversionsAPISection(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

}

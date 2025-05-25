package com.google.ads.mediation.inmobi;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class InMobiSdkWrapper {
    public String getToken(Map<String, String> map, String str) {
        return InMobiSdk.getToken(map, str);
    }

    public String getVersion() {
        return InMobiSdk.getVersion();
    }

    public void init(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        InMobiSdk.init(context, str, jSONObject, sdkInitializationListener);
    }

    public boolean isSDKInitialized() {
        return InMobiSdk.isSDKInitialized();
    }

    public void setIsAgeRestricted(Boolean bool) {
        InMobiSdk.setIsAgeRestricted(bool.booleanValue());
    }
}

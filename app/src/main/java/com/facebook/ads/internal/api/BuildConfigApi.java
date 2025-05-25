package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.activity.r;
import androidx.annotation.Keep;
import com.facebook.ads.BuildConfig;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public class BuildConfigApi {
    static final String UNITY_SHARED_PREFERENCES_SUFIX = ".v2.playerprefs";
    static final String UNITY_TAG = "an_isUnitySDK";
    static final String UNITY_VERSION_SUFIX = "-unity";

    public static String getVersionName(Context context) {
        if (isUnity(context)) {
            return r.g(new StringBuilder(), BuildConfig.VERSION_NAME, UNITY_VERSION_SUFIX);
        }
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    private static boolean isUnity(Context context) {
        if (!context.getSharedPreferences(context.getPackageName() + UNITY_SHARED_PREFERENCES_SUFIX, 0).contains(UNITY_TAG) && !context.getSharedPreferences(context.getPackageName(), 0).contains(UNITY_TAG)) {
            return false;
        }
        return true;
    }
}

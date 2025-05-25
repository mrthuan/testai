package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbbc;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public class zzab {
    public boolean a(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent b(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public zzbbc.zzq c(Context context, TelephonyManager telephonyManager) {
        return zzbbc.zzq.ENUM_UNKNOWN;
    }

    public boolean e(Context context) {
        return false;
    }

    public int f(AudioManager audioManager) {
        return 0;
    }

    public int h(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void d(Context context) {
    }

    public void g(Activity activity) {
    }
}

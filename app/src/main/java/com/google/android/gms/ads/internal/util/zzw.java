package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import bb.i;
import c4.h;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbw;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@TargetApi(26)
/* loaded from: classes.dex */
public class zzw extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final Intent b(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final zzbbc.zzq c(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        if (zzt.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            isDataEnabled = telephonyManager.isDataEnabled();
            if (isDataEnabled) {
                return zzbbc.zzq.ENUM_TRUE;
            }
            return zzbbc.zzq.ENUM_FALSE;
        }
        return zzbbc.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void d(Context context) {
        h.y();
        NotificationChannel c = i.c(((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhH)).intValue());
        c.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(c);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean e(Context context) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}

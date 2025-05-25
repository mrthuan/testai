package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbbw;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@TargetApi(24)
/* loaded from: classes.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean a(Activity activity, Configuration configuration) {
        int i10;
        boolean z10;
        boolean z11;
        boolean isInMultiWindowMode;
        zzbbn zzbbnVar = zzbbw.zzeo;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return false;
        }
        zzbbn zzbbnVar2 = zzbbw.zzeq;
        zzbbu zzbbuVar = zzbaVar.c;
        if (((Boolean) zzbbuVar.zza(zzbbnVar2)).booleanValue()) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
        int o10 = com.google.android.gms.ads.internal.util.client.zzf.o(activity, configuration.screenHeightDp);
        int o11 = com.google.android.gms.ads.internal.util.client.zzf.o(activity, configuration.screenWidthDp);
        zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        DisplayMetrics F = zzt.F((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i11 = F.heightPixels;
        int i12 = F.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i10 = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i10 = 0;
        }
        int intValue = ((Integer) zzbbuVar.zza(zzbbw.zzem)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        if (Math.abs(i11 - (o10 + i10)) <= intValue) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        if (Math.abs(i12 - o11) <= intValue) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return false;
        }
        return true;
    }
}

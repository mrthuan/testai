package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfgd {
    public static void zza(Context context, boolean z10) {
        if (z10) {
            com.google.android.gms.ads.internal.util.client.zzm.d("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
        String p10 = com.google.android.gms.ads.internal.util.client.zzf.p(context);
        com.google.android.gms.ads.internal.util.client.zzm.d("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + p10 + "\")) to get test ads on this device.");
    }

    public static void zzb(int i10, Throwable th2, String str) {
        com.google.android.gms.ads.internal.util.client.zzm.d("Ad failed to load : " + i10);
        com.google.android.gms.ads.internal.util.zze.i();
        if (i10 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, str);
    }
}

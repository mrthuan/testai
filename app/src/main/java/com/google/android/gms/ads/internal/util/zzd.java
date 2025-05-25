package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzbzr;
import m7.h;
import y9.a;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static void a(Context context) {
        boolean z10;
        Object obj = com.google.android.gms.ads.internal.util.client.zzl.f10365b;
        if (((Boolean) zzbdo.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (com.google.android.gms.ads.internal.util.client.zzl.f10365b) {
                        z10 = com.google.android.gms.ads.internal.util.client.zzl.c;
                    }
                    if (!z10) {
                        a zzb = new h(context).zzb();
                        com.google.android.gms.ads.internal.util.client.zzm.d("Updating ad debug logging enablement.");
                        zzbzr.zza(zzb, "AdDebugLogUpdater.updateEnablement");
                    }
                }
            } catch (Exception unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
            }
        }
    }
}

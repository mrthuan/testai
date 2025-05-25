package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyv {
    public final y9.a zza(Context context, int i10) {
        boolean z10;
        zzbzt zzbztVar = new zzbzt();
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
        zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
        int c = GoogleApiAvailabilityLight.f10884b.c(context, 12451000);
        if (c != 0 && c != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            zzbzo.zza.execute(new zzbyu(this, context, zzbztVar));
        }
        return zzbztVar;
    }
}

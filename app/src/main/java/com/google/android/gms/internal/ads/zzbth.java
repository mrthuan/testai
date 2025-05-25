package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbth extends zzbtb {
    final /* synthetic */ List zza;

    public zzbth(zzbtk zzbtkVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zze(String str) {
        com.google.android.gms.ads.internal.util.client.zzm.c("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzf(List list) {
        com.google.android.gms.ads.internal.util.client.zzm.d("Recorded impression urls: ".concat(this.zza.toString()));
    }
}

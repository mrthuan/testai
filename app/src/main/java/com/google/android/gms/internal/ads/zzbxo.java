package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbxo {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzbxo(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbya zzbyaVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i10, long j10) {
        zzbbn zzbbnVar = zzbbw.zzak;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return;
        }
        if (j10 - this.zza.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.h("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzal)).booleanValue()) {
            this.zza.m(-1);
            this.zza.r(j10);
            return;
        }
        this.zza.m(i10);
        this.zza.r(j10);
    }
}

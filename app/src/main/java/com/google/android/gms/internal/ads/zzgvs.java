package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgvs {
    private final zzgvr zza;

    private zzgvs(zzgvr zzgvrVar) {
        this.zza = zzgvrVar;
    }

    public static zzgvs zzb(byte[] bArr, zzger zzgerVar) {
        return new zzgvs(zzgvr.zzb(bArr));
    }

    public static zzgvs zzc(int i10) {
        return new zzgvs(zzgvr.zzb(zzgno.zzb(i10)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzger zzgerVar) {
        return this.zza.zzc();
    }
}

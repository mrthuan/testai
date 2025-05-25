package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzajc implements zzadi {
    final /* synthetic */ zzajd zza;

    public /* synthetic */ zzajc(zzajd zzajdVar, zzajb zzajbVar) {
        this.zza = zzajdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        zzajo zzajoVar;
        long j10;
        zzajd zzajdVar = this.zza;
        zzajoVar = zzajdVar.zzd;
        j10 = zzajdVar.zzf;
        return zzajoVar.zzf(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        zzajo zzajoVar;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        zzajd zzajdVar = this.zza;
        zzajoVar = zzajdVar.zzd;
        long zzg = zzajoVar.zzg(j10);
        j11 = zzajdVar.zzb;
        BigInteger valueOf = BigInteger.valueOf(zzg);
        zzajd zzajdVar2 = this.zza;
        j12 = zzajdVar2.zzc;
        j13 = zzajdVar2.zzb;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j12 - j13));
        j14 = this.zza.zzf;
        long longValue = multiply.divide(BigInteger.valueOf(j14)).longValue() + j11;
        zzajd zzajdVar3 = this.zza;
        j15 = zzajdVar3.zzb;
        j16 = zzajdVar3.zzc;
        zzadj zzadjVar = new zzadj(j10, Math.max(j15, Math.min(longValue - 30000, j16 - 1)));
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}

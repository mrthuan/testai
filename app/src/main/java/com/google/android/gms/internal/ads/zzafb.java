package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzafb extends zzacx {
    final /* synthetic */ zzadi zza;
    final /* synthetic */ zzafc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafb(zzafc zzafcVar, zzadi zzadiVar, zzadi zzadiVar2) {
        super(zzadiVar);
        this.zza = zzadiVar2;
        this.zzb = zzafcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacx, com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long j11;
        long j12;
        zzadg zzg = this.zza.zzg(j10);
        zzadj zzadjVar = zzg.zza;
        long j13 = zzadjVar.zzc;
        j11 = this.zzb.zzb;
        zzadj zzadjVar2 = new zzadj(zzadjVar.zzb, j11 + j13);
        zzadj zzadjVar3 = zzg.zzb;
        long j14 = zzadjVar3.zzc;
        j12 = this.zzb.zzb;
        return new zzadg(zzadjVar2, new zzadj(zzadjVar3.zzb, j12 + j14));
    }
}

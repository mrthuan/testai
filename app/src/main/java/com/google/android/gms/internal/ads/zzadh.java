package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzadh implements zzadi {
    private final long zza;
    private final zzadg zzb;

    public zzadh(long j10, long j11) {
        zzadj zzadjVar;
        this.zza = j10;
        if (j11 == 0) {
            zzadjVar = zzadj.zza;
        } else {
            zzadjVar = new zzadj(0L, j11);
        }
        this.zzb = new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return false;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzadb implements zzadi {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzadb(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        boolean z11;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        if (length2 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzd = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.zza = jArr3;
            long[] jArr4 = new long[i10];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        } else {
            this.zza = jArr;
            this.zzb = jArr2;
        }
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        if (!this.zzd) {
            zzadj zzadjVar = zzadj.zza;
            return new zzadg(zzadjVar, zzadjVar);
        }
        int zzc = zzet.zzc(this.zzb, j10, true, true);
        zzadj zzadjVar2 = new zzadj(this.zzb[zzc], this.zza[zzc]);
        if (zzadjVar2.zzb != j10) {
            long[] jArr = this.zzb;
            if (zzc != jArr.length - 1) {
                int i10 = zzc + 1;
                return new zzadg(zzadjVar2, new zzadj(jArr[i10], this.zza[i10]));
            }
        }
        return new zzadg(zzadjVar2, zzadjVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return this.zzd;
    }
}

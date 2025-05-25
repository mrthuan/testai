package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzabw implements zzadi {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzabw(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
            return;
        }
        this.zzf = 0L;
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        StringBuilder sb2 = new StringBuilder("ChunkIndex(length=");
        sb2.append(this.zza);
        sb2.append(", sizes=");
        sb2.append(arrays);
        sb2.append(", offsets=");
        a6.h.l(sb2, arrays2, ", timeUs=", arrays3, ", durationsUs=");
        return androidx.activity.r.g(sb2, arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final zzadg zzg(long j10) {
        long[] jArr = this.zze;
        int zzc = zzet.zzc(jArr, j10, true, true);
        zzadj zzadjVar = new zzadj(jArr[zzc], this.zzc[zzc]);
        if (zzadjVar.zzb < j10 && zzc != this.zza - 1) {
            int i10 = zzc + 1;
            return new zzadg(zzadjVar, new zzadj(this.zze[i10], this.zzc[i10]));
        }
        return new zzadg(zzadjVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadi
    public final boolean zzh() {
        return true;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaiz {
    public final zzaiw zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaiz(zzaiw zzaiwVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        int length3 = jArr.length;
        if (length3 == length2) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdi.zzd(z11);
        int length4 = iArr2.length;
        zzdi.zzd(length4 == length2);
        this.zza = zzaiwVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i10;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j10;
        this.zzb = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int zza(long j10) {
        for (int zzc = zzet.zzc(this.zzf, j10, true, false); zzc >= 0; zzc--) {
            if ((this.zzg[zzc] & 1) != 0) {
                return zzc;
            }
        }
        return -1;
    }

    public final int zzb(long j10) {
        for (int zza = zzet.zza(this.zzf, j10, true, false); zza < this.zzf.length; zza++) {
            if ((this.zzg[zza] & 1) != 0) {
                return zza;
            }
        }
        return -1;
    }
}

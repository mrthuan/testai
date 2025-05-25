package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcj {
    public final int zza;
    private final zzcd zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzcj(zzcd zzcdVar, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = zzcdVar.zza;
        this.zza = i10;
        boolean z12 = true;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdi.zzd(z11);
        this.zzb = zzcdVar;
        this.zzc = (!z10 || i10 <= 1) ? false : z12;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcj.class == obj.getClass()) {
            zzcj zzcjVar = (zzcj) obj;
            if (this.zzc == zzcjVar.zzc && this.zzb.equals(zzcjVar.zzb) && Arrays.equals(this.zzd, zzcjVar.zzd) && Arrays.equals(this.zze, zzcjVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.zzd) + (((this.zzb.hashCode() * 31) + (this.zzc ? 1 : 0)) * 31);
        return Arrays.hashCode(this.zze) + (hashCode * 31);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzaf zzb(int i10) {
        return this.zzb.zzb(i10);
    }

    public final boolean zzc() {
        for (boolean z10 : this.zze) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i10) {
        return this.zze[i10];
    }
}

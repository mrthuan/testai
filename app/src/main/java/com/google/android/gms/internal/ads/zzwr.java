package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzwr implements zzxv {
    protected final zzcd zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzaf[] zzd;
    private int zze;

    public zzwr(zzcd zzcdVar, int[] iArr, int i10) {
        boolean z10;
        int length = iArr.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        zzcdVar.getClass();
        this.zza = zzcdVar;
        this.zzb = length;
        this.zzd = new zzaf[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzcdVar.zzb(iArr[i11]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzaf) obj2).zzi - ((zzaf) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzcdVar.zza(this.zzd[i12]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwr zzwrVar = (zzwr) obj;
            if (this.zza.equals(zzwrVar.zza) && Arrays.equals(this.zzc, zzwrVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zza(int i10) {
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzaf zzd(int i10) {
        return this.zzd[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final zzcd zze() {
        return this.zza;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeq {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzeq() {
        throw null;
    }

    private final Object zzf() {
        boolean z10;
        if (this.zzd > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        Object[] objArr = this.zzb;
        int i10 = this.zzc;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.zzc = (i10 + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized int zza() {
        return this.zzd;
    }

    public final synchronized Object zzb() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized Object zzc(long j10) {
        Object obj;
        obj = null;
        while (this.zzd > 0 && j10 - this.zza[this.zzc] >= 0) {
            obj = zzf();
        }
        return obj;
    }

    public final synchronized void zzd(long j10, Object obj) {
        int i10 = this.zzd;
        if (i10 > 0) {
            if (j10 <= this.zza[((this.zzc + i10) - 1) % this.zzb.length]) {
                zze();
            }
        }
        int length = this.zzb.length;
        if (this.zzd >= length) {
            int i11 = length + length;
            long[] jArr = new long[i11];
            Object[] objArr = new Object[i11];
            int i12 = this.zzc;
            int i13 = length - i12;
            System.arraycopy(this.zza, i12, jArr, 0, i13);
            System.arraycopy(this.zzb, this.zzc, objArr, 0, i13);
            int i14 = this.zzc;
            if (i14 > 0) {
                System.arraycopy(this.zza, 0, jArr, i13, i14);
                System.arraycopy(this.zzb, 0, objArr, i13, this.zzc);
            }
            this.zza = jArr;
            this.zzb = objArr;
            this.zzc = 0;
        }
        int i15 = this.zzc;
        int i16 = this.zzd;
        Object[] objArr2 = this.zzb;
        int length2 = (i15 + i16) % objArr2.length;
        this.zza[length2] = j10;
        objArr2[length2] = obj;
        this.zzd = i16 + 1;
    }

    public final synchronized void zze() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public zzeq(int i10) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}

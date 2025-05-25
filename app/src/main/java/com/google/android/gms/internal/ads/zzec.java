package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzec {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzec() {
        throw null;
    }

    public final long zza() {
        if (this.zzb != 0) {
            return this.zzc[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i10 = this.zzb;
        if (i10 != 0) {
            long[] jArr = this.zzc;
            int i11 = this.zza;
            long j10 = jArr[i11];
            this.zza = this.zzd & (i11 + 1);
            this.zzb = i10 - 1;
            return j10;
        }
        throw new NoSuchElementException();
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzd() {
        if (this.zzb == 0) {
            return true;
        }
        return false;
    }

    public zzec(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i11 = highestOneBit + highestOneBit;
        }
        this.zza = 0;
        this.zzb = 0;
        long[] jArr = new long[i11];
        this.zzc = jArr;
        this.zzd = jArr.length - 1;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfi {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfi(byte[] bArr, int i10, int i11) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = i11;
        zzh();
    }

    private final int zzg() {
        int i10 = 0;
        int i11 = 0;
        while (!zzf()) {
            i11++;
        }
        int i12 = 1 << i11;
        if (i11 > 0) {
            i10 = zza(i11);
        }
        return (i12 - 1) + i10;
    }

    private final void zzh() {
        int i10;
        int i11 = this.zzc;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.zzb) || (i11 == i10 && this.zzd == 0))) {
            z10 = true;
        }
        zzdi.zzf(z10);
    }

    private final boolean zzi(int i10) {
        if (i10 >= 2 && i10 < this.zzb) {
            byte[] bArr = this.zza;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int zza(int i10) {
        int i11;
        int i12;
        this.zzd += i10;
        int i13 = 0;
        while (true) {
            i11 = this.zzd;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.zzd = i14;
            byte[] bArr = this.zza;
            int i15 = this.zzc;
            i13 |= (bArr[i15] & 255) << i14;
            if (true != zzi(i15 + 1)) {
                i12 = 1;
            }
            this.zzc = i15 + i12;
        }
        byte[] bArr2 = this.zza;
        int i16 = this.zzc;
        int i17 = i13 | ((bArr2[i16] & 255) >> (8 - i11));
        int i18 = 32 - i10;
        if (i11 == 8) {
            this.zzd = 0;
            if (true != zzi(i16 + 1)) {
                i12 = 1;
            }
            this.zzc = i16 + i12;
        }
        int i19 = ((-1) >>> i18) & i17;
        zzh();
        return i19;
    }

    public final int zzb() {
        int zzg = zzg();
        int i10 = zzg % 2;
        int i11 = 1;
        int i12 = zzg + 1;
        if (i10 == 0) {
            i11 = -1;
        }
        return (i12 / 2) * i11;
    }

    public final int zzc() {
        return zzg();
    }

    public final void zzd() {
        int i10 = 1;
        int i11 = this.zzd + 1;
        this.zzd = i11;
        if (i11 == 8) {
            this.zzd = 0;
            int i12 = this.zzc;
            if (true == zzi(i12 + 1)) {
                i10 = 2;
            }
            this.zzc = i12 + i10;
        }
        zzh();
    }

    public final void zze(int i10) {
        int i11 = this.zzc;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.zzc = i13;
        int i14 = (i10 - (i12 * 8)) + this.zzd;
        this.zzd = i14;
        if (i14 > 7) {
            this.zzc = i13 + 1;
            this.zzd = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 <= this.zzc) {
                if (zzi(i11)) {
                    this.zzc++;
                    i11 += 2;
                }
            } else {
                zzh();
                return;
            }
        }
    }

    public final boolean zzf() {
        int i10 = this.zza[this.zzc] & (128 >> this.zzd);
        zzd();
        if (i10 != 0) {
            return true;
        }
        return false;
    }
}

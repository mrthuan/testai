package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgwz extends zzgxd {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgwz(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzM(byte b10) {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzN(int i10, boolean z10) {
        zzu(i10 << 3);
        zzM(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzO(int i10, zzgwm zzgwmVar) {
        zzu((i10 << 3) | 2);
        zzu(zzgwmVar.zzd());
        zzgwmVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwd
    public final void zza(byte[] bArr, int i10, int i11) {
        zze(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzh(int i10, int i11) {
        zzu((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzi(int i10) {
        try {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            this.zzc = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzj(int i10, long j10) {
        zzu((i10 << 3) | 1);
        zzk(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzk(long j10) {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            this.zzc = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzl(int i10, int i11) {
        zzu(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzm(int i10) {
        if (i10 >= 0) {
            zzu(i10);
        } else {
            zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzn(int i10, zzgzj zzgzjVar, zzhae zzhaeVar) {
        zzu((i10 << 3) | 2);
        zzu(((zzgvv) zzgzjVar).zzaM(zzhaeVar));
        zzhaeVar.zzj(zzgzjVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzo(int i10, zzgzj zzgzjVar) {
        zzu(11);
        zzt(2, i10);
        zzu(26);
        zzu(zzgzjVar.zzaY());
        zzgzjVar.zzda(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzp(int i10, zzgwm zzgwmVar) {
        zzu(11);
        zzt(2, i10);
        zzO(3, zzgwmVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzq(int i10, String str) {
        zzu((i10 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) {
        int i10 = this.zzc;
        try {
            int zzD = zzgxd.zzD(str.length() * 3);
            int zzD2 = zzgxd.zzD(str.length());
            if (zzD2 == zzD) {
                int i11 = i10 + zzD2;
                this.zzc = i11;
                int zzd = zzhbe.zzd(str, this.zza, i11, this.zzb - i11);
                this.zzc = i10;
                zzu((zzd - i10) - zzD2);
                this.zzc = zzd;
                return;
            }
            zzu(zzhbe.zze(str));
            byte[] bArr = this.zza;
            int i12 = this.zzc;
            this.zzc = zzhbe.zzd(str, bArr, i12, this.zzb - i12);
        } catch (zzhbd e10) {
            this.zzc = i10;
            zzH(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgxa(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzs(int i10, int i11) {
        zzu((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzt(int i10, int i11) {
        zzu(i10 << 3);
        zzu(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzu(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
            }
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzv(int i10, long j10) {
        zzu(i10 << 3);
        zzw(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzw(long j10) {
        boolean z10;
        z10 = zzgxd.zzb;
        if (!z10 || this.zzb - this.zzc < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
                }
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.zza;
                int i13 = this.zzc;
                this.zzc = i13 + 1;
                zzhaz.zzq(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.zza;
            int i14 = this.zzc;
            this.zzc = i14 + 1;
            zzhaz.zzq(bArr4, i14, (byte) ((i12 | 128) & FunctionEval.FunctionID.EXTERNAL_FUNC));
            j10 >>>= 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final void zzL() {
    }
}

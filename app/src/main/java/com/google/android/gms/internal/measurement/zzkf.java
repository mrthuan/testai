package com.google.android.gms.internal.measurement;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzkf extends zzki {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzkf(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i11) | i11) >= 0) {
                this.zzc = bArr;
                this.zze = 0;
                this.zzd = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzb(byte b10) {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            this.zze = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i11);
            this.zze += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzd(int i10, boolean z10) {
        zzq(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zze(int i10, zzka zzkaVar) {
        zzq((i10 << 3) | 2);
        zzq(zzkaVar.zzd());
        zzkaVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzf(int i10, int i11) {
        zzq((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzg(int i10) {
        try {
            byte[] bArr = this.zzc;
            int i11 = this.zze;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            this.zze = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzh(int i10, long j10) {
        zzq((i10 << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzi(long j10) {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
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
            this.zze = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzj(int i10, int i11) {
        zzq(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzk(int i10) {
        if (i10 >= 0) {
            zzq(i10);
        } else {
            zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzl(byte[] bArr, int i10, int i11) {
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzm(int i10, String str) {
        zzq((i10 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i10 = this.zze;
        try {
            int zzx = zzki.zzx(str.length() * 3);
            int zzx2 = zzki.zzx(str.length());
            if (zzx2 == zzx) {
                int i11 = i10 + zzx2;
                this.zze = i11;
                int zzb = zznz.zzb(str, this.zzc, i11, this.zzd - i11);
                this.zze = i10;
                zzq((zzb - i10) - zzx2);
                this.zze = zzb;
                return;
            }
            zzq(zznz.zzc(str));
            byte[] bArr = this.zzc;
            int i12 = this.zze;
            this.zze = zznz.zzb(str, bArr, i12, this.zzd - i12);
        } catch (zzny e10) {
            this.zze = i10;
            zzB(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzkg(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzo(int i10, int i11) {
        zzq((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzp(int i10, int i11) {
        zzq(i10 << 3);
        zzq(i11);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzq(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr[i11] = (byte) ((i10 & ShapeTypes.VERTICAL_SCROLL) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }
        byte[] bArr2 = this.zzc;
        int i12 = this.zze;
        this.zze = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzr(int i10, long j10) {
        zzq(i10 << 3);
        zzs(j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzs(long j10) {
        boolean z10;
        z10 = zzki.zzd;
        if (z10 && this.zzd - this.zze >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                zznu.zzn(bArr, i10, (byte) ((((int) j10) & ShapeTypes.VERTICAL_SCROLL) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i11 = this.zze;
            this.zze = i11 + 1;
            zznu.zzn(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i12 = this.zze;
                this.zze = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & ShapeTypes.VERTICAL_SCROLL) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }
        byte[] bArr4 = this.zzc;
        int i13 = this.zze;
        this.zze = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}

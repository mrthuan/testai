package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgwy extends zzgxd {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzgwy(int i10) {
        super(null);
        if (i10 >= 0) {
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b10) {
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        this.zza[i10] = b10;
        this.zzd++;
    }

    public final void zzd(int i10) {
        int i11 = this.zzc;
        int i12 = i11 + 1;
        byte[] bArr = this.zza;
        bArr[i11] = (byte) (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        this.zzc = i14 + 1;
        bArr[i14] = (byte) ((i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        this.zzd += 4;
    }

    public final void zze(long j10) {
        int i10 = this.zzc;
        int i11 = i10 + 1;
        byte[] bArr = this.zza;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i14 + 1;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        this.zzc = i17 + 1;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        this.zzd += 8;
    }

    public final void zzf(int i10) {
        boolean z10;
        z10 = zzgxd.zzb;
        if (z10) {
            long j10 = this.zzc;
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzhaz.zzq(bArr, i11, (byte) ((i10 | 128) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            zzhaz.zzq(bArr2, i12, (byte) i10);
            this.zzd += (int) (this.zzc - j10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            bArr3[i13] = (byte) ((i10 | 128) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            this.zzd++;
            i10 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        bArr4[i14] = (byte) i10;
        this.zzd++;
    }

    public final void zzg(long j10) {
        boolean z10;
        z10 = zzgxd.zzb;
        if (z10) {
            long j11 = this.zzc;
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    zzhaz.zzq(bArr, i11, (byte) i10);
                    this.zzd += (int) (this.zzc - j11);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzhaz.zzq(bArr2, i12, (byte) ((i10 | 128) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i14 = this.zzc;
                    this.zzc = i14 + 1;
                    bArr3[i14] = (byte) i13;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i15 = this.zzc;
                this.zzc = i15 + 1;
                bArr4[i15] = (byte) ((i13 | 128) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                this.zzd++;
                j10 >>>= 7;
            }
        }
    }
}

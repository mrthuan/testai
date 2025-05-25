package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzasx {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzasx(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.zza;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & FunctionEval.FunctionID.EXTERNAL_FUNC;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i10 = this.zzb;
        int i11 = this.zzc;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.zza;
            i10 = (i10 + 1) & FunctionEval.FunctionID.EXTERNAL_FUNC;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & FunctionEval.FunctionID.EXTERNAL_FUNC;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & FunctionEval.FunctionID.EXTERNAL_FUNC] ^ bArr[i12]);
        }
        this.zzb = i10;
        this.zzc = i11;
    }
}

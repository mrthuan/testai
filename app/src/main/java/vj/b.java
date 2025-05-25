package vj;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: ZipCryptoEngine.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f30829b = new int[256];

    /* renamed from: a  reason: collision with root package name */
    public final int[] f30830a = new int[3];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 < 8; i12++) {
                if ((i11 & 1) == 1) {
                    i11 = (i11 >>> 1) ^ (-306674912);
                } else {
                    i11 >>>= 1;
                }
            }
            f30829b[i10] = i11;
        }
    }

    public final void a(byte b10) {
        int[] iArr = this.f30830a;
        int i10 = iArr[0];
        int[] iArr2 = f30829b;
        int i11 = iArr2[(b10 ^ i10) & FunctionEval.FunctionID.EXTERNAL_FUNC] ^ (i10 >>> 8);
        iArr[0] = i11;
        int i12 = iArr[1] + (i11 & FunctionEval.FunctionID.EXTERNAL_FUNC);
        iArr[1] = i12;
        int i13 = (i12 * 134775813) + 1;
        iArr[1] = i13;
        int i14 = iArr[2];
        iArr[2] = iArr2[(i14 ^ ((byte) (i13 >> 24))) & FunctionEval.FunctionID.EXTERNAL_FUNC] ^ (i14 >>> 8);
    }
}

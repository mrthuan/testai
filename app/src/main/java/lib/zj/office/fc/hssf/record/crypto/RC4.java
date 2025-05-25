package lib.zj.office.fc.hssf.record.crypto;

import a0.d;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.util.HexDump;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RC4 {
    private int _i;
    private int _j;
    private final byte[] _s = new byte[256];

    public RC4(byte[] bArr) {
        int length = bArr.length;
        for (int i10 = 0; i10 < 256; i10++) {
            this._s[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            int i13 = i11 + bArr[i12 % length];
            byte[] bArr2 = this._s;
            byte b10 = bArr2[i12];
            i11 = (i13 + b10) & FunctionEval.FunctionID.EXTERNAL_FUNC;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this._i = 0;
        this._j = 0;
    }

    public void encrypt(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ output());
        }
    }

    public byte output() {
        int i10 = (this._i + 1) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        this._i = i10;
        int i11 = this._j;
        byte[] bArr = this._s;
        byte b10 = bArr[i10];
        int i12 = (i11 + b10) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        this._j = i12;
        bArr[i10] = bArr[i12];
        bArr[i12] = b10;
        return bArr[(bArr[i10] + b10) & FunctionEval.FunctionID.EXTERNAL_FUNC];
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        d.h(RC4.class, stringBuffer, " [i=");
        stringBuffer.append(this._i);
        stringBuffer.append(" j=");
        stringBuffer.append(this._j);
        stringBuffer.append("]\n");
        stringBuffer.append(HexDump.dump(this._s, 0L, 0));
        return stringBuffer.toString();
    }

    public void encrypt(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            bArr[i10] = (byte) (bArr[i10] ^ output());
            i10++;
        }
    }
}

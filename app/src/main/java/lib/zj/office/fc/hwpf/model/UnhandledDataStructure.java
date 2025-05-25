package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class UnhandledDataStructure {
    byte[] _buf;

    public UnhandledDataStructure(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this._buf = bArr2;
        if (i10 + i11 <= bArr.length) {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return;
        }
        throw new IndexOutOfBoundsException("buffer length is " + bArr.length + "but code is trying to read " + i11 + " from offset " + i10);
    }

    public byte[] getBuf() {
        return this._buf;
    }
}

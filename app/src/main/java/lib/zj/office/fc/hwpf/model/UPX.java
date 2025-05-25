package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class UPX {
    private byte[] _upx;

    public UPX(byte[] bArr) {
        this._upx = bArr;
    }

    public boolean equals(Object obj) {
        return Arrays.equals(this._upx, ((UPX) obj)._upx);
    }

    public byte[] getUPX() {
        return this._upx;
    }

    public int size() {
        return this._upx.length;
    }
}

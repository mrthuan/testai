package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class FIBShortHandler {
    public static final int LIDFE = 13;
    public static final int MAGICCREATED = 0;
    public static final int MAGICCREATEDPRIVATE = 2;
    public static final int MAGICREVISED = 1;
    public static final int MAGICREVISEDPRIVATE = 3;
    static final int START = 32;
    short[] _shorts;

    public FIBShortHandler(byte[] bArr) {
        int i10 = LittleEndian.getShort(bArr, 32);
        this._shorts = new short[i10];
        int i11 = 34;
        for (int i12 = 0; i12 < i10; i12++) {
            this._shorts[i12] = LittleEndian.getShort(bArr, i11);
            i11 += 2;
        }
    }

    public short getShort(int i10) {
        return this._shorts[i10];
    }

    public void serialize(byte[] bArr) {
        LittleEndian.putShort(bArr, 32, (short) this._shorts.length);
        int i10 = 34;
        int i11 = 0;
        while (true) {
            short[] sArr = this._shorts;
            if (i11 < sArr.length) {
                LittleEndian.putShort(bArr, i10, sArr[i11]);
                i10 += 2;
                i11++;
            } else {
                return;
            }
        }
    }

    public int sizeInBytes() {
        return (this._shorts.length * 2) + 2;
    }
}

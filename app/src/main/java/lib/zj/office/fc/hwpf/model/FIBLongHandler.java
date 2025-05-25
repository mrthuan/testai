package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class FIBLongHandler {
    public static final int CBMAC = 0;
    public static final int CCPATN = 7;
    public static final int CCPEDN = 8;
    public static final int CCPFTN = 4;
    public static final int CCPHDD = 5;
    public static final int CCPHDRTXBX = 10;
    public static final int CCPMCR = 6;
    public static final int CCPTEXT = 3;
    public static final int CCPTXBX = 9;
    public static final int CPNBTECHP = 13;
    public static final int CPNBTELVC = 19;
    public static final int CPNBTEPAP = 16;
    public static final int FCISLANDFIRST = 20;
    public static final int FCISLANDLIM = 21;
    public static final int PNCHPFIRST = 12;
    public static final int PNFBPCHPFIRST = 11;
    public static final int PNFBPLVCFIRST = 17;
    public static final int PNFBPPAPFIRST = 14;
    public static final int PNLVCFIRST = 18;
    public static final int PNPAPFIRST = 15;
    public static final int PRODUCTCREATED = 1;
    public static final int PRODUCTREVISED = 2;
    int[] _longs;

    public FIBLongHandler(byte[] bArr, int i10) {
        int i11 = LittleEndian.getShort(bArr, i10);
        int i12 = i10 + 2;
        this._longs = new int[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            this._longs[i13] = LittleEndian.getInt(bArr, (i13 * 4) + i12);
        }
    }

    public int getLong(int i10) {
        return this._longs[i10];
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10, (short) this._longs.length);
        int i11 = i10 + 2;
        int i12 = 0;
        while (true) {
            int[] iArr = this._longs;
            if (i12 < iArr.length) {
                LittleEndian.putInt(bArr, i11, iArr[i12]);
                i11 += 4;
                i12++;
            } else {
                return;
            }
        }
    }

    public void setLong(int i10, int i11) {
        this._longs[i10] = i11;
    }

    public int sizeInBytes() {
        return (this._longs.length * 4) + 2;
    }
}

package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class POIListData {
    private byte _info;
    POIListLevel[] _levels;
    private int _lsid;
    private byte _reserved;
    private short[] _rgistd;
    private int _tplc;
    private static BitField _fSimpleList = BitFieldFactory.getInstance(1);
    private static BitField _fRestartHdn = BitFieldFactory.getInstance(2);

    public POIListData(int i10, boolean z10) {
        this._lsid = i10;
        this._rgistd = new short[9];
        int i11 = 0;
        for (int i12 = 0; i12 < 9; i12++) {
            this._rgistd[i12] = 4095;
        }
        this._levels = new POIListLevel[9];
        while (true) {
            POIListLevel[] pOIListLevelArr = this._levels;
            if (i11 >= pOIListLevelArr.length) {
                return;
            }
            pOIListLevelArr[i11] = new POIListLevel(i11, z10);
            i11++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        POIListData pOIListData = (POIListData) obj;
        if (pOIListData._info != this._info || !Arrays.equals(pOIListData._levels, this._levels) || pOIListData._lsid != this._lsid || pOIListData._reserved != this._reserved || pOIListData._tplc != this._tplc || !Arrays.equals(pOIListData._rgistd, this._rgistd)) {
            return false;
        }
        return true;
    }

    public POIListLevel getLevel(int i10) {
        return this._levels[i10 - 1];
    }

    public int getLevelStyle(int i10) {
        return this._rgistd[i10];
    }

    public POIListLevel[] getLevels() {
        return this._levels;
    }

    public int getLsid() {
        return this._lsid;
    }

    public int numLevels() {
        return this._levels.length;
    }

    public int resetListID() {
        int random = (int) (Math.random() * System.currentTimeMillis());
        this._lsid = random;
        return random;
    }

    public void setLevel(int i10, POIListLevel pOIListLevel) {
        this._levels[i10] = pOIListLevel;
    }

    public void setLevelStyle(int i10, int i11) {
        this._rgistd[i10] = (short) i11;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[28];
        LittleEndian.putInt(bArr, this._lsid);
        LittleEndian.putInt(bArr, 4, this._tplc);
        int i10 = 8;
        for (int i11 = 0; i11 < 9; i11++) {
            LittleEndian.putShort(bArr, i10, this._rgistd[i11]);
            i10 += 2;
        }
        bArr[i10] = this._info;
        bArr[i10 + 1] = this._reserved;
        return bArr;
    }

    public POIListData(byte[] bArr, int i10) {
        this._lsid = LittleEndian.getInt(bArr, i10);
        int i11 = i10 + 4;
        this._tplc = LittleEndian.getInt(bArr, i11);
        int i12 = i11 + 4;
        this._rgistd = new short[9];
        for (int i13 = 0; i13 < 9; i13++) {
            this._rgistd[i13] = LittleEndian.getShort(bArr, i12);
            i12 += 2;
        }
        int i14 = i12 + 1;
        byte b10 = bArr[i12];
        this._info = b10;
        this._reserved = bArr[i14];
        if (_fSimpleList.getValue(b10) > 0) {
            this._levels = new POIListLevel[1];
        } else {
            this._levels = new POIListLevel[9];
        }
    }
}

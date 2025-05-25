package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class ListFormatOverrideLevel {
    private static final int BASE_SIZE = 8;
    int _iStartAt;
    byte _info;
    POIListLevel _lvl;
    byte[] _reserved = new byte[3];
    private static BitField _ilvl = BitFieldFactory.getInstance(15);
    private static BitField _fStartAt = BitFieldFactory.getInstance(16);
    private static BitField _fFormatting = BitFieldFactory.getInstance(32);

    public ListFormatOverrideLevel(byte[] bArr, int i10) {
        this._iStartAt = LittleEndian.getInt(bArr, i10);
        int i11 = i10 + 4;
        int i12 = i11 + 1;
        this._info = bArr[i11];
        byte[] bArr2 = this._reserved;
        System.arraycopy(bArr, i12, bArr2, 0, bArr2.length);
        int length = i12 + this._reserved.length;
        if (_fFormatting.getValue(this._info) > 0) {
            this._lvl = new POIListLevel(bArr, length);
        }
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (obj == null) {
            return false;
        }
        ListFormatOverrideLevel listFormatOverrideLevel = (ListFormatOverrideLevel) obj;
        POIListLevel pOIListLevel = this._lvl;
        if (pOIListLevel != null) {
            z10 = pOIListLevel.equals(listFormatOverrideLevel._lvl);
        } else if (listFormatOverrideLevel._lvl == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || listFormatOverrideLevel._iStartAt != this._iStartAt || listFormatOverrideLevel._info != this._info || !Arrays.equals(listFormatOverrideLevel._reserved, this._reserved)) {
            return false;
        }
        return true;
    }

    public int getIStartAt() {
        return this._iStartAt;
    }

    public POIListLevel getLevel() {
        return this._lvl;
    }

    public int getLevelNum() {
        return _ilvl.getValue(this._info);
    }

    public int getSizeInBytes() {
        POIListLevel pOIListLevel = this._lvl;
        if (pOIListLevel == null) {
            return 8;
        }
        return 8 + pOIListLevel.getSizeInBytes();
    }

    public boolean isFormatting() {
        if (_fFormatting.getValue(this._info) != 0) {
            return true;
        }
        return false;
    }

    public boolean isStartAt() {
        if (_fStartAt.getValue(this._info) != 0) {
            return true;
        }
        return false;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[getSizeInBytes()];
        LittleEndian.putInt(bArr, this._iStartAt);
        bArr[4] = this._info;
        System.arraycopy(this._reserved, 0, bArr, 5, 3);
        POIListLevel pOIListLevel = this._lvl;
        if (pOIListLevel != null) {
            byte[] byteArray = pOIListLevel.toByteArray();
            System.arraycopy(byteArray, 0, bArr, 8, byteArray.length);
        }
        return bArr;
    }
}

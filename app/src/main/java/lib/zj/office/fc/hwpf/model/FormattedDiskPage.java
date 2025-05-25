package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public abstract class FormattedDiskPage {
    protected int _crun;
    protected byte[] _fkp;
    protected int _offset;

    public FormattedDiskPage() {
    }

    public int getEnd(int i10) {
        return LittleEndian.getInt(this._fkp, ((i10 + 1) * 4) + this._offset);
    }

    public abstract byte[] getGrpprl(int i10);

    public int getStart(int i10) {
        return LittleEndian.getInt(this._fkp, (i10 * 4) + this._offset);
    }

    public int size() {
        return this._crun;
    }

    public FormattedDiskPage(byte[] bArr, int i10) {
        this._crun = LittleEndian.getUnsignedByte(bArr, i10 + 511);
        this._fkp = bArr;
        this._offset = i10;
    }
}

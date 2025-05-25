package lib.zj.office.fc.hwpf.sprm;

import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class SprmIterator {
    private byte[] _grpprl;
    int _offset;

    public SprmIterator(byte[] bArr, int i10) {
        this._grpprl = bArr;
        this._offset = i10;
    }

    public boolean hasNext() {
        if (this._offset < this._grpprl.length - 1) {
            return true;
        }
        return false;
    }

    public SprmOperation next() {
        SprmOperation sprmOperation = new SprmOperation(this._grpprl, this._offset);
        this._offset = sprmOperation.size() + this._offset;
        return sprmOperation;
    }
}

package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class DummyPositionSensitiveRecordWithChildren extends PositionDependentRecordContainer {
    private byte[] _header;
    private long _type;

    public DummyPositionSensitiveRecordWithChildren(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._type = LittleEndian.getUShort(this._header, 2);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return this._type;
    }
}

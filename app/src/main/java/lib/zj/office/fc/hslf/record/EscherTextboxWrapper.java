package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.ddf.EscherTextboxRecord;

/* loaded from: classes3.dex */
public final class EscherTextboxWrapper extends RecordContainer {
    private EscherTextboxRecord _escherRecord;
    private long _type;
    private int shapeId;

    public EscherTextboxWrapper(EscherTextboxRecord escherTextboxRecord) {
        this._escherRecord = escherTextboxRecord;
        this._type = escherTextboxRecord.getRecordId();
        byte[] data = this._escherRecord.getData();
        this._children = Record.findChildRecords(data, 0, data.length);
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        EscherTextboxRecord escherTextboxRecord = this._escherRecord;
        if (escherTextboxRecord != null) {
            escherTextboxRecord.dispose();
        }
    }

    public EscherTextboxRecord getEscherRecord() {
        return this._escherRecord;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return this._type;
    }

    public int getShapeId() {
        return this.shapeId;
    }

    public void setShapeId(int i10) {
        this.shapeId = i10;
    }

    public EscherTextboxWrapper() {
        EscherTextboxRecord escherTextboxRecord = new EscherTextboxRecord();
        this._escherRecord = escherTextboxRecord;
        escherTextboxRecord.setRecordId(EscherTextboxRecord.RECORD_ID);
        this._escherRecord.setOptions((short) 15);
        this._children = new Record[0];
    }
}

package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class TextHeaderAtom extends RecordAtom implements ParentAwareRecord {
    public static final int BODY_TYPE = 1;
    public static final int CENTER_TITLE_TYPE = 6;
    public static final int CENTRE_BODY_TYPE = 5;
    public static final int HALF_BODY_TYPE = 7;
    public static final int NOTES_TYPE = 2;
    public static final int OTHER_TYPE = 4;
    public static final int QUARTER_BODY_TYPE = 8;
    public static final int TITLE_TYPE = 0;
    private static long _type = 3999;
    private byte[] _header;
    private RecordContainer parentRecord;
    private int textType;

    public TextHeaderAtom(byte[] bArr, int i10, int i11) {
        if (i11 < 12 && bArr.length - i10 < 12) {
            throw new RuntimeException("Not enough data to form a TextHeaderAtom (always 12 bytes long) - found " + (bArr.length - i10));
        }
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.textType = LittleEndian.getInt(bArr, i10 + 8);
    }

    @Override // lib.zj.office.fc.hslf.record.ParentAwareRecord
    public RecordContainer getParentRecord() {
        return this.parentRecord;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public int getTextType() {
        return this.textType;
    }

    @Override // lib.zj.office.fc.hslf.record.ParentAwareRecord
    public void setParentRecord(RecordContainer recordContainer) {
        this.parentRecord = recordContainer;
    }

    public void setTextType(int i10) {
        this.textType = i10;
    }

    public TextHeaderAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putUShort(bArr, 0, 0);
        LittleEndian.putUShort(this._header, 2, (int) _type);
        LittleEndian.putInt(this._header, 4, 4);
        this.textType = 4;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}

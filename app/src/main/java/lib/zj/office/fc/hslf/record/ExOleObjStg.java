package lib.zj.office.fc.hslf.record;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class ExOleObjStg extends RecordAtom implements PositionDependentRecord, PersistRecord {
    private byte[] _data;
    private byte[] _header;
    private int _persistId;
    protected int myLastOnDiskOffset;

    public ExOleObjStg() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._data = new byte[0];
        LittleEndian.putShort(bArr, 0, (short) 16);
        LittleEndian.putShort(this._header, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public InputStream getData() {
        byte[] bArr = this._data;
        return new InflaterInputStream(new ByteArrayInputStream(bArr, 4, bArr.length));
    }

    public int getDataLength() {
        return LittleEndian.getInt(this._data, 0);
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecord
    public int getLastOnDiskOffset() {
        return this.myLastOnDiskOffset;
    }

    @Override // lib.zj.office.fc.hslf.record.PersistRecord
    public int getPersistId() {
        return this._persistId;
    }

    public byte[] getRawData() {
        return this._data;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExOleObjStg.typeID;
    }

    public void setData(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[4];
        LittleEndian.putInt(bArr2, bArr.length);
        byteArrayOutputStream.write(bArr2);
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        deflaterOutputStream.write(bArr, 0, bArr.length);
        deflaterOutputStream.finish();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this._data = byteArray;
        LittleEndian.putInt(this._header, 4, byteArray.length);
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void setLastOnDiskOffset(int i10) {
        this.myLastOnDiskOffset = i10;
    }

    @Override // lib.zj.office.fc.hslf.record.PersistRecord
    public void setPersistId(int i10) {
        this._persistId = i10;
    }

    public ExOleObjStg(byte[] bArr, int i10, int i11) {
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
    }
}

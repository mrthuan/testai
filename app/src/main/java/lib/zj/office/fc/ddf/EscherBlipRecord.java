package lib.zj.office.fc.ddf;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherBlipRecord extends EscherRecord {
    private static final int HEADER_SIZE = 8;
    public static final String RECORD_DESCRIPTION = "msofbtBlip";
    public static final short RECORD_ID_END = -3817;
    public static final short RECORD_ID_START = -4072;
    protected byte[] field_pictureData;
    private String tempFilePath;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        byte[] bArr2 = new byte[readHeader];
        this.field_pictureData = bArr2;
        System.arraycopy(bArr, i10 + 8, bArr2, 0, readHeader);
        return readHeader + 8;
    }

    public byte[] getPicturedata() {
        return this.field_pictureData;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "Blip";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return this.field_pictureData.length + 8;
    }

    public String getTempFilePath() {
        return this.tempFilePath;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        byte[] bArr2 = this.field_pictureData;
        int i11 = i10 + 4;
        System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
        escherSerializationListener.afterRecordSerialize(i11 + this.field_pictureData.length, getRecordId(), this.field_pictureData.length + 4, this);
        return this.field_pictureData.length + 4;
    }

    public void setPictureData(byte[] bArr) {
        this.field_pictureData = bArr;
    }

    public void setTempFilePath(String str) {
        this.tempFilePath = str;
    }

    public String toString() {
        String hex = HexDump.toHex(this.field_pictureData, 32);
        return getClass().getName() + ":\n  RecordId: 0x" + HexDump.toHex(getRecordId()) + "\n  Options: 0x" + HexDump.toHex(getOptions()) + "\n  Extra Data:\n" + hex;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}

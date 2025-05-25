package lib.zj.office.fc.ddf;

import java.io.ByteArrayOutputStream;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherBitmapBlip extends EscherBlipRecord {
    private static final int HEADER_SIZE = 8;
    public static final short RECORD_ID_DIB = -4065;
    public static final short RECORD_ID_JPEG = -4067;
    public static final short RECORD_ID_PNG = -4066;
    private byte[] field_1_UID;
    private byte field_2_marker = -1;

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        int i11 = i10 + 8;
        byte[] bArr2 = new byte[16];
        this.field_1_UID = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 16);
        int i12 = i11 + 16;
        this.field_2_marker = bArr[i12];
        byte[] bArr3 = new byte[readHeader - 17];
        this.field_pictureData = bArr3;
        System.arraycopy(bArr, i12 + 1, bArr3, 0, bArr3.length);
        return readHeader + 8;
    }

    public byte getMarker() {
        return this.field_2_marker;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return this.field_pictureData.length + 25;
    }

    public byte[] getUID() {
        return this.field_1_UID;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord, lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        LittleEndian.putInt(bArr, i10 + 4, getRecordSize() - 8);
        int i11 = i10 + 8;
        System.arraycopy(this.field_1_UID, 0, bArr, i11, 16);
        bArr[i11 + 16] = this.field_2_marker;
        byte[] bArr2 = this.field_pictureData;
        System.arraycopy(bArr2, 0, bArr, i11 + 17, bArr2.length);
        escherSerializationListener.afterRecordSerialize(getRecordSize() + i10, getRecordId(), getRecordSize(), this);
        return this.field_pictureData.length + 25;
    }

    public void setMarker(byte b10) {
        this.field_2_marker = b10;
    }

    public void setUID(byte[] bArr) {
        this.field_1_UID = bArr;
    }

    @Override // lib.zj.office.fc.ddf.EscherBlipRecord
    public String toString() {
        String obj;
        String property = System.getProperty("line.separator");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HexDump.dump(this.field_pictureData, 0L, byteArrayOutputStream, 0);
            obj = byteArrayOutputStream.toString();
        } catch (Exception e10) {
            obj = e10.toString();
        }
        return getClass().getName() + ":" + property + "  RecordId: 0x" + HexDump.toHex(getRecordId()) + property + "  Options: 0x" + HexDump.toHex(getOptions()) + property + "  UID: 0x" + HexDump.toHex(this.field_1_UID) + property + "  Marker: 0x" + HexDump.toHex(this.field_2_marker) + property + "  Extra Data:" + property + obj;
    }
}

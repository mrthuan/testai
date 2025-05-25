package lib.zj.office.fc.ddf;

import androidx.activity.f;
import java.io.ByteArrayOutputStream;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherClientDataRecord extends EscherRecord {
    public static final String RECORD_DESCRIPTION = "MsofbtClientData";
    public static final short RECORD_ID = -4079;
    private byte[] remainingData;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        byte[] bArr2 = new byte[readHeader];
        this.remainingData = bArr2;
        System.arraycopy(bArr, i10 + 8, bArr2, 0, readHeader);
        return readHeader + 8;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getRecordId() {
        return RECORD_ID;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "ClientData";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        int length;
        byte[] bArr = this.remainingData;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        return length + 8;
    }

    public byte[] getRemainingData() {
        return this.remainingData;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        if (this.remainingData == null) {
            this.remainingData = new byte[0];
        }
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        LittleEndian.putInt(bArr, i10 + 4, this.remainingData.length);
        byte[] bArr2 = this.remainingData;
        int i11 = i10 + 8;
        System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
        int length = i11 + this.remainingData.length;
        int i12 = length - i10;
        escherSerializationListener.afterRecordSerialize(length, getRecordId(), i12, this);
        return i12;
    }

    public void setRemainingData(byte[] bArr) {
        this.remainingData = bArr;
    }

    public String toString() {
        String str;
        String property = System.getProperty("line.separator");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HexDump.dump(this.remainingData, 0L, byteArrayOutputStream, 0);
            str = byteArrayOutputStream.toString();
        } catch (Exception unused) {
            str = "error\n";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(":");
        sb2.append(property);
        sb2.append("  RecordId: 0x");
        sb2.append(HexDump.toHex((short) RECORD_ID));
        sb2.append(property);
        sb2.append("  Options: 0x");
        sb2.append(HexDump.toHex(getOptions()));
        sb2.append(property);
        return f.o(sb2, "  Extra Data:", property, str);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}

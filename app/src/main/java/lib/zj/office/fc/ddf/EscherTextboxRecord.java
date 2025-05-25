package lib.zj.office.fc.ddf;

import androidx.activity.r;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.RecordFormatException;

/* loaded from: classes3.dex */
public class EscherTextboxRecord extends EscherRecord {
    private static final byte[] NO_BYTES = new byte[0];
    public static final String RECORD_DESCRIPTION = "msofbtClientTextbox";
    public static final short RECORD_ID = -4083;
    private byte[] thedata = NO_BYTES;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public Object clone() {
        return super.clone();
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        byte[] bArr2 = new byte[readHeader];
        this.thedata = bArr2;
        System.arraycopy(bArr, i10 + 8, bArr2, 0, readHeader);
        return readHeader + 8;
    }

    public byte[] getData() {
        return this.thedata;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "ClientTextbox";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return this.thedata.length + 8;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        LittleEndian.putInt(bArr, i10 + 4, this.thedata.length);
        byte[] bArr2 = this.thedata;
        int i11 = i10 + 8;
        System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
        int length = i11 + this.thedata.length;
        int i12 = length - i10;
        escherSerializationListener.afterRecordSerialize(length, getRecordId(), i12, this);
        if (i12 == getRecordSize()) {
            return i12;
        }
        throw new RecordFormatException(i12 + " bytes written but getRecordSize() reports " + getRecordSize());
    }

    public void setData(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.thedata = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public String toString() {
        String str;
        String property = System.getProperty("line.separator");
        try {
            if (this.thedata.length != 0) {
                str = ("  Extra Data:" + property) + HexDump.dump(this.thedata, 0L, 0);
            } else {
                str = "";
            }
        } catch (Exception unused) {
            str = "Error!!";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(":");
        sb2.append(property);
        sb2.append("  isContainer: ");
        sb2.append(isContainerRecord());
        sb2.append(property);
        sb2.append("  options: 0x");
        sb2.append(HexDump.toHex(getOptions()));
        sb2.append(property);
        sb2.append("  recordId: 0x");
        sb2.append(HexDump.toHex(getRecordId()));
        sb2.append(property);
        sb2.append("  numchildren: ");
        sb2.append(getChildRecords().size());
        return r.g(sb2, property, str);
    }

    public void setData(byte[] bArr) {
        setData(bArr, 0, bArr.length);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}

package lib.zj.office.fc.ddf;

import b.a;
import java.io.ByteArrayOutputStream;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherClientAnchorRecord extends EscherRecord {
    public static final String RECORD_DESCRIPTION = "MsofbtClientAnchor";
    public static final short RECORD_ID = -4080;
    private short field_1_flag;
    private short field_2_col1;
    private short field_3_dx1;
    private short field_4_row1;
    private short field_5_dy1;
    private short field_6_col2;
    private short field_7_dx2;
    private short field_8_row2;
    private short field_9_dy2;
    private byte[] remainingData;
    private boolean shortRecord = false;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int i11;
        int readHeader = readHeader(bArr, i10);
        int i12 = i10 + 8;
        if (readHeader == 4) {
            i11 = 0;
        } else {
            i11 = 16;
            if (readHeader == 16) {
                this.field_1_flag = LittleEndian.getShort(bArr, i12 + 0);
                this.field_2_col1 = LittleEndian.getShort(bArr, i12 + 4);
                this.field_3_dx1 = LittleEndian.getShort(bArr, i12 + 8);
                this.field_4_row1 = LittleEndian.getShort(bArr, i12 + 12);
                this.shortRecord = false;
            } else {
                this.field_1_flag = LittleEndian.getShort(bArr, i12 + 0);
                this.field_2_col1 = LittleEndian.getShort(bArr, i12 + 2);
                this.field_3_dx1 = LittleEndian.getShort(bArr, i12 + 4);
                this.field_4_row1 = LittleEndian.getShort(bArr, i12 + 6);
                i11 = 18;
                if (readHeader >= 18) {
                    this.field_5_dy1 = LittleEndian.getShort(bArr, i12 + 8);
                    this.field_6_col2 = LittleEndian.getShort(bArr, i12 + 10);
                    this.field_7_dx2 = LittleEndian.getShort(bArr, i12 + 12);
                    this.field_8_row2 = LittleEndian.getShort(bArr, i12 + 14);
                    this.field_9_dy2 = LittleEndian.getShort(bArr, i12 + 16);
                    this.shortRecord = false;
                } else {
                    this.shortRecord = true;
                    i11 = 8;
                }
            }
        }
        int i13 = readHeader - i11;
        byte[] bArr2 = new byte[i13];
        this.remainingData = bArr2;
        System.arraycopy(bArr, i12 + i11, bArr2, 0, i13);
        return i11 + 8 + i13;
    }

    public short getCol1() {
        return this.field_2_col1;
    }

    public short getCol2() {
        return this.field_6_col2;
    }

    public short getDx1() {
        return this.field_3_dx1;
    }

    public short getDx2() {
        return this.field_7_dx2;
    }

    public short getDy1() {
        return this.field_5_dy1;
    }

    public short getDy2() {
        return this.field_9_dy2;
    }

    public short getFlag() {
        return this.field_1_flag;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getRecordId() {
        return RECORD_ID;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "ClientAnchor";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        int i10;
        int length;
        if (this.shortRecord) {
            i10 = 8;
        } else {
            i10 = 18;
        }
        int i11 = i10 + 8;
        byte[] bArr = this.remainingData;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        return i11 + length;
    }

    public byte[] getRemainingData() {
        return this.remainingData;
    }

    public short getRow1() {
        return this.field_4_row1;
    }

    public short getRow2() {
        return this.field_8_row2;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        int i11;
        int i12;
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        if (this.remainingData == null) {
            this.remainingData = new byte[0];
        }
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        int length = this.remainingData.length;
        int i13 = 8;
        if (this.shortRecord) {
            i11 = 8;
        } else {
            i11 = 18;
        }
        LittleEndian.putInt(bArr, i10 + 4, length + i11);
        int i14 = i10 + 8;
        LittleEndian.putShort(bArr, i14, this.field_1_flag);
        LittleEndian.putShort(bArr, i10 + 10, this.field_2_col1);
        LittleEndian.putShort(bArr, i10 + 12, this.field_3_dx1);
        LittleEndian.putShort(bArr, i10 + 14, this.field_4_row1);
        if (!this.shortRecord) {
            LittleEndian.putShort(bArr, i10 + 16, this.field_5_dy1);
            LittleEndian.putShort(bArr, i10 + 18, this.field_6_col2);
            LittleEndian.putShort(bArr, i10 + 20, this.field_7_dx2);
            LittleEndian.putShort(bArr, i10 + 22, this.field_8_row2);
            LittleEndian.putShort(bArr, i10 + 24, this.field_9_dy2);
        }
        byte[] bArr2 = this.remainingData;
        if (this.shortRecord) {
            i12 = 16;
        } else {
            i12 = 26;
        }
        System.arraycopy(bArr2, 0, bArr, i12 + i10, bArr2.length);
        if (!this.shortRecord) {
            i13 = 18;
        }
        int length2 = i14 + i13 + this.remainingData.length;
        int i15 = length2 - i10;
        escherSerializationListener.afterRecordSerialize(length2, getRecordId(), i15, this);
        return i15;
    }

    public void setCol1(short s4) {
        this.field_2_col1 = s4;
    }

    public void setCol2(short s4) {
        this.shortRecord = false;
        this.field_6_col2 = s4;
    }

    public void setDx1(short s4) {
        this.field_3_dx1 = s4;
    }

    public void setDx2(short s4) {
        this.shortRecord = false;
        this.field_7_dx2 = s4;
    }

    public void setDy1(short s4) {
        this.shortRecord = false;
        this.field_5_dy1 = s4;
    }

    public void setDy2(short s4) {
        this.shortRecord = false;
        this.field_9_dy2 = s4;
    }

    public void setFlag(short s4) {
        this.field_1_flag = s4;
    }

    public void setRemainingData(byte[] bArr) {
        this.remainingData = bArr;
    }

    public void setRow1(short s4) {
        this.field_4_row1 = s4;
    }

    public void setRow2(short s4) {
        this.shortRecord = false;
        this.field_8_row2 = s4;
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
        sb2.append("  Flag: ");
        a.k(sb2, this.field_1_flag, property, "  Col1: ");
        a.k(sb2, this.field_2_col1, property, "  DX1: ");
        a.k(sb2, this.field_3_dx1, property, "  Row1: ");
        a.k(sb2, this.field_4_row1, property, "  DY1: ");
        a.k(sb2, this.field_5_dy1, property, "  Col2: ");
        a.k(sb2, this.field_6_col2, property, "  DX2: ");
        a.k(sb2, this.field_7_dx2, property, "  Row2: ");
        a.k(sb2, this.field_8_row2, property, "  DY2: ");
        sb2.append((int) this.field_9_dy2);
        sb2.append(property);
        sb2.append("  Extra Data:");
        sb2.append(property);
        sb2.append(str);
        return sb2.toString();
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}

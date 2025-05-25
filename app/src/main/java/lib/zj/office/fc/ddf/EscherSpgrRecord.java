package lib.zj.office.fc.ddf;

import androidx.activity.f;
import b.a;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.RecordFormatException;

/* loaded from: classes3.dex */
public class EscherSpgrRecord extends EscherRecord {
    public static final String RECORD_DESCRIPTION = "MsofbtSpgr";
    public static final short RECORD_ID = -4087;
    private int field_1_rectX1;
    private int field_2_rectY1;
    private int field_3_rectX2;
    private int field_4_rectY2;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        int i11 = i10 + 8;
        this.field_1_rectX1 = LittleEndian.getInt(bArr, i11 + 0);
        this.field_2_rectY1 = LittleEndian.getInt(bArr, i11 + 4);
        this.field_3_rectX2 = LittleEndian.getInt(bArr, i11 + 8);
        this.field_4_rectY2 = LittleEndian.getInt(bArr, i11 + 12);
        int i12 = readHeader - 16;
        if (i12 == 0) {
            return i12 + 24;
        }
        throw new RecordFormatException(a.c("Expected no remaining bytes but got ", i12));
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getRecordId() {
        return RECORD_ID;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "Spgr";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return 24;
    }

    public int getRectX1() {
        return this.field_1_rectX1;
    }

    public int getRectX2() {
        return this.field_3_rectX2;
    }

    public int getRectY1() {
        return this.field_2_rectY1;
    }

    public int getRectY2() {
        return this.field_4_rectY2;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        LittleEndian.putInt(bArr, i10 + 4, 16);
        LittleEndian.putInt(bArr, i10 + 8, this.field_1_rectX1);
        LittleEndian.putInt(bArr, i10 + 12, this.field_2_rectY1);
        LittleEndian.putInt(bArr, i10 + 16, this.field_3_rectX2);
        LittleEndian.putInt(bArr, i10 + 20, this.field_4_rectY2);
        escherSerializationListener.afterRecordSerialize(getRecordSize() + i10, getRecordId(), getRecordSize() + i10, this);
        return 24;
    }

    public void setRectX1(int i10) {
        this.field_1_rectX1 = i10;
    }

    public void setRectX2(int i10) {
        this.field_3_rectX2 = i10;
    }

    public void setRectY1(int i10) {
        this.field_2_rectY1 = i10;
    }

    public void setRectY2(int i10) {
        this.field_4_rectY2 = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(":\n  RecordId: 0x");
        sb2.append(HexDump.toHex((short) RECORD_ID));
        sb2.append("\n  Options: 0x");
        sb2.append(HexDump.toHex(getOptions()));
        sb2.append("\n  RectX: ");
        sb2.append(this.field_1_rectX1);
        sb2.append("\n  RectY: ");
        sb2.append(this.field_2_rectY1);
        sb2.append("\n  RectWidth: ");
        sb2.append(this.field_3_rectX2);
        sb2.append("\n  RectHeight: ");
        return f.n(sb2, this.field_4_rectY2, '\n');
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}

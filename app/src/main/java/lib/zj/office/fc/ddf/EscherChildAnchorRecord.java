package lib.zj.office.fc.ddf;

import a6.h;
import b.a;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherChildAnchorRecord extends EscherRecord {
    public static final String RECORD_DESCRIPTION = "MsofbtChildAnchor";
    public static final short RECORD_ID = -4081;
    private int field_1_dx1;
    private int field_2_dy1;
    private int field_3_dx2;
    private int field_4_dy2;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        readHeader(bArr, i10);
        int i11 = i10 + 8;
        this.field_1_dx1 = LittleEndian.getInt(bArr, i11 + 0);
        this.field_2_dy1 = LittleEndian.getInt(bArr, i11 + 4);
        this.field_3_dx2 = LittleEndian.getInt(bArr, i11 + 8);
        this.field_4_dy2 = LittleEndian.getInt(bArr, i11 + 12);
        return 24;
    }

    public int getDx1() {
        return this.field_1_dx1;
    }

    public int getDx2() {
        return this.field_3_dx2;
    }

    public int getDy1() {
        return this.field_2_dy1;
    }

    public int getDy2() {
        return this.field_4_dy2;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getRecordId() {
        return RECORD_ID;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "ChildAnchor";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return 24;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        int i11 = i10 + 2;
        LittleEndian.putShort(bArr, i11, getRecordId());
        int i12 = i11 + 2;
        LittleEndian.putInt(bArr, i12, getRecordSize() - 8);
        int i13 = i12 + 4;
        LittleEndian.putInt(bArr, i13, this.field_1_dx1);
        int i14 = i13 + 4;
        LittleEndian.putInt(bArr, i14, this.field_2_dy1);
        int i15 = i14 + 4;
        LittleEndian.putInt(bArr, i15, this.field_3_dx2);
        int i16 = i15 + 4;
        LittleEndian.putInt(bArr, i16, this.field_4_dy2);
        int i17 = i16 + 4;
        int i18 = i17 - i10;
        escherSerializationListener.afterRecordSerialize(i17, getRecordId(), i18, this);
        return i18;
    }

    public void setDx1(int i10) {
        this.field_1_dx1 = i10;
    }

    public void setDx2(int i10) {
        this.field_3_dx2 = i10;
    }

    public void setDy1(int i10) {
        this.field_2_dy1 = i10;
    }

    public void setDy2(int i10) {
        this.field_4_dy2 = i10;
    }

    public String toString() {
        String property = System.getProperty("line.separator");
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
        sb2.append("  X1: ");
        a.k(sb2, this.field_1_dx1, property, "  Y1: ");
        a.k(sb2, this.field_2_dy1, property, "  X2: ");
        a.k(sb2, this.field_3_dx2, property, "  Y2: ");
        return h.g(sb2, this.field_4_dy2, property);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}

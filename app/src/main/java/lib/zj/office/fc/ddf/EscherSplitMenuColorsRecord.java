package lib.zj.office.fc.ddf;

import a0.a;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.RecordFormatException;

/* loaded from: classes3.dex */
public class EscherSplitMenuColorsRecord extends EscherRecord {
    public static final String RECORD_DESCRIPTION = "MsofbtSplitMenuColors";
    public static final short RECORD_ID = -3810;
    private int field_1_color1;
    private int field_2_color2;
    private int field_3_color3;
    private int field_4_color4;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        int i11 = i10 + 8;
        this.field_1_color1 = LittleEndian.getInt(bArr, i11 + 0);
        this.field_2_color2 = LittleEndian.getInt(bArr, i11 + 4);
        this.field_3_color3 = LittleEndian.getInt(bArr, i11 + 8);
        this.field_4_color4 = LittleEndian.getInt(bArr, i11 + 12);
        int i12 = readHeader - 16;
        if (i12 == 0) {
            return i12 + 24;
        }
        throw new RecordFormatException(a.g("Expecting no remaining data but got ", i12, " byte(s)."));
    }

    public int getColor1() {
        return this.field_1_color1;
    }

    public int getColor2() {
        return this.field_2_color2;
    }

    public int getColor3() {
        return this.field_3_color3;
    }

    public int getColor4() {
        return this.field_4_color4;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getRecordId() {
        return RECORD_ID;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "SplitMenuColors";
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
        LittleEndian.putInt(bArr, i13, this.field_1_color1);
        int i14 = i13 + 4;
        LittleEndian.putInt(bArr, i14, this.field_2_color2);
        int i15 = i14 + 4;
        LittleEndian.putInt(bArr, i15, this.field_3_color3);
        int i16 = i15 + 4;
        LittleEndian.putInt(bArr, i16, this.field_4_color4);
        int i17 = i16 + 4;
        escherSerializationListener.afterRecordSerialize(i17, getRecordId(), i17 - i10, this);
        return getRecordSize();
    }

    public void setColor1(int i10) {
        this.field_1_color1 = i10;
    }

    public void setColor2(int i10) {
        this.field_2_color2 = i10;
    }

    public void setColor3(int i10) {
        this.field_3_color3 = i10;
    }

    public void setColor4(int i10) {
        this.field_4_color4 = i10;
    }

    public String toString() {
        return getClass().getName() + ":\n  RecordId: 0x" + HexDump.toHex((short) RECORD_ID) + "\n  Options: 0x" + HexDump.toHex(getOptions()) + "\n  Color1: 0x" + HexDump.toHex(this.field_1_color1) + "\n  Color2: 0x" + HexDump.toHex(this.field_2_color2) + "\n  Color3: 0x" + HexDump.toHex(this.field_3_color3) + "\n  Color4: 0x" + HexDump.toHex(this.field_4_color4) + "\n";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}

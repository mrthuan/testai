package lib.zj.office.fc.ddf;

import b.a;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherSpRecord extends EscherRecord {
    public static final int FLAG_BACKGROUND = 1024;
    public static final int FLAG_CHILD = 2;
    public static final int FLAG_CONNECTOR = 256;
    public static final int FLAG_DELETED = 8;
    public static final int FLAG_FLIPHORIZ = 64;
    public static final int FLAG_FLIPVERT = 128;
    public static final int FLAG_GROUP = 1;
    public static final int FLAG_HASSHAPETYPE = 2048;
    public static final int FLAG_HAVEANCHOR = 512;
    public static final int FLAG_HAVEMASTER = 32;
    public static final int FLAG_OLESHAPE = 16;
    public static final int FLAG_PATRIARCH = 4;
    public static final String RECORD_DESCRIPTION = "MsofbtSp";
    public static final short RECORD_ID = -4086;
    private int field_1_shapeId;
    private int field_2_flags;

    private String decodeFlags(int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        StringBuffer stringBuffer = new StringBuffer();
        String str12 = "";
        if ((i10 & 1) == 0) {
            str = "";
        } else {
            str = "|GROUP";
        }
        stringBuffer.append(str);
        if ((i10 & 2) == 0) {
            str2 = "";
        } else {
            str2 = "|CHILD";
        }
        stringBuffer.append(str2);
        if ((i10 & 4) == 0) {
            str3 = "";
        } else {
            str3 = "|PATRIARCH";
        }
        stringBuffer.append(str3);
        if ((i10 & 8) == 0) {
            str4 = "";
        } else {
            str4 = "|DELETED";
        }
        stringBuffer.append(str4);
        if ((i10 & 16) == 0) {
            str5 = "";
        } else {
            str5 = "|OLESHAPE";
        }
        stringBuffer.append(str5);
        if ((i10 & 32) == 0) {
            str6 = "";
        } else {
            str6 = "|HAVEMASTER";
        }
        stringBuffer.append(str6);
        if ((i10 & 64) == 0) {
            str7 = "";
        } else {
            str7 = "|FLIPHORIZ";
        }
        stringBuffer.append(str7);
        if ((i10 & 128) == 0) {
            str8 = "";
        } else {
            str8 = "|FLIPVERT";
        }
        stringBuffer.append(str8);
        if ((i10 & 256) == 0) {
            str9 = "";
        } else {
            str9 = "|CONNECTOR";
        }
        stringBuffer.append(str9);
        if ((i10 & 512) == 0) {
            str10 = "";
        } else {
            str10 = "|HAVEANCHOR";
        }
        stringBuffer.append(str10);
        if ((i10 & 1024) == 0) {
            str11 = "";
        } else {
            str11 = "|BACKGROUND";
        }
        stringBuffer.append(str11);
        if ((i10 & 2048) != 0) {
            str12 = "|HASSHAPETYPE";
        }
        stringBuffer.append(str12);
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(0);
        }
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        readHeader(bArr, i10);
        int i11 = i10 + 8;
        this.field_1_shapeId = LittleEndian.getInt(bArr, i11 + 0);
        this.field_2_flags = LittleEndian.getInt(bArr, i11 + 4);
        return getRecordSize();
    }

    public int getFlags() {
        return this.field_2_flags;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getRecordId() {
        return RECORD_ID;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "Sp";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return 16;
    }

    public int getShapeId() {
        return this.field_1_shapeId;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        LittleEndian.putInt(bArr, i10 + 4, 8);
        LittleEndian.putInt(bArr, i10 + 8, this.field_1_shapeId);
        LittleEndian.putInt(bArr, i10 + 12, this.field_2_flags);
        escherSerializationListener.afterRecordSerialize(getRecordSize() + i10, getRecordId(), getRecordSize(), this);
        return 16;
    }

    public void setFlags(int i10) {
        this.field_2_flags = i10;
    }

    public void setShapeId(int i10) {
        this.field_1_shapeId = i10;
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
        sb2.append("  ShapeId: ");
        a.k(sb2, this.field_1_shapeId, property, "  Flags: ");
        sb2.append(decodeFlags(this.field_2_flags));
        sb2.append(" (0x");
        sb2.append(HexDump.toHex(this.field_2_flags));
        sb2.append(")");
        sb2.append(property);
        return sb2.toString();
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}

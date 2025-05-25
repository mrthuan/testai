package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class FormatRecord extends StandardRecord {
    public static final short sid = 1054;
    private final int field_1_index_code;
    private final boolean field_3_hasMultibyte;
    private final String field_4_formatstring;

    public FormatRecord(int i10, String str) {
        this.field_1_index_code = i10;
        this.field_4_formatstring = str;
        this.field_3_hasMultibyte = StringUtil.hasMultibyte(str);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        int length = getFormatString().length();
        if (this.field_3_hasMultibyte) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return (length * i10) + 5;
    }

    public String getFormatString() {
        return this.field_4_formatstring;
    }

    public int getIndexCode() {
        return this.field_1_index_code;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        String formatString = getFormatString();
        littleEndianOutput.writeShort(getIndexCode());
        littleEndianOutput.writeShort(formatString.length());
        littleEndianOutput.writeByte(this.field_3_hasMultibyte ? 1 : 0);
        if (this.field_3_hasMultibyte) {
            StringUtil.putUnicodeLE(formatString, littleEndianOutput);
        } else {
            StringUtil.putCompressedUnicode(formatString, littleEndianOutput);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FORMAT]\n    .indexcode       = ");
        stringBuffer.append(HexDump.shortToHex(getIndexCode()));
        stringBuffer.append("\n    .isUnicode       = ");
        stringBuffer.append(this.field_3_hasMultibyte);
        stringBuffer.append("\n    .formatstring    = ");
        stringBuffer.append(getFormatString());
        stringBuffer.append("\n[/FORMAT]\n");
        return stringBuffer.toString();
    }

    public FormatRecord(RecordInputStream recordInputStream) {
        this.field_1_index_code = recordInputStream.readShort();
        int readUShort = recordInputStream.readUShort();
        boolean z10 = (recordInputStream.readByte() & 1) != 0;
        this.field_3_hasMultibyte = z10;
        if (z10) {
            this.field_4_formatstring = recordInputStream.readUnicodeLEString(readUShort);
        } else {
            this.field_4_formatstring = recordInputStream.readCompressedUnicode(readUShort);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return this;
    }
}

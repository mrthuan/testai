package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class NameCommentRecord extends StandardRecord {
    public static final short sid = 2196;
    private final short field_1_record_type;
    private final short field_2_frt_cell_ref_flag;
    private final long field_3_reserved;
    private String field_6_name_text;
    private String field_7_comment_text;

    public NameCommentRecord(String str, String str2) {
        this.field_1_record_type = (short) 0;
        this.field_2_frt_cell_ref_flag = (short) 0;
        this.field_3_reserved = 0L;
        this.field_6_name_text = str;
        this.field_7_comment_text = str2;
    }

    public String getCommentText() {
        return this.field_7_comment_text;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this.field_7_comment_text.length() + this.field_6_name_text.length() + 18;
    }

    public String getNameText() {
        return this.field_6_name_text;
    }

    public short getRecordType() {
        return this.field_1_record_type;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int length = this.field_6_name_text.length();
        int length2 = this.field_7_comment_text.length();
        littleEndianOutput.writeShort(this.field_1_record_type);
        littleEndianOutput.writeShort(this.field_2_frt_cell_ref_flag);
        littleEndianOutput.writeLong(this.field_3_reserved);
        littleEndianOutput.writeShort(length);
        littleEndianOutput.writeShort(length2);
        littleEndianOutput.writeByte(0);
        StringUtil.putCompressedUnicode(this.field_6_name_text, littleEndianOutput);
        littleEndianOutput.writeByte(0);
        StringUtil.putCompressedUnicode(this.field_7_comment_text, littleEndianOutput);
    }

    public void setCommentText(String str) {
        this.field_7_comment_text = str;
    }

    public void setNameText(String str) {
        this.field_6_name_text = str;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[NAMECMT]\n    .record type            = ");
        r.j(this.field_1_record_type, stringBuffer, "\n    .frt cell ref flag      = ");
        stringBuffer.append(HexDump.byteToHex(this.field_2_frt_cell_ref_flag));
        stringBuffer.append("\n    .reserved               = ");
        stringBuffer.append(this.field_3_reserved);
        stringBuffer.append("\n    .name length            = ");
        stringBuffer.append(this.field_6_name_text.length());
        stringBuffer.append("\n    .comment length         = ");
        stringBuffer.append(this.field_7_comment_text.length());
        stringBuffer.append("\n    .name                   = ");
        stringBuffer.append(this.field_6_name_text);
        stringBuffer.append("\n    .comment                = ");
        stringBuffer.append(this.field_7_comment_text);
        stringBuffer.append("\n[/NAMECMT]\n");
        return stringBuffer.toString();
    }

    public NameCommentRecord(RecordInputStream recordInputStream) {
        this.field_1_record_type = recordInputStream.readShort();
        this.field_2_frt_cell_ref_flag = recordInputStream.readShort();
        this.field_3_reserved = recordInputStream.readLong();
        short readShort = recordInputStream.readShort();
        short readShort2 = recordInputStream.readShort();
        recordInputStream.readByte();
        this.field_6_name_text = StringUtil.readCompressedUnicode(recordInputStream, readShort);
        recordInputStream.readByte();
        this.field_7_comment_text = StringUtil.readCompressedUnicode(recordInputStream, readShort2);
    }
}

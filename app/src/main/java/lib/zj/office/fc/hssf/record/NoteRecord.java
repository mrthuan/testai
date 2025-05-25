package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class NoteRecord extends StandardRecord {
    public static final short NOTE_HIDDEN = 0;
    public static final short NOTE_VISIBLE = 2;
    public static final short sid = 28;
    private int field_1_row;
    private int field_2_col;
    private short field_3_flags;
    private int field_4_shapeid;
    private boolean field_5_hasMultibyte;
    private String field_6_author;
    private Byte field_7_padding;
    public static final NoteRecord[] EMPTY_ARRAY = new NoteRecord[0];
    private static final Byte DEFAULT_PADDING = (byte) 0;

    public NoteRecord() {
        this.field_6_author = "";
        this.field_3_flags = (short) 0;
        this.field_7_padding = DEFAULT_PADDING;
    }

    public boolean authorIsMultibyte() {
        return this.field_5_hasMultibyte;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        NoteRecord noteRecord = new NoteRecord();
        noteRecord.field_1_row = this.field_1_row;
        noteRecord.field_2_col = this.field_2_col;
        noteRecord.field_3_flags = this.field_3_flags;
        noteRecord.field_4_shapeid = this.field_4_shapeid;
        noteRecord.field_6_author = this.field_6_author;
        return noteRecord;
    }

    public String getAuthor() {
        return this.field_6_author;
    }

    public int getColumn() {
        return this.field_2_col;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        int length = this.field_6_author.length();
        int i11 = 1;
        if (this.field_5_hasMultibyte) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i12 = (length * i10) + 11;
        if (this.field_7_padding == null) {
            i11 = 0;
        }
        return i12 + i11;
    }

    public short getFlags() {
        return this.field_3_flags;
    }

    public int getRow() {
        return this.field_1_row;
    }

    public int getShapeId() {
        return this.field_4_shapeid;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 28;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_row);
        littleEndianOutput.writeShort(this.field_2_col);
        littleEndianOutput.writeShort(this.field_3_flags);
        littleEndianOutput.writeShort(this.field_4_shapeid);
        littleEndianOutput.writeShort(this.field_6_author.length());
        littleEndianOutput.writeByte(this.field_5_hasMultibyte ? 1 : 0);
        if (this.field_5_hasMultibyte) {
            StringUtil.putUnicodeLE(this.field_6_author, littleEndianOutput);
        } else {
            StringUtil.putCompressedUnicode(this.field_6_author, littleEndianOutput);
        }
        Byte b10 = this.field_7_padding;
        if (b10 != null) {
            littleEndianOutput.writeByte(b10.intValue());
        }
    }

    public void setAuthor(String str) {
        this.field_6_author = str;
        this.field_5_hasMultibyte = StringUtil.hasMultibyte(str);
    }

    public void setColumn(int i10) {
        this.field_2_col = i10;
    }

    public void setFlags(short s4) {
        this.field_3_flags = s4;
    }

    public void setRow(int i10) {
        this.field_1_row = i10;
    }

    public void setShapeId(int i10) {
        this.field_4_shapeid = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[NOTE]\n    .row    = ");
        stringBuffer.append(this.field_1_row);
        stringBuffer.append("\n    .col    = ");
        stringBuffer.append(this.field_2_col);
        stringBuffer.append("\n    .flags  = ");
        stringBuffer.append((int) this.field_3_flags);
        stringBuffer.append("\n    .shapeid= ");
        stringBuffer.append(this.field_4_shapeid);
        stringBuffer.append("\n    .author = ");
        stringBuffer.append(this.field_6_author);
        stringBuffer.append("\n[/NOTE]\n");
        return stringBuffer.toString();
    }

    public NoteRecord(RecordInputStream recordInputStream) {
        this.field_1_row = recordInputStream.readUShort();
        this.field_2_col = recordInputStream.readShort();
        this.field_3_flags = recordInputStream.readShort();
        this.field_4_shapeid = recordInputStream.readUShort();
        short readShort = recordInputStream.readShort();
        boolean z10 = recordInputStream.readByte() != 0;
        this.field_5_hasMultibyte = z10;
        if (z10) {
            this.field_6_author = StringUtil.readUnicodeLE(recordInputStream, readShort);
        } else {
            this.field_6_author = StringUtil.readCompressedUnicode(recordInputStream, readShort);
        }
        if (recordInputStream.available() == 1) {
            this.field_7_padding = Byte.valueOf(recordInputStream.readByte());
        }
    }
}

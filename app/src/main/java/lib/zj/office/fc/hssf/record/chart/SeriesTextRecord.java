package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class SeriesTextRecord extends StandardRecord {
    private static final int MAX_LEN = 255;
    public static final short sid = 4109;
    private int field_1_id;
    private String field_4_text;
    private boolean is16bit;

    public SeriesTextRecord() {
        this.field_4_text = "";
        this.is16bit = false;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SeriesTextRecord seriesTextRecord = new SeriesTextRecord();
        seriesTextRecord.field_1_id = this.field_1_id;
        seriesTextRecord.is16bit = this.is16bit;
        seriesTextRecord.field_4_text = this.field_4_text;
        return seriesTextRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        int length = this.field_4_text.length();
        if (this.is16bit) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return (length * i10) + 4;
    }

    public int getId() {
        return this.field_1_id;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public String getText() {
        return this.field_4_text;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_id);
        littleEndianOutput.writeByte(this.field_4_text.length());
        if (this.is16bit) {
            littleEndianOutput.writeByte(1);
            StringUtil.putUnicodeLE(this.field_4_text, littleEndianOutput);
            return;
        }
        littleEndianOutput.writeByte(0);
        StringUtil.putCompressedUnicode(this.field_4_text, littleEndianOutput);
    }

    public void setId(int i10) {
        this.field_1_id = i10;
    }

    public void setText(String str) {
        if (str.length() <= 255) {
            this.field_4_text = str;
            this.is16bit = StringUtil.hasMultibyte(str);
            return;
        }
        throw new IllegalArgumentException("Text is too long (" + str.length() + ">255)");
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SERIESTEXT]\n  .id     =");
        stringBuffer.append(HexDump.shortToHex(getId()));
        stringBuffer.append("\n  .textLen=");
        stringBuffer.append(this.field_4_text.length());
        stringBuffer.append("\n  .is16bit=");
        stringBuffer.append(this.is16bit);
        stringBuffer.append("\n  .text   = (");
        stringBuffer.append(getText());
        stringBuffer.append(" )\n[/SERIESTEXT]\n");
        return stringBuffer.toString();
    }

    public SeriesTextRecord(RecordInputStream recordInputStream) {
        this.field_1_id = recordInputStream.readUShort();
        int readUByte = recordInputStream.readUByte();
        boolean z10 = (recordInputStream.readUByte() & 1) != 0;
        this.is16bit = z10;
        if (z10) {
            this.field_4_text = recordInputStream.readUnicodeLEString(readUByte);
        } else {
            this.field_4_text = recordInputStream.readCompressedUnicode(readUByte);
        }
    }
}

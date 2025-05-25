package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import lib.zj.office.fc.util.HexDump;

/* loaded from: classes3.dex */
public final class LabelRecord extends Record implements CellValueRecordInterface {
    public static final short sid = 516;
    private int field_1_row;
    private short field_2_column;
    private short field_3_xf_index;
    private short field_4_string_len;
    private byte field_5_unicode_flag;
    private String field_6_value;

    public LabelRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        LabelRecord labelRecord = new LabelRecord();
        labelRecord.field_1_row = this.field_1_row;
        labelRecord.field_2_column = this.field_2_column;
        labelRecord.field_3_xf_index = this.field_3_xf_index;
        labelRecord.field_4_string_len = this.field_4_string_len;
        labelRecord.field_5_unicode_flag = this.field_5_unicode_flag;
        labelRecord.field_6_value = this.field_6_value;
        return labelRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public short getColumn() {
        return this.field_2_column;
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public int getRecordSize() {
        throw new RecordFormatException("Label Records are supported READ ONLY...convert to LabelSST");
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public int getRow() {
        return this.field_1_row;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 516;
    }

    public short getStringLength() {
        return this.field_4_string_len;
    }

    public String getValue() {
        return this.field_6_value;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public short getXFIndex() {
        return this.field_3_xf_index;
    }

    public boolean isUnCompressedUnicode() {
        if (this.field_5_unicode_flag == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public int serialize(int i10, byte[] bArr) {
        throw new RecordFormatException("Label Records are supported READ ONLY...convert to LabelSST");
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[LABEL]\n    .row       = ");
        stringBuffer.append(HexDump.shortToHex(getRow()));
        stringBuffer.append("\n    .column    = ");
        stringBuffer.append(HexDump.shortToHex(getColumn()));
        stringBuffer.append("\n    .xfindex   = ");
        stringBuffer.append(HexDump.shortToHex(getXFIndex()));
        stringBuffer.append("\n    .string_len= ");
        r.j(this.field_4_string_len, stringBuffer, "\n    .unicode_flag= ");
        stringBuffer.append(HexDump.byteToHex(this.field_5_unicode_flag));
        stringBuffer.append("\n    .value       = ");
        stringBuffer.append(getValue());
        stringBuffer.append("\n[/LABEL]\n");
        return stringBuffer.toString();
    }

    public LabelRecord(RecordInputStream recordInputStream) {
        this.field_1_row = recordInputStream.readUShort();
        this.field_2_column = recordInputStream.readShort();
        this.field_3_xf_index = recordInputStream.readShort();
        this.field_4_string_len = recordInputStream.readShort();
        this.field_5_unicode_flag = recordInputStream.readByte();
        if (this.field_4_string_len > 0) {
            if (isUnCompressedUnicode()) {
                this.field_6_value = recordInputStream.readUnicodeLEString(this.field_4_string_len);
                return;
            } else {
                this.field_6_value = recordInputStream.readCompressedUnicode(this.field_4_string_len);
                return;
            }
        }
        this.field_6_value = "";
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setColumn(short s4) {
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setRow(int i10) {
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setXFIndex(short s4) {
    }
}

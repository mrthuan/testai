package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lib.zj.office.fc.ss.util.WorkbookUtil;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class BoundSheetRecord extends StandardRecord {
    public static final short sid = 133;
    private int field_1_position_of_BOF;
    private int field_2_option_flags;
    private int field_4_isMultibyteUnicode;
    private String field_5_sheetname;
    private static final BitField hiddenFlag = BitFieldFactory.getInstance(1);
    private static final BitField veryHiddenFlag = BitFieldFactory.getInstance(2);
    private static final Comparator<BoundSheetRecord> BOFComparator = new Comparator<BoundSheetRecord>() { // from class: lib.zj.office.fc.hssf.record.BoundSheetRecord.1
        @Override // java.util.Comparator
        public int compare(BoundSheetRecord boundSheetRecord, BoundSheetRecord boundSheetRecord2) {
            return boundSheetRecord.getPositionOfBof() - boundSheetRecord2.getPositionOfBof();
        }
    };

    public BoundSheetRecord(String str) {
        this.field_2_option_flags = 0;
        setSheetname(str);
    }

    private boolean isMultibyte() {
        if ((this.field_4_isMultibyteUnicode & 1) != 0) {
            return true;
        }
        return false;
    }

    public static BoundSheetRecord[] orderByBofPosition(List<BoundSheetRecord> list) {
        BoundSheetRecord[] boundSheetRecordArr = new BoundSheetRecord[list.size()];
        list.toArray(boundSheetRecordArr);
        Arrays.sort(boundSheetRecordArr, BOFComparator);
        return boundSheetRecordArr;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        int length = this.field_5_sheetname.length();
        if (isMultibyte()) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return (length * i10) + 8;
    }

    public int getPositionOfBof() {
        return this.field_1_position_of_BOF;
    }

    public String getSheetname() {
        return this.field_5_sheetname;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 133;
    }

    public boolean isHidden() {
        return hiddenFlag.isSet(this.field_2_option_flags);
    }

    public boolean isVeryHidden() {
        return veryHiddenFlag.isSet(this.field_2_option_flags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(getPositionOfBof());
        littleEndianOutput.writeShort(this.field_2_option_flags);
        String str = this.field_5_sheetname;
        littleEndianOutput.writeByte(str.length());
        littleEndianOutput.writeByte(this.field_4_isMultibyteUnicode);
        if (isMultibyte()) {
            StringUtil.putUnicodeLE(str, littleEndianOutput);
        } else {
            StringUtil.putCompressedUnicode(str, littleEndianOutput);
        }
    }

    public void setHidden(boolean z10) {
        this.field_2_option_flags = hiddenFlag.setBoolean(this.field_2_option_flags, z10);
    }

    public void setPositionOfBof(int i10) {
        this.field_1_position_of_BOF = i10;
    }

    public void setSheetname(String str) {
        WorkbookUtil.validateSheetName(str);
        this.field_5_sheetname = str;
        this.field_4_isMultibyteUnicode = StringUtil.hasMultibyte(str) ? 1 : 0;
    }

    public void setVeryHidden(boolean z10) {
        this.field_2_option_flags = veryHiddenFlag.setBoolean(this.field_2_option_flags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[BOUNDSHEET]\n    .bof        = ");
        stringBuffer.append(HexDump.intToHex(getPositionOfBof()));
        stringBuffer.append("\n    .options    = ");
        r.j(this.field_2_option_flags, stringBuffer, "\n    .unicodeflag= ");
        stringBuffer.append(HexDump.byteToHex(this.field_4_isMultibyteUnicode));
        stringBuffer.append("\n    .sheetname  = ");
        stringBuffer.append(this.field_5_sheetname);
        stringBuffer.append("\n[/BOUNDSHEET]\n");
        return stringBuffer.toString();
    }

    public BoundSheetRecord(RecordInputStream recordInputStream) {
        this.field_1_position_of_BOF = recordInputStream.readInt();
        this.field_2_option_flags = recordInputStream.readUShort();
        int readUByte = recordInputStream.readUByte();
        this.field_4_isMultibyteUnicode = recordInputStream.readByte();
        if (isMultibyte()) {
            this.field_5_sheetname = recordInputStream.readUnicodeLEString(readUByte);
        } else {
            this.field_5_sheetname = recordInputStream.readCompressedUnicode(readUByte);
        }
    }
}

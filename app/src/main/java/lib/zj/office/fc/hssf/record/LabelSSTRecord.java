package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class LabelSSTRecord extends CellRecord {
    public static final short sid = 253;
    private int field_4_sst_index;

    public LabelSSTRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void appendValueText(StringBuilder sb2) {
        sb2.append("  .sstIndex = ");
        sb2.append(HexDump.shortToHex(getXFIndex()));
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        LabelSSTRecord labelSSTRecord = new LabelSSTRecord();
        copyBaseFields(labelSSTRecord);
        labelSSTRecord.field_4_sst_index = this.field_4_sst_index;
        return labelSSTRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public String getRecordName() {
        return "LABELSST";
    }

    public int getSSTIndex() {
        return this.field_4_sst_index;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 253;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public int getValueDataSize() {
        return 4;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void serializeValue(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(getSSTIndex());
    }

    public void setSSTIndex(int i10) {
        this.field_4_sst_index = i10;
    }

    public LabelSSTRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
        this.field_4_sst_index = recordInputStream.readInt();
    }
}

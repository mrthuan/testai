package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.record.cf.CellRangeUtil;
import lib.zj.office.fc.ss.util.CellRangeAddressList;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CFHeaderRecord extends StandardRecord {
    public static final short sid = 432;
    private int field_1_numcf;
    private int field_2_need_recalculation;
    private HSSFCellRangeAddress field_3_enclosing_cell_range;
    private CellRangeAddressList field_4_cell_ranges;

    public CFHeaderRecord() {
        this.field_4_cell_ranges = new CellRangeAddressList();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        CFHeaderRecord cFHeaderRecord = new CFHeaderRecord();
        cFHeaderRecord.field_1_numcf = this.field_1_numcf;
        cFHeaderRecord.field_2_need_recalculation = this.field_2_need_recalculation;
        cFHeaderRecord.field_3_enclosing_cell_range = this.field_3_enclosing_cell_range;
        cFHeaderRecord.field_4_cell_ranges = this.field_4_cell_ranges.copy();
        return cFHeaderRecord;
    }

    public HSSFCellRangeAddress[] getCellRanges() {
        return this.field_4_cell_ranges.getCellRangeAddresses();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this.field_4_cell_ranges.getSize() + 12;
    }

    public HSSFCellRangeAddress getEnclosingCellRange() {
        return this.field_3_enclosing_cell_range;
    }

    public boolean getNeedRecalculation() {
        if (this.field_2_need_recalculation == 1) {
            return true;
        }
        return false;
    }

    public int getNumberOfConditionalFormats() {
        return this.field_1_numcf;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_numcf);
        littleEndianOutput.writeShort(this.field_2_need_recalculation);
        this.field_3_enclosing_cell_range.serialize(littleEndianOutput);
        this.field_4_cell_ranges.serialize(littleEndianOutput);
    }

    public void setCellRanges(HSSFCellRangeAddress[] hSSFCellRangeAddressArr) {
        if (hSSFCellRangeAddressArr != null) {
            CellRangeAddressList cellRangeAddressList = new CellRangeAddressList();
            HSSFCellRangeAddress hSSFCellRangeAddress = null;
            for (HSSFCellRangeAddress hSSFCellRangeAddress2 : hSSFCellRangeAddressArr) {
                hSSFCellRangeAddress = CellRangeUtil.createEnclosingCellRange(hSSFCellRangeAddress2, hSSFCellRangeAddress);
                cellRangeAddressList.addCellRangeAddress(hSSFCellRangeAddress2);
            }
            this.field_3_enclosing_cell_range = hSSFCellRangeAddress;
            this.field_4_cell_ranges = cellRangeAddressList;
            return;
        }
        throw new IllegalArgumentException("cellRanges must not be null");
    }

    public void setEnclosingCellRange(HSSFCellRangeAddress hSSFCellRangeAddress) {
        this.field_3_enclosing_cell_range = hSSFCellRangeAddress;
    }

    public void setNeedRecalculation(boolean z10) {
        this.field_2_need_recalculation = z10 ? 1 : 0;
    }

    public void setNumberOfConditionalFormats(int i10) {
        this.field_1_numcf = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("[CFHEADER]\n\t.id\t\t= ");
        stringBuffer.append(Integer.toHexString(432));
        stringBuffer.append("\n\t.numCF\t\t\t= ");
        stringBuffer.append(getNumberOfConditionalFormats());
        stringBuffer.append("\n\t.needRecalc\t   = ");
        stringBuffer.append(getNeedRecalculation());
        stringBuffer.append("\n\t.enclosingCellRange= ");
        stringBuffer.append(getEnclosingCellRange());
        stringBuffer.append("\n\t.cfranges=[");
        for (int i10 = 0; i10 < this.field_4_cell_ranges.countRanges(); i10++) {
            if (i10 == 0) {
                str = "";
            } else {
                str = ",";
            }
            stringBuffer.append(str);
            stringBuffer.append(this.field_4_cell_ranges.getCellRangeAddress(i10).toString());
        }
        stringBuffer.append("]\n[/CFHEADER]\n");
        return stringBuffer.toString();
    }

    public CFHeaderRecord(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, int i10) {
        setCellRanges(CellRangeUtil.mergeCellRanges(hSSFCellRangeAddressArr));
        this.field_1_numcf = i10;
    }

    public CFHeaderRecord(RecordInputStream recordInputStream) {
        this.field_1_numcf = recordInputStream.readShort();
        this.field_2_need_recalculation = recordInputStream.readShort();
        this.field_3_enclosing_cell_range = new HSSFCellRangeAddress(recordInputStream);
        this.field_4_cell_ranges = new CellRangeAddressList(recordInputStream);
    }
}

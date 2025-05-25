package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.ss.util.CellRangeAddressList;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class MergeCellsRecord extends StandardRecord {
    public static final short sid = 229;
    private final int _numberOfRegions;
    private HSSFCellRangeAddress[] _regions;
    private final int _startIndex;

    public MergeCellsRecord(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, int i10, int i11) {
        this._regions = hSSFCellRangeAddressArr;
        this._startIndex = i10;
        this._numberOfRegions = i11;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        int i10 = this._numberOfRegions;
        HSSFCellRangeAddress[] hSSFCellRangeAddressArr = new HSSFCellRangeAddress[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            hSSFCellRangeAddressArr[i11] = this._regions[this._startIndex + i11].copy();
        }
        return new MergeCellsRecord(hSSFCellRangeAddressArr, 0, i10);
    }

    public HSSFCellRangeAddress getAreaAt(int i10) {
        return this._regions[this._startIndex + i10];
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return CellRangeAddressList.getEncodedSize(this._numberOfRegions);
    }

    public short getNumAreas() {
        return (short) this._numberOfRegions;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._numberOfRegions);
        for (int i10 = 0; i10 < this._numberOfRegions; i10++) {
            this._regions[this._startIndex + i10].serialize(littleEndianOutput);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[MERGEDCELLS]\n     .numregions =");
        stringBuffer.append((int) getNumAreas());
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < this._numberOfRegions; i10++) {
            HSSFCellRangeAddress hSSFCellRangeAddress = this._regions[this._startIndex + i10];
            stringBuffer.append("     .rowfrom =");
            stringBuffer.append(hSSFCellRangeAddress.getFirstRow());
            stringBuffer.append("\n     .rowto   =");
            stringBuffer.append(hSSFCellRangeAddress.getLastRow());
            stringBuffer.append("\n     .colfrom =");
            stringBuffer.append(hSSFCellRangeAddress.getFirstColumn());
            stringBuffer.append("\n     .colto   =");
            stringBuffer.append(hSSFCellRangeAddress.getLastColumn());
            stringBuffer.append("\n");
        }
        stringBuffer.append("[MERGEDCELLS]\n");
        return stringBuffer.toString();
    }

    public MergeCellsRecord(RecordInputStream recordInputStream) {
        int readUShort = recordInputStream.readUShort();
        HSSFCellRangeAddress[] hSSFCellRangeAddressArr = new HSSFCellRangeAddress[readUShort];
        for (int i10 = 0; i10 < readUShort; i10++) {
            hSSFCellRangeAddressArr[i10] = new HSSFCellRangeAddress(recordInputStream);
        }
        this._numberOfRegions = readUShort;
        this._startIndex = 0;
        this._regions = hSSFCellRangeAddressArr;
    }
}

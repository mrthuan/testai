package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class CellRecord extends StandardRecord implements CellValueRecordInterface {
    private int _columnIndex;
    private int _formatIndex;
    private int _rowIndex;

    public CellRecord() {
    }

    public abstract void appendValueText(StringBuilder sb2);

    public final void copyBaseFields(CellRecord cellRecord) {
        cellRecord._rowIndex = this._rowIndex;
        cellRecord._columnIndex = this._columnIndex;
        cellRecord._formatIndex = this._formatIndex;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public final short getColumn() {
        return (short) this._columnIndex;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public final int getDataSize() {
        return getValueDataSize() + 6;
    }

    public abstract String getRecordName();

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public final int getRow() {
        return this._rowIndex;
    }

    public abstract int getValueDataSize();

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public final short getXFIndex() {
        return (short) this._formatIndex;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public final void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getRow());
        littleEndianOutput.writeShort(getColumn());
        littleEndianOutput.writeShort(getXFIndex());
        serializeValue(littleEndianOutput);
    }

    public abstract void serializeValue(LittleEndianOutput littleEndianOutput);

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public final void setColumn(short s4) {
        this._columnIndex = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public final void setRow(int i10) {
        this._rowIndex = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public final void setXFIndex(short s4) {
        this._formatIndex = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String recordName = getRecordName();
        sb2.append("[");
        sb2.append(recordName);
        sb2.append("]\n    .row    = ");
        sb2.append(HexDump.shortToHex(getRow()));
        sb2.append("\n    .col    = ");
        sb2.append(HexDump.shortToHex(getColumn()));
        sb2.append("\n    .xfindex= ");
        sb2.append(HexDump.shortToHex(getXFIndex()));
        sb2.append("\n");
        appendValueText(sb2);
        sb2.append("\n");
        sb2.append("[/");
        sb2.append(recordName);
        sb2.append("]\n");
        return sb2.toString();
    }

    public CellRecord(RecordInputStream recordInputStream) {
        this._rowIndex = recordInputStream.readUShort();
        this._columnIndex = recordInputStream.readUShort();
        this._formatIndex = recordInputStream.readUShort();
    }
}

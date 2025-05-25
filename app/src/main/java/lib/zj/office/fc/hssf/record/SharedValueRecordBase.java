package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.util.CellRangeAddress8Bit;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class SharedValueRecordBase extends StandardRecord {
    private CellRangeAddress8Bit _range;

    public SharedValueRecordBase(CellRangeAddress8Bit cellRangeAddress8Bit) {
        if (cellRangeAddress8Bit != null) {
            this._range = cellRangeAddress8Bit;
            return;
        }
        throw new IllegalArgumentException("range must be supplied.");
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return getExtraDataSize() + 6;
    }

    public abstract int getExtraDataSize();

    public final int getFirstColumn() {
        return (short) this._range.getFirstColumn();
    }

    public final int getFirstRow() {
        return this._range.getFirstRow();
    }

    public final int getLastColumn() {
        return (short) this._range.getLastColumn();
    }

    public final int getLastRow() {
        return this._range.getLastRow();
    }

    public final CellRangeAddress8Bit getRange() {
        return this._range;
    }

    public final boolean isFirstCell(int i10, int i11) {
        CellRangeAddress8Bit range = getRange();
        if (range.getFirstRow() == i10 && range.getFirstColumn() == i11) {
            return true;
        }
        return false;
    }

    public final boolean isInRange(int i10, int i11) {
        CellRangeAddress8Bit cellRangeAddress8Bit = this._range;
        if (cellRangeAddress8Bit.getFirstRow() <= i10 && cellRangeAddress8Bit.getLastRow() >= i10 && cellRangeAddress8Bit.getFirstColumn() <= i11 && cellRangeAddress8Bit.getLastColumn() >= i11) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        this._range.serialize(littleEndianOutput);
        serializeExtraData(littleEndianOutput);
    }

    public abstract void serializeExtraData(LittleEndianOutput littleEndianOutput);

    public SharedValueRecordBase() {
        this(new CellRangeAddress8Bit(0, 0, 0, 0));
    }

    public SharedValueRecordBase(LittleEndianInput littleEndianInput) {
        this._range = new CellRangeAddress8Bit(littleEndianInput);
    }
}

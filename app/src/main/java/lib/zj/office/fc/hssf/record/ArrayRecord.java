package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.util.CellRangeAddress8Bit;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ArrayRecord extends SharedValueRecordBase {
    private static final int OPT_ALWAYS_RECALCULATE = 1;
    private static final int OPT_CALCULATE_ON_OPEN = 2;
    public static final short sid = 545;
    private int _field3notUsed;
    private Formula _formula;
    private int _options;

    public ArrayRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
        this._options = recordInputStream.readUShort();
        this._field3notUsed = recordInputStream.readInt();
        this._formula = Formula.read(recordInputStream.readUShort(), recordInputStream, recordInputStream.available());
    }

    @Override // lib.zj.office.fc.hssf.record.SharedValueRecordBase
    public int getExtraDataSize() {
        return this._formula.getEncodedSize() + 6;
    }

    public Ptg[] getFormulaTokens() {
        return this._formula.getTokens();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isAlwaysRecalculate() {
        if ((this._options & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isCalculateOnOpen() {
        if ((this._options & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.SharedValueRecordBase
    public void serializeExtraData(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._options);
        littleEndianOutput.writeInt(this._field3notUsed);
        this._formula.serialize(littleEndianOutput);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        Ptg[] tokens;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(ArrayRecord.class.getName());
        stringBuffer.append(" [ARRAY]\n range=");
        stringBuffer.append(getRange().toString());
        stringBuffer.append("\n options=");
        r.j(this._options, stringBuffer, "\n notUsed=");
        stringBuffer.append(HexDump.intToHex(this._field3notUsed));
        stringBuffer.append("\n formula:\n");
        for (Ptg ptg : this._formula.getTokens()) {
            stringBuffer.append(ptg.toString());
            stringBuffer.append(ptg.getRVAType());
            stringBuffer.append("\n");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public ArrayRecord(Formula formula, CellRangeAddress8Bit cellRangeAddress8Bit) {
        super(cellRangeAddress8Bit);
        this._options = 0;
        this._field3notUsed = 0;
        this._formula = formula;
    }
}

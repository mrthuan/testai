package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.SharedFormula;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.util.CellRangeAddress8Bit;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SharedFormulaRecord extends SharedValueRecordBase {
    public static final short sid = 1212;
    private int field_5_reserved;
    private Formula field_7_parsed_expr;

    public SharedFormulaRecord() {
        this(new CellRangeAddress8Bit(0, 0, 0, 0));
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SharedFormulaRecord sharedFormulaRecord = new SharedFormulaRecord(getRange());
        sharedFormulaRecord.field_5_reserved = this.field_5_reserved;
        sharedFormulaRecord.field_7_parsed_expr = this.field_7_parsed_expr.copy();
        return sharedFormulaRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.SharedValueRecordBase
    public int getExtraDataSize() {
        return this.field_7_parsed_expr.getEncodedSize() + 2;
    }

    public Ptg[] getFormulaTokens(FormulaRecord formulaRecord) {
        int row = formulaRecord.getRow();
        short column = formulaRecord.getColumn();
        if (isInRange(row, column)) {
            return new SharedFormula(SpreadsheetVersion.EXCEL97).convertSharedFormulas(this.field_7_parsed_expr.getTokens(), row, column);
        }
        throw new RuntimeException("Shared Formula Conversion: Coding Error");
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isFormulaSame(SharedFormulaRecord sharedFormulaRecord) {
        return this.field_7_parsed_expr.isSame(sharedFormulaRecord.field_7_parsed_expr);
    }

    @Override // lib.zj.office.fc.hssf.record.SharedValueRecordBase
    public void serializeExtraData(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_5_reserved);
        this.field_7_parsed_expr.serialize(littleEndianOutput);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SHARED FORMULA (");
        stringBuffer.append(HexDump.intToHex(1212));
        stringBuffer.append("]\n    .range      = ");
        stringBuffer.append(getRange().toString());
        stringBuffer.append("\n    .reserved    = ");
        r.j(this.field_5_reserved, stringBuffer, "\n");
        Ptg[] tokens = this.field_7_parsed_expr.getTokens();
        for (int i10 = 0; i10 < tokens.length; i10++) {
            stringBuffer.append("Formula[");
            stringBuffer.append(i10);
            stringBuffer.append("]");
            Ptg ptg = tokens[i10];
            stringBuffer.append(ptg.toString());
            stringBuffer.append(ptg.getRVAType());
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/SHARED FORMULA]\n");
        return stringBuffer.toString();
    }

    private SharedFormulaRecord(CellRangeAddress8Bit cellRangeAddress8Bit) {
        super(cellRangeAddress8Bit);
        this.field_7_parsed_expr = Formula.create(Ptg.EMPTY_PTG_ARRAY);
    }

    public SharedFormulaRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
        this.field_5_reserved = recordInputStream.readShort();
        this.field_7_parsed_expr = Formula.read(recordInputStream.readShort(), recordInputStream, recordInputStream.available());
    }
}

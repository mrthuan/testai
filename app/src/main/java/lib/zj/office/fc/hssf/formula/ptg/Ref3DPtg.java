package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hssf.formula.ExternSheetReferenceToken;
import lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook;
import lib.zj.office.fc.hssf.formula.WorkbookDependentFormula;
import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class Ref3DPtg extends RefPtgBase implements WorkbookDependentFormula, ExternSheetReferenceToken {
    private static final int SIZE = 7;
    public static final byte sid = 58;
    private int field_1_index_extern_sheet;

    public Ref3DPtg(LittleEndianInput littleEndianInput) {
        this.field_1_index_extern_sheet = littleEndianInput.readShort();
        readCoordinates(littleEndianInput);
    }

    @Override // lib.zj.office.fc.hssf.formula.ExternSheetReferenceToken
    public String format2DRefAsString() {
        return formatReferenceAsString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ExternSheetReferenceToken
    public int getExternSheetIndex() {
        return this.field_1_index_extern_sheet;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 7;
    }

    public void setExternSheetIndex(int i10) {
        this.field_1_index_extern_sheet = i10;
    }

    @Override // lib.zj.office.fc.hssf.formula.WorkbookDependentFormula
    public String toFormulaString(FormulaRenderingWorkbook formulaRenderingWorkbook) {
        return ExternSheetNameResolver.prependSheetName(formulaRenderingWorkbook, this.field_1_index_extern_sheet, formatReferenceAsString());
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Ref3DPtg.class.getName());
        stringBuffer.append(" [sheetIx=");
        stringBuffer.append(getExternSheetIndex());
        stringBuffer.append(" ! ");
        stringBuffer.append(formatReferenceAsString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 58);
        littleEndianOutput.writeShort(getExternSheetIndex());
        writeCoordinates(littleEndianOutput);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }

    public Ref3DPtg(String str, int i10) {
        this(new CellReference(str), i10);
    }

    public Ref3DPtg(CellReference cellReference, int i10) {
        super(cellReference);
        setExternSheetIndex(i10);
    }
}

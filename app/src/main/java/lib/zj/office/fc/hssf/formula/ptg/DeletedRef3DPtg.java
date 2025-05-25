package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook;
import lib.zj.office.fc.hssf.formula.WorkbookDependentFormula;
import lib.zj.office.fc.ss.usermodel.ErrorConstants;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DeletedRef3DPtg extends OperandPtg implements WorkbookDependentFormula {
    public static final byte sid = 60;
    private final int field_1_index_extern_sheet;
    private final int unused1;

    public DeletedRef3DPtg(LittleEndianInput littleEndianInput) {
        this.field_1_index_extern_sheet = littleEndianInput.readUShort();
        this.unused1 = littleEndianInput.readInt();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 0;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 7;
    }

    @Override // lib.zj.office.fc.hssf.formula.WorkbookDependentFormula
    public String toFormulaString(FormulaRenderingWorkbook formulaRenderingWorkbook) {
        return ExternSheetNameResolver.prependSheetName(formulaRenderingWorkbook, this.field_1_index_extern_sheet, ErrorConstants.getText(23));
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 60);
        littleEndianOutput.writeShort(this.field_1_index_extern_sheet);
        littleEndianOutput.writeInt(this.unused1);
    }

    public DeletedRef3DPtg(int i10) {
        this.field_1_index_extern_sheet = i10;
        this.unused1 = 0;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }
}

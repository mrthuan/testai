package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook;
import lib.zj.office.fc.hssf.formula.WorkbookDependentFormula;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class NamePtg extends OperandPtg implements WorkbookDependentFormula {
    private static final int SIZE = 5;
    public static final short sid = 35;
    private int field_1_label_index;
    private short field_2_zero;

    public NamePtg(int i10) {
        this.field_1_label_index = i10 + 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 0;
    }

    public int getIndex() {
        return this.field_1_label_index - 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 5;
    }

    @Override // lib.zj.office.fc.hssf.formula.WorkbookDependentFormula
    public String toFormulaString(FormulaRenderingWorkbook formulaRenderingWorkbook) {
        return formulaRenderingWorkbook.getNameText(this);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + Field.QUOTE);
        littleEndianOutput.writeShort(this.field_1_label_index);
        littleEndianOutput.writeShort(this.field_2_zero);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }

    public NamePtg(LittleEndianInput littleEndianInput) {
        this.field_1_label_index = littleEndianInput.readShort();
        this.field_2_zero = littleEndianInput.readShort();
    }
}

package lib.zj.office.fc.hssf.formula.ptg;

import a6.h;
import lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook;
import lib.zj.office.fc.hssf.formula.WorkbookDependentFormula;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class NameXPtg extends OperandPtg implements WorkbookDependentFormula {
    private static final int SIZE = 7;
    public static final short sid = 57;
    private final int _nameNumber;
    private final int _reserved;
    private final int _sheetRefIndex;

    private NameXPtg(int i10, int i11, int i12) {
        this._sheetRefIndex = i10;
        this._nameNumber = i11;
        this._reserved = i12;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 32;
    }

    public int getNameIndex() {
        return this._nameNumber - 1;
    }

    public int getSheetRefIndex() {
        return this._sheetRefIndex;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 7;
    }

    @Override // lib.zj.office.fc.hssf.formula.WorkbookDependentFormula
    public String toFormulaString(FormulaRenderingWorkbook formulaRenderingWorkbook) {
        return formulaRenderingWorkbook.resolveNameXText(this);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NameXPtg:[sheetRefIndex:");
        sb2.append(this._sheetRefIndex);
        sb2.append(" , nameNumber:");
        return h.g(sb2, this._nameNumber, "]");
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + Field.SYMBOL);
        littleEndianOutput.writeShort(this._sheetRefIndex);
        littleEndianOutput.writeShort(this._nameNumber);
        littleEndianOutput.writeShort(this._reserved);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }

    public NameXPtg(int i10, int i11) {
        this(i10, i11 + 1, 0);
    }

    public NameXPtg(LittleEndianInput littleEndianInput) {
        this(littleEndianInput.readUShort(), littleEndianInput.readUShort(), littleEndianInput.readUShort());
    }
}

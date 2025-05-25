package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hssf.formula.ExternSheetReferenceToken;
import lib.zj.office.fc.hssf.formula.FormulaRenderingWorkbook;
import lib.zj.office.fc.hssf.formula.WorkbookDependentFormula;
import lib.zj.office.fc.ss.util.AreaReference;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class Area3DPtg extends AreaPtgBase implements WorkbookDependentFormula, ExternSheetReferenceToken {
    private static final int SIZE = 11;
    public static final byte sid = 59;
    private int field_1_index_extern_sheet;

    public Area3DPtg(String str, int i10) {
        super(new AreaReference(str));
        setExternSheetIndex(i10);
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
        return 11;
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
        stringBuffer.append(Area3DPtg.class.getName());
        stringBuffer.append(" [sheetIx=");
        stringBuffer.append(getExternSheetIndex());
        stringBuffer.append(" ! ");
        stringBuffer.append(formatReferenceAsString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 59);
        littleEndianOutput.writeShort(this.field_1_index_extern_sheet);
        writeCoordinates(littleEndianOutput);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.AreaPtgBase, lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        throw new RuntimeException("3D references need a workbook to determine formula text");
    }

    public Area3DPtg(LittleEndianInput littleEndianInput) {
        this.field_1_index_extern_sheet = littleEndianInput.readShort();
        readCoordinates(littleEndianInput);
    }

    public Area3DPtg(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14) {
        super(i10, i11, i12, i13, z10, z11, z12, z13);
        setExternSheetIndex(i14);
    }

    public Area3DPtg(AreaReference areaReference, int i10) {
        super(areaReference);
        setExternSheetIndex(i10);
    }
}

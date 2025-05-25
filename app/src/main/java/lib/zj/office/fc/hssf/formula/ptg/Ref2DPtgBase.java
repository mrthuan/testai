package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
abstract class Ref2DPtgBase extends RefPtgBase {
    private static final int SIZE = 5;

    public Ref2DPtgBase(int i10, int i11, boolean z10, boolean z11) {
        setRow(i10);
        setColumn(i11);
        setRowRelative(z10);
        setColRelative(z11);
    }

    public abstract byte getSid();

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final int getSize() {
        return 5;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final String toFormulaString() {
        return formatReferenceAsString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [");
        stringBuffer.append(formatReferenceAsString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + getSid());
        writeCoordinates(littleEndianOutput);
    }

    public Ref2DPtgBase(LittleEndianInput littleEndianInput) {
        readCoordinates(littleEndianInput);
    }

    public Ref2DPtgBase(CellReference cellReference) {
        super(cellReference);
    }
}

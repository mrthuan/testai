package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.ss.util.AreaReference;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class Area2DPtgBase extends AreaPtgBase {
    private static final int SIZE = 9;

    public Area2DPtgBase(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(i10, i11, i12, i13, z10, z11, z12, z13);
    }

    public abstract byte getSid();

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final int getSize() {
        return 9;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.AreaPtgBase, lib.zj.office.fc.hssf.formula.ptg.Ptg
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
    public final void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + getSid());
        writeCoordinates(littleEndianOutput);
    }

    public Area2DPtgBase(AreaReference areaReference) {
        super(areaReference);
    }

    public Area2DPtgBase(LittleEndianInput littleEndianInput) {
        readCoordinates(littleEndianInput);
    }
}

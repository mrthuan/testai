package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RefPtg extends Ref2DPtgBase {
    public static final byte sid = 36;

    public RefPtg(String str) {
        super(new CellReference(str));
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ref2DPtgBase
    public byte getSid() {
        return (byte) 36;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ref2DPtgBase, lib.zj.office.fc.hssf.formula.ptg.Ptg
    public /* bridge */ /* synthetic */ void write(LittleEndianOutput littleEndianOutput) {
        super.write(littleEndianOutput);
    }

    public RefPtg(int i10, int i11, boolean z10, boolean z11) {
        super(i10, i11, z10, z11);
    }

    public RefPtg(LittleEndianInput littleEndianInput) {
        super(littleEndianInput);
    }

    public RefPtg(CellReference cellReference) {
        super(cellReference);
    }
}

package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RefNPtg extends Ref2DPtgBase {
    public static final byte sid = 44;

    public RefNPtg(LittleEndianInput littleEndianInput) {
        super(littleEndianInput);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ref2DPtgBase
    public byte getSid() {
        return (byte) 44;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ref2DPtgBase, lib.zj.office.fc.hssf.formula.ptg.Ptg
    public /* bridge */ /* synthetic */ void write(LittleEndianOutput littleEndianOutput) {
        super.write(littleEndianOutput);
    }
}

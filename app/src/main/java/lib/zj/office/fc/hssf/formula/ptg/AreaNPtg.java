package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.util.LittleEndianInput;

/* loaded from: classes3.dex */
public final class AreaNPtg extends Area2DPtgBase {
    public static final short sid = 45;

    public AreaNPtg(LittleEndianInput littleEndianInput) {
        super(littleEndianInput);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Area2DPtgBase
    public byte getSid() {
        return Field.DDE;
    }
}

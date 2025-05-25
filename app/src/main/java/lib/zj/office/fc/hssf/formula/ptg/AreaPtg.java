package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.util.AreaReference;
import lib.zj.office.fc.util.LittleEndianInput;

/* loaded from: classes3.dex */
public final class AreaPtg extends Area2DPtgBase {
    public static final short sid = 37;

    public AreaPtg(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(i10, i11, i12, i13, z10, z11, z12, z13);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Area2DPtgBase
    public byte getSid() {
        return Field.PAGEREF;
    }

    public AreaPtg(LittleEndianInput littleEndianInput) {
        super(littleEndianInput);
    }

    public AreaPtg(String str) {
        super(new AreaReference(str));
    }

    public AreaPtg(AreaReference areaReference) {
        super(areaReference);
    }
}

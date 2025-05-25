package lib.zj.office.fc.hssf.util;

/* loaded from: classes3.dex */
public final class CellReference extends lib.zj.office.fc.ss.util.CellReference {
    public CellReference(String str) {
        super(str);
    }

    public CellReference(int i10, int i11) {
        super(i10, i11, true, true);
    }

    public CellReference(int i10, int i11, boolean z10, boolean z11) {
        super(null, i10, i11, z10, z11);
    }

    public CellReference(String str, int i10, int i11, boolean z10, boolean z11) {
        super(str, i10, i11, z10, z11);
    }
}

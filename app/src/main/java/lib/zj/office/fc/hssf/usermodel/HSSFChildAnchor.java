package lib.zj.office.fc.hssf.usermodel;

/* loaded from: classes3.dex */
public final class HSSFChildAnchor extends HSSFAnchor {
    public HSSFChildAnchor() {
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HSSFAnchor
    public boolean isHorizontallyFlipped() {
        if (this.dx1 > this.dx2) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HSSFAnchor
    public boolean isVerticallyFlipped() {
        if (this.dy1 > this.dy2) {
            return true;
        }
        return false;
    }

    public void setAnchor(int i10, int i11, int i12, int i13) {
        this.dx1 = i10;
        this.dy1 = i11;
        this.dx2 = i12;
        this.dy2 = i13;
    }

    public HSSFChildAnchor(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
    }
}

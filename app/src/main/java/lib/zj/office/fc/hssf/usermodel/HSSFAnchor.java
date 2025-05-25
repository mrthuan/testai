package lib.zj.office.fc.hssf.usermodel;

/* loaded from: classes3.dex */
public abstract class HSSFAnchor {
    int dx1;
    int dx2;
    int dy1;
    int dy2;

    public HSSFAnchor() {
    }

    public int getDx1() {
        return this.dx1;
    }

    public int getDx2() {
        return this.dx2;
    }

    public int getDy1() {
        return this.dy1;
    }

    public int getDy2() {
        return this.dy2;
    }

    public abstract boolean isHorizontallyFlipped();

    public abstract boolean isVerticallyFlipped();

    public void setDx1(int i10) {
        this.dx1 = i10;
    }

    public void setDx2(int i10) {
        this.dx2 = i10;
    }

    public void setDy1(int i10) {
        this.dy1 = i10;
    }

    public void setDy2(int i10) {
        this.dy2 = i10;
    }

    public HSSFAnchor(int i10, int i11, int i12, int i13) {
        this.dx1 = i10;
        this.dy1 = i11;
        this.dx2 = i12;
        this.dy2 = i13;
    }
}

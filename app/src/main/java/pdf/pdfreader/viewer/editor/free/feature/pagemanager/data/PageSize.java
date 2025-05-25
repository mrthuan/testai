// Auto-fixed: added missing class declaration
public class PageSize {
package pdf.pdfreader.viewer.editor.free.feature.pagemanager.data;

import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: PageSize.kt */
/* loaded from: classes3.dex */
public enum PageSize {
    Custom(0, 0),
    A3(297, 420),
    A4(210, 297),
    A5(148, 210),
    B4(250, 353),
    B5(ShapeTypes.MATH_PLUS, 250),
    Letter(216, 279),
    Legal(216, 356),
    FollowPrevious(0, 0);
    

    /* renamed from: h  reason: collision with root package name */
    private int f25250h;

    /* renamed from: w  reason: collision with root package name */
    private int f25251w;

    PageSize(int i10, int i11) {
        this.f25251w = i10;
        this.f25250h = i11;
    }

    public final int getH() {
        return this.f25250h;
    }

    public final int getW() {
        return this.f25251w;
    }

    public final void setH(int i10) {
        this.f25250h = i10;
    }

    public final void setW(int i10) {
        this.f25251w = i10;
    }
}

}

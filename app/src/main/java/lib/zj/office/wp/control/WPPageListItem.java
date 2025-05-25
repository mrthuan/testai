package lib.zj.office.wp.control;

import android.graphics.Canvas;
import gj.j;
import gj.k;
import lib.zj.office.system.beans.pagelist.APageListItem;
import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.system.f;
import rg.c;

/* loaded from: classes3.dex */
public class WPPageListItem extends APageListItem {

    /* renamed from: h  reason: collision with root package name */
    public boolean f21091h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21092i;

    /* renamed from: j  reason: collision with root package name */
    public final j f21093j;

    public WPPageListItem(APageListView aPageListView, f fVar, int i10, int i11) {
        super(aPageListView, i10, i11);
        this.f21091h = false;
        this.f21092i = true;
        this.f21001f = fVar;
        this.f21093j = (j) aPageListView.getModel();
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void b() {
        postInvalidate();
        APageListView aPageListView = this.f20999d;
        if (aPageListView != null) {
            aPageListView.b(this);
        }
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void g(int i10, int i11, int i12) {
        super.g(i10, i11, i12);
        APageListView aPageListView = this.f20999d;
        if (((int) (aPageListView.getZoom() * 100.0f)) == 100 || (this.f21092i && i10 == 0)) {
            aPageListView.b(this);
        }
        this.f21092i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j jVar = this.f21093j;
        if (jVar == null) {
            return;
        }
        k I = jVar.I(this.f20997a);
        if (I != null || this.f21091h != c.c) {
            float zoom = this.f20999d.getZoom();
            if (c.c) {
                canvas.drawColor(-16777216);
            } else {
                canvas.drawColor(-1);
            }
            canvas.save();
            canvas.translate((-I.f480b) * zoom, (-I.c) * zoom);
            I.K(canvas, 0, 0, zoom);
            canvas.restore();
            this.f21091h = c.c;
        }
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void c() {
    }

    @Override // lib.zj.office.system.beans.pagelist.APageListItem
    public final void f() {
    }
}

package lib.zj.office.system.beans.pagelist;

import android.view.View;
import android.view.ViewGroup;
import lib.zj.office.system.beans.CalloutView.CalloutView;
import lib.zj.office.system.f;
import qi.c;

/* loaded from: classes3.dex */
public class APageListItem extends ViewGroup implements c {

    /* renamed from: a  reason: collision with root package name */
    public int f20997a;

    /* renamed from: b  reason: collision with root package name */
    public int f20998b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public final APageListView f20999d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21000e;

    /* renamed from: f  reason: collision with root package name */
    public f f21001f;

    /* renamed from: g  reason: collision with root package name */
    public CalloutView f21002g;

    public APageListItem(APageListView aPageListView, int i10, int i11) {
        super(aPageListView.getContext());
        this.f21000e = true;
        this.f20999d = aPageListView;
        this.f20998b = i10;
        this.c = i11;
        setBackgroundColor(-1);
    }

    @Override // qi.c
    public final void a() {
        APageListView aPageListView = this.f20999d;
        aPageListView.l(aPageListView.getCurrentPageView());
    }

    public final void d() {
        if (this.f21002g == null) {
            CalloutView calloutView = new CalloutView(this.f20999d.getContext(), this.f21001f, this);
            this.f21002g = calloutView;
            calloutView.setIndex(this.f20997a);
            addView(this.f21002g, 0);
        }
    }

    public void e() {
        this.f20997a = 0;
        if (this.f20998b == 0 || this.c == 0) {
            APageListView aPageListView = this.f20999d;
            this.f20998b = aPageListView.getWidth();
            this.c = aPageListView.getHeight();
        }
    }

    public void g(int i10, int i11, int i12) {
        boolean z10;
        this.f20997a = i10;
        this.f20998b = i11;
        this.c = i12;
        CalloutView calloutView = this.f21002g;
        if (calloutView == null) {
            if (this.f21001f.o().b().f29351e.get(Integer.valueOf(i10)) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                d();
                return;
            }
            return;
        }
        calloutView.setIndex(i10);
    }

    public f getControl() {
        return this.f21001f;
    }

    public int getPageHeight() {
        return this.c;
    }

    public int getPageIndex() {
        return this.f20997a;
    }

    public int getPageWidth() {
        return this.f20998b;
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        CalloutView calloutView = this.f21002g;
        if (calloutView != null) {
            calloutView.setZoom(this.f20999d.getZoom());
            this.f21002g.layout(0, 0, i12 - i10, i13 - i11);
            this.f21002g.bringToFront();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size;
        int size2;
        if (View.MeasureSpec.getMode(i10) == 0) {
            size = this.f20998b;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            size2 = this.c;
        } else {
            size2 = View.MeasureSpec.getSize(i11);
        }
        setMeasuredDimension(size, size2);
    }

    public void b() {
    }

    public void c() {
    }

    public void f() {
    }

    public void setLinkHighlighting(boolean z10) {
    }
}

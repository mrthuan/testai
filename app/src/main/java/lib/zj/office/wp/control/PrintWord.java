package lib.zj.office.wp.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import gj.j;
import gj.k;
import ih.a;
import lib.zj.office.system.beans.pagelist.APageListItem;
import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.system.f;
import lib.zj.office.system.r;
import ri.c;
import zh.b;
import zh.h;

/* loaded from: classes3.dex */
public class PrintWord extends FrameLayout implements c {

    /* renamed from: a  reason: collision with root package name */
    public int f21085a;

    /* renamed from: b  reason: collision with root package name */
    public int f21086b;
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public final APageListView f21087d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f21088e;

    /* renamed from: f  reason: collision with root package name */
    public final j f21089f;

    /* renamed from: g  reason: collision with root package name */
    public final Rect f21090g;

    public PrintWord(Context context) {
        super(context);
        this.f21085a = -1;
        this.f21086b = -1;
        this.f21090g = new Rect();
    }

    @Override // ri.c
    public final APageListItem b(int i10) {
        Rect g10 = g(i10);
        return new WPPageListItem(this.f21087d, this.c, g10.width(), g10.height());
    }

    @Override // ri.c
    public final boolean d(View view, MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11, byte b10) {
        APageListView aPageListView;
        APageListItem currentPageView;
        k I;
        h f12;
        a b11;
        f fVar = this.c;
        if (b10 == 3 && motionEvent != null && motionEvent.getAction() == 1 && (currentPageView = (aPageListView = this.f21087d).getCurrentPageView()) != null && (I = this.f21089f.I(currentPageView.getPageIndex())) != null) {
            float zoom = aPageListView.getZoom();
            long C = I.C(((int) ((motionEvent.getX() - currentPageView.getLeft()) / zoom)) + I.f480b, ((int) ((motionEvent.getY() - currentPageView.getTop()) / zoom)) + I.c, false);
            if (C >= 0 && (f12 = I.getDocument().f(C)) != null) {
                b bVar = b.f32374b;
                zh.f d10 = f12.d();
                bVar.getClass();
                int j10 = b.j(d10);
                if (j10 >= 0 && (b11 = fVar.o().d().b(j10)) != null) {
                    fVar.r(536870920, b11);
                }
            }
        }
        fVar.s().c1(b10);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        f fVar = this.c;
        boolean P = fVar.s().P();
        APageListView aPageListView = this.f21087d;
        if (P) {
            String valueOf = String.valueOf(aPageListView.getCurrentPageNumber() + " / " + this.f21089f.H());
            Paint paint = this.f21088e;
            int measureText = (int) paint.measureText(valueOf);
            int descent = (int) (paint.descent() - paint.ascent());
            int width = (getWidth() - measureText) / 2;
            int height = (getHeight() - descent) - 20;
            ShapeDrawable f10 = r.f();
            f10.setBounds(width - 10, height - 10, measureText + width + 10, descent + height + 10);
            f10.draw(canvas);
            canvas.drawText(valueOf, width, (int) (height - paint.ascent()), paint);
        }
        if (this.f21085a != aPageListView.getCurrentPageNumber() || this.f21086b != getPageCount()) {
            fVar.s().S();
            this.f21085a = aPageListView.getCurrentPageNumber();
            this.f21086b = getPageCount();
        }
    }

    @Override // ri.c
    public final void e(APageListItem aPageListItem) {
        if (getParent() instanceof Word) {
            Word word = (Word) getParent();
            word.getFind().getClass();
            if (aPageListItem.getPageIndex() != 0) {
                xh.b bVar = (xh.b) word.getHighlight();
                bVar.f31655b = -1;
                bVar.f31654a.clear();
            }
        }
    }

    @Override // ri.c
    public final void f() {
        this.c.r(20, null);
    }

    @Override // ri.c
    public final Rect g(int i10) {
        j jVar = this.f21089f;
        k I = jVar.I(i10);
        Rect rect = this.f21090g;
        if (I != null) {
            rect.set(0, 0, I.f481d, I.f482e);
        } else {
            zh.f d10 = jVar.getDocument().i().d();
            b.f32374b.getClass();
            rect.set(0, 0, (int) (b.p(d10) * 0.06666667f), (int) (b.k(d10) * 0.06666667f));
        }
        return rect;
    }

    public f getControl() {
        return this.c;
    }

    public int getCurrentPageNumber() {
        return this.f21087d.getCurrentPageNumber();
    }

    public k getCurrentPageView() {
        APageListItem currentPageView = this.f21087d.getCurrentPageView();
        if (currentPageView != null) {
            return this.f21089f.I(currentPageView.getPageIndex());
        }
        return null;
    }

    public int getFitSizeState() {
        return this.f21087d.getFitSizeState();
    }

    public float getFitZoom() {
        return this.f21087d.getFitZoom();
    }

    public APageListView getListView() {
        return this.f21087d;
    }

    @Override // ri.c
    public Object getModel() {
        return this.f21089f;
    }

    @Override // ri.c
    public int getPageCount() {
        return Math.max(this.f21089f.H(), 1);
    }

    @Override // ri.c
    public byte getPageListViewMovingPosition() {
        return this.c.s().getPageListViewMovingPosition();
    }

    public float getZoom() {
        return this.f21087d.getZoom();
    }

    @Override // ri.c
    public final void i() {
        this.c.s().i();
    }

    @Override // ri.c
    public final boolean j() {
        this.c.s().j();
        return true;
    }

    @Override // ri.c
    public final boolean l() {
        this.c.s().l();
        return false;
    }

    @Override // ri.c
    public final boolean o() {
        this.c.s().o();
        return true;
    }

    @Override // ri.c
    public final boolean q() {
        return this.c.s().q();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        APageListView aPageListView = this.f21087d;
        if (aPageListView != null) {
            aPageListView.setBackgroundColor(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        APageListView aPageListView = this.f21087d;
        if (aPageListView != null) {
            aPageListView.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        APageListView aPageListView = this.f21087d;
        if (aPageListView != null) {
            aPageListView.setBackgroundResource(i10);
        }
    }

    @Override // ri.c
    public void setDrawPictrue(boolean z10) {
        jh.c.f19238d.c = z10;
    }

    public void setFitSize(int i10) {
        this.f21087d.setFitSize(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f21087d.getCurrentPageView();
    }

    public PrintWord(Context context, f fVar, j jVar) {
        super(context);
        this.f21085a = -1;
        this.f21086b = -1;
        this.f21090g = new Rect();
        this.c = fVar;
        this.f21089f = jVar;
        APageListView aPageListView = new APageListView(context, this);
        this.f21087d = aPageListView;
        addView(aPageListView, new FrameLayout.LayoutParams(-1, -1));
        Paint paint = new Paint();
        this.f21088e = paint;
        paint.setAntiAlias(true);
        paint.setTypeface(Typeface.SANS_SERIF);
        paint.setTextSize(24.0f);
    }

    @Override // ri.c
    public final void a() {
    }

    @Override // ri.c
    public final void c() {
    }
}

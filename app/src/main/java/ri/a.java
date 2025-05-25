package ri;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import android.widget.Toast;
import lib.zj.office.system.beans.pagelist.APageListItem;
import lib.zj.office.system.beans.pagelist.APageListView;
import ri.e;

/* compiled from: APageListEventManage.java */
/* loaded from: classes3.dex */
public final class a implements e.a, GestureDetector.OnGestureListener, Runnable, View.OnTouchListener, GestureDetector.OnDoubleTapListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f29582a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f29583b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29584d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29585e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f29586f;

    /* renamed from: g  reason: collision with root package name */
    public int f29587g;

    /* renamed from: h  reason: collision with root package name */
    public int f29588h;

    /* renamed from: i  reason: collision with root package name */
    public int f29589i;

    /* renamed from: j  reason: collision with root package name */
    public int f29590j;

    /* renamed from: k  reason: collision with root package name */
    public int f29591k;

    /* renamed from: l  reason: collision with root package name */
    public final APageListView f29592l;

    /* renamed from: m  reason: collision with root package name */
    public final e f29593m;

    /* renamed from: n  reason: collision with root package name */
    public final GestureDetector f29594n;

    /* renamed from: o  reason: collision with root package name */
    public final Scroller f29595o;

    /* renamed from: p  reason: collision with root package name */
    public final Toast f29596p;

    public a(APageListView aPageListView) {
        this.f29596p = null;
        this.f29592l = aPageListView;
        this.f29594n = new GestureDetector(aPageListView.getContext(), this);
        this.f29595o = new Scroller(aPageListView.getContext());
        this.f29593m = new e(aPageListView.getContext(), this);
        this.f29596p = Toast.makeText(aPageListView.getContext(), "", 0);
    }

    public static int a(float f10, float f11) {
        if (Math.abs(f10) > Math.abs(f11) * 2.0f) {
            if (f10 > 0.0f) {
                return 2;
            }
            return 1;
        } else if (Math.abs(f11) > Math.abs(f10) * 2.0f) {
            if (f11 > 0.0f) {
                return 4;
            }
            return 3;
        } else {
            return 0;
        }
    }

    public final void b(APageListItem aPageListItem) {
        APageListView aPageListView = this.f29592l;
        if (aPageListView != null) {
            Point c = APageListView.c(aPageListView.g(aPageListItem));
            int i10 = aPageListItem.f20997a;
            int pageCount = aPageListView.getPageCount();
            int i11 = c.x;
            if (i11 != 0 || c.y != 0) {
                this.f29588h = 0;
                this.f29587g = 0;
                Scroller scroller = this.f29595o;
                if (scroller != null) {
                    if ((i10 <= 0 && c.y < 0) || (i10 >= pageCount - 1 && c.y > 0)) {
                        scroller.startScroll(0, 0, i11, c.y, 400);
                    } else {
                        scroller.startScroll(0, 0, i11, 0, 400);
                    }
                }
                aPageListView.post(this);
            }
            if (aPageListView.getPageListViewListener() != null) {
                aPageListView.getPageListViewListener().e(aPageListItem);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        APageListView aPageListView = this.f29592l;
        if (aPageListView != null && aPageListView.getPageListViewListener() != null) {
            aPageListView.getPageListViewListener().d(this.f29592l, null, null, -1.0f, -1.0f, (byte) 10);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.f29584d = true;
        this.f29585e = false;
        this.c = true;
        APageListView aPageListView = this.f29592l;
        if (aPageListView != null && aPageListView.getPageListViewListener() != null) {
            aPageListView.getPageListViewListener().d(this.f29592l, motionEvent, null, -1.0f, -1.0f, (byte) 8);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        this.f29585e = false;
        this.c = true;
        APageListView aPageListView = this.f29592l;
        if (aPageListView != null && aPageListView.getPageListViewListener() != null) {
            aPageListView.getPageListViewListener().d(this.f29592l, motionEvent, null, -1.0f, -1.0f, (byte) 9);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f29595o.forceFinished(true);
        this.f29592l.getPageListViewListener().d(this.f29592l, motionEvent, null, -1.0f, -1.0f, (byte) 1);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        if (r1.bottom >= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00be, code lost:
        if (r1.top <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c3, code lost:
        if (r1.right >= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c8, code lost:
        if (r1.left <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ca, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cc, code lost:
        r3 = false;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onFling(android.view.MotionEvent r12, android.view.MotionEvent r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.a.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        APageListView aPageListView = this.f29592l;
        if (aPageListView != null && aPageListView.getPageListViewListener() != null) {
            aPageListView.getPageListViewListener().d(this.f29592l, motionEvent, null, -1.0f, -1.0f, (byte) 5);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        APageListItem currentPageView;
        APageListView aPageListView = this.f29592l;
        aPageListView.getPageListViewListener().d(this.f29592l, motionEvent, motionEvent2, f10, f11, (byte) 4);
        if (this.f29584d && !this.c) {
            aPageListView.getPageListViewListener().setDrawPictrue(false);
            this.f29583b = true;
            this.f29589i = (int) (this.f29589i - f10);
            this.f29590j = (int) (this.f29590j - f11);
            if (!aPageListView.getPageListViewListener().o() && (currentPageView = aPageListView.getCurrentPageView()) != null && currentPageView.getWidth() > aPageListView.getWidth()) {
                if (f10 > 0.0f) {
                    if ((aPageListView.getWidth() - this.f29589i) - currentPageView.getLeft() > currentPageView.getWidth() && currentPageView.getPageIndex() < aPageListView.getPageCount() - 1) {
                        this.f29589i = -(currentPageView.getLeft() + (currentPageView.getWidth() - aPageListView.getWidth()));
                    }
                } else if (f10 < 0.0f) {
                    if (currentPageView.getLeft() + this.f29589i > 0 && currentPageView.getPageIndex() != 0) {
                        this.f29589i = 0;
                    }
                }
            }
            aPageListView.requestLayout();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        APageListView aPageListView = this.f29592l;
        if (aPageListView != null && aPageListView.getPageListViewListener() != null) {
            aPageListView.getPageListViewListener().d(this.f29592l, motionEvent, null, -1.0f, -1.0f, (byte) 2);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (pi.b.f28943s) {
            pi.b.f28943s = false;
        } else {
            APageListView aPageListView = this.f29592l;
            if (aPageListView != null && aPageListView.getPageListViewListener() != null) {
                aPageListView.getPageListViewListener().d(this.f29592l, motionEvent, null, -1.0f, -1.0f, (byte) 7);
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        APageListView aPageListView = this.f29592l;
        if (aPageListView != null && aPageListView.getPageListViewListener() != null) {
            aPageListView.getPageListViewListener().d(this.f29592l, motionEvent, null, -1.0f, -1.0f, (byte) 3);
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f29592l.getPageListViewListener().d(view, motionEvent, null, -1.0f, -1.0f, (byte) 0);
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        APageListView aPageListView = this.f29592l;
        if (aPageListView == null) {
            return;
        }
        Scroller scroller = this.f29595o;
        if (!scroller.isFinished()) {
            scroller.computeScrollOffset();
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            this.f29589i = (currX - this.f29587g) + this.f29589i;
            this.f29590j = (currY - this.f29588h) + this.f29590j;
            this.f29587g = currX;
            this.f29588h = currY;
            aPageListView.requestLayout();
            aPageListView.post(this);
        } else if (!this.f29585e) {
            aPageListView.l(aPageListView.getCurrentPageView());
            if (aPageListView.getPageListViewListener() != null) {
                aPageListView.getPageListViewListener().f();
                aPageListView.getPageListViewListener().setDrawPictrue(true);
            }
        }
    }
}

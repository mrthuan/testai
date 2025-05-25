package lib.zj.office.pg.control;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import h5.e;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.beans.CalloutView.CalloutView;
import lib.zj.office.system.f;
import lib.zj.office.system.h;
import zh.g;

/* loaded from: classes3.dex */
public class Presentation extends FrameLayout implements h, qi.c {

    /* renamed from: a  reason: collision with root package name */
    public final e f20922a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20923b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f20924d;

    /* renamed from: e  reason: collision with root package name */
    public int f20925e;

    /* renamed from: f  reason: collision with root package name */
    public int f20926f;

    /* renamed from: g  reason: collision with root package name */
    public int f20927g;

    /* renamed from: h  reason: collision with root package name */
    public final float f20928h;

    /* renamed from: i  reason: collision with root package name */
    public final rh.h f20929i;

    /* renamed from: j  reason: collision with root package name */
    public final rh.e f20930j;

    /* renamed from: k  reason: collision with root package name */
    public final f f20931k;

    /* renamed from: l  reason: collision with root package name */
    public th.d f20932l;

    /* renamed from: m  reason: collision with root package name */
    public final th.c f20933m;

    /* renamed from: n  reason: collision with root package name */
    public vh.b f20934n;

    /* renamed from: o  reason: collision with root package name */
    public rh.f f20935o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f20936p;

    /* renamed from: q  reason: collision with root package name */
    public int f20937q;

    /* renamed from: r  reason: collision with root package name */
    public float f20938r;

    /* renamed from: s  reason: collision with root package name */
    public Rect f20939s;

    /* renamed from: t  reason: collision with root package name */
    public final PGPrintMode f20940t;

    /* renamed from: u  reason: collision with root package name */
    public CalloutView f20941u;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = Presentation.this.f20931k;
            if (fVar != null) {
                fVar.r(536870922, null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Presentation.this.f20931k.r(536870922, null);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = Presentation.this.f20931k;
            if (fVar != null) {
                fVar.r(536870922, null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Presentation.this.f20931k.getSlideShow();
        }
    }

    public Presentation(Activity activity, th.c cVar, f fVar) {
        super(activity);
        this.f20922a = new e(this, 8);
        this.f20924d = -1;
        this.f20925e = -1;
        this.f20928h = 1.0f;
        this.f20938r = 1.5f;
        this.f20939s = null;
        this.f20931k = fVar;
        this.f20933m = cVar;
        setLongClickable(true);
        this.f20929i = new rh.h(this);
        rh.e eVar = new rh.e(this);
        this.f20930j = eVar;
        PGPrintMode pGPrintMode = new PGPrintMode(activity, fVar, cVar, eVar);
        this.f20940t = pGPrintMode;
        addView(pGPrintMode);
    }

    @Override // qi.c
    public final void a() {
        if (this.f20936p) {
            sg.c n10 = this.f20931k.n();
            if (n10 != null) {
                n10.c();
                try {
                    p(n10);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        this.f20940t.getListView().getCurrentPageView();
    }

    @Override // lib.zj.office.system.h
    public final void b() {
        rh.h hVar = this.f20929i;
        if (hVar != null) {
            hVar.b();
            postInvalidate();
        }
    }

    @Override // lib.zj.office.system.h
    public final void c() {
        rh.h hVar;
        if (!this.f20936p && (hVar = this.f20929i) != null) {
            hVar.c();
        }
    }

    @Override // lib.zj.office.system.h
    public final boolean d(String str) {
        if (!this.f20936p) {
            return this.f20929i.d(str);
        }
        return false;
    }

    @Override // lib.zj.office.system.h
    public final boolean e() {
        if (!this.f20936p) {
            return this.f20929i.e();
        }
        return false;
    }

    @Override // lib.zj.office.system.h
    public final boolean f() {
        if (!this.f20936p) {
            return this.f20929i.f();
        }
        return false;
    }

    public final void g() {
        synchronized (this) {
            if (this.f20936p) {
                this.f20931k.o().b().c(0);
                setOnTouchListener(null);
                this.f20940t.setVisibility(0);
                Integer Y0 = this.f20931k.s().Y0();
                if (Y0 != null) {
                    setBackgroundColor(Y0.intValue());
                }
                this.f20925e = this.f20937q;
                this.f20936p = false;
                this.f20934n.e();
                n(this.f20925e, false);
                CalloutView calloutView = this.f20941u;
                if (calloutView != null) {
                    calloutView.setVisibility(4);
                }
                post(new d());
            }
        }
    }

    public f getControl() {
        return this.f20931k;
    }

    public int getCurrentIndex() {
        if (this.f20936p) {
            return this.f20937q;
        }
        return this.f20940t.getCurrentPageNumber() - 1;
    }

    public th.d getCurrentSlide() {
        if (this.f20936p) {
            return this.f20933m.d(this.f20937q);
        }
        return this.f20940t.getCurrentPGSlide();
    }

    public rh.e getEditor() {
        return this.f20930j;
    }

    public rh.h getFind() {
        return this.f20929i;
    }

    public Rectangle getFirstPageSize() {
        Dimension dimension = this.f20933m.c;
        return new Rectangle(dimension.width, dimension.height);
    }

    public int getFitSizeState() {
        if (this.f20936p) {
            return 0;
        }
        return this.f20940t.getFitSizeState();
    }

    public float getFitZoom() {
        if (this.f20936p) {
            Dimension pageSize = getPageSize();
            return Math.min(this.f20926f / pageSize.width, this.f20927g / pageSize.height);
        }
        return this.f20940t.getFitZoom();
    }

    public th.c getPGModel() {
        return this.f20933m;
    }

    public int getPageIndex() {
        return -1;
    }

    public Dimension getPageSize() {
        return this.f20933m.c;
    }

    public PGPrintMode getPrintMode() {
        return this.f20940t;
    }

    public int getRealSlideCount() {
        return this.f20933m.c();
    }

    public g getRenderersDoc() {
        return this.f20933m.f30028a;
    }

    public String getSelectedText() {
        return this.f20930j.f29562b.b();
    }

    public int getSlideCount() {
        return this.f20933m.f30031e;
    }

    public Rect getSlideDrawingRect() {
        if (this.f20936p) {
            Rect rect = this.f20939s;
            if (rect == null) {
                this.f20939s = new Rect(this.f20934n.f30812a);
            } else {
                rect.set(this.f20934n.f30812a);
            }
            int width = this.f20939s.width();
            Rect rect2 = this.f20939s;
            int i10 = this.f20926f;
            rect2.set((i10 - width) / 2, 0, (i10 + width) / 2, this.f20927g);
            return this.f20939s;
        }
        return null;
    }

    public PGPrintMode getView() {
        return this.f20940t;
    }

    public float getZoom() {
        if (this.f20936p) {
            return this.f20938r;
        }
        return this.f20940t.getZoom();
    }

    public int getmHeight() {
        return this.f20927g;
    }

    public int getmWidth() {
        return this.f20926f;
    }

    public final boolean h() {
        synchronized (this) {
            if (this.f20936p && (!this.f20934n.c() || this.f20937q < this.f20933m.f30031e - 1)) {
                return true;
            }
            return false;
        }
    }

    public final boolean i() {
        synchronized (this) {
            boolean z10 = false;
            if (!this.f20936p) {
                return false;
            }
            if (this.f20937q < this.f20933m.f30031e - 1) {
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f20936p     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L1f
            int r0 = r4.f20937q     // Catch: java.lang.Throwable -> L21
            r2 = 1
            if (r0 >= r2) goto L1d
            vh.b r0 = r4.f20934n     // Catch: java.lang.Throwable -> L21
            th.d r3 = r0.c     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r3 = r3.f30045l     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L1a
            int r0 = r0.f30814d     // Catch: java.lang.Throwable -> L21
            if (r0 > 0) goto L18
            goto L1a
        L18:
            r0 = r1
            goto L1b
        L1a:
            r0 = r2
        L1b:
            if (r0 != 0) goto L1f
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            return r2
        L1f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            return r1
        L21:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L21
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.pg.control.Presentation.j():boolean");
    }

    public final boolean k() {
        synchronized (this) {
            boolean z10 = false;
            if (!this.f20936p) {
                return false;
            }
            if (this.f20937q >= 1) {
                z10 = true;
            }
            return z10;
        }
    }

    public final void l() {
        if (this.f20936p) {
            if (this.f20941u == null) {
                CalloutView calloutView = new CalloutView(getContext(), this.f20931k, this);
                this.f20941u = calloutView;
                calloutView.setIndex(this.f20937q);
                addView(this.f20941u);
                return;
            }
            return;
        }
        this.f20940t.getListView().getCurrentPageView().d();
    }

    public final void m(int i10, int i11) {
        this.f20926f = i10;
        this.f20927g = i11;
        boolean z10 = this.f20923b;
        if (z10 || this.f20936p) {
            if (z10) {
                this.f20923b = false;
            }
            this.f20938r = getFitZoom();
            if (this.f20936p) {
                post(new b());
            }
        }
    }

    public final void n(int i10, boolean z10) {
        f fVar = this.f20931k;
        if (!z10) {
            fVar.s().M0(false);
        }
        th.c cVar = this.f20933m;
        if (i10 >= cVar.f30031e) {
            return;
        }
        if (!this.f20936p) {
            this.f20925e = i10;
            if (i10 < getRealSlideCount()) {
                this.f20940t.f20913e.p(i10);
                return;
            } else {
                setViewVisible(false);
                return;
            }
        }
        int i11 = this.f20925e;
        this.f20925e = i10;
        th.d d10 = cVar.d(i10);
        this.f20932l = d10;
        if (this.f20934n == null) {
            this.f20934n = new vh.b(this, d10);
        }
        vh.b bVar = this.f20934n;
        if (bVar != null) {
            bVar.c = this.f20932l;
        }
        if (i11 != this.f20925e) {
            fVar.r(20, null);
            vh.a g10 = vh.a.g();
            th.d d11 = cVar.d(i11);
            g10.getClass();
            vh.a.a(d11);
        }
        postInvalidate();
        post(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000e, B:9:0x0014, B:15:0x0020, B:20:0x0033, B:22:0x0039, B:24:0x0040, B:26:0x0055, B:77:0x0156, B:79:0x015a, B:80:0x015f, B:81:0x016a, B:27:0x0062, B:32:0x006d, B:33:0x0079, B:41:0x0085, B:43:0x008b, B:45:0x00a5, B:46:0x00b2, B:48:0x00b8, B:50:0x00c0, B:52:0x00da, B:53:0x00e7, B:54:0x00f2, B:56:0x00f8, B:58:0x0100, B:64:0x010a, B:66:0x0117, B:67:0x011e, B:69:0x0124, B:70:0x012d, B:72:0x0137, B:73:0x0143, B:74:0x014a, B:76:0x014e, B:83:0x016c), top: B:88:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000e, B:9:0x0014, B:15:0x0020, B:20:0x0033, B:22:0x0039, B:24:0x0040, B:26:0x0055, B:77:0x0156, B:79:0x015a, B:80:0x015f, B:81:0x016a, B:27:0x0062, B:32:0x006d, B:33:0x0079, B:41:0x0085, B:43:0x008b, B:45:0x00a5, B:46:0x00b2, B:48:0x00b8, B:50:0x00c0, B:52:0x00da, B:53:0x00e7, B:54:0x00f2, B:56:0x00f8, B:58:0x0100, B:64:0x010a, B:66:0x0117, B:67:0x011e, B:69:0x0124, B:70:0x012d, B:72:0x0137, B:73:0x0143, B:74:0x014a, B:76:0x014e, B:83:0x016c), top: B:88:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143 A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000e, B:9:0x0014, B:15:0x0020, B:20:0x0033, B:22:0x0039, B:24:0x0040, B:26:0x0055, B:77:0x0156, B:79:0x015a, B:80:0x015f, B:81:0x016a, B:27:0x0062, B:32:0x006d, B:33:0x0079, B:41:0x0085, B:43:0x008b, B:45:0x00a5, B:46:0x00b2, B:48:0x00b8, B:50:0x00c0, B:52:0x00da, B:53:0x00e7, B:54:0x00f2, B:56:0x00f8, B:58:0x0100, B:64:0x010a, B:66:0x0117, B:67:0x011e, B:69:0x0124, B:70:0x012d, B:72:0x0137, B:73:0x0143, B:74:0x014a, B:76:0x014e, B:83:0x016c), top: B:88:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(byte r5) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.pg.control.Presentation.o(byte):void");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20923b = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f fVar = this.f20931k;
        if (this.c && this.f20936p) {
            try {
                this.f20934n.a(canvas, this.f20938r, this.f20941u);
                if (fVar.p()) {
                    if (this.f20925e < getRealSlideCount() - 1) {
                        try {
                            Thread.sleep(500L);
                        } catch (Exception unused) {
                        }
                        n(this.f20925e + 1, false);
                    } else {
                        fVar.r(22, Boolean.TRUE);
                    }
                }
                if (this.f20924d != this.f20925e) {
                    fVar.s().S();
                    this.f20924d = this.f20925e;
                }
            } catch (NullPointerException e10) {
                fVar.o().c().a(false, e10);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m(i10, i11);
    }

    public final void p(sg.c cVar) {
        boolean z10;
        float f10;
        qh.d dVar;
        if (this.c && this.f20936p) {
            lib.zj.office.java.awt.geom.d dVar2 = this.f20934n.f30815e;
            if (dVar2 != null && (dVar = (qh.d) dVar2.f20752b) != null && dVar.b() != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                jh.c cVar2 = jh.c.f19238d;
                boolean h10 = cVar2.h();
                cVar2.c = true;
                if (this.f20936p) {
                    f10 = this.f20938r;
                } else {
                    f10 = this.f20928h;
                }
                Dimension pageSize = getPageSize();
                int min = Math.min((int) (pageSize.width * f10), getWidth());
                int min2 = Math.min((int) (pageSize.height * f10), getHeight());
                Bitmap a10 = cVar.a(min, min2);
                if (a10 == null) {
                    return;
                }
                Canvas canvas = new Canvas(a10);
                canvas.drawColor(-16777216);
                this.f20934n.b(canvas, min, min2, f10);
                this.f20931k.o().b().a(canvas, getCurrentIndex(), f10);
                cVar.d();
                cVar2.c = h10;
                return;
            }
            return;
        }
        ((PGPageListItem) this.f20940t.getListView().getCurrentPageView()).b();
    }

    public void setAnimationDuration(int i10) {
        if (this.f20934n == null) {
            this.f20934n = new vh.b(this, this.f20932l);
        }
        vh.b bVar = this.f20934n;
        if (bVar != null) {
            bVar.f30819i = i10;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        PGPrintMode pGPrintMode = this.f20940t;
        if (pGPrintMode != null) {
            pGPrintMode.setBackgroundColor(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        PGPrintMode pGPrintMode = this.f20940t;
        if (pGPrintMode != null) {
            pGPrintMode.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        PGPrintMode pGPrintMode = this.f20940t;
        if (pGPrintMode != null) {
            pGPrintMode.setBackgroundResource(i10);
        }
    }

    public void setFitSize(int i10) {
        if (this.f20936p) {
            return;
        }
        this.f20940t.setFitSize(i10);
    }

    public void setViewVisible(boolean z10) {
        this.f20940t.setVisible(z10);
    }

    public void setmHeight(int i10) {
        this.f20927g = i10;
    }

    public void setmWidth(int i10) {
        this.f20926f = i10;
    }
}

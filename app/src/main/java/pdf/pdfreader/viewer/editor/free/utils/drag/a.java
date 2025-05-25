package pdf.pdfreader.viewer.editor.free.utils.drag;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import b1.l;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: DragSelectTouchListener.java */
/* loaded from: classes3.dex */
public final class a implements RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28625a;

    /* renamed from: b  reason: collision with root package name */
    public int f28626b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28627d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28628e;

    /* renamed from: f  reason: collision with root package name */
    public int f28629f;

    /* renamed from: g  reason: collision with root package name */
    public float f28630g;

    /* renamed from: h  reason: collision with root package name */
    public float f28631h;

    /* renamed from: i  reason: collision with root package name */
    public int f28632i;

    /* renamed from: j  reason: collision with root package name */
    public int f28633j;

    /* renamed from: k  reason: collision with root package name */
    public c f28634k;

    /* renamed from: l  reason: collision with root package name */
    public RecyclerView f28635l;

    /* renamed from: m  reason: collision with root package name */
    public l f28636m;

    /* renamed from: o  reason: collision with root package name */
    public int f28638o;

    /* renamed from: p  reason: collision with root package name */
    public int f28639p;

    /* renamed from: q  reason: collision with root package name */
    public int f28640q;

    /* renamed from: r  reason: collision with root package name */
    public int f28641r;

    /* renamed from: n  reason: collision with root package name */
    public final RunnableC0358a f28637n = new RunnableC0358a();

    /* renamed from: s  reason: collision with root package name */
    public final int f28642s = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);

    /* renamed from: t  reason: collision with root package name */
    public final boolean f28643t = true;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f28644u = true;

    /* compiled from: DragSelectTouchListener.java */
    /* renamed from: pdf.pdfreader.viewer.editor.free.utils.drag.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0358a implements Runnable {
        public RunnableC0358a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int max;
            a aVar = a.this;
            l lVar = aVar.f28636m;
            if (lVar != null && lVar.f5300a.computeScrollOffset()) {
                int i10 = aVar.f28629f;
                if (i10 > 0) {
                    max = Math.min(i10, 16);
                } else {
                    max = Math.max(i10, -16);
                }
                aVar.f28635l.scrollBy(0, max);
                float f10 = aVar.f28630g;
                if (f10 != Float.MIN_VALUE) {
                    float f11 = aVar.f28631h;
                    if (f11 != Float.MIN_VALUE) {
                        aVar.e(aVar.f28635l, f10, f11);
                    }
                }
                RecyclerView recyclerView = aVar.f28635l;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.m(recyclerView, aVar.f28637n);
            }
        }
    }

    /* compiled from: DragSelectTouchListener.java */
    /* loaded from: classes3.dex */
    public interface b extends c {
        void a();

        void b(int i10);
    }

    /* compiled from: DragSelectTouchListener.java */
    /* loaded from: classes3.dex */
    public interface c {
        void c(int i10, int i11, boolean z10);
    }

    static {
        ea.a.p("d1MfTA==", "wsK0VuMm");
    }

    public a() {
        a();
    }

    public final void a() {
        this.f28625a = false;
        c cVar = this.f28634k;
        if (cVar != null && (cVar instanceof b)) {
            ((b) cVar).a();
        }
        this.f28626b = -1;
        this.c = -1;
        this.f28632i = -1;
        this.f28633j = -1;
        this.f28627d = false;
        this.f28628e = false;
        this.f28630g = Float.MIN_VALUE;
        this.f28631h = Float.MIN_VALUE;
        l lVar = this.f28636m;
        if (lVar != null && !lVar.f5300a.isFinished()) {
            this.f28635l.removeCallbacks(this.f28637n);
            this.f28636m.f5300a.abortAnimation();
        }
    }

    public final void b() {
        RecyclerView recyclerView = this.f28635l;
        if (recyclerView == null) {
            return;
        }
        Context context = recyclerView.getContext();
        if (this.f28636m == null) {
            this.f28636m = new l(context, new LinearInterpolator());
        }
        if (this.f28636m.f5300a.isFinished()) {
            RecyclerView recyclerView2 = this.f28635l;
            RunnableC0358a runnableC0358a = this.f28637n;
            recyclerView2.removeCallbacks(runnableC0358a);
            l lVar = this.f28636m;
            lVar.f5300a.startScroll(0, lVar.f5300a.getCurrY(), 0, 5000, 100000);
            RecyclerView recyclerView3 = this.f28635l;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.m(recyclerView3, runnableC0358a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f28625a) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3 && actionMasked != 6) {
                    return;
                }
            } else {
                if (!this.f28627d && !this.f28628e) {
                    e(recyclerView, motionEvent.getX(), motionEvent.getY());
                }
                int y10 = (int) motionEvent.getY();
                int i10 = this.f28638o;
                if (y10 >= i10 && y10 <= this.f28639p) {
                    this.f28630g = motionEvent.getX();
                    this.f28631h = motionEvent.getY();
                    float f10 = this.f28638o;
                    float f11 = this.f28639p - f10;
                    this.f28629f = (int) (16 * ((f11 - (y10 - f10)) / f11) * (-1.0f));
                    if (!this.f28627d) {
                        this.f28627d = true;
                        b();
                        return;
                    }
                    return;
                } else if (this.f28643t && y10 < i10) {
                    this.f28630g = motionEvent.getX();
                    this.f28631h = motionEvent.getY();
                    this.f28629f = -16;
                    if (!this.f28627d) {
                        this.f28627d = true;
                        b();
                        return;
                    }
                    return;
                } else if (y10 >= this.f28640q && y10 <= this.f28641r) {
                    this.f28630g = motionEvent.getX();
                    this.f28631h = motionEvent.getY();
                    float f12 = this.f28640q;
                    this.f28629f = (int) (16 * ((y10 - f12) / (this.f28641r - f12)));
                    if (!this.f28628e) {
                        this.f28628e = true;
                        b();
                        return;
                    }
                    return;
                } else if (this.f28644u && y10 > this.f28641r) {
                    this.f28630g = motionEvent.getX();
                    this.f28631h = motionEvent.getY();
                    this.f28629f = 16;
                    if (!this.f28627d) {
                        this.f28627d = true;
                        b();
                        return;
                    }
                    return;
                } else {
                    this.f28628e = false;
                    this.f28627d = false;
                    this.f28630g = Float.MIN_VALUE;
                    this.f28631h = Float.MIN_VALUE;
                    l lVar = this.f28636m;
                    if (lVar != null && !lVar.f5300a.isFinished()) {
                        this.f28635l.removeCallbacks(this.f28637n);
                        this.f28636m.f5300a.abortAnimation();
                        return;
                    }
                    return;
                }
            }
        }
        a();
    }

    public final void d(int i10) {
        this.f28625a = true;
        this.f28626b = i10;
        this.c = i10;
        this.f28632i = i10;
        this.f28633j = i10;
        c cVar = this.f28634k;
        if (cVar != null && (cVar instanceof b)) {
            ((b) cVar).b(i10);
        }
    }

    public final void e(RecyclerView recyclerView, float f10, float f11) {
        int V;
        int i10;
        View M = recyclerView.M(f10, f11);
        if (M != null && (V = RecyclerView.V(M)) != -1 && this.c != V) {
            this.c = V;
            if (this.f28634k != null && (i10 = this.f28626b) != -1 && V != -1) {
                int min = Math.min(i10, V);
                int max = Math.max(this.f28626b, this.c);
                int i11 = this.f28632i;
                if (i11 != -1 && this.f28633j != -1) {
                    if (min > i11) {
                        this.f28634k.c(i11, min - 1, false);
                    } else if (min < i11) {
                        this.f28634k.c(min, i11 - 1, true);
                    }
                    int i12 = this.f28633j;
                    if (max > i12) {
                        this.f28634k.c(i12 + 1, max, true);
                    } else if (max < i12) {
                        this.f28634k.c(max + 1, i12, false);
                    }
                } else if (max - min == 1) {
                    this.f28634k.c(min, min, true);
                } else {
                    this.f28634k.c(min, max, true);
                }
                this.f28632i = min;
                this.f28633j = max;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r5 != 5) goto L12;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(androidx.recyclerview.widget.RecyclerView r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            boolean r0 = r3.f28625a
            r1 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r4.getAdapter()
            int r0 = r0.getItemCount()
            if (r0 != 0) goto L10
            goto L3c
        L10:
            int r5 = r5.getActionMasked()
            r0 = 1
            if (r5 == 0) goto L23
            if (r5 == r0) goto L20
            r2 = 3
            if (r5 == r2) goto L20
            r2 = 5
            if (r5 == r2) goto L23
            goto L26
        L20:
            r3.f28625a = r1
            goto L26
        L23:
            r3.a()
        L26:
            r3.f28635l = r4
            int r4 = r4.getHeight()
            r3.f28638o = r1
            int r5 = r3.f28642s
            int r2 = r1 + r5
            r3.f28639p = r2
            int r4 = r4 + r1
            int r5 = r4 - r5
            r3.f28640q = r5
            r3.f28641r = r4
            return r0
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.drag.a.f(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void j(boolean z10) {
    }
}

package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import androidx.viewpager2.widget.c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;
import y0.f;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f4820a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f4821b;
    public final androidx.viewpager2.widget.a c;

    /* renamed from: d  reason: collision with root package name */
    public int f4822d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4823e;

    /* renamed from: f  reason: collision with root package name */
    public final a f4824f;

    /* renamed from: g  reason: collision with root package name */
    public f f4825g;

    /* renamed from: h  reason: collision with root package name */
    public int f4826h;

    /* renamed from: i  reason: collision with root package name */
    public Parcelable f4827i;

    /* renamed from: j  reason: collision with root package name */
    public k f4828j;

    /* renamed from: k  reason: collision with root package name */
    public j f4829k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.viewpager2.widget.c f4830l;

    /* renamed from: m  reason: collision with root package name */
    public androidx.viewpager2.widget.a f4831m;

    /* renamed from: n  reason: collision with root package name */
    public l2.c f4832n;

    /* renamed from: o  reason: collision with root package name */
    public androidx.viewpager2.widget.b f4833o;

    /* renamed from: p  reason: collision with root package name */
    public RecyclerView.j f4834p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4835q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4836r;

    /* renamed from: s  reason: collision with root package name */
    public int f4837s;

    /* renamed from: t  reason: collision with root package name */
    public h f4838t;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            super(0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e, androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f4823e = true;
            viewPager2.f4830l.f4865l = true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.k();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f4822d != i10) {
                viewPager2.f4822d = i10;
                viewPager2.f4838t.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.clearFocus();
            if (viewPager2.hasFocus()) {
                viewPager2.f4828j.requestFocus(2);
            }
        }
    }

    /* loaded from: classes.dex */
    public abstract class d {
    }

    /* loaded from: classes.dex */
    public static abstract class e extends RecyclerView.g {
        public e(int i10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class f extends LinearLayoutManager {
        public f() {
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void O0(RecyclerView.y yVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.O0(yVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void f0(RecyclerView.t tVar, RecyclerView.y yVar, y0.f fVar) {
            super.f0(tVar, yVar, fVar);
            ViewPager2.this.f4838t.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean t0(RecyclerView.t tVar, RecyclerView.y yVar, int i10, Bundle bundle) {
            ViewPager2.this.f4838t.getClass();
            return super.t0(tVar, yVar, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean y0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class h extends d {

        /* renamed from: a  reason: collision with root package name */
        public final a f4842a = new a();

        /* renamed from: b  reason: collision with root package name */
        public final b f4843b = new b();
        public androidx.viewpager2.widget.d c;

        /* loaded from: classes.dex */
        public class a implements y0.j {
            public a() {
            }

            @Override // y0.j
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f4836r) {
                    viewPager2.j(currentItem, true);
                }
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements y0.j {
            public b() {
            }

            @Override // y0.j
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f4836r) {
                    viewPager2.j(currentItem, true);
                }
                return true;
            }
        }

        public h() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.s(recyclerView, 2);
            this.c = new androidx.viewpager2.widget.d(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (f0.d.c(viewPager2) == 0) {
                f0.d.s(viewPager2, 1);
            }
        }

        public final void b() {
            int itemCount;
            int i10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i11 = 16908360;
            f0.l(viewPager2, 16908360);
            boolean z10 = false;
            f0.i(viewPager2, 0);
            f0.l(viewPager2, 16908361);
            f0.i(viewPager2, 0);
            f0.l(viewPager2, 16908358);
            f0.i(viewPager2, 0);
            f0.l(viewPager2, 16908359);
            f0.i(viewPager2, 0);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f4836r) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.f4843b;
            a aVar = this.f4842a;
            if (orientation == 0) {
                if (viewPager2.f4825g.N() == 1) {
                    z10 = true;
                }
                if (z10) {
                    i10 = 16908360;
                } else {
                    i10 = 16908361;
                }
                if (z10) {
                    i11 = 16908361;
                }
                if (viewPager2.f4822d < itemCount - 1) {
                    f0.m(viewPager2, new f.a(i10), null, aVar);
                }
                if (viewPager2.f4822d > 0) {
                    f0.m(viewPager2, new f.a(i11), null, bVar);
                    return;
                }
                return;
            }
            if (viewPager2.f4822d < itemCount - 1) {
                f0.m(viewPager2, new f.a(16908359), null, aVar);
            }
            if (viewPager2.f4822d > 0) {
                f0.m(viewPager2, new f.a(16908358), null, bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(View view, float f10);
    }

    /* loaded from: classes.dex */
    public class j extends c0 {
        public j() {
        }

        @Override // androidx.recyclerview.widget.c0, androidx.recyclerview.widget.i0
        public final View c(RecyclerView.m mVar) {
            if (ViewPager2.this.e()) {
                return null;
            }
            return super.c(mVar);
        }
    }

    /* loaded from: classes.dex */
    public class k extends RecyclerView {
        public k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f4838t.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f4822d);
            accessibilityEvent.setToIndex(viewPager2.f4822d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.f4836r && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.f4836r && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f4850a;

        /* renamed from: b  reason: collision with root package name */
        public final RecyclerView f4851b;

        public m(int i10, RecyclerView recyclerView) {
            this.f4850a = i10;
            this.f4851b = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4851b.u0(this.f4850a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f4820a = new Rect();
        this.f4821b = new Rect();
        this.c = new androidx.viewpager2.widget.a();
        this.f4823e = false;
        this.f4824f = new a();
        this.f4826h = -1;
        this.f4834p = null;
        this.f4835q = false;
        this.f4836r = true;
        this.f4837s = -1;
        d(context, null);
    }

    public final void a() {
        boolean z10;
        l2.c cVar = this.f4832n;
        androidx.viewpager2.widget.c cVar2 = cVar.f20440b;
        boolean z11 = false;
        if (cVar2.f4859f == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            cVar.f20444g = 0;
            cVar.f20443f = 0;
            cVar.f20445h = SystemClock.uptimeMillis();
            VelocityTracker velocityTracker = cVar.f20441d;
            if (velocityTracker == null) {
                cVar.f20441d = VelocityTracker.obtain();
                cVar.f20442e = ViewConfiguration.get(cVar.f20439a.getContext()).getScaledMaximumFlingVelocity();
            } else {
                velocityTracker.clear();
            }
            cVar2.f4858e = 4;
            cVar2.f(true);
            if (cVar2.f4859f == 0) {
                z11 = true;
            }
            if (!z11) {
                cVar.c.y0();
            }
            long j10 = cVar.f20445h;
            MotionEvent obtain = MotionEvent.obtain(j10, j10, 0, 0.0f, 0.0f, 0);
            cVar.f20441d.addMovement(obtain);
            obtain.recycle();
        }
    }

    public final void b() {
        boolean z10;
        l2.c cVar = this.f4832n;
        androidx.viewpager2.widget.c cVar2 = cVar.f20440b;
        boolean z11 = cVar2.f4866m;
        if (z11) {
            if (cVar2.f4859f == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || z11) {
                cVar2.f4866m = false;
                cVar2.g();
                c.a aVar = cVar2.f4860g;
                if (aVar.c == 0) {
                    int i10 = aVar.f4867a;
                    if (i10 != cVar2.f4861h) {
                        cVar2.c(i10);
                    }
                    cVar2.d(0);
                    cVar2.e();
                } else {
                    cVar2.d(2);
                }
            }
            VelocityTracker velocityTracker = cVar.f20441d;
            velocityTracker.computeCurrentVelocity(1000, cVar.f20442e);
            if (!cVar.c.S((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
                ViewPager2 viewPager2 = cVar.f20439a;
                View c10 = viewPager2.f4829k.c(viewPager2.f4825g);
                if (c10 != null) {
                    int[] b10 = viewPager2.f4829k.b(viewPager2.f4825g, c10);
                    int i11 = b10[0];
                    if (i11 != 0 || b10[1] != 0) {
                        viewPager2.f4828j.t0(i11, b10[1], false);
                    }
                }
            }
        }
    }

    public final void c(@SuppressLint({"SupportAnnotationUsage"}) float f10) {
        boolean z10;
        int i10;
        float f11;
        float f12;
        l2.c cVar = this.f4832n;
        if (cVar.f20440b.f4866m) {
            float f13 = cVar.f20443f - f10;
            cVar.f20443f = f13;
            int round = Math.round(f13 - cVar.f20444g);
            cVar.f20444g += round;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (cVar.f20439a.getOrientation() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = round;
            } else {
                i10 = 0;
            }
            if (z10) {
                round = 0;
            }
            if (z10) {
                f11 = cVar.f20443f;
            } else {
                f11 = 0.0f;
            }
            if (z10) {
                f12 = 0.0f;
            } else {
                f12 = cVar.f20443f;
            }
            cVar.c.scrollBy(i10, round);
            MotionEvent obtain = MotionEvent.obtain(cVar.f20445h, uptimeMillis, 2, f11, f12, 0);
            cVar.f20441d.addMovement(obtain);
            obtain.recycle();
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f4828j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f4828j.canScrollVertically(i10);
    }

    public final void d(Context context, AttributeSet attributeSet) {
        this.f4838t = new h();
        k kVar = new k(context);
        this.f4828j = kVar;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        kVar.setId(f0.e.a());
        this.f4828j.setDescendantFocusability(131072);
        f fVar = new f();
        this.f4825g = fVar;
        this.f4828j.setLayoutManager(fVar);
        this.f4828j.setScrollingTouchSlop(1);
        int[] iArr = k2.a.f19556a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f4828j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            k kVar2 = this.f4828j;
            l2.d dVar = new l2.d();
            if (kVar2.C == null) {
                kVar2.C = new ArrayList();
            }
            kVar2.C.add(dVar);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.f4830l = cVar;
            this.f4832n = new l2.c(this, cVar, this.f4828j);
            j jVar = new j();
            this.f4829k = jVar;
            jVar.a(this.f4828j);
            this.f4828j.s(this.f4830l);
            androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
            this.f4831m = aVar;
            this.f4830l.f4855a = aVar;
            b bVar = new b();
            c cVar2 = new c();
            this.f4831m.f4852a.add(bVar);
            this.f4831m.f4852a.add(cVar2);
            this.f4838t.a(this.f4828j);
            this.f4831m.f4852a.add(this.c);
            androidx.viewpager2.widget.b bVar2 = new androidx.viewpager2.widget.b(this.f4825g);
            this.f4833o = bVar2;
            this.f4831m.f4852a.add(bVar2);
            k kVar3 = this.f4828j;
            attachViewToParent(kVar3, 0, kVar3.getLayoutParams());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof l) {
            int i10 = ((l) parcelable).f4848a;
            sparseArray.put(this.f4828j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        h();
    }

    public final boolean e() {
        return this.f4832n.f20440b.f4866m;
    }

    public final void f(g gVar) {
        this.c.f4852a.add(gVar);
    }

    public final void g() {
        if (this.f4833o.f4854b == null) {
            return;
        }
        androidx.viewpager2.widget.c cVar = this.f4830l;
        cVar.g();
        c.a aVar = cVar.f4860g;
        double d10 = aVar.f4867a + aVar.f4868b;
        int i10 = (int) d10;
        float f10 = (float) (d10 - i10);
        this.f4833o.b(i10, f10, Math.round(getPageSize() * f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f4838t.getClass();
        this.f4838t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f4828j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4822d;
    }

    public int getItemDecorationCount() {
        return this.f4828j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4837s;
    }

    public int getOrientation() {
        return this.f4825g.f4184p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        k kVar = this.f4828j;
        if (getOrientation() == 0) {
            height = kVar.getWidth() - kVar.getPaddingLeft();
            paddingBottom = kVar.getPaddingRight();
        } else {
            height = kVar.getHeight() - kVar.getPaddingTop();
            paddingBottom = kVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f4830l.f4859f;
    }

    public final void h() {
        RecyclerView.Adapter adapter;
        if (this.f4826h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f4827i;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                ((androidx.viewpager2.adapter.g) adapter).b(parcelable);
            }
            this.f4827i = null;
        }
        int max = Math.max(0, Math.min(this.f4826h, adapter.getItemCount() - 1));
        this.f4822d = max;
        this.f4826h = -1;
        this.f4828j.r0(max);
        this.f4838t.b();
    }

    public final void i(int i10, boolean z10) {
        if (!e()) {
            j(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void j(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        RecyclerView.Adapter adapter = getAdapter();
        boolean z13 = false;
        if (adapter == null) {
            if (this.f4826h != -1) {
                this.f4826h = Math.max(i10, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
            int i13 = this.f4822d;
            if (min == i13) {
                if (this.f4830l.f4859f == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return;
                }
            }
            if (min == i13 && z10) {
                return;
            }
            double d10 = i13;
            this.f4822d = min;
            this.f4838t.b();
            androidx.viewpager2.widget.c cVar = this.f4830l;
            if (cVar.f4859f == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                cVar.g();
                c.a aVar = cVar.f4860g;
                d10 = aVar.f4867a + aVar.f4868b;
            }
            androidx.viewpager2.widget.c cVar2 = this.f4830l;
            cVar2.getClass();
            if (z10) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            cVar2.f4858e = i11;
            cVar2.f4866m = false;
            if (cVar2.f4862i != min) {
                z13 = true;
            }
            cVar2.f4862i = min;
            cVar2.d(2);
            if (z13) {
                cVar2.c(min);
            }
            if (!z10) {
                this.f4828j.r0(min);
                return;
            }
            double d11 = min;
            if (Math.abs(d11 - d10) > 3.0d) {
                k kVar = this.f4828j;
                if (d11 > d10) {
                    i12 = min - 3;
                } else {
                    i12 = min + 3;
                }
                kVar.r0(i12);
                k kVar2 = this.f4828j;
                kVar2.post(new m(min, kVar2));
                return;
            }
            this.f4828j.u0(min);
        }
    }

    public final void k() {
        j jVar = this.f4829k;
        if (jVar != null) {
            View c10 = jVar.c(this.f4825g);
            if (c10 == null) {
                return;
            }
            this.f4825g.getClass();
            int P = RecyclerView.m.P(c10);
            if (P != this.f4822d && getScrollState() == 0) {
                this.f4831m.c(P);
            }
            this.f4823e = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                i10 = viewPager2.getAdapter().getItemCount();
                i11 = 0;
            } else {
                i11 = viewPager2.getAdapter().getItemCount();
                i10 = 0;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(i10, i11, 0).f31967a);
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && viewPager2.f4836r) {
            if (viewPager2.f4822d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.f4822d < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f4828j.getMeasuredWidth();
        int measuredHeight = this.f4828j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f4820a;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f4821b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f4828j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f4823e) {
            k();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f4828j, i10, i11);
        int measuredWidth = this.f4828j.getMeasuredWidth();
        int measuredHeight = this.f4828j.getMeasuredHeight();
        int measuredState = this.f4828j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f4826h = lVar.f4849b;
        this.f4827i = lVar.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f4848a = this.f4828j.getId();
        int i10 = this.f4826h;
        if (i10 == -1) {
            i10 = this.f4822d;
        }
        lVar.f4849b = i10;
        Parcelable parcelable = this.f4827i;
        if (parcelable != null) {
            lVar.c = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.f4828j.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                lVar.c = ((androidx.viewpager2.adapter.g) adapter).a();
            }
        }
        return lVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        boolean z10;
        int currentItem;
        this.f4838t.getClass();
        boolean z11 = false;
        if (i10 != 8192 && i10 != 4096) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            h hVar = this.f4838t;
            hVar.getClass();
            if (i10 == 8192 || i10 == 4096) {
                z11 = true;
            }
            if (z11) {
                ViewPager2 viewPager2 = ViewPager2.this;
                if (i10 == 8192) {
                    currentItem = viewPager2.getCurrentItem() - 1;
                } else {
                    currentItem = viewPager2.getCurrentItem() + 1;
                }
                if (viewPager2.f4836r) {
                    viewPager2.j(currentItem, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f4828j.getAdapter();
        h hVar = this.f4838t;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(hVar.c);
        } else {
            hVar.getClass();
        }
        a aVar = this.f4824f;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(aVar);
        }
        this.f4828j.setAdapter(adapter);
        this.f4822d = 0;
        h();
        h hVar2 = this.f4838t;
        hVar2.b();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(hVar2.c);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(aVar);
        }
    }

    public void setCurrentItem(int i10) {
        i(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f4838t.b();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f4837s = i10;
        this.f4828j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f4825g.p1(i10);
        this.f4838t.b();
    }

    public void setPageTransformer(i iVar) {
        if (iVar != null) {
            if (!this.f4835q) {
                this.f4834p = this.f4828j.getItemAnimator();
                this.f4835q = true;
            }
            this.f4828j.setItemAnimator(null);
        } else if (this.f4835q) {
            this.f4828j.setItemAnimator(this.f4834p);
            this.f4834p = null;
            this.f4835q = false;
        }
        androidx.viewpager2.widget.b bVar = this.f4833o;
        if (iVar == bVar.f4854b) {
            return;
        }
        bVar.f4854b = iVar;
        g();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f4836r = z10;
        this.f4838t.b();
    }

    /* loaded from: classes.dex */
    public static class l extends View.BaseSavedState {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f4848a;

        /* renamed from: b  reason: collision with root package name */
        public int f4849b;
        public Parcelable c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new l(parcel, null) : new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new l[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new l(parcel, classLoader) : new l(parcel);
            }
        }

        public l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4848a = parcel.readInt();
            this.f4849b = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4848a);
            parcel.writeInt(this.f4849b);
            parcel.writeParcelable(this.c, i10);
        }

        public l(Parcel parcel) {
            super(parcel);
            this.f4848a = parcel.readInt();
            this.f4849b = parcel.readInt();
            this.c = parcel.readParcelable(null);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4820a = new Rect();
        this.f4821b = new Rect();
        this.c = new androidx.viewpager2.widget.a();
        this.f4823e = false;
        this.f4824f = new a();
        this.f4826h = -1;
        this.f4834p = null;
        this.f4835q = false;
        this.f4836r = true;
        this.f4837s = -1;
        d(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4820a = new Rect();
        this.f4821b = new Rect();
        this.c = new androidx.viewpager2.widget.a();
        this.f4823e = false;
        this.f4824f = new a();
        this.f4826h = -1;
        this.f4834p = null;
        this.f4835q = false;
        this.f4836r = true;
        this.f4837s = -1;
        d(context, attributeSet);
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void a(int i10) {
        }

        public void c(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }
    }
}

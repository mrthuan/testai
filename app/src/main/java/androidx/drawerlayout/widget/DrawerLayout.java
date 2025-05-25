package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import d1.c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import x0.s0;
import y0.f;
import y0.j;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] D = {16843828};
    public static final int[] E = {16842931};
    public static final boolean F;
    public static final boolean G;
    public static final boolean H;
    public Rect A;
    public Matrix B;
    public final a C;

    /* renamed from: a  reason: collision with root package name */
    public final d f3571a;

    /* renamed from: b  reason: collision with root package name */
    public float f3572b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f3573d;

    /* renamed from: e  reason: collision with root package name */
    public float f3574e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f3575f;

    /* renamed from: g  reason: collision with root package name */
    public final d1.c f3576g;

    /* renamed from: h  reason: collision with root package name */
    public final d1.c f3577h;

    /* renamed from: i  reason: collision with root package name */
    public final h f3578i;

    /* renamed from: j  reason: collision with root package name */
    public final h f3579j;

    /* renamed from: k  reason: collision with root package name */
    public int f3580k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3581l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3582m;

    /* renamed from: n  reason: collision with root package name */
    public int f3583n;

    /* renamed from: o  reason: collision with root package name */
    public int f3584o;

    /* renamed from: p  reason: collision with root package name */
    public int f3585p;

    /* renamed from: q  reason: collision with root package name */
    public int f3586q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3587r;

    /* renamed from: s  reason: collision with root package name */
    public e f3588s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f3589t;

    /* renamed from: u  reason: collision with root package name */
    public float f3590u;

    /* renamed from: v  reason: collision with root package name */
    public float f3591v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f3592w;

    /* renamed from: x  reason: collision with root package name */
    public Object f3593x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3594y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<View> f3595z;

    /* loaded from: classes.dex */
    public class a implements j {
        public a() {
        }

        @Override // y0.j
        public final boolean a(View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (DrawerLayout.k(view) && drawerLayout.g(view) != 2) {
                drawerLayout.b(view);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z10;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z11 = true;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            drawerLayout.f3593x = windowInsets;
            drawerLayout.f3594y = z10;
            if (z10 || drawerLayout.getBackground() != null) {
                z11 = false;
            }
            drawerLayout.setWillNotDraw(z11);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    public class c extends x0.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f3597d = new Rect();

        public c() {
        }

        @Override // x0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.getText();
                DrawerLayout drawerLayout = DrawerLayout.this;
                View f10 = drawerLayout.f();
                if (f10 != null) {
                    int h10 = drawerLayout.h(f10);
                    drawerLayout.getClass();
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    Gravity.getAbsoluteGravity(h10, f0.e.d(drawerLayout));
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // x0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // x0.a
        public final void d(View view, y0.f fVar) {
            boolean z10 = DrawerLayout.F;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
            if (z10) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                fVar.c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                ViewParent f10 = f0.d.f(view);
                if (f10 instanceof View) {
                    fVar.f31952b = -1;
                    accessibilityNodeInfo.setParent((View) f10);
                }
                Rect rect = this.f3597d;
                obtain.getBoundsInScreen(rect);
                accessibilityNodeInfo.setBoundsInScreen(rect);
                accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                fVar.h(obtain.getClassName());
                fVar.j(obtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                accessibilityNodeInfo.setFocused(obtain.isFocused());
                accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(obtain.isSelected());
                fVar.a(obtain.getActions());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (DrawerLayout.i(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            fVar.h("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f31953e.f31964a);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) f.a.f31954f.f31964a);
        }

        @Override // x0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.F && !DrawerLayout.i(view)) {
                return false;
            }
            return super.f(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends x0.a {
        @Override // x0.a
        public final void d(View view, y0.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (!DrawerLayout.i(view)) {
                fVar.f31952b = -1;
                accessibilityNodeInfo.setParent(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();

        void c();

        void d();
    }

    /* loaded from: classes.dex */
    public class h extends c.AbstractC0191c {

        /* renamed from: a  reason: collision with root package name */
        public final int f3606a;

        /* renamed from: b  reason: collision with root package name */
        public d1.c f3607b;
        public final a c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                View d10;
                int width;
                int i10;
                h hVar = h.this;
                int i11 = hVar.f3607b.f16065o;
                int i12 = hVar.f3606a;
                int i13 = 3;
                if (i12 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z10) {
                    d10 = drawerLayout.d(3);
                    if (d10 != null) {
                        i10 = -d10.getWidth();
                    } else {
                        i10 = 0;
                    }
                    width = i10 + i11;
                } else {
                    d10 = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i11;
                }
                if (d10 != null) {
                    if (((z10 && d10.getLeft() < width) || (!z10 && d10.getLeft() > width)) && drawerLayout.g(d10) == 0) {
                        hVar.f3607b.u(d10, width, d10.getTop());
                        ((f) d10.getLayoutParams()).c = true;
                        drawerLayout.invalidate();
                        if (i12 == 3) {
                            i13 = 5;
                        }
                        View d11 = drawerLayout.d(i13);
                        if (d11 != null) {
                            drawerLayout.b(d11);
                        }
                        if (!drawerLayout.f3587r) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            int childCount = drawerLayout.getChildCount();
                            for (int i14 = 0; i14 < childCount; i14++) {
                                drawerLayout.getChildAt(i14).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                            drawerLayout.f3587r = true;
                        }
                    }
                }
            }
        }

        public h(int i10) {
            this.f3606a = i10;
        }

        @Override // d1.c.AbstractC0191c
        public final int a(View view, int i10) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // d1.c.AbstractC0191c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // d1.c.AbstractC0191c
        public final int c(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.l(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // d1.c.AbstractC0191c
        public final void e(int i10, int i11) {
            View d10;
            int i12 = i10 & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (i12 == 1) {
                d10 = drawerLayout.d(3);
            } else {
                d10 = drawerLayout.d(5);
            }
            if (d10 != null && drawerLayout.g(d10) == 0) {
                this.f3607b.c(d10, i11);
            }
        }

        @Override // d1.c.AbstractC0191c
        public final void f() {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // d1.c.AbstractC0191c
        public final void g(View view, int i10) {
            ((f) view.getLayoutParams()).c = false;
            int i11 = 3;
            if (this.f3606a == 3) {
                i11 = 5;
            }
            DrawerLayout drawerLayout = DrawerLayout.this;
            View d10 = drawerLayout.d(i11);
            if (d10 != null) {
                drawerLayout.b(d10);
            }
        }

        @Override // d1.c.AbstractC0191c
        public final void h(int i10) {
            int i11;
            View rootView;
            View view = this.f3607b.f16070t;
            DrawerLayout drawerLayout = DrawerLayout.this;
            int i12 = drawerLayout.f3576g.f16052a;
            int i13 = drawerLayout.f3577h.f16052a;
            if (i12 != 1 && i13 != 1) {
                i11 = 2;
                if (i12 != 2 && i13 != 2) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            if (view != null && i10 == 0) {
                float f10 = ((f) view.getLayoutParams()).f3600b;
                if (f10 == 0.0f) {
                    f fVar = (f) view.getLayoutParams();
                    if ((fVar.f3601d & 1) == 1) {
                        fVar.f3601d = 0;
                        ArrayList arrayList = drawerLayout.f3589t;
                        if (arrayList != null) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                ((e) drawerLayout.f3589t.get(size)).d();
                            }
                        }
                        drawerLayout.q(view, false);
                        drawerLayout.p(view);
                        if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                } else if (f10 == 1.0f) {
                    f fVar2 = (f) view.getLayoutParams();
                    if ((fVar2.f3601d & 1) == 0) {
                        fVar2.f3601d = 1;
                        ArrayList arrayList2 = drawerLayout.f3589t;
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                ((e) drawerLayout.f3589t.get(size2)).a();
                            }
                        }
                        drawerLayout.q(view, true);
                        drawerLayout.p(view);
                        if (drawerLayout.hasWindowFocus()) {
                            drawerLayout.sendAccessibilityEvent(32);
                        }
                    }
                }
            }
            if (i11 != drawerLayout.f3580k) {
                drawerLayout.f3580k = i11;
                ArrayList arrayList3 = drawerLayout.f3589t;
                if (arrayList3 != null) {
                    for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                        ((e) drawerLayout.f3589t.get(size3)).b();
                    }
                }
            }
        }

        @Override // d1.c.AbstractC0191c
        public final void i(View view, int i10, int i11) {
            float width;
            int i12;
            int width2 = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(view, 3)) {
                width = i10 + width2;
            } else {
                width = drawerLayout.getWidth() - i10;
            }
            float f10 = width / width2;
            drawerLayout.o(view, f10);
            if (f10 == 0.0f) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            view.setVisibility(i12);
            drawerLayout.invalidate();
        }

        @Override // d1.c.AbstractC0191c
        public final void j(View view, float f10, float f11) {
            int i10;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f12 = ((f) view.getLayoutParams()).f3600b;
            int width = view.getWidth();
            if (drawerLayout.a(view, 3)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 <= 0 && (i11 != 0 || f12 <= 0.5f)) {
                    i10 = -width;
                } else {
                    i10 = 0;
                }
            } else {
                int width2 = drawerLayout.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && f12 > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f3607b.s(i10, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // d1.c.AbstractC0191c
        public final boolean k(View view, int i10) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (DrawerLayout.l(view) && drawerLayout.a(view, this.f3606a) && drawerLayout.g(view) == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        F = true;
        G = true;
        if (i10 < 29) {
            z10 = false;
        }
        H = z10;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public static boolean i(View view) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.d.c(view) != 4 && f0.d.c(view) != 2) {
            return true;
        }
        return false;
    }

    public static boolean j(View view) {
        if (((f) view.getLayoutParams()).f3599a == 0) {
            return true;
        }
        return false;
    }

    public static boolean k(View view) {
        if (l(view)) {
            if ((((f) view.getLayoutParams()).f3601d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean l(View view) {
        int i10 = ((f) view.getLayoutParams()).f3599a;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, f0.e.d(view));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a(View view, int i10) {
        if ((h(view) & i10) == i10) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            arrayList2 = this.f3595z;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (l(childAt)) {
                if (k(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i12++;
        }
        if (!z10) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = arrayList2.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (e() == null && !l(view)) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.s(view, 1);
        } else {
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            f0.d.s(view, 4);
        }
        if (!F) {
            f0.o(view, this.f3571a);
        }
    }

    public final void b(View view) {
        if (l(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f3582m) {
                fVar.f3600b = 0.0f;
                fVar.f3601d = 0;
            } else {
                fVar.f3601d |= 4;
                if (a(view, 3)) {
                    this.f3576g.u(view, -view.getWidth(), view.getTop());
                } else {
                    this.f3577h.u(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void c(boolean z10) {
        boolean u7;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (l(childAt) && (!z10 || fVar.c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    u7 = this.f3576g.u(childAt, -width, childAt.getTop());
                } else {
                    u7 = this.f3577h.u(childAt, getWidth(), childAt.getTop());
                }
                z11 |= u7;
                fVar.c = false;
            }
        }
        h hVar = this.f3578i;
        DrawerLayout.this.removeCallbacks(hVar.c);
        h hVar2 = this.f3579j;
        DrawerLayout.this.removeCallbacks(hVar2.c);
        if (z11) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((f) getChildAt(i10).getLayoutParams()).f3600b);
        }
        this.f3574e = f10;
        boolean h10 = this.f3576g.h();
        boolean h11 = this.f3577h.h();
        if (h10 || h11) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this);
        }
    }

    public final View d(int i10) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, f0.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f3574e > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                for (int i10 = childCount - 1; i10 >= 0; i10--) {
                    View childAt = getChildAt(i10);
                    if (this.A == null) {
                        this.A = new Rect();
                    }
                    childAt.getHitRect(this.A);
                    if (this.A.contains((int) x4, (int) y10) && !j(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation(getScrollX() - childAt.getLeft(), getScrollY() - childAt.getTop());
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.B == null) {
                                    this.B = new Matrix();
                                }
                                matrix.invert(this.B);
                                obtain.transform(this.B);
                            }
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX, scrollY);
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX, -scrollY);
                        }
                        if (dispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        int height = getHeight();
        boolean j11 = j(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (j11) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background != null && background.getOpacity() == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && l(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i11) {
                                i11 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.f3574e;
        if (f10 > 0.0f && j11) {
            int i13 = this.f3573d;
            Paint paint = this.f3575f;
            paint.setColor((((int) ((((-16777216) & i13) >>> 24) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect(i10, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f3601d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        boolean z10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                if (l(childAt)) {
                    if (((f) childAt.getLayoutParams()).f3600b > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    public final int g(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (l(view)) {
            int i14 = ((f) view.getLayoutParams()).f3599a;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            int d10 = f0.e.d(this);
            if (i14 != 3) {
                if (i14 != 5) {
                    if (i14 != 8388611) {
                        if (i14 == 8388613) {
                            int i15 = this.f3586q;
                            if (i15 == 3) {
                                if (d10 == 0) {
                                    i13 = this.f3584o;
                                } else {
                                    i13 = this.f3583n;
                                }
                                if (i13 != 3) {
                                    return i13;
                                }
                            } else {
                                return i15;
                            }
                        }
                    } else {
                        int i16 = this.f3585p;
                        if (i16 == 3) {
                            if (d10 == 0) {
                                i12 = this.f3583n;
                            } else {
                                i12 = this.f3584o;
                            }
                            if (i12 != 3) {
                                return i12;
                            }
                        } else {
                            return i16;
                        }
                    }
                } else {
                    int i17 = this.f3584o;
                    if (i17 == 3) {
                        if (d10 == 0) {
                            i11 = this.f3586q;
                        } else {
                            i11 = this.f3585p;
                        }
                        if (i11 != 3) {
                            return i11;
                        }
                    } else {
                        return i17;
                    }
                }
            } else {
                int i18 = this.f3583n;
                if (i18 == 3) {
                    if (d10 == 0) {
                        i10 = this.f3585p;
                    } else {
                        i10 = this.f3586q;
                    }
                    if (i10 != 3) {
                        return i10;
                    }
                } else {
                    return i18;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (G) {
            return this.f3572b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3592w;
    }

    public final int h(View view) {
        int i10 = ((f) view.getLayoutParams()).f3599a;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        return Gravity.getAbsoluteGravity(i10, f0.e.d(this));
    }

    public final void m(View view) {
        if (l(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f3582m) {
                fVar.f3600b = 1.0f;
                fVar.f3601d = 1;
                q(view, true);
                p(view);
            } else {
                fVar.f3601d |= 2;
                if (a(view, 3)) {
                    this.f3576g.u(view, 0, view.getTop());
                } else {
                    this.f3577h.u(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void n(int i10, int i11) {
        View d10;
        d1.c cVar;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, f0.e.d(this));
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 8388611) {
                    if (i11 == 8388613) {
                        this.f3586q = i10;
                    }
                } else {
                    this.f3585p = i10;
                }
            } else {
                this.f3584o = i10;
            }
        } else {
            this.f3583n = i10;
        }
        if (i10 != 0) {
            if (absoluteGravity == 3) {
                cVar = this.f3576g;
            } else {
                cVar = this.f3577h;
            }
            cVar.b();
        }
        if (i10 != 1) {
            if (i10 == 2 && (d10 = d(absoluteGravity)) != null) {
                m(d10);
                return;
            }
            return;
        }
        View d11 = d(absoluteGravity);
        if (d11 != null) {
            b(d11);
        }
    }

    public final void o(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f3600b) {
            return;
        }
        fVar.f3600b = f10;
        ArrayList arrayList = this.f3589t;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((e) this.f3589t.get(size)).c();
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3582m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3582m = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f3594y && this.f3592w != null) {
            Object obj = this.f3593x;
            if (obj != null) {
                i10 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f3592w.setBounds(0, 0, getWidth(), i10);
                this.f3592w.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[LOOP:1: B:11:0x0022->B:24:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0053 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        if (i10 == 4) {
            if (f() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            View f10 = f();
            if (f10 != null && g(f10) == 0) {
                c(false);
            }
            if (f10 == null) {
                return false;
            }
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        int i14;
        float f10;
        int i15;
        boolean z11;
        int i16;
        boolean z12 = true;
        this.f3581l = true;
        int i17 = i12 - i10;
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i19 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i19, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f11 = measuredWidth;
                        i15 = (-measuredWidth) + ((int) (fVar.f3600b * f11));
                        f10 = (measuredWidth + i15) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i17 - i14) / f12;
                        i15 = i17 - ((int) (fVar.f3600b * f12));
                    }
                    if (f10 != fVar.f3600b) {
                        z11 = z12;
                    } else {
                        z11 = false;
                    }
                    int i20 = fVar.f3599a & 112;
                    if (i20 != 16) {
                        if (i20 != 80) {
                            int i21 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                            childAt.layout(i15, i21, measuredWidth + i15, measuredHeight + i21);
                        } else {
                            int i22 = i13 - i11;
                            childAt.layout(i15, (i22 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i22 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        }
                    } else {
                        int i23 = i13 - i11;
                        int i24 = (i23 - measuredHeight) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i24 < i25) {
                            i24 = i25;
                        } else {
                            int i26 = i24 + measuredHeight;
                            int i27 = i23 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i26 > i27) {
                                i24 = i27 - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i24, measuredWidth + i15, measuredHeight + i24);
                    }
                    if (z11) {
                        o(childAt, f10);
                    }
                    if (fVar.f3600b > 0.0f) {
                        i16 = 0;
                    } else {
                        i16 = 4;
                    }
                    if (childAt.getVisibility() != i16) {
                        childAt.setVisibility(i16);
                    }
                }
            }
            i18++;
            z12 = true;
        }
        if (H && (rootWindowInsets = getRootWindowInsets()) != null) {
            o0.b i28 = s0.i(null, rootWindowInsets).f31498a.i();
            d1.c cVar = this.f3576g;
            cVar.f16065o = Math.max(cVar.f16066p, i28.f22639a);
            d1.c cVar2 = this.f3577h;
            cVar2.f16065o = Math.max(cVar2.f16066p, i28.c);
        }
        this.f3581l = false;
        this.f3582m = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View d10;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f5506a);
        int i10 = gVar.c;
        if (i10 != 0 && (d10 = d(i10)) != null) {
            m(d10);
        }
        int i11 = gVar.f3602d;
        if (i11 != 3) {
            n(i11, 3);
        }
        int i12 = gVar.f3603e;
        if (i12 != 3) {
            n(i12, 5);
        }
        int i13 = gVar.f3604f;
        if (i13 != 3) {
            n(i13, 8388611);
        }
        int i14 = gVar.f3605g;
        if (i14 != 3) {
            n(i14, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (!G) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.e.d(this);
            f0.e.d(this);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f3601d;
            boolean z11 = true;
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 2) {
                z11 = false;
            }
            if (z10 || z11) {
                gVar.c = fVar.f3599a;
                break;
            }
        }
        gVar.f3602d = this.f3583n;
        gVar.f3603e = this.f3584o;
        gVar.f3604f = this.f3585p;
        gVar.f3605g = this.f3586q;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (g(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            d1.c r0 = r6.f3576g
            r0.m(r7)
            d1.c r1 = r6.f3577h
            r1.m(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L67
        L1a:
            r6.c(r3)
            r6.f3587r = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.j(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = j(r4)
            if (r4 == 0) goto L54
            float r4 = r6.f3590u
            float r1 = r1 - r4
            float r4 = r6.f3591v
            float r7 = r7 - r4
            int r0 = r0.f16053b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L54
            int r7 = r6.g(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.c(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3590u = r0
            r6.f3591v = r7
            r6.f3587r = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        f.a aVar = f.a.f31960l;
        f0.l(view, aVar.a());
        f0.i(view, 0);
        if (k(view) && g(view) != 2) {
            f0.m(view, aVar, null, this.C);
        }
    }

    public final void q(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((!z10 && !l(childAt)) || (z10 && childAt == view)) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.s(childAt, 1);
            } else {
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                f0.d.s(childAt, 4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.f3581l) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f10) {
        this.f3572b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                float f11 = this.f3572b;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.i.s(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        ArrayList arrayList;
        e eVar2 = this.f3588s;
        if (eVar2 != null && (arrayList = this.f3589t) != null) {
            arrayList.remove(eVar2);
        }
        if (eVar != null) {
            if (this.f3589t == null) {
                this.f3589t = new ArrayList();
            }
            this.f3589t.add(eVar);
        }
        this.f3588s = eVar;
    }

    public void setDrawerLockMode(int i10) {
        n(i10, 3);
        n(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f3573d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3592w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f3592w = new ColorDrawable(i10);
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3571a = new d();
        this.f3573d = -1728053248;
        this.f3575f = new Paint();
        this.f3582m = true;
        this.f3583n = 3;
        this.f3584o = 3;
        this.f3585p = 3;
        this.f3586q = 3;
        this.C = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.f3578i = hVar;
        h hVar2 = new h(5);
        this.f3579j = hVar2;
        d1.c i11 = d1.c.i(this, 1.0f, hVar);
        this.f3576g = i11;
        i11.f16067q = 1;
        i11.f16064n = f11;
        hVar.f3607b = i11;
        d1.c i12 = d1.c.i(this, 1.0f, hVar2);
        this.f3577h = i12;
        i12.f16067q = 2;
        i12.f16064n = f11;
        hVar2.f3607b = i12;
        setFocusableInTouchMode(true);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(this, 1);
        f0.o(this, new c());
        setMotionEventSplittingEnabled(false);
        if (f0.d.b(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(D);
            try {
                this.f3592w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1.a.f16989a, i10, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f3572b = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f3572b = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f3595z = new ArrayList<>();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f3592w = i10 != 0 ? androidx.core.content.a.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f3599a;

        /* renamed from: b  reason: collision with root package name */
        public float f3600b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f3601d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3599a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.E);
            this.f3599a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f() {
            super(-1, -1);
            this.f3599a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f3599a = 0;
            this.f3599a = fVar.f3599a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3599a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3599a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class g extends c1.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3602d;

        /* renamed from: e  reason: collision with root package name */
        public int f3603e;

        /* renamed from: f  reason: collision with root package name */
        public int f3604f;

        /* renamed from: g  reason: collision with root package name */
        public int f3605g;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new g[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = 0;
            this.c = parcel.readInt();
            this.f3602d = parcel.readInt();
            this.f3603e = parcel.readInt();
            this.f3604f = parcel.readInt();
            this.f3605g = parcel.readInt();
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f3602d);
            parcel.writeInt(this.f3603e);
            parcel.writeInt(this.f3604f);
            parcel.writeInt(this.f3605g);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.c = 0;
        }
    }
}

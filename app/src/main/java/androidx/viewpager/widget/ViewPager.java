package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import x0.f0;
import x0.n0;
import x0.s0;
import x0.u;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f4752a0 = {16842931};

    /* renamed from: b0  reason: collision with root package name */
    public static final a f4753b0 = new a();

    /* renamed from: c0  reason: collision with root package name */
    public static final b f4754c0 = new b();
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public VelocityTracker H;
    public int I;
    public int J;
    public int K;
    public int L;
    public EdgeEffect M;
    public EdgeEffect N;
    public boolean O;
    public boolean P;
    public int Q;
    public ArrayList R;
    public j S;
    public j T;
    public ArrayList U;
    public final c V;
    public int W;

    /* renamed from: a  reason: collision with root package name */
    public int f4755a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<f> f4756b;
    public final f c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4757d;

    /* renamed from: e  reason: collision with root package name */
    public j2.a f4758e;

    /* renamed from: f  reason: collision with root package name */
    public int f4759f;

    /* renamed from: g  reason: collision with root package name */
    public int f4760g;

    /* renamed from: h  reason: collision with root package name */
    public Parcelable f4761h;

    /* renamed from: i  reason: collision with root package name */
    public ClassLoader f4762i;

    /* renamed from: j  reason: collision with root package name */
    public Scroller f4763j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4764k;

    /* renamed from: l  reason: collision with root package name */
    public k f4765l;

    /* renamed from: m  reason: collision with root package name */
    public int f4766m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f4767n;

    /* renamed from: o  reason: collision with root package name */
    public int f4768o;

    /* renamed from: p  reason: collision with root package name */
    public int f4769p;

    /* renamed from: q  reason: collision with root package name */
    public float f4770q;

    /* renamed from: r  reason: collision with root package name */
    public float f4771r;

    /* renamed from: s  reason: collision with root package name */
    public int f4772s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4773t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4774u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4775v;

    /* renamed from: w  reason: collision with root package name */
    public int f4776w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4777x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4778y;

    /* renamed from: z  reason: collision with root package name */
    public int f4779z;

    /* loaded from: classes.dex */
    public static class a implements Comparator<f> {
        @Override // java.util.Comparator
        public final int compare(f fVar, f fVar2) {
            return fVar.f4784b - fVar2.f4784b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.r();
        }
    }

    /* loaded from: classes.dex */
    public class d implements u {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f4781a = new Rect();

        public d() {
        }

        @Override // x0.u
        public final s0 m(View view, s0 s0Var) {
            s0 j10 = f0.j(view, s0Var);
            if (j10.f31498a.m()) {
                return j10;
            }
            int c = j10.c();
            Rect rect = this.f4781a;
            rect.left = c;
            rect.top = j10.e();
            rect.right = j10.d();
            rect.bottom = j10.b();
            ViewPager viewPager = ViewPager.this;
            int childCount = viewPager.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                s0 b10 = f0.b(viewPager.getChildAt(i10), j10);
                rect.left = Math.min(b10.c(), rect.left);
                rect.top = Math.min(b10.e(), rect.top);
                rect.right = Math.min(b10.d(), rect.right);
                rect.bottom = Math.min(b10.b(), rect.bottom);
            }
            return j10.g(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f4783a;

        /* renamed from: b  reason: collision with root package name */
        public int f4784b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public float f4785d;

        /* renamed from: e  reason: collision with root package name */
        public float f4786e;
    }

    /* loaded from: classes.dex */
    public class h extends x0.a {
        public h() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
            if (r0.getCount() > 1) goto L5;
         */
        @Override // x0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            /*
                r2 = this;
                super.c(r3, r4)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r3 = r3.getName()
                r4.setClassName(r3)
                androidx.viewpager.widget.ViewPager r3 = androidx.viewpager.widget.ViewPager.this
                j2.a r0 = r3.f4758e
                if (r0 == 0) goto L1a
                int r0 = r0.getCount()
                r1 = 1
                if (r0 <= r1) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                r4.setScrollable(r1)
                int r0 = r4.getEventType()
                r1 = 4096(0x1000, float:5.74E-42)
                if (r0 != r1) goto L3b
                j2.a r0 = r3.f4758e
                if (r0 == 0) goto L3b
                int r0 = r0.getCount()
                r4.setItemCount(r0)
                int r0 = r3.f4759f
                r4.setFromIndex(r0)
                int r3 = r3.f4759f
                r4.setToIndex(r3)
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.h.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
        }

        @Override // x0.a
        public final void d(View view, y0.f fVar) {
            boolean z10;
            this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
            fVar.h(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            j2.a aVar = viewPager.f4758e;
            if (aVar != null && aVar.getCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.l(z10);
            if (viewPager.canScrollHorizontally(1)) {
                fVar.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                fVar.a(8192);
            }
        }

        @Override // x0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i10 != 4096) {
                if (i10 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f4759f - 1);
                return true;
            } else if (!viewPager.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager.setCurrentItem(viewPager.f4759f + 1);
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(ViewPager viewPager, j2.a aVar, j2.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface j {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, int i11);

        void onPageSelected(int i10);
    }

    /* loaded from: classes.dex */
    public class k extends DataSetObserver {
        public k() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.f();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.f();
        }
    }

    /* loaded from: classes.dex */
    public static class l extends c1.a {
        public static final Parcelable.Creator<l> CREATOR = new a();
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f4792d;

        /* renamed from: e  reason: collision with root package name */
        public final ClassLoader f4793e;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new l[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }
        }

        public l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? l.class.getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.f4792d = parcel.readParcelable(classLoader);
            this.f4793e = classLoader;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return a6.h.g(sb2, this.c, "}");
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.f4792d, i10);
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.f4756b = new ArrayList<>();
        this.c = new f();
        this.f4757d = new Rect();
        this.f4760g = -1;
        this.f4761h = null;
        this.f4762i = null;
        this.f4770q = -3.4028235E38f;
        this.f4771r = Float.MAX_VALUE;
        this.f4776w = 1;
        this.G = -1;
        this.O = true;
        this.V = new c();
        this.W = 0;
        l();
    }

    public static boolean d(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z10 && view.canScrollHorizontally(-i10)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f4774u != z10) {
            this.f4774u = z10;
        }
    }

    public final f a(int i10, int i11) {
        f fVar = new f();
        fVar.f4784b = i10;
        fVar.f4783a = this.f4758e.instantiateItem((ViewGroup) this, i10);
        fVar.f4785d = this.f4758e.getPageWidth(i10);
        ArrayList<f> arrayList = this.f4756b;
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.add(i11, fVar);
        } else {
            arrayList.add(fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f i12;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (i12 = i(childAt)) != null && i12.f4784b == this.f4759f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        f i10;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (i10 = i(childAt)) != null && i10.f4784b == this.f4759f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean z11 = gVar.f4787a;
        if (view.getClass().getAnnotation(e.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        gVar.f4787a = z12;
        if (this.f4773t) {
            if (!z12) {
                gVar.f4789d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b(j jVar) {
        if (this.R == null) {
            this.R = new ArrayList();
        }
        this.R.add(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r7) goto L9
            goto L2f
        L9:
            if (r0 == 0) goto L30
            android.view.ViewParent r3 = r0.getParent()
        Lf:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L1c
            if (r3 != r7) goto L17
            r3 = r1
            goto L1d
        L17:
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L1c:
            r3 = r2
        L1d:
            if (r3 != 0) goto L30
            android.view.ViewParent r0 = r0.getParent()
        L23:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L2f
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L23
        L2f:
            r0 = 0
        L30:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r7, r0, r8)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L7f
            if (r3 == r0) goto L7f
            android.graphics.Rect r6 = r7.f4757d
            if (r8 != r5) goto L63
            android.graphics.Rect r4 = r7.h(r6, r3)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L5d
            if (r4 < r5) goto L5d
            int r0 = r7.f4759f
            if (r0 <= 0) goto L97
            int r0 = r0 - r1
            r7.w(r0, r1)
            goto L98
        L5d:
            boolean r0 = r3.requestFocus()
        L61:
            r2 = r0
            goto L99
        L63:
            if (r8 != r4) goto L99
            android.graphics.Rect r1 = r7.h(r6, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.h(r6, r0)
            int r2 = r2.left
            if (r0 == 0) goto L7a
            if (r1 > r2) goto L7a
            boolean r0 = r7.o()
            goto L61
        L7a:
            boolean r0 = r3.requestFocus()
            goto L61
        L7f:
            if (r8 == r5) goto L8e
            if (r8 != r1) goto L84
            goto L8e
        L84:
            if (r8 == r4) goto L89
            r0 = 2
            if (r8 != r0) goto L99
        L89:
            boolean r2 = r7.o()
            goto L99
        L8e:
            int r0 = r7.f4759f
            if (r0 <= 0) goto L97
            int r0 = r0 - r1
            r7.w(r0, r1)
            goto L98
        L97:
            r1 = r2
        L98:
            r2 = r1
        L99:
            if (r2 == 0) goto La2
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.f4758e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.f4770q))) {
                return false;
            }
            return true;
        } else if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.f4771r))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof g) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f4764k = true;
        if (!this.f4763j.isFinished() && this.f4763j.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f4763j.getCurrX();
            int currY = this.f4763j.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!p(currX)) {
                    this.f4763j.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this);
            return;
        }
        e(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L64
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5f
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5f
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.c(r4)
            goto L60
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5f
            boolean r6 = r5.c(r1)
            goto L60
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.o()
            goto L60
        L41:
            r6 = 66
            boolean r6 = r5.c(r6)
            goto L60
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L58
            int r6 = r5.f4759f
            if (r6 <= 0) goto L5f
            int r6 = r6 - r1
            r5.w(r6, r1)
            r6 = r1
            goto L60
        L58:
            r6 = 17
            boolean r6 = r5.c(r6)
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 == 0) goto L63
            goto L64
        L63:
            r1 = r2
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f i10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (i10 = i(childAt)) != null && i10.f4784b == this.f4759f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j2.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f4758e) == null || aVar.getCount() <= 1)) {
            this.M.finish();
            this.N.finish();
        } else {
            if (!this.M.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f4770q * width);
                this.M.setSize(height, width);
                z10 = false | this.M.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.N.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f4771r + 1.0f)) * width2);
                this.N.setSize(height2, width2);
                z10 |= this.N.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4767n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z10) {
        boolean z11;
        if (this.W == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f4763j.isFinished()) {
                this.f4763j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4763j.getCurrX();
                int currY = this.f4763j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        p(currX);
                    }
                }
            }
        }
        this.f4775v = false;
        int i10 = 0;
        while (true) {
            ArrayList<f> arrayList = this.f4756b;
            if (i10 >= arrayList.size()) {
                break;
            }
            f fVar = arrayList.get(i10);
            if (fVar.c) {
                fVar.c = false;
                z11 = true;
            }
            i10++;
        }
        if (z11) {
            c cVar = this.V;
            if (z10) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.m(this, cVar);
                return;
            }
            cVar.run();
        }
    }

    public final void f() {
        boolean z10;
        int count = this.f4758e.getCount();
        this.f4755a = count;
        ArrayList<f> arrayList = this.f4756b;
        if (arrayList.size() < (this.f4776w * 2) + 1 && arrayList.size() < count) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f4759f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < arrayList.size()) {
            f fVar = arrayList.get(i11);
            int itemPosition = this.f4758e.getItemPosition(fVar.f4783a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    arrayList.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f4758e.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f4758e.destroyItem((ViewGroup) this, fVar.f4784b, fVar.f4783a);
                    int i12 = this.f4759f;
                    if (i12 == fVar.f4784b) {
                        i10 = Math.max(0, Math.min(i12, (-1) + count));
                    }
                } else {
                    int i13 = fVar.f4784b;
                    if (i13 != itemPosition) {
                        if (i13 == this.f4759f) {
                            i10 = itemPosition;
                        }
                        fVar.f4784b = itemPosition;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f4758e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(arrayList, f4753b0);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f4787a) {
                    gVar.c = 0.0f;
                }
            }
            x(i10, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i10) {
        j jVar = this.S;
        if (jVar != null) {
            jVar.onPageSelected(i10);
        }
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.R.get(i11);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i10);
                }
            }
        }
        j jVar3 = this.T;
        if (jVar3 != null) {
            jVar3.onPageSelected(i10);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public j2.a getAdapter() {
        return this.f4758e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f4759f;
    }

    public int getOffscreenPageLimit() {
        return this.f4776w;
    }

    public int getPageMargin() {
        return this.f4766m;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final f i(View view) {
        int i10 = 0;
        while (true) {
            ArrayList<f> arrayList = this.f4756b;
            if (i10 < arrayList.size()) {
                f fVar = arrayList.get(i10);
                if (this.f4758e.isViewFromObject(view, fVar.f4783a)) {
                    return fVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final f j() {
        float f10;
        float f11;
        f fVar;
        int i10;
        int clientWidth = getClientWidth();
        float f12 = 0.0f;
        if (clientWidth > 0) {
            f10 = getScrollX() / clientWidth;
        } else {
            f10 = 0.0f;
        }
        if (clientWidth > 0) {
            f11 = this.f4766m / clientWidth;
        } else {
            f11 = 0.0f;
        }
        int i11 = 0;
        boolean z10 = true;
        f fVar2 = null;
        int i12 = -1;
        float f13 = 0.0f;
        while (true) {
            ArrayList<f> arrayList = this.f4756b;
            if (i11 < arrayList.size()) {
                f fVar3 = arrayList.get(i11);
                if (!z10 && fVar3.f4784b != (i10 = i12 + 1)) {
                    f fVar4 = this.c;
                    fVar4.f4786e = f12 + f13 + f11;
                    fVar4.f4784b = i10;
                    fVar4.f4785d = this.f4758e.getPageWidth(i10);
                    i11--;
                    fVar = fVar4;
                } else {
                    fVar = fVar3;
                }
                f12 = fVar.f4786e;
                float f14 = fVar.f4785d + f12 + f11;
                if (!z10 && f10 < f12) {
                    return fVar2;
                }
                if (f10 < f14 || i11 == arrayList.size() - 1) {
                    break;
                }
                int i13 = fVar.f4784b;
                float f15 = fVar.f4785d;
                i11++;
                z10 = false;
                f fVar5 = fVar;
                i12 = i13;
                f13 = f15;
                fVar2 = fVar5;
            } else {
                return fVar2;
            }
        }
        return fVar;
    }

    public final f k(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList<f> arrayList = this.f4756b;
            if (i11 < arrayList.size()) {
                f fVar = arrayList.get(i11);
                if (fVar.f4784b == i10) {
                    return fVar;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final void l() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4763j = new Scroller(context, f4754c0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.I = (int) (400.0f * f10);
        this.J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.M = new EdgeEffect(context);
        this.N = new EdgeEffect(context);
        this.K = (int) (25.0f * f10);
        this.L = (int) (2.0f * f10);
        this.f4779z = (int) (f10 * 16.0f);
        f0.o(this, new h());
        if (f0.d.c(this) == 0) {
            f0.d.s(this, 1);
        }
        f0.i.u(this, new d());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.Q
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f4787a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f4788b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            androidx.viewpager.widget.ViewPager$j r0 = r12.S
            if (r0 == 0) goto L72
            r0.onPageScrolled(r13, r14, r15)
        L72:
            java.util.ArrayList r0 = r12.R
            if (r0 == 0) goto L8c
            int r0 = r0.size()
        L7a:
            if (r1 >= r0) goto L8c
            java.util.ArrayList r3 = r12.R
            java.lang.Object r3 = r3.get(r1)
            androidx.viewpager.widget.ViewPager$j r3 = (androidx.viewpager.widget.ViewPager.j) r3
            if (r3 == 0) goto L89
            r3.onPageScrolled(r13, r14, r15)
        L89:
            int r1 = r1 + 1
            goto L7a
        L8c:
            androidx.viewpager.widget.ViewPager$j r0 = r12.T
            if (r0 == 0) goto L93
            r0.onPageScrolled(r13, r14, r15)
        L93:
            r12.P = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m(int, float, int):void");
    }

    public final void n(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.C = motionEvent.getX(i10);
            this.G = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o() {
        j2.a aVar = this.f4758e;
        if (aVar != null && this.f4759f < aVar.getCount() - 1) {
            w(this.f4759f + 1, true);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.V);
        Scroller scroller = this.f4763j;
        if (scroller != null && !scroller.isFinished()) {
            this.f4763j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f10;
        ArrayList<f> arrayList;
        float f11;
        super.onDraw(canvas);
        if (this.f4766m > 0 && this.f4767n != null) {
            ArrayList<f> arrayList2 = this.f4756b;
            if (arrayList2.size() > 0 && this.f4758e != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f12 = this.f4766m / width2;
                int i11 = 0;
                f fVar = arrayList2.get(0);
                float f13 = fVar.f4786e;
                int size = arrayList2.size();
                int i12 = fVar.f4784b;
                int i13 = arrayList2.get(size - 1).f4784b;
                while (i12 < i13) {
                    while (true) {
                        i10 = fVar.f4784b;
                        if (i12 <= i10 || i11 >= size) {
                            break;
                        }
                        i11++;
                        fVar = arrayList2.get(i11);
                    }
                    if (i12 == i10) {
                        float f14 = fVar.f4786e;
                        float f15 = fVar.f4785d;
                        f10 = (f14 + f15) * width2;
                        f13 = f14 + f15 + f12;
                    } else {
                        float pageWidth = this.f4758e.getPageWidth(i12);
                        f10 = (f13 + pageWidth) * width2;
                        f13 = pageWidth + f12 + f13;
                    }
                    if (this.f4766m + f10 > scrollX) {
                        arrayList = arrayList2;
                        f11 = f12;
                        this.f4767n.setBounds(Math.round(f10), this.f4768o, Math.round(this.f4766m + f10), this.f4769p);
                        this.f4767n.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        f11 = f12;
                    }
                    if (f10 <= scrollX + width) {
                        i12++;
                        arrayList2 = arrayList;
                        f12 = f11;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10;
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f4777x) {
                    return true;
                }
                if (this.f4778y) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        n(motionEvent);
                    }
                } else {
                    int i10 = this.G;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x4 = motionEvent.getX(findPointerIndex);
                        float f11 = x4 - this.C;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.F);
                        int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i11 != 0) {
                            float f12 = this.C;
                            if ((f12 < this.A && i11 > 0) || (f12 > getWidth() - this.A && f11 < 0.0f)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && d(this, false, (int) f11, (int) x4, (int) y10)) {
                                this.C = x4;
                                this.D = y10;
                                this.f4778y = true;
                                return false;
                            }
                        }
                        float f13 = this.B;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.f4777x = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.E;
                            float f15 = this.B;
                            if (i11 > 0) {
                                f10 = f14 + f15;
                            } else {
                                f10 = f14 - f15;
                            }
                            this.C = f10;
                            this.D = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.f4778y = true;
                        }
                        if (this.f4777x && q(x4)) {
                            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                            f0.d.k(this);
                        }
                    }
                }
            } else {
                float x10 = motionEvent.getX();
                this.E = x10;
                this.C = x10;
                float y11 = motionEvent.getY();
                this.F = y11;
                this.D = y11;
                this.G = motionEvent.getPointerId(0);
                this.f4778y = false;
                this.f4764k = true;
                this.f4763j.computeScrollOffset();
                if (this.W == 2 && Math.abs(this.f4763j.getFinalX() - this.f4763j.getCurrX()) > this.L) {
                    this.f4763j.abortAnimation();
                    this.f4775v = false;
                    r();
                    this.f4777x = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    e(false);
                    this.f4777x = false;
                }
            }
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.addMovement(motionEvent);
            return this.f4777x;
        }
        u();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        boolean z10;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.A = Math.min(measuredWidth / 10, this.f4779z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f4787a) {
                int i15 = gVar2.f4788b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                if (i17 != 48 && i17 != 80) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i16 != 3 && i16 != 5) {
                    z11 = false;
                }
                int i18 = SlideAtom.USES_MASTER_SLIDE_ID;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else if (z11) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 != -2) {
                    if (i20 == -1) {
                        i20 = measuredHeight;
                    }
                } else {
                    i20 = measuredHeight;
                    i14 = i12;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f4772s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f4773t = true;
        r();
        this.f4773t = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f4787a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.c), 1073741824), this.f4772s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f i14;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (i14 = i(childAt)) != null && i14.f4784b == this.f4759f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.f5506a);
        j2.a aVar = this.f4758e;
        ClassLoader classLoader = lVar.f4793e;
        if (aVar != null) {
            aVar.restoreState(lVar.f4792d, classLoader);
            x(lVar.c, 0, false, true);
            return;
        }
        this.f4760g = lVar.c;
        this.f4761h = lVar.f4792d;
        this.f4762i = classLoader;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.c = this.f4759f;
        j2.a aVar = this.f4758e;
        if (aVar != null) {
            lVar.f4792d = aVar.saveState();
        }
        return lVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f4766m;
            t(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        j2.a aVar;
        float f10;
        float f11;
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f4758e) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.H == null) {
            this.H = VelocityTracker.obtain();
        }
        this.H.addMovement(motionEvent);
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                n(motionEvent);
                                this.C = motionEvent.getX(motionEvent.findPointerIndex(this.G));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.C = motionEvent.getX(actionIndex);
                            this.G = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.f4777x) {
                        v(this.f4759f, 0, true, false);
                        z10 = u();
                    }
                } else {
                    if (!this.f4777x) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.G);
                        if (findPointerIndex == -1) {
                            z10 = u();
                        } else {
                            float x4 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x4 - this.C);
                            float y10 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y10 - this.D);
                            if (abs > this.B && abs > abs2) {
                                this.f4777x = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f12 = this.E;
                                if (x4 - f12 > 0.0f) {
                                    f11 = f12 + this.B;
                                } else {
                                    f11 = f12 - this.B;
                                }
                                this.C = f11;
                                this.D = y10;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f4777x) {
                        z10 = false | q(motionEvent.getX(motionEvent.findPointerIndex(this.G)));
                    }
                }
            } else if (this.f4777x) {
                VelocityTracker velocityTracker = this.H;
                velocityTracker.computeCurrentVelocity(1000, this.J);
                int xVelocity = (int) velocityTracker.getXVelocity(this.G);
                this.f4775v = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f j10 = j();
                float f13 = clientWidth;
                int i10 = j10.f4784b;
                float f14 = ((scrollX / f13) - j10.f4786e) / (j10.f4785d + (this.f4766m / f13));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.G)) - this.E)) > this.K && Math.abs(xVelocity) > this.I) {
                    if (xVelocity <= 0) {
                        i10++;
                    }
                } else {
                    if (i10 >= this.f4759f) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.6f;
                    }
                    i10 += (int) (f14 + f10);
                }
                ArrayList<f> arrayList = this.f4756b;
                if (arrayList.size() > 0) {
                    i10 = Math.max(arrayList.get(0).f4784b, Math.min(i10, arrayList.get(arrayList.size() - 1).f4784b));
                }
                x(i10, xVelocity, true, true);
                z10 = u();
            }
        } else {
            this.f4763j.abortAnimation();
            this.f4775v = false;
            r();
            float x10 = motionEvent.getX();
            this.E = x10;
            this.C = x10;
            float y11 = motionEvent.getY();
            this.F = y11;
            this.D = y11;
            this.G = motionEvent.getPointerId(0);
        }
        if (z10) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this);
        }
        return true;
    }

    public final boolean p(int i10) {
        if (this.f4756b.size() == 0) {
            if (this.O) {
                return false;
            }
            this.P = false;
            m(0, 0.0f, 0);
            if (this.P) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f j10 = j();
        int clientWidth = getClientWidth();
        int i11 = this.f4766m;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = j10.f4784b;
        float f11 = ((i10 / f10) - j10.f4786e) / (j10.f4785d + (i11 / f10));
        this.P = false;
        m(i13, f11, (int) (i12 * f11));
        if (this.P) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean q(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.C - f10;
        this.C = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f4770q * clientWidth;
        float f13 = this.f4771r * clientWidth;
        ArrayList<f> arrayList = this.f4756b;
        boolean z12 = false;
        f fVar = arrayList.get(0);
        f fVar2 = (f) androidx.appcompat.view.menu.d.b(arrayList, 1);
        if (fVar.f4784b != 0) {
            f12 = fVar.f4786e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f4784b != this.f4758e.getCount() - 1) {
            f13 = fVar2.f4786e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.M.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.N.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.C = (scrollX - i10) + this.C;
        scrollTo(i10, getScrollY());
        p(i10);
        return z12;
    }

    public final void r() {
        s(this.f4759f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f4773t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r6 == r7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r15) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.s(int):void");
    }

    public void setAdapter(j2.a aVar) {
        ArrayList<f> arrayList;
        j2.a aVar2 = this.f4758e;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.f4758e.startUpdate((ViewGroup) this);
            int i10 = 0;
            while (true) {
                arrayList = this.f4756b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                f fVar = arrayList.get(i10);
                this.f4758e.destroyItem((ViewGroup) this, fVar.f4784b, fVar.f4783a);
                i10++;
            }
            this.f4758e.finishUpdate((ViewGroup) this);
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((g) getChildAt(i11).getLayoutParams()).f4787a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f4759f = 0;
            scrollTo(0, 0);
        }
        j2.a aVar3 = this.f4758e;
        this.f4758e = aVar;
        this.f4755a = 0;
        if (aVar != null) {
            if (this.f4765l == null) {
                this.f4765l = new k();
            }
            this.f4758e.setViewPagerObserver(this.f4765l);
            this.f4775v = false;
            boolean z10 = this.O;
            this.O = true;
            this.f4755a = this.f4758e.getCount();
            if (this.f4760g >= 0) {
                this.f4758e.restoreState(this.f4761h, this.f4762i);
                x(this.f4760g, 0, false, true);
                this.f4760g = -1;
                this.f4761h = null;
                this.f4762i = null;
            } else if (!z10) {
                r();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.U;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = this.U.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((i) this.U.get(i12)).a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.f4775v = false;
        x(i10, 0, !this.O, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        if (i10 != this.f4776w) {
            this.f4776w = i10;
            r();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.S = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f4766m;
        this.f4766m = i10;
        int width = getWidth();
        t(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4767n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.W == i10) {
            return;
        }
        this.W = i10;
        j jVar = this.S;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i10);
        }
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) this.R.get(i11);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i10);
                }
            }
        }
        j jVar3 = this.T;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i10);
        }
    }

    public final void t(int i10, int i11, int i12, int i13) {
        float f10;
        if (i11 > 0 && !this.f4756b.isEmpty()) {
            if (!this.f4763j.isFinished()) {
                this.f4763j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
            return;
        }
        f k10 = k(this.f4759f);
        if (k10 != null) {
            f10 = Math.min(k10.f4786e, this.f4771r);
        } else {
            f10 = 0.0f;
        }
        int paddingLeft = (int) (f10 * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            e(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public final boolean u() {
        this.G = -1;
        this.f4777x = false;
        this.f4778y = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        this.M.onRelease();
        this.N.onRelease();
        if (!this.M.isFinished() && !this.N.isFinished()) {
            return false;
        }
        return true;
    }

    public final void v(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        int scrollX;
        int abs;
        f k10 = k(i10);
        if (k10 != null) {
            i12 = (int) (Math.max(this.f4770q, Math.min(k10.f4786e, this.f4771r)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f4763j;
                if (scroller != null && !scroller.isFinished()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (this.f4764k) {
                        scrollX = this.f4763j.getCurrX();
                    } else {
                        scrollX = this.f4763j.getStartX();
                    }
                    this.f4763j.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i13 = scrollX;
                int scrollY = getScrollY();
                int i14 = i12 - i13;
                int i15 = 0 - scrollY;
                if (i14 == 0 && i15 == 0) {
                    e(false);
                    r();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i16 = clientWidth / 2;
                    float f10 = clientWidth;
                    float f11 = i16;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                    int abs2 = Math.abs(i11);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        abs = (int) (((Math.abs(i14) / ((this.f4758e.getPageWidth(this.f4759f) * f10) + this.f4766m)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, (int) OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
                    this.f4764k = false;
                    this.f4763j.startScroll(i13, scrollY, i14, i15, min);
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.d.k(this);
                }
            }
            if (z11) {
                g(i10);
                return;
            }
            return;
        }
        if (z11) {
            g(i10);
        }
        e(false);
        scrollTo(i12, 0);
        p(i12);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f4767n) {
            return false;
        }
        return true;
    }

    public final void w(int i10, boolean z10) {
        this.f4775v = false;
        x(i10, 0, z10, false);
    }

    public final void x(int i10, int i11, boolean z10, boolean z11) {
        j2.a aVar = this.f4758e;
        boolean z12 = false;
        if (aVar != null && aVar.getCount() > 0) {
            ArrayList<f> arrayList = this.f4756b;
            if (!z11 && this.f4759f == i10 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f4758e.getCount()) {
                i10 = this.f4758e.getCount() - 1;
            }
            int i12 = this.f4776w;
            int i13 = this.f4759f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    arrayList.get(i14).c = true;
                }
            }
            if (this.f4759f != i10) {
                z12 = true;
            }
            if (this.O) {
                this.f4759f = i10;
                if (z12) {
                    g(i10);
                }
                requestLayout();
                return;
            }
            s(i10);
            v(i10, i11, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4787a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4788b;
        public float c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4789d;

        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4752a0);
            this.f4788b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(androidx.core.content.a.getDrawable(getContext(), i10));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4756b = new ArrayList<>();
        this.c = new f();
        this.f4757d = new Rect();
        this.f4760g = -1;
        this.f4761h = null;
        this.f4762i = null;
        this.f4770q = -3.4028235E38f;
        this.f4771r = Float.MAX_VALUE;
        this.f4776w = 1;
        this.G = -1;
        this.O = true;
        this.V = new c();
        this.W = 0;
        l();
    }
}

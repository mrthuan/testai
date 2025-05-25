package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import x0.q;
import x0.r;
import x0.s0;
import x0.t;
import x0.u;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {

    /* renamed from: t  reason: collision with root package name */
    public static final String f3462t;

    /* renamed from: u  reason: collision with root package name */
    public static final Class<?>[] f3463u;

    /* renamed from: v  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f3464v;

    /* renamed from: w  reason: collision with root package name */
    public static final i f3465w;

    /* renamed from: x  reason: collision with root package name */
    public static final w0.e f3466x;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3467a;

    /* renamed from: b  reason: collision with root package name */
    public final i0.a f3468b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f3469d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f3470e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3471f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3472g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3473h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f3474i;

    /* renamed from: j  reason: collision with root package name */
    public View f3475j;

    /* renamed from: k  reason: collision with root package name */
    public View f3476k;

    /* renamed from: l  reason: collision with root package name */
    public g f3477l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3478m;

    /* renamed from: n  reason: collision with root package name */
    public s0 f3479n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3480o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f3481p;

    /* renamed from: q  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f3482q;

    /* renamed from: r  reason: collision with root package name */
    public a f3483r;

    /* renamed from: s  reason: collision with root package name */
    public final t f3484s;

    /* loaded from: classes.dex */
    public class a implements u {
        public a() {
        }

        @Override // x0.u
        public final s0 m(View view, s0 s0Var) {
            boolean z10;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!w0.b.a(coordinatorLayout.f3479n, s0Var)) {
                coordinatorLayout.f3479n = s0Var;
                boolean z11 = true;
                if (s0Var.e() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                coordinatorLayout.f3480o = z10;
                coordinatorLayout.setWillNotDraw((z10 || coordinatorLayout.getBackground() != null) ? false : false);
                s0.k kVar = s0Var.f31498a;
                if (!kVar.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                        if (f0.d.b(childAt) && ((f) childAt.getLayoutParams()).f3487a != null && kVar.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return s0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean a(View view, Rect rect) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void f() {
        }

        public void c(f fVar) {
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void n(View view, Parcelable parcelable) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        }

        public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3482q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.t(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f3482q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.t(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends c1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public SparseArray<Parcelable> c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11;
            parcel.writeParcelable(this.f5506a, i10);
            SparseArray<Parcelable> sparseArray = this.c;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.c.keyAt(i12);
                parcelableArr[i12] = this.c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            float m10 = f0.i.m(view);
            float m11 = f0.i.m(view2);
            if (m10 > m11) {
                return -1;
            }
            if (m10 < m11) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f3462t = str;
        f3465w = new i();
        f3463u = new Class[]{Context.class, AttributeSet.class};
        f3464v = new ThreadLocal<>();
        f3466x = new w0.e(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public static void A(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f3495j;
        if (i11 != i10) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            view.offsetTopAndBottom(i10 - i11);
            fVar.f3495j = i10;
        }
    }

    public static Rect e() {
        Rect rect = (Rect) f3466x.b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void q(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int width;
        int height;
        int i13 = fVar.c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = fVar.f3489d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            if (i17 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            if (i18 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i15 != 1) {
            if (i15 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    public static f r(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f3488b) {
            if (view instanceof b) {
                fVar.b(((b) view).getBehavior());
                fVar.f3488b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        dVar.value().getClass();
                    }
                }
                fVar.f3488b = true;
            }
        }
        return fVar;
    }

    public static void z(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f3494i;
        if (i11 != i10) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            view.offsetLeftAndRight(i10 - i11);
            fVar.f3494i = i10;
        }
    }

    public final void B() {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.d.b(this)) {
            if (this.f3483r == null) {
                this.f3483r = new a();
            }
            f0.i.u(this, this.f3483r);
            setSystemUiVisibility(1280);
            return;
        }
        f0.i.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c cVar = ((f) view.getLayoutParams()).f3487a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3481p;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void f(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final void g(View view) {
        List list = (List) ((y.i) this.f3468b.f18403b).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                c cVar = ((f) view2.getLayoutParams()).f3487a;
                if (cVar != null) {
                    cVar.d(this, view2, view);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        x();
        return Collections.unmodifiableList(this.f3467a);
    }

    public final s0 getLastWindowInsets() {
        return this.f3479n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t tVar = this.f3484s;
        return tVar.f31526b | tVar.f31525a;
    }

    public Drawable getStatusBarBackground() {
        return this.f3481p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(View view, Rect rect, boolean z10) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                p(rect, view);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList i(View view) {
        i0.a aVar = this.f3468b;
        int i10 = ((y.i) aVar.f18403b).c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((y.i) aVar.f18403b).l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((y.i) aVar.f18403b).h(i11));
            }
        }
        ArrayList arrayList3 = this.f3469d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // x0.r
    public final void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f3487a) != null) {
                    int[] iArr2 = this.f3470e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i11, i12, i13, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, iArr2[0]);
                    } else {
                        min = Math.min(i15, iArr2[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, iArr2[1]);
                    } else {
                        min2 = Math.min(i16, iArr2[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            t(1);
        }
    }

    @Override // x0.q
    public final void k(View view, int i10, int i11, int i12, int i13, int i14) {
        j(view, i10, i11, i12, i13, 0, this.f3471f);
    }

    @Override // x0.q
    public final boolean l(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f3487a;
                if (cVar != null) {
                    boolean p10 = cVar.p(this, childAt, view, view2, i10, i11);
                    z10 |= p10;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            fVar.f3500o = p10;
                        }
                    } else {
                        fVar.f3499n = p10;
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        fVar.f3500o = false;
                    }
                } else {
                    fVar.f3499n = false;
                }
            }
        }
        return z10;
    }

    @Override // x0.q
    public final void m(View view, View view2, int i10, int i11) {
        this.f3484s.a(i10, i11);
        this.f3476k = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // x0.q
    public final void n(View view, int i10) {
        t tVar = this.f3484s;
        if (i10 == 1) {
            tVar.f31526b = 0;
        } else {
            tVar.f31525a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f3487a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        fVar.f3500o = false;
                    }
                } else {
                    fVar.f3499n = false;
                }
                fVar.f3501p = false;
            }
        }
        this.f3476k = null;
    }

    @Override // x0.q
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f3487a) != null) {
                    int[] iArr2 = this.f3470e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f3470e;
                    if (i10 > 0) {
                        min = Math.max(i13, iArr3[0]);
                    } else {
                        min = Math.min(i13, iArr3[0]);
                    }
                    i13 = min;
                    if (i11 > 0) {
                        min2 = Math.max(i14, iArr3[1]);
                    } else {
                        min2 = Math.min(i14, iArr3[1]);
                    }
                    i14 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            t(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y(false);
        if (this.f3478m) {
            if (this.f3477l == null) {
                this.f3477l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3477l);
        }
        if (this.f3479n == null) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.d.b(this)) {
                f0.h.c(this);
            }
        }
        this.f3473h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y(false);
        if (this.f3478m && this.f3477l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3477l);
        }
        View view = this.f3476k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3473h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f3480o && this.f3481p != null) {
            s0 s0Var = this.f3479n;
            if (s0Var != null) {
                i10 = s0Var.e();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f3481p.setBounds(0, 0, getWidth(), i10);
                this.f3481p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y(true);
        }
        boolean w7 = w(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            y(true);
        }
        return w7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int d10 = f0.e.d(this);
        ArrayList arrayList = this.f3467a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f3487a) == null || !cVar.h(this, view, d10))) {
                u(view, d10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ab, code lost:
        if (r0.i(r32, r19, r25, r20, r26) == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f3487a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f3487a) != null) {
                    z10 |= cVar.j(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        k(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f5506a);
        SparseArray<Parcelable> sparseArray = hVar.c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = r(childAt).f3487a;
            if (id2 != -1 && cVar != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f3487a;
            if (id2 != -1 && cVar != null && (o10 = cVar.o(childAt)) != null) {
                sparseArray.append(id2, o10);
            }
        }
        hVar.c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3475j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.w(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f3475j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f3487a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f3475j
            boolean r6 = r6.r(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f3475j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.y(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(Rect rect, View view) {
        ThreadLocal<Matrix> threadLocal = i0.b.f18405a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = i0.b.f18405a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        i0.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = i0.b.f18406b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f3487a;
        if (cVar != null && cVar.m(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f3472g) {
            y(false);
            this.f3472g = true;
        }
    }

    public final boolean s(View view, int i10, int i11) {
        w0.e eVar = f3466x;
        Rect e10 = e();
        p(e10, view);
        try {
            return e10.contains(i10, i11);
        } finally {
            e10.setEmpty();
            eVar.a(e10);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        B();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3482q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f3481p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f3481p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f3481p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f3481p;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                a.c.b(drawable4, f0.e.d(this));
                Drawable drawable5 = this.f3481p;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f3481p.setCallback(this);
            }
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            f0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = androidx.core.content.a.getDrawable(getContext(), i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f3481p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f3481p.setVisible(z10, false);
        }
    }

    public final void t(int i10) {
        int i11;
        Rect rect;
        int i12;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        f fVar;
        ArrayList arrayList2;
        int i20;
        Rect rect2;
        int i21;
        View view;
        w0.e eVar;
        f fVar2;
        int i22;
        boolean z14;
        c cVar;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int d10 = f0.e.d(this);
        ArrayList arrayList3 = this.f3467a;
        int size = arrayList3.size();
        Rect e10 = e();
        Rect e11 = e();
        Rect e12 = e();
        int i23 = i10;
        int i24 = 0;
        while (true) {
            w0.e eVar2 = f3466x;
            if (i24 < size) {
                View view2 = (View) arrayList3.get(i24);
                f fVar3 = (f) view2.getLayoutParams();
                if (i23 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i12 = size;
                    rect = e12;
                    i11 = i24;
                } else {
                    int i25 = 0;
                    while (i25 < i24) {
                        if (fVar3.f3497l == ((View) arrayList3.get(i25))) {
                            f fVar4 = (f) view2.getLayoutParams();
                            if (fVar4.f3496k != null) {
                                Rect e13 = e();
                                Rect e14 = e();
                                arrayList2 = arrayList3;
                                Rect e15 = e();
                                i19 = i25;
                                p(e13, fVar4.f3496k);
                                h(view2, e14, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i20 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i21 = i24;
                                fVar = fVar3;
                                view = view2;
                                rect2 = e12;
                                eVar = eVar2;
                                q(d10, e13, e15, fVar4, measuredWidth, measuredHeight);
                                if (e15.left == e14.left && e15.top == e14.top) {
                                    fVar2 = fVar4;
                                    i22 = measuredWidth;
                                    z14 = false;
                                } else {
                                    fVar2 = fVar4;
                                    i22 = measuredWidth;
                                    z14 = true;
                                }
                                f(fVar2, e15, i22, measuredHeight);
                                int i26 = e15.left - e14.left;
                                int i27 = e15.top - e14.top;
                                if (i26 != 0) {
                                    WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                                    view.offsetLeftAndRight(i26);
                                }
                                if (i27 != 0) {
                                    WeakHashMap<View, n0> weakHashMap3 = f0.f31435a;
                                    view.offsetTopAndBottom(i27);
                                }
                                if (z14 && (cVar = fVar2.f3487a) != null) {
                                    cVar.d(this, view, fVar2.f3496k);
                                }
                                e13.setEmpty();
                                eVar.a(e13);
                                e14.setEmpty();
                                eVar.a(e14);
                                e15.setEmpty();
                                eVar.a(e15);
                                i25 = i19 + 1;
                                eVar2 = eVar;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i20;
                                i24 = i21;
                                fVar3 = fVar;
                                e12 = rect2;
                            }
                        }
                        i19 = i25;
                        fVar = fVar3;
                        arrayList2 = arrayList3;
                        i20 = size;
                        rect2 = e12;
                        i21 = i24;
                        view = view2;
                        eVar = eVar2;
                        i25 = i19 + 1;
                        eVar2 = eVar;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i20;
                        i24 = i21;
                        fVar3 = fVar;
                        e12 = rect2;
                    }
                    f fVar5 = fVar3;
                    ArrayList arrayList4 = arrayList3;
                    int i28 = size;
                    Rect rect3 = e12;
                    i11 = i24;
                    View view3 = view2;
                    w0.e eVar3 = eVar2;
                    h(view3, e11, true);
                    if (fVar5.f3492g != 0 && !e11.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(fVar5.f3492g, d10);
                        int i29 = absoluteGravity & 112;
                        if (i29 != 48) {
                            if (i29 == 80) {
                                e10.bottom = Math.max(e10.bottom, getHeight() - e11.top);
                            }
                        } else {
                            e10.top = Math.max(e10.top, e11.bottom);
                        }
                        int i30 = absoluteGravity & 7;
                        if (i30 != 3) {
                            if (i30 == 5) {
                                e10.right = Math.max(e10.right, getWidth() - e11.left);
                            }
                        } else {
                            e10.left = Math.max(e10.left, e11.right);
                        }
                    }
                    if (fVar5.f3493h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap<View, n0> weakHashMap4 = f0.f31435a;
                        if (f0.g.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            f fVar6 = (f) view3.getLayoutParams();
                            c cVar2 = fVar6.f3487a;
                            Rect e16 = e();
                            Rect e17 = e();
                            e17.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (cVar2 != null && cVar2.a(view3, e16)) {
                                if (!e17.contains(e16)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e16.toShortString() + " | Bounds:" + e17.toShortString());
                                }
                            } else {
                                e16.set(e17);
                            }
                            e17.setEmpty();
                            eVar3.a(e17);
                            if (e16.isEmpty()) {
                                e16.setEmpty();
                                eVar3.a(e16);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar6.f3493h, d10);
                                if ((absoluteGravity2 & 48) == 48 && (i17 = (e16.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.f3495j) < (i18 = e10.top)) {
                                    A(view3, i18 - i17);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - e16.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.f3495j) < (i16 = e10.bottom)) {
                                    A(view3, height - i16);
                                    z11 = true;
                                }
                                if (!z11) {
                                    A(view3, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i14 = (e16.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.f3494i) < (i15 = e10.left)) {
                                    z(view3, i15 - i14);
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - e16.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.f3494i) < (i13 = e10.right)) {
                                    z(view3, width - i13);
                                    z13 = true;
                                } else {
                                    z13 = z12;
                                }
                                if (!z13) {
                                    z(view3, 0);
                                }
                                e16.setEmpty();
                                eVar3.a(e16);
                            }
                        }
                    }
                    if (i10 != 2) {
                        rect = rect3;
                        rect.set(((f) view3.getLayoutParams()).f3502q);
                        if (rect.equals(e11)) {
                            arrayList = arrayList4;
                            i12 = i28;
                            i23 = i10;
                        } else {
                            ((f) view3.getLayoutParams()).f3502q.set(e11);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i31 = i11 + 1;
                    i12 = i28;
                    while (true) {
                        arrayList = arrayList4;
                        if (i31 >= i12) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i31);
                        f fVar7 = (f) view4.getLayoutParams();
                        c cVar3 = fVar7.f3487a;
                        if (cVar3 != null && cVar3.b(view4, view3)) {
                            if (i10 == 0 && fVar7.f3501p) {
                                fVar7.f3501p = false;
                            } else {
                                if (i10 != 2) {
                                    z10 = cVar3.d(this, view4, view3);
                                } else {
                                    cVar3.e(this, view3);
                                    z10 = true;
                                }
                                if (i10 == 1) {
                                    fVar7.f3501p = z10;
                                }
                            }
                        }
                        i31++;
                        arrayList4 = arrayList;
                    }
                    i23 = i10;
                }
                i24 = i11 + 1;
                e12 = rect;
                size = i12;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = e12;
                e10.setEmpty();
                eVar2.a(e10);
                e11.setEmpty();
                eVar2.a(e11);
                rect4.setEmpty();
                eVar2.a(rect4);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u(android.view.View, int):void");
    }

    public final void v(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f3481p) {
            return false;
        }
        return true;
    }

    public final boolean w(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            arrayList.add(getChildAt(i11));
        }
        i iVar = f3465w;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f3487a;
            if ((z11 || z12) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            cVar.r(this, view, motionEvent2);
                        }
                    } else {
                        cVar.g(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z11 && cVar != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z11 = cVar.r(this, view, motionEvent);
                        }
                    } else {
                        z11 = cVar.g(this, view, motionEvent);
                    }
                    if (z11) {
                        this.f3475j = view;
                    }
                }
                if (fVar.f3487a == null) {
                    fVar.f3498m = false;
                }
                boolean z13 = fVar.f3498m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.f3498m = z10;
                }
                if (z10 && !z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && !z12) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r10 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.x():void");
    }

    public final void y(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f3487a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).f3498m = false;
        }
        this.f3475j = null;
        this.f3472g = false;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
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

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes;
        this.f3467a = new ArrayList();
        this.f3468b = new i0.a(0);
        this.c = new ArrayList();
        this.f3469d = new ArrayList();
        this.f3470e = new int[2];
        this.f3471f = new int[2];
        this.f3484s = new t();
        int[] iArr = h0.a.f17945a;
        if (i10 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, com.google.ads.mediation.pangle.R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, com.google.ads.mediation.pangle.R.style.Widget_Support_CoordinatorLayout);
            } else {
                com.google.android.gms.internal.ads.f.l(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f3474i = intArray;
            float f10 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr2 = this.f3474i;
                iArr2[i11] = (int) (iArr2[i11] * f10);
            }
        }
        this.f3481p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        B();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.d.c(this) == 0) {
            f0.d.s(this, 1);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f3487a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3488b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3489d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3490e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3491f;

        /* renamed from: g  reason: collision with root package name */
        public int f3492g;

        /* renamed from: h  reason: collision with root package name */
        public int f3493h;

        /* renamed from: i  reason: collision with root package name */
        public int f3494i;

        /* renamed from: j  reason: collision with root package name */
        public int f3495j;

        /* renamed from: k  reason: collision with root package name */
        public View f3496k;

        /* renamed from: l  reason: collision with root package name */
        public View f3497l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3498m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f3499n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3500o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f3501p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f3502q;

        public f() {
            super(-2, -2);
            this.f3488b = false;
            this.c = 0;
            this.f3489d = 0;
            this.f3490e = -1;
            this.f3491f = -1;
            this.f3492g = 0;
            this.f3493h = 0;
            this.f3502q = new Rect();
        }

        public final boolean a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f3500o;
            }
            return this.f3499n;
        }

        public final void b(c cVar) {
            c cVar2 = this.f3487a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f3487a = cVar;
                this.f3488b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.f3488b = false;
            this.c = 0;
            this.f3489d = 0;
            this.f3490e = -1;
            this.f3491f = -1;
            this.f3492g = 0;
            this.f3493h = 0;
            this.f3502q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.a.f17946b);
            this.c = obtainStyledAttributes.getInteger(0, 0);
            this.f3491f = obtainStyledAttributes.getResourceId(1, -1);
            this.f3489d = obtainStyledAttributes.getInteger(2, 0);
            this.f3490e = obtainStyledAttributes.getInteger(6, -1);
            this.f3492g = obtainStyledAttributes.getInt(5, 0);
            this.f3493h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f3488b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f3462t;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f3462t;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f3464v;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f3463u);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(a0.a.h("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f3487a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f3487a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f3488b = false;
            this.c = 0;
            this.f3489d = 0;
            this.f3490e = -1;
            this.f3491f = -1;
            this.f3492g = 0;
            this.f3493h = 0;
            this.f3502q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3488b = false;
            this.c = 0;
            this.f3489d = 0;
            this.f3490e = -1;
            this.f3491f = -1;
            this.f3492g = 0;
            this.f3493h = 0;
            this.f3502q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3488b = false;
            this.c = 0;
            this.f3489d = 0;
            this.f3490e = -1;
            this.f3491f = -1;
            this.f3492g = 0;
            this.f3493h = 0;
            this.f3502q = new Rect();
        }
    }
}

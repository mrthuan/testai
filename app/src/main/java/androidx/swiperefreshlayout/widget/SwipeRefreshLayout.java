package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import b1.i;
import d2.d;
import d2.g;
import java.util.WeakHashMap;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import x0.f0;
import x0.n0;
import x0.o;
import x0.p;
import x0.s;
import x0.t;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements s, o {
    public static final int[] H = {16842766};
    public g A;
    public g B;
    public boolean C;
    public int D;
    public final a E;
    public final c F;
    public final d G;

    /* renamed from: a  reason: collision with root package name */
    public View f4692a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4693b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public float f4694d;

    /* renamed from: e  reason: collision with root package name */
    public float f4695e;

    /* renamed from: f  reason: collision with root package name */
    public final t f4696f;

    /* renamed from: g  reason: collision with root package name */
    public final p f4697g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f4698h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f4699i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4700j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4701k;

    /* renamed from: l  reason: collision with root package name */
    public int f4702l;

    /* renamed from: m  reason: collision with root package name */
    public float f4703m;

    /* renamed from: n  reason: collision with root package name */
    public float f4704n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4705o;

    /* renamed from: p  reason: collision with root package name */
    public int f4706p;

    /* renamed from: q  reason: collision with root package name */
    public final DecelerateInterpolator f4707q;

    /* renamed from: r  reason: collision with root package name */
    public d2.a f4708r;

    /* renamed from: s  reason: collision with root package name */
    public int f4709s;

    /* renamed from: t  reason: collision with root package name */
    public int f4710t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4711u;

    /* renamed from: v  reason: collision with root package name */
    public final int f4712v;

    /* renamed from: w  reason: collision with root package name */
    public int f4713w;

    /* renamed from: x  reason: collision with root package name */
    public d2.d f4714x;

    /* renamed from: y  reason: collision with root package name */
    public d2.e f4715y;

    /* renamed from: z  reason: collision with root package name */
    public d2.f f4716z;

    /* loaded from: classes.dex */
    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            int abs = swipeRefreshLayout.f4712v - Math.abs(swipeRefreshLayout.f4711u);
            int i10 = swipeRefreshLayout.f4710t;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((i10 + ((int) ((abs - i10) * f10))) - swipeRefreshLayout.f4708r.getTop());
            d2.d dVar = swipeRefreshLayout.f4714x;
            float f11 = 1.0f - f10;
            d.a aVar = dVar.f16083a;
            if (f11 != aVar.f16102p) {
                aVar.f16102p = f11;
            }
            dVar.invalidateSelf();
        }
    }

    /* loaded from: classes.dex */
    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.e(f10);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i10) {
        this.f4708r.getBackground().setAlpha(i10);
        this.f4714x.setAlpha(i10);
    }

    public final boolean a() {
        View view = this.f4692a;
        if (view instanceof ListView) {
            return i.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f4692a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f4708r)) {
                    this.f4692a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        if (f10 > this.f4694d) {
            g(true, true);
            return;
        }
        this.f4693b = false;
        d2.d dVar = this.f4714x;
        d.a aVar = dVar.f16083a;
        aVar.f16091e = 0.0f;
        aVar.f16092f = 0.0f;
        dVar.invalidateSelf();
        b bVar = new b();
        this.f4710t = this.f4702l;
        d dVar2 = this.G;
        dVar2.reset();
        dVar2.setDuration(200L);
        dVar2.setInterpolator(this.f4707q);
        d2.a aVar2 = this.f4708r;
        aVar2.f16075a = bVar;
        aVar2.clearAnimation();
        this.f4708r.startAnimation(dVar2);
        d2.d dVar3 = this.f4714x;
        d.a aVar3 = dVar3.f16083a;
        if (aVar3.f16100n) {
            aVar3.f16100n = false;
        }
        dVar3.invalidateSelf();
    }

    public final void d(float f10) {
        d2.d dVar = this.f4714x;
        d.a aVar = dVar.f16083a;
        boolean z10 = true;
        if (!aVar.f16100n) {
            aVar.f16100n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f10 / this.f4694d));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f4694d;
        int i10 = this.f4713w;
        if (i10 <= 0) {
            i10 = this.f4712v;
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f4711u + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f4708r.getVisibility() != 0) {
            this.f4708r.setVisibility(0);
        }
        this.f4708r.setScaleX(1.0f);
        this.f4708r.setScaleY(1.0f);
        if (f10 < this.f4694d) {
            if (this.f4714x.f16083a.f16106t > 76) {
                g gVar = this.A;
                if (gVar == null || !gVar.hasStarted() || gVar.hasEnded()) {
                    z10 = false;
                }
                if (!z10) {
                    g gVar2 = new g(this, this.f4714x.f16083a.f16106t, 76);
                    gVar2.setDuration(300L);
                    d2.a aVar2 = this.f4708r;
                    aVar2.f16075a = null;
                    aVar2.clearAnimation();
                    this.f4708r.startAnimation(gVar2);
                    this.A = gVar2;
                }
            }
        } else if (this.f4714x.f16083a.f16106t < 255) {
            g gVar3 = this.B;
            if (gVar3 == null || !gVar3.hasStarted() || gVar3.hasEnded()) {
                z10 = false;
            }
            if (!z10) {
                g gVar4 = new g(this, this.f4714x.f16083a.f16106t, FunctionEval.FunctionID.EXTERNAL_FUNC);
                gVar4.setDuration(300L);
                d2.a aVar3 = this.f4708r;
                aVar3.f16075a = null;
                aVar3.clearAnimation();
                this.f4708r.startAnimation(gVar4);
                this.B = gVar4;
            }
        }
        d2.d dVar2 = this.f4714x;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar4 = dVar2.f16083a;
        aVar4.f16091e = 0.0f;
        aVar4.f16092f = min2;
        dVar2.invalidateSelf();
        d2.d dVar3 = this.f4714x;
        float min3 = Math.min(1.0f, max);
        d.a aVar5 = dVar3.f16083a;
        if (min3 != aVar5.f16102p) {
            aVar5.f16102p = min3;
        }
        dVar3.invalidateSelf();
        d2.d dVar4 = this.f4714x;
        dVar4.f16083a.f16093g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.f4702l);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f4697g.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f4697g.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f4697g.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f4697g.e(i10, i11, i12, i13, iArr);
    }

    public final void e(float f10) {
        int i10 = this.f4710t;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f4711u - i10) * f10))) - this.f4708r.getTop());
    }

    public final void f() {
        this.f4708r.clearAnimation();
        this.f4714x.stop();
        this.f4708r.setVisibility(8);
        setColorViewAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
        setTargetOffsetTopAndBottom(this.f4711u - this.f4702l);
        this.f4702l = this.f4708r.getTop();
    }

    public final void g(boolean z10, boolean z11) {
        if (this.f4693b != z10) {
            this.C = z11;
            b();
            this.f4693b = z10;
            a aVar = this.E;
            if (z10) {
                this.f4710t = this.f4702l;
                c cVar = this.F;
                cVar.reset();
                cVar.setDuration(200L);
                cVar.setInterpolator(this.f4707q);
                if (aVar != null) {
                    this.f4708r.f16075a = aVar;
                }
                this.f4708r.clearAnimation();
                this.f4708r.startAnimation(cVar);
                return;
            }
            d2.f fVar = new d2.f(this);
            this.f4716z = fVar;
            fVar.setDuration(150L);
            d2.a aVar2 = this.f4708r;
            aVar2.f16075a = aVar;
            aVar2.clearAnimation();
            this.f4708r.startAnimation(this.f4716z);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f4709s;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        if (i11 >= i12) {
            return i11 + 1;
        }
        return i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        t tVar = this.f4696f;
        return tVar.f31526b | tVar.f31525a;
    }

    public int getProgressCircleDiameter() {
        return this.D;
    }

    public int getProgressViewEndOffset() {
        return this.f4712v;
    }

    public int getProgressViewStartOffset() {
        return this.f4711u;
    }

    public final void h(float f10) {
        float f11 = this.f4704n;
        int i10 = this.c;
        if (f10 - f11 > i10 && !this.f4705o) {
            this.f4703m = f11 + i10;
            this.f4705o = true;
            this.f4714x.setAlpha(76);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.f4697g.g(0) == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4697g.f31472d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        b();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || a() || this.f4693b || this.f4700j) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f4706p) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                this.f4706p = motionEvent.getPointerId(i10);
                            }
                        }
                    }
                } else {
                    int i11 = this.f4706p;
                    if (i11 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i11)) < 0) {
                        return false;
                    }
                    h(motionEvent.getY(findPointerIndex));
                }
            }
            this.f4705o = false;
            this.f4706p = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f4711u - this.f4708r.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f4706p = pointerId;
            this.f4705o = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f4704n = motionEvent.getY(findPointerIndex2);
        }
        return this.f4705o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4692a == null) {
            b();
        }
        View view = this.f4692a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4708r.getMeasuredWidth();
        int measuredHeight2 = this.f4708r.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f4702l;
        this.f4708r.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f4692a == null) {
            b();
        }
        View view = this.f4692a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4708r.measure(View.MeasureSpec.makeMeasureSpec(this.D, 1073741824), View.MeasureSpec.makeMeasureSpec(this.D, 1073741824));
        this.f4709s = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f4708r) {
                this.f4709s = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f4695e;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f4695e = 0.0f;
                } else {
                    this.f4695e = f10 - f11;
                    iArr[1] = i11;
                }
                d(this.f4695e);
            }
        }
        int[] iArr2 = this.f4698h;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f4699i);
        int i14 = i13 + this.f4699i[1];
        if (i14 < 0 && !a()) {
            float abs = this.f4695e + Math.abs(i14);
            this.f4695e = abs;
            d(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f4696f.a(i10, 0);
        startNestedScroll(i10 & 2);
        this.f4695e = 0.0f;
        this.f4700j = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (isEnabled() && !this.f4693b && (i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f4696f.f31525a = 0;
        this.f4700j = false;
        float f10 = this.f4695e;
        if (f10 > 0.0f) {
            c(f10);
            this.f4695e = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || a() || this.f4693b || this.f4700j) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f4706p) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                this.f4706p = motionEvent.getPointerId(i10);
                            }
                        }
                    } else {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (actionIndex2 < 0) {
                            return false;
                        }
                        this.f4706p = motionEvent.getPointerId(actionIndex2);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4706p);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    float y10 = motionEvent.getY(findPointerIndex);
                    h(y10);
                    if (this.f4705o) {
                        float f10 = (y10 - this.f4703m) * 0.5f;
                        if (f10 <= 0.0f) {
                            return false;
                        }
                        d(f10);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f4706p);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                if (this.f4705o) {
                    this.f4705o = false;
                    c((motionEvent.getY(findPointerIndex2) - this.f4703m) * 0.5f);
                }
                this.f4706p = -1;
                return false;
            }
        } else {
            this.f4706p = motionEvent.getPointerId(0);
            this.f4705o = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f4692a;
        if (view != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (!f0.i.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f10) {
        this.f4708r.setScaleX(f10);
        this.f4708r.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        d2.d dVar = this.f4714x;
        d.a aVar = dVar.f16083a;
        aVar.f16095i = iArr;
        aVar.a(0);
        aVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.a.getColor(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f4694d = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            f();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f4697g.h(z10);
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f4708r.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.getColor(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (z10 && this.f4693b != z10) {
            this.f4693b = z10;
            setTargetOffsetTopAndBottom((this.f4712v + this.f4711u) - this.f4702l);
            this.C = false;
            this.f4708r.setVisibility(0);
            this.f4714x.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
            d2.e eVar = new d2.e(this);
            this.f4715y = eVar;
            eVar.setDuration(this.f4701k);
            a aVar = this.E;
            if (aVar != null) {
                this.f4708r.f16075a = aVar;
            }
            this.f4708r.clearAnimation();
            this.f4708r.startAnimation(this.f4715y);
            return;
        }
        g(z10, false);
    }

    public void setSize(int i10) {
        if (i10 != 0 && i10 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i10 == 0) {
            this.D = (int) (displayMetrics.density * 56.0f);
        } else {
            this.D = (int) (displayMetrics.density * 40.0f);
        }
        this.f4708r.setImageDrawable(null);
        this.f4714x.c(i10);
        this.f4708r.setImageDrawable(this.f4714x);
    }

    public void setSlingshotDistance(int i10) {
        this.f4713w = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f4708r.bringToFront();
        d2.a aVar = this.f4708r;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        aVar.offsetTopAndBottom(i10);
        this.f4702l = this.f4708r.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f4697g.i(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f4697g.j(0);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4693b = false;
        this.f4694d = -1.0f;
        this.f4698h = new int[2];
        this.f4699i = new int[2];
        this.f4706p = -1;
        this.f4709s = -1;
        this.E = new a();
        this.F = new c();
        this.G = new d();
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4701k = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f4707q = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.D = (int) (displayMetrics.density * 40.0f);
        this.f4708r = new d2.a(getContext());
        d2.d dVar = new d2.d(getContext());
        this.f4714x = dVar;
        dVar.c(1);
        this.f4708r.setImageDrawable(this.f4714x);
        this.f4708r.setVisibility(8);
        addView(this.f4708r);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f4712v = i10;
        this.f4694d = i10;
        this.f4696f = new t();
        this.f4697g = new p(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.D;
        this.f4702l = i11;
        this.f4711u = i11;
        e(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4693b) {
                swipeRefreshLayout.f4714x.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
                swipeRefreshLayout.f4714x.start();
                if (swipeRefreshLayout.C) {
                    swipeRefreshLayout.getClass();
                }
                swipeRefreshLayout.f4702l = swipeRefreshLayout.f4708r.getTop();
                return;
            }
            swipeRefreshLayout.f();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            d2.f fVar = new d2.f(swipeRefreshLayout);
            swipeRefreshLayout.f4716z = fVar;
            fVar.setDuration(150L);
            d2.a aVar = swipeRefreshLayout.f4708r;
            aVar.f16075a = null;
            aVar.clearAnimation();
            swipeRefreshLayout.f4708r.startAnimation(swipeRefreshLayout.f4716z);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }

    public void setOnRefreshListener(f fVar) {
    }
}

package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import d1.c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f4665a;

    /* renamed from: b  reason: collision with root package name */
    public int f4666b;
    public Drawable c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f4667d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4668e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4669f;

    /* renamed from: g  reason: collision with root package name */
    public View f4670g;

    /* renamed from: h  reason: collision with root package name */
    public float f4671h;

    /* renamed from: i  reason: collision with root package name */
    public float f4672i;

    /* renamed from: j  reason: collision with root package name */
    public int f4673j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4674k;

    /* renamed from: l  reason: collision with root package name */
    public int f4675l;

    /* renamed from: m  reason: collision with root package name */
    public float f4676m;

    /* renamed from: n  reason: collision with root package name */
    public float f4677n;

    /* renamed from: o  reason: collision with root package name */
    public final d1.c f4678o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4679p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4680q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f4681r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList<b> f4682s;

    /* loaded from: classes.dex */
    public class a extends x0.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f4683d = new Rect();

        public a() {
        }

        @Override // x0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // x0.a
        public final void d(View view, y0.f fVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            this.f31416a.onInitializeAccessibilityNodeInfo(view, obtain);
            Rect rect = this.f4683d;
            obtain.getBoundsInParent(rect);
            fVar.g(rect);
            obtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(obtain.getPackageName());
            fVar.h(obtain.getClassName());
            fVar.j(obtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(obtain.isEnabled());
            accessibilityNodeInfo.setClickable(obtain.isClickable());
            accessibilityNodeInfo.setFocusable(obtain.isFocusable());
            accessibilityNodeInfo.setFocused(obtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(obtain.isSelected());
            accessibilityNodeInfo.setLongClickable(obtain.isLongClickable());
            fVar.a(obtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities());
            obtain.recycle();
            fVar.h(SlidingPaneLayout.class.getName());
            fVar.c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            ViewParent f10 = f0.d.f(view);
            if (f10 instanceof View) {
                fVar.f31952b = -1;
                accessibilityNodeInfo.setParent((View) f10);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = slidingPaneLayout.getChildAt(i10);
                if (!slidingPaneLayout.b(childAt) && childAt.getVisibility() == 0) {
                    f0.d.s(childAt, 1);
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }

        @Override // x0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!SlidingPaneLayout.this.b(view)) {
                return super.f(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final View f4685a;

        public b(View view) {
            this.f4685a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f4685a;
            ViewParent parent = view.getParent();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (parent == slidingPaneLayout) {
                view.setLayerType(0, null);
                slidingPaneLayout.getClass();
                Paint paint = ((d) view.getLayoutParams()).f4691d;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.e.i(view, paint);
            }
            slidingPaneLayout.f4682s.remove(this);
        }
    }

    /* loaded from: classes.dex */
    public class c extends c.AbstractC0191c {
        public c() {
        }

        @Override // d1.c.AbstractC0191c
        public final int a(View view, int i10) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            d dVar = (d) slidingPaneLayout.f4670g.getLayoutParams();
            if (slidingPaneLayout.c()) {
                int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f4670g.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin));
                return Math.max(Math.min(i10, width), width - slidingPaneLayout.f4673j);
            }
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            return Math.min(Math.max(i10, paddingLeft), slidingPaneLayout.f4673j + paddingLeft);
        }

        @Override // d1.c.AbstractC0191c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // d1.c.AbstractC0191c
        public final int c(View view) {
            return SlidingPaneLayout.this.f4673j;
        }

        @Override // d1.c.AbstractC0191c
        public final void e(int i10, int i11) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f4678o.c(slidingPaneLayout.f4670g, i11);
        }

        @Override // d1.c.AbstractC0191c
        public final void g(View view, int i10) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = slidingPaneLayout.getChildAt(i11);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // d1.c.AbstractC0191c
        public final void h(int i10) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f4678o.f16052a == 0) {
                if (slidingPaneLayout.f4671h == 0.0f) {
                    slidingPaneLayout.f(slidingPaneLayout.f4670g);
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.f4679p = false;
                    return;
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.f4679p = true;
            }
        }

        @Override // d1.c.AbstractC0191c
        public final void i(View view, int i10, int i11) {
            int paddingLeft;
            int i12;
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f4670g == null) {
                slidingPaneLayout.f4671h = 0.0f;
            } else {
                boolean c = slidingPaneLayout.c();
                d dVar = (d) slidingPaneLayout.f4670g.getLayoutParams();
                int width = slidingPaneLayout.f4670g.getWidth();
                if (c) {
                    i10 = (slidingPaneLayout.getWidth() - i10) - width;
                }
                if (c) {
                    paddingLeft = slidingPaneLayout.getPaddingRight();
                } else {
                    paddingLeft = slidingPaneLayout.getPaddingLeft();
                }
                if (c) {
                    i12 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                } else {
                    i12 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                }
                float f10 = (i10 - (paddingLeft + i12)) / slidingPaneLayout.f4673j;
                slidingPaneLayout.f4671h = f10;
                if (slidingPaneLayout.f4675l != 0) {
                    slidingPaneLayout.d(f10);
                }
                if (dVar.c) {
                    slidingPaneLayout.a(slidingPaneLayout.f4671h, slidingPaneLayout.f4665a, slidingPaneLayout.f4670g);
                }
            }
            slidingPaneLayout.invalidate();
        }

        @Override // d1.c.AbstractC0191c
        public final void j(View view, float f10, float f11) {
            int paddingLeft;
            d dVar = (d) view.getLayoutParams();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.c()) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                if (f10 < 0.0f || (f10 == 0.0f && slidingPaneLayout.f4671h > 0.5f)) {
                    paddingRight += slidingPaneLayout.f4673j;
                }
                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f4670g.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + slidingPaneLayout.getPaddingLeft();
                int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i10 > 0 || (i10 == 0 && slidingPaneLayout.f4671h > 0.5f)) {
                    paddingLeft += slidingPaneLayout.f4673j;
                }
            }
            slidingPaneLayout.f4678o.s(paddingLeft, view.getTop());
            slidingPaneLayout.invalidate();
        }

        @Override // d1.c.AbstractC0191c
        public final boolean k(View view, int i10) {
            if (SlidingPaneLayout.this.f4674k) {
                return false;
            }
            return ((d) view.getLayoutParams()).f4690b;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public static class f extends c1.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public boolean c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new f[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel);
            }
        }

        public f(Parcel parcel) {
            super(parcel, null);
            boolean z10;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.c = z10;
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public final void a(float f10, int i10, View view) {
        d dVar = (d) view.getLayoutParams();
        if (f10 > 0.0f && i10 != 0) {
            int i11 = (((int) ((((-16777216) & i10) >>> 24) * f10)) << 24) | (i10 & 16777215);
            if (dVar.f4691d == null) {
                dVar.f4691d = new Paint();
            }
            dVar.f4691d.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, dVar.f4691d);
            }
            Paint paint = ((d) view.getLayoutParams()).f4691d;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.e.i(view, paint);
        } else if (view.getLayerType() != 0) {
            Paint paint2 = dVar.f4691d;
            if (paint2 != null) {
                paint2.setColorFilter(null);
            }
            b bVar = new b(view);
            this.f4682s.add(bVar);
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            f0.d.m(this, bVar);
        }
    }

    public final boolean b(View view) {
        if (view == null) {
            return false;
        }
        d dVar = (d) view.getLayoutParams();
        if (!this.f4669f || !dVar.c || this.f4671h <= 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.e.d(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        d1.c cVar = this.f4678o;
        if (cVar.h()) {
            if (!this.f4669f) {
                cVar.a();
                return;
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.c()
            android.view.View r1 = r9.f4670g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$d r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.d) r1
            boolean r2 = r1.c
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = r3
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L57
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f4670g
            if (r4 != r5) goto L2c
            goto L54
        L2c:
            float r5 = r9.f4672i
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f4675l
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f4672i = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L42
            int r5 = -r5
        L42:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L54
            float r5 = r9.f4672i
            if (r0 == 0) goto L4d
            float r5 = r5 - r6
            goto L4f
        L4d:
            float r5 = r6 - r5
        L4f:
            int r6 = r9.f4666b
            r9.a(r5, r6, r4)
        L54:
            int r3 = r3 + 1
            goto L21
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.d(float):void");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i10;
        int i11;
        super.draw(canvas);
        if (c()) {
            drawable = this.f4667d;
        } else {
            drawable = this.c;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (c()) {
                i11 = view.getRight();
                i10 = intrinsicWidth + i11;
            } else {
                int left = view.getLeft();
                int i12 = left - intrinsicWidth;
                i10 = left;
                i11 = i12;
            }
            drawable.setBounds(i11, top, i10, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d dVar = (d) view.getLayoutParams();
        int save = canvas.save();
        if (this.f4669f && !dVar.f4690b && this.f4670g != null) {
            Rect rect = this.f4681r;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = Math.max(rect.left, this.f4670g.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f4670g.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final boolean e(float f10) {
        int paddingLeft;
        if (!this.f4669f) {
            return false;
        }
        boolean c10 = c();
        d dVar = (d) this.f4670g.getLayoutParams();
        if (c10) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
            paddingLeft = (int) (getWidth() - (((f10 * this.f4673j) + paddingRight) + this.f4670g.getWidth()));
        } else {
            paddingLeft = (int) ((f10 * this.f4673j) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin);
        }
        View view = this.f4670g;
        if (!this.f4678o.u(view, paddingLeft, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.k(this);
        return true;
    }

    public final void f(View view) {
        int paddingLeft;
        int width;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        int i14;
        boolean z10;
        int i15;
        int i16;
        View view2 = view;
        boolean c10 = c();
        if (c10) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (c10) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 != null && view.isOpaque()) {
            i10 = view.getLeft();
            i11 = view.getRight();
            i12 = view.getTop();
            i13 = view.getBottom();
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount && (childAt = getChildAt(i17)) != view2) {
            if (childAt.getVisibility() == 8) {
                z10 = c10;
            } else {
                if (c10) {
                    i14 = width;
                } else {
                    i14 = paddingLeft;
                }
                int max = Math.max(i14, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                z10 = c10;
                if (c10) {
                    i15 = paddingLeft;
                } else {
                    i15 = width;
                }
                int min = Math.min(i15, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i10 && max2 >= i12 && min <= i11 && min2 <= i13) {
                    i16 = 4;
                } else {
                    i16 = 0;
                }
                childAt.setVisibility(i16);
            }
            i17++;
            view2 = view;
            c10 = z10;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f4666b;
    }

    public int getParallaxDistance() {
        return this.f4675l;
    }

    public int getSliderFadeColor() {
        return this.f4665a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4680q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4680q = true;
        ArrayList<b> arrayList = this.f4682s;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).run();
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = this.f4669f;
        d1.c cVar = this.f4678o;
        if (!z11 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            cVar.getClass();
            this.f4679p = !d1.c.l(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f4669f && (!this.f4674k || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x4 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        float abs = Math.abs(x4 - this.f4676m);
                        float abs2 = Math.abs(y10 - this.f4677n);
                        if (abs > cVar.f16053b && abs2 > abs) {
                            cVar.b();
                            this.f4674k = true;
                            return false;
                        }
                    }
                } else {
                    this.f4674k = false;
                    float x10 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    this.f4676m = x10;
                    this.f4677n = y11;
                    cVar.getClass();
                    if (d1.c.l(this.f4670g, (int) x10, (int) y11) && b(this.f4670g)) {
                        z10 = true;
                        if (cVar.t(motionEvent) && !z10) {
                            return false;
                        }
                    }
                }
                z10 = false;
                return cVar.t(motionEvent) ? true : true;
            }
            cVar.b();
            return false;
        }
        cVar.b();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        float f10;
        boolean c10 = c();
        d1.c cVar = this.f4678o;
        if (c10) {
            cVar.f16067q = 2;
        } else {
            cVar.f16067q = 1;
        }
        int i20 = i12 - i10;
        if (c10) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (c10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f4680q) {
            if (this.f4669f && this.f4679p) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f4671h = f10;
        }
        int i21 = paddingLeft;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.f4690b) {
                    int i23 = i20 - paddingRight;
                    int min = (Math.min(paddingLeft, i23 - this.f4668e) - i21) - (((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    this.f4673j = min;
                    if (c10) {
                        i19 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                    } else {
                        i19 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    }
                    if ((measuredWidth / 2) + i21 + i19 + min > i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    dVar.c = z11;
                    int i24 = (int) (min * this.f4671h);
                    i14 = i19 + i24 + i21;
                    this.f4671h = i24 / min;
                    i15 = 0;
                } else if (this.f4669f && (i16 = this.f4675l) != 0) {
                    i15 = (int) ((1.0f - this.f4671h) * i16);
                    i14 = paddingLeft;
                } else {
                    i14 = paddingLeft;
                    i15 = 0;
                }
                if (c10) {
                    i18 = (i20 - i14) + i15;
                    i17 = i18 - measuredWidth;
                } else {
                    i17 = i14 - i15;
                    i18 = i17 + measuredWidth;
                }
                childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                i21 = i14;
                paddingLeft = childAt.getWidth() + paddingLeft;
            }
        }
        if (this.f4680q) {
            if (this.f4669f) {
                if (this.f4675l != 0) {
                    d(this.f4671h);
                }
                if (((d) this.f4670g.getLayoutParams()).c) {
                    a(this.f4671h, this.f4665a, this.f4670g);
                }
            } else {
                for (int i25 = 0; i25 < childCount; i25++) {
                    a(0.0f, this.f4665a, getChildAt(i25));
                }
            }
            f(this.f4670g);
        }
        this.f4680q = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f5506a);
        if (fVar.c) {
            if (this.f4680q || e(1.0f)) {
                this.f4679p = true;
            }
        } else if (this.f4680q || e(0.0f)) {
            this.f4679p = false;
        }
        this.f4679p = fVar.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        f fVar = new f(super.onSaveInstanceState());
        boolean z11 = this.f4669f;
        if (z11) {
            if (z11 && this.f4671h != 1.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = this.f4679p;
        }
        fVar.c = z10;
        return fVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.f4680q = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4669f) {
            return super.onTouchEvent(motionEvent);
        }
        d1.c cVar = this.f4678o;
        cVar.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && b(this.f4670g)) {
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f10 = x4 - this.f4676m;
                float f11 = y10 - this.f4677n;
                int i10 = cVar.f16053b;
                if ((f11 * f11) + (f10 * f10) < i10 * i10 && d1.c.l(this.f4670g, (int) x4, (int) y10) && (this.f4680q || e(0.0f))) {
                    this.f4679p = false;
                }
            }
        } else {
            float x10 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.f4676m = x10;
            this.f4677n = y11;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z10;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f4669f) {
            if (view == this.f4670g) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4679p = z10;
        }
    }

    public void setCoveredFadeColor(int i10) {
        this.f4666b = i10;
    }

    public void setParallaxDistance(int i10) {
        this.f4675l = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f4667d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i10) {
        setShadowDrawable(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(androidx.core.content.a.getDrawable(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(androidx.core.content.a.getDrawable(getContext(), i10));
    }

    public void setSliderFadeColor(int i10) {
        this.f4665a = i10;
    }

    /* loaded from: classes.dex */
    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public static final int[] f4688e = {16843137};

        /* renamed from: a  reason: collision with root package name */
        public final float f4689a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4690b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f4691d;

        public d() {
            super(-1, -1);
            this.f4689a = 0.0f;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4689a = 0.0f;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4689a = 0.0f;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4689a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4688e);
            this.f4689a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4665a = -858993460;
        this.f4680q = true;
        this.f4681r = new Rect();
        this.f4682s = new ArrayList<>();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f4668e = (int) ((32.0f * f10) + 0.5f);
        setWillNotDraw(false);
        f0.o(this, new a());
        f0.d.s(this, 1);
        d1.c i11 = d1.c.i(this, 0.5f, new c());
        this.f4678o = i11;
        i11.f16064n = f10 * 400.0f;
    }

    public void setPanelSlideListener(e eVar) {
    }
}

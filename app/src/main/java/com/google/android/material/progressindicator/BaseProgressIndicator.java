package com.google.android.material.progressindicator;

import a9.b;
import a9.g;
import a9.j;
import a9.k;
import a9.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w8.s;

/* loaded from: classes2.dex */
public abstract class BaseProgressIndicator<S extends a9.b> extends ProgressBar {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f12762m = 0;

    /* renamed from: a  reason: collision with root package name */
    public final S f12763a;

    /* renamed from: b  reason: collision with root package name */
    public int f12764b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12765d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12766e;

    /* renamed from: f  reason: collision with root package name */
    public a9.a f12767f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12768g;

    /* renamed from: h  reason: collision with root package name */
    public int f12769h;

    /* renamed from: i  reason: collision with root package name */
    public final a f12770i;

    /* renamed from: j  reason: collision with root package name */
    public final b f12771j;

    /* renamed from: k  reason: collision with root package name */
    public final c f12772k;

    /* renamed from: l  reason: collision with root package name */
    public final d f12773l;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = BaseProgressIndicator.f12762m;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f12766e > 0) {
                SystemClock.uptimeMillis();
            }
            baseProgressIndicator.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = BaseProgressIndicator.f12762m;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            boolean z10 = false;
            ((j) baseProgressIndicator.getCurrentDrawable()).e(false, false, true);
            if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                z10 = true;
            }
            if (z10) {
                baseProgressIndicator.setVisibility(4);
            }
            baseProgressIndicator.getClass();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends g2.c {
        public c() {
        }

        @Override // g2.c
        public final void a(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setIndeterminate(false);
            baseProgressIndicator.b(baseProgressIndicator.f12764b, baseProgressIndicator.c);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends g2.c {
        public d() {
        }

        @Override // g2.c
        public final void a(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (!baseProgressIndicator.f12768g) {
                baseProgressIndicator.setVisibility(baseProgressIndicator.f12769h);
            }
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(l9.a.a(context, attributeSet, i10, 2132018295), attributeSet, i10);
        this.f12768g = false;
        this.f12769h = 4;
        this.f12770i = new a();
        this.f12771j = new b();
        this.f12772k = new c();
        this.f12773l = new d();
        Context context2 = getContext();
        this.f12763a = a(context2, attributeSet);
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16478d, i10, i11, new int[0]);
        d10.getInt(5, -1);
        this.f12766e = Math.min(d10.getInt(3, -1), 1000);
        d10.recycle();
        this.f12767f = new a9.a();
        this.f12765d = true;
    }

    private k<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f440l;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().f421l;
        }
    }

    public abstract S a(Context context, AttributeSet attributeSet);

    public void b(int i10, boolean z10) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f12764b = i10;
                this.c = z10;
                this.f12768g = true;
                if (getIndeterminateDrawable().isVisible()) {
                    a9.a aVar = this.f12767f;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    aVar.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        getIndeterminateDrawable().f441m.h();
                        return;
                    }
                }
                this.f12772k.a(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i10);
        if (getProgressDrawable() != null && !z10) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (getWindowVisibility() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r4 = this;
            java.util.WeakHashMap<android.view.View, x0.n0> r0 = x0.f0.f31435a
            boolean r0 = x0.f0.g.b(r4)
            r1 = 0
            if (r0 == 0) goto L34
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L34
            r0 = r4
        L10:
            int r2 = r0.getVisibility()
            r3 = 1
            if (r2 == 0) goto L18
            goto L26
        L18:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L28
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L26
        L24:
            r0 = r3
            goto L2d
        L26:
            r0 = r1
            goto L2d
        L28:
            boolean r2 = r0 instanceof android.view.View
            if (r2 != 0) goto L31
            goto L24
        L2d:
            if (r0 == 0) goto L34
            r1 = r3
            goto L34
        L31:
            android.view.View r0 = (android.view.View) r0
            goto L10
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.BaseProgressIndicator.c():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f12763a.f401f;
    }

    public int[] getIndicatorColor() {
        return this.f12763a.c;
    }

    public int getShowAnimationBehavior() {
        return this.f12763a.f400e;
    }

    public int getTrackColor() {
        return this.f12763a.f399d;
    }

    public int getTrackCornerRadius() {
        return this.f12763a.f398b;
    }

    public int getTrackThickness() {
        return this.f12763a.f397a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f441m.g(this.f12772k);
        }
        g<S> progressDrawable = getProgressDrawable();
        d dVar = this.f12773l;
        if (progressDrawable != null) {
            g<S> progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f433f == null) {
                progressDrawable2.f433f = new ArrayList();
            }
            if (!progressDrawable2.f433f.contains(dVar)) {
                progressDrawable2.f433f.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            l<S> indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f433f == null) {
                indeterminateDrawable.f433f = new ArrayList();
            }
            if (!indeterminateDrawable.f433f.contains(dVar)) {
                indeterminateDrawable.f433f.add(dVar);
            }
        }
        if (c()) {
            if (this.f12766e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f12771j);
        removeCallbacks(this.f12770i);
        ((j) getCurrentDrawable()).e(false, false, false);
        l<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.f12773l;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().g(dVar);
            getIndeterminateDrawable().f441m.j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i10, int i11) {
        int e10;
        int d10;
        k<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        if (currentDrawingDelegate.e() < 0) {
            e10 = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
        } else {
            e10 = currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight();
        }
        if (currentDrawingDelegate.d() < 0) {
            d10 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
        } else {
            d10 = currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(e10, d10);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f12765d) {
            ((j) getCurrentDrawable()).e(c(), false, z10);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f12765d) {
            ((j) getCurrentDrawable()).e(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(a9.a aVar) {
        this.f12767f = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f12763a.f401f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        if (z10 == isIndeterminate()) {
            return;
        }
        j jVar = (j) getCurrentDrawable();
        if (jVar != null) {
            jVar.e(false, false, false);
        }
        super.setIndeterminate(z10);
        j jVar2 = (j) getCurrentDrawable();
        if (jVar2 != null) {
            jVar2.e(c(), false, false);
        }
        if ((jVar2 instanceof l) && c()) {
            ((l) jVar2).f441m.i();
        }
        this.f12768g = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof l) {
            ((j) drawable).e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{t0.J(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f12763a.c = iArr;
            getIndeterminateDrawable().f441m.f();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        b(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof g) {
            g gVar = (g) drawable;
            gVar.e(false, false, false);
            super.setProgressDrawable(gVar);
            gVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f12763a.f400e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s4 = this.f12763a;
        if (s4.f399d != i10) {
            s4.f399d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s4 = this.f12763a;
        if (s4.f398b != i10) {
            s4.f398b = Math.min(i10, s4.f397a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        S s4 = this.f12763a;
        if (s4.f397a != i10) {
            s4.f397a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f12769h = i10;
    }

    @Override // android.widget.ProgressBar
    public l<S> getIndeterminateDrawable() {
        return (l) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public g<S> getProgressDrawable() {
        return (g) super.getProgressDrawable();
    }
}

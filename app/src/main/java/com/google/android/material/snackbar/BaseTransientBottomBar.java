package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b9.c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import f9.h;
import f9.m;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w8.w;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12920a = 0;

    /* loaded from: classes2.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i  reason: collision with root package name */
        public final b f12921i = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f12921i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    h9.a.a().b();
                }
            } else if (coordinatorLayout.s(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (h9.a.a().f18112a) {
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            this.f12921i.getClass();
            return view instanceof SnackbarBaseLayout;
        }
    }

    /* loaded from: classes2.dex */
    public static class SnackbarBaseLayout extends FrameLayout {

        /* renamed from: j  reason: collision with root package name */
        public static final a f12922j = new a();

        /* renamed from: a  reason: collision with root package name */
        public BaseTransientBottomBar<?> f12923a;

        /* renamed from: b  reason: collision with root package name */
        public final m f12924b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public final float f12925d;

        /* renamed from: e  reason: collision with root package name */
        public final float f12926e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12927f;

        /* renamed from: g  reason: collision with root package name */
        public final int f12928g;

        /* renamed from: h  reason: collision with root package name */
        public ColorStateList f12929h;

        /* renamed from: i  reason: collision with root package name */
        public PorterDuff.Mode f12930i;

        /* loaded from: classes2.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(l9.a.a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, e8.a.Z);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.i.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.c = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.f12924b = new m(m.c(context2, attributeSet, 0, 0));
            }
            this.f12925d = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(w.f(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f12926e = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f12927f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f12928g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f12922j);
            setFocusable(true);
            if (getBackground() == null) {
                int e02 = t0.e0(getBackgroundOverlayColorAlpha(), t0.K(this, R.attr.colorSurface), t0.K(this, R.attr.colorOnSurface));
                m mVar = this.f12924b;
                if (mVar != null) {
                    int i10 = BaseTransientBottomBar.f12920a;
                    h hVar = new h(mVar);
                    hVar.n(ColorStateList.valueOf(e02));
                    gradientDrawable = hVar;
                } else {
                    Resources resources = getResources();
                    int i11 = BaseTransientBottomBar.f12920a;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(e02);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.f12929h;
                if (colorStateList != null) {
                    a.b.h(gradientDrawable, colorStateList);
                }
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                f0.d.q(this, gradientDrawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f12923a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f12926e;
        }

        public int getAnimationMode() {
            return this.c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f12925d;
        }

        public int getMaxInlineActionWidth() {
            return this.f12928g;
        }

        public int getMaxWidth() {
            return this.f12927f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f12923a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.h.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f12923a != null) {
                synchronized (h9.a.a().f18112a) {
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int i12 = this.f12927f;
            if (i12 > 0 && getMeasuredWidth() > i12) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setAnimationMode(int i10) {
            this.c = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f12929h != null) {
                drawable = drawable.mutate();
                a.b.h(drawable, this.f12929h);
                a.b.i(drawable, this.f12930i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f12929h = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.h(mutate, colorStateList);
                a.b.i(mutate, this.f12930i);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f12930i = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                a.b.i(mutate, mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                if (this.f12923a != null) {
                    int i10 = BaseTransientBottomBar.f12920a;
                    throw null;
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            a aVar;
            if (onClickListener != null) {
                aVar = null;
            } else {
                aVar = f12922j;
            }
            setOnTouchListener(aVar);
            super.setOnClickListener(onClickListener);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f12074f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f12075g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f12072d = 0;
        }
    }

    static {
        LinearInterpolator linearInterpolator = f8.b.f17141a;
        new Handler(Looper.getMainLooper(), new a());
    }
}

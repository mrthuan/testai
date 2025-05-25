package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import o0.b;
import w8.s;
import x0.f0;
import x0.n0;
import x0.s0;
import x0.u;

/* loaded from: classes2.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f12611a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f12612b;
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12613d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12614e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12615f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12616g;

    /* loaded from: classes2.dex */
    public class a implements u {
        public a() {
        }

        @Override // x0.u
        public final s0 m(View view, s0 s0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f12612b == null) {
                scrimInsetsFrameLayout.f12612b = new Rect();
            }
            scrimInsetsFrameLayout.f12612b.set(s0Var.c(), s0Var.e(), s0Var.d(), s0Var.b());
            scrimInsetsFrameLayout.a(s0Var);
            s0.k kVar = s0Var.f31498a;
            boolean z10 = true;
            if ((!kVar.j().equals(b.f22638e)) && scrimInsetsFrameLayout.f12611a != null) {
                z10 = false;
            }
            scrimInsetsFrameLayout.setWillNotDraw(z10);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(scrimInsetsFrameLayout);
            return kVar.c();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f12612b != null && this.f12611a != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            boolean z10 = this.f12613d;
            Rect rect = this.c;
            if (z10) {
                rect.set(0, 0, width, this.f12612b.top);
                this.f12611a.setBounds(rect);
                this.f12611a.draw(canvas);
            }
            if (this.f12614e) {
                rect.set(0, height - this.f12612b.bottom, width, height);
                this.f12611a.setBounds(rect);
                this.f12611a.draw(canvas);
            }
            if (this.f12615f) {
                Rect rect2 = this.f12612b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f12611a.setBounds(rect);
                this.f12611a.draw(canvas);
            }
            if (this.f12616g) {
                Rect rect3 = this.f12612b;
                rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
                this.f12611a.setBounds(rect);
                this.f12611a.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f12611a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f12611a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f12614e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f12615f = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f12616g = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f12613d = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f12611a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.c = new Rect();
        this.f12613d = true;
        this.f12614e = true;
        this.f12615f = true;
        this.f12616g = true;
        TypedArray d10 = s.d(context, attributeSet, e8.a.R, i10, 2132018040, new int[0]);
        this.f12611a = d10.getDrawable(0);
        d10.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(this, aVar);
    }

    public void a(s0 s0Var) {
    }
}

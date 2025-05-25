package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import f9.m;
import f9.n;
import f9.q;
import o8.d;
import t5.f;

/* loaded from: classes2.dex */
public class MaskableFrameLayout extends FrameLayout implements o8.c, q {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f12238f = 0;

    /* renamed from: a  reason: collision with root package name */
    public float f12239a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f12240b;
    public m c;

    /* renamed from: d  reason: collision with root package name */
    public final a f12241d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f12242e;

    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public m f12244b;

        /* renamed from: a  reason: collision with root package name */
        public boolean f12243a = false;
        public RectF c = new RectF();

        /* renamed from: d  reason: collision with root package name */
        public final Path f12245d = new Path();

        public abstract void a(View view);

        public abstract boolean b();
    }

    /* loaded from: classes2.dex */
    public static class b extends a {

        /* renamed from: e  reason: collision with root package name */
        public boolean f12246e = false;

        /* loaded from: classes2.dex */
        public class a extends ViewOutlineProvider {
            public a() {
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                b bVar = b.this;
                if (bVar.f12244b != null && !bVar.c.isEmpty()) {
                    RectF rectF = bVar.c;
                    int i10 = (int) rectF.left;
                    int i11 = (int) rectF.top;
                    int i12 = (int) rectF.right;
                    int i13 = (int) rectF.bottom;
                    m mVar = bVar.f12244b;
                    bVar.getClass();
                    outline.setRoundRect(i10, i11, i12, i13, mVar.f17216f.a(rectF));
                }
            }
        }

        public b(View view) {
            c(view);
        }

        private void c(View view) {
            view.setOutlineProvider(new a());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.a
        public final void a(View view) {
            m mVar;
            if (!this.c.isEmpty() && (mVar = this.f12244b) != null) {
                this.f12246e = mVar.f(this.c);
            }
            view.setClipToOutline(!b());
            if (b()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.a
        public final boolean b() {
            if (this.f12246e && !this.f12243a) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends a {

        /* loaded from: classes2.dex */
        public class a extends ViewOutlineProvider {
            public a() {
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                c cVar = c.this;
                if (!cVar.f12245d.isEmpty()) {
                    outline.setPath(cVar.f12245d);
                }
            }
        }

        public c(View view) {
            c(view);
        }

        private void c(View view) {
            view.setOutlineProvider(new a());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.a
        public final void a(View view) {
            view.setClipToOutline(!this.f12243a);
            if (this.f12243a) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.a
        public final boolean b() {
            return this.f12243a;
        }
    }

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    public final void b() {
        m mVar;
        if (getWidth() == 0) {
            return;
        }
        float a10 = f8.b.a(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f12239a);
        RectF rectF = this.f12240b;
        rectF.set(a10, 0.0f, getWidth() - a10, getHeight());
        a aVar = this.f12241d;
        aVar.c = rectF;
        if (!rectF.isEmpty() && (mVar = aVar.f12244b) != null) {
            n.a.f17245a.a(mVar, 1.0f, aVar.c, null, aVar.f12245d);
        }
        aVar.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar = this.f12241d;
        if (aVar.b()) {
            Path path = aVar.f12245d;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    public RectF getMaskRectF() {
        return this.f12240b;
    }

    public float getMaskXPercentage() {
        return this.f12239a;
    }

    public m getShapeAppearanceModel() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f12242e;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            a aVar = this.f12241d;
            if (booleanValue != aVar.f12243a) {
                aVar.f12243a = booleanValue;
                aVar.a(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a aVar = this.f12241d;
        this.f12242e = Boolean.valueOf(aVar.f12243a);
        if (true != aVar.f12243a) {
            aVar.f12243a = true;
            aVar.a(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f12240b;
        if (!rectF.isEmpty() && motionEvent.getAction() == 0 && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setForceCompatClipping(boolean z10) {
        a aVar = this.f12241d;
        if (z10 != aVar.f12243a) {
            aVar.f12243a = z10;
            aVar.a(this);
        }
    }

    @Override // o8.c
    public void setMaskXPercentage(float f10) {
        float m10 = com.google.android.play.core.assetpacks.c.m(f10, 0.0f, 1.0f);
        if (this.f12239a != m10) {
            this.f12239a = m10;
            b();
        }
    }

    @Override // f9.q
    public void setShapeAppearanceModel(m mVar) {
        m mVar2;
        m h10 = mVar.h(new f(6));
        this.c = h10;
        a aVar = this.f12241d;
        aVar.f12244b = h10;
        if (!aVar.c.isEmpty() && (mVar2 = aVar.f12244b) != null) {
            n.a.f17245a.a(mVar2, 1.0f, aVar.c, null, aVar.f12245d);
        }
        aVar.a(this);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a bVar;
        this.f12239a = 0.0f;
        this.f12240b = new RectF();
        if (Build.VERSION.SDK_INT >= 33) {
            bVar = new c(this);
        } else {
            bVar = new b(this);
        }
        this.f12241d = bVar;
        this.f12242e = null;
        setShapeAppearanceModel(new m(m.c(context, attributeSet, i10, 0)));
    }

    public void setOnMaskChangedListener(d dVar) {
    }
}

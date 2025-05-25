package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class R3 extends ImageView implements O3 {

    /* renamed from: a  reason: collision with root package name */
    public P3 f14606a;

    /* renamed from: b  reason: collision with root package name */
    public float f14607b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public String f14608d;

    public R3(Context context) {
        super(context, null);
        this.f14607b = 1.0f;
        this.c = true;
        this.f14608d = "unspecified";
        setLayerType(1, null);
    }

    private final int getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (getContext() instanceof Activity) {
            Context context = getContext();
            kotlin.jvm.internal.g.c(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        }
        return 240;
    }

    private final float getScale() {
        float density = getContext().getResources().getDisplayMetrics().densityDpi / getDensity();
        this.f14607b = density;
        if (density < 0.1f) {
            this.f14607b = 0.1f;
        }
        if (this.f14607b > 5.0f) {
            this.f14607b = 5.0f;
        }
        return this.f14607b;
    }

    public final void a(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        canvas.save();
        float f12 = this.f14607b;
        canvas.scale(f12, f12);
        float width = getWidth();
        float height = getHeight();
        P3 p32 = this.f14606a;
        int i11 = 0;
        if (p32 != null) {
            i10 = p32.d();
        } else {
            i10 = 0;
        }
        float f13 = i10 * this.f14607b;
        P3 p33 = this.f14606a;
        if (p33 != null) {
            i11 = p33.a();
        }
        float f14 = i11 * this.f14607b;
        String str = this.f14608d;
        if (kotlin.jvm.internal.g.a(str, "aspectFill")) {
            float max = Math.max(height / f14, width / f13);
            float f15 = width - (f13 * max);
            float f16 = 2;
            float f17 = this.f14607b * max;
            f10 = (f15 / f16) / f17;
            f11 = ((height - (f14 * max)) / f16) / f17;
            canvas.scale(max, max);
        } else if (kotlin.jvm.internal.g.a(str, "aspectFit")) {
            float min = Math.min(height / f14, width / f13);
            float f18 = width - (f13 * min);
            float f19 = 2;
            float f20 = this.f14607b * min;
            f10 = (f18 / f19) / f20;
            f11 = ((height - (f14 * min)) / f19) / f20;
            canvas.scale(min, min);
        } else {
            canvas.scale(width / f13, height / f14);
            f10 = 0.0f;
            f11 = 0.0f;
        }
        P3 p34 = this.f14606a;
        if (p34 != null) {
            p34.a(canvas, f10, f11);
        }
        canvas.restore();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.g.e(canvas, "canvas");
        P3 p32 = this.f14606a;
        if (p32 != null) {
            if (p32.c()) {
                p32.b();
                a(canvas);
                if (this.c) {
                    postInvalidateOnAnimation();
                    return;
                }
                return;
            }
            a(canvas);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.c = z11;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.f14607b = getScale();
        Drawable drawable = getDrawable();
        P3 p32 = this.f14606a;
        int i13 = 1;
        if (drawable != null) {
            i12 = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (i12 <= 0) {
                i12 = 1;
            }
            if (intrinsicHeight > 0) {
                i13 = intrinsicHeight;
            }
        } else if (p32 != null) {
            int d10 = p32.d();
            int a10 = p32.a();
            if (d10 <= 0) {
                d10 = 1;
            }
            if (a10 > 0) {
                i13 = a10;
            }
            i12 = d10;
        } else {
            i13 = 0;
            i12 = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(getPaddingLeft() + getPaddingRight() + i12, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(getPaddingTop() + getPaddingBottom() + i13, getSuggestedMinimumHeight()), i11));
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        this.c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i10) {
        boolean z10;
        kotlin.jvm.internal.g.e(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.c = z10;
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    public final void setContentMode(String contentMode) {
        kotlin.jvm.internal.g.e(contentMode, "contentMode");
        this.f14608d = contentMode;
    }

    public final void setGifImpl(P3 p32) {
        this.f14606a = p32;
        if (p32 != null) {
            p32.a(this);
            p32.start();
        }
        requestLayout();
    }

    public final void setPaused(boolean z10) {
        P3 p32 = this.f14606a;
        if (p32 != null) {
            p32.a(z10);
        }
    }

    private static /* synthetic */ void getMContentMode$annotations() {
    }
}

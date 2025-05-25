package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w8.w;
import x0.f0;
import x0.n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f13109a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13110b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13111d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13112e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f13113f;

    /* renamed from: g  reason: collision with root package name */
    public final RectF f13114g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13115h;

    /* renamed from: i  reason: collision with root package name */
    public float f13116i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13117j;

    /* renamed from: k  reason: collision with root package name */
    public double f13118k;

    /* renamed from: l  reason: collision with root package name */
    public int f13119l;

    /* renamed from: m  reason: collision with root package name */
    public int f13120m;

    /* loaded from: classes2.dex */
    public interface a {
        void a(float f10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public final int a(int i10) {
        if (i10 == 2) {
            return Math.round(this.f13119l * 0.66f);
        }
        return this.f13119l;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f13109a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10, false);
    }

    public final void c(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f13116i = f11;
        this.f13118k = Math.toRadians(f11 - 90.0f);
        float a10 = a(this.f13120m);
        float cos = (((float) Math.cos(this.f13118k)) * a10) + (getWidth() / 2);
        float sin = (a10 * ((float) Math.sin(this.f13118k))) + (getHeight() / 2);
        float f12 = this.f13111d;
        this.f13114g.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a10;
        int i10;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float a11 = a(this.f13120m);
        float f11 = height;
        Paint paint = this.f13113f;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f13118k)) * a11) + f10, (a11 * ((float) Math.sin(this.f13118k))) + f11, this.f13111d, paint);
        double sin = Math.sin(this.f13118k);
        paint.setStrokeWidth(this.f13115h);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f13118k) * r12)), height + ((int) (r12 * sin)), paint);
        canvas.drawCircle(f10, f11, this.f13112e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f13109a.isRunning()) {
            b(this.f13116i);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z10 = false;
            } else {
                z11 = this.f13117j;
                if (this.f13110b) {
                    if (((float) Math.hypot(x4 - (getWidth() / 2), y10 - (getHeight() / 2))) <= a(2) + w.b(getContext(), 12)) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    this.f13120m = i10;
                }
                z10 = false;
            }
        } else {
            this.f13117j = false;
            z10 = true;
            z11 = false;
        }
        boolean z14 = this.f13117j;
        int degrees = ((int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x4 - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f10 = degrees;
        if (this.f13116i != f10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z12) {
            if (z12 || z11) {
                b(f10);
            }
            this.f13117j = z14 | z13;
            return true;
        }
        z13 = true;
        this.f13117j = z14 | z13;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13109a = new ValueAnimator();
        this.c = new ArrayList();
        Paint paint = new Paint();
        this.f13113f = paint;
        this.f13114g = new RectF();
        this.f13120m = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f16492m, i10, 2132018319);
        x8.a.c(context, R.attr.motionDurationLong2, 200);
        x8.a.d(context, R.attr.motionEasingEmphasizedInterpolator, f8.b.f17142b);
        this.f13119l = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f13111d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f13115h = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f13112e = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }
}

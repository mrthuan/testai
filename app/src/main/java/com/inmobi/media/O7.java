package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class O7 extends View {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f14541a;

    /* renamed from: b  reason: collision with root package name */
    public Canvas f14542b;
    public RectF c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f14543d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f14544e;

    /* renamed from: f  reason: collision with root package name */
    public long f14545f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f14546g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f14547h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f14548i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f14549j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f14550k;

    /* renamed from: l  reason: collision with root package name */
    public float f14551l;

    /* renamed from: m  reason: collision with root package name */
    public long f14552m;

    /* renamed from: n  reason: collision with root package name */
    public ValueAnimator f14553n;

    /* renamed from: o  reason: collision with root package name */
    public N7 f14554o;

    public O7(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-723724);
        this.f14546g = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
        this.f14550k = paint2;
        this.f14544e = new Rect();
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-16777216);
        this.f14547h = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(0);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f14548i = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setAntiAlias(true);
        paint5.setColor(-16777216);
        this.f14549j = paint5;
    }

    public final void a() {
        N7 n72 = this.f14554o;
        if (n72 != null) {
            C1853w7 c1853w7 = (C1853w7) n72;
            C1788r7 c1788r7 = c1853w7.f15583a.f15649p;
            if (c1788r7 != null) {
                L7 timerAsset = c1853w7.f15584b;
                kotlin.jvm.internal.g.e(timerAsset, "timerAsset");
                if (timerAsset.f14794j == 1) {
                    c1788r7.f15417b.a();
                }
            }
        }
        ValueAnimator valueAnimator = this.f14553n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f14553n = null;
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f14553n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f14552m = valueAnimator.getCurrentPlayTime();
            valueAnimator.cancel();
        }
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f14553n;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            valueAnimator.setCurrentPlayTime(this.f14552m);
            valueAnimator.start();
        }
    }

    public final void d() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f14545f));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new M7(this));
        this.f14553n = ofFloat;
        ofFloat.start();
    }

    public final void e() {
        ValueAnimator valueAnimator = this.f14553n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.setCurrentPlayTime(this.f14545f * 1000);
            this.f14551l = 360 * 1.0f;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        Object animatedValue;
        Object animatedValue2;
        kotlin.jvm.internal.g.e(canvas, "canvas");
        Canvas canvas4 = this.f14542b;
        if (canvas4 != null) {
            canvas4.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int min = Math.min(width, height);
        C1706l3 c1706l3 = AbstractC1692k3.f15250a;
        int b10 = (int) (AbstractC1692k3.b() * ((int) (getWidth() * 7.0f * 0.007f)));
        float f10 = width;
        float f11 = height;
        canvas.drawCircle(f10, f11, min, this.f14546g);
        canvas.drawCircle(f10, f11, min - b10, this.f14549j);
        ValueAnimator valueAnimator = this.f14553n;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f14545f - (valueAnimator.getCurrentPlayTime() / 1000));
            kotlin.jvm.internal.g.c(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue).floatValue() >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.f14550k;
            Rect rect = this.f14544e;
            String valueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(valueOf, 0, valueOf.length(), rect);
            canvas.drawText(valueOf, getWidth() / 2, (getHeight() / 2) + (((paint.descent() - paint.ascent()) / 2) - paint.descent()), paint);
            kotlin.jvm.internal.g.c(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue2).floatValue() >= 1.0d) {
                a();
            }
        }
        float f12 = this.f14551l;
        if (f12 > 0.0f) {
            RectF rectF = this.c;
            if (rectF != null && (canvas3 = this.f14542b) != null) {
                canvas3.drawArc(rectF, 270.0f, f12, true, this.f14547h);
            }
            RectF rectF2 = this.f14543d;
            if (rectF2 != null && (canvas2 = this.f14542b) != null) {
                canvas2.drawOval(rectF2, this.f14548i);
            }
        }
        Bitmap bitmap = this.f14541a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != i12 || i11 != i13) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.g.d(createBitmap, "createBitmap(...)");
            createBitmap.eraseColor(0);
            this.f14541a = createBitmap;
            this.f14542b = new Canvas(createBitmap);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        C1706l3 c1706l3 = AbstractC1692k3.f15250a;
        float b10 = (int) (AbstractC1692k3.b() * ((int) (getWidth() * 4.0f * 0.007f)));
        float b11 = AbstractC1692k3.b();
        float b12 = (int) (AbstractC1692k3.b() * ((int) (getWidth() * 5.0f * 0.007f)));
        float b13 = AbstractC1692k3.b();
        RectF rectF = new RectF(b12, b12, getWidth() - b12, getHeight() - b12);
        this.c = rectF;
        this.f14543d = new RectF(rectF.left + b10, rectF.top + b10, rectF.right - b10, rectF.bottom - b10);
        this.f14549j.setStrokeWidth((int) (b13 * ((int) (getWidth() * 1.5f * 0.007f))));
        this.f14550k.setTextSize((int) (b11 * ((int) (getWidth() * 14.0f * 0.007f))));
        invalidate();
    }

    public final void setTimerEventsListener(N7 n72) {
        this.f14554o = n72;
    }

    public final void setTimerValue(long j10) {
        this.f14545f = j10;
    }
}

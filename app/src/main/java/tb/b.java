package tb;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;

/* compiled from: ProgressDrawable.java */
/* loaded from: classes2.dex */
public final class b extends a implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: e  reason: collision with root package name */
    public final ValueAnimator f29997e;

    /* renamed from: b  reason: collision with root package name */
    public int f29995b = 0;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f29996d = 0;

    /* renamed from: f  reason: collision with root package name */
    public final Path f29998f = new Path();

    public b() {
        ValueAnimator ofInt = ValueAnimator.ofInt(30, 3600);
        this.f29997e = ofInt;
        ofInt.setDuration(10000L);
        ofInt.setInterpolator(null);
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f10 = width;
        float max = Math.max(1.0f, f10 / 22.0f);
        int i10 = this.f29995b;
        Path path = this.f29998f;
        if (i10 != width || this.c != height) {
            path.reset();
            float f11 = f10 - max;
            float f12 = height / 2.0f;
            path.addCircle(f11, f12, max, Path.Direction.CW);
            float f13 = f10 - (5.0f * max);
            path.addRect(f13, f12 - max, f11, f12 + max, Path.Direction.CW);
            path.addCircle(f13, f12, max, Path.Direction.CW);
            this.f29995b = width;
            this.c = height;
        }
        canvas.save();
        float f14 = f10 / 2.0f;
        float f15 = height / 2.0f;
        canvas.rotate(this.f29996d, f14, f15);
        for (int i11 = 0; i11 < 12; i11++) {
            Paint paint = this.f29994a;
            paint.setAlpha((i11 + 5) * 17);
            canvas.rotate(30.0f, f14, f15);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f29997e.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f29996d = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.f29997e;
        if (!valueAnimator.isRunning()) {
            valueAnimator.addUpdateListener(this);
            valueAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ValueAnimator valueAnimator = this.f29997e;
        if (valueAnimator.isRunning()) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
    }
}

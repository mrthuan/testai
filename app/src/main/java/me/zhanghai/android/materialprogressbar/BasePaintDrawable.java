package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes3.dex */
abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable
    public final void onDraw(Canvas canvas, int i10, int i11) {
        if (this.mPaint == null) {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-16777216);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, i10, i11, this.mPaint);
    }

    public abstract void onDraw(Canvas canvas, int i10, int i11, Paint paint);

    public abstract void onPreparePaint(Paint paint);
}

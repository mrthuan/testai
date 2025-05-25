package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
public class TTProgressIndicator extends View {
    private final Paint Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private float f9340ac;
    private float cJ;

    public TTProgressIndicator(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f9340ac;
        if (f10 > 0.0f) {
            float f11 = this.cJ;
            canvas.drawLine(0.0f, f11, f10, f11, this.Qhi);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i11;
        this.cJ = (1.0f * f10) / 2.0f;
        this.Qhi.setStrokeWidth(f10);
    }

    public void setProgress(float f10) {
        this.f9340ac = getWidth() * f10;
        invalidate();
    }
}

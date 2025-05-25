package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class TwoSemicirclesView extends View {
    private Paint CJ;
    private final RectF Qhi;
    private float ROR;
    private float Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private int f9291ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Paint f9292fl;

    public Paint getPaintOne() {
        return this.CJ;
    }

    public Paint getPaintTwo() {
        return this.f9292fl;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.Qhi;
        float f10 = this.ROR;
        rectF.set(-f10, -f10, f10, f10);
        canvas.translate(this.cJ / 2, this.f9291ac / 2);
        canvas.drawArc(this.Qhi, this.Tgh, 180.0f, false, this.CJ);
        canvas.drawArc(this.Qhi, this.Tgh + 180.0f, 180.0f, false, this.f9292fl);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.cJ = i10;
        this.f9291ac = i11;
    }

    public void setCurrentStartAngle(float f10) {
        this.Tgh = f10;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.CJ = paint;
        postInvalidate();
    }

    public void setPaintTwo(Paint paint) {
        this.f9292fl = paint;
        postInvalidate();
    }

    public void setRadius(float f10) {
        this.ROR = f10;
        postInvalidate();
    }
}

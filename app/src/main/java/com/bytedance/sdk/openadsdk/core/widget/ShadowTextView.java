package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;

/* loaded from: classes.dex */
public class ShadowTextView extends PAGTextView {
    private Paint Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f9277ac;
    private RectF cJ;

    public ShadowTextView(Context context) {
        this(context, null);
    }

    private void Qhi() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.Qhi.setColor(Color.parseColor("#99333333"));
        this.Qhi.setAntiAlias(true);
        this.Qhi.setStrokeWidth(0.0f);
        this.cJ = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.cJ;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.Qhi);
        canvas.translate((this.cJ.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText("00");
            this.f9277ac = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i12 = ((measuredHeight / 2) * 2) + measuredWidth;
            setMeasuredDimension(i12, measuredHeight);
            this.cJ.set(0.0f, 0.0f, i12, measuredHeight);
            return;
        }
        this.cJ.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9277ac = 0;
        Qhi();
    }
}

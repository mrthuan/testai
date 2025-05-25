package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* loaded from: classes.dex */
public class RingProgressView extends View {
    private float CJ;
    private Context Qhi;
    private boolean ROR;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private RectF f8302ac;
    private Paint cJ;

    /* renamed from: fl  reason: collision with root package name */
    private ValueAnimator f8303fl;

    public RingProgressView(Context context) {
        super(context);
        this.Tgh = TTAdConstant.STYLE_SIZE_RADIO_3_2;
        this.Qhi = context;
        Paint paint = new Paint();
        this.cJ = paint;
        paint.setAntiAlias(true);
        this.cJ.setStyle(Paint.Style.STROKE);
        this.cJ.setStrokeWidth(10.0f);
        this.cJ.setColor(Color.parseColor("#80FFFFFF"));
        this.f8302ac = new RectF();
    }

    public void ac() {
        this.ROR = true;
        invalidate();
    }

    public void cJ() {
        ValueAnimator valueAnimator = this.f8303fl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.ROR) {
            return;
        }
        canvas.drawArc(this.f8302ac, 270.0f, this.CJ, false, this.cJ);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f8302ac.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void setDuration(int i10) {
        this.Tgh = i10;
    }

    public void Qhi() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f8303fl = ofFloat;
        ofFloat.setDuration(this.Tgh);
        this.f8303fl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RingProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RingProgressView.this.CJ = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.f8303fl.start();
    }
}

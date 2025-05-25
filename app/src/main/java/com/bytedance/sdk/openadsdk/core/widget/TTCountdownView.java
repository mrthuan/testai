package com.bytedance.sdk.openadsdk.core.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTCountdownView extends View {
    public static final String Qhi = MQ.Qhi(HzH.Qhi(), "tt_count_down_view");
    private float ABk;
    private int CJ;
    private Paint Gm;
    private ValueAnimator HzH;
    private final String ROR;
    private Paint Sf;
    private float Tgh;
    private Paint WAv;

    /* renamed from: ac  reason: collision with root package name */
    private float f9280ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private float f9281fl;

    /* renamed from: hm  reason: collision with root package name */
    private Paint f9282hm;
    private AnimatorSet hpZ;
    private RectF iMK;
    private ValueAnimator kYc;
    private Qhi pA;
    private ValueAnimator tP;

    /* renamed from: zc  reason: collision with root package name */
    private float f9283zc;

    /* loaded from: classes.dex */
    public interface Qhi {
    }

    private ValueAnimator getArcAnim() {
        ValueAnimator valueAnimator = this.kYc;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.kYc = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f9283zc, 0.0f);
        this.kYc = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.kYc.setDuration(Qhi(this.f9283zc, this.f9281fl) * 1000.0f);
        this.kYc.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.f9283zc = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.kYc;
    }

    private ValueAnimator getNumAnim() {
        ValueAnimator valueAnimator = this.HzH;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.HzH = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.ABk, 0.0f);
        this.HzH = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.HzH.setDuration(Qhi(this.ABk, this.Tgh) * 1000.0f);
        this.HzH.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.ABk = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.HzH;
    }

    public float Qhi(float f10, float f11) {
        return f10 * f11;
    }

    public Qhi getCountdownListener() {
        return this.pA;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Qhi();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        cJ(canvas);
        Qhi(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            size = cJ();
        }
        if (mode2 != 1073741824) {
            size2 = cJ();
        }
        setMeasuredDimension(size, size2);
    }

    public void setCountDownTime(int i10) {
        float f10 = i10;
        this.Tgh = f10;
        this.f9281fl = f10;
        Qhi();
    }

    public void setCountdownListener(Qhi qhi) {
        this.pA = qhi;
    }

    private int cJ() {
        return (int) ((((this.cJ / 2.0f) + this.f9280ac) * 2.0f) + zn.cJ(getContext(), 4.0f));
    }

    public float Qhi(float f10, int i10) {
        return i10 * f10;
    }

    private void Qhi(Canvas canvas) {
        canvas.save();
        Paint.FontMetrics fontMetrics = this.Gm.getFontMetrics();
        String str = this.ROR;
        if (TextUtils.isEmpty(str)) {
            str = Qhi;
        }
        canvas.drawText(str, 0.0f, 0.0f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.Gm);
        canvas.restore();
    }

    private void cJ(Canvas canvas) {
        canvas.save();
        float Qhi2 = Qhi(this.f9283zc, 360);
        float f10 = this.CJ;
        canvas.drawCircle(0.0f, 0.0f, this.f9280ac, this.f9282hm);
        canvas.drawCircle(0.0f, 0.0f, this.f9280ac, this.WAv);
        canvas.drawArc(this.iMK, f10, Qhi2, false, this.Sf);
        canvas.restore();
    }

    public void Qhi() {
        AnimatorSet animatorSet = this.hpZ;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.hpZ = null;
        }
        ValueAnimator valueAnimator = this.tP;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.tP = null;
        }
        ValueAnimator valueAnimator2 = this.HzH;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.HzH = null;
        }
        ValueAnimator valueAnimator3 = this.kYc;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.kYc = null;
        }
        this.f9283zc = 1.0f;
        this.ABk = 1.0f;
        invalidate();
    }
}

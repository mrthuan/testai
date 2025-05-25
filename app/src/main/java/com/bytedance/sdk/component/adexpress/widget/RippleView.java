package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class RippleView extends View {
    private ValueAnimator CJ;
    private float Qhi;
    private float ROR;
    private float Sf;
    private long Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private ValueAnimator f8304ac;
    private float cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Paint f8305fl;

    /* renamed from: hm  reason: collision with root package name */
    private Animator.AnimatorListener f8306hm;

    public RippleView(Context context, int i10) {
        super(context);
        this.Tgh = 300L;
        this.ROR = 0.0f;
        this.WAv = i10;
        Qhi();
    }

    public void ac() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Sf, 0.0f);
        this.CJ = ofFloat;
        ofFloat.setDuration(this.Tgh);
        this.CJ.setInterpolator(new LinearInterpolator());
        this.CJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.ROR = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.f8306hm;
        if (animatorListener != null) {
            this.CJ.addListener(animatorListener);
        }
        this.CJ.start();
    }

    public void cJ() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Sf);
        this.f8304ac = ofFloat;
        ofFloat.setDuration(this.Tgh);
        this.f8304ac.setInterpolator(new LinearInterpolator());
        this.f8304ac.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.ROR = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.f8304ac.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.Qhi, this.cJ, this.ROR, this.f8305fl);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.Qhi = i10 / 2.0f;
        this.cJ = i11 / 2.0f;
        this.Sf = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f8306hm = animatorListener;
    }

    public void Qhi() {
        Paint paint = new Paint(1);
        this.f8305fl = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f8305fl.setColor(this.WAv);
    }
}

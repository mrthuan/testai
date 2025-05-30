package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public class SplashDiffuseView extends View {

    /* renamed from: ac  reason: collision with root package name */
    private static int f8319ac = 50;
    private ObjectAnimator CJ;
    private Paint Qhi;
    private int cJ;

    public SplashDiffuseView(Context context) {
        this(context, null);
    }

    private void ac() {
        Paint paint = new Paint();
        this.Qhi = paint;
        paint.setAntiAlias(true);
        this.Qhi.setColor(Color.parseColor("#FFFFFFFF"));
        this.Qhi.setStyle(Paint.Style.STROKE);
        this.Qhi.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.CJ = ofFloat;
        ofFloat.setDuration(200L);
    }

    public void cJ() {
        clearAnimation();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.Qhi.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.cJ, this.Qhi);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.cJ = 10;
        ac();
    }

    public void Qhi() {
        int min = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        f8319ac = min;
        ValueAnimator ofInt = ValueAnimator.ofInt(10, min);
        ofInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SplashDiffuseView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SplashDiffuseView.this.cJ = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SplashDiffuseView.this.invalidate();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SplashDiffuseView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SplashDiffuseView.this.CJ.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                SplashDiffuseView.this.setVisibility(0);
                SplashDiffuseView.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        ofInt.start();
    }
}

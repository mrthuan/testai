package com.bytedance.sdk.openadsdk.core.customview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import lib.zj.office.fc.hpsf.Constants;

/* loaded from: classes.dex */
public class PAGProgressBar extends FrameLayout {
    private Drawable CJ;
    private int Qhi;
    private ValueAnimator ROR;
    private boolean Sf;
    private boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private Drawable f9032ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Drawable f9033fl;

    public PAGProgressBar(Context context) {
        super(context);
        this.Qhi = 100;
    }

    private void Qhi() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, Constants.CP_MAC_ROMAN);
        this.ROR = ofInt;
        ofInt.setDuration(2000L);
        this.ROR.setRepeatCount(-1);
        this.ROR.setInterpolator(new LinearInterpolator());
        this.ROR.setRepeatMode(1);
        this.ROR.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PAGProgressBar.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.ROR.start();
        setMax(Constants.CP_MAC_ROMAN);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Tgh = true;
        if (this.f9033fl != null) {
            Qhi();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Tgh = false;
        ValueAnimator valueAnimator = this.ROR;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.ROR.removeAllUpdateListeners();
            this.ROR = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            if (this.Sf) {
                this.Sf = false;
                ValueAnimator valueAnimator = this.ROR;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    Qhi();
                    return;
                }
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.ROR;
        if (valueAnimator2 != null && !this.Sf) {
            this.Sf = true;
            valueAnimator2.pause();
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.f9033fl = drawable;
        setProgressDrawable(drawable);
        if (this.Tgh && this.ROR == null) {
            Qhi();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(Qhi.Qhi(this, layoutParams));
    }

    public void setMax(int i10) {
        this.Qhi = i10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setProgress(int i10) {
        this.cJ = i10;
        Drawable drawable = this.f9032ac;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.Qhi));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.CJ = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.CJ;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.CJ).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.f9032ac = drawable3;
                }
            }
        }
        Drawable drawable4 = this.CJ;
        if (drawable4 instanceof RotateDrawable) {
            this.f9032ac = drawable4;
        }
    }

    public PAGProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Qhi = 100;
    }
}

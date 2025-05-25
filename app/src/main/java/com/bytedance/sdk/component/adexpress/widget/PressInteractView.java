package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class PressInteractView extends FrameLayout {
    private AnimatorSet CJ;
    private Context Qhi;
    private TextView Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private SplashDiffuseView f8300ac;
    private ImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8301fl;

    public PressInteractView(Context context) {
        super(context);
        this.f8301fl = true;
        this.Qhi = context;
        this.CJ = new AnimatorSet();
        ac();
        CJ();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.PressInteractView.1
            @Override // java.lang.Runnable
            public void run() {
                int Qhi = (int) CQU.Qhi(PressInteractView.this.Qhi, 50.0f);
                int Qhi2 = (int) CQU.Qhi(PressInteractView.this.Qhi, 50.0f);
                if (PressInteractView.this.f8300ac.getMeasuredHeight() > 0) {
                    Qhi = PressInteractView.this.f8300ac.getMeasuredHeight();
                }
                if (PressInteractView.this.f8300ac.getMeasuredWidth() > 0) {
                    Qhi2 = PressInteractView.this.f8300ac.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressInteractView.this.cJ.getLayoutParams();
                layoutParams.topMargin = ((int) ((Qhi / 2.0f) - CQU.Qhi(PressInteractView.this.getContext(), 5.0f))) + ((int) CQU.Qhi(PressInteractView.this.Qhi, 40.0f));
                layoutParams.leftMargin = ((int) ((Qhi2 / 2.0f) - CQU.Qhi(PressInteractView.this.getContext(), 5.0f))) + ((int) CQU.Qhi(PressInteractView.this.Qhi, 20.0f));
                layoutParams.bottomMargin = (int) (CQU.Qhi(PressInteractView.this.getContext(), 5.0f) + ((-Qhi) / 2.0f));
                layoutParams.rightMargin = (int) (CQU.Qhi(PressInteractView.this.getContext(), 5.0f) + ((-Qhi2) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                PressInteractView.this.cJ.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.Tgh.setVisibility(0);
        this.Tgh.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.Tgh.setTextColor(i10);
    }

    private void CJ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.cJ, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat.setDuration(600L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.PressInteractView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (PressInteractView.this.f8301fl) {
                    PressInteractView.this.f8300ac.Qhi();
                }
                PressInteractView pressInteractView = PressInteractView.this;
                pressInteractView.f8301fl = !pressInteractView.f8301fl;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(PressInteractView.this.cJ, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                PressInteractView.this.cJ.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.cJ, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat2.setDuration(600L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.CJ.playTogether(ofFloat, ofFloat2);
    }

    private void ac() {
        this.f8300ac = new SplashDiffuseView(this.Qhi);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) CQU.Qhi(this.Qhi, 50.0f), (int) CQU.Qhi(this.Qhi, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) CQU.Qhi(this.Qhi, 40.0f);
        int Qhi = (int) CQU.Qhi(this.Qhi, 20.0f);
        layoutParams.leftMargin = Qhi;
        layoutParams.setMarginStart(Qhi);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.f8300ac, layoutParams);
        this.cJ = new ImageView(this.Qhi);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) CQU.Qhi(this.Qhi, 78.0f), (int) CQU.Qhi(this.Qhi, 78.0f));
        this.cJ.setImageResource(MQ.CJ(this.Qhi, "tt_splash_hand"));
        addView(this.cJ, layoutParams2);
        TextView textView = new TextView(this.Qhi);
        this.Tgh = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) CQU.Qhi(this.Qhi, 10.0f);
        addView(this.Tgh, layoutParams3);
        this.Tgh.setVisibility(8);
    }

    public void cJ() {
        AnimatorSet animatorSet = this.CJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        SplashDiffuseView splashDiffuseView = this.f8300ac;
        if (splashDiffuseView != null) {
            splashDiffuseView.cJ();
        }
        ImageView imageView = this.cJ;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void Qhi() {
        this.CJ.start();
    }
}

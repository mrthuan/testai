package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class PressButtonInteractView extends FrameLayout {
    private AnimatorSet CJ;
    private Context Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private SplashDiffuseView f8298ac;
    private ImageView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8299fl;

    public PressButtonInteractView(Context context) {
        super(context);
        this.f8299fl = true;
        this.Qhi = context;
        this.CJ = new AnimatorSet();
        ac();
        CJ();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.cJ.getLayoutParams();
                layoutParams.topMargin = (int) ((PressButtonInteractView.this.f8298ac.getMeasuredHeight() / 2.0f) - CQU.Qhi(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((PressButtonInteractView.this.f8298ac.getMeasuredWidth() / 2.0f) - CQU.Qhi(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (CQU.Qhi(PressButtonInteractView.this.getContext(), 5.0f) + ((-PressButtonInteractView.this.f8298ac.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (CQU.Qhi(PressButtonInteractView.this.getContext(), 5.0f) + ((-PressButtonInteractView.this.f8298ac.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                PressButtonInteractView.this.cJ.setLayoutParams(layoutParams);
            }
        });
    }

    private void CJ() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.cJ, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.f8299fl) {
                    PressButtonInteractView.this.f8298ac.Qhi();
                }
                PressButtonInteractView pressButtonInteractView = PressButtonInteractView.this;
                pressButtonInteractView.f8299fl = !pressButtonInteractView.f8299fl;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(PressButtonInteractView.this.cJ, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                PressButtonInteractView.this.cJ.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.cJ, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.CJ.playTogether(ofFloat, ofFloat2);
    }

    private void ac() {
        this.f8298ac = new SplashDiffuseView(this.Qhi);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) CQU.Qhi(this.Qhi, 40.0f), (int) CQU.Qhi(this.Qhi, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.f8298ac, layoutParams);
        this.cJ = new ImageView(this.Qhi);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) CQU.Qhi(this.Qhi, 62.0f), (int) CQU.Qhi(this.Qhi, 62.0f));
        layoutParams2.gravity = 16;
        this.cJ.setImageResource(MQ.CJ(this.Qhi, "tt_splash_hand"));
        addView(this.cJ, layoutParams2);
    }

    public void cJ() {
        AnimatorSet animatorSet = this.CJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        SplashDiffuseView splashDiffuseView = this.f8298ac;
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

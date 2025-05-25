package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;

/* loaded from: classes.dex */
public class DynamicBaseScrollWidgetImp extends DynamicBaseWidgetImp {
    private int MQ;
    ObjectAnimator Qhi;
    ObjectAnimator cJ;
    private Runnable qMt;

    public DynamicBaseScrollWidgetImp(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        this.MQ = 0;
        this.qMt = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicBaseScrollWidgetImp.this.Qhi();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Tgh
    public void cJ() {
        removeCallbacks(this.qMt);
        ObjectAnimator objectAnimator = this.Qhi;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.Qhi.cancel();
        }
        ObjectAnimator objectAnimator2 = this.cJ;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.cJ.cancel();
        }
        super.cJ();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.Sf - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.qMt, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi() {
        final View childAt = getChildAt(this.MQ);
        final View childAt2 = getChildAt((this.MQ + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(getChildAt(this.MQ).getHeight() + this.Sf)) / 2);
        this.Qhi = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.Qhi.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + this.Sf) / 2, 0.0f);
        this.cJ = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.cJ.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseScrollWidgetImp.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        this.Qhi.setDuration(500L);
        this.cJ.setDuration(500L);
        this.Qhi.start();
        this.cJ.start();
        int i10 = this.MQ + 1;
        this.MQ = i10;
        this.MQ = i10 % getChildCount();
        postDelayed(this.qMt, 2000L);
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;

/* loaded from: classes.dex */
public class DynamicBaseInternalScrollWidgetImp extends DynamicBaseWidgetImp {
    private Runnable EBS;
    private int MQ;
    ObjectAnimator Qhi;
    ObjectAnimator cJ;
    private boolean qMt;

    public DynamicBaseInternalScrollWidgetImp(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        this.MQ = 0;
        this.qMt = false;
        this.EBS = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicBaseInternalScrollWidgetImp.this.Qhi();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Tgh
    public void cJ() {
        removeCallbacks(this.EBS);
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
        postDelayed(this.EBS, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi() {
        final View childAt;
        final View childAt2 = getChildAt(this.MQ);
        int i10 = this.MQ;
        if (i10 == 0) {
            this.qMt = false;
        }
        if (i10 + 1 < getChildCount() && ((ViewGroup) getChildAt(this.MQ + 1)).getChildCount() > 0) {
            childAt = getChildAt(this.MQ + 1);
            this.Qhi = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(getChildAt(this.MQ).getWidth() + this.ROR)) / 2);
        } else {
            this.qMt = true;
            childAt = getChildAt(this.MQ - 1);
            this.Qhi = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (getChildAt(this.MQ).getWidth() + this.ROR) / 2);
        }
        this.Qhi.setInterpolator(new LinearInterpolator());
        this.Qhi.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
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
        if (this.qMt) {
            this.cJ = ObjectAnimator.ofFloat(childAt, "translationX", (-(childAt.getWidth() + this.ROR)) / 2, 0.0f);
        } else {
            this.cJ = ObjectAnimator.ofFloat(childAt, "translationX", (childAt.getWidth() + this.ROR) / 2, 0.0f);
        }
        this.cJ.setInterpolator(new LinearInterpolator());
        this.cJ.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseInternalScrollWidgetImp.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt.setVisibility(0);
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
        if (this.qMt) {
            this.MQ--;
        } else {
            this.MQ++;
        }
        postDelayed(this.EBS, 2000L);
    }
}

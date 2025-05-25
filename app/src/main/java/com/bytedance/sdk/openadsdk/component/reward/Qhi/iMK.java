package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.PAGFullScreenLoadingLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLoadingBar;

/* compiled from: RewardFullVideoLoadingManager.java */
/* loaded from: classes.dex */
public class iMK {
    private final int CJ;
    PAGLoadingBar Qhi;
    private AnimatorSet ROR;
    private PAGFullScreenLoadingLayout Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final Context f8825ac;
    private final tP cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final Qhi f8826fl;

    public iMK(Qhi qhi) {
        this.f8825ac = qhi.f8800ip;
        this.cJ = qhi.cJ;
        this.CJ = qhi.Dq;
        this.f8826fl = qhi;
    }

    public View CJ() {
        return this.Tgh;
    }

    public void Qhi() {
        try {
            if (bxS.Gm(this.cJ)) {
                return;
            }
            PAGFullScreenLoadingLayout pAGFullScreenLoadingLayout = new PAGFullScreenLoadingLayout(this.f8825ac);
            this.Tgh = pAGFullScreenLoadingLayout;
            this.Qhi = pAGFullScreenLoadingLayout.getLoadingProgressBar();
            PAGTextView downloadButton = this.Tgh.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.f8826fl.aP.fl());
            }
            this.Tgh.Qhi(this.cJ, this.CJ);
        } catch (Throwable unused) {
        }
    }

    public void ac() {
        AnimatorSet animatorSet = this.ROR;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void cJ() {
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 80);
        ofInt.setDuration(2000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.iMK.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                PAGLoadingBar pAGLoadingBar = iMK.this.Qhi;
                if (pAGLoadingBar != null) {
                    pAGLoadingBar.setProgress(intValue);
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(81, 99);
        ofInt2.setDuration(3000L);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.iMK.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                PAGLoadingBar pAGLoadingBar = iMK.this.Qhi;
                if (pAGLoadingBar != null) {
                    pAGLoadingBar.setProgress(intValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.ROR = animatorSet;
        animatorSet.play(ofInt).before(ofInt2);
        this.ROR.start();
    }
}

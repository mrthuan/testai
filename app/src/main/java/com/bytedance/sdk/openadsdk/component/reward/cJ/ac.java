package com.bytedance.sdk.openadsdk.component.reward.cJ;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.model.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zc;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: RewardFullLandingPageType.java */
/* loaded from: classes.dex */
public class ac extends cJ {
    public ac(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        super(qhi);
    }

    private static ImageView CJ(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        pAGImageView.setImageResource(MQ.CJ(context, "tt_up_slide"));
        pAGImageView.setId(iMK.bxS);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(zn.cJ(context, 18.0f), zn.cJ(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = zn.cJ(context, 45.0f);
        pAGImageView.setLayoutParams(layoutParams);
        return pAGImageView;
    }

    public static boolean Qhi(tP tPVar) {
        return HzH.cJ(tPVar) || HzH.ac(tPVar) || HzH.CJ(tPVar);
    }

    private static LinearLayout ac(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(iMK.EBS);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setVisibility(8);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return pAGLinearLayout;
    }

    public static void cJ(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(iMK.Jma);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(pAGFrameLayout, layoutParams);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(context);
        pAGFrameLayout2.setId(iMK.WAv);
        pAGFrameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout2.addView(cJ.Qhi(context));
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(context);
        pAGFrameLayout3.setId(iMK.kYc);
        pAGFrameLayout3.setVisibility(8);
        pAGFrameLayout3.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        pAGFrameLayout2.addView(pAGFrameLayout3, layoutParams2);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(iMK.tP);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pAGFrameLayout3.addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.Qhi.cJ(pAGFrameLayout);
        PAGFrameLayout pAGFrameLayout4 = new PAGFrameLayout(context);
        pAGFrameLayout4.setId(iMK.MQ);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        pAGLinearLayout.addView(pAGFrameLayout4, layoutParams3);
        pAGFrameLayout4.addView(cJ(context));
        LinearLayout ac2 = ac(context);
        ac2.setBackgroundColor(Color.parseColor("#70161823"));
        pAGFrameLayout4.addView(ac2);
        ac2.addView(CJ(context));
        com.bytedance.sdk.openadsdk.component.reward.view.Qhi.Qhi(pAGFrameLayout4);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void ABk() {
        com.bytedance.sdk.openadsdk.component.reward.view.Tgh tgh;
        HzH hzH;
        if (HzH.cJ(this.Qhi.cJ) && (tgh = this.Qhi.es) != null && (hzH = tgh.pA) != null) {
            if (hzH.ac()) {
                this.Qhi.es.cJ(0);
                this.Qhi.hpZ.set(true);
            } else {
                this.Qhi.HzH.set(true);
                Qhi(true, false, true, 80);
            }
        }
        if (HzH.ac(this.Qhi.cJ) || HzH.CJ(this.Qhi.cJ)) {
            Qhi(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public RFEndCardBackUpLayout Sf() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean Tgh() {
        if (HzH.cJ(this.Qhi.cJ)) {
            return true;
        }
        if (!HzH.ac(this.Qhi.cJ) && !HzH.CJ(this.Qhi.cJ)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean fl() {
        return true;
    }

    public static void Qhi(tP tPVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        if (HzH.cJ(tPVar)) {
            cJ(frameLayout);
        } else if (!HzH.ac(tPVar) && !HzH.CJ(tPVar)) {
            cJ.Qhi(frameLayout, qhi);
        } else {
            ac(frameLayout);
        }
    }

    public static void ac(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(iMK.MQ);
        frameLayout.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(cJ(context));
        LinearLayout ac2 = ac(context);
        ac2.setBackgroundColor(Color.parseColor("#99161823"));
        pAGFrameLayout.addView(ac2);
        ac2.addView(CJ(context));
        com.bytedance.sdk.openadsdk.component.reward.view.Qhi.Qhi(pAGFrameLayout);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(context);
        pAGFrameLayout2.setId(iMK.Jma);
        frameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(context);
        pAGFrameLayout3.setId(iMK.WAv);
        pAGFrameLayout2.addView(pAGFrameLayout3, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout3.addView(cJ.Qhi(context));
        PAGFrameLayout pAGFrameLayout4 = new PAGFrameLayout(context);
        pAGFrameLayout4.setId(iMK.kYc);
        pAGFrameLayout4.setVisibility(8);
        pAGFrameLayout4.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGFrameLayout3.addView(pAGFrameLayout4, layoutParams);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(iMK.tP);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pAGFrameLayout4.addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.Qhi.cJ(pAGFrameLayout2);
        View playableLoadingView = new PlayableLoadingView(context);
        playableLoadingView.setId(iMK.js);
        playableLoadingView.setClickable(true);
        playableLoadingView.setFocusable(true);
        frameLayout.addView(playableLoadingView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void Qhi(RewardFullBaseLayout rewardFullBaseLayout) {
        Qhi(this.cJ, rewardFullBaseLayout, this.Qhi);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void Qhi(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi;
        zc zcVar;
        if (!HzH.ac(this.Qhi.cJ) || (zcVar = (qhi = this.Qhi).gga) == null) {
            return;
        }
        zcVar.Qhi(qhi.cJ.hm().cJ() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void ROR() {
    }

    private static SSWebView cJ(Context context) {
        SSWebView sSWebView = new SSWebView(context, true);
        sSWebView.setId(iMK.qMt);
        sSWebView.setLayerType(2, null);
        sSWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return sSWebView;
    }
}

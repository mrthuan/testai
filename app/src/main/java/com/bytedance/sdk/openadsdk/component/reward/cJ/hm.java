package com.bytedance.sdk.openadsdk.component.reward.cJ;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.cJ.cJ;
import com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: RewardFullTypeInteraction.java */
/* loaded from: classes.dex */
public class hm extends cJ {
    private FullInteractionStyleView pA;

    public hm(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        super(qhi);
    }

    private boolean sDy() {
        return tP.fl(this.cJ);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public cJ.Qhi CJ() {
        return new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.cJ.hm.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ.Qhi
            public void Qhi(boolean z10) {
                if (hm.this.pA != null) {
                    hm.this.pA.setIsMute(z10);
                }
            }
        };
    }

    public FrameLayout NFd() {
        FullInteractionStyleView fullInteractionStyleView = this.pA;
        if (fullInteractionStyleView != null) {
            return fullInteractionStyleView.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void ROR() {
        boolean z10;
        this.Tgh.ac(8);
        this.Tgh.cJ(8);
        if (this.cJ.EBS() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.Sf.Qhi(false);
            this.Sf.ac(false);
            this.Sf.CJ(false);
            this.Tgh.fl(8);
            return;
        }
        this.Sf.Qhi(this.cJ.rB());
        this.Sf.ac(sDy());
        this.Sf.CJ(sDy());
        if (sDy()) {
            this.Tgh.fl(8);
            return;
        }
        this.Sf.Tgh();
        this.Tgh.fl(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean Tgh() {
        return sDy();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean fl() {
        return sDy();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void Qhi(FrameLayout frameLayout) {
        FullInteractionStyleView fullInteractionStyleView = new FullInteractionStyleView(this.Qhi.FQ, this.Gm);
        this.pA = fullInteractionStyleView;
        fullInteractionStyleView.setDownloadListener(this.f8858zc);
        FullInteractionStyleView fullInteractionStyleView2 = this.pA;
        tP tPVar = this.cJ;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        fullInteractionStyleView2.Qhi(tPVar, qhi.Hf, qhi.Dq, this.f8855ac, this.CJ);
        frameLayout.addView(this.pA.getInteractionStyleRootView());
    }

    public static boolean Qhi(tP tPVar) {
        return (tPVar.LpL() || tPVar.Oy() == 100.0f) ? false : true;
    }
}

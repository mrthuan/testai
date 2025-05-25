package com.bytedance.sdk.openadsdk.component.reward.cJ;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: RewardFullTypePlayable.java */
/* loaded from: classes.dex */
public class WAv extends cJ {
    public WAv(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        super(qhi);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void HzH() {
        if (bxS.ac(this.cJ) && this.Qhi.lG.zn() && !this.Qhi.lG.FQ()) {
            kYc();
        }
        if (bxS.cJ(this.Qhi.cJ)) {
            if (DeviceUtils.ROR() == 0) {
                this.Qhi.dIT = true;
            }
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            if (qhi.dIT) {
                qhi.js.cJ(true);
                this.Qhi.lB.Qhi(true);
            }
        }
        this.Qhi.gga.Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void MQ() {
        super.MQ();
        if (bxS.Gm(this.Qhi.cJ)) {
            this.WAv.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
            this.Qhi.CQU.Qhi("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void Qhi(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean Tgh() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean fl() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void qMt() {
        super.qMt();
        if (bxS.Gm(this.Qhi.cJ)) {
            this.WAv.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
            this.Qhi.CQU.Qhi("go_background");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void tP() {
        if (this.Qhi.CQU.WAv() && bxS.Gm(this.Qhi.cJ)) {
            this.Qhi.CQU.Qhi("return_foreground");
            com.bytedance.sdk.openadsdk.core.widget.Qhi qhi = this.ABk;
            if ((qhi == null || !qhi.isShowing()) && this.Qhi.CQU.zc() >= 0) {
                this.Qhi.CQU.Qhi(0L);
            }
        }
    }

    public static boolean Qhi(tP tPVar) {
        return bxS.cJ(tPVar) || bxS.Gm(tPVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void ROR() {
    }
}

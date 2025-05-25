package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.HzH;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: RewardFullBackUpEndCard.java */
/* loaded from: classes.dex */
public class cJ {
    private HzH CJ;
    private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8887ac;
    private RFEndCardBackUpLayout cJ;

    public cJ(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.Qhi = qhi;
    }

    public void CJ() {
        HzH hzH = this.CJ;
        if (hzH != null) {
            hzH.cJ();
        }
    }

    public void Qhi() {
        if (this.f8887ac) {
            return;
        }
        this.f8887ac = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.Qhi.yN.findViewById(iMK.rB);
        this.cJ = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.Qhi(this.Qhi);
        }
        if (this.Qhi.cJ.IC()) {
            this.CJ = new HzH(this.Qhi);
        }
    }

    public void ac() {
        HzH hzH = this.CJ;
        if (hzH != null) {
            hzH.Qhi();
        }
    }

    public void cJ() {
        zn.Qhi((View) this.cJ, 0);
    }

    public boolean fl() {
        HzH hzH = this.CJ;
        if (hzH != null) {
            return hzH.ac();
        }
        return false;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.cJ.Tgh tgh) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.cJ;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        zn.Qhi(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.cJ.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        HzH hzH = this.CJ;
        if (hzH != null) {
            hzH.Qhi(tgh);
        }
    }

    public boolean Qhi(pA pAVar) {
        HzH hzH = this.CJ;
        if (hzH != null && hzH.Qhi(pAVar)) {
            zn.Qhi((View) this.cJ, 0);
            return true;
        }
        return false;
    }

    public void Qhi(int i10) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.cJ;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i10);
    }
}

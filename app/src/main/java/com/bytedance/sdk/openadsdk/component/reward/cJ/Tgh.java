package com.bytedance.sdk.openadsdk.component.reward.cJ;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.cJ.pA;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.model.MQ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullTypeDoubleAds.java */
/* loaded from: classes.dex */
public class Tgh extends cJ implements com.bytedance.sdk.openadsdk.WAv.ROR {
    private boolean hpZ;
    private final MQ pA;

    public Tgh(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        super(qhi);
        this.pA = (MQ) qhi.cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void Qhi(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean Tgh() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean aP() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.Qhi
    public boolean cJ() {
        return this.hpZ;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean fl() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void pM() {
        NFd jsObject;
        if (this.Qhi.FQ.isFinishing()) {
            return;
        }
        if (!this.Qhi.pM.Sf() && !this.hpZ) {
            FullRewardExpressView Qhi = this.Qhi.pM.Qhi();
            if (Qhi != null && (jsObject = Qhi.getJsObject()) != null) {
                jsObject.Qhi(this);
                return;
            }
            return;
        }
        super.pM();
        if (this.Qhi.pM.Sf()) {
            Eh();
            this.Qhi.f8802zn.cJ();
        }
    }

    public static void Qhi(tP tPVar, boolean z10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_backup", Boolean.valueOf(z10));
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi("choose_ad_start_show", tPVar, str, hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("req_id", tPVar.jWV());
            jSONObject.put("is_backup", z10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi("choose_ad_start_show", jSONObject);
    }

    public void cJ(boolean z10) {
        if (this.hpZ) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("has_focus", Boolean.valueOf(z10));
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi("choose_ad_focus_changed", this.pA, this.Qhi.f8798fl, hashMap);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void Qhi(RewardFullBaseLayout rewardFullBaseLayout) {
        if (ac.Qhi(this.pA)) {
            ac.Qhi(this.pA, rewardFullBaseLayout, this.Qhi);
        } else {
            super.Qhi(rewardFullBaseLayout);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.WAv.ROR
    public void Qhi(int i10, long j10) {
        this.hpZ = true;
        int i11 = i10 - 1;
        this.pA.jPH(i11);
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.pA, this.Qhi.f8798fl, i10, j10);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi(this.pA.XJ(), i11, this.Qhi.CJ);
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.cJ.Tgh.1
            @Override // java.lang.Runnable
            public void run() {
                Tgh.this.pM();
                Tgh tgh = Tgh.this;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = tgh.Qhi;
                if (qhi.jPH) {
                    tgh.Eh();
                    Tgh.this.Qhi.f8802zn.cJ();
                    return;
                }
                Tgh.Qhi Tgh = qhi.f8802zn.Tgh();
                if (Tgh != null) {
                    Tgh.hpZ();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.WAv.ROR
    public void Qhi(pA pAVar) {
        this.Qhi.pM.Qhi().cJ(pAVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void ROR() {
    }
}

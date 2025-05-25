package com.bytedance.sdk.openadsdk.component.reward.cJ;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.component.reward.view.RatioImageView;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.js;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.HashMap;
import java.util.List;

/* compiled from: RewardFullTypeImage.java */
/* loaded from: classes.dex */
public class Sf extends cJ {
    private RatioImageView HzH;
    private ViewGroup hpZ;
    private String kYc;
    private final int pA;

    public Sf(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        super(qhi);
        this.kYc = "fullscreen_interstitial_ad";
        this.pA = this.cJ.gga();
    }

    private void NFd() {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayout = new FrameLayout(this.Qhi.FQ);
        this.hpZ = frameLayout;
        frameLayout.setId(iMK.jN);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.hpZ.setLayoutParams(layoutParams2);
        View Gm = this.Qhi.es.Gm();
        if (Gm != null) {
            layoutParams2.bottomMargin = Gm.getHeight();
        }
        RatioImageView ratioImageView = new RatioImageView(this.Qhi.FQ);
        this.HzH = ratioImageView;
        ratioImageView.setId(iMK.TKG);
        if (this.Qhi.cJ.SL() == 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
        }
        layoutParams.gravity = 17;
        this.HzH.setLayoutParams(layoutParams);
        this.hpZ.addView(this.HzH);
        sDy();
    }

    private void Qhi(ImageView imageView) {
        List<hpZ> cjC;
        hpZ hpz;
        tP tPVar = this.cJ;
        if (tPVar == null || (cjC = tPVar.cjC()) == null || cjC.size() <= 0 || (hpz = cjC.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ROR.fl.Qhi(cjC.get(0)).ac(2).Qhi(com.bytedance.sdk.openadsdk.ROR.ac.Qhi(this.cJ, hpz.Qhi(), imageView));
    }

    private com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl ac(tP tPVar) {
        if (tPVar.ip() == 4) {
            return new com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.ac(HzH.Qhi(), tPVar, this.kYc);
        }
        return null;
    }

    private void cJ(tP tPVar) {
        RatioImageView ratioImageView;
        if (tPVar != null && (ratioImageView = this.HzH) != null) {
            int i10 = this.pA;
            if (i10 == 33) {
                ratioImageView.setRatio(1.0f);
            } else if (i10 == 3) {
                ratioImageView.setRatio(1.91f);
            } else {
                ratioImageView.setRatio(0.56f);
            }
            Qhi((ImageView) this.HzH);
        }
    }

    private boolean lB() {
        tP tPVar = this.cJ;
        if (tPVar == null || tPVar.EBS() != 2) {
            return false;
        }
        return true;
    }

    private void sDy() {
        if (this.hpZ == null) {
            return;
        }
        Qhi((View) this.HzH);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void ROR() {
        boolean z10;
        if (com.bytedance.sdk.openadsdk.core.model.HzH.cJ(this.cJ)) {
            this.Tgh.cJ(8);
        }
        this.Sf.ac(false);
        this.Sf.CJ(false);
        if (this.cJ.EBS() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.Sf.Qhi(false);
            this.Tgh.fl(8);
            return;
        }
        this.Sf.Qhi(this.cJ.rB());
        if (this.Qhi.EGK) {
            Message obtain = Message.obtain();
            obtain.what = OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK;
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            int aP = (int) (qhi.bxS.aP() * 1000.0d);
            qhi.f8799hm = aP;
            obtain.arg1 = aP;
            this.Qhi.xyz.sendMessage(obtain);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean Tgh() {
        return lB();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public boolean fl() {
        if (!lB() && !bxS.cJ(this.cJ)) {
            return false;
        }
        return true;
    }

    public void Qhi(View view) {
        if (view == null || this.Qhi.FQ == null || this.cJ == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar = this.f8858zc;
        if (cJVar == null) {
            Activity activity = this.Qhi.FQ;
            tP tPVar = this.cJ;
            String str = this.kYc;
            cJVar = new com.bytedance.sdk.openadsdk.core.cJ.Qhi(activity, tPVar, str, js.Qhi(str));
            cJVar.Qhi(ac(this.cJ));
            HashMap hashMap = new HashMap();
            if (bxS.Gm(this.cJ)) {
                hashMap.put("click_scence", 3);
            } else {
                hashMap.put("click_scence", 1);
            }
            cJVar.Qhi(hashMap);
        }
        Activity activity2 = this.Qhi.FQ;
        if (activity2 != null) {
            cJVar.Qhi(activity2);
        }
        view.setOnTouchListener(cJVar);
        view.setOnClickListener(cJVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void Qhi(FrameLayout frameLayout) {
        try {
            NFd();
            cJ(this.cJ);
            frameLayout.addView(this.hpZ);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.cJ
    public void Qhi(RewardFullBaseLayout rewardFullBaseLayout) {
        if (com.bytedance.sdk.openadsdk.core.model.HzH.cJ(this.cJ)) {
            ac.cJ(rewardFullBaseLayout);
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            qhi.gga.Qhi((long) (qhi.bxS.aP() * 1000.0d));
        } else if (!com.bytedance.sdk.openadsdk.core.model.HzH.ac(this.cJ) && !com.bytedance.sdk.openadsdk.core.model.HzH.CJ(this.cJ)) {
            super.Qhi(rewardFullBaseLayout);
        } else {
            ac.ac(rewardFullBaseLayout);
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
            qhi2.gga.Qhi((long) (qhi2.bxS.aP() * 1000.0d));
        }
    }

    public static boolean Qhi(tP tPVar) {
        return !tP.fl(tPVar) && tPVar.Oy() == 100.0f;
    }
}

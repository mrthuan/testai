package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.cJ.pA;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.core.model.MQ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.ABk;
import com.bytedance.sdk.openadsdk.core.nativeexpress.FullRewardExpressBackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.kYc;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class FullRewardExpressView extends NativeExpressView {
    public static float Qhi = 100.0f;
    private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi CJ;

    /* renamed from: ac  reason: collision with root package name */
    FullRewardExpressBackupView f8870ac;
    ABk cJ;

    public FullRewardExpressView(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi, AdSlot adSlot, String str) {
        super(qhi.FQ, qhi.cJ, adSlot, str, qhi.dIT, !qhi.VnT);
        this.CJ = qhi;
    }

    private void ROR() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.cJ.ac() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.1
            @Override // com.bytedance.sdk.component.adexpress.cJ.ac
            public boolean Qhi(ViewGroup viewGroup, int i10) {
                try {
                    ((NativeExpressView) viewGroup).zc();
                    FullRewardExpressView.this.f8870ac = new FullRewardExpressBackupView(viewGroup.getContext());
                    FullRewardExpressView fullRewardExpressView = FullRewardExpressView.this;
                    fullRewardExpressView.f8870ac.Qhi(((NativeExpressView) fullRewardExpressView).Gm, (NativeExpressView) viewGroup, FullRewardExpressView.this.CJ.yN);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(pA pAVar) {
        if (pAVar == null) {
            return;
        }
        double Tgh = pAVar.Tgh();
        double ROR = pAVar.ROR();
        double Sf = pAVar.Sf();
        double hm2 = pAVar.hm();
        int cJ = zn.cJ(this.Sf, (float) Tgh);
        int cJ2 = zn.cJ(this.Sf, (float) ROR);
        int cJ3 = zn.cJ(this.Sf, (float) Sf);
        int cJ4 = zn.cJ(this.Sf, (float) hm2);
        if ((hm2 == 0.0d || Sf == 0.0d) && this.aP.ac() != 7) {
            return;
        }
        if (this.aP.ac() == 7 && (pAVar instanceof com.bytedance.sdk.openadsdk.core.ugen.ac.cJ)) {
            FrameLayout hpZ = ((com.bytedance.sdk.openadsdk.core.ugen.ac.cJ) pAVar).hpZ();
            if (hpZ != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                hpZ.addView(this.f9133zc, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f9133zc.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(cJ3, cJ4);
        }
        layoutParams2.width = cJ3;
        layoutParams2.height = cJ4;
        layoutParams2.topMargin = cJ2;
        layoutParams2.leftMargin = cJ;
        layoutParams2.setMarginStart(cJ);
        layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        this.f9133zc.setLayoutParams(layoutParams2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public int CJ() {
        ABk aBk = this.cJ;
        if (aBk != null) {
            return aBk.CJ();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public void Tgh() {
        this.iMK = true;
        this.f9133zc = new FrameLayout(this.Sf);
        if (!com.bytedance.sdk.openadsdk.core.ugen.ac.Qhi(this.Gm)) {
            addView(this.f9133zc, new FrameLayout.LayoutParams(-1, -1));
        }
        super.Tgh();
        SSWebView webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        ROR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void fl() {
        ABk aBk = this.cJ;
        if (aBk != null) {
            aBk.fl();
        }
    }

    public View getBackupContainerBackgroundView() {
        if (ABk()) {
            return this.f8870ac.getBackupContainerBackgroundView();
        }
        return null;
    }

    public FrameLayout getVideoFrameLayout() {
        if (ABk()) {
            return this.f8870ac.getVideoContainer();
        }
        return this.f9133zc;
    }

    public void setExpressVideoListenerProxy(ABk aBk) {
        this.cJ = aBk;
    }

    public void cJ(final pA pAVar) {
        if (pAVar == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView.2
            @Override // java.lang.Runnable
            public void run() {
                FullRewardExpressView.this.ac(pAVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.cJ.hpZ
    public void Qhi(com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar, pA pAVar) {
        this.aP = flVar;
        tP tPVar = this.Gm;
        if (tPVar != null && tPVar.Ewb()) {
            super.Qhi(flVar, pAVar);
            return;
        }
        if (flVar instanceof kYc) {
            kYc kyc = (kYc) flVar;
            if (kyc.hpZ() != null) {
                kyc.hpZ().Qhi((ABk) this);
            }
        }
        if (pAVar != null && pAVar.ac()) {
            cJ(pAVar);
        }
        super.Qhi(flVar, pAVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void cJ() {
        ABk aBk = this.cJ;
        if (aBk != null) {
            aBk.cJ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void cJ(int i10) {
        ABk aBk = this.cJ;
        if (aBk != null) {
            aBk.cJ(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public boolean Qhi(pA pAVar) {
        tP tPVar = this.Gm;
        if ((tPVar instanceof MQ) && ((MQ) tPVar).mvd() && pAVar.ac() && pAVar.cJ() == 1) {
            return false;
        }
        return super.Qhi(pAVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi(boolean z10) {
        ABk aBk = this.cJ;
        if (aBk != null) {
            aBk.Qhi(z10);
        }
        setSoundMute(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi() {
        ABk aBk = this.cJ;
        if (aBk != null) {
            aBk.Qhi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi(int i10) {
        ABk aBk = this.cJ;
        if (aBk != null) {
            aBk.Qhi(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.cJ.hm
    public void Qhi(View view, int i10, com.bytedance.sdk.component.adexpress.ac acVar) {
        if (i10 != -1 && acVar != null && i10 == 3) {
            fl();
        } else {
            super.Qhi(view, i10, acVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi(int i10, String str) {
        ABk aBk = this.cJ;
        if (aBk != null) {
            aBk.Qhi(i10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public long ac() {
        ABk aBk = this.cJ;
        if (aBk != null) {
            return aBk.ac();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public Tgh.Qhi ac(int i10) {
        com.bytedance.sdk.openadsdk.activity.ROR ror;
        Tgh.Qhi ac2 = super.ac(i10);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.CJ;
        if (qhi.VnT && (ror = qhi.Ura) != null) {
            ac2.cJ = ror.f8522hm;
        }
        return ac2;
    }
}

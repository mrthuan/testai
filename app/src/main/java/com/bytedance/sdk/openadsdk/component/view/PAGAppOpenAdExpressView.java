package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import com.bytedance.sdk.component.adexpress.cJ.pA;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.ugen.ac;
import com.bytedance.sdk.openadsdk.core.ugen.ac.cJ;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGAppOpenAdExpressView extends NativeExpressView {
    private fl.Qhi CJ;
    boolean Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.Tgh.Qhi f8894ac;
    private FrameLayout cJ;

    public PAGAppOpenAdExpressView(Context context, tP tPVar, AdSlot adSlot, String str) {
        super(context, tPVar, adSlot, str, true, true);
        this.Qhi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(pA pAVar) {
        if (pAVar == null) {
            return;
        }
        if (pAVar.Qhi() != null) {
            if (this.Qhi) {
                pAVar.Qhi().setTag(com.bytedance.sdk.component.adexpress.dynamic.Qhi.Tgh, 1);
                ((FrameLayout) pAVar.Qhi()).removeAllViews();
                FrameLayout frameLayout = (FrameLayout) pAVar.Qhi();
                this.cJ = frameLayout;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                this.Qhi = false;
                return;
            }
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
        if (this.aP.ac() == 7 && (pAVar instanceof cJ)) {
            FrameLayout hpZ = ((cJ) pAVar).hpZ();
            if (hpZ != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                hpZ.addView(this.cJ, layoutParams);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.cJ.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(cJ3, cJ4);
        }
        layoutParams2.width = cJ3;
        layoutParams2.height = cJ4;
        layoutParams2.topMargin = cJ2;
        layoutParams2.leftMargin = cJ;
        layoutParams2.setMarginStart(cJ);
        layoutParams2.setMarginEnd(layoutParams2.rightMargin);
        this.cJ.setLayoutParams(layoutParams2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public void Tgh() {
        this.iMK = true;
        this.cJ = new FrameLayout(this.Sf);
        if (!ac.Qhi(this.Gm)) {
            addView(this.cJ, new FrameLayout.LayoutParams(-1, -1));
        }
        super.Tgh();
    }

    public void cJ(final pA pAVar) {
        if (pAVar == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView.1
            @Override // java.lang.Runnable
            public void run() {
                PAGAppOpenAdExpressView.this.ac(pAVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void fl() {
        com.bytedance.sdk.openadsdk.component.Tgh.Qhi qhi = this.f8894ac;
        if (qhi != null) {
            qhi.cJ(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public int getDynamicShowType() {
        if (this.aP == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.component.ROR.Qhi.Qhi(this.Gm, HzH.CJ().ROR(String.valueOf(this.Gm.Hy())));
    }

    public FrameLayout getVideoFrameLayout() {
        return this.cJ;
    }

    public void setExpressVideoListenerProxy(fl.Qhi qhi) {
        this.CJ = qhi;
    }

    public void setTopListener(com.bytedance.sdk.openadsdk.component.Tgh.Qhi qhi) {
        this.f8894ac = qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void cJ() {
        super.cJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.cJ.hpZ
    public void Qhi(com.bytedance.sdk.component.adexpress.cJ.fl<? extends View> flVar, pA pAVar) {
        this.aP = flVar;
        if (pAVar != null && pAVar.ac()) {
            cJ(pAVar);
        }
        super.Qhi(flVar, pAVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi() {
        com.bytedance.sdk.openadsdk.component.Tgh.Qhi qhi = this.f8894ac;
        if (qhi != null) {
            qhi.Qhi(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
    public void Qhi(int i10) {
        super.Qhi(i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.cJ.hm
    public void Qhi(View view, int i10, com.bytedance.sdk.component.adexpress.ac acVar) {
        if (i10 != -1 && acVar != null && i10 == 3) {
            fl();
        } else {
            super.Qhi(view, i10, acVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public void Qhi(iMK.Qhi qhi) {
        qhi.fl(com.bytedance.sdk.openadsdk.component.ROR.Qhi.cJ());
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView
    public void Qhi(JSONObject jSONObject) {
        tP tPVar = this.Gm;
        com.bytedance.sdk.openadsdk.component.ROR.Qhi.Qhi(jSONObject, tPVar == null ? 0 : tPVar.Hy());
    }
}

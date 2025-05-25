package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.view.OpenScreenAdBackupView;
import com.bytedance.sdk.openadsdk.component.view.PAGAppOpenAdExpressView;
import com.bytedance.sdk.openadsdk.core.cJ.cJ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import org.json.JSONObject;

/* compiled from: AppOpenAdExpressManager.java */
/* loaded from: classes.dex */
public class cJ extends ac {
    private boolean Gm;
    private PAGAppOpenAdExpressView WAv;

    public cJ(Activity activity, tP tPVar, FrameLayout frameLayout, Qhi qhi, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.Sf.Qhi qhi2) {
        super(activity, tPVar, frameLayout, qhi, i10, z10, qhi2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.ac
    public int CJ() {
        return this.WAv.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.ac
    public void ac() {
        super.ac();
        PAGAppOpenAdExpressView pAGAppOpenAdExpressView = this.WAv;
        if (pAGAppOpenAdExpressView != null) {
            pAGAppOpenAdExpressView.Gm();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.ac
    public void cJ() {
        this.WAv.hm();
    }

    @Override // com.bytedance.sdk.openadsdk.component.ac
    public void Qhi(ViewGroup viewGroup) {
        tP.Qhi es;
        Pair<Float, Float> Qhi = com.bytedance.sdk.openadsdk.core.nativeexpress.Qhi.Qhi.Qhi(this.Qhi.getWindow(), this.ROR);
        AdSlot build = new AdSlot.Builder().setCodeId(String.valueOf(this.cJ.Hy())).setExpressViewAcceptedSize(((Float) Qhi.first).floatValue(), ((Float) Qhi.second).floatValue()).build();
        if (ABk.CJ() && (es = this.cJ.es()) != null) {
            new StringBuilder("tryDynamicNative: id is ").append(es.fl());
        }
        PAGAppOpenAdExpressView pAGAppOpenAdExpressView = new PAGAppOpenAdExpressView(this.Qhi, this.cJ, build, "open_ad");
        this.WAv = pAGAppOpenAdExpressView;
        pAGAppOpenAdExpressView.setTopListener(this.f8764fl);
        this.WAv.setExpressVideoListenerProxy(this.f8764fl);
        this.WAv.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.cJ.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                cJ.this.f8764fl.CJ();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (cJ.this.WAv.ABk()) {
                    cJ.this.Gm = true;
                    cJ cJVar = cJ.this;
                    cJ.super.Qhi((ViewGroup) cJVar.CJ);
                    cJ.super.Qhi();
                    cJ.super.cJ();
                } else if (cJ.this.cJ.czB()) {
                    cJ.this.f8764fl.ac();
                } else {
                    cJ cJVar2 = cJ.this;
                    if (cJVar2.f8763ac) {
                        if (cJVar2.Qhi(cJVar2.WAv.getVideoFrameLayout())) {
                            cJ.this.f8764fl.ac();
                            return;
                        } else {
                            cJ.this.f8764fl.CJ();
                            return;
                        }
                    }
                    cJVar2.f8764fl.ac();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }
        });
        this.cJ.Sf(1);
        this.CJ.addView(this.WAv, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.ac
    public void Qhi() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.Sf Qhi = com.bytedance.sdk.openadsdk.component.Qhi.cJ.Qhi(this.cJ, this.Qhi, this.f8765hm, this.WAv);
        Qhi.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.cJ.2
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view, int i10) {
                cJ.this.f8764fl.fl();
            }
        });
        this.WAv.setClickListener(Qhi);
        com.bytedance.sdk.openadsdk.core.nativeexpress.ROR cJ = com.bytedance.sdk.openadsdk.component.Qhi.cJ.cJ(this.cJ, this.Qhi, this.f8765hm, this.WAv);
        this.WAv.setClickCreativeListener(cJ);
        cJ.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.cJ.3
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view, int i10) {
                cJ.this.f8764fl.fl();
            }
        });
        this.WAv.setBackupListener(new com.bytedance.sdk.component.adexpress.cJ.ac() { // from class: com.bytedance.sdk.openadsdk.component.cJ.4
            @Override // com.bytedance.sdk.component.adexpress.cJ.ac
            public boolean Qhi(ViewGroup viewGroup, int i10) {
                StringBuilder sb2 = new StringBuilder("isUseBackup() called with: view = [");
                sb2.append(viewGroup);
                sb2.append("], errCode = [");
                sb2.append(i10);
                sb2.append("]");
                try {
                    ((NativeExpressView) viewGroup).zc();
                    new OpenScreenAdBackupView(cJ.this.Qhi).Qhi((NativeExpressView) cJ.this.WAv);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.ac
    public void Qhi(int i10, int i11, boolean z10) {
        if (this.Gm) {
            super.Qhi(i10, i11, z10);
        } else {
            this.WAv.Qhi(String.valueOf(i10), i11, 0, z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.ac
    public JSONObject Qhi(JSONObject jSONObject) {
        return this.WAv.Qhi(jSONObject, this.cJ);
    }
}

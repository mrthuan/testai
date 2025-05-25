package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.cJ.cJ;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: RewardFullExpressManager.java */
/* loaded from: classes.dex */
public class ROR {
    private final Qhi Qhi;

    public ROR(Qhi qhi) {
        this.Qhi = qhi;
    }

    public void Qhi(float[] fArr, final com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar, final com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar2) {
        FrameLayout.LayoutParams layoutParams;
        com.bytedance.sdk.openadsdk.activity.ROR ror;
        com.bytedance.sdk.openadsdk.component.reward.view.ac acVar;
        Arrays.toString(fArr);
        this.Qhi.pM.Qhi(new AdSlot.Builder().setCodeId(String.valueOf(this.Qhi.cJ.Hy())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build());
        Qhi qhi = this.Qhi;
        zc zcVar = qhi.js;
        if (zcVar != null && (acVar = qhi.pM) != null) {
            zcVar.Qhi(acVar.Qhi());
        }
        this.Qhi.pM.Qhi(new com.bytedance.sdk.openadsdk.core.nativeexpress.ABk() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public int CJ() {
                if (ROR.this.Qhi.pM.ac()) {
                    return 4;
                }
                if (ROR.this.Qhi.pM.CJ()) {
                    return 5;
                }
                if (ROR.this.Qhi.bxS.fl()) {
                    return 1;
                }
                if (ROR.this.Qhi.bxS.cJ()) {
                    return 2;
                }
                ROR.this.Qhi.bxS.CJ();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public void Qhi(boolean z10) {
                if (ROR.this.Qhi.dIT != z10) {
                    ROR.this.Qhi.js.fl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public long ac() {
                return ROR.this.Qhi.bxS.Sf();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public void cJ() {
                if (ROR.this.Qhi.es == null || ROR.this.Qhi.es.WAv() == null) {
                    return;
                }
                ROR.this.Qhi.es.WAv().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public void fl() {
                ROR.this.Qhi.sDy.Qhi(cJVar2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public void Qhi() {
                ROR.this.Qhi.js.CJ();
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public void cJ(int i10) {
                ROR.this.Qhi.YB = i10;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public void Qhi(int i10) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ROR.this.Qhi.bxS.pM();
                        return;
                    } else if (i10 == 3) {
                        ROR.this.Qhi.bxS.Qhi(cJVar);
                        return;
                    } else if (i10 == 4) {
                        ROR.this.Qhi.bxS.zc();
                        return;
                    } else if (i10 != 5) {
                        return;
                    }
                }
                if (ROR.this.Qhi.bxS.cJ() || ROR.this.Qhi.bxS.CJ()) {
                    return;
                }
                cJVar.Qhi(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.ABk
            public void Qhi(int i10, String str) {
                ROR.this.Qhi.bxS.Qhi(i10, str);
            }
        });
        this.Qhi.pM.Qhi(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (ROR.this.Qhi != null && ROR.this.Qhi.cJ != null && ROR.this.Qhi.cJ.gT()) {
                    cJVar.c_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                if (!ROR.this.Qhi.cJ.Ewb()) {
                    ROR.this.Qhi.lG.Qhi(true);
                    ROR.this.Qhi.lG.fl();
                }
                ROR.this.Qhi.pM.fl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        cJVar2.Qhi(false, false, false, 90);
                    }
                });
                ROR.this.Qhi.es.ABk();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (bxS.Gm(ROR.this.Qhi.cJ)) {
                    return;
                }
                if (!ROR.this.Qhi.cJ.Ewb()) {
                    if (ROR.this.Qhi.pM.Sf()) {
                        cJVar2.Qhi(true);
                        ROR.this.Qhi.bxS.CJ(false);
                    } else {
                        ROR.this.Qhi.bxS.CJ(true);
                    }
                    ROR.this.Qhi.es.Qhi(8);
                    ROR.this.Qhi.lG.Qhi(true);
                    ROR.this.Qhi.lG.fl();
                    if (ROR.this.Qhi.pM.Sf()) {
                        ROR.this.Qhi.pM.cJ().setBackgroundColor(-16777216);
                        cJVar2.Qhi(ROR.this.Qhi.es.Tgh());
                    } else if (ROR.this.Qhi.cJ.FQ() != null && cJVar2.Qhi()) {
                        ROR.this.Qhi.cjC = true;
                    }
                }
                cJVar2.pM();
                if (cJVar2 instanceof com.bytedance.sdk.openadsdk.component.reward.cJ.Tgh) {
                    com.bytedance.sdk.openadsdk.component.reward.cJ.Tgh.Qhi(ROR.this.Qhi.cJ, ROR.this.Qhi.pM.Sf(), ROR.this.Qhi.f8798fl);
                    if (!ROR.this.Qhi.pM.Sf()) {
                        ROR.this.Qhi.PAe.Tgh();
                    }
                }
                ROR.this.Qhi.es.ABk();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }
        });
        Qhi qhi2 = this.Qhi;
        Activity activity = qhi2.FQ;
        tP tPVar = qhi2.cJ;
        String str = qhi2.f8798fl;
        com.bytedance.sdk.openadsdk.core.nativeexpress.Sf sf2 = new com.bytedance.sdk.openadsdk.core.nativeexpress.Sf(activity, tPVar, str, js.Qhi(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR.3
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ, com.bytedance.sdk.openadsdk.core.cJ.ac
            public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
                super.Qhi(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        sf2.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR.4
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view, int i10) {
                cJVar.c_();
            }
        });
        HashMap hashMap = new HashMap();
        if (bxS.Gm(this.Qhi.cJ)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        Qhi qhi3 = this.Qhi;
        if (qhi3.VnT && (ror = qhi3.Ura) != null) {
            hashMap.put("ad_show_order", Integer.valueOf(ror.f8522hm + 1));
        }
        sf2.Qhi(hashMap);
        Qhi qhi4 = this.Qhi;
        Activity activity2 = qhi4.FQ;
        tP tPVar2 = qhi4.cJ;
        String str2 = qhi4.f8798fl;
        com.bytedance.sdk.openadsdk.core.nativeexpress.ROR ror2 = new com.bytedance.sdk.openadsdk.core.nativeexpress.ROR(activity2, tPVar2, str2, js.Qhi(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR.5
            @Override // com.bytedance.sdk.openadsdk.core.cJ.Qhi, com.bytedance.sdk.openadsdk.core.cJ.cJ, com.bytedance.sdk.openadsdk.core.cJ.ac
            public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("duration", Long.valueOf(ROR.this.Qhi.bxS.ROR()));
                Qhi(hashMap2);
                super.Qhi(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        ror2.Qhi(new cJ.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR.6
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
            public void Qhi(View view, int i10) {
                cJVar.c_();
            }
        });
        HashMap hashMap2 = new HashMap();
        if (bxS.Gm(this.Qhi.cJ)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        ror2.Qhi(hashMap2);
        this.Qhi.pM.Qhi(sf2, ror2);
        if (this.Qhi.cJ.Ewb()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams.gravity = 17;
        this.Qhi.es.Tgh().addView(this.Qhi.pM.Qhi(), layoutParams);
        if (!this.Qhi.pM.Sf()) {
            cJVar2.Qhi(false);
        }
        this.Qhi.pM.Gm();
    }
}

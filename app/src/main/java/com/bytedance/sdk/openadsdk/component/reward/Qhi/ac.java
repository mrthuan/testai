package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.model.bxS;

/* compiled from: RewardFullDislikeManager.java */
/* loaded from: classes.dex */
public class ac {
    private final Qhi Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private TTAdDislikeToast f8812ac;
    private TTAdDislikeDialog cJ;

    public ac(Qhi qhi) {
        this.Qhi = qhi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        this.f8812ac.Qhi(TTAdDislikeToast.getDislikeSendTip());
    }

    public void Qhi(com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar) {
        if (this.Qhi.FQ.isFinishing()) {
            return;
        }
        if (this.Qhi.f8801zc.get()) {
            this.f8812ac.Qhi(TTAdDislikeToast.getDislikeTip());
            return;
        }
        if (this.cJ == null) {
            try {
                cJ(cJVar);
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th2);
            }
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.cJ;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.Qhi();
        }
    }

    public void cJ() {
        TTAdDislikeToast tTAdDislikeToast = this.f8812ac;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.ac();
        }
    }

    private void cJ(final com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar) {
        if (this.cJ == null) {
            Qhi qhi = this.Qhi;
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(qhi.FQ, qhi.cJ);
            this.cJ = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ac.1
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                public void Qhi(View view) {
                    ac.this.Qhi.Gm.set(true);
                    String str = "landing_page";
                    if (!com.bytedance.sdk.openadsdk.core.model.HzH.cJ(ac.this.Qhi.cJ) && !com.bytedance.sdk.openadsdk.core.model.HzH.ac(ac.this.Qhi.cJ) && !com.bytedance.sdk.openadsdk.core.model.HzH.CJ(ac.this.Qhi.cJ)) {
                        if (!ac.this.Qhi.WAv.get()) {
                            str = "video_player";
                        } else if (bxS.cJ(ac.this.Qhi.cJ)) {
                            str = "playable";
                        } else if (!ac.this.Qhi.cJ.js()) {
                            str = "endcard";
                        }
                    }
                    ac.this.cJ.setDislikeSource(str);
                    if (ac.this.Qhi.bxS.f8828fl) {
                        if (ac.this.Qhi.pM != null) {
                            ac.this.Qhi.pM.Qhi(8, false);
                            return;
                        }
                        return;
                    }
                    cJVar.hpZ();
                    if (ac.this.Qhi.bxS.cJ()) {
                        ac.this.Qhi.bxS.pA();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                public void cJ(View view) {
                    ac.this.Qhi.Gm.set(false);
                    if (ac.this.Qhi.bxS.f8828fl) {
                        if (ac.this.Qhi.pM != null) {
                            ac.this.Qhi.pM.Qhi(0, true);
                            return;
                        }
                        return;
                    }
                    ac.this.Qhi.bxS.Qhi(cJVar);
                    if (ac.this.Qhi.bxS.CJ()) {
                        ac.this.Qhi.bxS.iMK();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                public void Qhi(int i10, FilterWord filterWord) {
                    if (ac.this.Qhi.f8801zc.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    ac.this.Qhi.f8801zc.set(true);
                    ac.this.ac();
                }
            });
            ((FrameLayout) this.Qhi.FQ.findViewById(16908290)).addView(this.cJ);
        }
        if (this.f8812ac == null) {
            this.f8812ac = new TTAdDislikeToast(this.Qhi.FQ);
            ((FrameLayout) this.Qhi.FQ.findViewById(16908290)).addView(this.f8812ac);
        }
    }

    public void Qhi() {
        TTAdDislikeToast tTAdDislikeToast = this.f8812ac;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.cJ();
        }
    }
}

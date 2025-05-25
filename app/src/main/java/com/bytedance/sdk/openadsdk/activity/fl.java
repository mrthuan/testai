package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: FullscreenAdScene.java */
/* loaded from: classes.dex */
public class fl extends Qhi {
    private boolean Tgh;

    /* renamed from: fl  reason: collision with root package name */
    int f8578fl;

    public fl(cJ cJVar, tP tPVar, int i10) {
        super(cJVar, tPVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CJ(int i10) {
        int tP = HzH.CJ().tP(String.valueOf(this.f8520ac.Tgh));
        if (HzH.CJ().Tgh(String.valueOf(this.f8520ac.Tgh)) && (tP.fl(this.f8520ac.cJ) || this.f8520ac.f8797ac)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
            if (!qhi.zjb) {
                qhi.Qhi(true);
            }
            if (i10 <= tP) {
                fl(tP - i10);
                this.f8520ac.js.fl(false);
                return;
            }
            cJ();
        } else if (i10 >= tP) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.f8520ac;
            if (!qhi2.zjb) {
                qhi2.Qhi(true);
            }
            cJ();
        }
    }

    private void fl(int i10) {
        this.f8520ac.js.Qhi(null, new SpannableStringBuilder(String.format(MQ.Qhi(HzH.Qhi(), "tt_skip_ad_time_text"), Integer.valueOf(i10))));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi
    public void ROR() {
        Eh();
        if (this.Sf.Qhi()) {
            this.f8520ac.pM.WAv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public boolean a_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi, com.bytedance.sdk.openadsdk.activity.ROR
    public void ac(Activity activity) {
        super.ac(activity);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        if (qhi == null || !cJ(qhi.cJ) || Qhi(this.f8520ac.cJ)) {
            return;
        }
        if (this.Tgh) {
            this.Tgh = false;
            CQU();
        } else if (this.f8520ac.lG.lB()) {
            CQU();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public String b_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi
    public void cJ() {
        if (!tP.fl(this.f8520ac.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
            if (!qhi.f8797ac) {
                qhi.js.Qhi(null, "X");
                this.f8520ac.js.fl(true);
            }
        }
        this.f8520ac.js.Qhi(null, TTAdDislikeToast.getSkipText());
        this.f8520ac.js.fl(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void c_() {
        if (this.f8520ac.cJ.Oy() != 100.0f) {
            this.Tgh = true;
        }
        aP();
    }

    private boolean Qhi(tP tPVar) {
        return tPVar == null || tPVar.Oy() == 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Qhi(long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.fl.Qhi(long, boolean):boolean");
    }

    private boolean cJ(tP tPVar) {
        if (tPVar == null) {
            return false;
        }
        return HzH.CJ().MQ(String.valueOf(this.f8520ac.Tgh));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi
    public void ac() {
        final View WAv = this.f8520ac.es.WAv();
        if (WAv != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.fl.1
                /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instructions count: 249
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.fl.AnonymousClass1.onClick(android.view.View):void");
                }
            };
            WAv.setOnClickListener(onClickListener);
            WAv.setTag(WAv.getId(), onClickListener);
        }
        this.f8520ac.js.Qhi(new com.bytedance.sdk.openadsdk.component.reward.top.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.fl.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void CJ(View view) {
                View view2 = WAv;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void Qhi(View view) {
                if (bxS.ac(fl.this.f8520ac.cJ) && (bxS.Gm(fl.this.f8520ac.cJ) || fl.this.f8520ac.WAv.get())) {
                    if (fl.this.f8520ac.CQU.tP()) {
                        fl.this.f8520ac.CQU.cJ(5);
                    } else {
                        fl.this.f8520ac.lG.ROR();
                    }
                } else if (!bxS.Gm(fl.this.f8520ac.cJ) && (!com.bytedance.sdk.openadsdk.core.model.HzH.Qhi(fl.this.f8520ac.cJ) || fl.this.f8520ac.hpZ.get())) {
                    if (fl.this.f8520ac.cJ.Em()) {
                        if (fl.this.f8520ac.es.Gm() != null) {
                            fl.this.f8520ac.cJ.Jma(2);
                            fl.this.f8520ac.es.HzH();
                            return;
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = fl.this.f8520ac;
                    if (!qhi.f8797ac && qhi.cJ.YCN() && !fl.this.f8520ac.cJ.IC()) {
                        fl.this.f8520ac.cJ.Jma(13);
                        try {
                            fl.this.f8520ac.es.HzH();
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    hpZ.Qhi qhi2 = new hpZ.Qhi();
                    qhi2.Qhi(fl.this.f8520ac.bxS.ROR());
                    qhi2.ac(fl.this.f8520ac.bxS.tP());
                    qhi2.cJ(fl.this.f8520ac.bxS.Gm());
                    qhi2.ac(3);
                    qhi2.CJ(fl.this.f8520ac.bxS.kYc());
                    com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(fl.this.f8520ac.bxS.ac(), qhi2, fl.this.f8520ac.bxS.Qhi());
                    com.bytedance.sdk.openadsdk.core.bxS.ac(fl.this.f8520ac.Tgh);
                    fl.this.f8520ac.bxS.Qhi("skip", false);
                    fl.this.f8520ac.js.CJ(false);
                    fl flVar = fl.this;
                    if (flVar.f8520ac.f8797ac) {
                        flVar.Qhi(true, 4);
                    } else {
                        flVar.CQU();
                    }
                    tP tPVar = fl.this.f8520ac.cJ;
                    if (tPVar != null && tPVar.cJP() != null) {
                        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = fl.this.f8520ac;
                        if (qhi3.bxS != null) {
                            qhi3.cJ.cJP().Qhi().Tgh(fl.this.f8520ac.bxS.ROR());
                            fl.this.f8520ac.cJ.cJP().Qhi().fl(fl.this.f8520ac.bxS.ROR());
                        }
                    }
                    com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(fl.this.f8520ac.cJ, 5);
                } else {
                    if (!bxS.ac(fl.this.f8520ac.cJ) && fl.this.f8520ac.CQU.tP()) {
                        fl.this.f8520ac.CQU.cJ(4);
                    }
                    fl.this.CQU();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void ac(View view) {
                fl flVar = fl.this;
                flVar.f8520ac.sDy.Qhi(flVar.cJ);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void cJ(View view) {
                fl flVar = fl.this;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = flVar.f8520ac;
                qhi.dIT = !qhi.dIT;
                com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = flVar.cJ;
                if (cJVar != null && cJVar.CJ() != null) {
                    fl.this.cJ.CJ().Qhi(fl.this.f8520ac.dIT);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = fl.this.f8520ac;
                qhi2.bxS.cJ(qhi2.dIT);
                if (bxS.zc(fl.this.f8520ac.cJ) && !fl.this.f8520ac.WAv.get()) {
                    return;
                }
                if (bxS.cJ(fl.this.f8520ac.cJ)) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = fl.this.f8520ac;
                    qhi3.lB.Qhi(qhi3.dIT, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = fl.this.f8520ac;
                qhi4.lG.CJ(qhi4.dIT);
                tP tPVar = fl.this.f8520ac.cJ;
                if (tPVar != null && tPVar.cJP() != null && fl.this.f8520ac.cJ.cJP().Qhi() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi5 = fl.this.f8520ac;
                    if (qhi5.bxS != null) {
                        if (qhi5.dIT) {
                            qhi5.cJ.cJP().Qhi().Sf(fl.this.f8520ac.bxS.ROR());
                        } else {
                            qhi5.cJ.cJP().Qhi().hm(fl.this.f8520ac.bxS.ROR());
                        }
                    }
                }
            }
        });
    }
}

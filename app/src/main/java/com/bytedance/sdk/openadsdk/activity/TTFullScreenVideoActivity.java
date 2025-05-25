package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.Dww;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.qMt;
import com.bytedance.sdk.openadsdk.utils.zc;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;

/* loaded from: classes.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {

    /* renamed from: zc  reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ f8535zc;
    private boolean ABk;
    private com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ Gm;

    private void CJ(int i10) {
        this.cJ.js.Qhi(null, String.format(MQ.Qhi(HzH.Qhi(), "tt_skip_ad_time_text"), Integer.valueOf(i10)));
    }

    private void MQ() {
        if (!this.Sf) {
            this.Sf = true;
            qMt.Qhi("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                Qhi("onAdClose");
                return;
            }
            com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar = this.Gm;
            if (cJVar != null) {
                cJVar.cJ();
            }
        }
    }

    private boolean cJ(tP tPVar) {
        if (tPVar == null) {
            return false;
        }
        return HzH.CJ().MQ(String.valueOf(this.cJ.Tgh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tP() {
        qMt.Qhi("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar = this.Gm;
        if (cJVar != null) {
            cJVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean HzH() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(int i10) {
    }

    public void ac(int i10) {
        int tP = HzH.CJ().tP(String.valueOf(this.cJ.Tgh));
        if (HzH.CJ().Tgh(String.valueOf(this.cJ.Tgh)) && (tP.fl(this.cJ.cJ) || this.cJ.f8797ac)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
            if (!qhi.zjb) {
                qhi.Qhi(true);
            }
            if (i10 <= tP) {
                CJ(tP - i10);
                this.cJ.js.fl(false);
                return;
            }
            Qhi();
        } else if (i10 >= tP) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
            if (!qhi2.zjb) {
                qhi2.Qhi(true);
            }
            Qhi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void c_() {
        if (this.cJ.cJ.Oy() != 100.0f) {
            this.ABk = true;
        }
        tP();
    }

    public void finalize() {
        super.finalize();
        f8535zc = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi != null) {
            qhi.CQU.cJ(qhi.ots);
        }
        try {
            MQ();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void fl() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar = this.Gm;
            if (cJVar != null) {
                cJVar.Qhi();
            }
        }
        if (kYc()) {
            this.cJ.pM.WAv();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void hpZ() {
        final View WAv = this.cJ.es.WAv();
        if (WAv != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.AnonymousClass3.onClick(android.view.View):void");
                }
            };
            WAv.setOnClickListener(onClickListener);
            WAv.setTag(WAv.getId(), onClickListener);
        }
        this.cJ.js.Qhi(new com.bytedance.sdk.openadsdk.component.reward.top.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void CJ(View view) {
                View view2 = WAv;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void Qhi(View view) {
                if (bxS.ac(TTFullScreenVideoActivity.this.cJ.cJ) && (bxS.Gm(TTFullScreenVideoActivity.this.cJ.cJ) || TTFullScreenVideoActivity.this.cJ.WAv.get())) {
                    if (TTFullScreenVideoActivity.this.cJ.CQU.tP()) {
                        TTFullScreenVideoActivity.this.cJ.CQU.cJ(5);
                    } else {
                        TTFullScreenVideoActivity.this.cJ.lG.ROR();
                    }
                } else if (!bxS.Gm(TTFullScreenVideoActivity.this.cJ.cJ) && (!com.bytedance.sdk.openadsdk.core.model.HzH.Qhi(TTFullScreenVideoActivity.this.cJ.cJ) || TTFullScreenVideoActivity.this.cJ.hpZ.get())) {
                    if (TTFullScreenVideoActivity.this.cJ.cJ.Em()) {
                        if (TTFullScreenVideoActivity.this.cJ.es.Gm() != null) {
                            TTFullScreenVideoActivity.this.cJ.cJ.Jma(2);
                            TTFullScreenVideoActivity.this.cJ.es.HzH();
                            return;
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = TTFullScreenVideoActivity.this.cJ;
                    if (!qhi.f8797ac && qhi.cJ.YCN() && !TTFullScreenVideoActivity.this.cJ.cJ.IC()) {
                        TTFullScreenVideoActivity.this.cJ.cJ.Jma(13);
                        try {
                            TTFullScreenVideoActivity.this.cJ.es.HzH();
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    hpZ.Qhi qhi2 = new hpZ.Qhi();
                    qhi2.Qhi(TTFullScreenVideoActivity.this.cJ.bxS.ROR());
                    qhi2.ac(TTFullScreenVideoActivity.this.cJ.bxS.tP());
                    qhi2.cJ(TTFullScreenVideoActivity.this.cJ.bxS.Gm());
                    qhi2.ac(3);
                    qhi2.CJ(TTFullScreenVideoActivity.this.cJ.bxS.kYc());
                    com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(TTFullScreenVideoActivity.this.cJ.bxS.ac(), qhi2, TTFullScreenVideoActivity.this.cJ.bxS.Qhi());
                    com.bytedance.sdk.openadsdk.core.bxS.ac(TTFullScreenVideoActivity.this.cJ.Tgh);
                    TTFullScreenVideoActivity.this.cJ.bxS.Qhi("skip", false);
                    TTFullScreenVideoActivity.this.cJ.js.CJ(false);
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    if (tTFullScreenVideoActivity.cJ.f8797ac) {
                        tTFullScreenVideoActivity.Qhi(true, 4);
                    } else {
                        tTFullScreenVideoActivity.finish();
                    }
                    tP tPVar = TTFullScreenVideoActivity.this.cJ.cJ;
                    if (tPVar != null && tPVar.cJP() != null) {
                        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = TTFullScreenVideoActivity.this.cJ;
                        if (qhi3.bxS != null) {
                            qhi3.cJ.cJP().Qhi().Tgh(TTFullScreenVideoActivity.this.cJ.bxS.ROR());
                            TTFullScreenVideoActivity.this.cJ.cJ.cJP().Qhi().fl(TTFullScreenVideoActivity.this.cJ.bxS.ROR());
                        }
                    }
                    com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(TTFullScreenVideoActivity.this.cJ.cJ, 5);
                } else {
                    if (!bxS.ac(TTFullScreenVideoActivity.this.cJ.cJ) && TTFullScreenVideoActivity.this.cJ.CQU.tP()) {
                        TTFullScreenVideoActivity.this.cJ.CQU.cJ(4);
                    }
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void ac(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.cJ.sDy.Qhi(tTFullScreenVideoActivity.f8530ac);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void cJ(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = tTFullScreenVideoActivity.cJ;
                qhi.dIT = !qhi.dIT;
                com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = tTFullScreenVideoActivity.f8530ac;
                if (cJVar != null && cJVar.CJ() != null) {
                    TTFullScreenVideoActivity.this.f8530ac.CJ().Qhi(TTFullScreenVideoActivity.this.cJ.dIT);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = TTFullScreenVideoActivity.this.cJ;
                qhi2.bxS.cJ(qhi2.dIT);
                if (bxS.zc(TTFullScreenVideoActivity.this.cJ.cJ) && !TTFullScreenVideoActivity.this.cJ.WAv.get()) {
                    return;
                }
                if (bxS.cJ(TTFullScreenVideoActivity.this.cJ.cJ)) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = TTFullScreenVideoActivity.this.cJ;
                    qhi3.lB.Qhi(qhi3.dIT, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = TTFullScreenVideoActivity.this.cJ;
                qhi4.lG.CJ(qhi4.dIT);
                tP tPVar = TTFullScreenVideoActivity.this.cJ.cJ;
                if (tPVar != null && tPVar.cJP() != null && TTFullScreenVideoActivity.this.cJ.cJ.cJP().Qhi() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi5 = TTFullScreenVideoActivity.this.cJ;
                    if (qhi5.bxS != null) {
                        if (qhi5.dIT) {
                            qhi5.cJ.cJP().Qhi().Sf(TTFullScreenVideoActivity.this.cJ.bxS.ROR());
                        } else {
                            qhi5.cJ.cJP().Qhi().hm(TTFullScreenVideoActivity.this.cJ.bxS.ROR());
                        }
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi != null && !tP.fl(qhi.cJ)) {
            com.bykv.vk.openvk.component.video.api.ac.cJ FQ = this.cJ.cJ.FQ();
            if (FQ == null) {
                com.bykv.vk.openvk.component.video.api.ac.cJ cJVar = new com.bykv.vk.openvk.component.video.api.ac.cJ();
                cJVar.Qhi(10.0d);
                this.cJ.cJ.Qhi(cJVar);
            } else if (FQ.Tgh() <= 0.0d) {
                FQ.Qhi(10.0d);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MQ();
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("recycleRes");
        }
        this.Gm = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        FullRewardExpressView Qhi;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi != null && (Qhi = qhi.pM.Qhi()) != null) {
            Qhi.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.ac() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.ac
                public void Qhi() {
                    TTFullScreenVideoActivity.this.tP();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        f8535zc = this.Gm;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi != null && cJ(qhi.cJ) && !Qhi(this.cJ.cJ)) {
            if (this.ABk) {
                this.ABk = false;
                finish();
            } else if (this.cJ.lG.lB()) {
                finish();
            }
        }
    }

    private void Qhi(final String str) {
        lG.ac(new hm("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.cJ(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.cJ.MND, str);
                } catch (Throwable th2) {
                    ABk.Qhi("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void CJ() {
        tP();
        this.cJ.cJ.wI();
        this.cJ.cJ.Qhi(true);
        if (tP.fl(this.cJ.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
            tP tPVar = qhi.cJ;
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, qhi.f8798fl, tPVar.gSh());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void Qhi(Intent intent) {
        super.Qhi(intent);
        this.cJ.ots = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            this.Gm = Dww.Qhi().CJ();
        }
        if (this.Gm != null || bundle == null) {
            return;
        }
        this.Gm = f8535zc;
        f8535zc = null;
    }

    public boolean Qhi(long j10, boolean z10) {
        Sf sf2 = new Sf();
        sf2.Qhi(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.f8530ac;
        if (cJVar != null && (cJVar instanceof com.bytedance.sdk.openadsdk.component.reward.cJ.hm)) {
            this.cJ.bxS.Qhi(((com.bytedance.sdk.openadsdk.component.reward.cJ.hm) cJVar).NFd(), sf2);
        } else {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
            qhi.bxS.Qhi(qhi.es.Tgh(), sf2);
        }
        fl.Qhi qhi2 = new fl.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5
            boolean Qhi;

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi(long j11, int i10) {
                zc zcVar;
                if (this.Qhi) {
                    return;
                }
                this.Qhi = true;
                TTFullScreenVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                TTFullScreenVideoActivity.this.pA();
                TTFullScreenVideoActivity.this.cJ.bxS.Qhi(j11, j11);
                TTFullScreenVideoActivity.this.cJ.tP.set(true);
                if (TTFullScreenVideoActivity.this.cJ.cJ.hpZ() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = TTFullScreenVideoActivity.this.cJ;
                    if (qhi3.f8797ac) {
                        qhi3.Dww.ac().CJ();
                        com.bytedance.sdk.openadsdk.utils.ABk.cJ();
                    }
                }
                if (TTFullScreenVideoActivity.this.cJ.cJ.YAV()) {
                    TTFullScreenVideoActivity.this.cJ.cJ.Jma(1);
                    TTFullScreenVideoActivity.this.cJ.es.HzH();
                }
                if (TTFullScreenVideoActivity.this.cJ.cJ.hpZ() == 21 && !TTFullScreenVideoActivity.this.cJ.cJ.CJ()) {
                    TTFullScreenVideoActivity.this.cJ.cJ.cJ(true);
                    TTFullScreenVideoActivity.this.cJ.es.HzH();
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = TTFullScreenVideoActivity.this.cJ;
                if (qhi4.f8797ac) {
                    if (qhi4.cJ.TGC()) {
                        TTFullScreenVideoActivity.this.cJ.js.ac();
                        return;
                    }
                    TTFullScreenVideoActivity.this.Qhi(false, 5);
                    if (com.bytedance.sdk.openadsdk.core.model.HzH.cJ(TTFullScreenVideoActivity.this.cJ.cJ) && (zcVar = TTFullScreenVideoActivity.this.cJ.gga) != null) {
                        zcVar.Qhi(0L);
                    }
                    if (tP.fl(TTFullScreenVideoActivity.this.cJ.cJ)) {
                        return;
                    }
                    TTFullScreenVideoActivity.this.cJ.bxS.Qhi("skip", true);
                } else if (qhi4.cJ.TGC()) {
                    TTFullScreenVideoActivity.this.cJ.js.ac();
                } else {
                    if (!tP.fl(TTFullScreenVideoActivity.this.cJ.cJ)) {
                        TTFullScreenVideoActivity.this.cJ.bxS.Qhi("skip", true);
                    }
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void cJ(long j11, int i10) {
                TTFullScreenVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                if (TTFullScreenVideoActivity.this.cJ.bxS.cJ()) {
                    TTFullScreenVideoActivity.this.ABk();
                    return;
                }
                TTFullScreenVideoActivity.this.cJ.bxS.ABk();
                ABk.Qhi("TTAD.FSVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.cJ.f8797ac) {
                    tTFullScreenVideoActivity.Qhi(false, true, 3);
                    pA pAVar = TTFullScreenVideoActivity.this.cJ.bxS;
                    pAVar.Qhi(!pAVar.Eh(), 2);
                    return;
                }
                tTFullScreenVideoActivity.finish();
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi() {
                TTFullScreenVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                TTFullScreenVideoActivity.this.pA();
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                if (tTFullScreenVideoActivity.cJ.f8797ac) {
                    tTFullScreenVideoActivity.Qhi(false, true, 6);
                } else {
                    tTFullScreenVideoActivity.finish();
                }
                pA pAVar = TTFullScreenVideoActivity.this.cJ.bxS;
                pAVar.Qhi(!pAVar.Eh(), 1 ^ TTFullScreenVideoActivity.this.cJ.bxS.Eh());
                TTFullScreenVideoActivity.this.cJ.bxS.ABk();
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = TTFullScreenVideoActivity.this.cJ;
                if (!qhi3.Qe && qhi3.bxS.cJ()) {
                    TTFullScreenVideoActivity.this.cJ.bxS.pA();
                }
                if (TTFullScreenVideoActivity.this.cJ.WAv.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                if (j11 != TTFullScreenVideoActivity.this.cJ.bxS.Sf()) {
                    TTFullScreenVideoActivity.this.pA();
                }
                TTFullScreenVideoActivity.this.cJ.bxS.Qhi(j11, j12);
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                long j13 = j11 / 1000;
                tTFullScreenVideoActivity.Tgh = (int) (tTFullScreenVideoActivity.cJ.bxS.aP() - j13);
                int i10 = (int) j13;
                if ((TTFullScreenVideoActivity.this.cJ.MQ.get() || TTFullScreenVideoActivity.this.cJ.Gm.get()) && TTFullScreenVideoActivity.this.cJ.bxS.cJ()) {
                    TTFullScreenVideoActivity.this.cJ.bxS.pA();
                }
                TTFullScreenVideoActivity.this.ac(i10);
                TTFullScreenVideoActivity tTFullScreenVideoActivity2 = TTFullScreenVideoActivity.this;
                int i11 = tTFullScreenVideoActivity2.Tgh;
                if (i11 >= 0) {
                    tTFullScreenVideoActivity2.cJ.js.Qhi(String.valueOf(i11), null);
                }
            }
        };
        this.cJ.bxS.Qhi(qhi2);
        com.bytedance.sdk.openadsdk.core.model.HzH hzH = this.cJ.es.pA;
        if (hzH != null) {
            hzH.Qhi(qhi2);
        }
        return this.cJ.bxS.Qhi(j10, z10, null, this.f8530ac);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void Qhi() {
        if (!tP.fl(this.cJ.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
            if (!qhi.f8797ac) {
                qhi.js.Qhi(null, "X");
                this.cJ.js.fl(true);
            }
        }
        this.cJ.js.Qhi(null, TTAdDislikeToast.getSkipText());
        this.cJ.js.fl(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void iMK() {
    }

    private boolean Qhi(tP tPVar) {
        return tPVar == null || tPVar.Oy() == 100.0f;
    }
}

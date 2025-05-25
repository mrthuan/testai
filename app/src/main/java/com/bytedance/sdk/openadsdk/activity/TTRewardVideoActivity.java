package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.Dww;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.MQ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.core.widget.Qhi;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.qMt;
import com.bytedance.sdk.openadsdk.utils.zc;
import com.google.android.gms.common.api.Api;
import com.inmobi.commons.core.configs.CrashConfig;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String HzH;
    private static String hpZ;
    private static String iMK;
    private static String kYc;
    private static String pA;
    private static com.bytedance.sdk.openadsdk.apiImpl.CJ.ac qMt;
    protected com.bytedance.sdk.openadsdk.apiImpl.CJ.ac ABk;
    private boolean Dww;
    protected int Gm;
    private String MQ;
    private String tP;

    /* renamed from: zc  reason: collision with root package name */
    protected int f8547zc;
    private final AtomicBoolean EBS = new AtomicBoolean(false);
    private int bxS = -1;

    private JSONObject EBS() {
        JSONObject jSONObject = new JSONObject();
        int MQ = (int) this.cJ.bxS.MQ();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.cJ.cJ.MQ());
            jSONObject.put("reward_amount", this.cJ.cJ.qMt());
            jSONObject.put("network", hpZ.ac(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int zn2 = this.cJ.cJ.zn();
            String str = "unKnow";
            if (zn2 == 2) {
                str = js.cJ();
            } else if (zn2 == 1) {
                str = js.ac();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.cJ.cJ.KW());
            jSONObject.put("media_extra", this.tP);
            jSONObject.put("video_duration", this.cJ.cJ.FQ().Tgh());
            jSONObject.put("play_start_ts", this.Gm);
            jSONObject.put("play_end_ts", this.f8547zc);
            jSONObject.put("duration", MQ);
            jSONObject.put("user_id", this.MQ);
            jSONObject.put("trans_id", bxS.Qhi().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.RVA", "", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0076, code lost:
        if (r3.cJ.hpZ.get() == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void MQ() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ$Qhi r0 = new com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ$Qhi
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            long r1 = r1.ROR()
            r0.Qhi(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            long r1 = r1.tP()
            r0.ac(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            long r1 = r1.Gm()
            r0.cJ(r1)
            r1 = 3
            r0.ac(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            int r1 = r1.kYc()
            r0.CJ(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            com.bykv.vk.openvk.component.video.api.cJ.Qhi r1 = r1.ac()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r2 = r3.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r2 = r2.bxS
            com.bytedance.sdk.openadsdk.cJ.Sf r2 = r2.Qhi()
            com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.cJ
            int r0 = r0.Tgh
            com.bytedance.sdk.openadsdk.core.bxS.ac(r0)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r0 = r0.bxS
            java.lang.String r1 = "skip"
            r2 = 0
            r0.Qhi(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.cJ
            boolean r0 = r0.f8797ac
            if (r0 == 0) goto L78
            r0 = 1
            r1 = 4
            r3.Qhi(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.cJ
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r0.cJ
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.HzH.Qhi(r0)
            if (r0 == 0) goto L7b
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.cJ
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.hpZ
            boolean r0 = r0.get()
            if (r0 != 0) goto L7b
        L78:
            r3.finish()
        L7b:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.cJ
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r0.cJ
            com.bytedance.sdk.openadsdk.core.ROR.Qhi r0 = r0.cJP()
            if (r0 == 0) goto L97
            com.bytedance.sdk.openadsdk.core.ROR.fl r0 = r0.Qhi()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            long r1 = r1.ROR()
            r0.Tgh(r1)
            r0.fl(r1)
        L97:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.cJ
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r0.cJ
            r1 = 5
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.MQ():void");
    }

    private void bxS() {
        if (!this.Sf) {
            this.Sf = true;
            qMt.Qhi("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                Qhi("onAdClose");
                return;
            }
            com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar = this.ABk;
            if (acVar != null) {
                acVar.cJ();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qMt() {
        qMt.Qhi("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar = this.ABk;
        if (acVar != null) {
            acVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void CJ() {
        qMt();
        this.cJ.cJ.wI();
        this.cJ.cJ.Qhi(true);
        if (tP.fl(this.cJ.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
            tP tPVar = qhi.cJ;
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, qhi.f8798fl, tPVar.gSh());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean HzH() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void c_() {
        qMt();
    }

    public void finalize() {
        super.finalize();
        qMt = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        bxS();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void fl() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar = this.ABk;
            if (acVar != null) {
                acVar.Qhi();
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
                /* JADX WARN: Removed duplicated region for block: B:30:0x00d8 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instructions count: 280
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.AnonymousClass3.onClick(android.view.View):void");
                }
            };
            WAv.setOnClickListener(onClickListener);
            WAv.setTag(WAv.getId(), onClickListener);
        }
        this.cJ.js.Qhi(new com.bytedance.sdk.openadsdk.component.reward.top.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void CJ(View view) {
                View view2 = WAv;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void Qhi(View view) {
                if (TTRewardVideoActivity.this.cJ.cJ.Em()) {
                    if (TTRewardVideoActivity.this.cJ.es.Gm() != null) {
                        TTRewardVideoActivity.this.cJ.cJ.Jma(2);
                        TTRewardVideoActivity.this.cJ.es.HzH();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = TTRewardVideoActivity.this.cJ;
                if (!qhi.f8797ac && qhi.cJ.YCN() && !TTRewardVideoActivity.this.cJ.cJ.IC()) {
                    TTRewardVideoActivity.this.cJ.cJ.Jma(13);
                    try {
                        TTRewardVideoActivity.this.cJ.es.HzH();
                        return;
                    } catch (Exception unused) {
                    }
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.Qhi(com.bytedance.sdk.openadsdk.core.model.bxS.Gm(tTRewardVideoActivity.cJ.cJ), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void ac(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.cJ.sDy.Qhi(tTRewardVideoActivity.f8530ac);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void cJ(View view) {
                com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = TTRewardVideoActivity.this.f8530ac;
                if (cJVar != null && cJVar.CJ() != null) {
                    TTRewardVideoActivity.this.f8530ac.CJ().Qhi(TTRewardVideoActivity.this.cJ.dIT);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = TTRewardVideoActivity.this.cJ;
                qhi.dIT = !qhi.dIT;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(TTRewardVideoActivity.this.cJ.dIT);
                sb2.append(" mLastVolume=");
                sb2.append(TTRewardVideoActivity.this.cJ.lB.Qhi());
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = TTRewardVideoActivity.this.cJ;
                qhi2.bxS.cJ(qhi2.dIT);
                if (com.bytedance.sdk.openadsdk.core.model.bxS.zc(TTRewardVideoActivity.this.cJ.cJ) && !TTRewardVideoActivity.this.cJ.WAv.get()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.bxS.cJ(TTRewardVideoActivity.this.cJ.cJ)) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = TTRewardVideoActivity.this.cJ;
                    qhi3.lB.Qhi(qhi3.dIT, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = TTRewardVideoActivity.this.cJ;
                qhi4.lG.CJ(qhi4.dIT);
                tP tPVar = TTRewardVideoActivity.this.cJ.cJ;
                if (tPVar != null && tPVar.cJP() != null && TTRewardVideoActivity.this.cJ.cJ.cJP().Qhi() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi5 = TTRewardVideoActivity.this.cJ;
                    if (qhi5.bxS != null) {
                        if (qhi5.dIT) {
                            qhi5.cJ.cJP().Qhi().Sf(TTRewardVideoActivity.this.cJ.bxS.ROR());
                        } else {
                            qhi5.cJ.cJP().Qhi().hm(TTRewardVideoActivity.this.cJ.bxS.ROR());
                        }
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
        if (r1 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (((1.0d - (r8.Tgh / r8.cJ.bxS.aP())) * 100.0d) >= r0) goto L6;
     */
    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void iMK() {
        /*
            r8 = this;
            com.bytedance.sdk.openadsdk.core.settings.ROR r0 = com.bytedance.sdk.openadsdk.core.HzH.CJ()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.cJ
            int r1 = r1.Tgh
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.settings.cJ r0 = r0.Eh(r1)
            int r0 = r0.Tgh
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.cJ
            com.bytedance.sdk.openadsdk.core.model.tP r1 = r1.cJ
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.bxS.zc(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L39
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            double r4 = r1.aP()
            int r1 = r8.Tgh
            double r6 = (double) r1
            double r6 = r6 / r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            double r0 = (double) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L36
            goto L37
        L36:
            r2 = r3
        L37:
            r3 = r2
            goto L8b
        L39:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.cJ
            com.bytedance.sdk.openadsdk.core.model.tP r1 = r1.cJ
            int r1 = r1.TKG()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r4 = r8.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf r4 = r4.CQU
            int r4 = r4.zc()
            float r4 = (float) r4
            float r1 = (float) r1
            float r4 = r4 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r4
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L59
            r0 = r2
            goto L5a
        L59:
            r0 = r3
        L5a:
            com.bytedance.sdk.openadsdk.core.settings.ROR r1 = com.bytedance.sdk.openadsdk.core.HzH.CJ()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r4 = r8.cJ
            int r4 = r4.Tgh
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.Qhi(r4)
            if (r1 != 0) goto L88
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ r1 = r1.lG
            com.bytedance.sdk.openadsdk.core.NFd r1 = r1.WAv()
            boolean r1 = r1.fl()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r4 = r8.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf r4 = r4.CQU
            boolean r4 = r4.kYc()
            if (r4 == 0) goto L83
            r1 = r2
        L83:
            if (r0 == 0) goto L36
            if (r1 == 0) goto L36
            goto L37
        L88:
            if (r1 != r2) goto L8b
            r3 = r0
        L8b:
            if (r3 == 0) goto L90
            r8.tP()
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.iMK():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi;
        super.onCreate(bundle);
        try {
            if (iMK == null) {
                iMK = MQ.Qhi(this, "tt_reward_msg");
                pA = MQ.Qhi(this, "tt_msgPlayable");
                hpZ = MQ.Qhi(this, "tt_negtiveBtnBtnText");
                HzH = MQ.Qhi(this, "tt_postiveBtnText");
                kYc = MQ.Qhi(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.RVA", th2.getMessage());
        }
        if (bundle != null && (qhi = this.cJ) != null && qhi.cJ.yoW()) {
            this.EBS.set(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        bxS();
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("recycleRes");
        }
        this.ABk = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        FullRewardExpressView Qhi;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi != null && (Qhi = qhi.pM.Qhi()) != null) {
            Qhi.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.ac() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.ac
                public void Qhi() {
                    TTRewardVideoActivity.this.qMt();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi;
        if (bundle == null) {
            bundle = new Bundle();
        }
        qMt = this.ABk;
        if (this.EBS.get() && (qhi = this.cJ) != null) {
            qhi.cJ.id();
        }
        super.onSaveInstanceState(bundle);
    }

    public void tP() {
        if (this.EBS.get()) {
            return;
        }
        this.EBS.set(true);
        if (HzH.CJ().hpZ(String.valueOf(this.cJ.Tgh))) {
            Qhi(true, this.cJ.cJ.qMt(), this.cJ.cJ.MQ(), 0, "");
            return;
        }
        HzH.ac().Qhi(EBS(), new tP.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
            @Override // com.bytedance.sdk.openadsdk.core.tP.cJ
            public void Qhi(int i10, String str) {
                TTRewardVideoActivity.this.Qhi(false, 0, "", i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tP.cJ
            public void Qhi(MQ.cJ cJVar) {
                boolean z10 = cJVar.cJ;
                TTRewardVideoActivity.this.Qhi(cJVar.cJ, cJVar.f8926ac.Qhi(), cJVar.f8926ac.cJ(), 0, "");
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void zc() {
        tP();
    }

    public void Qhi(String str) {
        Qhi(str, false, 0, "", 0, "");
    }

    private void Qhi(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        lG.ac(new hm("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.cJ(0).executeRewardVideoCallback(TTRewardVideoActivity.this.cJ.MND, str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    ABk.Qhi("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            this.ABk = Dww.Qhi().ac();
        }
        if (this.ABk != null || bundle == null) {
            return;
        }
        this.ABk = qMt;
        qMt = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void Qhi() {
        this.cJ.js.Qhi(null, TTAdDislikeToast.getSkipText());
        this.cJ.js.fl(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final boolean z10, boolean z11) {
        if (!z11 && this.Dww && this.cJ.WAv.get() && com.bytedance.sdk.openadsdk.core.model.bxS.ac(this.cJ.cJ)) {
            this.cJ.lG.ROR();
        } else if (!HzH.CJ().Sf(String.valueOf(this.cJ.Tgh))) {
            if (!z11 && this.cJ.WAv.get() && com.bytedance.sdk.openadsdk.core.model.bxS.ac(this.cJ.cJ)) {
                this.cJ.lG.ROR();
            } else if (z10) {
                finish();
            } else {
                MQ();
            }
        } else if (this.EBS.get()) {
            if (this.cJ.WAv.get() && com.bytedance.sdk.openadsdk.core.model.bxS.ac(this.cJ.cJ)) {
                this.cJ.lG.ROR();
            } else if (z10) {
                finish();
            } else {
                MQ();
            }
        } else if (com.bytedance.sdk.openadsdk.core.model.bxS.ac(this.cJ.cJ) && this.cJ.lG.hm().getVisibility() == 0) {
            this.cJ.lG.ROR();
        } else {
            this.cJ.MQ.set(true);
            this.cJ.bxS.pA();
            if (z10) {
                this.cJ.CQU.pA();
            }
            final com.bytedance.sdk.openadsdk.core.widget.Qhi qhi = new com.bytedance.sdk.openadsdk.core.widget.Qhi(this);
            this.f8530ac.ABk = qhi;
            if (z10) {
                qhi.Qhi(pA).cJ(kYc).ac(hpZ);
            } else {
                qhi.Qhi(iMK).cJ(HzH).ac(hpZ);
            }
            this.f8530ac.ABk.Qhi(new Qhi.InterfaceC0133Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.InterfaceC0133Qhi
                public void Qhi() {
                    TTRewardVideoActivity.this.cJ.bxS.iMK();
                    if (z10) {
                        TTRewardVideoActivity.this.cJ.CQU.Qhi(1000L);
                    }
                    qhi.dismiss();
                    TTRewardVideoActivity.this.cJ.MQ.set(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.InterfaceC0133Qhi
                public void cJ() {
                    qhi.dismiss();
                    TTRewardVideoActivity.this.Dww = true;
                    TTRewardVideoActivity.this.cJ.MQ.set(false);
                    TTRewardVideoActivity.this.cJ.CQU.Tgh(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    if (!z10) {
                        TTRewardVideoActivity.this.MQ();
                    } else if (com.bytedance.sdk.openadsdk.core.model.bxS.ac(TTRewardVideoActivity.this.cJ.cJ)) {
                        if (TTRewardVideoActivity.this.cJ.CQU.tP()) {
                            TTRewardVideoActivity.this.cJ.CQU.cJ(5);
                        } else {
                            TTRewardVideoActivity.this.cJ.lG.ROR();
                        }
                    } else {
                        TTRewardVideoActivity.this.cJ.aP.Tgh();
                        if (TTRewardVideoActivity.this.cJ.CQU.tP()) {
                            TTRewardVideoActivity.this.cJ.CQU.cJ(4);
                        }
                        TTRewardVideoActivity.this.finish();
                    }
                }
            }).show();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void Qhi(Intent intent) {
        super.Qhi(intent);
        this.tP = intent.getStringExtra("media_extra");
        this.MQ = intent.getStringExtra("user_id");
    }

    public boolean Qhi(long j10, boolean z10) {
        Sf sf2 = new Sf();
        sf2.Qhi(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        qhi.bxS.Qhi(qhi.es.Tgh(), sf2);
        fl.Qhi qhi2 = new fl.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            boolean Qhi;

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi(long j11, int i10) {
                zc zcVar;
                if (this.Qhi) {
                    return;
                }
                this.Qhi = true;
                TTRewardVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                TTRewardVideoActivity.this.pA();
                TTRewardVideoActivity.this.tP();
                TTRewardVideoActivity.this.cJ.bxS.Qhi(j11, j11);
                TTRewardVideoActivity.this.cJ.tP.set(true);
                if (TTRewardVideoActivity.this.cJ.cJ.hpZ() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = TTRewardVideoActivity.this.cJ;
                    if (qhi3.f8797ac) {
                        qhi3.Dww.ac().CJ();
                        com.bytedance.sdk.openadsdk.utils.ABk.cJ();
                    }
                }
                if (TTRewardVideoActivity.this.cJ.cJ.YAV()) {
                    TTRewardVideoActivity.this.cJ.cJ.Jma(1);
                    TTRewardVideoActivity.this.cJ.es.HzH();
                }
                if (TTRewardVideoActivity.this.cJ.cJ.hpZ() == 21 && !TTRewardVideoActivity.this.cJ.cJ.CJ()) {
                    TTRewardVideoActivity.this.cJ.cJ.cJ(true);
                    TTRewardVideoActivity.this.cJ.es.HzH();
                }
                TTRewardVideoActivity.this.f8547zc = (int) (System.currentTimeMillis() / 1000);
                if (!com.bytedance.sdk.openadsdk.core.model.HzH.ac(TTRewardVideoActivity.this.cJ.cJ) && !com.bytedance.sdk.openadsdk.core.model.HzH.cJ(TTRewardVideoActivity.this.cJ.cJ) && !com.bytedance.sdk.openadsdk.core.model.HzH.CJ(TTRewardVideoActivity.this.cJ.cJ)) {
                    if (com.bytedance.sdk.openadsdk.core.model.HzH.Qhi(TTRewardVideoActivity.this.cJ.cJ) && !TTRewardVideoActivity.this.cJ.hpZ.get()) {
                        TTRewardVideoActivity.this.cJ.Qhi(true);
                        TTRewardVideoActivity.this.cJ.js.fl(true);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = TTRewardVideoActivity.this.cJ;
                    if (qhi4.f8797ac) {
                        if (qhi4.cJ.TGC()) {
                            TTRewardVideoActivity.this.cJ.js.ac();
                            return;
                        }
                        TTRewardVideoActivity.this.Qhi(false, 5);
                        if (com.bytedance.sdk.openadsdk.core.model.tP.fl(TTRewardVideoActivity.this.cJ.cJ)) {
                            return;
                        }
                        TTRewardVideoActivity.this.cJ.bxS.Qhi("skip", true);
                        return;
                    } else if (qhi4.cJ.TGC()) {
                        TTRewardVideoActivity.this.cJ.js.ac();
                        return;
                    } else {
                        if (!com.bytedance.sdk.openadsdk.core.model.tP.fl(TTRewardVideoActivity.this.cJ.cJ)) {
                            TTRewardVideoActivity.this.cJ.bxS.Qhi("skip", true);
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                }
                TTRewardVideoActivity.this.Qhi(false, 5);
                if (!com.bytedance.sdk.openadsdk.core.model.HzH.cJ(TTRewardVideoActivity.this.cJ.cJ) || (zcVar = TTRewardVideoActivity.this.cJ.gga) == null) {
                    return;
                }
                zcVar.Qhi(0L);
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void cJ(long j11, int i10) {
                TTRewardVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                if (TTRewardVideoActivity.this.cJ.bxS.cJ()) {
                    TTRewardVideoActivity.this.ABk();
                    return;
                }
                TTRewardVideoActivity.this.cJ.bxS.ABk();
                TTRewardVideoActivity.this.tP();
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity.cJ.f8797ac) {
                    tTRewardVideoActivity.Qhi(false, true, 3);
                } else {
                    tTRewardVideoActivity.finish();
                }
                pA pAVar = TTRewardVideoActivity.this.cJ.bxS;
                pAVar.Qhi(!pAVar.Eh(), 2);
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi() {
                TTRewardVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                TTRewardVideoActivity.this.pA();
                TTRewardVideoActivity.this.tP();
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity.cJ.f8797ac) {
                    tTRewardVideoActivity.Qhi(false, true, 6);
                } else {
                    tTRewardVideoActivity.finish();
                }
                pA pAVar = TTRewardVideoActivity.this.cJ.bxS;
                pAVar.Qhi(!pAVar.Eh(), 1 ^ TTRewardVideoActivity.this.cJ.bxS.Eh());
                TTRewardVideoActivity.this.cJ.bxS.ABk();
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = TTRewardVideoActivity.this.cJ;
                if (!qhi3.Qe && qhi3.bxS.cJ()) {
                    TTRewardVideoActivity.this.cJ.bxS.pA();
                }
                if (TTRewardVideoActivity.this.cJ.WAv.get()) {
                    return;
                }
                TTRewardVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                if (j11 != TTRewardVideoActivity.this.cJ.bxS.Sf()) {
                    TTRewardVideoActivity.this.pA();
                }
                TTRewardVideoActivity.this.cJ.bxS.Qhi(j11, j12);
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                long j13 = j11 / 1000;
                double d10 = j13;
                tTRewardVideoActivity.Tgh = (int) (tTRewardVideoActivity.cJ.bxS.aP() - d10);
                TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                int i10 = tTRewardVideoActivity2.Tgh;
                if (i10 >= 0) {
                    tTRewardVideoActivity2.cJ.js.Qhi(String.valueOf(i10), null);
                }
                TTRewardVideoActivity tTRewardVideoActivity3 = TTRewardVideoActivity.this;
                tTRewardVideoActivity3.Tgh = (int) (tTRewardVideoActivity3.cJ.bxS.aP() - d10);
                int i11 = (int) j13;
                int WAv = HzH.CJ().WAv(String.valueOf(TTRewardVideoActivity.this.cJ.Tgh));
                boolean z11 = WAv >= 0;
                if ((TTRewardVideoActivity.this.cJ.MQ.get() || TTRewardVideoActivity.this.cJ.Gm.get()) && TTRewardVideoActivity.this.cJ.bxS.cJ()) {
                    TTRewardVideoActivity.this.cJ.bxS.pA();
                }
                TTRewardVideoActivity.this.cJ.es.CJ(i11);
                TTRewardVideoActivity.this.Qhi(j11, j12);
                TTRewardVideoActivity tTRewardVideoActivity4 = TTRewardVideoActivity.this;
                if (tTRewardVideoActivity4.Tgh > 0) {
                    tTRewardVideoActivity4.cJ.js.CJ(true);
                    if (z11 && i11 >= WAv) {
                        TTRewardVideoActivity.this.cJ.Qhi(true);
                        TTRewardVideoActivity tTRewardVideoActivity5 = TTRewardVideoActivity.this;
                        tTRewardVideoActivity5.cJ.js.Qhi(String.valueOf(tTRewardVideoActivity5.Tgh), TTAdDislikeToast.getSkipText());
                        TTRewardVideoActivity.this.cJ.js.fl(true);
                        return;
                    }
                    TTRewardVideoActivity tTRewardVideoActivity6 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity6.cJ.js.Qhi(String.valueOf(tTRewardVideoActivity6.Tgh), null);
                }
            }
        };
        this.cJ.bxS.Qhi(qhi2);
        com.bytedance.sdk.openadsdk.core.model.HzH hzH = this.cJ.es.pA;
        if (hzH != null) {
            hzH.Qhi(qhi2);
        }
        boolean Qhi = this.cJ.bxS.Qhi(j10, z10, null, this.f8530ac);
        if (Qhi && !z10) {
            this.Gm = (int) (System.currentTimeMillis() / 1000);
        }
        return Qhi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final boolean z10, final int i10, final String str, final int i11, final String str2) {
        qMt.Qhi("BVA", "invoke callback onRewardVerify: " + z10 + ", " + i10 + ", " + str + ", " + i11 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onRewardVerify", z10, i10, str, i11, str2);
        } else {
            this.CJ.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar = TTRewardVideoActivity.this.ABk;
                    if (acVar != null) {
                        acVar.Qhi(z10, i10, str, i11, str2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(int i10) {
        if (i10 == 10000) {
            tP();
        }
    }

    public void Qhi(long j10, long j11) {
        long j12 = (this.cJ.YB * 1000) + j10;
        if (this.bxS == -1) {
            this.bxS = HzH.CJ().Eh(String.valueOf(this.cJ.Tgh)).Tgh;
        }
        if (j11 <= 0) {
            return;
        }
        if (j11 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL && j12 >= 27000) {
            tP();
        } else if (((float) (j12 * 100)) / ((float) j11) >= this.bxS) {
            tP();
        }
    }
}

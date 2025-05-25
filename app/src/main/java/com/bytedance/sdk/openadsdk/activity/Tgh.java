package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.cJ;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.MQ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.core.widget.Qhi;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zc;
import com.google.android.gms.common.api.Api;
import com.inmobi.commons.core.configs.CrashConfig;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardAdScene.java */
/* loaded from: classes.dex */
public class Tgh extends Qhi {
    private static String ABk;
    private static String HzH;
    private static String hpZ;
    private static String iMK;
    private static String pA;
    private int MQ;
    int ROR;
    protected int Tgh;

    /* renamed from: fl  reason: collision with root package name */
    protected int f8561fl;
    private String kYc;
    private String tP;

    public Tgh(cJ cJVar, tP tPVar, int i10) {
        super(cJVar, tPVar, i10);
        this.MQ = -1;
    }

    private JSONObject NFd() {
        JSONObject jSONObject = new JSONObject();
        int MQ = (int) this.f8520ac.bxS.MQ();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.f8520ac.cJ.MQ());
            jSONObject.put("reward_amount", this.f8520ac.cJ.qMt());
            jSONObject.put("network", hpZ.ac(this.f8520ac.f8800ip));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int zn2 = this.f8520ac.cJ.zn();
            String str = "unKnow";
            if (zn2 == 2) {
                str = js.cJ();
            } else if (zn2 == 1) {
                str = js.ac();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.f8520ac.cJ.KW());
            jSONObject.put("media_extra", this.tP);
            jSONObject.put("video_duration", this.f8520ac.cJ.FQ().Tgh());
            jSONObject.put("play_start_ts", this.Tgh);
            jSONObject.put("play_end_ts", this.f8561fl);
            jSONObject.put("duration", MQ);
            jSONObject.put("user_id", this.kYc);
            jSONObject.put("trans_id", bxS.Qhi().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.RewardAdScene", "", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0076, code lost:
        if (r3.f8520ac.hpZ.get() == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sDy() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ$Qhi r0 = new com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ$Qhi
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            long r1 = r1.ROR()
            r0.Qhi(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            long r1 = r1.tP()
            r0.ac(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            long r1 = r1.Gm()
            r0.cJ(r1)
            r1 = 3
            r0.ac(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            int r1 = r1.kYc()
            r0.CJ(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            com.bykv.vk.openvk.component.video.api.cJ.Qhi r1 = r1.ac()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r2 = r3.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r2 = r2.bxS
            com.bytedance.sdk.openadsdk.cJ.Sf r2 = r2.Qhi()
            com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.f8520ac
            int r0 = r0.Tgh
            com.bytedance.sdk.openadsdk.core.bxS.ac(r0)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r0 = r0.bxS
            java.lang.String r1 = "skip"
            r2 = 0
            r0.Qhi(r1, r2)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.f8520ac
            boolean r0 = r0.f8797ac
            if (r0 == 0) goto L78
            r0 = 1
            r1 = 4
            r3.Qhi(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.f8520ac
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r0.cJ
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.HzH.Qhi(r0)
            if (r0 == 0) goto L7b
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.f8520ac
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.hpZ
            boolean r0 = r0.get()
            if (r0 != 0) goto L7b
        L78:
            r3.CQU()
        L7b:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.f8520ac
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r0.cJ
            com.bytedance.sdk.openadsdk.core.ROR.Qhi r0 = r0.cJP()
            if (r0 == 0) goto L97
            com.bytedance.sdk.openadsdk.core.ROR.fl r0 = r0.Qhi()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r3.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            long r1 = r1.ROR()
            r0.Tgh(r1)
            r0.fl(r1)
        L97:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r3.f8520ac
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r0.cJ
            r1 = 5
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.Tgh.sDy():void");
    }

    public void EBS() {
        if (!bxS().hm().getBoolean("reward_verify", false) && !bxS().ABk()) {
            bxS().hm().putBoolean("reward_verify", true);
            if (HzH.CJ().hpZ(String.valueOf(this.f8520ac.Tgh))) {
                Qhi(true, this.f8520ac.cJ.qMt(), this.f8520ac.cJ.MQ(), 0, "");
                return;
            }
            HzH.ac().Qhi(NFd(), new tP.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.Tgh.6
                @Override // com.bytedance.sdk.openadsdk.core.tP.cJ
                public void Qhi(int i10, String str) {
                    Tgh.this.Qhi(false, 0, "", i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tP.cJ
                public void Qhi(MQ.cJ cJVar) {
                    boolean z10 = cJVar.cJ;
                    Tgh.this.Qhi(cJVar.cJ, cJVar.f8926ac.Qhi(), cJVar.f8926ac.cJ(), 0, "");
                }
            });
        }
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
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi
    public void ac() {
        final View WAv = this.f8520ac.es.WAv();
        if (WAv != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.Tgh.1
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.Tgh.AnonymousClass1.onClick(android.view.View):void");
                }
            };
            WAv.setOnClickListener(onClickListener);
            WAv.setTag(WAv.getId(), onClickListener);
        }
        this.f8520ac.js.Qhi(new com.bytedance.sdk.openadsdk.component.reward.top.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.Tgh.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void CJ(View view) {
                View view2 = WAv;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void Qhi(View view) {
                if (Tgh.this.f8520ac.cJ.Em()) {
                    if (Tgh.this.f8520ac.es.Gm() != null) {
                        Tgh.this.f8520ac.cJ.Jma(2);
                        Tgh.this.f8520ac.es.HzH();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = Tgh.this.f8520ac;
                if (!qhi.f8797ac && qhi.cJ.YCN() && !Tgh.this.f8520ac.cJ.IC()) {
                    Tgh.this.f8520ac.cJ.Jma(13);
                    try {
                        Tgh.this.f8520ac.es.HzH();
                        return;
                    } catch (Exception unused) {
                    }
                }
                Tgh tgh = Tgh.this;
                tgh.Qhi(com.bytedance.sdk.openadsdk.core.model.bxS.Gm(tgh.f8520ac.cJ), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void ac(View view) {
                Tgh tgh = Tgh.this;
                tgh.f8520ac.sDy.Qhi(tgh.cJ);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void cJ(View view) {
                com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = Tgh.this.cJ;
                if (cJVar != null && cJVar.CJ() != null) {
                    Tgh.this.cJ.CJ().Qhi(Tgh.this.f8520ac.dIT);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = Tgh.this.f8520ac;
                qhi.dIT = !qhi.dIT;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(Tgh.this.f8520ac.dIT);
                sb2.append(" mLastVolume=");
                sb2.append(Tgh.this.f8520ac.lB.Qhi());
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = Tgh.this.f8520ac;
                qhi2.bxS.cJ(qhi2.dIT);
                if (com.bytedance.sdk.openadsdk.core.model.bxS.zc(Tgh.this.f8520ac.cJ) && !Tgh.this.f8520ac.WAv.get()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.bxS.cJ(Tgh.this.f8520ac.cJ)) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = Tgh.this.f8520ac;
                    qhi3.lB.Qhi(qhi3.dIT, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = Tgh.this.f8520ac;
                qhi4.lG.CJ(qhi4.dIT);
                com.bytedance.sdk.openadsdk.core.model.tP tPVar = Tgh.this.f8520ac.cJ;
                if (tPVar != null && tPVar.cJP() != null && Tgh.this.f8520ac.cJ.cJP().Qhi() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi5 = Tgh.this.f8520ac;
                    if (qhi5.bxS != null) {
                        if (qhi5.dIT) {
                            qhi5.cJ.cJP().Qhi().Sf(Tgh.this.f8520ac.bxS.ROR());
                        } else {
                            qhi5.cJ.cJP().Qhi().hm(Tgh.this.f8520ac.bxS.ROR());
                        }
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public String b_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi
    public void cJ() {
        this.f8520ac.js.Qhi(null, TTAdDislikeToast.getSkipText());
        this.f8520ac.js.fl(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void c_() {
        aP();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r1 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (((1.0d - (r8.ROR / r8.f8520ac.bxS.aP())) * 100.0d) >= r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
        r2 = true;
     */
    @Override // com.bytedance.sdk.openadsdk.activity.Qhi, com.bytedance.sdk.openadsdk.activity.ROR, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void iMK() {
        /*
            r8 = this;
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r8.Sf
            boolean r0 = r0.LpL()
            if (r0 != 0) goto L9
            return
        L9:
            com.bytedance.sdk.openadsdk.core.settings.ROR r0 = com.bytedance.sdk.openadsdk.core.HzH.CJ()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.f8520ac
            int r1 = r1.Tgh
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.settings.cJ r0 = r0.Eh(r1)
            int r0 = r0.Tgh
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.f8520ac
            com.bytedance.sdk.openadsdk.core.model.tP r1 = r1.cJ
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.bxS.zc(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L40
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r1 = r1.bxS
            double r4 = r1.aP()
            int r1 = r8.ROR
            double r6 = (double) r1
            double r6 = r6 / r4
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r6
            double r0 = (double) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L92
        L3e:
            r2 = r3
            goto L92
        L40:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.f8520ac
            com.bytedance.sdk.openadsdk.core.model.tP r1 = r1.cJ
            int r1 = r1.TKG()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r4 = r8.f8520ac
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
            if (r0 < 0) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r2
        L61:
            com.bytedance.sdk.openadsdk.core.settings.ROR r1 = com.bytedance.sdk.openadsdk.core.HzH.CJ()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r4 = r8.f8520ac
            int r4 = r4.Tgh
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.Qhi(r4)
            if (r1 != 0) goto L8f
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r8.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ r1 = r1.lG
            com.bytedance.sdk.openadsdk.core.NFd r1 = r1.WAv()
            boolean r1 = r1.fl()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r4 = r8.f8520ac
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf r4 = r4.CQU
            boolean r4 = r4.kYc()
            if (r4 == 0) goto L8a
            r1 = r3
        L8a:
            if (r0 == 0) goto L92
            if (r1 == 0) goto L92
            goto L3e
        L8f:
            if (r1 != r3) goto L92
            r2 = r0
        L92:
            if (r2 == 0) goto L97
            r8.EBS()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.Tgh.iMK():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void zc() {
        EBS();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi, com.bytedance.sdk.openadsdk.activity.ROR
    public void Qhi(Activity activity, cJ.fl flVar) {
        super.Qhi(activity, flVar);
        if (activity.isFinishing()) {
            return;
        }
        Intent intent = activity.getIntent();
        this.tP = intent.getStringExtra("media_extra");
        this.kYc = intent.getStringExtra("user_id");
        try {
            if (hpZ == null) {
                hpZ = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8520ac.f8800ip, "tt_reward_msg");
                ABk = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8520ac.f8800ip, "tt_msgPlayable");
                pA = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8520ac.f8800ip, "tt_negtiveBtnBtnText");
                HzH = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8520ac.f8800ip, "tt_postiveBtnText");
                iMK = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8520ac.f8800ip, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.RewardAdScene", th2.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.Qhi, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(int i10) {
        if (i10 == 10000) {
            EBS();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public boolean Qhi(long j10, boolean z10) {
        Sf sf2;
        if (this.Sf.Qhi()) {
            com.bytedance.sdk.openadsdk.component.reward.view.ac acVar = this.f8520ac.pM;
            if (acVar != null && acVar.Qhi() != null) {
                sf2 = this.f8520ac.pM.Qhi().getAdShowTime();
            } else {
                sf2 = new Sf();
            }
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
            qhi.bxS.Qhi(qhi.pM.cJ(), sf2);
            HashMap hashMap = new HashMap();
            com.bytedance.sdk.openadsdk.component.reward.view.ac acVar2 = this.f8520ac.pM;
            if (acVar2 != null) {
                hashMap.put("dynamic_show_type", Integer.valueOf(acVar2.hm()));
                JSONObject Qhi = this.f8520ac.pM.Qhi((JSONObject) null);
                if (Qhi != null) {
                    Iterator<String> keys = Qhi.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            hashMap.put(next, Qhi.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            this.f8520ac.bxS.Qhi(new fl.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.Tgh.3
                boolean Qhi;

                @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
                public void Qhi(long j11, int i10) {
                    if (this.Qhi) {
                        return;
                    }
                    this.Qhi = true;
                    ((Qhi) Tgh.this).Qhi.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                    Tgh.this.ABk();
                    Tgh.this.f8520ac.bxS.Qhi(j11, j11);
                    Tgh.this.f8520ac.pM.cJ(true);
                    if (Tgh.this.f8520ac.cJ.hpZ() == 36) {
                        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = Tgh.this.f8520ac;
                        if (qhi2.f8797ac) {
                            qhi2.Dww.ac().CJ();
                            com.bytedance.sdk.openadsdk.utils.ABk.cJ();
                        }
                    }
                    if (Tgh.this.f8520ac.cJ.hpZ() == 21 && !Tgh.this.f8520ac.cJ.CJ()) {
                        Tgh.this.f8520ac.cJ.cJ(true);
                        Tgh.this.f8520ac.es.HzH();
                    }
                    Tgh tgh = Tgh.this;
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = tgh.f8520ac;
                    if (qhi3.VnT) {
                        cJ bxS = tgh.bxS();
                        Tgh tgh2 = Tgh.this;
                        bxS.Qhi(tgh2, tgh2.cJ(5));
                    } else if (qhi3.f8797ac) {
                        if (qhi3.cJ.TGC()) {
                            if (Tgh.this.f8520ac.pM.hm() == 1) {
                                Tgh.this.f8520ac.js.ac();
                            }
                        } else {
                            Tgh.this.Qhi(false, 5);
                            if (!com.bytedance.sdk.openadsdk.core.model.tP.fl(Tgh.this.f8520ac.cJ)) {
                                Tgh.this.f8520ac.bxS.Qhi("skip", true);
                            }
                        }
                    } else if (qhi3.cJ.TGC()) {
                        if (Tgh.this.f8520ac.pM.hm() == 1) {
                            Tgh.this.f8520ac.js.ac();
                        }
                    } else {
                        if (!com.bytedance.sdk.openadsdk.core.model.tP.fl(Tgh.this.f8520ac.cJ)) {
                            Tgh.this.f8520ac.bxS.Qhi("skip", true);
                        }
                        Tgh.this.CQU();
                    }
                    Tgh.this.f8561fl = (int) (System.currentTimeMillis() / 1000);
                    Tgh tgh3 = Tgh.this;
                    if (tgh3.f8520ac.VnT) {
                        return;
                    }
                    tgh3.EBS();
                }

                @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
                public void cJ(long j11, int i10) {
                    ((Qhi) Tgh.this).Qhi.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                    if (Tgh.this.f8520ac.bxS.cJ()) {
                        Tgh.this.fl();
                        return;
                    }
                    Tgh.this.EBS();
                    Tgh.this.f8520ac.bxS.ABk();
                    Tgh.this.f8520ac.pM.Qhi(true);
                    cJ bxS = Tgh.this.bxS();
                    Tgh tgh = Tgh.this;
                    bxS.Qhi(tgh, tgh.cJ(3));
                }

                @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
                public void Qhi() {
                    ((Qhi) Tgh.this).Qhi.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                    Tgh.this.ABk();
                    Tgh.this.EBS();
                    cJ bxS = Tgh.this.bxS();
                    Tgh tgh = Tgh.this;
                    bxS.Qhi(tgh, tgh.cJ(6));
                }

                @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
                public void Qhi(long j11, long j12) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = Tgh.this.f8520ac;
                    if (!qhi2.Qe && qhi2.bxS.cJ()) {
                        Tgh.this.f8520ac.bxS.pA();
                    }
                    if (Tgh.this.f8520ac.WAv.get()) {
                        return;
                    }
                    ((Qhi) Tgh.this).Qhi.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                    if (j11 != Tgh.this.f8520ac.bxS.Sf()) {
                        Tgh.this.ABk();
                    }
                    if (Tgh.this.f8520ac.bxS.cJ()) {
                        Tgh.this.f8520ac.bxS.Qhi(j11, j12);
                        int WAv = HzH.CJ().WAv(String.valueOf(Tgh.this.f8520ac.Tgh));
                        boolean z11 = Tgh.this.f8520ac.pM.Sf() && WAv != -1 && WAv >= 0;
                        Tgh tgh = Tgh.this;
                        long j13 = j11 / 1000;
                        tgh.ROR = (int) (tgh.f8520ac.bxS.aP() - j13);
                        int i10 = (int) j13;
                        if ((Tgh.this.f8520ac.MQ.get() || Tgh.this.f8520ac.Gm.get()) && Tgh.this.f8520ac.bxS.cJ()) {
                            Tgh.this.f8520ac.bxS.pA();
                        }
                        Tgh tgh2 = Tgh.this;
                        int i11 = tgh2.ROR;
                        if (i11 >= 0) {
                            tgh2.f8520ac.js.Qhi(String.valueOf(i11), null);
                        }
                        Tgh.this.f8520ac.es.CJ(i10);
                        Tgh.this.Qhi(j11, j12);
                        com.bytedance.sdk.openadsdk.component.reward.view.ac acVar3 = Tgh.this.f8520ac.pM;
                        if (acVar3 != null && acVar3.Qhi() != null) {
                            Tgh.this.f8520ac.pM.Qhi().Qhi(String.valueOf(Tgh.this.ROR), i10, 0, false);
                        }
                        Tgh.this.Qhi((((float) j11) * 1.0f) / ((float) j12));
                        Tgh tgh3 = Tgh.this;
                        if (tgh3.ROR > 0) {
                            if (z11 && i10 >= WAv && tgh3.f8520ac.cJ.hpZ() != 5) {
                                Tgh.this.f8520ac.Qhi(true);
                                Tgh tgh4 = Tgh.this;
                                tgh4.f8520ac.js.Qhi(String.valueOf(tgh4.ROR), TTAdDislikeToast.getSkipText());
                                Tgh.this.f8520ac.js.fl(true);
                                return;
                            }
                            Tgh tgh5 = Tgh.this;
                            tgh5.f8520ac.js.Qhi(String.valueOf(tgh5.ROR), null);
                        }
                    }
                }
            });
            boolean Qhi2 = this.f8520ac.bxS.Qhi(j10, z10, hashMap, this.cJ);
            if (Qhi2 && !z10) {
                this.Tgh = (int) (System.currentTimeMillis() / 1000);
            }
            return Qhi2;
        }
        Sf sf3 = new Sf();
        sf3.Qhi(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.f8520ac;
        qhi2.bxS.Qhi(qhi2.es.Tgh(), sf3);
        fl.Qhi qhi3 = new fl.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.Tgh.4
            boolean Qhi;

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi(long j11, int i10) {
                zc zcVar;
                if (this.Qhi) {
                    return;
                }
                this.Qhi = true;
                ((Qhi) Tgh.this).Qhi.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                Tgh.this.ABk();
                Tgh tgh = Tgh.this;
                if (!tgh.f8520ac.VnT) {
                    tgh.EBS();
                }
                Tgh.this.f8520ac.bxS.Qhi(j11, j11);
                Tgh.this.f8520ac.tP.set(true);
                if (Tgh.this.f8520ac.cJ.YAV()) {
                    Tgh.this.f8520ac.cJ.Jma(1);
                    Tgh.this.f8520ac.es.HzH();
                }
                if (Tgh.this.f8520ac.cJ.hpZ() == 21 && !Tgh.this.f8520ac.cJ.CJ()) {
                    Tgh.this.f8520ac.cJ.cJ(true);
                    Tgh.this.f8520ac.es.HzH();
                }
                Tgh.this.f8561fl = (int) (System.currentTimeMillis() / 1000);
                Tgh tgh2 = Tgh.this;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = tgh2.f8520ac;
                if (qhi4.VnT) {
                    cJ.fl cJ = tgh2.cJ(5);
                    cJ.CJ = true;
                    Tgh.this.bxS().Qhi(Tgh.this, cJ);
                } else if (!com.bytedance.sdk.openadsdk.core.model.HzH.ac(qhi4.cJ) && !com.bytedance.sdk.openadsdk.core.model.HzH.cJ(Tgh.this.f8520ac.cJ) && !com.bytedance.sdk.openadsdk.core.model.HzH.CJ(Tgh.this.f8520ac.cJ)) {
                    if (com.bytedance.sdk.openadsdk.core.model.HzH.Qhi(Tgh.this.f8520ac.cJ) && !Tgh.this.f8520ac.hpZ.get()) {
                        Tgh.this.f8520ac.Qhi(true);
                        Tgh.this.f8520ac.js.fl(true);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi5 = Tgh.this.f8520ac;
                    if (qhi5.f8797ac) {
                        if (qhi5.cJ.TGC()) {
                            Tgh.this.f8520ac.js.ac();
                            return;
                        }
                        Tgh.this.Qhi(false, 5);
                        if (com.bytedance.sdk.openadsdk.core.model.tP.fl(Tgh.this.f8520ac.cJ)) {
                            return;
                        }
                        Tgh.this.f8520ac.bxS.Qhi("skip", true);
                    } else if (qhi5.cJ.TGC()) {
                        Tgh.this.f8520ac.js.ac();
                    } else {
                        if (!com.bytedance.sdk.openadsdk.core.model.tP.fl(Tgh.this.f8520ac.cJ)) {
                            Tgh.this.f8520ac.bxS.Qhi("skip", true);
                        }
                        Tgh.this.CQU();
                    }
                } else {
                    Tgh.this.Qhi(false, 5);
                    if (!com.bytedance.sdk.openadsdk.core.model.HzH.cJ(Tgh.this.f8520ac.cJ) || (zcVar = Tgh.this.f8520ac.gga) == null) {
                        return;
                    }
                    zcVar.Qhi(0L);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void cJ(long j11, int i10) {
                ((Qhi) Tgh.this).Qhi.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                if (Tgh.this.f8520ac.bxS.cJ()) {
                    Tgh.this.fl();
                    return;
                }
                Tgh.this.f8520ac.bxS.ABk();
                Tgh.this.EBS();
                cJ bxS = Tgh.this.bxS();
                Tgh tgh = Tgh.this;
                bxS.Qhi(tgh, tgh.cJ(3));
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi() {
                ((Qhi) Tgh.this).Qhi.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                Tgh.this.ABk();
                Tgh.this.EBS();
                cJ bxS = Tgh.this.bxS();
                Tgh tgh = Tgh.this;
                bxS.Qhi(tgh, tgh.cJ(6));
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = Tgh.this.f8520ac;
                if (!qhi4.Qe && qhi4.bxS.cJ()) {
                    Tgh.this.f8520ac.bxS.pA();
                }
                if (Tgh.this.f8520ac.WAv.get()) {
                    return;
                }
                ((Qhi) Tgh.this).Qhi.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                if (j11 != Tgh.this.f8520ac.bxS.Sf()) {
                    Tgh.this.ABk();
                }
                Tgh.this.f8520ac.bxS.Qhi(j11, j12);
                Tgh tgh = Tgh.this;
                long j13 = j11 / 1000;
                double d10 = j13;
                tgh.ROR = (int) (tgh.f8520ac.bxS.aP() - d10);
                Tgh tgh2 = Tgh.this;
                int i10 = tgh2.ROR;
                if (i10 >= 0) {
                    tgh2.f8520ac.js.Qhi(String.valueOf(i10), null);
                }
                Tgh tgh3 = Tgh.this;
                tgh3.ROR = (int) (tgh3.f8520ac.bxS.aP() - d10);
                int i11 = (int) j13;
                int WAv = HzH.CJ().WAv(String.valueOf(Tgh.this.f8520ac.Tgh));
                boolean z11 = WAv >= 0;
                if ((Tgh.this.f8520ac.MQ.get() || Tgh.this.f8520ac.Gm.get()) && Tgh.this.f8520ac.bxS.cJ()) {
                    Tgh.this.f8520ac.bxS.pA();
                }
                Tgh.this.f8520ac.es.CJ(i11);
                Tgh.this.Qhi(j11, j12);
                Tgh.this.Qhi((((float) j11) * 1.0f) / ((float) j12));
                Tgh tgh4 = Tgh.this;
                if (tgh4.ROR > 0) {
                    tgh4.f8520ac.js.CJ(true);
                    if (z11 && i11 >= WAv) {
                        Tgh.this.f8520ac.Qhi(true);
                        Tgh tgh5 = Tgh.this;
                        tgh5.f8520ac.js.Qhi(String.valueOf(tgh5.ROR), TTAdDislikeToast.getSkipText());
                        Tgh.this.f8520ac.js.fl(true);
                        return;
                    }
                    Tgh tgh6 = Tgh.this;
                    tgh6.f8520ac.js.Qhi(String.valueOf(tgh6.ROR), null);
                }
            }
        };
        this.f8520ac.bxS.Qhi(qhi3);
        com.bytedance.sdk.openadsdk.core.model.HzH hzH = this.f8520ac.es.pA;
        if (hzH != null) {
            hzH.Qhi(qhi3);
        }
        boolean Qhi3 = this.f8520ac.bxS.Qhi(j10, z10, null, this.cJ);
        if (Qhi3 && !z10) {
            this.Tgh = (int) (System.currentTimeMillis() / 1000);
        }
        return Qhi3;
    }

    public void Qhi(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        if (qhi.VnT) {
            return;
        }
        long j12 = (qhi.YB * 1000) + j10;
        if (this.MQ == -1) {
            this.MQ = HzH.CJ().Eh(String.valueOf(this.f8520ac.Tgh)).Tgh;
        }
        if (j11 <= 0) {
            return;
        }
        if (j11 >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL && j12 >= 27000) {
            EBS();
        } else if (((float) (j12 * 100)) / ((float) j11) >= this.MQ) {
            EBS();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final boolean z10, boolean z11) {
        if (!z11 && bxS().hm().getBoolean("user_has_give_up_reward", false) && com.bytedance.sdk.openadsdk.core.model.bxS.ac(this.f8520ac.cJ)) {
            sDy();
        } else if (!HzH.CJ().Sf(String.valueOf(this.f8520ac.Tgh))) {
            if (z10) {
                CQU();
            } else {
                sDy();
            }
        } else if (bxS().hm().getBoolean("reward_verify", false)) {
            if (com.bytedance.sdk.openadsdk.core.model.bxS.ac(this.f8520ac.cJ)) {
                sDy();
            } else if (z10) {
                CQU();
            } else {
                sDy();
            }
        } else {
            this.f8520ac.MQ.set(true);
            this.f8520ac.bxS.pA();
            if (z10) {
                this.f8520ac.CQU.pA();
            }
            final com.bytedance.sdk.openadsdk.core.widget.Qhi qhi = new com.bytedance.sdk.openadsdk.core.widget.Qhi(Dww());
            this.cJ.ABk = qhi;
            if (z10) {
                qhi.Qhi(ABk).cJ(iMK).ac(pA);
            } else {
                qhi.Qhi(hpZ).cJ(HzH).ac(pA);
            }
            this.cJ.ABk.Qhi(new Qhi.InterfaceC0133Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.Tgh.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.InterfaceC0133Qhi
                public void Qhi() {
                    Tgh.this.f8520ac.bxS.iMK();
                    if (z10) {
                        Tgh.this.f8520ac.CQU.Qhi(1000L);
                    }
                    qhi.dismiss();
                    Tgh.this.f8520ac.MQ.set(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.InterfaceC0133Qhi
                public void cJ() {
                    qhi.dismiss();
                    Tgh.this.bxS().hm().putBoolean("user_has_give_up_reward", true);
                    Tgh.this.f8520ac.MQ.set(false);
                    Tgh.this.f8520ac.CQU.Tgh(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    if (!z10) {
                        Tgh.this.sDy();
                    } else if (com.bytedance.sdk.openadsdk.core.model.bxS.ac(Tgh.this.f8520ac.cJ)) {
                        if (!Tgh.this.f8520ac.CQU.tP()) {
                            Tgh.this.sDy();
                        } else {
                            Tgh.this.f8520ac.CQU.cJ(5);
                        }
                    } else {
                        Tgh.this.f8520ac.aP.Tgh();
                        if (Tgh.this.f8520ac.CQU.tP()) {
                            Tgh.this.f8520ac.CQU.cJ(4);
                        }
                        Tgh.this.CQU();
                    }
                }
            }).show();
        }
    }
}

package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.cJ;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.core.MQ;
import com.bytedance.sdk.openadsdk.core.model.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.core.widget.Qhi;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.android.gms.common.api.Api;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: EndCardScene.java */
/* loaded from: classes.dex */
public class ac extends ROR implements CQU.Qhi, com.bytedance.sdk.openadsdk.core.video.ac.cJ {
    private static String ABk;
    private static String CJ;
    private static String ROR;
    private static String Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private static String f8563fl;
    private boolean HzH;
    protected final CQU Qhi;

    /* renamed from: ac  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi f8564ac;
    protected com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJ;
    private cJ.fl hpZ;
    private Bundle iMK;
    private String kYc;
    private int pA;
    private String tP;

    public ac(cJ cJVar, tP tPVar, int i10) {
        super(cJVar, tPVar, i10);
        this.Qhi = new CQU(Looper.getMainLooper(), this);
        this.pA = 0;
        Qhi(tPVar, this.iMK);
        try {
            hpZ();
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.EndCardScene", "onCreate: ", th2);
            CQU();
        }
    }

    private boolean EBS() {
        if (this.f8564ac.WAv.get() && this.f8564ac.ROR) {
            return false;
        }
        if (this.Sf.Qhi()) {
            return this.f8564ac.WAv.get();
        }
        return true;
    }

    private JSONObject NFd() {
        JSONObject jSONObject = new JSONObject();
        int MQ = (int) this.f8564ac.bxS.MQ();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.f8564ac.cJ.MQ());
            jSONObject.put("reward_amount", this.f8564ac.cJ.qMt());
            jSONObject.put("network", hpZ.ac(this.f8564ac.f8800ip));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int zn2 = this.f8564ac.cJ.zn();
            String str = "unKnow";
            if (zn2 == 2) {
                str = js.cJ();
            } else if (zn2 == 1) {
                str = js.ac();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.f8564ac.cJ.KW());
            jSONObject.put("media_extra", this.tP);
            jSONObject.put("video_duration", this.f8564ac.cJ.FQ().Tgh());
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("duration", MQ);
            jSONObject.put("user_id", this.kYc);
            jSONObject.put("trans_id", bxS.Qhi().replace("-", ""));
            return jSONObject;
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.EndCardScene", "", th2);
            return null;
        }
    }

    private void hpZ() {
        this.f8564ac.yN.Qhi(this.cJ);
        this.cJ.Qhi(this, this.Qhi);
        this.cJ.Gm();
    }

    private void kYc() {
        if (this.HzH) {
            return;
        }
        this.HzH = true;
        this.cJ.Qhi(this.f8523zc);
        qMt();
    }

    private void qMt() {
        final View WAv = this.f8564ac.es.WAv();
        if (WAv != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.ac.1
                /* JADX WARN: Removed duplicated region for block: B:28:0x00cc A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onClick(android.view.View r5) {
                    /*
                        Method dump skipped, instructions count: 271
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.ac.AnonymousClass1.onClick(android.view.View):void");
                }
            };
            WAv.setOnClickListener(onClickListener);
            WAv.setTag(WAv.getId(), onClickListener);
        }
        this.f8564ac.js.Qhi(new com.bytedance.sdk.openadsdk.component.reward.top.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.ac.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void CJ(View view) {
                View view2 = WAv;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void Qhi(View view) {
                ac acVar = ac.this;
                if (acVar.Qhi(com.bytedance.sdk.openadsdk.core.model.bxS.Gm(acVar.f8564ac.cJ), false)) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.bxS.ac(ac.this.f8564ac.cJ)) {
                    if (ac.this.f8564ac.CQU.tP()) {
                        ac.this.f8564ac.CQU.cJ(5);
                    } else {
                        ac.this.f8564ac.lG.ROR();
                    }
                } else if (!com.bytedance.sdk.openadsdk.core.model.bxS.Gm(ac.this.f8564ac.cJ) && (!HzH.Qhi(ac.this.f8564ac.cJ) || ac.this.f8564ac.hpZ.get())) {
                    ac.this.CQU();
                } else {
                    if (!com.bytedance.sdk.openadsdk.core.model.bxS.ac(ac.this.f8564ac.cJ) && ac.this.f8564ac.CQU.tP()) {
                        ac.this.f8564ac.CQU.cJ(4);
                    }
                    ac.this.CQU();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void ac(View view) {
                ac acVar = ac.this;
                acVar.f8564ac.sDy.Qhi(acVar.cJ);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.cJ
            public void cJ(View view) {
                com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = ac.this.cJ;
                if (cJVar != null && cJVar.CJ() != null) {
                    ac.this.cJ.CJ().Qhi(ac.this.f8564ac.dIT);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = ac.this.f8564ac;
                qhi.dIT = !qhi.dIT;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(ac.this.f8564ac.dIT);
                sb2.append(" mLastVolume=");
                sb2.append(ac.this.f8564ac.lB.Qhi());
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = ac.this.f8564ac;
                qhi2.bxS.cJ(qhi2.dIT);
                if (com.bytedance.sdk.openadsdk.core.model.bxS.zc(ac.this.f8564ac.cJ) && !ac.this.f8564ac.WAv.get()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.bxS.cJ(ac.this.f8564ac.cJ)) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = ac.this.f8564ac;
                    qhi3.lB.Qhi(qhi3.dIT, true);
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = ac.this.f8564ac;
                qhi4.lG.CJ(qhi4.dIT);
                tP tPVar = ac.this.f8564ac.cJ;
                if (tPVar != null && tPVar.cJP() != null && ac.this.f8564ac.cJ.cJP().Qhi() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi5 = ac.this.f8564ac;
                    if (qhi5.bxS != null) {
                        if (qhi5.dIT) {
                            qhi5.cJ.cJP().Qhi().Sf(ac.this.f8564ac.bxS.ROR());
                        } else {
                            qhi5.cJ.cJP().Qhi().hm(ac.this.f8564ac.bxS.ROR());
                        }
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void CJ() {
        aP();
        this.f8564ac.cJ.wI();
        this.f8564ac.cJ.Qhi(true);
        if (tP.fl(this.f8564ac.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8564ac;
            tP tPVar = qhi.cJ;
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, qhi.f8798fl, tPVar.gSh());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void Gm() {
        if (this.f8564ac.iMK.getAndSet(true) && !com.bytedance.sdk.openadsdk.core.model.bxS.Gm(this.f8564ac.cJ)) {
            return;
        }
        this.f8564ac.aP.Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void HzH() {
        super.HzH();
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar != null) {
            cJVar.bxS();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public String MQ() {
        return this.f8564ac.MND;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void Sf() {
        if (bxS() == null) {
            return;
        }
        this.f8564ac.f8802zn.Qhi(this.hpZ.Qhi.getBoolean("isSkip", false), this.hpZ.Qhi.getBoolean("force", false), this.hpZ.Qhi.getBoolean("isFromLandingPage", false), this.cJ, this.hpZ.cJ);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void Tgh() {
        Eh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final View WAv() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public boolean a_() {
        return this.f8564ac.CJ;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void ac(Activity activity) {
        super.ac(activity);
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar == null) {
            return;
        }
        cJVar.qMt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public String b_() {
        return this.f8564ac.f8798fl;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final void cJ(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar;
        boolean z10;
        super.cJ(activity);
        if (this.f8564ac != null && (cJVar = this.cJ) != null) {
            cJVar.HzH();
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8564ac;
            qhi.Qe = true;
            qhi.Eh.cJ(this.Qhi);
            if (EBS()) {
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.f8564ac;
                qhi2.js.Qhi(qhi2.cJ.rB());
            }
            this.f8564ac.es.pA();
            this.f8564ac.lG.MQ();
            this.f8564ac.CQU.ABk();
            if (this.cJ.cJ()) {
                this.f8564ac.bxS.Qhi(this.cJ);
                pA pAVar = this.f8564ac.bxS;
                if (this.pA != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pAVar.Qhi(false, this, z10);
            }
            this.pA++;
            com.bytedance.sdk.openadsdk.component.reward.view.ac acVar = this.f8564ac.pM;
            if (acVar != null) {
                acVar.ROR();
            }
            this.f8564ac.Eh.Qhi(this.Qhi);
            this.cJ.tP();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void c_() {
        aP();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final void fl(Activity activity) {
        super.fl(activity);
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar == null) {
            return;
        }
        cJVar.MQ();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void iMK() {
        boolean z10;
        boolean z11 = true;
        boolean z12 = false;
        if ((1.0f - (this.f8564ac.CQU.zc() / this.f8564ac.cJ.TKG())) * 100.0f >= com.bytedance.sdk.openadsdk.core.HzH.CJ().Eh(String.valueOf(this.f8564ac.Tgh)).Tgh) {
            z10 = true;
        } else {
            z10 = false;
        }
        int Qhi = com.bytedance.sdk.openadsdk.core.HzH.CJ().Qhi(String.valueOf(this.f8564ac.Tgh));
        if (Qhi == 0) {
            boolean fl2 = this.f8564ac.lG.WAv().fl();
            if (this.f8564ac.CQU.kYc()) {
                fl2 = true;
            }
            if (!z10 || !fl2) {
                z11 = false;
            }
            z12 = z11;
        } else if (Qhi == 1) {
            z12 = z10;
        }
        if (z12) {
            ac();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void pA() {
        super.pA();
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar == null) {
            return;
        }
        cJVar.EBS();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public boolean tP() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8564ac;
        if (qhi != null && qhi.bxS.Dww()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void zc() {
        ac();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public boolean Qhi(long j10, boolean z10) {
        return false;
    }

    public void ac() {
        if (bxS().hm().getBoolean("reward_verify", false) || bxS().ABk()) {
            return;
        }
        bxS().hm().putBoolean("reward_verify", true);
        if (com.bytedance.sdk.openadsdk.core.HzH.CJ().hpZ(String.valueOf(this.f8564ac.Tgh))) {
            Qhi(true, this.f8564ac.cJ.qMt(), this.f8564ac.cJ.MQ(), 0, "");
            return;
        }
        com.bytedance.sdk.openadsdk.core.HzH.ac().Qhi(NFd(), new tP.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.ac.3
            @Override // com.bytedance.sdk.openadsdk.core.tP.cJ
            public void Qhi(int i10, String str) {
                ac.this.Qhi(false, 0, "", i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tP.cJ
            public void Qhi(MQ.cJ cJVar) {
                ac.this.Qhi(cJVar.cJ, cJVar.f8926ac.Qhi(), cJVar.f8926ac.cJ(), 0, "");
            }
        });
    }

    public void fl() {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar == null) {
            return;
        }
        cJVar.Eh();
        this.f8564ac.f8802zn.cJ();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final void Qhi(Activity activity, Bundle bundle) {
        this.iMK = bundle;
        super.Qhi(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final void CJ(Activity activity) {
        super.CJ(activity);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8564ac;
        if (qhi == null) {
            return;
        }
        qhi.lG.sDy();
        com.bytedance.sdk.openadsdk.utils.ac.Qhi(activity, this.f8564ac.cJ);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final View Qhi() {
        return this.f8564ac.yN;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void Qhi(Activity activity, cJ.fl flVar) {
        super.Qhi(activity, flVar);
        this.hpZ = flVar;
        Intent intent = activity.getIntent();
        this.tP = intent.getStringExtra("media_extra");
        this.kYc = intent.getStringExtra("user_id");
        try {
            if (ROR == null) {
                ROR = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8564ac.f8800ip, "tt_reward_msg");
                CJ = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8564ac.f8800ip, "tt_msgPlayable");
                Tgh = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8564ac.f8800ip, "tt_negtiveBtnBtnText");
                ABk = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8564ac.f8800ip, "tt_postiveBtnText");
                f8563fl = com.bytedance.sdk.component.utils.MQ.Qhi(this.f8564ac.f8800ip, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.EndCardScene", th2.getMessage());
        }
        kYc();
        Sf();
    }

    private void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, Bundle bundle) {
        Activity Dww = Dww();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = new com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi(Dww, this.Qhi, tPVar, this, 2);
        this.f8564ac = qhi;
        qhi.VnT = bxS().Qhi();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.f8564ac;
        qhi2.Ura = this;
        qhi2.lB = bxS().HzH();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(this.f8564ac, Dww.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ Qhi = com.bytedance.sdk.openadsdk.component.reward.cJ.ROR.Qhi(this.f8564ac);
        this.cJ = Qhi;
        this.f8564ac.ReL = Qhi;
        Objects.toString(Qhi);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void hm() {
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public final void Qhi(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar == null) {
            return;
        }
        cJVar.Qhi(message);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void Qhi(ROR ror, ROR ror2, cJ.fl flVar) {
        super.Qhi(ror, ror2, flVar);
        if (ror != null || ror2 == this) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.bxS.cJ(this.f8564ac.cJ)) {
            bxS().Qhi(Qhi());
        }
        kYc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Qhi(final boolean z10, boolean z11) {
        if (!this.f8564ac.CJ || bxS().hm().getBoolean("reward_verify", false) || bxS().ABk()) {
            return false;
        }
        if (z11 || !bxS().hm().getBoolean("user_has_give_up_reward", false)) {
            if (!com.bytedance.sdk.openadsdk.core.HzH.CJ().Sf(String.valueOf(this.f8564ac.Tgh))) {
                if (!z11) {
                    return false;
                }
                if (z10) {
                    CQU();
                    return true;
                }
            }
            this.f8564ac.MQ.set(true);
            if (z10) {
                this.f8564ac.CQU.pA();
            }
            final com.bytedance.sdk.openadsdk.core.widget.Qhi qhi = new com.bytedance.sdk.openadsdk.core.widget.Qhi(this.f8564ac.FQ);
            this.cJ.ABk = qhi;
            if (z10) {
                qhi.Qhi(CJ).cJ(f8563fl).ac(Tgh);
            } else {
                qhi.Qhi(ROR).cJ(ABk).ac(Tgh);
            }
            this.cJ.ABk.Qhi(new Qhi.InterfaceC0133Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.ac.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.InterfaceC0133Qhi
                public void Qhi() {
                    if (z10) {
                        ac.this.f8564ac.CQU.Qhi(1000L);
                    }
                    qhi.dismiss();
                    ac.this.f8564ac.MQ.set(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.InterfaceC0133Qhi
                public void cJ() {
                    qhi.dismiss();
                    ac.this.bxS().hm().putBoolean("user_has_give_up_reward", true);
                    ac.this.f8564ac.MQ.set(false);
                    ac.this.f8564ac.CQU.Tgh(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    if (z10) {
                        if (com.bytedance.sdk.openadsdk.core.model.bxS.ac(ac.this.f8564ac.cJ)) {
                            if (ac.this.f8564ac.CQU.tP()) {
                                ac.this.f8564ac.CQU.cJ(5);
                                return;
                            } else {
                                ac.this.f8564ac.lG.ROR();
                                return;
                            }
                        }
                        ac.this.f8564ac.aP.Tgh();
                        if (ac.this.f8564ac.CQU.tP()) {
                            ac.this.f8564ac.CQU.cJ(4);
                        }
                        ac.this.CQU();
                    }
                }
            }).show();
            return true;
        }
        return false;
    }
}

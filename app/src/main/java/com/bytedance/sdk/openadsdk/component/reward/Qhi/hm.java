package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.fl;
import com.bytedance.sdk.openadsdk.core.cJ.Qhi;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.Gm;
import com.bytedance.sdk.openadsdk.core.model.MQ;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullReportManager.java */
/* loaded from: classes.dex */
public class hm {
    private final Qhi Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.cJ.Tgh f8815ac;
    private final com.bytedance.sdk.openadsdk.core.cJ.cJ cJ;

    @DungeonFlag
    public hm(Qhi qhi) {
        int i10;
        this.Qhi = qhi;
        this.f8815ac = Qhi(qhi, qhi.cJ);
        Activity activity = qhi.FQ;
        tP tPVar = qhi.cJ;
        String str = qhi.f8798fl;
        if (qhi.CJ) {
            i10 = 7;
        } else {
            i10 = 5;
        }
        this.cJ = new com.bytedance.sdk.openadsdk.core.cJ.cJ(activity, tPVar, str, i10) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hm.1
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ, com.bytedance.sdk.openadsdk.core.cJ.ac
            public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
                try {
                    hm.this.Qhi(view, f10, f11, f12, f13, sparseArray, this.NFd, this.Eh, this.aP);
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFReportManager", "onClickReport error :" + e10.getMessage());
                }
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(hm.this.Qhi.cJ, 9);
                hm.this.Qhi.bxS.lG();
            }
        };
    }

    private boolean Sf() {
        tP tPVar = this.Qhi.cJ;
        if (tPVar == null || tPVar.yN() != 1) {
            return false;
        }
        return true;
    }

    private JSONObject hm() {
        try {
            long hpZ = this.Qhi.bxS.hpZ();
            int HzH = this.Qhi.bxS.HzH();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", hpZ);
                jSONObject.put("percent", HzH);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public com.bytedance.sdk.openadsdk.core.cJ.cJ CJ() {
        return this.cJ;
    }

    public void ROR() {
        JSONObject jSONObject = new JSONObject();
        Qhi(jSONObject);
        Qhi qhi = this.Qhi;
        com.bytedance.sdk.openadsdk.cJ.ac.fl(qhi.cJ, qhi.f8798fl, jSONObject);
    }

    public void Tgh() {
        JSONObject jSONObject = new JSONObject();
        if (bxS.Gm(this.Qhi.cJ)) {
            this.Qhi.CQU.Qhi(jSONObject);
        }
        int i10 = 1;
        try {
            if (this.Qhi.WAv.get()) {
                if (!this.Qhi.lG.ac()) {
                    if (this.Qhi.Jma.CJ()) {
                        i10 = 3;
                    } else if (this.Qhi.lG.CJ()) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                }
                jSONObject.put("endcard_content", i10);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        Qhi qhi = this.Qhi;
        com.bytedance.sdk.openadsdk.cJ.ac.cJ(qhi.cJ, qhi.f8798fl, "click_close", jSONObject);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public com.bytedance.sdk.openadsdk.core.cJ.Tgh ac() {
        this.f8815ac.Qhi(this.Qhi.FQ.findViewById(16908290));
        this.f8815ac.cJ(this.Qhi.yN.findViewById(520093713));
        if (this.Qhi.Dww.ac() != null) {
            this.f8815ac.Qhi(this.Qhi.Dww.ac());
        }
        this.Qhi.CQU.Qhi(this.f8815ac);
        this.f8815ac.Qhi(new Qhi.InterfaceC0120Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hm.3
            @Override // com.bytedance.sdk.openadsdk.core.cJ.Qhi.InterfaceC0120Qhi
            public long getVideoProgress() {
                return hm.this.Qhi.bxS.ROR();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.Tgh tgh = this.Qhi.es;
        com.bytedance.sdk.openadsdk.core.cJ.Tgh tgh2 = this.f8815ac;
        tgh.Qhi(tgh2, tgh2, this.cJ);
        this.Qhi.f8802zn.Qhi(this.f8815ac);
        return this.f8815ac;
    }

    @DungeonFlag
    public void cJ() {
        boolean z10;
        com.bytedance.sdk.openadsdk.activity.ROR ror;
        com.bytedance.sdk.openadsdk.component.reward.view.ac acVar;
        if (this.Qhi.ABk.get()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.Qhi.cJ.Qhi() || (acVar = this.Qhi.pM) == null) {
                z10 = false;
            } else {
                jSONObject.put("dynamic_show_type", acVar.hm());
                this.Qhi.pM.Qhi(jSONObject);
                z10 = true;
            }
            tP tPVar = this.Qhi.cJ;
            Qhi(jSONObject);
            View findViewById = this.Qhi.FQ.findViewById(16908290);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(InMobiNetworkValues.WIDTH, findViewById.getWidth());
                jSONObject2.put(InMobiNetworkValues.HEIGHT, findViewById.getHeight());
                jSONObject2.put("alpha", findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            jSONObject.put("root_view", jSONObject2.toString());
            if (this.Qhi.ABk.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, this.Qhi.f8798fl, jSONObject);
                this.Qhi.PAe.Tgh();
                Tgh.Qhi qhi = new Tgh.Qhi(z10 ? this.Qhi.pM.hm() : -1);
                Qhi qhi2 = this.Qhi;
                if (qhi2.VnT && (ror = qhi2.Ura) != null) {
                    qhi.cJ = ror.f8522hm;
                }
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(qhi2.FQ.findViewById(16908290), tPVar, qhi);
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", e10);
        }
    }

    public com.bytedance.sdk.openadsdk.core.cJ.Tgh fl() {
        return this.f8815ac;
    }

    @DungeonFlag
    public void Qhi() {
        com.bytedance.sdk.openadsdk.activity.ROR ror;
        if (this.Qhi.ABk.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        tP tPVar = this.Qhi.cJ;
        Qhi(jSONObject);
        if (this.Qhi.ABk.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, this.Qhi.f8798fl, jSONObject);
            this.Qhi.PAe.Tgh();
            Tgh.Qhi qhi = new Tgh.Qhi(-1);
            Qhi qhi2 = this.Qhi;
            if (qhi2.VnT && (ror = qhi2.Ura) != null) {
                qhi.cJ = ror.f8522hm;
            }
            com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(qhi2.FQ.findViewById(16908290), tPVar, qhi);
        }
    }

    public void ac(boolean z10) {
        Qhi qhi = this.Qhi;
        if (qhi != null && z10 && qhi.cJ.qb() && !this.Qhi.cJ.ZRq()) {
            this.Qhi.cJ.ROR(true);
            Qhi qhi2 = this.Qhi;
            tP tPVar = qhi2.cJ;
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, qhi2.f8798fl, tPVar.up());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.activity.ROR ror;
        tP tPVar = this.Qhi.cJ;
        if ((tPVar instanceof MQ) && ((MQ) tPVar).vk()) {
            try {
                jSONObject.put("choose_one_ad_real_show", true);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFReportManager", "reportShow json error", e10);
            }
        }
        Qhi qhi = this.Qhi;
        if (!qhi.VnT || (ror = qhi.Ura) == null) {
            return;
        }
        try {
            jSONObject.put("ad_show_order", ror.f8522hm + 1);
        } catch (JSONException unused) {
        }
    }

    @DungeonFlag
    public void Qhi(final Map<String, Object> map) {
        if (this.Qhi.ABk.get()) {
            return;
        }
        this.Qhi.ABk.set(true);
        final View findViewById = this.Qhi.FQ.findViewById(16908290);
        if (findViewById == null) {
            findViewById = this.Qhi.FQ.getWindow().getDecorView();
        }
        findViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hm.2
            @Override // java.lang.Runnable
            public void run() {
                int i10;
                Map map2;
                JSONObject jSONObject;
                boolean z10 = false;
                if (!hm.this.Qhi.iMK.compareAndSet(false, true)) {
                    return;
                }
                tP tPVar = hm.this.Qhi.cJ;
                JSONObject jSONObject2 = null;
                try {
                    if (map != null) {
                        jSONObject = new JSONObject(map);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    jSONObject2 = jSONObject;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(InMobiNetworkValues.WIDTH, findViewById.getWidth());
                    jSONObject3.put(InMobiNetworkValues.HEIGHT, findViewById.getHeight());
                    jSONObject3.put("alpha", findViewById.getAlpha());
                    jSONObject2.put("root_view", jSONObject3.toString());
                    hm.this.Qhi(jSONObject2);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFReportManager", "run: ", th2);
                }
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, hm.this.Qhi.f8798fl, jSONObject2);
                hm.this.Qhi.PAe.Tgh();
                if (hm.this.Qhi.pM != null && (map2 = map) != null && map2.containsKey("dynamic_show_type")) {
                    z10 = true;
                }
                if (z10) {
                    i10 = hm.this.Qhi.pM.hm();
                } else {
                    i10 = -1;
                }
                Tgh.Qhi qhi = new Tgh.Qhi(i10);
                if (hm.this.Qhi.VnT && hm.this.Qhi.Ura != null) {
                    qhi.cJ = hm.this.Qhi.Ura.f8522hm;
                }
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(hm.this.Qhi.FQ.findViewById(16908290), tPVar, qhi);
            }
        });
    }

    @DungeonFlag
    public void cJ(boolean z10) {
        Qhi qhi = this.Qhi;
        if (qhi == null) {
            return;
        }
        if (!z10 && qhi.ABk.get() && this.Qhi.HLI > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.Qhi.HLI);
            Qhi qhi2 = this.Qhi;
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(valueOf, qhi2.cJ, qhi2.f8798fl, qhi2.bxS.Qhi());
            this.Qhi.HLI = 0L;
        } else {
            this.Qhi.HLI = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(this.Qhi.cJ, z10 ? 4 : 8);
    }

    public void Qhi(boolean z10) {
        tP tPVar = this.Qhi.cJ;
        if (tPVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.Gm.Qhi.fl fl2 = com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi(z10 ? 7 : 8).ac(String.valueOf(tPVar.Hy())).fl(this.Qhi.cJ.jWV());
        fl2.cJ(this.Qhi.lG.qMt()).Tgh(this.Qhi.lG.EBS());
        fl2.ROR(this.Qhi.cJ.EGK()).CJ(this.Qhi.cJ.HLI());
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi().cJ(fl2);
    }

    private void cJ(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, int i10, int i11, int i12) {
        if (!Sf() || this.Qhi.cJ == null || view == null) {
            return;
        }
        int id2 = view.getId();
        if (id2 == com.bytedance.sdk.openadsdk.utils.iMK.f9379fl || id2 == com.bytedance.sdk.openadsdk.utils.iMK.CJ || id2 == com.bytedance.sdk.openadsdk.utils.iMK.f9377ac || id2 == com.bytedance.sdk.openadsdk.utils.iMK.cJ || id2 == com.bytedance.sdk.openadsdk.utils.iMK.f9385zc || id2 == com.bytedance.sdk.openadsdk.utils.iMK.mZ || id2 == com.bytedance.sdk.openadsdk.utils.iMK.HzH || id2 == 520093705 || id2 == com.bytedance.sdk.openadsdk.utils.iMK.Gm || id2 == 520093707 || id2 == com.bytedance.sdk.openadsdk.utils.iMK.ROR) {
            int ROR = zn.ROR(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            com.bytedance.sdk.openadsdk.core.model.Gm Qhi = new Gm.Qhi().Tgh(f10).fl(f11).CJ(f12).ac(f13).cJ(System.currentTimeMillis()).Qhi(0L).cJ(zn.Qhi(this.Qhi.es.Gm())).Qhi(zn.Qhi((View) null)).ac(zn.ac(this.Qhi.es.Gm())).CJ(zn.ac((View) null)).CJ(i11).fl(i12).Tgh(i10).Qhi(sparseArray).cJ(com.bytedance.sdk.openadsdk.core.hm.cJ().Qhi() ? 1 : 2).ac(ROR).Qhi(zn.fl(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).cJ(zn.Tgh(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).Qhi();
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(this.Qhi.bxS.ROR()));
            Qhi qhi = this.Qhi;
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi("click_other", qhi.cJ, Qhi, qhi.f8798fl, true, (Map<String, Object>) hashMap, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DungeonFlag
    public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, int i10, int i11, int i12) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.iMK.f9379fl) {
            Qhi("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.iMK.CJ && view.getId() != com.bytedance.sdk.openadsdk.utils.iMK.ROR) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.iMK.f9377ac) {
                Qhi("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.iMK.cJ) {
                Qhi("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.iMK.f9385zc && view.getId() != com.bytedance.sdk.openadsdk.utils.iMK.mZ && view.getId() != com.bytedance.sdk.openadsdk.utils.iMK.HzH) {
                if (view.getId() == 520093705) {
                    Qhi("click_start_play", hm());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.iMK.Gm) {
                    Qhi("click_video", hm());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.iMK.Sf) {
                    Qhi("fallback_endcard_click", hm());
                }
            } else {
                Qhi("click_start_play_bar", hm());
            }
        } else {
            Qhi("click_play_star_nums", (JSONObject) null);
        }
        cJ(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(String str, JSONObject jSONObject) {
        Qhi qhi = this.Qhi;
        tP tPVar = qhi.cJ;
        String str2 = qhi.f8798fl;
        if (!qhi.CJ) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.cJ.Tgh Qhi(final Qhi qhi, final tP tPVar) {
        return new com.bytedance.sdk.openadsdk.core.cJ.Tgh(qhi.FQ, tPVar, qhi.f8798fl, qhi.CJ ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hm.4
            @Override // com.bytedance.sdk.openadsdk.core.cJ.Tgh
            public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, int i10, int i11, int i12, boolean z10) {
                if (tPVar.IC() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        Qhi((String) tag);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("duration", Long.valueOf(qhi.bxS.ROR()));
                if (qhi.WAv.get()) {
                    hashMap.put("click_scence", 2);
                } else if (bxS.Gm(tPVar)) {
                    hashMap.put("click_scence", 3);
                } else {
                    hashMap.put("click_scence", 1);
                }
                Qhi(hashMap);
                qhi.PAe.c_();
                if (view.getId() == com.bytedance.sdk.openadsdk.utils.iMK.Ewb && bxS.Gm(tPVar)) {
                    JSONObject jSONObject = new JSONObject();
                    if (tPVar.FQ() != null) {
                        try {
                            jSONObject.put("playable_url", tPVar.FQ().zc());
                        } catch (JSONException e10) {
                            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFReportManager", "onRewardBarClick json error", e10);
                        }
                    }
                    com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, qhi.f8798fl, "click_playable_download_button_loading", jSONObject);
                }
                qhi.Dww.Qhi(view, f10, f11, f12, f13, sparseArray, i10, i11, i12, new fl.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hm.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.Qhi.fl.Qhi
                    public void Qhi(String str, JSONObject jSONObject2) {
                        hm.this.Qhi(str, jSONObject2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.Qhi.fl.Qhi
                    public void Qhi(View view2, float f14, float f15, float f16, float f17, SparseArray<ac.Qhi> sparseArray2, int i13, int i14, int i15) {
                        hm.this.Qhi(view2, f14, f15, f16, f17, sparseArray2, i13, i14, i15);
                    }
                });
                com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh.Qhi(tPVar, 9);
                qhi.bxS.lG();
            }
        };
    }
}

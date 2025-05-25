package com.bytedance.sdk.openadsdk.activity;

import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.ABk;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public boolean Qhi(long j10, boolean z10) {
        Sf sf2;
        com.bytedance.sdk.openadsdk.component.reward.view.ac acVar = this.cJ.pM;
        if (acVar != null && acVar.Qhi() != null) {
            sf2 = this.cJ.pM.Qhi().getAdShowTime();
        } else {
            sf2 = new Sf();
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        qhi.bxS.Qhi(qhi.pM.cJ(), sf2);
        HashMap hashMap = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.view.ac acVar2 = this.cJ.pM;
        if (acVar2 != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(acVar2.hm()));
            JSONObject Qhi = this.cJ.pM.Qhi((JSONObject) null);
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
        this.cJ.bxS.Qhi(new fl.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity.1
            boolean Qhi;

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi(long j11, int i10) {
                if (this.Qhi) {
                    return;
                }
                this.Qhi = true;
                TTRewardExpressVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                TTRewardExpressVideoActivity.this.pA();
                TTRewardExpressVideoActivity.this.cJ.bxS.Qhi(j11, j11);
                TTRewardExpressVideoActivity.this.cJ.pM.cJ(true);
                if (TTRewardExpressVideoActivity.this.cJ.cJ.hpZ() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = TTRewardExpressVideoActivity.this.cJ;
                    if (qhi2.f8797ac) {
                        qhi2.Dww.ac().CJ();
                        ABk.cJ();
                    }
                }
                if (TTRewardExpressVideoActivity.this.cJ.cJ.hpZ() == 21 && !TTRewardExpressVideoActivity.this.cJ.cJ.CJ()) {
                    TTRewardExpressVideoActivity.this.cJ.cJ.cJ(true);
                    TTRewardExpressVideoActivity.this.cJ.es.HzH();
                }
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = TTRewardExpressVideoActivity.this.cJ;
                if (qhi3.f8797ac) {
                    if (qhi3.cJ.TGC()) {
                        if (TTRewardExpressVideoActivity.this.cJ.pM.hm() == 1) {
                            TTRewardExpressVideoActivity.this.cJ.js.ac();
                        }
                    } else {
                        TTRewardExpressVideoActivity.this.Qhi(false, 5);
                        if (!tP.fl(TTRewardExpressVideoActivity.this.cJ.cJ)) {
                            TTRewardExpressVideoActivity.this.cJ.bxS.Qhi("skip", true);
                        }
                    }
                } else if (qhi3.cJ.TGC()) {
                    if (TTRewardExpressVideoActivity.this.cJ.pM.hm() == 1) {
                        TTRewardExpressVideoActivity.this.cJ.js.ac();
                    }
                } else {
                    if (!tP.fl(TTRewardExpressVideoActivity.this.cJ.cJ)) {
                        TTRewardExpressVideoActivity.this.cJ.bxS.Qhi("skip", true);
                    }
                    TTRewardExpressVideoActivity.this.finish();
                }
                ((TTRewardVideoActivity) TTRewardExpressVideoActivity.this).f8547zc = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.tP();
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void cJ(long j11, int i10) {
                TTRewardExpressVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                if (TTRewardExpressVideoActivity.this.cJ.bxS.cJ()) {
                    TTRewardExpressVideoActivity.this.ABk();
                    return;
                }
                TTRewardExpressVideoActivity.this.tP();
                TTRewardExpressVideoActivity.this.cJ.bxS.ABk();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.cJ.f8797ac) {
                    tTRewardExpressVideoActivity.Qhi(false, 3);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                TTRewardExpressVideoActivity.this.cJ.pM.Qhi(true);
                pA pAVar = TTRewardExpressVideoActivity.this.cJ.bxS;
                pAVar.Qhi(1 ^ pAVar.Eh(), 2);
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi() {
                TTRewardExpressVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                TTRewardExpressVideoActivity.this.pA();
                TTRewardExpressVideoActivity.this.tP();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                if (tTRewardExpressVideoActivity.cJ.f8797ac) {
                    tTRewardExpressVideoActivity.Qhi(false, 6);
                } else {
                    tTRewardExpressVideoActivity.finish();
                }
                pA pAVar = TTRewardExpressVideoActivity.this.cJ.bxS;
                pAVar.Qhi(!pAVar.Eh(), !TTRewardExpressVideoActivity.this.cJ.bxS.Eh());
                TTRewardExpressVideoActivity.this.cJ.bxS.ABk();
            }

            @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
            public void Qhi(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = TTRewardExpressVideoActivity.this.cJ;
                if (!qhi2.Qe && qhi2.bxS.cJ()) {
                    TTRewardExpressVideoActivity.this.cJ.bxS.pA();
                }
                if (TTRewardExpressVideoActivity.this.cJ.WAv.get()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.CJ.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
                if (j11 != TTRewardExpressVideoActivity.this.cJ.bxS.Sf()) {
                    TTRewardExpressVideoActivity.this.pA();
                }
                if (TTRewardExpressVideoActivity.this.cJ.bxS.cJ()) {
                    TTRewardExpressVideoActivity.this.cJ.bxS.Qhi(j11, j12);
                    int WAv = HzH.CJ().WAv(String.valueOf(TTRewardExpressVideoActivity.this.cJ.Tgh));
                    boolean z11 = TTRewardExpressVideoActivity.this.cJ.pM.Sf() && WAv >= 0;
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                    long j13 = j11 / 1000;
                    tTRewardExpressVideoActivity.Tgh = (int) (tTRewardExpressVideoActivity.cJ.bxS.aP() - j13);
                    int i10 = (int) j13;
                    if ((TTRewardExpressVideoActivity.this.cJ.MQ.get() || TTRewardExpressVideoActivity.this.cJ.Gm.get()) && TTRewardExpressVideoActivity.this.cJ.bxS.cJ()) {
                        TTRewardExpressVideoActivity.this.cJ.bxS.pA();
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity2 = TTRewardExpressVideoActivity.this;
                    int i11 = tTRewardExpressVideoActivity2.Tgh;
                    if (i11 >= 0) {
                        tTRewardExpressVideoActivity2.cJ.js.Qhi(String.valueOf(i11), null);
                    }
                    TTRewardExpressVideoActivity.this.cJ.es.CJ(i10);
                    TTRewardExpressVideoActivity.this.Qhi(j11, j12);
                    com.bytedance.sdk.openadsdk.component.reward.view.ac acVar3 = TTRewardExpressVideoActivity.this.cJ.pM;
                    if (acVar3 != null && acVar3.Qhi() != null) {
                        TTRewardExpressVideoActivity.this.cJ.pM.Qhi().Qhi(String.valueOf(TTRewardExpressVideoActivity.this.Tgh), i10, 0, false);
                    }
                    TTRewardExpressVideoActivity tTRewardExpressVideoActivity3 = TTRewardExpressVideoActivity.this;
                    if (tTRewardExpressVideoActivity3.Tgh > 0) {
                        if (z11 && i10 >= WAv && tTRewardExpressVideoActivity3.cJ.cJ.hpZ() != 5 && TTRewardExpressVideoActivity.this.cJ.cJ.hpZ() != 33) {
                            TTRewardExpressVideoActivity.this.cJ.Qhi(true);
                            TTRewardExpressVideoActivity tTRewardExpressVideoActivity4 = TTRewardExpressVideoActivity.this;
                            tTRewardExpressVideoActivity4.cJ.js.Qhi(String.valueOf(tTRewardExpressVideoActivity4.Tgh), TTAdDislikeToast.getSkipText());
                            TTRewardExpressVideoActivity.this.cJ.js.fl(true);
                            return;
                        }
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity5 = TTRewardExpressVideoActivity.this;
                        tTRewardExpressVideoActivity5.cJ.js.Qhi(String.valueOf(tTRewardExpressVideoActivity5.Tgh), null);
                    }
                }
            }
        });
        boolean Qhi2 = this.cJ.bxS.Qhi(j10, z10, hashMap, this.f8530ac);
        if (Qhi2 && !z10) {
            ((TTRewardVideoActivity) this).Gm = (int) (System.currentTimeMillis() / 1000);
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean kYc() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ac() {
    }
}

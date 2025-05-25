package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import org.json.JSONObject;

/* compiled from: RewardFullEndCardManager.java */
/* loaded from: classes.dex */
public class Tgh {
    private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private Qhi f8809ac;
    private final com.bytedance.sdk.openadsdk.component.reward.view.cJ cJ;

    /* compiled from: RewardFullEndCardManager.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar, int i10);

        void hpZ();
    }

    public Tgh(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.Qhi = qhi;
        this.cJ = new com.bytedance.sdk.openadsdk.component.reward.view.cJ(qhi);
    }

    private int ROR() {
        int vml = this.Qhi.cJ.vml();
        if (vml <= 5000 && vml >= 0) {
            if (vml < 1000) {
                vml += 1000;
            }
            int Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.CJ().Qhi(this.Qhi.cJ.Hy());
            if (Qhi2 <= 5000 && Qhi2 >= 0) {
                if (Qhi2 < 1000) {
                    Qhi2 += 1000;
                }
                return Math.min(vml, Qhi2);
            }
        }
        return -1;
    }

    private void Sf() {
        if (bxS.zc(this.Qhi.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            if (qhi.dIT) {
                qhi.js.cJ(true);
                this.Qhi.lB.Qhi(true);
            }
        }
    }

    public void CJ() {
        Qhi(true);
    }

    public void Qhi() {
        this.cJ.Qhi();
    }

    public Qhi Tgh() {
        return this.f8809ac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (com.bytedance.sdk.openadsdk.core.model.bxS.ac(r5.Qhi.cJ) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ac(com.bytedance.sdk.openadsdk.component.reward.cJ.cJ r6) {
        /*
            r5 = this;
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r5.Qhi
            int r1 = r5.ROR()
            r0.Sf = r1
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r5.Qhi
            int r1 = r0.Sf
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r0.cJ
            boolean r0 = r0.fl()
            r1 = 0
            if (r0 != 0) goto L79
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r5.Qhi
            int r2 = r0.Sf
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L38
            com.bytedance.sdk.openadsdk.core.model.tP r0 = r0.cJ
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.bxS.ac(r0)
            if (r0 == 0) goto L33
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r5.Qhi
            com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ r0 = r0.lG
            boolean r0 = r0.hpZ()
            if (r0 == 0) goto L33
            r6.Dww()
            goto L5d
        L33:
            r6.pA()
        L36:
            r6 = r4
            goto L5e
        L38:
            if (r2 < 0) goto L5d
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.qMt
            r6.set(r1)
            android.os.Message r6 = android.os.Message.obtain()
            r0 = 700(0x2bc, float:9.81E-43)
            r6.what = r0
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r5.Qhi
            int r2 = r0.Sf
            r6.arg1 = r2
            com.bytedance.sdk.component.utils.CQU r0 = r0.xyz
            r0.sendMessage(r6)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r6 = r5.Qhi
            com.bytedance.sdk.openadsdk.core.model.tP r6 = r6.cJ
            boolean r6 = com.bytedance.sdk.openadsdk.core.model.bxS.ac(r6)
            if (r6 != 0) goto L5d
            goto L36
        L5d:
            r6 = r1
        L5e:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r5.Qhi
            com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ r0 = r0.lG
            boolean r0 = r0.Dww()
            if (r0 == 0) goto L69
            goto L6a
        L69:
            r1 = r6
        L6a:
            if (r1 == 0) goto L78
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r6 = r5.Qhi
            com.bytedance.sdk.openadsdk.utils.zc r0 = r6.gga
            if (r0 == 0) goto L78
            int r6 = r6.Sf
            long r1 = (long) r6
            r0.Qhi(r1)
        L78:
            return r4
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Qhi.Tgh.ac(com.bytedance.sdk.openadsdk.component.reward.cJ.cJ):boolean");
    }

    public void cJ() {
        this.cJ.ac();
    }

    public boolean fl() {
        com.bytedance.sdk.openadsdk.component.reward.view.cJ cJVar = this.cJ;
        if (cJVar != null) {
            return cJVar.fl();
        }
        return false;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.cJ.Tgh tgh) {
        this.cJ.Qhi(tgh);
    }

    public void cJ(com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar) {
        com.bytedance.sdk.openadsdk.utils.zc zcVar;
        int Wrw = this.Qhi.cJ.Wrw();
        boolean z10 = true;
        if (bxS.Gm(this.Qhi.cJ)) {
            Wrw = (this.Qhi.cJ.TKG() + 1) * 1000;
        }
        if (Wrw != -1) {
            if (Wrw >= 0) {
                this.Qhi.js.CJ(false);
                if (bxS.ac(this.Qhi.cJ)) {
                    if (bxS.hpZ(this.Qhi.cJ) && this.Qhi.CQU.HzH()) {
                        this.Qhi.xyz.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, Wrw);
                    } else {
                        this.Qhi.xyz.sendEmptyMessageDelayed(1, Wrw);
                    }
                } else {
                    this.Qhi.xyz.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, Wrw);
                }
            }
            z10 = false;
        } else if (bxS.ac(this.Qhi.cJ)) {
            if (bxS.hpZ(this.Qhi.cJ) && this.Qhi.CQU.HzH()) {
                cJVar.pA();
            } else {
                cJVar.Dww();
            }
            z10 = false;
        } else {
            cJVar.pA();
        }
        if (!z10 || (zcVar = this.Qhi.gga) == null) {
            return;
        }
        zcVar.Qhi(Wrw);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0377 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(boolean r17, boolean r18, boolean r19, com.bytedance.sdk.openadsdk.component.reward.cJ.cJ r20, int r21) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Qhi.Tgh.Qhi(boolean, boolean, boolean, com.bytedance.sdk.openadsdk.component.reward.cJ.cJ, int):void");
    }

    public void ac() {
        this.cJ.CJ();
    }

    public void Qhi(com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar) {
        this.Qhi.lG.Qhi(0.0f);
        this.Qhi.es.Qhi(0.0f);
        if (!tP.ac(this.Qhi.cJ)) {
            this.Qhi.Jma.Qhi(8);
            this.Qhi.lG.cJ(0);
            this.Qhi.lG.yN();
        } else {
            this.Qhi.lG.cJ(8);
            this.Qhi.Jma.Qhi(0);
            this.Qhi.Jma.ROR();
        }
        if (this.Qhi.ROR) {
            zn.Qhi((View) cJVar.iMK, 0);
            this.Qhi.es.fl(8);
        }
        this.Qhi.es.ac(8);
        this.Qhi.es.ROR();
        if (tP.ac(this.Qhi.cJ)) {
            this.Qhi.xyz.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD, 100L);
            return;
        }
        this.Qhi.xyz.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM, 100L);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        qhi.lG.Qhi(qhi.dIT, true);
        this.Qhi.lG.ac(true);
        this.Qhi.lG.cJ(true);
        NFd WAv = this.Qhi.lG.WAv();
        if (WAv != null) {
            WAv.Qhi("prerender_page_show", (JSONObject) null);
        }
    }

    public void Qhi(boolean z10) {
        if (!tP.CJ(this.Qhi.cJ)) {
            this.Qhi.lG.Qhi(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
        }
        this.Qhi.lG.NFd();
        this.Qhi.lG.cJ(8);
        this.Qhi.Jma.Qhi(8);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        if (qhi.ROR) {
            zn.Qhi((View) qhi.ReL.iMK, 8);
            this.Qhi.es.fl(0);
        }
        this.Qhi.es.ac(8);
        if (this.Qhi.cJ.IC()) {
            if (!this.cJ.Qhi(this.Qhi.bxS)) {
                this.Qhi.FQ.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.ROR ror = this.Qhi.Ura;
            if (ror != null) {
                this.cJ.Qhi(ror.bxS().Tgh());
            }
            this.cJ.cJ();
        }
        this.Qhi.es.ROR();
        if (z10) {
            ac(this.Qhi.ReL);
        }
        this.Qhi.js.ac(false);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
        qhi2.aP.Qhi(qhi2.cJ.LpL());
    }

    public void Qhi(Qhi qhi) {
        this.f8809ac = qhi;
    }
}

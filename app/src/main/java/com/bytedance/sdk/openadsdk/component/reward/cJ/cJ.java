package com.bytedance.sdk.openadsdk.component.reward.cJ;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.activity.cJ;
import com.bytedance.sdk.openadsdk.cJ.cJ;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.component.reward.view.RFDownloadBarLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.HzH;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zc;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.List;
import java.util.Objects;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: RewardFullAdType.java */
/* loaded from: classes.dex */
public abstract class cJ extends com.bytedance.sdk.openadsdk.component.reward.cJ.Qhi {
    public com.bytedance.sdk.openadsdk.core.widget.Qhi ABk;
    protected String Gm;
    public LinearLayout iMK;
    private com.bytedance.sdk.openadsdk.WAv.Tgh pA;

    /* renamed from: zc  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.cJ.Tgh f8858zc;

    /* compiled from: RewardFullAdType.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(boolean z10);
    }

    public cJ(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        super(qhi);
    }

    public Qhi CJ() {
        return null;
    }

    public void CQU() {
        this.f8858zc = this.Qhi.aP.ac();
    }

    public void Dww() {
        this.Qhi.js.ac();
        this.Qhi.js.fl(true);
    }

    public void EBS() {
        com.bytedance.sdk.openadsdk.component.reward.view.ac acVar = this.Qhi.pM;
        if (acVar != null) {
            acVar.Tgh();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.Tgh tgh = this.Qhi.es;
        if (tgh != null) {
            tgh.iMK();
        }
        this.Qhi.bxS.CQU();
        if (!fl()) {
            this.Qhi.WAv.get();
        }
        this.Qhi.lG.iMK();
        this.Qhi.CQU.fl();
        this.Qhi.es.zc();
        this.Qhi.f8802zn.ac();
        this.Qhi.Eh.cJ();
        zc zcVar = this.Qhi.gga;
        if (zcVar != null) {
            zcVar.ac();
        }
    }

    public final void Eh() {
        String str;
        if (this.Qhi.FQ.isFinishing()) {
            return;
        }
        this.Qhi.lG.ABk();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        if (qhi.CJ) {
            str = "reward_endcard";
        } else {
            str = "fullscreen_endcard";
        }
        qhi.lG.Qhi(this.pA, str, qhi.PAe);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
        qhi2.CQU.Qhi(this.pA, qhi2.dIT);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = this.Qhi;
        qhi3.lG.Qhi(str, qhi3.PAe);
        this.Qhi.lG.fl();
    }

    public void Gm() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        qhi.Eh.Qhi(qhi.CJ);
        this.Qhi.es.cJ();
        this.Qhi.f8802zn.Qhi();
        if (!this.Qhi.cJ.IC()) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
            if (qhi2.ROR && TextUtils.isEmpty(tP.Qhi(qhi2.f8800ip, this.cJ))) {
                zc();
            }
            this.Qhi.lG.Qhi();
            this.Qhi.Jma.Qhi();
        }
        this.Qhi.CQU.Qhi();
        this.Qhi.js.Qhi();
        if (bxS.cJ(this.Qhi.cJ)) {
            SSWebView Sf = this.Qhi.lG.Sf();
            if (Sf != null) {
                Sf.setBackgroundColor(-16777216);
            }
            this.Qhi.lG.hm().setBackgroundColor(-16777216);
            this.Qhi.js.ac(true);
            if (bxS.Gm(this.Qhi.cJ)) {
                this.Qhi.es.CJ();
                zn.Qhi((View) Sf, 4);
                zn.Qhi((View) this.Qhi.lG.hm(), 0);
            }
        }
        if (!HzH.ac(this.Qhi.cJ) && !HzH.cJ(this.Qhi.cJ) && !HzH.CJ(this.Qhi.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = this.Qhi;
            com.bytedance.sdk.openadsdk.component.reward.view.Tgh tgh = qhi3.es;
            int cJ = zn.cJ(qhi3.f8800ip, qhi3.NBs);
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = this.Qhi;
            tgh.Qhi(cJ, zn.cJ(qhi4.f8800ip, qhi4.dI));
            this.Qhi.Dww.Qhi();
            if (bxS.Gm(this.Qhi.cJ)) {
                this.Qhi.lG.Qhi(true);
                this.Qhi.lG.fl();
                Qhi(false, false, false, cJ.C0110cJ.f8695ac);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi5 = this.Qhi;
            if (qhi5.pv) {
                qhi5.es.Qhi(0);
            }
        }
    }

    public void HzH() {
        kYc();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        if (qhi == null) {
            return;
        }
        zc zcVar = qhi.gga;
        if (zcVar != null) {
            zcVar.Qhi();
        }
        this.Qhi.Qhi();
    }

    public void MQ() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        if (qhi == null) {
            return;
        }
        qhi.Qe = false;
        boolean z10 = qhi.dIT;
        if (!qhi.Gm.get()) {
            this.Qhi.bxS.WAv();
        }
        hpZ();
        this.Qhi.lG.tP();
        this.Qhi.CQU.iMK();
        this.Qhi.EBS.set(true);
        if (this.Qhi.WAv.get()) {
            this.Qhi.qMt.set(true);
        }
        zc zcVar = this.Qhi.gga;
        if (zcVar != null) {
            zcVar.cJ();
        }
        this.Qhi.cJ();
    }

    public abstract void Qhi(FrameLayout frameLayout);

    @Override // com.bytedance.sdk.openadsdk.component.reward.cJ.Qhi
    public void Qhi(com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar, CQU cqu) {
        super.Qhi(cJVar, cqu);
        if (this.Qhi.cJ.Qhi()) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            if (qhi.EGK) {
                qhi.lG.Qhi(false);
            }
        }
        if (bxS.Gm(this.Qhi.cJ)) {
            this.Qhi.CQU.Tgh();
        }
    }

    public abstract void ROR();

    public RFEndCardBackUpLayout Sf() {
        return new RFEndCardBackUpLayout(this.Qhi.f8800ip);
    }

    public abstract boolean Tgh();

    public View WAv() {
        PAGRelativeLayout pAGRelativeLayout;
        if (this.cJ.NFd() != 5) {
            pAGRelativeLayout = new PAGRelativeLayout(this.Qhi.FQ);
            pAGRelativeLayout.setId(iMK.nR);
        } else {
            pAGRelativeLayout = null;
        }
        Objects.toString(pAGRelativeLayout);
        return pAGRelativeLayout;
    }

    public boolean aP() {
        return true;
    }

    public void bxS() {
        int tP;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Sf sf2;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.zc zcVar;
        if (com.bytedance.sdk.openadsdk.core.HzH.CJ().qMt(String.valueOf(this.Qhi.Tgh)) == 1) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            if (qhi.CJ) {
                if (bxS.Gm(qhi.cJ)) {
                    tP = com.bytedance.sdk.openadsdk.core.HzH.CJ().Qhi(String.valueOf(this.Qhi.Tgh), true);
                } else {
                    tP = com.bytedance.sdk.openadsdk.core.HzH.CJ().WAv(String.valueOf(this.Qhi.Tgh));
                }
            } else if (bxS.Gm(qhi.cJ)) {
                tP = com.bytedance.sdk.openadsdk.core.HzH.CJ().Qhi(String.valueOf(this.Qhi.Tgh), false);
            } else {
                tP = com.bytedance.sdk.openadsdk.core.HzH.CJ().tP(String.valueOf(this.Qhi.Tgh));
            }
            com.bytedance.sdk.openadsdk.component.reward.view.Tgh tgh = this.Qhi.es;
            if (tgh != null && tgh.hm()) {
                com.bytedance.sdk.openadsdk.component.reward.view.Tgh tgh2 = this.Qhi.es;
                if (tgh2 != null) {
                    tgh2.WAv().performClick();
                }
            } else if ((!this.Qhi.WAv.get() || bxS.Gm(this.Qhi.cJ)) && tP != -1) {
                pA pAVar = this.Qhi.bxS;
                if (((pAVar != null && pAVar.Sf() >= tP * 1000) || ((sf2 = this.Qhi.CQU) != null && sf2.Gm() - this.Qhi.CQU.zc() >= tP)) && (zcVar = this.Qhi.js) != null) {
                    zcVar.CJ();
                }
            }
        }
    }

    public abstract boolean fl();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00fb, code lost:
        if (r2.Qhi == 1) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View hm() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.cJ.cJ.hm():android.view.View");
    }

    public void hpZ() {
        this.WAv.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
    }

    public void iMK() {
        com.bytedance.sdk.openadsdk.core.widget.Qhi qhi = this.ABk;
        if (qhi != null && qhi.isShowing()) {
            this.ABk.dismiss();
        }
    }

    public void kYc() {
        int i10;
        if (this.Qhi.WAv.get()) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            if (!qhi.ROR && qhi.qMt.getAndSet(false) && ((i10 = this.Qhi.Sf) >= 0 || i10 == -1)) {
                Message obtain = Message.obtain();
                obtain.what = OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
                obtain.arg1 = qhi2.Sf;
                qhi2.xyz.sendMessage(obtain);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = this.Qhi;
        if (qhi3.f8799hm > 0 && qhi3.EBS.getAndSet(false)) {
            Message obtain2 = Message.obtain();
            obtain2.what = OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK;
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = this.Qhi;
            obtain2.arg1 = qhi4.f8799hm;
            qhi4.xyz.sendMessage(obtain2);
        }
    }

    public void pA() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        if (qhi.ROR) {
            return;
        }
        qhi.js.Tgh();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
        if (!qhi2.VnT || !(qhi2.Ura instanceof com.bytedance.sdk.openadsdk.activity.Qhi)) {
            qhi2.es.fl(0);
        }
    }

    public void pM() {
        tP tPVar;
        if (!Tgh() && ((this instanceof Sf) || (this instanceof hm))) {
            this.Qhi.aP.cJ();
            return;
        }
        if (!this.f8857hm.Qhi(this.f8856fl.hm(), false)) {
            this.WAv.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            if (qhi.VnT) {
                com.bytedance.sdk.openadsdk.activity.ROR ror = qhi.Ura;
                if (ror instanceof com.bytedance.sdk.openadsdk.activity.Qhi) {
                    ((com.bytedance.sdk.openadsdk.activity.Qhi) ror).qMt();
                }
            }
            Qhi(cJ.C0110cJ.Qhi);
            pA pAVar = this.f8856fl;
            pAVar.Qhi(!pAVar.Eh(), 4);
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
        if (qhi2 != null && (tPVar = qhi2.cJ) != null && qhi2.gga != null && tPVar.Ewb()) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = this.Qhi;
            qhi3.gga.Qhi(qhi3.bxS.MQ());
        }
    }

    public void qMt() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        if (qhi == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.Tgh tgh = qhi.es;
        if (tgh != null) {
            tgh.hpZ();
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
        boolean z10 = qhi2.dIT;
        qhi2.lB.Qhi();
        DeviceUtils.ROR();
        this.Qhi.lG.kYc();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = this.Qhi;
        if (qhi3.dIT) {
            qhi3.FQ.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.cJ.cJ.2
                @Override // java.lang.Runnable
                public void run() {
                    if (cJ.this.Qhi.lB.Qhi() > 0) {
                        cJ.this.Qhi.lB.Qhi(false);
                    }
                }
            });
        }
    }

    public void zc() {
        LinearLayout linearLayout = (LinearLayout) this.Qhi.yN.findViewById(iMK.ABk);
        this.iMK = linearLayout;
        zn.Qhi((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        qhi.oU = new com.bytedance.sdk.openadsdk.common.ROR(qhi.FQ, qhi.cJ, "landingpage_endcard");
        this.Qhi.oU.ac().setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.cJ.cJ.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                cJ.this.Qhi.es.WAv().performClick();
            }
        });
        this.iMK.addView(this.Qhi.oU.fl(), new LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
        qhi2.lG.Qhi(qhi2.oU);
    }

    public void Qhi(RewardFullBaseLayout rewardFullBaseLayout) {
        Qhi(rewardFullBaseLayout, this.Qhi);
    }

    public void Qhi(boolean z10, boolean z11, boolean z12, int i10) {
        this.Qhi.f8802zn.Qhi(z10, z11, z12, this, i10);
    }

    public void Qhi(int i10) {
        this.f8856fl.ABk();
        Qhi(false, true, false, i10);
        if (this.Qhi.CJ) {
            this.f8857hm.Qhi(Constants.CP_MAC_ROMAN);
        }
    }

    public void Qhi(com.bytedance.sdk.openadsdk.WAv.Tgh tgh) {
        this.pA = tgh;
        ac();
        if (!this.Qhi.cJ.IC() && aP()) {
            Eh();
        }
        if (aP()) {
            this.Qhi.f8802zn.cJ();
        }
        if (HzH.ac(this.Qhi.cJ) || HzH.CJ(this.Qhi.cJ)) {
            this.WAv.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM, 100L);
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
        qhi.es.Qhi(qhi.Hf == 100.0f);
        CQU();
        ROR();
    }

    public void ABk() {
    }

    public void Qhi(Message message) {
        pA pAVar;
        int i10 = message.what;
        if (i10 == 1) {
            Dww();
        } else if (i10 == 300) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.Qhi;
            if (qhi.VnT) {
                com.bytedance.sdk.openadsdk.activity.ROR ror = qhi.Ura;
                if (ror instanceof com.bytedance.sdk.openadsdk.activity.Qhi) {
                    ((com.bytedance.sdk.openadsdk.activity.Qhi) ror).qMt();
                    if (this.Qhi.cJ.cJP() != null || this.Qhi.cJ.cJP().Qhi() == null) {
                    }
                    this.Qhi.cJ.cJP().Qhi().Qhi(com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.GENERAL_LINEAR_AD_ERROR);
                    return;
                }
            }
            Qhi(cJ.C0110cJ.cJ);
            this.Qhi.bxS.Qhi(!pAVar.Eh(), 1 ^ this.Qhi.bxS.Eh());
            if (this.Qhi.cJ.cJP() != null) {
            }
        } else if (i10 == 400) {
            this.Qhi.bxS.ABk();
            Qhi(false, true, false, 3);
        } else if (i10 == 500) {
            if (!bxS.cJ(this.Qhi.cJ)) {
                this.Qhi.js.ac(false);
            }
            SSWebView Sf = this.Qhi.lG.Sf();
            if (Sf != null && Sf.getWebView() != null) {
                Sf.hm();
                Sf.getWebView().resumeTimers();
            }
            if (this.Qhi.lG.Sf() != null) {
                this.Qhi.lG.Qhi(1.0f);
                this.Qhi.es.Qhi(1.0f);
            }
            if (!this.Qhi.cJ.LpL() && this.Qhi.bxS.cJ() && this.Qhi.kYc.get()) {
                this.Qhi.bxS.ABk();
            }
        } else if (i10 == 600) {
            pA();
        } else if (i10 == 700) {
            int i11 = message.arg1;
            if (this.Qhi.qMt.get()) {
                return;
            }
            if (i11 > 0) {
                this.Qhi.js.cJ();
                this.Qhi.js.Qhi((i11 / 1000) + "s");
                this.Qhi.js.fl(false);
                Message obtain = Message.obtain();
                obtain.what = OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD;
                obtain.arg1 = i11 - 1000;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.Qhi;
                qhi2.Sf -= 1000;
                this.WAv.sendMessageDelayed(obtain, 1000L);
                return;
            }
            this.WAv.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD);
            if (bxS.ac(this.cJ)) {
                if (!this.Qhi.CQU.HzH() && this.Qhi.lG.hpZ()) {
                    Dww();
                    return;
                } else {
                    pA();
                    return;
                }
            }
            pA();
        } else if (i10 != 800) {
            if (i10 == 900 && !this.Qhi.EBS.get()) {
                int i12 = message.arg1;
                double aP = this.Qhi.bxS.aP();
                Qhi(i12, (long) (1000.0d * aP));
                if (i12 > 0) {
                    this.Qhi.js.cJ();
                    this.Qhi.js.Qhi((i12 / 1000) + "s");
                    this.Qhi.js.fl(false);
                    Message obtain2 = Message.obtain();
                    obtain2.what = OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK;
                    int i13 = i12 - 1000;
                    obtain2.arg1 = i13;
                    this.Qhi.f8799hm = i13;
                    this.WAv.sendMessageDelayed(obtain2, 1000L);
                    com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = this.Qhi;
                    if (qhi3.VnT) {
                        com.bytedance.sdk.openadsdk.activity.ROR ror2 = qhi3.Ura;
                        if (!(ror2 instanceof com.bytedance.sdk.openadsdk.activity.Qhi) || aP <= 0.0d) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.activity.Qhi) ror2).Qhi((float) (1.0d - ((i12 / 1000.0f) / aP)));
                        return;
                    }
                    return;
                }
                this.WAv.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
                pA();
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = this.Qhi;
                com.bytedance.sdk.openadsdk.activity.ROR ror3 = qhi4.Ura;
                if (qhi4.VnT && (ror3 instanceof com.bytedance.sdk.openadsdk.activity.Qhi)) {
                    ror3.bxS().Qhi(ror3, new cJ.fl(5));
                }
            }
        } else {
            if (!bxS.cJ(this.Qhi.cJ)) {
                this.Qhi.js.ac(false);
            }
            this.Qhi.es.Qhi(1.0f);
            if (!this.Qhi.cJ.LpL() && this.Qhi.bxS.cJ() && this.Qhi.kYc.get()) {
                this.Qhi.bxS.ABk();
            }
        }
    }

    public void tP() {
    }

    private void Qhi(long j10, long j11) {
        Activity activity = this.Qhi.FQ;
        if (activity instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) activity).Qhi(j11 - j10, j11);
        }
    }

    public static void Qhi(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        String Qhi2;
        final PAGImageView pAGImageView;
        Context context = frameLayout.getContext();
        if (qhi.EGK) {
            PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
            pAGFrameLayout.setId(iMK.WAv);
            frameLayout.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout Qhi3 = Qhi(context);
            com.bykv.vk.openvk.component.video.api.ac.cJ FQ = qhi.cJ.FQ();
            if (FQ != null) {
                Qhi2 = FQ.WAv();
            } else {
                List<hpZ> cjC = qhi.cJ.cjC();
                Qhi2 = (cjC == null || cjC.isEmpty()) ? "" : cjC.get(0).Qhi();
            }
            if (TextUtils.isEmpty(Qhi2)) {
                pAGImageView = null;
            } else {
                pAGImageView = new PAGImageView(context);
                pAGImageView.setId(iMK.gt);
                pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Qhi3.addView(pAGImageView);
            }
            pAGFrameLayout.addView(Qhi3);
            View rFDownloadBarLayout = new RFDownloadBarLayout(context);
            rFDownloadBarLayout.setId(iMK.f9385zc);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(rFDownloadBarLayout, layoutParams);
            rFDownloadBarLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.cJ.cJ.3
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View findViewById = com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi.this.yN.findViewById(520093757);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View findViewById2 = com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi.this.yN.findViewById(iMK.smJ);
                    if (findViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View findViewById3 = com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi.this.yN.findViewById(iMK.jN);
                    if (findViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = findViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    PAGImageView pAGImageView2 = pAGImageView;
                    if (pAGImageView2 != null) {
                        ViewGroup.LayoutParams layoutParams5 = pAGImageView2.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            pAGImageView.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
            pAGLinearLayout.setId(iMK.ABk);
            pAGLinearLayout.setOrientation(1);
            pAGLinearLayout.setVisibility(8);
            frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        if (qhi.jPH) {
            View sSWebView = new SSWebView(context, true);
            sSWebView.setId(iMK.iMK);
            sSWebView.setLayerType(2, null);
            sSWebView.setVisibility(4);
            frameLayout.addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
            View frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(iMK.pA);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        }
        View sSWebView2 = new SSWebView(context, true);
        sSWebView2.setId(iMK.hpZ);
        sSWebView2.setVisibility(8);
        frameLayout.addView(sSWebView2, new FrameLayout.LayoutParams(-1, -1));
    }

    public static FrameLayout Qhi(Context context) {
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(iMK.Gm);
        pAGFrameLayout.setBackgroundColor(-16777216);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGFrameLayout.setLayoutParams(layoutParams);
        return pAGFrameLayout;
    }
}

package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.cJ;
import com.bytedance.sdk.openadsdk.cJ.cJ;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.component.reward.Qhi.pA;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.ac.Qhi;
import com.bytedance.sdk.openadsdk.utils.qMt;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: AdScene.java */
/* loaded from: classes.dex */
public abstract class Qhi extends ROR implements CQU.Qhi, Tgh.Qhi, com.bytedance.sdk.openadsdk.core.video.ac.cJ {
    private int ABk;
    protected int CJ;
    protected final CQU Qhi;
    private Bundle ROR;
    private int Tgh;

    /* renamed from: ac  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi f8520ac;
    protected com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final AtomicBoolean f8521fl;
    private boolean iMK;
    private boolean pA;

    public Qhi(cJ cJVar, tP tPVar, int i10) {
        super(cJVar, tPVar, i10);
        this.Qhi = new CQU(Looper.getMainLooper(), this);
        this.f8521fl = new AtomicBoolean(false);
        this.Tgh = 1;
        this.ABk = 0;
        this.iMK = false;
    }

    private void EBS() {
        this.f8520ac.yN.Qhi(this.cJ);
        this.cJ.Qhi(this, this.Qhi);
        this.cJ.Gm();
    }

    private void NFd() {
        this.cJ.Qhi(this.f8523zc);
        this.CJ = (int) this.f8520ac.bxS.aP();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        if (qhi.VnT) {
            Qhi(qhi.aP.fl());
            Qhi(this.f8520ac.aP.CJ());
        }
        ac();
        lG();
        if (this.f8520ac.cJ.cJP() != null && this.f8520ac.cJ.cJP().Qhi() != null) {
            this.f8520ac.cJ.cJP().Qhi().Qhi(0L);
        }
    }

    private void lB() {
        if (!this.Sf.Qhi() || this.iMK) {
            return;
        }
        this.iMK = true;
        Qhi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                Qhi qhi = Qhi.this;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = qhi.f8520ac;
                com.bytedance.sdk.openadsdk.component.reward.Qhi.ROR ror = qhi2.NFd;
                float[] Qhi = qhi2.Eh.Qhi(qhi.Tgh);
                Qhi qhi3 = Qhi.this;
                ror.Qhi(Qhi, qhi3, qhi3.cJ);
            }
        });
    }

    private void lG() {
        if (!this.Sf.Qhi()) {
            if (bxS.Gm(this.f8520ac.cJ)) {
                Qhi(false, cJ.C0110cJ.f8695ac);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
            if (cJVar != null) {
                cJVar.Qhi(this.f8520ac.es.Tgh());
                this.cJ.pM();
            }
        }
    }

    private boolean sDy() {
        if (this.f8520ac.WAv.get() && this.f8520ac.ROR) {
            return false;
        }
        if (this.Sf.Qhi()) {
            return this.f8520ac.WAv.get();
        }
        return true;
    }

    public final void ABk() {
        this.Qhi.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void CJ() {
        aP();
        this.f8520ac.cJ.wI();
        this.f8520ac.cJ.Qhi(true);
        if (tP.fl(this.f8520ac.cJ)) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
            tP tPVar = qhi.cJ;
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, qhi.f8798fl, tPVar.gSh());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void Gm() {
        if (this.f8520ac.iMK.getAndSet(true) && !bxS.Gm(this.f8520ac.cJ)) {
            return;
        }
        this.f8520ac.aP.Qhi();
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
        return this.f8520ac.MND;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void Qhi(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public abstract void Qhi(Bundle bundle);

    public abstract void ROR();

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void Sf() {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar == null) {
            return;
        }
        cJVar.ABk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void Tgh() {
        if (!this.f8521fl.compareAndSet(false, true)) {
            return;
        }
        qMt.Qhi("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
        ROR();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final View WAv() {
        return this.f8520ac.bxS.sDy();
    }

    public abstract void ac();

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void ac(Activity activity) {
        super.ac(activity);
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar == null) {
            return;
        }
        cJVar.qMt();
    }

    public abstract void cJ();

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final void cJ(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar;
        super.cJ(activity);
        if (this.f8520ac == null || (cJVar = this.cJ) == null) {
            return;
        }
        cJVar.HzH();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        qhi.Qe = true;
        qhi.Eh.cJ(this.Qhi);
        if (sDy()) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.f8520ac;
            qhi2.js.Qhi(qhi2.cJ.rB());
        }
        this.f8520ac.es.pA();
        this.f8520ac.lG.MQ();
        this.f8520ac.CQU.ABk();
        if (this.cJ.cJ()) {
            this.f8520ac.bxS.Qhi(this.cJ);
            this.f8520ac.bxS.Qhi(false, this, this.ABk != 0);
        }
        this.ABk++;
        lB();
        com.bytedance.sdk.openadsdk.component.reward.view.ac acVar = this.f8520ac.pM;
        if (acVar != null) {
            acVar.ROR();
        }
        this.f8520ac.Eh.Qhi(this.Qhi);
        this.cJ.tP();
    }

    public final void fl() {
        Message message = new Message();
        message.what = 400;
        if (this.Sf.LpL()) {
            Qhi(Constants.CP_MAC_ROMAN);
        }
        this.Qhi.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public final void hm() {
        this.f8520ac.bxS.NFd();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Qhi.Tgh.Qhi
    public void hpZ() {
        ac fl2;
        cJ bxS = bxS();
        if (bxS != null && (fl2 = bxS.fl()) != null) {
            fl2.fl();
        }
    }

    public void kYc() {
        com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi = tP.Qhi(CacheDirFactory.getICacheDir(this.Sf.zTC()).Qhi(), this.Sf);
        Qhi.Qhi("material_meta", this.Sf);
        Qhi.Qhi("ad_slot", this.Sf.lB());
        com.bytedance.sdk.openadsdk.core.video.CJ.fl.Qhi(Qhi, new com.bykv.vk.openvk.component.video.api.fl.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.Qhi.3
            @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.fl.Qhi.InterfaceC0063Qhi
            public void Qhi(com.bykv.vk.openvk.component.video.api.ac.ac acVar, int i10, String str) {
            }
        });
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

    public void qMt() {
        bxS().Qhi(this, cJ(cJ.C0110cJ.cJ));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public boolean tP() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        if (qhi != null && qhi.bxS.Dww()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final void Qhi(Activity activity, Bundle bundle) {
        this.ROR = bundle;
        super.Qhi(activity, bundle);
        Qhi(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final void CJ(Activity activity) {
        super.CJ(activity);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        if (qhi == null) {
            return;
        }
        qhi.lG.sDy();
        com.bytedance.sdk.openadsdk.utils.ac.Qhi(activity, this.f8520ac.cJ);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public final View Qhi() {
        return this.f8520ac.yN;
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

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void Qhi(Activity activity, cJ.fl flVar) {
        super.Qhi(activity, flVar);
        this.Tgh = this.Sf.SL();
        Qhi(this.Sf, this.ROR);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        if (qhi.VnT && this.f8522hm > 0) {
            qhi.dIT = flVar.f8577ac;
        }
        try {
            EBS();
            NFd();
        } catch (Throwable th2) {
            ABk.Qhi("TTAD.AdScene", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.Gm.ac.cJ();
            CQU();
        }
    }

    private void Qhi(tP tPVar, Bundle bundle) {
        Activity Dww = Dww();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = new com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi(Dww, this.Qhi, tPVar, this, 1);
        this.f8520ac = qhi;
        qhi.VnT = bxS().Qhi();
        this.f8520ac.Ri = bxS().ROR();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.f8520ac;
        qhi2.Ura = this;
        qhi2.lB = bxS().HzH();
        Intent intent = Dww.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(this.f8520ac, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.cJ.Qhi(intent, this.f8520ac);
            tPVar.Qhi(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.f8520ac.zjb) {
            cJ();
        }
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ Qhi = com.bytedance.sdk.openadsdk.component.reward.cJ.ROR.Qhi(this.f8520ac);
        this.cJ = Qhi;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = this.f8520ac;
        qhi3.ReL = Qhi;
        qhi3.f8802zn.Qhi(this);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi4 = this.f8520ac;
        if (qhi4.VnT) {
            qhi4.bxS.Qhi(new Qhi.InterfaceC0130Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.Qhi.1
                @Override // com.bytedance.sdk.openadsdk.core.video.ac.Qhi.InterfaceC0130Qhi
                public void Qhi(int i10) {
                    cJ bxS = Qhi.this.bxS();
                    if (bxS == null) {
                        return;
                    }
                    bxS.Qhi(i10);
                }
            });
            bxS().ROR().setShowSound(tP.fl(tPVar));
        }
        com.bytedance.sdk.openadsdk.utils.ABk.Qhi(this.f8520ac);
        Objects.toString(this.cJ);
    }

    public cJ.fl cJ(int i10) {
        cJ.fl flVar = new cJ.fl(i10);
        flVar.f8577ac = this.f8520ac.dIT;
        return flVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void iMK() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.cJ
    public void zc() {
    }

    private void Qhi(com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar) {
        if (cJVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_show_order", Integer.valueOf(this.f8522hm + 1));
            cJVar.Qhi(hashMap);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void Qhi(Activity activity) {
        super.Qhi(activity);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        if (qhi == null) {
            return;
        }
        qhi.Eh.Qhi();
    }

    public final void Qhi(boolean z10, int i10) {
        Qhi(z10, false, i10);
    }

    public final void Qhi(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.f8520ac;
        qhi.f8802zn.Qhi(z10, z11, false, qhi.ReL, i10);
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public final void Qhi(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar = this.cJ;
        if (cJVar == null) {
            return;
        }
        cJVar.Qhi(message);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.Qhi.Tgh.Qhi
    public void Qhi(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar, int i10) {
        Qhi(z10, z11, z12, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.ROR
    public void Qhi(ROR ror, ROR ror2, cJ.fl flVar) {
        super.Qhi(ror, ror2, flVar);
        if (ror == this && (ror2 instanceof ac)) {
            int i10 = flVar.cJ;
            if (i10 == 3) {
                pA pAVar = this.f8520ac.bxS;
                pAVar.Qhi(!pAVar.Eh(), 2);
            } else if (i10 == 6) {
                pA pAVar2 = this.f8520ac.bxS;
                pAVar2.Qhi(!pAVar2.Eh(), !this.f8520ac.bxS.Eh());
            } else if (i10 == 5 && !tP.fl(this.f8520ac.cJ) && flVar.CJ) {
                this.f8520ac.bxS.Qhi("skip", true);
            }
            this.f8520ac.js.Qhi(false);
            this.f8520ac.js.CJ(false);
        }
        if (ror2.f8522hm != 0 || this.f8522hm == 0) {
            return;
        }
        this.Sf.hm(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        Map<String, Object> Gy = this.Sf.Gy();
        if (Gy != null) {
            Gy.put(InMobiNetworkValues.PRICE, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        }
    }

    public void Qhi(float f10) {
        cJ bxS = bxS();
        if (bxS == null) {
            return;
        }
        bxS.Qhi(f10);
        if (this.pA || f10 < this.Sf.yt() / 100.0f) {
            return;
        }
        this.pA = true;
        ROR Sf = bxS.Sf();
        if (Sf instanceof Qhi) {
            ((Qhi) Sf).kYc();
        }
    }
}

package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.app.Activity;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.kYc;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.ac.Qhi;
import com.bytedance.sdk.openadsdk.utils.js;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: RewardFullVideoPlayerManager.java */
/* loaded from: classes.dex */
public class pA {
    final boolean CJ;
    private long Gm;
    private final Qhi HzH;
    private com.bytedance.sdk.openadsdk.cJ.Sf MQ;
    private final Activity ROR;
    private final tP Sf;
    com.bykv.vk.openvk.component.video.api.CJ.fl Tgh;
    private final String WAv;

    /* renamed from: ac  reason: collision with root package name */
    boolean f8827ac;

    /* renamed from: hm  reason: collision with root package name */
    private FrameLayout f8829hm;
    private boolean hpZ;
    private String iMK;
    private boolean kYc;
    private Qhi.InterfaceC0130Qhi tP;

    /* renamed from: zc  reason: collision with root package name */
    private long f8830zc;
    protected boolean Qhi = false;
    boolean cJ = false;

    /* renamed from: fl  reason: collision with root package name */
    protected boolean f8828fl = false;
    private int ABk = -1;
    private HashSet<String> pA = new HashSet<>();

    public pA(Qhi qhi) {
        this.HzH = qhi;
        this.ROR = qhi.FQ;
        this.Sf = qhi.cJ;
        this.CJ = qhi.CJ;
        this.WAv = qhi.f8798fl;
    }

    private void Jma() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null && flVar.zc() != null) {
            this.Gm = this.Tgh.fl();
            if (this.Tgh.zc().ac() || !this.Tgh.zc().cJ()) {
                this.Tgh.Qhi();
                this.Tgh.ac();
                this.Qhi = true;
            }
        }
    }

    public void ABk() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            flVar.CJ();
        }
    }

    public boolean CJ() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        return (flVar == null || flVar.zc() == null || !this.Tgh.zc().ROR()) ? false : true;
    }

    public void CQU() {
        zc();
    }

    public boolean Dww() {
        return this.f8827ac;
    }

    public boolean EBS() {
        if (this.Tgh != null) {
            return true;
        }
        return false;
    }

    public boolean Eh() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null && flVar.zc() != null) {
            return this.Tgh.zc().Qhi();
        }
        return false;
    }

    public long Gm() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            return flVar.Tgh();
        }
        return 0L;
    }

    public int HzH() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            return flVar.WAv();
        }
        return 0;
    }

    public long MQ() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            return flVar.Sf();
        }
        return 0L;
    }

    public void NFd() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar instanceof com.bytedance.sdk.openadsdk.core.video.ac.Qhi) {
            ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) flVar).lG();
        }
    }

    public long ROR() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            return flVar.fl();
        }
        return this.Gm;
    }

    public long Sf() {
        return this.f8830zc;
    }

    public boolean Tgh() {
        return this.Qhi;
    }

    public void WAv() {
        try {
            if (cJ()) {
                this.Tgh.Qhi();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.cJ("RewardFullVideoPlayerManager onPause throw Exception :" + th2.getMessage());
        }
    }

    public double aP() {
        long CJ;
        kYc hm2 = this.Sf.hm();
        if (com.bytedance.sdk.openadsdk.core.model.HzH.ac(this.Sf) && hm2 != null) {
            CJ = hm2.cJ();
        } else if (com.bytedance.sdk.openadsdk.core.model.HzH.CJ(this.Sf) && hm2 != null) {
            CJ = hm2.CJ();
        } else {
            com.bykv.vk.openvk.component.video.api.ac.cJ FQ = this.Sf.FQ();
            if (FQ != null) {
                return FQ.Tgh() * FQ.EBS();
            }
            return 0.0d;
        }
        return CJ;
    }

    public boolean bxS() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null && flVar.zc() == null) {
            return true;
        }
        return false;
    }

    public boolean fl() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null && flVar.hpZ()) {
            return true;
        }
        return false;
    }

    public long hm() {
        return this.Gm;
    }

    public long hpZ() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            return flVar.Sf();
        }
        return 0L;
    }

    public void iMK() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            flVar.cJ();
        }
    }

    public int kYc() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            return flVar.ROR();
        }
        return 0;
    }

    public void lB() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar instanceof com.bytedance.sdk.openadsdk.core.video.ac.Qhi) {
            ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) flVar).zn();
        }
    }

    public void lG() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar instanceof com.bytedance.sdk.openadsdk.core.video.ac.Qhi) {
            ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) flVar).es();
        }
    }

    public void pA() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            flVar.Qhi();
        }
    }

    public void pM() {
        try {
            if (cJ()) {
                this.f8828fl = true;
                pA();
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e10.getMessage());
        }
    }

    public boolean qMt() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            if (flVar.zc() != null) {
                com.bykv.vk.openvk.component.video.api.Qhi zc2 = this.Tgh.zc();
                if (zc2.ROR() || zc2.Sf()) {
                    com.bykv.vk.openvk.component.video.api.CJ.fl flVar2 = this.Tgh;
                    if (flVar2 instanceof com.bytedance.sdk.openadsdk.core.video.ac.Qhi) {
                        ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) flVar2).Jma();
                    }
                    return true;
                }
            } else if (Tgh()) {
                Qhi(false);
                com.bykv.vk.openvk.component.video.api.CJ.fl flVar3 = this.Tgh;
                if (flVar3 instanceof com.bytedance.sdk.openadsdk.core.video.ac.Qhi) {
                    ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) flVar3).Jma();
                }
                return true;
            }
        }
        return false;
    }

    public View sDy() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar instanceof com.bytedance.sdk.openadsdk.core.video.ac.Qhi) {
            return (View) ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) flVar).js();
        }
        return null;
    }

    public long tP() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            return this.Tgh.Tgh() + flVar.Sf();
        }
        return 0L;
    }

    public void zc() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar == null) {
            return;
        }
        flVar.ac();
        this.Tgh = null;
    }

    public void CJ(boolean z10) {
        this.kYc = z10;
        if (this.Tgh instanceof com.bytedance.sdk.openadsdk.core.video.ac.Qhi) {
            if (z10) {
                ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) this.Tgh).cJ(this.Sf.FQ().EBS());
                return;
            }
            this.Sf.FQ().WAv(1);
            ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) this.Tgh).cJ(1);
        }
    }

    public com.bytedance.sdk.openadsdk.cJ.Sf Qhi() {
        return this.MQ;
    }

    public com.bykv.vk.openvk.component.video.api.cJ.Qhi ac() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            if (flVar instanceof com.bytedance.sdk.openadsdk.component.reward.ac) {
                return ((com.bytedance.sdk.openadsdk.component.reward.ac) flVar).kYc();
            }
            return flVar.ABk();
        }
        return null;
    }

    public boolean cJ() {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        return (flVar == null || flVar.zc() == null || !this.Tgh.zc().Tgh()) ? false : true;
    }

    private void cJ(long j10, long j11) {
        int abs = (int) Math.abs(this.ABk - j10);
        int i10 = this.ABk;
        if (i10 < 0 || abs > 500 || i10 > j11 || abs >= 500 || this.pA.contains(this.iMK)) {
            return;
        }
        if (this.ABk > j10) {
            com.bytedance.sdk.openadsdk.core.iMK.ac().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.pA.1
                @Override // java.lang.Runnable
                public void run() {
                    pA.this.pM();
                    pA.this.HzH.pM.Qhi(pA.this.ABk, pA.this.iMK);
                }
            }, abs);
        } else {
            pM();
            this.HzH.pM.Qhi(this.ABk, this.iMK);
        }
        this.pA.add(this.iMK);
    }

    public void Qhi(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.cJ.Sf sf2) {
        if (this.hpZ) {
            return;
        }
        this.hpZ = true;
        this.f8829hm = frameLayout;
        this.MQ = sf2;
        if (tP.fl(this.Sf)) {
            this.Tgh = new com.bytedance.sdk.openadsdk.core.video.ac.Qhi(this.ROR, this.f8829hm, this.Sf, sf2);
            CJ(this.kYc);
            Qhi.InterfaceC0130Qhi interfaceC0130Qhi = this.tP;
            if (interfaceC0130Qhi != null) {
                ((com.bytedance.sdk.openadsdk.core.video.ac.Qhi) this.Tgh).Qhi(interfaceC0130Qhi);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ac acVar = new com.bytedance.sdk.openadsdk.component.reward.ac(this.Sf, sf2);
        this.Tgh = acVar;
        Qhi.InterfaceC0130Qhi interfaceC0130Qhi2 = this.tP;
        if (interfaceC0130Qhi2 != null) {
            acVar.Qhi(interfaceC0130Qhi2);
        }
    }

    public void ac(boolean z10) {
        this.f8827ac = z10;
    }

    public void cJ(boolean z10) {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            flVar.cJ(z10);
        }
    }

    public void cJ(com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar) {
        if (!qMt() || cJVar == null) {
            return;
        }
        cJVar.Qhi(hm(), true);
    }

    public void Qhi(long j10, long j11) {
        this.f8830zc = j10;
        cJ(j10, j11);
    }

    public void Qhi(int i10, String str) {
        this.ABk = i10;
        this.iMK = str;
    }

    public void Qhi(long j10) {
        this.Gm = j10;
    }

    public void Qhi(boolean z10) {
        this.Qhi = z10;
    }

    public void Qhi(int i10, int i11) {
        if (this.Tgh != null) {
            hpZ.Qhi qhi = new hpZ.Qhi();
            qhi.cJ(Gm());
            qhi.ac(tP());
            qhi.Qhi(ROR());
            qhi.Qhi(i10);
            qhi.cJ(i11);
            com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.CJ(this.Tgh.ABk(), qhi);
        }
    }

    public void Qhi(fl.Qhi qhi) {
        com.bykv.vk.openvk.component.video.api.CJ.fl flVar = this.Tgh;
        if (flVar != null) {
            flVar.Qhi(qhi);
        }
    }

    public void Qhi(String str, boolean z10) {
        if (this.Tgh != null) {
            long ROR = ROR();
            if (this.Sf.TGC()) {
                ROR = this.HzH.ac();
            }
            long j10 = ROR;
            JSONObject Qhi = js.Qhi(this.Sf, this.Tgh.Tgh(), this.Tgh.zc());
            try {
                Qhi.put("auto_click", z10);
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.Sf, this.WAv, str, j10, HzH(), Qhi, this.MQ);
            tP();
            HzH();
        }
        lB();
    }

    public boolean Qhi(long j10, boolean z10, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar) {
        boolean z11 = false;
        if (EBS()) {
            if (com.bytedance.sdk.openadsdk.core.model.HzH.ac(this.HzH.cJ) || com.bytedance.sdk.openadsdk.core.model.HzH.CJ(this.HzH.cJ)) {
                return true;
            }
            if (!z10 || !bxS()) {
                Qhi(cJVar);
            }
            try {
                z11 = Qhi(j10, this.HzH.dIT);
            } catch (Exception unused) {
            }
            if (z11 && !z10) {
                this.HzH.aP.Qhi(map);
            }
            return z11;
        }
        return false;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar) {
        if (this.HzH.WAv.get()) {
            return;
        }
        Qhi qhi = this.HzH;
        if (!qhi.Qe || bxS.Gm(qhi.cJ)) {
            return;
        }
        if ((!tP.fl(this.HzH.cJ) && com.bytedance.sdk.openadsdk.core.HzH.CJ().ABk(String.valueOf(this.HzH.Tgh)) == 1 && this.HzH.pM.CJ()) || com.bytedance.sdk.openadsdk.core.model.HzH.ac(this.HzH.cJ) || com.bytedance.sdk.openadsdk.core.model.HzH.CJ(this.HzH.cJ) || this.f8828fl || !cJVar.Tgh()) {
            return;
        }
        this.HzH.xyz.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
        Message obtain = Message.obtain();
        obtain.what = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        this.HzH.xyz.sendMessageDelayed(obtain, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
    }

    private boolean Qhi(long j10, boolean z10) {
        if (this.Tgh == null || this.Sf.FQ() == null) {
            return false;
        }
        String Qhi = CacheDirFactory.getICacheDir(this.Sf.zTC()).Qhi();
        File file = new File(Qhi, this.Sf.FQ().iMK());
        if (file.exists() && file.length() > 0) {
            this.cJ = true;
        }
        com.bytedance.sdk.openadsdk.core.video.Qhi.cJ Qhi2 = tP.Qhi(Qhi, this.Sf);
        Qhi2.cJ(this.Sf.HLI());
        Qhi2.Qhi(this.f8829hm.getWidth());
        Qhi2.cJ(this.f8829hm.getHeight());
        Qhi2.ac(this.Sf.EGK());
        Qhi2.Qhi(j10);
        Qhi2.Qhi(z10);
        if (this.HzH.cJ.Qhi() && !this.HzH.pM.Sf() && tP.fl(this.Sf)) {
            Qhi2.CJ = 1;
        }
        return this.Tgh.Qhi(Qhi2);
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar) {
        try {
            this.f8828fl = false;
            if (Tgh()) {
                Jma();
                cJ(cJVar);
            } else if (CJ()) {
                iMK();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public void Qhi(boolean z10, com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar, boolean z11) {
        if (!z11 || z10 || this.f8828fl) {
            return;
        }
        if (CJ()) {
            iMK();
            return;
        }
        Jma();
        cJ(cJVar);
    }

    public void Qhi(Qhi.InterfaceC0130Qhi interfaceC0130Qhi) {
        this.tP = interfaceC0130Qhi;
    }
}

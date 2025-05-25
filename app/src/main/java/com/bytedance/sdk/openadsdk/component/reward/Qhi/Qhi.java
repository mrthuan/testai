package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.ROR;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardFullContext.java */
/* loaded from: classes.dex */
public class Qhi {
    public final boolean CJ;
    public final Sf CQU;
    public final fl Dww;
    public boolean EGK;
    public final WAv Eh;
    public final Activity FQ;
    private long Gy;
    public float Hf;
    public final ABk Jma;
    public String MND;
    public int NBs;
    public final ROR NFd;
    public final com.bytedance.sdk.openadsdk.core.video.ac.cJ PAe;
    private long PER;
    public final int Qhi;
    public final boolean ROR;
    public com.bytedance.sdk.openadsdk.component.reward.cJ.cJ ReL;
    public TopProxyLayout Ri;
    public final int Tgh;
    public com.bytedance.sdk.openadsdk.activity.ROR Ura;
    public boolean VnT;
    public int YB;
    public final hm aP;

    /* renamed from: ac  reason: collision with root package name */
    public final boolean f8797ac;
    public final pA bxS;
    public final tP cJ;
    public boolean cjC;
    public int dI;
    public boolean dIT;
    public boolean dVA;
    public final com.bytedance.sdk.openadsdk.component.reward.view.Tgh es;

    /* renamed from: fl  reason: collision with root package name */
    public final String f8798fl;
    public com.bytedance.sdk.openadsdk.utils.zc gga;

    /* renamed from: ip  reason: collision with root package name */
    public final Context f8800ip;
    public final boolean jPH;
    public final zc js;
    public com.bytedance.sdk.openadsdk.WAv.hm lB;
    public final hpZ lG;
    public com.bytedance.sdk.openadsdk.common.ROR oU;
    public boolean ots;
    public final com.bytedance.sdk.openadsdk.component.reward.view.ac pM;
    public boolean pv;
    public final ac sDy;
    public final CQU xyz;
    public final RewardFullBaseLayout yN;
    public boolean zjb;

    /* renamed from: zn  reason: collision with root package name */
    public final Tgh f8802zn;
    public int Sf = 0;

    /* renamed from: hm  reason: collision with root package name */
    public int f8799hm = 0;
    public final AtomicBoolean WAv = new AtomicBoolean(false);
    public final AtomicBoolean Gm = new AtomicBoolean(false);

    /* renamed from: zc  reason: collision with root package name */
    public final AtomicBoolean f8801zc = new AtomicBoolean(false);
    public final AtomicBoolean ABk = new AtomicBoolean(false);
    public final AtomicBoolean iMK = new AtomicBoolean(false);
    public final AtomicBoolean pA = new AtomicBoolean(false);
    public final AtomicBoolean hpZ = new AtomicBoolean(false);
    public final AtomicBoolean HzH = new AtomicBoolean(false);
    public final AtomicBoolean kYc = new AtomicBoolean(false);
    public final AtomicBoolean tP = new AtomicBoolean(false);
    public final AtomicBoolean MQ = new AtomicBoolean(false);
    public final AtomicBoolean qMt = new AtomicBoolean(false);
    public final AtomicBoolean EBS = new AtomicBoolean(false);
    public boolean Qe = false;
    public int Dq = 1;
    public long HLI = 0;

    public Qhi(Activity activity, CQU cqu, tP tPVar, com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar, int i10) {
        boolean z10;
        boolean z11;
        String str;
        WAv wAv;
        com.bytedance.sdk.openadsdk.component.reward.view.Tgh flVar;
        this.FQ = activity;
        this.PAe = cJVar;
        Context Qhi = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
        this.f8800ip = Qhi;
        this.cJ = tPVar;
        this.Qhi = i10;
        if (i10 != 0 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.jPH = z10;
        if (i10 != 0 && i10 != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.EGK = z11;
        this.xyz = cqu;
        boolean z12 = tPVar.lB().getDurationSlotType() == 7;
        this.CJ = z12;
        if (z12) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        this.f8798fl = str;
        this.pv = tPVar.Qhi();
        this.ROR = com.bytedance.sdk.openadsdk.core.model.HzH.hm(tPVar);
        int Hy = tPVar.Hy();
        this.Tgh = Hy;
        this.dIT = com.bytedance.sdk.openadsdk.core.HzH.CJ().HzH(String.valueOf(Hy));
        this.f8797ac = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().iMK(String.valueOf(Hy));
        if (i10 == 2) {
            wAv = new Gm(this);
        } else {
            wAv = new WAv(this);
        }
        this.Eh = wAv;
        if (i10 == 2) {
            flVar = new com.bytedance.sdk.openadsdk.component.reward.view.ROR(this);
        } else if (tPVar.Qhi()) {
            flVar = new com.bytedance.sdk.openadsdk.component.reward.view.Tgh(this);
        } else {
            flVar = new com.bytedance.sdk.openadsdk.component.reward.view.fl(this);
        }
        this.es = flVar;
        this.yN = new RewardFullBaseLayout(this);
        this.bxS = new pA(this);
        this.Dww = new fl(this);
        this.CQU = new Sf(this);
        this.pM = new com.bytedance.sdk.openadsdk.component.reward.view.ac(this);
        this.lG = new hpZ(this);
        this.Jma = new ABk(this);
        this.js = new zc(this);
        this.f8802zn = new Tgh(this);
        this.aP = new hm(this);
        this.NFd = new ROR(this);
        this.sDy = new ac(this);
        this.lB = new com.bytedance.sdk.openadsdk.WAv.hm(Qhi);
        this.gga = com.bytedance.sdk.openadsdk.utils.ROR.Qhi(activity, new ROR.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi.1
            @Override // com.bytedance.sdk.openadsdk.utils.ROR.Qhi
            public View Qhi() {
                com.bytedance.sdk.openadsdk.component.reward.view.Tgh tgh = Qhi.this.es;
                if (tgh != null) {
                    return tgh.WAv();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ROR.Qhi
            public void cJ() {
                zc zcVar = Qhi.this.js;
                if (zcVar != null) {
                    zcVar.Tgh();
                }
            }
        });
    }

    public void Qhi(boolean z10) {
        this.zjb = z10;
        this.js.CJ(z10);
    }

    public long ac() {
        return (SystemClock.elapsedRealtime() - this.PER) + this.Gy;
    }

    public void cJ() {
        if (this.PER <= 0) {
            this.PER = SystemClock.elapsedRealtime();
        }
        this.Gy = (SystemClock.elapsedRealtime() - this.PER) + this.Gy;
    }

    public void Qhi() {
        this.PER = SystemClock.elapsedRealtime();
    }
}

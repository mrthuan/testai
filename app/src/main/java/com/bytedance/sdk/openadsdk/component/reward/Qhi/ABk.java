package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardFullUgenEndcardManager.java */
/* loaded from: classes.dex */
public class ABk {
    private com.bytedance.adsdk.ugeno.component.cJ ABk;
    private boolean HzH;
    final tP Qhi;
    private volatile long ROR;
    private volatile long Sf;
    private volatile long Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private FrameLayout f8789ac;
    private final Qhi cJ;

    /* renamed from: hm  reason: collision with root package name */
    private String f8791hm;
    private com.bytedance.adsdk.ugeno.component.cJ iMK;
    private final AtomicBoolean CJ = new AtomicBoolean(false);

    /* renamed from: fl  reason: collision with root package name */
    private final AtomicBoolean f8790fl = new AtomicBoolean(false);
    private final AtomicBoolean WAv = new AtomicBoolean(false);
    private long Gm = 0;

    /* renamed from: zc  reason: collision with root package name */
    private long f8792zc = 0;
    private String pA = null;
    private boolean hpZ = false;

    public ABk(Qhi qhi) {
        this.cJ = qhi;
        this.Qhi = qhi.cJ;
        this.f8791hm = qhi.f8798fl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iMK() {
        com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi wv;
        tP tPVar = this.Qhi;
        if (tPVar == null || (wv = tPVar.wv()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ugen.cJ.cJ cJVar = new com.bytedance.sdk.openadsdk.core.ugen.cJ.cJ(this.cJ.FQ, this.Qhi, wv, this.f8791hm, new com.bytedance.sdk.openadsdk.core.ugen.CJ.fl() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ABk.3
            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
            public void Qhi() {
                ABk.this.f8792zc = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
            public void Qhi(int i10, String str, String str2) {
                ABk.this.f8790fl.set(false);
                ABk aBk = ABk.this;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(aBk.Qhi, true, aBk.f8791hm, "fail", SystemClock.elapsedRealtime() - ABk.this.f8792zc, str2, "endcard", i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
            public void Qhi(String str) {
                ABk aBk = ABk.this;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(aBk.Qhi, true, aBk.f8791hm, "success", SystemClock.elapsedRealtime() - ABk.this.f8792zc, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.fl
            public void Qhi(int i10, String str) {
                ABk.this.f8790fl.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.fl
            public void Qhi(com.bytedance.adsdk.ugeno.component.cJ<View> cJVar2) {
                ABk.this.iMK = cJVar2;
                ABk.this.f8790fl.set(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.fl
            public void cJ() {
            }
        });
        cJVar.Qhi(new com.bytedance.sdk.openadsdk.core.ugen.CJ.ac() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ABk.4
            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.ac
            public String Qhi() {
                return "overlay";
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.ac
            public void cJ() {
                ABk.this.hpZ = true;
                ABk.this.cJ.es.WAv().performClick();
            }
        });
        cJVar.Qhi();
        cJVar.Qhi(this.cJ.es.WAv());
    }

    public boolean ABk() {
        return this.f8790fl.get();
    }

    public void Gm() {
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(SystemClock.elapsedRealtime() - this.Sf, this.Qhi, this.f8791hm);
    }

    public void WAv() {
        com.bytedance.sdk.openadsdk.cJ.ac.ac(this.Qhi, this.f8791hm);
    }

    public boolean zc() {
        return this.CJ.get();
    }

    public boolean CJ() {
        return this.hpZ;
    }

    public void ROR() {
        WAv();
        hm();
        com.bytedance.adsdk.ugeno.component.cJ cJVar = this.ABk;
        if (cJVar != null) {
            this.f8789ac.addView(cJVar.hm(), new FrameLayout.LayoutParams(this.ABk.hpZ(), this.ABk.HzH()));
        }
    }

    public void Sf() {
        com.bytedance.adsdk.ugeno.component.cJ cJVar = this.iMK;
        if (cJVar != null) {
            this.f8789ac.addView(cJVar.hm(), new FrameLayout.LayoutParams(this.iMK.hpZ(), this.iMK.HzH()));
        }
    }

    public void Tgh() {
        this.Sf = SystemClock.elapsedRealtime();
    }

    public void fl() {
        this.Tgh = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.Qhi, this.f8791hm);
    }

    public void hm() {
        if (this.Sf <= 0 || this.ROR <= 0 || this.WAv.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.cJ.ac.cJ(this.ROR - this.Sf, this.Qhi, this.f8791hm, this.pA);
    }

    public void ac() {
        com.bytedance.sdk.openadsdk.core.ugen.fl.Qhi af2;
        tP tPVar = this.Qhi;
        if (tPVar == null || (af2 = tPVar.af()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ugen.cJ.cJ cJVar = new com.bytedance.sdk.openadsdk.core.ugen.cJ.cJ(this.cJ.FQ, this.Qhi, af2, this.f8791hm, new com.bytedance.sdk.openadsdk.core.ugen.CJ.fl() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ABk.1
            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
            public void Qhi() {
                ABk.this.Gm = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.fl
            public void cJ() {
                ABk.this.fl();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
            public void Qhi(int i10, String str, String str2) {
                ABk.this.pA = str2;
                ABk.this.CJ.set(false);
                ABk aBk = ABk.this;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(aBk.Qhi, false, aBk.f8791hm, "fail", SystemClock.elapsedRealtime() - ABk.this.Gm, str2, "endcard", i10, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh
            public void Qhi(String str) {
                ABk.this.pA = str;
                ABk aBk = ABk.this;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(aBk.Qhi, false, aBk.f8791hm, "success", SystemClock.elapsedRealtime() - ABk.this.Gm, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.fl
            public void Qhi(int i10, String str) {
                ABk.this.CJ.set(false);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ABk aBk = ABk.this;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(aBk.Qhi, aBk.f8791hm, elapsedRealtime - ABk.this.Tgh, i10, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.fl
            public void Qhi(com.bytedance.adsdk.ugeno.component.cJ<View> cJVar2) {
                ABk.this.ABk = cJVar2;
                ABk.this.CJ.set(true);
                ABk.this.ROR = SystemClock.elapsedRealtime();
                ABk.this.iMK();
                ABk.this.hm();
                ABk aBk = ABk.this;
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(aBk.Qhi, aBk.f8791hm, ABk.this.ROR - ABk.this.Tgh);
            }
        });
        if (this.Qhi.wv() != null) {
            cJVar.Qhi(new com.bytedance.sdk.openadsdk.core.ugen.CJ.ac() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.ABk.2
                @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.ac
                public String Qhi() {
                    return Constants.NORMAL;
                }

                @Override // com.bytedance.sdk.openadsdk.core.ugen.CJ.ac
                public void cJ() {
                }
            });
        }
        cJVar.Qhi();
        cJVar.Qhi(this.cJ.es.WAv());
    }

    public void cJ() {
        this.f8789ac = (FrameLayout) this.cJ.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.pA);
    }

    public void Qhi() {
        if (this.HzH) {
            return;
        }
        this.HzH = true;
        cJ();
    }

    public void Qhi(int i10) {
        zn.Qhi((View) this.f8789ac, i10);
    }
}

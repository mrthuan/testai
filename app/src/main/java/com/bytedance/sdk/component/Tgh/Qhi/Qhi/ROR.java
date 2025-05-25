package com.bytedance.sdk.component.Tgh.Qhi.Qhi;

import com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.Sf;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import java.util.List;
import java.util.Queue;

/* compiled from: RealTimeMemoryCacheStrategy.java */
/* loaded from: classes.dex */
public class ROR implements fl {
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac ABk;
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.cJ CJ;
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac Gm;
    Tgh Qhi = hm.ROR().CJ();
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.ROR ROR;
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac Sf;
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.ac Tgh;
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac WAv;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.Qhi f8066ac;
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.Tgh cJ;

    /* renamed from: fl  reason: collision with root package name */
    private Sf f8067fl;

    /* renamed from: hm  reason: collision with root package name */
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac f8068hm;
    private Queue<String> iMK;

    /* renamed from: zc  reason: collision with root package name */
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac f8069zc;

    public ROR(Queue<String> queue) {
        this.iMK = queue;
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac zc2 = hm.ROR().zc();
            this.Sf = zc2;
            this.cJ = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.Tgh(zc2, queue);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl()) {
            if (hm.ROR().WAv() != null) {
                this.WAv = hm.ROR().WAv();
            } else {
                this.WAv = hm.ROR().ABk();
            }
            this.CJ = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.cJ(this.WAv, queue);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac ABk = hm.ROR().ABk();
            this.f8068hm = ABk;
            this.f8066ac = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.Qhi(ABk, queue);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac ABk2 = hm.ROR().ABk();
            this.Gm = ABk2;
            this.f8067fl = new Sf(ABk2, queue);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac iMK = hm.ROR().iMK();
            this.f8069zc = iMK;
            this.Tgh = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.ac(iMK, queue);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac pA = hm.ROR().pA();
            this.ABk = pA;
            this.ROR = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.ROR(pA, queue);
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public void Qhi(int i10, long j10) {
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh, int i10) {
        try {
            byte CJ = tgh.CJ();
            byte fl2 = tgh.fl();
            if (CJ == 0 && fl2 == 1 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi()) {
                this.cJ.Qhi(tgh);
            } else if (CJ == 3 && fl2 == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl()) {
                this.CJ.Qhi(tgh);
            } else if (CJ == 0 && fl2 == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ()) {
                this.f8066ac.Qhi(tgh);
            } else if (CJ == 1 && fl2 == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac()) {
                this.f8067fl.Qhi(tgh);
            } else if (CJ == 1 && fl2 == 3 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ()) {
                this.Tgh.Qhi(tgh);
            } else if (CJ == 2 && fl2 == 3 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh()) {
                this.ROR.Qhi(tgh);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public void Qhi(int i10, List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh = list.get(0);
        byte fl2 = tgh.fl();
        byte CJ = tgh.CJ();
        if (CJ == 0 && fl2 == 1 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi()) {
            this.cJ.Qhi(i10, list);
        } else if (CJ == 3 && fl2 == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl()) {
            this.CJ.Qhi(i10, list);
        } else if (CJ == 0 && fl2 == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ()) {
            this.f8066ac.Qhi(i10, list);
        } else if (CJ == 1 && fl2 == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac()) {
            this.f8067fl.Qhi(i10, list);
        } else if (CJ == 1 && fl2 == 3 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ()) {
            this.Tgh.Qhi(i10, list);
        } else if (CJ == 2 && fl2 == 3 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh()) {
            this.ROR.Qhi(i10, list);
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi;
        List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi2;
        List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi3;
        List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi4;
        List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi5;
        List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi6;
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi() && this.cJ.cJ(i10, i11) && (Qhi6 = this.cJ.Qhi(i10, i11)) != null && Qhi6.size() != 0) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.kYc(), 1);
            return Qhi6;
        } else if (!com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl() || !this.CJ.cJ(i10, i11) || (Qhi5 = this.CJ.Qhi(i10, i11)) == null || Qhi5.size() == 0) {
            if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ() && this.f8066ac.cJ(i10, i11) && (Qhi4 = this.f8066ac.Qhi(i10, i11)) != null && Qhi4.size() != 0) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.tP(), 1);
                return Qhi4;
            } else if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac() && this.f8067fl.cJ(i10, i11) && (Qhi3 = this.f8067fl.Qhi(i10, i11)) != null && Qhi3.size() != 0) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.MQ(), 1);
                return Qhi3;
            } else if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ() && this.Tgh.cJ(i10, i11) && (Qhi2 = this.Tgh.Qhi(i10, i11)) != null && Qhi2.size() != 0) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.qMt(), 1);
                return Qhi2;
            } else if (!com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh() || !this.ROR.cJ(i10, i11) || (Qhi = this.ROR.Qhi(i10, i11)) == null || Qhi.size() == 0) {
                return null;
            } else {
                return Qhi;
            }
        } else {
            return Qhi5;
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public boolean Qhi(int i10, boolean z10) {
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.ROR ror;
        com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar;
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.ac acVar2;
        com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar3;
        Sf sf2;
        com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar4;
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.Qhi qhi;
        com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar5;
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.cJ cJVar;
        com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar6;
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ.Tgh tgh;
        com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar7;
        if (!com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi() || (tgh = this.cJ) == null || (acVar7 = this.Sf) == null || !tgh.cJ(i10, acVar7.Qhi())) {
            if (!com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl() || (cJVar = this.CJ) == null || (acVar6 = this.WAv) == null || !cJVar.cJ(i10, acVar6.Qhi())) {
                if (!com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ() || (qhi = this.f8066ac) == null || (acVar5 = this.f8068hm) == null || !qhi.cJ(i10, acVar5.Qhi())) {
                    if (!com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac() || (sf2 = this.f8067fl) == null || (acVar4 = this.Gm) == null || !sf2.cJ(i10, acVar4.Qhi())) {
                        if (!com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ() || (acVar2 = this.Tgh) == null || (acVar3 = this.f8069zc) == null || !acVar2.cJ(i10, acVar3.Qhi())) {
                            return com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh() && (ror = this.ROR) != null && (acVar = this.ABk) != null && ror.cJ(i10, acVar.Qhi());
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}

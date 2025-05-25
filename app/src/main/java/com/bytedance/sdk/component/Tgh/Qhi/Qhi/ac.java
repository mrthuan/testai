package com.bytedance.sdk.component.Tgh.Qhi.Qhi;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Sf;
import com.bytedance.sdk.component.Tgh.Qhi.hm;
import java.util.Iterator;
import java.util.List;

/* compiled from: DBCacheStrategy.java */
/* loaded from: classes.dex */
public class ac implements fl {
    private Sf CJ;
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac Gm;
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.fl Qhi;
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac ROR;
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac Sf;
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Tgh Tgh;
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac WAv;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.cJ f8070ac;
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ROR f8071fl;

    /* renamed from: hm  reason: collision with root package name */
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac f8072hm;

    /* renamed from: zc  reason: collision with root package name */
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac f8073zc;

    public ac() {
        Context Tgh = hm.ROR().Tgh();
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac zc2 = hm.ROR().zc();
            this.ROR = zc2;
            this.Qhi = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.fl(Tgh, zc2);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl()) {
            if (hm.ROR().WAv() != null) {
                this.f8072hm = hm.ROR().WAv();
            } else {
                this.f8072hm = hm.ROR().ABk();
            }
            this.f8070ac = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.cJ(Tgh, this.f8072hm);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac ABk = hm.ROR().ABk();
            this.Sf = ABk;
            this.cJ = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Qhi(Tgh, ABk);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac ABk2 = hm.ROR().ABk();
            this.WAv = ABk2;
            this.CJ = new Sf(Tgh, ABk2);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac iMK = hm.ROR().iMK();
            this.Gm = iMK;
            this.f8071fl = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ROR(Tgh, iMK);
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh()) {
            com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac pA = hm.ROR().pA();
            this.f8073zc = pA;
            this.Tgh = new com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Tgh(Tgh, pA);
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public void Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh, int i10) {
        if (tgh == null) {
            return;
        }
        try {
            tgh.cJ(System.currentTimeMillis());
            if (tgh.CJ() == 0 && tgh.fl() == 1) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi()) {
                    this.Qhi.Qhi(tgh);
                }
            } else if (tgh.CJ() == 3 && tgh.fl() == 2) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl()) {
                    this.f8070ac.Qhi(tgh);
                }
            } else if (tgh.CJ() == 0 && tgh.fl() == 2) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ()) {
                    this.cJ.Qhi(tgh);
                }
            } else if (tgh.CJ() == 1 && tgh.fl() == 2) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac()) {
                    this.CJ.Qhi(tgh);
                }
            } else if (tgh.CJ() == 1 && tgh.fl() == 3) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ()) {
                    this.f8071fl.Qhi(tgh);
                }
            } else if (tgh.CJ() == 2 && tgh.fl() == 3 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh()) {
                this.Tgh.Qhi(tgh);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.Jma(), 1);
        }
    }

    public List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> cJ(com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh, int i10) {
        if (tgh.CJ() == 0 && tgh.fl() == 1 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi()) {
            if (this.ROR.cJ() <= i10) {
                return null;
            }
            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi = this.Qhi.Qhi(this.ROR.cJ() - i10, "_id");
            if (Qhi != null && Qhi.size() != 0) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.Eh(), 1);
            }
            return Qhi;
        }
        if (tgh.CJ() == 3 && tgh.fl() == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl()) {
            if (this.f8072hm.cJ() > i10) {
                return this.f8070ac.Qhi(this.f8072hm.cJ() - i10, "_id");
            }
        } else if (tgh.CJ() == 0 && tgh.fl() == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ()) {
            if (this.Sf.cJ() > i10) {
                List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi2 = this.cJ.Qhi(this.Sf.cJ() - i10, "_id");
                if (Qhi2 != null && Qhi2.size() != 0) {
                    com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.aP(), 1);
                }
                return Qhi2;
            }
        } else if (tgh.CJ() == 1 && tgh.fl() == 2 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac()) {
            if (this.WAv.cJ() > i10) {
                List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi3 = this.CJ.Qhi(this.WAv.cJ() - i10, "_id");
                if (Qhi3 != null && Qhi3.size() != 0) {
                    com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.NFd(), 1);
                }
                return Qhi3;
            }
        } else if (tgh.CJ() == 1 && tgh.fl() == 3 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ()) {
            if (this.Gm.cJ() > i10) {
                List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi4 = this.f8071fl.Qhi(this.Gm.cJ() - i10, "_id");
                if (Qhi4 != null && Qhi4.size() != 0) {
                    com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.sDy(), 1);
                }
                return Qhi4;
            }
        } else if (tgh.CJ() == 2 && tgh.fl() == 3 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh() && this.f8073zc.cJ() > i10) {
            return this.Tgh.Qhi(this.f8073zc.cJ() - i10, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public void Qhi(int i10, List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh tgh = list.get(0);
        if (i10 == 200 || i10 == -1) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi qhi = com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ;
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.NBs(), list.size());
            if (i10 != 200) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(qhi.dVA(), list.size());
            }
            if (tgh.CJ() == 0 && tgh.fl() == 1) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi()) {
                    this.Qhi.cJ(list);
                }
            } else if (tgh.CJ() == 3 && tgh.fl() == 2) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl()) {
                    this.f8070ac.cJ(list);
                }
            } else if (tgh.CJ() == 0 && tgh.fl() == 2) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ()) {
                    this.cJ.cJ(list);
                }
            } else if (tgh.CJ() == 1 && tgh.fl() == 2) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac()) {
                    this.CJ.cJ(list);
                }
            } else if (tgh.CJ() == 1 && tgh.fl() == 3) {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ()) {
                    this.f8071fl.cJ(list);
                }
            } else if (tgh.CJ() == 2 && tgh.fl() == 3 && com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh()) {
                this.Tgh.cJ(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi(int i10, int i11, List<String> list) {
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi()) {
            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi = this.Qhi.Qhi("_id");
            if (Qhi(Qhi, list)) {
                Qhi.size();
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.bxS(), 1);
                return Qhi;
            }
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl()) {
            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi2 = this.f8070ac.Qhi("_id");
            if (Qhi(Qhi2, list)) {
                Qhi2.size();
                return Qhi2;
            }
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ()) {
            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi3 = this.cJ.Qhi("_id");
            if (Qhi(Qhi3, list)) {
                Qhi3.size();
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.Dww(), 1);
                return Qhi3;
            }
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac()) {
            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> cJ = this.CJ.cJ("_id");
            if (Qhi(cJ, list)) {
                cJ.size();
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.CQU(), 1);
                return cJ;
            }
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ()) {
            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> cJ2 = this.f8071fl.cJ("_id");
            if (Qhi(cJ2, list)) {
                cJ2.size();
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.pM(), 1);
                return cJ2;
            }
        }
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh()) {
            List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> cJ3 = this.Tgh.cJ("_id");
            if (Qhi(cJ3, list)) {
                cJ3.size();
                return cJ3;
            }
            return null;
        }
        return null;
    }

    private boolean Qhi(List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh next = it.next();
                    if (next != null) {
                        String ac2 = next.ac();
                        if (!TextUtils.isEmpty(ac2) && list2.contains(ac2)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public boolean Qhi(int i10, boolean z10) {
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Tgh tgh;
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ROR ror;
        Sf sf2;
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Qhi qhi;
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.cJ cJVar;
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.fl flVar;
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Qhi() && (flVar = this.Qhi) != null && flVar.Qhi(i10)) {
            com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.iMK(), 1);
            return true;
        } else if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.fl() && (cJVar = this.f8070ac) != null && cJVar.Qhi(i10)) {
            return true;
        } else {
            if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.cJ() && (qhi = this.cJ) != null && qhi.Qhi(i10)) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.pA(), 1);
                return true;
            } else if (com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.ac() && (sf2 = this.CJ) != null && sf2.Qhi(i10)) {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.hpZ(), 1);
                return true;
            } else if (!com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.CJ() || (ror = this.f8071fl) == null || !ror.Qhi(i10)) {
                return com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi.Tgh() && (tgh = this.Tgh) != null && tgh.Qhi(i10);
            } else {
                com.bytedance.sdk.component.Tgh.Qhi.ac.cJ.Qhi(com.bytedance.sdk.component.Tgh.Qhi.cJ.fl.CJ.HzH(), 1);
                return true;
            }
        }
    }

    @Override // com.bytedance.sdk.component.Tgh.Qhi.Qhi.fl
    public void Qhi(int i10, long j10) {
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.fl flVar = this.Qhi;
        if (flVar != null) {
            flVar.Qhi(i10, j10);
        }
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.cJ cJVar = this.f8070ac;
        if (cJVar != null) {
            cJVar.Qhi(i10, j10);
        }
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Qhi qhi = this.cJ;
        if (qhi != null) {
            qhi.Qhi(i10, j10);
        }
        Sf sf2 = this.CJ;
        if (sf2 != null) {
            sf2.Qhi(i10, j10);
        }
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.ROR ror = this.f8071fl;
        if (ror != null) {
            ror.Qhi(i10, j10);
        }
        com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi.Qhi.Tgh tgh = this.Tgh;
        if (tgh != null) {
            tgh.Qhi(i10, j10);
        }
    }
}

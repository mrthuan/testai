package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.component.Qhi;
import com.bytedance.adsdk.ugeno.core.ROR;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: UGenEngine.java */
/* loaded from: classes.dex */
public class Gm {
    private Sf CJ;
    private Context Qhi;
    private pA ROR;
    private ROR Sf;
    private HzH Tgh;
    private JSONObject WAv;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.component.cJ<View> f7918ac;
    private JSONObject cJ;

    /* renamed from: fl  reason: collision with root package name */
    private iMK f7919fl;

    /* renamed from: hm  reason: collision with root package name */
    private WAv f7920hm;
    private boolean Gm = true;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f7921zc = false;

    public Gm(Context context) {
        this.Qhi = context;
    }

    public com.bytedance.adsdk.ugeno.component.cJ<View> Qhi(JSONObject jSONObject) {
        HzH hzH = this.Tgh;
        if (hzH != null) {
            hzH.Qhi();
        }
        ROR ror = new ROR(jSONObject, this.cJ);
        this.Sf = ror;
        iMK imk = this.f7919fl;
        if (imk instanceof com.bytedance.adsdk.ugeno.core.Qhi.Qhi) {
            ((com.bytedance.adsdk.ugeno.core.Qhi.Qhi) imk).Qhi(ror.cJ());
        }
        this.f7918ac = Qhi(this.Sf.Qhi(), (com.bytedance.adsdk.ugeno.component.cJ<View>) null);
        HzH hzH2 = this.Tgh;
        if (hzH2 != null) {
            hzH2.cJ();
            this.f7918ac.Qhi(this.Tgh);
        }
        return this.f7918ac;
    }

    public void cJ(JSONObject jSONObject) {
        HzH hzH = this.Tgh;
        if (hzH != null) {
            hzH.ac();
        }
        this.cJ = jSONObject;
        Qhi(this.f7918ac, jSONObject);
        Qhi(this.f7918ac);
        if (this.Tgh != null) {
            hpZ hpz = new hpZ();
            hpz.Qhi(0);
            hpz.Qhi(this.f7918ac);
            this.Tgh.Qhi(hpz);
        }
    }

    public com.bytedance.adsdk.ugeno.component.cJ<View> Qhi(ROR.Qhi qhi, com.bytedance.adsdk.ugeno.component.cJ<View> cJVar) {
        List<ROR.Qhi> ac2;
        Qhi.C0074Qhi c0074Qhi = null;
        if (ROR.Qhi(qhi)) {
            String ac3 = qhi.ac();
            cJ Qhi = fl.Qhi(ac3);
            if (Qhi == null) {
                "not found component ".concat(String.valueOf(ac3));
                return null;
            }
            com.bytedance.adsdk.ugeno.component.cJ Qhi2 = Qhi.Qhi(this.Qhi);
            if (Qhi2 == null) {
                return null;
            }
            Qhi2.ac(com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(qhi.Qhi(), this.cJ));
            Qhi2.CJ(ac3);
            Qhi2.cJ(qhi.CJ());
            Qhi2.Qhi(qhi);
            Qhi2.Qhi(this.f7920hm);
            if (cJVar instanceof com.bytedance.adsdk.ugeno.component.Qhi) {
                com.bytedance.adsdk.ugeno.component.Qhi qhi2 = (com.bytedance.adsdk.ugeno.component.Qhi) cJVar;
                Qhi2.Qhi(qhi2);
                c0074Qhi = qhi2.Sf();
            }
            Iterator<String> keys = qhi.CJ().keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String Qhi3 = com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(qhi.CJ().optString(next), this.cJ);
                Qhi2.Qhi(next, Qhi3);
                if (c0074Qhi != null) {
                    c0074Qhi.Qhi(this.Qhi, next, Qhi3);
                }
            }
            if (Qhi2 instanceof com.bytedance.adsdk.ugeno.component.Qhi) {
                List<ROR.Qhi> fl2 = qhi.fl();
                if (fl2 != null && fl2.size() > 0) {
                    if (TextUtils.equals(Qhi2.pA(), "Swiper")) {
                        fl2.size();
                    }
                    for (ROR.Qhi qhi3 : fl2) {
                        com.bytedance.adsdk.ugeno.component.cJ<View> Qhi4 = Qhi(qhi3, Qhi2);
                        if (Qhi4 != null && Qhi4.kYc()) {
                            ((com.bytedance.adsdk.ugeno.component.Qhi) Qhi2).Qhi(Qhi4);
                        }
                    }
                } else {
                    if (TextUtils.equals(Qhi2.pA(), "RecyclerLayout") && (ac2 = this.Sf.ac()) != null && ac2.size() > 0) {
                        for (ROR.Qhi qhi4 : ac2) {
                            com.bytedance.adsdk.ugeno.component.cJ<View> Qhi5 = Qhi(qhi4, Qhi2);
                            if (Qhi5 != null && Qhi5.kYc()) {
                                ((com.bytedance.adsdk.ugeno.component.Qhi) Qhi2).Qhi(Qhi5);
                            }
                        }
                    }
                    return Qhi2;
                }
            }
            if (c0074Qhi != null) {
                Qhi2.Qhi(c0074Qhi.Qhi());
            }
            this.f7918ac = Qhi2;
            return Qhi2;
        }
        return null;
    }

    public void Qhi(com.bytedance.adsdk.ugeno.component.cJ cJVar, JSONObject jSONObject) {
        if (cJVar == null) {
            return;
        }
        if (cJVar instanceof com.bytedance.adsdk.ugeno.component.Qhi) {
            cJVar.Qhi(jSONObject);
            List<com.bytedance.adsdk.ugeno.component.cJ<View>> Qhi = ((com.bytedance.adsdk.ugeno.component.Qhi) cJVar).Qhi();
            if (Qhi == null || Qhi.size() <= 0) {
                return;
            }
            for (com.bytedance.adsdk.ugeno.component.cJ<View> cJVar2 : Qhi) {
                Qhi(cJVar2, jSONObject);
            }
            return;
        }
        cJVar.Qhi(jSONObject);
    }

    private void Qhi(com.bytedance.adsdk.ugeno.component.cJ<View> cJVar) {
        List<com.bytedance.adsdk.ugeno.component.cJ<View>> Qhi;
        if (cJVar == null) {
            return;
        }
        JSONObject Gm = cJVar.Gm();
        Iterator<String> keys = Gm.keys();
        com.bytedance.adsdk.ugeno.component.Qhi ABk = cJVar.ABk();
        Qhi.C0074Qhi Sf = ABk != null ? ABk.Sf() : null;
        while (keys.hasNext()) {
            String next = keys.next();
            String Qhi2 = com.bytedance.adsdk.ugeno.Qhi.ac.Qhi(Gm.optString(next), this.cJ);
            cJVar.Qhi(next, Qhi2);
            cJVar.Qhi(this.CJ);
            cJVar.Qhi(this.f7919fl);
            cJVar.Qhi(this.ROR);
            if (Sf != null) {
                Sf.Qhi(this.Qhi, next, Qhi2);
            }
        }
        if ((cJVar instanceof com.bytedance.adsdk.ugeno.component.Qhi) && (Qhi = ((com.bytedance.adsdk.ugeno.component.Qhi) cJVar).Qhi()) != null && Qhi.size() > 0) {
            for (com.bytedance.adsdk.ugeno.component.cJ<View> cJVar2 : Qhi) {
                Qhi(cJVar2);
            }
        }
        if (Sf != null) {
            cJVar.Qhi(Sf.Qhi());
        }
        cJVar.cJ();
    }

    public void Qhi(iMK imk) {
        com.bytedance.adsdk.ugeno.core.Qhi.Qhi qhi = new com.bytedance.adsdk.ugeno.core.Qhi.Qhi(imk);
        qhi.Qhi(this.WAv);
        qhi.Qhi(this.Gm);
        qhi.cJ(this.f7921zc);
        ROR ror = this.Sf;
        if (ror != null) {
            qhi.Qhi(ror.cJ());
        }
        this.f7919fl = qhi;
    }

    public void Qhi(pA pAVar) {
        this.ROR = pAVar;
    }
}

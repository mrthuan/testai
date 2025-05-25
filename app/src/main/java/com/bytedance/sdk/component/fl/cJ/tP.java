package com.bytedance.sdk.component.fl.CJ;

import com.bytedance.sdk.component.fl.ac.ac;
import com.bytedance.sdk.component.fl.ac.fl;
import java.util.List;
import java.util.Map;

/* compiled from: SuccessVisitor.java */
/* loaded from: classes.dex */
public class tP<T> extends ROR {
    private T Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8373ac;
    private com.bytedance.sdk.component.fl.ROR cJ;

    public tP(T t4, com.bytedance.sdk.component.fl.ROR ror, boolean z10) {
        this.Qhi = t4;
        this.cJ = ror;
        this.f8373ac = z10;
    }

    private Map<String, String> cJ() {
        com.bytedance.sdk.component.fl.ROR ror = this.cJ;
        if (ror != null) {
            return ror.fl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "success";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        String bxS = acVar.bxS();
        Map<String, List<ac>> ROR = acVar.tP().ROR();
        List<ac> list = ROR.get(bxS);
        if (list == null) {
            cJ(acVar);
            return;
        }
        synchronized (list) {
            for (ac acVar2 : list) {
                cJ(acVar2);
            }
            list.clear();
            ROR.remove(bxS);
        }
    }

    private void cJ(ac acVar) {
        com.bytedance.sdk.component.fl.HzH hm2 = acVar.hm();
        if (hm2 != null) {
            hm2.Qhi(new fl().Qhi(acVar, this.Qhi, cJ(), this.f8373ac));
        }
    }
}

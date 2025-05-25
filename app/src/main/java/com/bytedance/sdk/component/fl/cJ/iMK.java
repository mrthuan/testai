package com.bytedance.sdk.component.fl.CJ;

import com.bytedance.sdk.component.fl.ac.Qhi;
import com.bytedance.sdk.component.fl.ac.ac;
import java.util.List;
import java.util.Map;

/* compiled from: FailVisitor.java */
/* loaded from: classes.dex */
public class iMK extends ROR {
    private Throwable Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private String f8372ac;
    private int cJ;

    public iMK(int i10, String str, Throwable th2) {
        this.cJ = i10;
        this.f8372ac = str;
        this.Qhi = th2;
    }

    private void cJ(ac acVar) {
        com.bytedance.sdk.component.fl.HzH hm2 = acVar.hm();
        if (hm2 != null) {
            hm2.Qhi(this.cJ, this.f8372ac, this.Qhi);
        }
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "failed";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        acVar.Qhi(new Qhi(this.cJ, this.f8372ac, this.Qhi));
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
}

package com.bytedance.sdk.component.fl.CJ;

import com.bytedance.sdk.component.fl.ac.ac;
import com.bytedance.sdk.component.fl.cJ;

/* compiled from: CachePolicyVisitor.java */
/* loaded from: classes.dex */
public class WAv extends ROR {
    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "cache_policy";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        cJ MQ = acVar.MQ();
        if (MQ != null) {
            if (MQ.ac()) {
                acVar.Qhi(new hpZ());
                return;
            } else if (MQ.CJ()) {
                acVar.Qhi(new zc());
                return;
            }
        }
        acVar.Qhi(new HzH());
    }
}

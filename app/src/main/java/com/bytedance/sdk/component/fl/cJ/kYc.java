package com.bytedance.sdk.component.fl.CJ;

import com.bytedance.sdk.component.fl.ac.ac;

/* compiled from: RawCacheVisitor.java */
/* loaded from: classes.dex */
public class kYc extends ROR {
    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        byte[] Qhi = acVar.tP().cJ(acVar.MQ()).Qhi(acVar.WAv());
        if (Qhi == null) {
            acVar.Qhi(new zc());
        } else {
            acVar.Qhi(new Sf(Qhi, null));
        }
    }
}

package com.bytedance.sdk.component.fl.CJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.fl.ac.ac;

/* compiled from: CacheKeyVisitor.java */
/* loaded from: classes.dex */
public class hm extends ROR {
    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public String Qhi() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.fl.CJ.pA
    public void Qhi(ac acVar) {
        if (TextUtils.isEmpty(acVar.fl())) {
            com.bytedance.sdk.component.fl.ABk fl2 = acVar.tP().fl();
            acVar.cJ(fl2.Qhi(acVar));
            acVar.Qhi(fl2.cJ(acVar));
        }
        acVar.Qhi(new ABk());
    }
}

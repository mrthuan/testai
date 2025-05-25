package com.bytedance.sdk.openadsdk.core.Qhi;

import com.bytedance.sdk.openadsdk.core.model.cJ;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: AdCallBackAdapter.java */
/* loaded from: classes.dex */
public class Qhi implements tP.Qhi {
    private final tP.Qhi Qhi;

    public Qhi(tP.Qhi qhi) {
        this.Qhi = qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
    public void Qhi(final int i10, final String str) {
        if (this.Qhi != null) {
            if (lG.fl()) {
                this.Qhi.Qhi(i10, str);
            } else {
                lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Qhi.Qhi.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Qhi.this.Qhi.Qhi(i10, str);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
    public void Qhi(final com.bytedance.sdk.openadsdk.core.model.Qhi qhi, final cJ cJVar) {
        if (this.Qhi != null) {
            if (lG.fl()) {
                this.Qhi.Qhi(qhi, cJVar);
            } else {
                lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Qhi.Qhi.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Qhi.this.Qhi.Qhi(qhi, cJVar);
                    }
                });
            }
        }
    }
}

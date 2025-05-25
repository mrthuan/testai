package com.bytedance.sdk.openadsdk.Gm.cJ;

import com.bytedance.sdk.component.Sf.ac;
import com.bytedance.sdk.openadsdk.Gm.Qhi.fl;
import com.bytedance.sdk.openadsdk.Gm.cJ;
import com.bytedance.sdk.openadsdk.core.HzH;

/* compiled from: ReportThreadLogServiceImp.java */
/* loaded from: classes.dex */
public class Qhi implements ac {
    @Override // com.bytedance.sdk.component.Sf.ac
    public void Qhi(final com.bytedance.sdk.component.Sf.cJ.Qhi qhi) {
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi();
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi("stats_sdk_thread_num", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.cJ.Qhi.1
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                com.bytedance.sdk.component.Sf.cJ.Qhi qhi2;
                if (!HzH.CJ().Hf() || (qhi2 = qhi) == null || qhi2.Qhi() == null) {
                    return null;
                }
                return fl.cJ().Qhi("stats_sdk_thread_num").cJ(qhi.Qhi().toString());
            }
        });
    }
}

package com.bytedance.sdk.openadsdk.cJ.Qhi;

import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.lG;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StatsLogAdLogImpl.java */
/* loaded from: classes.dex */
public class ABk implements com.bytedance.sdk.openadsdk.Gm.ac.cJ {
    public static final ABk Qhi = new ABk();

    private ABk() {
    }

    @Override // com.bytedance.sdk.openadsdk.Gm.ac.cJ
    public void Qhi(com.bytedance.sdk.openadsdk.Gm.cJ cJVar) {
        Qhi(cJVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.Gm.ac.cJ
    public void Qhi(final com.bytedance.sdk.openadsdk.Gm.cJ cJVar, final boolean z10) {
        Qhi(new com.bytedance.sdk.component.Sf.hm("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.cJ.Qhi.ABk.1
            @Override // java.lang.Runnable
            public void run() {
                byte b10;
                try {
                    com.bytedance.sdk.openadsdk.Gm.Qhi.ac logStats = cJVar.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.cJ cJVar2 = new com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.cJ(bxS.Qhi(), logStats.Qhi());
                    cJVar2.ac((byte) 0);
                    if (z10) {
                        b10 = 2;
                    } else {
                        b10 = 3;
                    }
                    cJVar2.cJ(b10);
                    cJVar2.Qhi((byte) 1);
                    if (com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ()) {
                        fl.Qhi(HzH.Qhi(), com.bytedance.sdk.openadsdk.multipro.cJ.ac());
                    }
                    com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi(cJVar2);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void Qhi(com.bytedance.sdk.component.Sf.hm hmVar) {
        if (hmVar == null) {
            return;
        }
        if (!lG.Tgh()) {
            lG.cJ(hmVar, 5);
        } else {
            hmVar.run();
        }
    }
}

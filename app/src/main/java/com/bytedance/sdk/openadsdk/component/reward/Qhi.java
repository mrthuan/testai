package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: ChooseAdHelper.java */
/* loaded from: classes.dex */
public class Qhi {
    public static void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi, int i10, boolean z10) {
        if (qhi == null || qhi.ac() == null || qhi.ac().size() <= 0) {
            return;
        }
        if (i10 >= qhi.ac().size()) {
            i10 = 0;
        }
        tP tPVar = qhi.ac().get(i10);
        Context Qhi = HzH.Qhi();
        Qhi(tPVar, !TextUtils.isEmpty(z10 ? zc.Qhi(Qhi).Qhi(tPVar) : fl.Qhi(Qhi).Qhi(tPVar)), z10);
    }

    public static void Qhi(final tP tPVar, final boolean z10, final boolean z11) {
        com.bytedance.sdk.openadsdk.core.iMK.cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.1
            @Override // java.lang.Runnable
            public void run() {
                if (tP.this == null) {
                    return;
                }
                try {
                    Context Qhi = HzH.Qhi();
                    AdSlot lB = tP.this.lB();
                    if (lB != null) {
                        int cJ = Tgh.cJ();
                        if (cJ == 0 || cJ == 2) {
                            if (z11) {
                                ABk.Qhi(Qhi).Qhi(lB.getCodeId(), tP.this);
                            } else {
                                Tgh.Qhi(Qhi).Qhi(lB.getCodeId(), tP.this);
                            }
                        }
                        if (z10) {
                            if (z11) {
                                ABk.Qhi(Qhi).Qhi(lB);
                            } else {
                                Tgh.Qhi(Qhi).Qhi(lB);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}

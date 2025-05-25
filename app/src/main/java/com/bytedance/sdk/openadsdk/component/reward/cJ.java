package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.Iterator;
import java.util.List;

/* compiled from: ContinueDownloadTask.java */
/* loaded from: classes.dex */
public class cJ extends com.bytedance.sdk.component.Sf.hm {
    private final List<? extends com.bytedance.sdk.component.Sf.hm> Qhi;

    public cJ(String str, List<? extends com.bytedance.sdk.component.Sf.hm> list) {
        super(str);
        this.Qhi = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.Sf.hm> list;
        if (com.bytedance.sdk.component.utils.hpZ.ac(HzH.Qhi()) != 0 && (list = this.Qhi) != null) {
            Iterator<? extends com.bytedance.sdk.component.Sf.hm> it = list.iterator();
            while (it.hasNext()) {
                lG.Qhi(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.Sf.Qhi().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}

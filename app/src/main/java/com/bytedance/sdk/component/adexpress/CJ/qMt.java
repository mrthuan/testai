package com.bytedance.sdk.component.adexpress.CJ;

import com.bytedance.sdk.component.Sf.ROR;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.adexpress.Qhi.Qhi.Qhi;
import com.bytedance.sdk.component.adexpress.Qhi.Qhi.ac;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DynamicThreadUtils.java */
/* loaded from: classes.dex */
public class qMt {
    public static void Qhi(hm hmVar, int i10) {
        if (hmVar == null) {
            return;
        }
        ac ac2 = Qhi.Qhi().ac();
        ExecutorService iMK = ac2 != null ? ac2.iMK() : null;
        if (iMK != null) {
            hmVar.setPriority(i10);
            iMK.execute(hmVar);
            return;
        }
        ROR.Qhi(hmVar, i10);
    }

    public static void cJ(hm hmVar, int i10) {
        ExecutorService executorService;
        if (hmVar == null) {
            return;
        }
        ac ac2 = Qhi.Qhi().ac();
        if (ac2 != null) {
            executorService = ac2.ABk();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            hmVar.setPriority(i10);
            executorService.execute(hmVar);
            return;
        }
        ROR.Qhi(hmVar);
    }

    public static ScheduledFuture Qhi(Runnable runnable, long j10, TimeUnit timeUnit) {
        return ROR.Tgh().schedule(runnable, j10, timeUnit);
    }
}

package com.bytedance.sdk.openadsdk.cJ.Qhi;

import android.content.Context;
import com.bytedance.sdk.component.Tgh.Qhi.Qhi;
import com.bytedance.sdk.openadsdk.core.HzH;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AdLogSwitchUtils.java */
/* loaded from: classes.dex */
public class fl {
    public static AtomicInteger Qhi = new AtomicInteger(0);
    public static final AtomicBoolean cJ = new AtomicBoolean(false);

    public static void Qhi(Context context, boolean z10) {
        if (cJ.compareAndSet(false, true)) {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi(new Qhi.C0081Qhi().Qhi(new Gm()).cJ(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac.ac()).ac(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac.fl()).Qhi(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac.CJ()).Qhi(z10).Qhi(new zc()).Qhi(hm.Qhi).cJ(HzH.CJ().pA()).Qhi(HzH.CJ().hpZ()).Qhi(HzH.CJ().PER()).Qhi(), context);
            cJ();
        }
    }

    public static void ac() {
        try {
            com.bytedance.sdk.component.Tgh.Qhi.cJ.CJ();
            com.bytedance.sdk.component.Tgh.Qhi.cJ.fl();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AdLogSwitchUtils", th2.getMessage());
        }
    }

    public static void cJ() {
        com.bytedance.sdk.component.Tgh.Qhi.cJ.ac();
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.cJ.Qhi qhi) {
        com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.cJ cJVar = new com.bytedance.sdk.component.Tgh.Qhi.CJ.Qhi.cJ(qhi.CJ(), qhi);
        cJVar.cJ(qhi.fl() ? (byte) 1 : (byte) 2);
        cJVar.Qhi((byte) 0);
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ()) {
            Qhi(HzH.Qhi(), com.bytedance.sdk.openadsdk.multipro.cJ.ac());
        }
        com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi(cJVar);
    }

    public static com.bytedance.sdk.openadsdk.Gm.ac.cJ Qhi() {
        return ABk.Qhi;
    }

    public static void Qhi(final List<String> list, final int i10, final String str) {
        if (list == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(new com.bytedance.sdk.component.Sf.hm("track") { // from class: com.bytedance.sdk.openadsdk.cJ.Qhi.fl.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ()) {
                    fl.Qhi(HzH.Qhi(), com.bytedance.sdk.openadsdk.multipro.cJ.ac());
                }
                com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi(com.bytedance.sdk.openadsdk.core.zc.Qhi(HzH.Qhi()), list, true, i10, str);
            }
        });
    }

    public static void Qhi(String str) {
        Qhi(str, false);
    }

    public static void Qhi(String str, boolean z10) {
        if (com.bytedance.sdk.component.Tgh.Qhi.cJ.cJ()) {
            Qhi(HzH.Qhi(), com.bytedance.sdk.openadsdk.multipro.cJ.ac());
        }
        com.bytedance.sdk.component.Tgh.Qhi.cJ.Qhi(str, z10);
    }
}

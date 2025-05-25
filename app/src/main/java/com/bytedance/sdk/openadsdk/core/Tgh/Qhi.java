package com.bytedance.sdk.openadsdk.core.Tgh;

import android.content.Context;
import com.bytedance.sdk.component.ROR.ac.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.settings.ROR;
import com.bytedance.sdk.openadsdk.iMK.ac;
import com.bytedance.sdk.openadsdk.iMK.cJ;

/* compiled from: TncHelper.java */
/* loaded from: classes.dex */
public class Qhi {
    public static boolean Qhi = false;
    private static final int cJ = Integer.parseInt("1371");

    /* renamed from: ac  reason: collision with root package name */
    private static long f8984ac = System.currentTimeMillis();

    public static void Qhi() {
        Context Qhi2;
        if (!HzH.CJ().hm() || Qhi || (Qhi2 = HzH.Qhi()) == null) {
            return;
        }
        try {
            ac.Qhi().cJ().Qhi(Qhi2, true, new cJ(Qhi2));
            ac.Qhi().cJ().Qhi(Qhi2, com.bytedance.sdk.openadsdk.multipro.cJ.ac());
            f8984ac = System.currentTimeMillis();
            Qhi = true;
        } catch (Exception e10) {
            ABk.Qhi("TncHelper", "initTTAdNet: ", e10.getMessage());
        }
    }

    public static void cJ() {
        if (!Qhi) {
            return;
        }
        ROR CJ = HzH.CJ();
        if (CJ.hm()) {
            long SL = CJ.SL();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f8984ac >= SL) {
                f8984ac = currentTimeMillis;
                Context Qhi2 = HzH.Qhi();
                if (Qhi2 == null) {
                    return;
                }
                hm.Qhi().Qhi(cJ, Qhi2).ac();
            }
        }
    }
}

package com.bytedance.sdk.component.Tgh.Qhi.cJ;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.Tgh.Qhi.Qhi.Tgh;
import com.bytedance.sdk.component.Tgh.Qhi.hm;

/* compiled from: DBEventUtils.java */
/* loaded from: classes.dex */
public class Qhi {
    public static boolean CJ() {
        Tgh CJ = hm.ROR().CJ();
        if (CJ != null && !TextUtils.isEmpty(CJ.fl())) {
            return true;
        }
        return false;
    }

    public static long Qhi(int i10, Context context) {
        return cJ(i10, context);
    }

    public static boolean Tgh() {
        Tgh CJ = hm.ROR().CJ();
        if (CJ != null && !TextUtils.isEmpty(CJ.Tgh())) {
            return true;
        }
        return false;
    }

    public static boolean ac() {
        Tgh CJ = hm.ROR().CJ();
        if (CJ != null && !TextUtils.isEmpty(CJ.CJ())) {
            return true;
        }
        return false;
    }

    private static long cJ(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory() / 1048576;
        long maxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (maxMemory <= 0) {
            if (freeMemory <= 2) {
                return 1L;
            }
            if (freeMemory <= 10) {
                return Math.min(i10, 10);
            }
            return Math.min((freeMemory / 2) * 10, i10);
        }
        long j10 = ((freeMemory + maxMemory) - 10) / 2;
        if (j10 <= 2) {
            return 1L;
        }
        if (j10 <= 10) {
            return Math.min(i10, 10);
        }
        return Math.min(j10 * 10, i10);
    }

    public static boolean fl() {
        Tgh CJ = hm.ROR().CJ();
        if (CJ != null && !TextUtils.isEmpty(CJ.ac())) {
            return true;
        }
        return false;
    }

    public static boolean Qhi() {
        Tgh CJ = hm.ROR().CJ();
        return (CJ == null || TextUtils.isEmpty(CJ.Qhi())) ? false : true;
    }

    public static boolean cJ() {
        Tgh CJ = hm.ROR().CJ();
        return (CJ == null || TextUtils.isEmpty(CJ.cJ())) ? false : true;
    }
}

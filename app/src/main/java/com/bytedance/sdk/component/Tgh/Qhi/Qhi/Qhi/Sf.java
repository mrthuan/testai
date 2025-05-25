package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi;

import androidx.activity.r;
import com.bytedance.sdk.component.Tgh.Qhi.hm;

/* compiled from: TTPathConst.java */
/* loaded from: classes.dex */
public class Sf {
    public static String Qhi = "com.bytedance.openadsdk";
    public static String cJ = r.g(new StringBuilder("content://"), Qhi, ".TTMultiProvider");

    static {
        Qhi();
    }

    public static void Qhi() {
        if (hm.ROR().Tgh() != null) {
            Qhi = hm.ROR().Tgh().getPackageName();
            cJ = r.g(new StringBuilder("content://"), Qhi, ".TTMultiProvider");
        }
    }
}

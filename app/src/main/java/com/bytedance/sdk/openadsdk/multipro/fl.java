package com.bytedance.sdk.openadsdk.multipro;

import androidx.activity.r;
import com.bytedance.sdk.openadsdk.core.HzH;

/* compiled from: TTPathConst.java */
/* loaded from: classes.dex */
public class fl {
    public static String Qhi = "com.bytedance.openadsdk";
    public static String cJ = r.g(new StringBuilder("content://"), Qhi, ".TTMultiProvider");

    static {
        Qhi();
    }

    public static void Qhi() {
        if (HzH.Qhi() != null) {
            Qhi = HzH.Qhi().getPackageName();
            cJ = r.g(new StringBuilder("content://"), Qhi, ".TTMultiProvider");
        }
    }
}

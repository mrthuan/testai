package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;

/* compiled from: PAGNetworkTools.java */
/* loaded from: classes.dex */
public class EBS {
    public static String Qhi(Context context) {
        int Qhi = com.bytedance.sdk.component.utils.bxS.Qhi(context, 0L);
        if (Qhi != 2) {
            if (Qhi != 3) {
                if (Qhi != 4) {
                    if (Qhi != 5) {
                        if (Qhi != 6) {
                            return "mobile";
                        }
                        return "5g";
                    }
                    return "4g";
                }
                return "wifi";
            }
            return "3g";
        }
        return "2g";
    }
}

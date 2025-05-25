package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: TTAppInfoUtils.java */
/* loaded from: classes.dex */
public class EBS {
    private static volatile String Qhi;

    public static String Qhi() {
        if (!TextUtils.isEmpty(Qhi)) {
            return Qhi;
        }
        String str = Build.MODEL;
        Qhi = str;
        return str;
    }
}

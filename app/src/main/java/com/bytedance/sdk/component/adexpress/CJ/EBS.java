package com.bytedance.sdk.component.adexpress.CJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.fl;

/* compiled from: GlobalAdTypeUtils.java */
/* loaded from: classes.dex */
public class EBS {
    public static boolean Qhi(String str) {
        if (fl.cJ()) {
            if (TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad")) {
                return true;
            }
            return false;
        }
        return false;
    }
}

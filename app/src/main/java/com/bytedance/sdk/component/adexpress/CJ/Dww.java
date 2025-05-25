package com.bytedance.sdk.component.adexpress.CJ;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.fl;

/* compiled from: RitScreenUtils.java */
/* loaded from: classes.dex */
public class Dww {
    public static boolean Qhi(String str) {
        if (!TextUtils.equals(str, "fullscreen_interstitial_ad") && !TextUtils.equals(str, "rewarded_video")) {
            return false;
        }
        return true;
    }

    public static boolean cJ(String str) {
        if (fl.cJ() && Qhi(str)) {
            return true;
        }
        return false;
    }
}

package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: AutoTestUtils.java */
/* loaded from: classes.dex */
public class fl {
    public static String Qhi(String str) {
        if (!com.bytedance.sdk.component.utils.ABk.CJ()) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.Sf sf2 = new com.bytedance.sdk.openadsdk.core.model.Sf(com.bytedance.sdk.openadsdk.core.hm.cJ().ABk());
        StringBuilder sb2 = new StringBuilder(str);
        for (String str2 : sf2.cJ()) {
            if (sb2.toString().contains(str2)) {
                if (sb2.toString().contains("?")) {
                    sb2.append("&");
                    sb2.append(sf2.Qhi());
                } else {
                    sb2.append("?");
                    sb2.append(sf2.Qhi());
                }
            }
        }
        return sb2.toString();
    }
}

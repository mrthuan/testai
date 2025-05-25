package com.bytedance.sdk.component.Tgh.Qhi.Qhi.Qhi;

import android.text.TextUtils;
import android.util.Base64;

/* compiled from: ParamEncode.java */
/* loaded from: classes.dex */
public class ROR {
    public static String Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }

    public static String cJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 10));
    }
}

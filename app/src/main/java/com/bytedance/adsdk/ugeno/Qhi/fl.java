package com.bytedance.adsdk.ugeno.Qhi;

import android.text.TextUtils;

/* compiled from: UGMethodParser.java */
/* loaded from: classes.dex */
public class fl {
    public static Object Qhi(com.bytedance.adsdk.Qhi.cJ.Qhi.Qhi qhi) {
        cJ Qhi;
        if (qhi == null || (Qhi = Qhi(qhi.Qhi())) == null) {
            return null;
        }
        return Qhi.cJ(qhi.cJ());
    }

    public static cJ Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        if (str.equals("find")) {
            return new Qhi();
        }
        return null;
    }
}

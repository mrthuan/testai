package com.bytedance.sdk.openadsdk.pA.Qhi.cJ;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.ac;

/* compiled from: AdvertisingIdHelper.java */
/* loaded from: classes.dex */
public class Qhi {
    private static volatile Qhi cJ;
    private String Qhi = "";

    private Qhi() {
    }

    public static Qhi Qhi() {
        if (cJ == null) {
            synchronized (Qhi.class) {
                if (cJ == null) {
                    cJ = new Qhi();
                }
            }
        }
        return cJ;
    }

    public String cJ() {
        if (HzH.CJ().aP("gaid")) {
            if (!TextUtils.isEmpty(this.Qhi)) {
                return this.Qhi;
            }
            String cJ2 = ac.Qhi(HzH.Qhi()).cJ("gaid", "");
            this.Qhi = cJ2;
            return cJ2;
        }
        return "";
    }

    public void cJ(String str) {
        this.Qhi = str;
    }

    public static void Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ac.Qhi(HzH.Qhi()).Qhi("gaid", str);
    }
}

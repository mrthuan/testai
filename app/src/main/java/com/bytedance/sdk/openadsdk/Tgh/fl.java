package com.bytedance.sdk.openadsdk.Tgh;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.lB;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Map;

/* compiled from: NetHook.java */
/* loaded from: classes.dex */
public final class fl extends Qhi {
    public static ac Qhi;

    public static String Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, String str) {
        if (!lB.ac()) {
            return str;
        }
        ac Qhi2 = cJ.Qhi("net");
        if (Qhi2 == null) {
            return str;
        }
        Map map = (Map) Qhi2.Qhi(1, str);
        if (map == null) {
            return str;
        }
        String str2 = (String) map.get(InMobiNetworkValues.URL);
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                acVar.cJ(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}

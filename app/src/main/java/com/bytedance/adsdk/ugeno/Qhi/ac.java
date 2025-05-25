package com.bytedance.adsdk.ugeno.Qhi;

import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: UGExpressionParser.java */
/* loaded from: classes.dex */
public class ac {
    public static String Qhi(String str, JSONObject jSONObject) {
        Object Qhi;
        if (!TextUtils.isEmpty(str)) {
            if (jSONObject != null) {
                try {
                    if (str.startsWith("${") && str.endsWith("}")) {
                        com.bytedance.adsdk.Qhi.cJ.Qhi Qhi2 = com.bytedance.adsdk.Qhi.cJ.Qhi.Qhi(str.substring(2, str.length() - 1));
                        Qhi = Qhi2.Qhi(jSONObject);
                        Objects.toString(Qhi);
                        if (Qhi instanceof String) {
                            return (String) Qhi2.Qhi(jSONObject);
                        }
                        if (Qhi instanceof com.bytedance.adsdk.Qhi.cJ.Qhi.Qhi) {
                            return String.valueOf(fl.Qhi((com.bytedance.adsdk.Qhi.cJ.Qhi.Qhi) Qhi));
                        }
                    } else {
                        return str;
                    }
                } catch (Throwable unused) {
                    return str;
                }
            }
            return String.valueOf(Qhi);
        }
        return str;
    }
}

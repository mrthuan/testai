package com.bytedance.adsdk.lottie;

import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.Map;

/* compiled from: TextDelegate.java */
/* loaded from: classes.dex */
public class MQ {
    private final Map<String, String> Qhi;
    private boolean cJ;

    public String Qhi(String str) {
        return str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String cJ(String str, String str2) {
        if (this.cJ && this.Qhi.containsKey(str2)) {
            return this.Qhi.get(str2);
        }
        String Qhi = Qhi(str, str2);
        if (this.cJ) {
            this.Qhi.put(str2, Qhi);
        }
        return Qhi;
    }

    public String Qhi(String str, String str2) {
        return Qhi(str2);
    }
}

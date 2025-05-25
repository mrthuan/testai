package com.bytedance.adsdk.lottie.ac;

import com.bytedance.adsdk.lottie.iMK;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* compiled from: LottieCompositionCache.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class Tgh {
    private static final Tgh Qhi = new Tgh();
    private final iMK<String, com.bytedance.adsdk.lottie.ROR> cJ = new iMK<>(20);

    public static Tgh Qhi() {
        return Qhi;
    }

    public com.bytedance.adsdk.lottie.ROR Qhi(String str) {
        if (str == null) {
            return null;
        }
        return this.cJ.Qhi((iMK<String, com.bytedance.adsdk.lottie.ROR>) str);
    }

    public void Qhi(String str, com.bytedance.adsdk.lottie.ROR ror) {
        if (str == null) {
            return;
        }
        this.cJ.Qhi(str, ror);
    }
}

package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import android.util.JsonToken;

/* compiled from: PathKeyframeParser.java */
/* loaded from: classes.dex */
class Eh {
    public static com.bytedance.adsdk.lottie.Qhi.cJ.WAv Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        boolean z10;
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new com.bytedance.adsdk.lottie.Qhi.cJ.WAv(ror, qMt.Qhi(jsonReader, ror, com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(), aP.Qhi, z10, false));
    }
}

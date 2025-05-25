package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import android.util.JsonToken;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes.dex */
public class js implements xyz<com.bytedance.adsdk.lottie.ROR.ac> {
    public static final js Qhi = new js();

    private js() {
    }

    @Override // com.bytedance.adsdk.lottie.fl.xyz
    /* renamed from: Qhi */
    public com.bytedance.adsdk.lottie.ROR.ac cJ(JsonReader jsonReader, float f10) {
        boolean z10;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z10) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.lottie.ROR.ac((nextDouble / 100.0f) * f10, (nextDouble2 / 100.0f) * f10);
    }
}

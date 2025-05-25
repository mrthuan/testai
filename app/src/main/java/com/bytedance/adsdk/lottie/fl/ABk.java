package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;

/* compiled from: FloatParser.java */
/* loaded from: classes.dex */
public class ABk implements xyz<Float> {
    public static final ABk Qhi = new ABk();

    private ABk() {
    }

    @Override // com.bytedance.adsdk.lottie.fl.xyz
    /* renamed from: Qhi */
    public Float cJ(JsonReader jsonReader, float f10) {
        return Float.valueOf(MQ.cJ(jsonReader) * f10);
    }
}

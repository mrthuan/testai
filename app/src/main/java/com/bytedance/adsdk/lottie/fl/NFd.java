package com.bytedance.adsdk.lottie.fl;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public class NFd implements xyz<PointF> {
    public static final NFd Qhi = new NFd();

    private NFd() {
    }

    @Override // com.bytedance.adsdk.lottie.fl.xyz
    /* renamed from: Qhi */
    public PointF cJ(JsonReader jsonReader, float f10) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return MQ.cJ(jsonReader, f10);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return MQ.cJ(jsonReader, f10);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}

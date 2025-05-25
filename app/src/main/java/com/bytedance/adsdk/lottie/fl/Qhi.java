package com.bytedance.adsdk.lottie.fl;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public class Qhi {
    public static com.bytedance.adsdk.lottie.ac.Qhi.Tgh Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Eh.Qhi(jsonReader, ror));
            }
            jsonReader.endArray();
            EBS.Qhi(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.lottie.ROR.Qhi(MQ.cJ(jsonReader, com.bytedance.adsdk.lottie.Tgh.ROR.Qhi())));
        }
        return new com.bytedance.adsdk.lottie.ac.Qhi.Tgh(arrayList);
    }

    public static com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> cJ(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.ac.Qhi.Tgh tgh = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2 = null;
        boolean z10 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 107:
                    if (nextName.equals(OperatorName.NON_STROKING_CMYK)) {
                        c = 0;
                        break;
                    }
                    break;
                case 120:
                    if (nextName.equals("x")) {
                        c = 1;
                        break;
                    }
                    break;
                case 121:
                    if (nextName.equals(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    tgh = Qhi(jsonReader, ror);
                    continue;
                case 1:
                    if (jsonReader.peek() == JsonToken.STRING) {
                        z10 = true;
                        break;
                    } else {
                        cJVar = fl.Qhi(jsonReader, ror);
                        continue;
                    }
                case 2:
                    if (jsonReader.peek() != JsonToken.STRING) {
                        cJVar2 = fl.Qhi(jsonReader, ror);
                        continue;
                    } else {
                        z10 = true;
                        break;
                    }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        if (z10) {
            ror.Qhi("Lottie doesn't support expressions.");
        }
        if (tgh != null) {
            return tgh;
        }
        return new com.bytedance.adsdk.lottie.ac.Qhi.WAv(cJVar, cJVar2);
    }
}

package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* compiled from: AnimatableTextPropertiesParser.java */
/* loaded from: classes.dex */
public class cJ {
    public static com.bytedance.adsdk.lottie.ac.Qhi.zc Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.ac.Qhi.zc zcVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                zcVar = cJ(jsonReader, ror);
            }
        }
        jsonReader.endObject();
        if (zcVar == null) {
            return new com.bytedance.adsdk.lottie.ac.Qhi.zc(null, null, null, null);
        }
        return zcVar;
    }

    private static com.bytedance.adsdk.lottie.ac.Qhi.zc cJ(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi = null;
        com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 116:
                    if (nextName.equals("t")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals(OperatorName.NON_STROKING_COLOR)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    cJVar2 = fl.Qhi(jsonReader, ror);
                    break;
                case 1:
                    qhi = fl.ROR(jsonReader, ror);
                    break;
                case 2:
                    qhi2 = fl.ROR(jsonReader, ror);
                    break;
                case 3:
                    cJVar = fl.Qhi(jsonReader, ror);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.ac.Qhi.zc(qhi, qhi2, cJVar, cJVar2);
    }
}

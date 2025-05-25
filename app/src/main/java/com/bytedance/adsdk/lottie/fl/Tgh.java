package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BlurEffectParser.java */
/* loaded from: classes.dex */
public class Tgh {
    public static com.bytedance.adsdk.lottie.ac.cJ.Qhi Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        com.bytedance.adsdk.lottie.ac.cJ.Qhi qhi = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lottie.ac.cJ.Qhi cJ = cJ(jsonReader, ror);
                    if (cJ != null) {
                        qhi = cJ;
                    }
                }
                jsonReader.endArray();
            }
        }
        return qhi;
    }

    private static com.bytedance.adsdk.lottie.ac.cJ.Qhi cJ(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.ac.cJ.Qhi qhi = null;
        while (true) {
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                if (!nextName.equals(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)) {
                    if (!nextName.equals("ty")) {
                        jsonReader.skipValue();
                    } else if (jsonReader.nextInt() == 0) {
                        z10 = true;
                    }
                } else if (z10) {
                    qhi = new com.bytedance.adsdk.lottie.ac.cJ.Qhi(fl.Qhi(jsonReader, ror));
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return qhi;
        }
    }
}

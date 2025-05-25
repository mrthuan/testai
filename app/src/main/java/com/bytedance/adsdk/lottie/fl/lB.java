package com.bytedance.adsdk.lottie.fl;

import android.graphics.PointF;
import android.util.JsonReader;

/* compiled from: RectangleShapeParser.java */
/* loaded from: classes.dex */
class lB {
    public static com.bytedance.adsdk.lottie.ac.cJ.zc Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        String str = null;
        com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ROR ror2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals("p")) {
                        c = 0;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 1;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    imk = Qhi.cJ(jsonReader, ror);
                    break;
                case 1:
                    cJVar = fl.Qhi(jsonReader, ror);
                    break;
                case 2:
                    ror2 = fl.ac(jsonReader, ror);
                    break;
                case 3:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 4:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.zc(str, imk, ror2, cJVar, z10);
    }
}

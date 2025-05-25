package com.bytedance.adsdk.lottie.fl;

import android.graphics.PointF;
import android.util.JsonReader;

/* compiled from: CircleShapeParser.java */
/* loaded from: classes.dex */
class ROR {
    public static com.bytedance.adsdk.lottie.ac.cJ.cJ Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror, int i10) {
        boolean z10;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = false;
        String str = null;
        com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ROR ror2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c = 0;
                        break;
                    }
                    break;
                case 112:
                    if (nextName.equals("p")) {
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
                    if (jsonReader.nextInt() == 3) {
                        z11 = true;
                        break;
                    } else {
                        z11 = false;
                        break;
                    }
                case 1:
                    imk = Qhi.cJ(jsonReader, ror);
                    break;
                case 2:
                    ror2 = fl.ac(jsonReader, ror);
                    break;
                case 3:
                    z12 = jsonReader.nextBoolean();
                    break;
                case 4:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.cJ(str, imk, ror2, z11, z12);
    }
}

package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;

/* compiled from: RoundedCornersParser.java */
/* loaded from: classes.dex */
public class Jma {
    public static com.bytedance.adsdk.lottie.ac.cJ.iMK Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        String str = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 114:
                    if (nextName.equals("r")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    cJVar = fl.Qhi(jsonReader, ror, true);
                    break;
                case 1:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z10) {
            return null;
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.iMK(str, cJVar);
    }
}

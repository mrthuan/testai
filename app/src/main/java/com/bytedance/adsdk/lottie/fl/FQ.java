package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;

/* compiled from: ShapePathParser.java */
/* loaded from: classes.dex */
class FQ {
    public static com.bytedance.adsdk.lottie.ac.cJ.kYc Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        String str = null;
        com.bytedance.adsdk.lottie.ac.Qhi.hm hmVar = null;
        int i10 = 0;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
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
                case 104415:
                    if (nextName.equals("ind")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 1:
                    hmVar = fl.fl(jsonReader, ror);
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                case 3:
                    i10 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.kYc(str, i10, hmVar, z10);
    }
}

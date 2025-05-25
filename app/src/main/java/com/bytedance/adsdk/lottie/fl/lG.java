package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;

/* compiled from: RepeaterParser.java */
/* loaded from: classes.dex */
class lG {
    public static com.bytedance.adsdk.lottie.ac.cJ.ABk Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        String str = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ABk aBk = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    cJVar = fl.Qhi(jsonReader, ror, false);
                    break;
                case 1:
                    cJVar2 = fl.Qhi(jsonReader, ror, false);
                    break;
                case 2:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    aBk = ac.Qhi(jsonReader, ror);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.ABk(str, cJVar, cJVar2, aBk, z10);
    }
}

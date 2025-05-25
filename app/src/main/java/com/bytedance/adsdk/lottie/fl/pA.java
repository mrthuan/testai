package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;

/* compiled from: FontParser.java */
/* loaded from: classes.dex */
class pA {
    public static com.bytedance.adsdk.lottie.ac.ac Qhi(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1866931350:
                    if (nextName.equals("fFamily")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1408684838:
                    if (nextName.equals("ascent")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1294566165:
                    if (nextName.equals("fStyle")) {
                        c = 2;
                        break;
                    }
                    break;
                case 96619537:
                    if (nextName.equals("fName")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    f10 = (float) jsonReader.nextDouble();
                    break;
                case 2:
                    str2 = jsonReader.nextString();
                    break;
                case 3:
                    str3 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.ac.ac(str, str3, str2, f10);
    }
}

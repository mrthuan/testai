package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.ac.cJ.MQ;
import lib.zj.pdfeditor.Annotation;

/* compiled from: ShapeTrimPathParser.java */
/* loaded from: classes.dex */
class ip {
    public static com.bytedance.adsdk.lottie.ac.cJ.MQ Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        String str = null;
        MQ.Qhi qhi = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar3 = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals(Annotation.KEY_E)) {
                        c = 0;
                        break;
                    }
                    break;
                case 109:
                    if (nextName.equals("m")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    cJVar2 = fl.Qhi(jsonReader, ror, false);
                    break;
                case 1:
                    qhi = MQ.Qhi.Qhi(jsonReader.nextInt());
                    break;
                case 2:
                    cJVar3 = fl.Qhi(jsonReader, ror, false);
                    break;
                case 3:
                    cJVar = fl.Qhi(jsonReader, ror, false);
                    break;
                case 4:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 5:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.MQ(str, qhi, cJVar, cJVar2, cJVar3, z10);
    }
}

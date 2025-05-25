package com.bytedance.adsdk.lottie.fl;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.ac.cJ.Gm;

/* compiled from: PolystarShapeParser.java */
/* loaded from: classes.dex */
class sDy {
    public static com.bytedance.adsdk.lottie.ac.cJ.Gm Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror, int i10) {
        boolean z10;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = false;
        boolean z12 = z10;
        String str = null;
        Gm.Qhi qhi = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar3 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar4 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar5 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar6 = null;
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
                case 114:
                    if (nextName.equals("r")) {
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
                case 3369:
                    if (nextName.equals("ir")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (jsonReader.nextInt() == 3) {
                        z12 = true;
                        break;
                    } else {
                        z12 = false;
                        break;
                    }
                case 1:
                    imk = Qhi.cJ(jsonReader, ror);
                    break;
                case 2:
                    cJVar2 = fl.Qhi(jsonReader, ror, false);
                    break;
                case 3:
                    z11 = jsonReader.nextBoolean();
                    break;
                case 4:
                    cJVar3 = fl.Qhi(jsonReader, ror);
                    break;
                case 5:
                    cJVar5 = fl.Qhi(jsonReader, ror, false);
                    break;
                case 6:
                    str = jsonReader.nextString();
                    break;
                case 7:
                    cJVar4 = fl.Qhi(jsonReader, ror);
                    break;
                case '\b':
                    cJVar6 = fl.Qhi(jsonReader, ror, false);
                    break;
                case '\t':
                    cJVar = fl.Qhi(jsonReader, ror, false);
                    break;
                case '\n':
                    qhi = Gm.Qhi.Qhi(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.Gm(str, qhi, cJVar, imk, cJVar2, cJVar3, cJVar4, cJVar5, cJVar6, z11, z12);
    }
}

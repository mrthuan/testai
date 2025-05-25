package com.bytedance.adsdk.lottie.fl;

import android.graphics.Path;
import android.util.JsonReader;
import java.util.Collections;

/* compiled from: ShapeFillParser.java */
/* loaded from: classes.dex */
class es {
    public static com.bytedance.adsdk.lottie.ac.cJ.hpZ Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        Path.FillType fillType;
        com.bytedance.adsdk.lottie.ac.Qhi.fl flVar = null;
        String str = null;
        com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -396065730:
                    if (nextName.equals("fillEnabled")) {
                        c = 0;
                        break;
                    }
                    break;
                case 99:
                    if (nextName.equals("c")) {
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
                case 114:
                    if (nextName.equals("r")) {
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
                    z10 = jsonReader.nextBoolean();
                    break;
                case 1:
                    qhi = fl.ROR(jsonReader, ror);
                    break;
                case 2:
                    flVar = fl.cJ(jsonReader, ror);
                    break;
                case 3:
                    i10 = jsonReader.nextInt();
                    break;
                case 4:
                    z11 = jsonReader.nextBoolean();
                    break;
                case 5:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (flVar == null) {
            flVar = new com.bytedance.adsdk.lottie.ac.Qhi.fl(Collections.singletonList(new com.bytedance.adsdk.lottie.ROR.Qhi(100)));
        }
        com.bytedance.adsdk.lottie.ac.Qhi.fl flVar2 = flVar;
        if (i10 == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.hpZ(str, z10, fillType, qhi, flVar2, z11);
    }
}

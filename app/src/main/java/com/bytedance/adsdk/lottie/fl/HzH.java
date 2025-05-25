package com.bytedance.adsdk.lottie.fl;

import android.graphics.Path;
import android.util.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Collections;
import lib.zj.pdfeditor.Annotation;

/* compiled from: GradientFillParser.java */
/* loaded from: classes.dex */
class HzH {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.adsdk.lottie.ac.cJ.Tgh Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        com.bytedance.adsdk.lottie.ac.Qhi.fl flVar;
        char c;
        Path.FillType fillType;
        com.bytedance.adsdk.lottie.ac.cJ.Sf sf2;
        com.bytedance.adsdk.lottie.ac.Qhi.fl flVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        com.bytedance.adsdk.lottie.ac.cJ.Sf sf3 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ac acVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ROR ror2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ROR ror3 = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i10 = -1;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals(Annotation.KEY_E)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals(OperatorName.NON_STROKING_GRAY)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    ror3 = fl.ac(jsonReader, ror);
                    break;
                case 1:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals(OperatorName.NON_STROKING_CMYK)) {
                            if (!nextName2.equals("p")) {
                                jsonReader.skipValue();
                            } else {
                                i10 = jsonReader.nextInt();
                            }
                        } else {
                            acVar = fl.Qhi(jsonReader, ror, i10);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    flVar2 = fl.cJ(jsonReader, ror);
                    break;
                case 3:
                    if (jsonReader.nextInt() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 4:
                    ror2 = fl.ac(jsonReader, ror);
                    break;
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        sf2 = com.bytedance.adsdk.lottie.ac.cJ.Sf.LINEAR;
                    } else {
                        sf2 = com.bytedance.adsdk.lottie.ac.cJ.Sf.RADIAL;
                    }
                    sf3 = sf2;
                    break;
                case 6:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 7:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (flVar2 == null) {
            flVar = new com.bytedance.adsdk.lottie.ac.Qhi.fl(Collections.singletonList(new com.bytedance.adsdk.lottie.ROR.Qhi(100)));
        } else {
            flVar = flVar2;
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.Tgh(str, sf3, fillType2, acVar, flVar, ror2, ror3, null, null, z10);
    }
}

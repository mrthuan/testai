package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.ac.cJ.tP;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collections;
import lib.zj.pdfeditor.Annotation;

/* compiled from: GradientStrokeParser.java */
/* loaded from: classes.dex */
class kYc {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.adsdk.lottie.ac.cJ.ROR Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        char c;
        tP.Qhi qhi;
        tP.cJ cJVar;
        com.bytedance.adsdk.lottie.ac.cJ.Sf sf2;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str = null;
        com.bytedance.adsdk.lottie.ac.cJ.Sf sf3 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ac acVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ROR ror2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.ROR ror3 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2 = null;
        tP.Qhi qhi2 = null;
        tP.cJ cJVar3 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar4 = null;
        boolean z10 = false;
        com.bytedance.adsdk.lottie.ac.Qhi.fl flVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            boolean z11 = z10;
            com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar5 = cJVar4;
            float f11 = f10;
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 101:
                    if (nextName.equals(Annotation.KEY_E)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals(OperatorName.NON_STROKING_GRAY)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
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
                case 119:
                    if (nextName.equals(OperatorName.SET_LINE_WIDTH)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 11;
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
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar6 = null;
                        while (jsonReader.hasNext()) {
                            tP.cJ cJVar7 = cJVar3;
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            tP.Qhi qhi3 = qhi2;
                            if (!nextName2.equals("n")) {
                                if (!nextName2.equals(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)) {
                                    jsonReader.skipValue();
                                } else {
                                    cJVar6 = fl.Qhi(jsonReader, ror);
                                }
                            } else {
                                str2 = jsonReader.nextString();
                            }
                            cJVar3 = cJVar7;
                            qhi2 = qhi3;
                        }
                        tP.Qhi qhi4 = qhi2;
                        tP.cJ cJVar8 = cJVar3;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            cJVar5 = cJVar6;
                            cJVar3 = cJVar8;
                            qhi2 = qhi4;
                        } else {
                            if (str2.equals("d") || str2.equals(OperatorName.NON_STROKING_GRAY)) {
                                ror.Qhi(true);
                                arrayList.add(cJVar6);
                            }
                            cJVar3 = cJVar8;
                            qhi2 = qhi4;
                        }
                    }
                    qhi = qhi2;
                    cJVar = cJVar3;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        z10 = z11;
                        cJVar4 = cJVar5;
                        cJVar3 = cJVar;
                        f10 = f11;
                        qhi2 = qhi;
                        break;
                    } else {
                        cJVar4 = cJVar5;
                        z10 = z11;
                        cJVar3 = cJVar;
                        f10 = f11;
                        qhi2 = qhi;
                    }
                    break;
                case 1:
                    ror3 = fl.ac(jsonReader, ror);
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int i10 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals(OperatorName.NON_STROKING_CMYK)) {
                            if (!nextName3.equals("p")) {
                                jsonReader.skipValue();
                            } else {
                                i10 = jsonReader.nextInt();
                            }
                        } else {
                            acVar = fl.Qhi(jsonReader, ror, i10);
                        }
                    }
                    jsonReader.endObject();
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case 3:
                    flVar = fl.cJ(jsonReader, ror);
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case 4:
                    ror2 = fl.ac(jsonReader, ror);
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        sf2 = com.bytedance.adsdk.lottie.ac.cJ.Sf.LINEAR;
                    } else {
                        sf2 = com.bytedance.adsdk.lottie.ac.cJ.Sf.RADIAL;
                    }
                    sf3 = sf2;
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case 6:
                    cJVar2 = fl.Qhi(jsonReader, ror);
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case 7:
                    z10 = jsonReader.nextBoolean();
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case '\b':
                    qhi2 = tP.Qhi.values()[jsonReader.nextInt() - 1];
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case '\t':
                    cJVar3 = tP.cJ.values()[jsonReader.nextInt() - 1];
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                case '\n':
                    f10 = (float) jsonReader.nextDouble();
                    z10 = z11;
                    cJVar4 = cJVar5;
                    break;
                case 11:
                    str = jsonReader.nextString();
                    z10 = z11;
                    cJVar4 = cJVar5;
                    f10 = f11;
                    break;
                default:
                    jsonReader.skipValue();
                    qhi = qhi2;
                    cJVar = cJVar3;
                    cJVar4 = cJVar5;
                    z10 = z11;
                    cJVar3 = cJVar;
                    f10 = f11;
                    qhi2 = qhi;
                    break;
            }
        }
        tP.Qhi qhi5 = qhi2;
        tP.cJ cJVar9 = cJVar3;
        float f12 = f10;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar10 = cJVar4;
        boolean z12 = z10;
        if (flVar == null) {
            flVar = new com.bytedance.adsdk.lottie.ac.Qhi.fl(Collections.singletonList(new com.bytedance.adsdk.lottie.ROR.Qhi(100)));
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.ROR(str, sf3, acVar, flVar, ror2, ror3, cJVar2, qhi5, cJVar9, f12, arrayList, cJVar10, z12);
    }
}

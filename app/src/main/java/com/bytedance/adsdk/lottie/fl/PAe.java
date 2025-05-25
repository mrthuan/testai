package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.ac.cJ.tP;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ShapeStrokeParser.java */
/* loaded from: classes.dex */
class PAe {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.adsdk.lottie.ac.cJ.tP Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        char c;
        char c10;
        int i10;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2 = null;
        tP.Qhi qhi2 = null;
        tP.cJ cJVar3 = null;
        boolean z10 = false;
        com.bytedance.adsdk.lottie.ac.Qhi.fl flVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i11 = 1;
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 100:
                    if (nextName.equals("d")) {
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
                case 119:
                    if (nextName.equals(OperatorName.SET_LINE_WIDTH)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = '\b';
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
                    qhi = fl.ROR(jsonReader, ror);
                    continue;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar4 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (!nextName2.equals("n")) {
                                if (!nextName2.equals(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)) {
                                    jsonReader.skipValue();
                                } else {
                                    cJVar4 = fl.Qhi(jsonReader, ror);
                                }
                            } else {
                                str2 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 103:
                                if (str2.equals(OperatorName.NON_STROKING_GRAY)) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                i10 = 1;
                                ror.Qhi(true);
                                arrayList.add(cJVar4);
                                i11 = i10;
                                break;
                            case 2:
                                cJVar = cJVar4;
                                i11 = 1;
                                break;
                            default:
                                i10 = 1;
                                i11 = i10;
                                break;
                        }
                    }
                    int i12 = i11;
                    jsonReader.endArray();
                    if (arrayList.size() != i12) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        continue;
                    }
                case 2:
                    flVar = fl.cJ(jsonReader, ror);
                    continue;
                case 3:
                    cJVar2 = fl.Qhi(jsonReader, ror);
                    continue;
                case 4:
                    z10 = jsonReader.nextBoolean();
                    continue;
                case 5:
                    qhi2 = tP.Qhi.values()[jsonReader.nextInt() - 1];
                    continue;
                case 6:
                    cJVar3 = tP.cJ.values()[jsonReader.nextInt() - 1];
                    continue;
                case 7:
                    f10 = (float) jsonReader.nextDouble();
                    continue;
                case '\b':
                    str = jsonReader.nextString();
                    continue;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (flVar == null) {
            flVar = new com.bytedance.adsdk.lottie.ac.Qhi.fl(Collections.singletonList(new com.bytedance.adsdk.lottie.ROR.Qhi(100)));
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.tP(str, cJVar, arrayList, qhi, flVar, cJVar2, qhi2, cJVar3, f10, z10);
    }
}

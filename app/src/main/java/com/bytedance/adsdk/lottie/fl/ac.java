package com.bytedance.adsdk.lottie.fl;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* compiled from: AnimatableTransformParser.java */
/* loaded from: classes.dex */
public class ac {
    public static com.bytedance.adsdk.lottie.ac.Qhi.ABk Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z10) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.Tgh tgh = null;
        com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk = null;
        com.bytedance.adsdk.lottie.ac.Qhi.Sf sf2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar3 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.fl flVar = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar4 = null;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 97:
                    if (nextName.equals("a")) {
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
                case 112:
                    if (nextName.equals("p")) {
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
                case 115:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3242:
                    if (nextName.equals("eo")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3656:
                    if (nextName.equals("rz")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3662:
                    if (nextName.equals("sa")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3672:
                    if (nextName.equals("sk")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3676:
                    if (nextName.equals("so")) {
                        c = '\t';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals(OperatorName.NON_STROKING_CMYK)) {
                            jsonReader.skipValue();
                        } else {
                            tgh = Qhi.Qhi(jsonReader, ror);
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case 1:
                    flVar = fl.cJ(jsonReader, ror);
                    continue;
                case 2:
                    imk = Qhi.cJ(jsonReader, ror);
                    continue;
                case 3:
                    break;
                case 4:
                    sf2 = fl.CJ(jsonReader, ror);
                    continue;
                case 5:
                    cJVar5 = fl.Qhi(jsonReader, ror, false);
                    continue;
                case 6:
                    ror.Qhi("Lottie doesn't support 3D layers.");
                    break;
                case 7:
                    cJVar3 = fl.Qhi(jsonReader, ror, false);
                    continue;
                case '\b':
                    cJVar2 = fl.Qhi(jsonReader, ror, false);
                    continue;
                case '\t':
                    cJVar4 = fl.Qhi(jsonReader, ror, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            com.bytedance.adsdk.lottie.ac.Qhi.cJ Qhi = fl.Qhi(jsonReader, ror, false);
            if (Qhi.ac().isEmpty()) {
                Qhi.ac().add(new com.bytedance.adsdk.lottie.ROR.Qhi(ror, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(ror.ROR())));
            } else if (((com.bytedance.adsdk.lottie.ROR.Qhi) Qhi.ac().get(0)).Qhi == 0) {
                Qhi.ac().set(0, new com.bytedance.adsdk.lottie.ROR.Qhi(ror, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(ror.ROR())));
            }
            cJVar = Qhi;
        }
        if (z10) {
            jsonReader.endObject();
        }
        if (Qhi(tgh)) {
            tgh = null;
        }
        return new com.bytedance.adsdk.lottie.ac.Qhi.ABk(tgh, Qhi(imk) ? null : imk, Qhi(sf2) ? null : sf2, Qhi(cJVar) ? null : cJVar, flVar, cJVar4, cJVar5, cJ(cJVar2) ? null : cJVar2, ac(cJVar3) ? null : cJVar3);
    }

    private static boolean ac(com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar) {
        if (cJVar != null) {
            if (!cJVar.cJ() || ((Float) ((com.bytedance.adsdk.lottie.ROR.Qhi) cJVar.ac().get(0)).Qhi).floatValue() != 0.0f) {
                return false;
            }
            return true;
        }
        return true;
    }

    private static boolean cJ(com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar) {
        if (cJVar != null) {
            if (!cJVar.cJ() || ((Float) ((com.bytedance.adsdk.lottie.ROR.Qhi) cJVar.ac().get(0)).Qhi).floatValue() != 0.0f) {
                return false;
            }
            return true;
        }
        return true;
    }

    private static boolean Qhi(com.bytedance.adsdk.lottie.ac.Qhi.Tgh tgh) {
        if (tgh != null) {
            return tgh.cJ() && tgh.ac().get(0).Qhi.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean Qhi(com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk) {
        if (imk != null) {
            return !(imk instanceof com.bytedance.adsdk.lottie.ac.Qhi.WAv) && imk.cJ() && imk.ac().get(0).Qhi.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean Qhi(com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar) {
        if (cJVar != null) {
            return cJVar.cJ() && ((Float) ((com.bytedance.adsdk.lottie.ROR.Qhi) cJVar.ac().get(0)).Qhi).floatValue() == 0.0f;
        }
        return true;
    }

    private static boolean Qhi(com.bytedance.adsdk.lottie.ac.Qhi.Sf sf2) {
        if (sf2 != null) {
            return sf2.cJ() && ((com.bytedance.adsdk.lottie.ROR.ac) ((com.bytedance.adsdk.lottie.ROR.Qhi) sf2.ac().get(0)).Qhi).cJ(1.0f, 1.0f);
        }
        return true;
    }
}

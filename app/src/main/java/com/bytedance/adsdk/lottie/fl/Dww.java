package com.bytedance.adsdk.lottie.fl;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.lottie.ac.ac.fl;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LottieCompositionParser.java */
/* loaded from: classes.dex */
public class Dww {
    public static com.bytedance.adsdk.lottie.ROR Qhi(JsonReader jsonReader) {
        float f10;
        char c;
        HashMap hashMap;
        ArrayList arrayList;
        float Qhi = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi();
        LongSparseArray<com.bytedance.adsdk.lottie.ac.ac.fl> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArray<com.bytedance.adsdk.lottie.ac.fl> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.lottie.ROR ror = new com.bytedance.adsdk.lottie.ROR();
        jsonReader.beginObject();
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1408207997:
                    f10 = f13;
                    if (nextName.equals("assets")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    f10 = f13;
                    if (nextName.equals("layers")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 104:
                    f10 = f13;
                    if (nextName.equals("h")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 118:
                    f10 = f13;
                    if (nextName.equals(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)) {
                        c = 3;
                        c10 = c;
                        break;
                    }
                    break;
                case 119:
                    f10 = f13;
                    if (nextName.equals(OperatorName.SET_LINE_WIDTH)) {
                        c = 4;
                        c10 = c;
                        break;
                    }
                    break;
                case 3276:
                    f10 = f13;
                    if (nextName.equals("fr")) {
                        c = 5;
                        c10 = c;
                        break;
                    }
                    break;
                case 3367:
                    f10 = f13;
                    if (nextName.equals("ip")) {
                        c = 6;
                        c10 = c;
                        break;
                    }
                    break;
                case 3553:
                    f10 = f13;
                    if (nextName.equals("op")) {
                        c = 7;
                        c10 = c;
                        break;
                    }
                    break;
                case 94623709:
                    f10 = f13;
                    if (nextName.equals("chars")) {
                        c = '\b';
                        c10 = c;
                        break;
                    }
                    break;
                case 97615364:
                    f10 = f13;
                    if (nextName.equals("fonts")) {
                        c = '\t';
                        c10 = c;
                        break;
                    }
                    break;
                case 839250809:
                    f10 = f13;
                    if (nextName.equals("markers")) {
                        c = '\n';
                        c10 = c;
                        break;
                    }
                    break;
                default:
                    f10 = f13;
                    break;
            }
            switch (c10) {
                case 0:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    Qhi(jsonReader, ror, hashMap2, hashMap3);
                    f13 = f10;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                case 1:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    Qhi(jsonReader, ror, arrayList2, longSparseArray);
                    f13 = f10;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                case 2:
                    i11 = jsonReader.nextInt();
                    f13 = f10;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        ror.Qhi("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f13 = f10;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                case 4:
                    i10 = jsonReader.nextInt();
                    f13 = f10;
                case 5:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f13 = (float) jsonReader.nextDouble();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                case 6:
                    f11 = (float) jsonReader.nextDouble();
                    f13 = f10;
                case 7:
                    f12 = ((float) jsonReader.nextDouble()) - 0.01f;
                    f13 = f10;
                case '\b':
                    Qhi(jsonReader, ror, sparseArray);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f13 = f10;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                case '\t':
                    Qhi(jsonReader, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f13 = f10;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                case '\n':
                    Qhi(jsonReader, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f13 = f10;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                default:
                    jsonReader.skipValue();
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f13 = f10;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
            }
        }
        jsonReader.endObject();
        ror.Qhi(new Rect(0, 0, (int) (i10 * Qhi), (int) (i11 * Qhi)), f11, f12, f13, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArray, hashMap4, arrayList3);
        return ror;
    }

    private static void Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror, List<com.bytedance.adsdk.lottie.ac.ac.fl> list, LongSparseArray<com.bytedance.adsdk.lottie.ac.ac.fl> longSparseArray) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lottie.ac.ac.fl Qhi = bxS.Qhi(jsonReader, ror);
            Qhi.Gm();
            fl.Qhi qhi = fl.Qhi.PRE_COMP;
            list.add(Qhi);
            longSparseArray.put(Qhi.fl(), Qhi);
        }
        jsonReader.endArray();
    }

    private static void Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror, Map<String, List<com.bytedance.adsdk.lottie.ac.ac.fl>> map, Map<String, com.bytedance.adsdk.lottie.WAv> map2) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                char c = 65535;
                switch (nextName.hashCode()) {
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 104:
                        if (nextName.equals("h")) {
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
                    case 117:
                        if (nextName.equals("u")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 119:
                        if (nextName.equals(OperatorName.SET_LINE_WIDTH)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3355:
                        if (nextName.equals(FacebookMediationAdapter.KEY_ID)) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.lottie.ac.ac.fl Qhi = bxS.Qhi(jsonReader, ror);
                            longSparseArray.put(Qhi.fl(), Qhi);
                            arrayList.add(Qhi);
                        }
                        jsonReader.endArray();
                        break;
                    case 1:
                        i11 = jsonReader.nextInt();
                        break;
                    case 2:
                        str2 = jsonReader.nextString();
                        break;
                    case 3:
                        str3 = jsonReader.nextString();
                        break;
                    case 4:
                        i10 = jsonReader.nextInt();
                        break;
                    case 5:
                        str = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                com.bytedance.adsdk.lottie.WAv wAv = new com.bytedance.adsdk.lottie.WAv(i10, i11, str, str2, str3);
                map2.put(wAv.ac(), wAv);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void Qhi(JsonReader jsonReader, Map<String, com.bytedance.adsdk.lottie.ac.ac> map) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lottie.ac.ac Qhi = pA.Qhi(jsonReader);
                    map.put(Qhi.cJ(), Qhi);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror, SparseArray<com.bytedance.adsdk.lottie.ac.fl> sparseArray) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lottie.ac.fl Qhi = iMK.Qhi(jsonReader, ror);
            sparseArray.put(Qhi.hashCode(), Qhi);
        }
        jsonReader.endArray();
    }

    private static void Qhi(JsonReader jsonReader, List<com.bytedance.adsdk.lottie.ac.ROR> list) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f10 = 0.0f;
            String str = null;
            float f11 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                char c = 65535;
                switch (nextName.hashCode()) {
                    case 3178:
                        if (nextName.equals(OperatorName.CONCAT)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3214:
                        if (nextName.equals("dr")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3705:
                        if (nextName.equals("tm")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str = jsonReader.nextString();
                        break;
                    case 1:
                        f11 = (float) jsonReader.nextDouble();
                        break;
                    case 2:
                        f10 = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.lottie.ac.ROR(str, f10, f11));
        }
        jsonReader.endArray();
    }
}

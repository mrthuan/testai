package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import android.util.JsonToken;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
class EBS {
    public static <T> List<com.bytedance.adsdk.lottie.ROR.Qhi<T>> Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror, float f10, xyz<T> xyzVar, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            ror.Qhi("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals(OperatorName.NON_STROKING_CMYK)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(qMt.Qhi(jsonReader, ror, f10, xyzVar, false, z10));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(qMt.Qhi(jsonReader, ror, f10, xyzVar, true, z10));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(qMt.Qhi(jsonReader, ror, f10, xyzVar, false, z10));
            }
        }
        jsonReader.endObject();
        Qhi(arrayList);
        return arrayList;
    }

    public static <T> void Qhi(List<? extends com.bytedance.adsdk.lottie.ROR.Qhi<T>> list) {
        int i10;
        T t4;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi = list.get(i11);
            i11++;
            com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi2 = list.get(i11);
            qhi.ROR = Float.valueOf(qhi2.Tgh);
            if (qhi.cJ == null && (t4 = qhi2.Qhi) != null) {
                qhi.cJ = t4;
                if (qhi instanceof com.bytedance.adsdk.lottie.Qhi.cJ.WAv) {
                    ((com.bytedance.adsdk.lottie.Qhi.cJ.WAv) qhi).Qhi();
                }
            }
        }
        com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi3 = list.get(i10);
        if ((qhi3.Qhi == null || qhi3.cJ == null) && list.size() > 1) {
            list.remove(qhi3);
        }
    }
}

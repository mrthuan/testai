package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeGroupParser.java */
/* loaded from: classes.dex */
public class yN {
    public static com.bytedance.adsdk.lottie.ac.cJ.HzH Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3371:
                    if (nextName.equals("it")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.lottie.ac.cJ.ac Qhi = hm.Qhi(jsonReader, ror);
                        if (Qhi != null) {
                            arrayList.add(Qhi);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.HzH(str, arrayList, z10);
    }
}

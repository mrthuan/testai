package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontCharacterParser.java */
/* loaded from: classes.dex */
public class iMK {
    public static com.bytedance.adsdk.lottie.ac.fl Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double d10 = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d11 = 0.0d;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1866931350:
                    if (nextName.equals("fFamily")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals(OperatorName.SET_LINE_WIDTH)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3173:
                    if (nextName.equals("ch")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3076010:
                    if (nextName.equals("data")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 109780401:
                    if (nextName.equals("style")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    d10 = jsonReader.nextDouble();
                    break;
                case 2:
                    c = jsonReader.nextString().charAt(0);
                    break;
                case 3:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("shapes".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add((com.bytedance.adsdk.lottie.ac.cJ.HzH) hm.Qhi(jsonReader, ror));
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 4:
                    d11 = jsonReader.nextDouble();
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
        return new com.bytedance.adsdk.lottie.ac.fl(arrayList, c, d11, d10, str, str2);
    }
}

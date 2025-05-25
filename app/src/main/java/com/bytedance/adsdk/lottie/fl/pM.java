package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.ac.cJ.WAv;

/* compiled from: MergePathsParser.java */
/* loaded from: classes.dex */
class pM {
    public static com.bytedance.adsdk.lottie.ac.cJ.WAv Qhi(JsonReader jsonReader) {
        String str = null;
        WAv.Qhi qhi = null;
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
                case 3488:
                    if (nextName.equals("mm")) {
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
                    qhi = WAv.Qhi.Qhi(jsonReader.nextInt());
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.ac.cJ.WAv(str, qhi, z10);
    }
}

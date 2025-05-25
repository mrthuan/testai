package com.bytedance.adsdk.lottie.fl;

import android.util.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* compiled from: DropShadowEffectParser.java */
/* loaded from: classes.dex */
public class zc {
    private com.bytedance.adsdk.lottie.ac.Qhi.cJ CJ;
    private com.bytedance.adsdk.lottie.ac.Qhi.Qhi Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.adsdk.lottie.ac.Qhi.cJ f7856ac;
    private com.bytedance.adsdk.lottie.ac.Qhi.cJ cJ;

    /* renamed from: fl  reason: collision with root package name */
    private com.bytedance.adsdk.lottie.ac.Qhi.cJ f7857fl;

    private void cJ(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT)) {
                if (!nextName.equals("nm")) {
                    jsonReader.skipValue();
                } else {
                    str = jsonReader.nextString();
                }
            } else {
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case 353103893:
                        if (str.equals("Distance")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 397447147:
                        if (str.equals("Opacity")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1041377119:
                        if (str.equals("Direction")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1379387491:
                        if (str.equals("Shadow Color")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1383710113:
                        if (str.equals("Softness")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.CJ = fl.Qhi(jsonReader, ror);
                        continue;
                    case 1:
                        this.cJ = fl.Qhi(jsonReader, ror, false);
                        continue;
                    case 2:
                        this.f7856ac = fl.Qhi(jsonReader, ror, false);
                        continue;
                    case 3:
                        this.Qhi = fl.ROR(jsonReader, ror);
                        continue;
                    case 4:
                        this.f7857fl = fl.Qhi(jsonReader, ror);
                        continue;
                    default:
                        jsonReader.skipValue();
                        continue;
                }
            }
        }
        jsonReader.endObject();
    }

    public Gm Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror) {
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar3;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar4;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    cJ(jsonReader, ror);
                }
                jsonReader.endArray();
            }
        }
        com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi = this.Qhi;
        if (qhi != null && (cJVar = this.cJ) != null && (cJVar2 = this.f7856ac) != null && (cJVar3 = this.CJ) != null && (cJVar4 = this.f7857fl) != null) {
            return new Gm(qhi, cJVar, cJVar2, cJVar3, cJVar4);
        }
        return null;
    }
}

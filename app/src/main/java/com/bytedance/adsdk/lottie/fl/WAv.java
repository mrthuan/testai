package com.bytedance.adsdk.lottie.fl;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.ac.cJ;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes.dex */
public class WAv implements xyz<com.bytedance.adsdk.lottie.ac.cJ> {
    public static final WAv Qhi = new WAv();

    private WAv() {
    }

    @Override // com.bytedance.adsdk.lottie.fl.xyz
    /* renamed from: Qhi */
    public com.bytedance.adsdk.lottie.ac.cJ cJ(JsonReader jsonReader, float f10) {
        cJ.Qhi qhi = cJ.Qhi.CENTER;
        jsonReader.beginObject();
        cJ.Qhi qhi2 = qhi;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 102:
                    if (nextName.equals("f")) {
                        c = 0;
                        break;
                    }
                    break;
                case 106:
                    if (nextName.equals(OperatorName.SET_LINE_JOINSTYLE)) {
                        c = 1;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 2;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3452:
                    if (nextName.equals("lh")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3463:
                    if (nextName.equals("ls")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3543:
                    if (nextName.equals("of")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3587:
                    if (nextName.equals("ps")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals(OperatorName.NON_STROKING_COLOR)) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 3687:
                    if (nextName.equals("sz")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    int nextInt = jsonReader.nextInt();
                    qhi2 = cJ.Qhi.CENTER;
                    if (nextInt <= qhi2.ordinal() && nextInt >= 0) {
                        qhi2 = cJ.Qhi.values()[nextInt];
                        break;
                    }
                    break;
                case 2:
                    f11 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    i11 = MQ.Qhi(jsonReader);
                    break;
                case 5:
                    f12 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f13 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    z10 = jsonReader.nextBoolean();
                    break;
                case '\b':
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case '\t':
                    i12 = MQ.Qhi(jsonReader);
                    break;
                case '\n':
                    f14 = (float) jsonReader.nextDouble();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case '\f':
                    i10 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.ac.cJ(str, str2, f11, qhi2, i10, f12, f13, i11, i12, f14, z10, pointF, pointF2);
    }
}

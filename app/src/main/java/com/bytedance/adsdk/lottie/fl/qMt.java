package com.bytedance.adsdk.lottie.fl;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.WeakReference;
import lib.zj.pdfeditor.Annotation;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
class qMt {
    private static final Interpolator Qhi = new LinearInterpolator();
    private static SparseArray<WeakReference<Interpolator>> cJ;

    private static SparseArray<WeakReference<Interpolator>> Qhi() {
        if (cJ == null) {
            cJ = new SparseArray<>();
        }
        return cJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0262 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> com.bytedance.adsdk.lottie.ROR.Qhi<T> cJ(com.bytedance.adsdk.lottie.ROR r23, android.util.JsonReader r24, float r25, com.bytedance.adsdk.lottie.fl.xyz<T> r26) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.fl.qMt.cJ(com.bytedance.adsdk.lottie.ROR, android.util.JsonReader, float, com.bytedance.adsdk.lottie.fl.xyz):com.bytedance.adsdk.lottie.ROR.Qhi");
    }

    private static WeakReference<Interpolator> Qhi(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (qMt.class) {
            weakReference = Qhi().get(i10);
        }
        return weakReference;
    }

    private static void Qhi(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (qMt.class) {
            cJ.put(i10, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.lottie.ROR.Qhi<T> Qhi(JsonReader jsonReader, com.bytedance.adsdk.lottie.ROR ror, float f10, xyz<T> xyzVar, boolean z10, boolean z11) {
        if (z10 && z11) {
            return cJ(ror, jsonReader, f10, xyzVar);
        }
        if (z10) {
            return Qhi(ror, jsonReader, f10, xyzVar);
        }
        return Qhi(jsonReader, f10, xyzVar);
    }

    private static <T> com.bytedance.adsdk.lottie.ROR.Qhi<T> Qhi(com.bytedance.adsdk.lottie.ROR ror, JsonReader jsonReader, float f10, xyz<T> xyzVar) {
        Interpolator Qhi2;
        jsonReader.beginObject();
        PointF pointF = null;
        T t4 = null;
        T t10 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f11 = 0.0f;
        boolean z10 = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals(Annotation.KEY_E)) {
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
                case 105:
                    if (nextName.equals(OperatorName.SET_FLATNESS)) {
                        c = 2;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
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
                case 116:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3701:
                    if (nextName.equals("ti")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3707:
                    if (nextName.equals("to")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    t4 = xyzVar.cJ(jsonReader, f10);
                    break;
                case 1:
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 2:
                    pointF4 = MQ.cJ(jsonReader, 1.0f);
                    break;
                case 3:
                    pointF = MQ.cJ(jsonReader, 1.0f);
                    break;
                case 4:
                    t10 = xyzVar.cJ(jsonReader, f10);
                    break;
                case 5:
                    f11 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    pointF3 = MQ.cJ(jsonReader, f10);
                    break;
                case 7:
                    pointF2 = MQ.cJ(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z10) {
            t4 = t10;
        } else if (pointF != null && pointF4 != null) {
            Qhi2 = Qhi(pointF, pointF4);
            com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi = new com.bytedance.adsdk.lottie.ROR.Qhi<>(ror, t10, t4, Qhi2, f11, null);
            qhi.Sf = pointF2;
            qhi.f7759hm = pointF3;
            return qhi;
        }
        Qhi2 = Qhi;
        com.bytedance.adsdk.lottie.ROR.Qhi<T> qhi2 = new com.bytedance.adsdk.lottie.ROR.Qhi<>(ror, t10, t4, Qhi2, f11, null);
        qhi2.Sf = pointF2;
        qhi2.f7759hm = pointF3;
        return qhi2;
    }

    private static Interpolator Qhi(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.lottie.Tgh.Tgh.cJ(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.lottie.Tgh.Tgh.cJ(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.lottie.Tgh.Tgh.cJ(pointF2.x, -1.0f, 1.0f);
        float cJ2 = com.bytedance.adsdk.lottie.Tgh.Tgh.cJ(pointF2.y, -100.0f, 100.0f);
        pointF2.y = cJ2;
        int Qhi2 = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(pointF.x, pointF.y, pointF2.x, cJ2);
        WeakReference<Interpolator> Qhi3 = com.bytedance.adsdk.lottie.Tgh.Qhi() ? null : Qhi(Qhi2);
        Interpolator interpolator = Qhi3 != null ? Qhi3.get() : null;
        if (Qhi3 == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.lottie.HzH.Qhi(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e10) {
                if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.lottie.HzH.Qhi(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.lottie.Tgh.Qhi()) {
                try {
                    Qhi(Qhi2, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.lottie.ROR.Qhi<T> Qhi(JsonReader jsonReader, float f10, xyz<T> xyzVar) {
        return new com.bytedance.adsdk.lottie.ROR.Qhi<>(xyzVar.cJ(jsonReader, f10));
    }
}

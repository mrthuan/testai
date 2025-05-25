package com.bytedance.adsdk.lottie.fl;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
class MQ {

    /* compiled from: JsonUtils.java */
    /* renamed from: com.bytedance.adsdk.lottie.fl.MQ$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[JsonToken.values().length];
            Qhi = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Qhi[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF CJ(JsonReader jsonReader, float f10) {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f10, nextDouble2 * f10);
    }

    @ColorInt
    public static int Qhi(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, nextDouble, nextDouble2, nextDouble3);
    }

    private static PointF ac(JsonReader jsonReader, float f10) {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f10, nextDouble2 * f10);
    }

    public static PointF cJ(JsonReader jsonReader, float f10) {
        int i10 = AnonymousClass1.Qhi[jsonReader.peek().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return fl(jsonReader, f10);
                }
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
            }
            return CJ(jsonReader, f10);
        }
        return ac(jsonReader, f10);
    }

    private static PointF fl(JsonReader jsonReader, float f10) {
        jsonReader.beginObject();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("x")) {
                if (!nextName.equals(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT)) {
                    jsonReader.skipValue();
                } else {
                    f12 = cJ(jsonReader);
                }
            } else {
                f11 = cJ(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f11 * f10, f12 * f10);
    }

    public static float cJ(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        int i10 = AnonymousClass1.Qhi[peek.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                jsonReader.beginArray();
                float nextDouble = (float) jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
                return nextDouble;
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(peek)));
        }
        return (float) jsonReader.nextDouble();
    }

    public static List<PointF> Qhi(JsonReader jsonReader, float f10) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(cJ(jsonReader, f10));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}

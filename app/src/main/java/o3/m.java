package o3;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f22717a = JsonReader.a.a("x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);

    /* compiled from: JsonUtils.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22718a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f22718a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22718a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22718a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static int a(JsonReader jsonReader) {
        jsonReader.a();
        int j10 = (int) (jsonReader.j() * 255.0d);
        int j11 = (int) (jsonReader.j() * 255.0d);
        int j12 = (int) (jsonReader.j() * 255.0d);
        while (jsonReader.h()) {
            jsonReader.q();
        }
        jsonReader.c();
        return Color.argb((int) FunctionEval.FunctionID.EXTERNAL_FUNC, j10, j11, j12);
    }

    public static PointF b(JsonReader jsonReader, float f10) {
        int i10 = a.f22718a[jsonReader.m().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    jsonReader.b();
                    float f11 = 0.0f;
                    float f12 = 0.0f;
                    while (jsonReader.h()) {
                        int o10 = jsonReader.o(f22717a);
                        if (o10 != 0) {
                            if (o10 != 1) {
                                jsonReader.p();
                                jsonReader.q();
                            } else {
                                f12 = d(jsonReader);
                            }
                        } else {
                            f11 = d(jsonReader);
                        }
                    }
                    jsonReader.d();
                    return new PointF(f11 * f10, f12 * f10);
                }
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.m());
            }
            jsonReader.a();
            float j10 = (float) jsonReader.j();
            float j11 = (float) jsonReader.j();
            while (jsonReader.m() != JsonReader.Token.END_ARRAY) {
                jsonReader.q();
            }
            jsonReader.c();
            return new PointF(j10 * f10, j11 * f10);
        }
        float j12 = (float) jsonReader.j();
        float j13 = (float) jsonReader.j();
        while (jsonReader.h()) {
            jsonReader.q();
        }
        return new PointF(j12 * f10, j13 * f10);
    }

    public static ArrayList c(JsonReader jsonReader, float f10) {
        ArrayList arrayList = new ArrayList();
        jsonReader.a();
        while (jsonReader.m() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.a();
            arrayList.add(b(jsonReader, f10));
            jsonReader.c();
        }
        jsonReader.c();
        return arrayList;
    }

    public static float d(JsonReader jsonReader) {
        JsonReader.Token m10 = jsonReader.m();
        int i10 = a.f22718a[m10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                jsonReader.a();
                float j10 = (float) jsonReader.j();
                while (jsonReader.h()) {
                    jsonReader.q();
                }
                jsonReader.c();
                return j10;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + m10);
        }
        return (float) jsonReader.j();
    }
}

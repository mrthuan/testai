package o3;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public final class s implements d0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final s f22729a = new s();

    @Override // o3.d0
    public final PointF g(JsonReader jsonReader, float f10) {
        JsonReader.Token m10 = jsonReader.m();
        if (m10 == JsonReader.Token.BEGIN_ARRAY) {
            return m.b(jsonReader, f10);
        }
        if (m10 == JsonReader.Token.BEGIN_OBJECT) {
            return m.b(jsonReader, f10);
        }
        if (m10 == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.j()) * f10, ((float) jsonReader.j()) * f10);
            while (jsonReader.h()) {
                jsonReader.q();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + m10);
    }
}

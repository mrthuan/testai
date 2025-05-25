package o3;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: ColorParser.java */
/* loaded from: classes.dex */
public final class e implements d0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f22705a = new e();

    @Override // o3.d0
    public final Integer g(JsonReader jsonReader, float f10) {
        boolean z10;
        double d10;
        if (jsonReader.m() == JsonReader.Token.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jsonReader.a();
        }
        double j10 = jsonReader.j();
        double j11 = jsonReader.j();
        double j12 = jsonReader.j();
        if (jsonReader.m() == JsonReader.Token.NUMBER) {
            d10 = jsonReader.j();
        } else {
            d10 = 1.0d;
        }
        if (z10) {
            jsonReader.c();
        }
        if (j10 <= 1.0d && j11 <= 1.0d && j12 <= 1.0d) {
            j10 *= 255.0d;
            j11 *= 255.0d;
            j12 *= 255.0d;
            if (d10 <= 1.0d) {
                d10 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d10, (int) j10, (int) j11, (int) j12));
    }
}

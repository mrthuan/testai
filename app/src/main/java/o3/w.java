package o3;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes.dex */
public final class w implements d0<q3.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final w f22733a = new w();

    @Override // o3.d0
    public final q3.c g(JsonReader jsonReader, float f10) {
        boolean z10;
        if (jsonReader.m() == JsonReader.Token.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jsonReader.a();
        }
        float j10 = (float) jsonReader.j();
        float j11 = (float) jsonReader.j();
        while (jsonReader.h()) {
            jsonReader.q();
        }
        if (z10) {
            jsonReader.c();
        }
        return new q3.c((j10 / 100.0f) * f10, (j11 / 100.0f) * f10);
    }
}

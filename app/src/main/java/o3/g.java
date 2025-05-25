package o3;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes.dex */
public final class g implements d0<DocumentData> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f22707a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final JsonReader.a f22708b = JsonReader.a.a("t", "f", "s", OperatorName.SET_LINE_JOINSTYLE, "tr", "lh", "ls", "fc", OperatorName.NON_STROKING_COLOR, "sw", "of");

    @Override // o3.d0
    public final DocumentData g(JsonReader jsonReader, float f10) {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.b();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (jsonReader.h()) {
            switch (jsonReader.o(f22708b)) {
                case 0:
                    str = jsonReader.l();
                    break;
                case 1:
                    str2 = jsonReader.l();
                    break;
                case 2:
                    f11 = (float) jsonReader.j();
                    break;
                case 3:
                    int k10 = jsonReader.k();
                    justification2 = DocumentData.Justification.CENTER;
                    if (k10 <= justification2.ordinal() && k10 >= 0) {
                        justification2 = DocumentData.Justification.values()[k10];
                        break;
                    }
                    break;
                case 4:
                    i10 = jsonReader.k();
                    break;
                case 5:
                    f12 = (float) jsonReader.j();
                    break;
                case 6:
                    f13 = (float) jsonReader.j();
                    break;
                case 7:
                    i11 = m.a(jsonReader);
                    break;
                case 8:
                    i12 = m.a(jsonReader);
                    break;
                case 9:
                    f14 = (float) jsonReader.j();
                    break;
                case 10:
                    z10 = jsonReader.i();
                    break;
                default:
                    jsonReader.p();
                    jsonReader.q();
                    break;
            }
        }
        jsonReader.d();
        return new DocumentData(str, str2, f11, justification2, i10, f12, f13, i11, i12, f14, z10);
    }
}

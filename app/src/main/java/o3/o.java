package o3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f22721a = JsonReader.a.a(OperatorName.NON_STROKING_CMYK);

    public static ArrayList a(float f10, e3.e eVar, d0 d0Var, JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.m() == JsonReader.Token.STRING) {
            eVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.b();
        while (jsonReader.h()) {
            if (jsonReader.o(f22721a) != 0) {
                jsonReader.q();
            } else if (jsonReader.m() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.a();
                if (jsonReader.m() == JsonReader.Token.NUMBER) {
                    arrayList.add(n.a(jsonReader, eVar, f10, d0Var, false));
                } else {
                    while (jsonReader.h()) {
                        arrayList.add(n.a(jsonReader, eVar, f10, d0Var, true));
                    }
                }
                jsonReader.c();
            } else {
                arrayList.add(n.a(jsonReader, eVar, f10, d0Var, false));
            }
        }
        jsonReader.d();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        T t4;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            q3.a aVar = (q3.a) arrayList.get(i11);
            i11++;
            q3.a aVar2 = (q3.a) arrayList.get(i11);
            aVar.f29068f = Float.valueOf(aVar2.f29067e);
            if (aVar.c == 0 && (t4 = aVar2.f29065b) != 0) {
                aVar.c = t4;
                if (aVar instanceof h3.h) {
                    ((h3.h) aVar).d();
                }
            }
        }
        q3.a aVar3 = (q3.a) arrayList.get(i10);
        if ((aVar3.f29065b == 0 || aVar3.c == 0) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}

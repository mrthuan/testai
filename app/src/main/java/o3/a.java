package o3;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f22695a = JsonReader.a.a(OperatorName.NON_STROKING_CMYK, "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);

    public static k3.e a(com.airbnb.lottie.parser.moshi.a aVar, e3.e eVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (aVar.m() == JsonReader.Token.BEGIN_ARRAY) {
            aVar.a();
            while (aVar.h()) {
                if (aVar.m() == JsonReader.Token.BEGIN_OBJECT) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new h3.h(eVar, n.a(aVar, eVar, p3.g.c(), b.b.f5173f, z10)));
            }
            aVar.c();
            o.b(arrayList);
        } else {
            arrayList.add(new q3.a(m.b(aVar, p3.g.c())));
        }
        return new k3.e(arrayList);
    }

    public static k3.l b(com.airbnb.lottie.parser.moshi.a aVar, e3.e eVar) {
        aVar.b();
        k3.e eVar2 = null;
        k3.b bVar = null;
        boolean z10 = false;
        k3.b bVar2 = null;
        while (aVar.m() != JsonReader.Token.END_OBJECT) {
            int o10 = aVar.o(f22695a);
            if (o10 != 0) {
                if (o10 != 1) {
                    if (o10 != 2) {
                        aVar.p();
                        aVar.q();
                    } else if (aVar.m() == JsonReader.Token.STRING) {
                        aVar.q();
                        z10 = true;
                    } else {
                        bVar = androidx.activity.s.p0(aVar, eVar, true);
                    }
                } else if (aVar.m() == JsonReader.Token.STRING) {
                    aVar.q();
                    z10 = true;
                } else {
                    bVar2 = androidx.activity.s.p0(aVar, eVar, true);
                }
            } else {
                eVar2 = a(aVar, eVar);
            }
        }
        aVar.d();
        if (z10) {
            eVar.a("Lottie doesn't support expressions.");
        }
        if (eVar2 != null) {
            return eVar2;
        }
        return new k3.i(bVar2, bVar);
    }
}

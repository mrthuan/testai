package o3;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ShapeDataParser.java */
/* loaded from: classes.dex */
public final class x implements d0<l3.g> {

    /* renamed from: a  reason: collision with root package name */
    public static final x f22734a = new x();

    /* renamed from: b  reason: collision with root package name */
    public static final JsonReader.a f22735b = JsonReader.a.a("c", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.SET_FLATNESS, "o");

    @Override // o3.d0
    public final l3.g g(JsonReader jsonReader, float f10) {
        if (jsonReader.m() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.a();
        }
        jsonReader.b();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z10 = false;
        while (jsonReader.h()) {
            int o10 = jsonReader.o(f22735b);
            if (o10 != 0) {
                if (o10 != 1) {
                    if (o10 != 2) {
                        if (o10 != 3) {
                            jsonReader.p();
                            jsonReader.q();
                        } else {
                            arrayList3 = m.c(jsonReader, f10);
                        }
                    } else {
                        arrayList2 = m.c(jsonReader, f10);
                    }
                } else {
                    arrayList = m.c(jsonReader, f10);
                }
            } else {
                z10 = jsonReader.i();
            }
        }
        jsonReader.d();
        if (jsonReader.m() == JsonReader.Token.END_ARRAY) {
            jsonReader.c();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new l3.g(new PointF(), false, Collections.emptyList());
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = (PointF) arrayList.get(i10);
                int i11 = i10 - 1;
                arrayList4.add(new j3.a(p3.f.a((PointF) arrayList.get(i11), (PointF) arrayList3.get(i11)), p3.f.a(pointF2, (PointF) arrayList2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i12 = size - 1;
                arrayList4.add(new j3.a(p3.f.a((PointF) arrayList.get(i12), (PointF) arrayList3.get(i12)), p3.f.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new l3.g(pointF, z10, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}

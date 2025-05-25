package o3;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f22725a = JsonReader.a.a(OperatorName.SET_LINE_WIDTH, "h", "ip", "op", "fr", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    public static final JsonReader.a f22726b = JsonReader.a.a(FacebookMediationAdapter.KEY_ID, "layers", OperatorName.SET_LINE_WIDTH, "h", "p", "u");
    public static final JsonReader.a c = JsonReader.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    public static final JsonReader.a f22727d = JsonReader.a.a(OperatorName.CONCAT, "tm", "dr");

    public static e3.e a(com.airbnb.lottie.parser.moshi.a aVar) {
        float f10;
        HashMap hashMap;
        ArrayList arrayList;
        y.j<j3.c> jVar;
        int i10;
        y.f<Layer> fVar;
        float f11;
        float f12;
        boolean z10;
        int i11;
        float f13;
        y.f<Layer> fVar2;
        float f14;
        float f15;
        float f16;
        HashMap hashMap2;
        ArrayList arrayList2;
        y.j<j3.c> jVar2;
        float f17;
        float f18;
        y.f<Layer> fVar3;
        float c10 = p3.g.c();
        y.f<Layer> fVar4 = new y.f<>();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        y.j<j3.c> jVar3 = new y.j<>();
        e3.e eVar = new e3.e();
        aVar.b();
        int i12 = 0;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        int i13 = 0;
        while (aVar.h()) {
            float f22 = f19;
            switch (aVar.o(f22725a)) {
                case 0:
                    f16 = c10;
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    jVar2 = jVar3;
                    f17 = f20;
                    f18 = f21;
                    fVar3 = fVar4;
                    i13 = aVar.k();
                    fVar4 = fVar3;
                    f19 = f22;
                    c10 = f16;
                    f20 = f17;
                    arrayList4 = arrayList2;
                    f21 = f18;
                    hashMap5 = hashMap2;
                    jVar3 = jVar2;
                case 1:
                    f16 = c10;
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    jVar2 = jVar3;
                    f17 = f20;
                    f18 = f21;
                    fVar3 = fVar4;
                    i12 = aVar.k();
                    fVar4 = fVar3;
                    f19 = f22;
                    c10 = f16;
                    f20 = f17;
                    arrayList4 = arrayList2;
                    f21 = f18;
                    hashMap5 = hashMap2;
                    jVar3 = jVar2;
                case 2:
                    f10 = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f20 = (float) aVar.j();
                    f19 = f22;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                case 3:
                    f10 = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f21 = ((float) aVar.j()) - 0.01f;
                    f19 = f22;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                case 4:
                    f10 = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f19 = (float) aVar.j();
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                case 5:
                    f10 = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    f11 = f20;
                    f12 = f21;
                    fVar = fVar4;
                    String[] split = aVar.l().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || parseInt3 >= 0)))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        eVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f19 = f22;
                    f20 = f11;
                    f21 = f12;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                case 6:
                    f10 = c10;
                    y.f<Layer> fVar5 = fVar4;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    f11 = f20;
                    f12 = f21;
                    aVar.a();
                    int i14 = 0;
                    while (aVar.h()) {
                        Layer a10 = p.a(aVar, eVar);
                        if (a10.f6104e == Layer.LayerType.IMAGE) {
                            i14++;
                        }
                        arrayList3.add(a10);
                        y.f<Layer> fVar6 = fVar5;
                        fVar6.h(a10.f6103d, a10);
                        if (i14 > 4) {
                            p3.c.b("You have " + i14 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        fVar5 = fVar6;
                    }
                    fVar = fVar5;
                    aVar.c();
                    f19 = f22;
                    f20 = f11;
                    f21 = f12;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                case 7:
                    arrayList = arrayList4;
                    f11 = f20;
                    f12 = f21;
                    aVar.a();
                    while (aVar.h()) {
                        ArrayList arrayList5 = new ArrayList();
                        y.f fVar7 = new y.f();
                        aVar.b();
                        HashMap hashMap6 = hashMap5;
                        String str = null;
                        String str2 = null;
                        int i15 = 0;
                        int i16 = 0;
                        while (aVar.h()) {
                            y.j<j3.c> jVar4 = jVar3;
                            int o10 = aVar.o(f22726b);
                            if (o10 != 0) {
                                i11 = i12;
                                if (o10 != 1) {
                                    if (o10 != 2) {
                                        if (o10 != 3) {
                                            if (o10 != 4) {
                                                if (o10 != 5) {
                                                    aVar.p();
                                                    aVar.q();
                                                    f13 = c10;
                                                    fVar2 = fVar4;
                                                } else {
                                                    aVar.l();
                                                }
                                            } else {
                                                str2 = aVar.l();
                                            }
                                        } else {
                                            i16 = aVar.k();
                                        }
                                    } else {
                                        i15 = aVar.k();
                                    }
                                } else {
                                    aVar.a();
                                    while (aVar.h()) {
                                        Layer a11 = p.a(aVar, eVar);
                                        fVar7.h(a11.f6103d, a11);
                                        arrayList5.add(a11);
                                        c10 = c10;
                                        fVar4 = fVar4;
                                    }
                                    f13 = c10;
                                    fVar2 = fVar4;
                                    aVar.c();
                                }
                                c10 = f13;
                                jVar3 = jVar4;
                                i12 = i11;
                                fVar4 = fVar2;
                            } else {
                                i11 = i12;
                                str = aVar.l();
                            }
                            jVar3 = jVar4;
                            i12 = i11;
                        }
                        float f23 = c10;
                        y.f<Layer> fVar8 = fVar4;
                        y.j<j3.c> jVar5 = jVar3;
                        int i17 = i12;
                        aVar.d();
                        if (str2 != null) {
                            hashMap4.put(str, new e3.l(i15, i16, str, str2));
                        } else {
                            hashMap3.put(str, arrayList5);
                        }
                        c10 = f23;
                        hashMap5 = hashMap6;
                        jVar3 = jVar5;
                        i12 = i17;
                        fVar4 = fVar8;
                    }
                    f10 = c10;
                    hashMap = hashMap5;
                    jVar = jVar3;
                    i10 = i12;
                    aVar.c();
                    fVar = fVar4;
                    f19 = f22;
                    f20 = f11;
                    f21 = f12;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                case 8:
                    f11 = f20;
                    f12 = f21;
                    aVar.b();
                    while (aVar.h()) {
                        if (aVar.o(c) != 0) {
                            aVar.p();
                            aVar.q();
                        } else {
                            aVar.a();
                            while (aVar.h()) {
                                JsonReader.a aVar2 = i.f22711a;
                                aVar.b();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                while (aVar.h()) {
                                    int o11 = aVar.o(i.f22711a);
                                    if (o11 != 0) {
                                        ArrayList arrayList6 = arrayList4;
                                        if (o11 != 1) {
                                            if (o11 != 2) {
                                                if (o11 != 3) {
                                                    aVar.p();
                                                    aVar.q();
                                                } else {
                                                    aVar.j();
                                                }
                                            } else {
                                                str5 = aVar.l();
                                            }
                                        } else {
                                            str4 = aVar.l();
                                        }
                                        arrayList4 = arrayList6;
                                    } else {
                                        str3 = aVar.l();
                                    }
                                }
                                aVar.d();
                                hashMap5.put(str4, new j3.b(str3, str4, str5));
                                arrayList4 = arrayList4;
                            }
                            aVar.c();
                        }
                    }
                    arrayList = arrayList4;
                    aVar.d();
                    f10 = c10;
                    hashMap = hashMap5;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f19 = f22;
                    f20 = f11;
                    f21 = f12;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                case 9:
                    f11 = f20;
                    f12 = f21;
                    aVar.a();
                    while (aVar.h()) {
                        JsonReader.a aVar3 = h.f22709a;
                        ArrayList arrayList7 = new ArrayList();
                        aVar.b();
                        double d10 = 0.0d;
                        String str6 = null;
                        String str7 = null;
                        char c11 = 0;
                        while (aVar.h()) {
                            int o12 = aVar.o(h.f22709a);
                            if (o12 != 0) {
                                if (o12 != 1) {
                                    if (o12 != 2) {
                                        if (o12 != 3) {
                                            if (o12 != 4) {
                                                if (o12 != 5) {
                                                    aVar.p();
                                                    aVar.q();
                                                } else {
                                                    aVar.b();
                                                    while (aVar.h()) {
                                                        if (aVar.o(h.f22710b) != 0) {
                                                            aVar.p();
                                                            aVar.q();
                                                        } else {
                                                            aVar.a();
                                                            while (aVar.h()) {
                                                                arrayList7.add((l3.i) f.a(aVar, eVar));
                                                            }
                                                            aVar.c();
                                                        }
                                                    }
                                                    aVar.d();
                                                }
                                            } else {
                                                str7 = aVar.l();
                                            }
                                        } else {
                                            str6 = aVar.l();
                                        }
                                    } else {
                                        d10 = aVar.j();
                                    }
                                } else {
                                    aVar.j();
                                }
                            } else {
                                c11 = aVar.l().charAt(0);
                            }
                        }
                        aVar.d();
                        j3.c cVar = new j3.c(arrayList7, c11, d10, str6, str7);
                        jVar3.e(cVar.hashCode(), cVar);
                    }
                    aVar.c();
                    f10 = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f19 = f22;
                    f20 = f11;
                    f21 = f12;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                case 10:
                    aVar.a();
                    while (aVar.h()) {
                        aVar.b();
                        String str8 = null;
                        float f24 = 0.0f;
                        float f25 = 0.0f;
                        while (aVar.h()) {
                            int o13 = aVar.o(f22727d);
                            if (o13 != 0) {
                                f14 = f21;
                                if (o13 != 1) {
                                    if (o13 != 2) {
                                        aVar.p();
                                        aVar.q();
                                    } else {
                                        f15 = f20;
                                        f25 = (float) aVar.j();
                                    }
                                } else {
                                    f15 = f20;
                                    f24 = (float) aVar.j();
                                }
                                f20 = f15;
                            } else {
                                f14 = f21;
                                str8 = aVar.l();
                            }
                            f21 = f14;
                        }
                        aVar.d();
                        arrayList4.add(new j3.g(str8, f24, f25));
                        f20 = f20;
                        f21 = f21;
                    }
                    f11 = f20;
                    f12 = f21;
                    aVar.c();
                    f10 = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    fVar = fVar4;
                    f19 = f22;
                    f20 = f11;
                    f21 = f12;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
                default:
                    f10 = c10;
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    jVar = jVar3;
                    i10 = i12;
                    f11 = f20;
                    f12 = f21;
                    fVar = fVar4;
                    aVar.p();
                    aVar.q();
                    f19 = f22;
                    f20 = f11;
                    f21 = f12;
                    fVar4 = fVar;
                    c10 = f10;
                    arrayList4 = arrayList;
                    hashMap5 = hashMap;
                    jVar3 = jVar;
                    i12 = i10;
            }
        }
        float f26 = c10;
        eVar.f16349j = new Rect(0, 0, (int) (i13 * f26), (int) (i12 * f26));
        eVar.f16350k = f20;
        eVar.f16351l = f21;
        eVar.f16352m = f19;
        eVar.f16348i = arrayList3;
        eVar.f16347h = fVar4;
        eVar.c = hashMap3;
        eVar.f16343d = hashMap4;
        eVar.f16346g = jVar3;
        eVar.f16344e = hashMap5;
        eVar.f16345f = arrayList4;
        return eVar;
    }
}

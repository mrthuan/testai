package o3;

import android.graphics.Color;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* compiled from: LayerParser.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f22722a = JsonReader.a.a("nm", "ind", "refId", "ty", "parent", "sw", OperatorName.SHADING_FILL, OperatorName.NON_STROKING_COLOR, "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", OperatorName.SET_LINE_WIDTH, "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final JsonReader.a f22723b = JsonReader.a.a("d", "a");
    public static final JsonReader.a c = JsonReader.a.a("nm");

    /* compiled from: LayerParser.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22724a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f22724a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22724a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26 */
    public static Layer a(com.airbnb.lottie.parser.moshi.a aVar, e3.e eVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        long j10;
        com.airbnb.lottie.parser.moshi.a aVar2;
        char c10;
        long j11;
        char c11;
        String str3;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        aVar.b();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        boolean z10 = false;
        Layer.MatteType matteType2 = matteType;
        float f10 = 1.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        float f11 = 0.0f;
        float f12 = 0.0f;
        long j12 = -1;
        Layer.LayerType layerType = null;
        String str4 = null;
        k3.k kVar = null;
        k3.a aVar3 = null;
        k3.j jVar = null;
        k3.b bVar = null;
        String str5 = "UNSET";
        long j13 = 0;
        float f13 = 0.0f;
        String str6 = null;
        com.airbnb.lottie.parser.moshi.a aVar4 = aVar;
        while (aVar.h()) {
            int i15 = 1;
            switch (aVar4.o(f22722a)) {
                case 0:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    str5 = aVar.l();
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 1:
                    aVar2 = aVar;
                    str2 = str6;
                    j10 = aVar.k();
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 2:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    str4 = aVar.l();
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 3:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    int k10 = aVar.k();
                    Layer.LayerType layerType2 = Layer.LayerType.UNKNOWN;
                    if (k10 < layerType2.ordinal()) {
                        layerType = Layer.LayerType.values()[k10];
                    } else {
                        layerType = layerType2;
                    }
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 4:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    j12 = aVar.k();
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 5:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    i10 = (int) (p3.g.c() * aVar.k());
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 6:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    i11 = (int) (p3.g.c() * aVar.k());
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 7:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    i12 = Color.parseColor(aVar.l());
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 8:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    kVar = c.a(aVar, eVar);
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 9:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    int k11 = aVar.k();
                    if (k11 >= Layer.MatteType.values().length) {
                        eVar.a("Unsupported matte type: " + k11);
                    } else {
                        matteType2 = Layer.MatteType.values()[k11];
                        int i16 = a.f22724a[matteType2.ordinal()];
                        if (i16 != 1) {
                            if (i16 == 2) {
                                eVar.a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            eVar.a("Unsupported matte type: Luma");
                        }
                        eVar.f16354o++;
                    }
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 10:
                    str2 = str6;
                    Mask.MaskMode maskMode = null;
                    aVar.a();
                    while (aVar.h()) {
                        aVar.b();
                        Mask.MaskMode maskMode2 = maskMode;
                        Mask.MaskMode maskMode3 = maskMode2;
                        k3.d dVar = maskMode3;
                        boolean z12 = false;
                        k3.h hVar = maskMode3;
                        while (aVar.h()) {
                            String w7 = aVar.w();
                            w7.getClass();
                            switch (w7.hashCode()) {
                                case 111:
                                    if (w7.equals("o")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3588:
                                    if (w7.equals("pt")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 104433:
                                    if (w7.equals("inv")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3357091:
                                    if (w7.equals("mode")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    j11 = j13;
                                    dVar = androidx.activity.s.q0(aVar, eVar);
                                    break;
                                case 1:
                                    j11 = j13;
                                    hVar = new k3.h(o.a(p3.g.c(), eVar, x.f22734a, aVar));
                                    break;
                                case 2:
                                    z12 = aVar.i();
                                    j11 = j13;
                                    break;
                                case 3:
                                    String l10 = aVar.l();
                                    l10.getClass();
                                    switch (l10.hashCode()) {
                                        case 97:
                                            if (l10.equals("a")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 105:
                                            if (l10.equals(OperatorName.SET_FLATNESS)) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 110:
                                            if (l10.equals("n")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 115:
                                            if (l10.equals("s")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                            maskMode2 = Mask.MaskMode.MASK_MODE_ADD;
                                            break;
                                        case 1:
                                            eVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode2 = Mask.MaskMode.MASK_MODE_INTERSECT;
                                            break;
                                        case 2:
                                            maskMode2 = Mask.MaskMode.MASK_MODE_NONE;
                                            break;
                                        case 3:
                                            maskMode2 = Mask.MaskMode.MASK_MODE_SUBTRACT;
                                            break;
                                        default:
                                            p3.c.b("Unknown mask mode " + w7 + ". Defaulting to Add.");
                                            maskMode2 = Mask.MaskMode.MASK_MODE_ADD;
                                            break;
                                    }
                                    j11 = j13;
                                    break;
                                default:
                                    aVar.q();
                                    j11 = j13;
                                    break;
                            }
                            j13 = j11;
                            hVar = hVar;
                        }
                        aVar.d();
                        arrayList3.add(new Mask(maskMode2, hVar, dVar, z12));
                        j13 = j13;
                        maskMode = null;
                    }
                    j10 = j13;
                    aVar2 = aVar;
                    eVar.f16354o += arrayList3.size();
                    aVar.c();
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 11:
                    str2 = str6;
                    aVar.a();
                    while (aVar.h()) {
                        l3.b a10 = f.a(aVar, eVar);
                        if (a10 != null) {
                            arrayList4.add(a10);
                        }
                    }
                    aVar.c();
                    j10 = j13;
                    aVar2 = aVar;
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 12:
                    aVar.b();
                    while (aVar.h()) {
                        int o10 = aVar4.o(f22723b);
                        if (o10 != 0) {
                            if (o10 != i15) {
                                aVar.p();
                                aVar.q();
                            } else {
                                aVar.a();
                                if (aVar.h()) {
                                    JsonReader.a aVar5 = b.f22697a;
                                    aVar.b();
                                    k3.j jVar2 = null;
                                    while (aVar.h()) {
                                        if (aVar4.o(b.f22697a) != 0) {
                                            aVar.p();
                                            aVar.q();
                                        } else {
                                            aVar.b();
                                            k3.b bVar2 = null;
                                            k3.b bVar3 = null;
                                            k3.a aVar6 = null;
                                            k3.a aVar7 = null;
                                            while (aVar.h()) {
                                                int o11 = aVar4.o(b.f22698b);
                                                if (o11 != 0) {
                                                    if (o11 != i15) {
                                                        if (o11 != 2) {
                                                            if (o11 != 3) {
                                                                aVar.p();
                                                                aVar.q();
                                                            } else {
                                                                bVar3 = androidx.activity.s.p0(aVar4, eVar, true);
                                                            }
                                                        } else {
                                                            bVar2 = androidx.activity.s.p0(aVar4, eVar, true);
                                                        }
                                                    } else {
                                                        aVar7 = androidx.activity.s.o0(aVar, eVar);
                                                    }
                                                } else {
                                                    aVar6 = androidx.activity.s.o0(aVar, eVar);
                                                }
                                                i15 = 1;
                                            }
                                            aVar.d();
                                            jVar2 = new k3.j(aVar6, aVar7, bVar2, bVar3);
                                            str6 = str6;
                                            i15 = 1;
                                        }
                                    }
                                    str3 = str6;
                                    aVar.d();
                                    if (jVar2 == null) {
                                        jVar = new k3.j(null, null, null, null);
                                    } else {
                                        jVar = jVar2;
                                    }
                                } else {
                                    str3 = str6;
                                }
                                while (aVar.h()) {
                                    aVar.q();
                                }
                                aVar.c();
                            }
                        } else {
                            str3 = str6;
                            aVar3 = new k3.a(o.a(1.0f, eVar, g.f22707a, aVar4), 1);
                        }
                        str6 = str3;
                        i15 = 1;
                    }
                    aVar.d();
                    j10 = j13;
                    str6 = str6;
                    j13 = j10;
                    z10 = false;
                case 13:
                    aVar.a();
                    ArrayList arrayList5 = new ArrayList();
                    while (aVar.h()) {
                        aVar.b();
                        while (aVar.h()) {
                            if (aVar4.o(c) != 0) {
                                aVar.p();
                                aVar.q();
                            } else {
                                arrayList5.add(aVar.l());
                            }
                        }
                        aVar.d();
                    }
                    aVar.c();
                    eVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
                case 14:
                    f10 = (float) aVar.j();
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                case 15:
                    f12 = (float) aVar.j();
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                case 16:
                    i13 = (int) (p3.g.c() * aVar.k());
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                case 17:
                    i14 = (int) (p3.g.c() * aVar.k());
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                case 18:
                    f11 = (float) aVar.j();
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                case 19:
                    f13 = (float) aVar.j();
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                case 20:
                    bVar = androidx.activity.s.p0(aVar4, eVar, z10);
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                case 21:
                    str6 = aVar.l();
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                case 22:
                    z11 = aVar.i();
                    j10 = j13;
                    j13 = j10;
                    z10 = false;
                default:
                    str2 = str6;
                    j10 = j13;
                    aVar2 = aVar;
                    aVar.p();
                    aVar.q();
                    aVar4 = aVar2;
                    str6 = str2;
                    j13 = j10;
                    z10 = false;
            }
        }
        String str7 = str6;
        long j14 = j13;
        aVar.d();
        float f14 = f11 / f10;
        float f15 = f13 / f10;
        ArrayList arrayList6 = new ArrayList();
        if (f14 > 0.0f) {
            arrayList2 = arrayList3;
            str = str7;
            arrayList = arrayList4;
            arrayList6.add(new q3.a(eVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f14)));
        } else {
            arrayList = arrayList4;
            arrayList2 = arrayList3;
            str = str7;
        }
        if (f15 <= 0.0f) {
            f15 = eVar.f16351l;
        }
        arrayList6.add(new q3.a(eVar, valueOf, valueOf, null, f14, Float.valueOf(f15)));
        arrayList6.add(new q3.a(eVar, valueOf2, valueOf2, null, f15, Float.valueOf(Float.MAX_VALUE)));
        if (str5.endsWith(".ai") || "ai".equals(str)) {
            eVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList, eVar, str5, j14, layerType, j12, str4, arrayList2, kVar, i10, i11, i12, f10, f12, i13, i14, aVar3, jVar, arrayList6, matteType2, bVar, z11);
    }
}

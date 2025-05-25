package en;

import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;

/* compiled from: Pdf2ImageDataRepository.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final w<ArrayList<bn.a>> f16815a;

    /* renamed from: b  reason: collision with root package name */
    public static final w f16816b;
    public static final w<ArrayList<bn.a>> c;

    /* renamed from: d  reason: collision with root package name */
    public static final w f16817d;

    /* renamed from: e  reason: collision with root package name */
    public static final w<ArrayList<ImageFileInfo>> f16818e;

    /* renamed from: f  reason: collision with root package name */
    public static final w f16819f;

    /* renamed from: g  reason: collision with root package name */
    public static final w<Boolean> f16820g;

    /* renamed from: h  reason: collision with root package name */
    public static final w f16821h;

    /* compiled from: Pdf2ImageDataRepository.kt */
    /* renamed from: en.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0215a {
        public static void a() {
            a.c.j(new ArrayList<>());
            a.f16815a.j(new ArrayList<>());
            a.f16818e.j(new ArrayList<>());
            a.f16820g.j(null);
        }

        public static ArrayList b() {
            ArrayList<bn.a> d10 = a.c.d();
            if (d10 == null) {
                return new ArrayList();
            }
            return d10;
        }

        public static void c(List list) {
            if (list != null) {
                w<ArrayList<ImageFileInfo>> wVar = a.f16818e;
                ArrayList<ImageFileInfo> d10 = wVar.d();
                if (d10 == null) {
                    d10 = new ArrayList<>();
                }
                d10.clear();
                d10.addAll(list);
                wVar.j(d10);
            }
        }

        public static void d(bn.a aVar) {
            int i10;
            int i11 = aVar.f5493g;
            aVar.f5492f = false;
            ArrayList<bn.a> b10 = b();
            b10.remove(aVar);
            for (bn.a aVar2 : b10) {
                if (aVar2.f5492f && i11 != -1 && (i10 = aVar2.f5493g) > i11) {
                    aVar2.f5493g = i10 - 1;
                }
            }
            a.c.j(b10);
        }
    }

    static {
        w<ArrayList<bn.a>> wVar = new w<>();
        f16815a = wVar;
        f16816b = wVar;
        w<ArrayList<bn.a>> wVar2 = new w<>();
        c = wVar2;
        f16817d = wVar2;
        w<ArrayList<ImageFileInfo>> wVar3 = new w<>();
        f16818e = wVar3;
        f16819f = wVar3;
        w<Boolean> wVar4 = new w<>(null);
        f16820g = wVar4;
        f16821h = wVar4;
    }
}

package pdf.pdfreader.viewer.editor.free.repo.convert;

import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.j;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.v;
import tf.c;
import tf.d;
import vl.b;

/* compiled from: ImageConvertDataRepository.kt */
/* loaded from: classes3.dex */
public final class ImageConvertDataRepository implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public static b.a f26537b;

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList<ul.b> f26538d;

    /* renamed from: e  reason: collision with root package name */
    public static ArrayList<ul.b> f26539e;

    /* renamed from: f  reason: collision with root package name */
    public static ArrayList<ul.b> f26540f;

    /* renamed from: g  reason: collision with root package name */
    public static final w<List<ul.a>> f26541g;

    /* renamed from: h  reason: collision with root package name */
    public static final w f26542h;

    /* renamed from: i  reason: collision with root package name */
    public static final w<ul.a> f26543i;

    /* renamed from: j  reason: collision with root package name */
    public static final w f26544j;

    /* renamed from: k  reason: collision with root package name */
    public static final w<ArrayList<ul.b>> f26545k;

    /* renamed from: l  reason: collision with root package name */
    public static final w f26546l;

    /* renamed from: m  reason: collision with root package name */
    public static final w<String> f26547m;

    /* renamed from: n  reason: collision with root package name */
    public static final w f26548n;

    /* renamed from: o  reason: collision with root package name */
    public static final w<ArrayList<ul.b>> f26549o;

    /* renamed from: p  reason: collision with root package name */
    public static final w f26550p;

    /* renamed from: q  reason: collision with root package name */
    public static final w<ArrayList<ul.b>> f26551q;

    /* renamed from: r  reason: collision with root package name */
    public static final w f26552r;

    /* renamed from: a  reason: collision with root package name */
    public static final ImageConvertDataRepository f26536a = new ImageConvertDataRepository();
    public static final c c = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository$operateResult$2
        @Override // cg.a
        public final List<PdfPreviewEntity> invoke() {
            return new ArrayList();
        }
    });

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t4, T t10) {
            return com.google.android.play.core.assetpacks.c.o(Integer.valueOf(((ul.b) t4).f30408f), Integer.valueOf(((ul.b) t10).f30408f));
        }
    }

    static {
        w<List<ul.a>> wVar = new w<>();
        f26541g = wVar;
        f26542h = wVar;
        w<ul.a> wVar2 = new w<>();
        f26543i = wVar2;
        f26544j = wVar2;
        w<ArrayList<ul.b>> wVar3 = new w<>();
        f26545k = wVar3;
        f26546l = wVar3;
        w<String> wVar4 = new w<>();
        f26547m = wVar4;
        f26548n = wVar4;
        w<ArrayList<ul.b>> wVar5 = new w<>();
        f26549o = wVar5;
        f26550p = wVar5;
        w<ArrayList<ul.b>> wVar6 = new w<>();
        f26551q = wVar6;
        f26552r = wVar6;
    }

    public static boolean d() {
        return e(50);
    }

    public static boolean e(int i10) {
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = (ArrayList) f26550p.d();
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        ArrayList arrayList2 = (ArrayList) f26546l.d();
        if (arrayList2 != null) {
            i12 = arrayList2.size();
        } else {
            i12 = 0;
        }
        int i14 = i11 + i12;
        ArrayList arrayList3 = (ArrayList) f26552r.d();
        if (arrayList3 != null) {
            i13 = arrayList3.size();
        } else {
            i13 = 0;
        }
        if (i14 + i13 < i10) {
            return false;
        }
        return true;
    }

    public static void f() {
        f26543i.j(null);
        f26547m.j(null);
        f26541g.j(null);
        f26545k.j(null);
        f26549o.j(null);
        f26551q.j(null);
        ((List) c.getValue()).clear();
    }

    public static void g() {
        w<ArrayList<ul.b>> wVar = f26545k;
        ArrayList<ul.b> d10 = wVar.d();
        if (d10 != null) {
            for (ul.b bVar : d10) {
                bVar.b(false);
            }
        }
        wVar.j(null);
    }

    public static ArrayList h() {
        ArrayList<ul.b> d10 = f26545k.d();
        if (d10 == null) {
            return new ArrayList();
        }
        return d10;
    }

    public static void i(ul.b bVar) {
        ArrayList<ul.b> h10 = h();
        bVar.b(true);
        bVar.c(h10.size() + 1);
        h10.add(bVar);
        f26545k.j(h10);
    }

    public static void j(ul.a aVar) {
        List<ul.a> d10 = f26541g.d();
        if (d10 != null) {
            for (ul.a aVar2 : d10) {
                if (g.a(aVar.f30401a, aVar2.f30401a)) {
                    f26543i.j(aVar2);
                    f26547m.j(aVar2.f30401a);
                }
            }
        }
    }

    public static void k() {
        w<ArrayList<ul.b>> wVar = f26545k;
        ArrayList<ul.b> d10 = wVar.d();
        if (d10 != null) {
            for (ul.b bVar : d10) {
                bVar.b(false);
            }
        }
        wVar.j(new ArrayList<>());
    }

    public static void l(ul.b bVar) {
        int i10;
        int i11 = bVar.f30408f;
        bVar.b(false);
        ArrayList<ul.b> h10 = h();
        h10.remove(bVar);
        for (ul.b bVar2 : h10) {
            if (bVar2.f30407e && i11 != -1 && (i10 = bVar2.f30408f) > i11) {
                bVar2.c(i10 - 1);
            }
        }
        f26545k.j(h10);
    }

    public static void m() {
        f26547m.j(v.h());
        w<List<ul.a>> wVar = f26541g;
        ul.a aVar = new ul.a(v.h());
        f26543i.j(aVar);
        wVar.j(ge.a.H(aVar));
    }

    public static void n() {
        w<ArrayList<ul.b>> wVar = f26549o;
        ArrayList<ul.b> d10 = wVar.d();
        if (d10 != null) {
            if (d10.size() > 1) {
                j.j0(d10, new a());
            }
        } else {
            d10 = null;
        }
        wVar.j(d10);
    }

    @Override // vl.b.a
    public final void a(TreeMap<String, List<ul.b>> treeMap) {
        d dVar;
        if (treeMap != null) {
            if (!treeMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry<String, List<ul.b>> entry : treeMap.entrySet()) {
                    ul.a aVar = new ul.a(entry.getKey());
                    aVar.f30402b = (ArrayList) entry.getValue();
                    arrayList.add(aVar);
                }
                arrayList2.addAll(arrayList);
                f26543i.j(m.s0(arrayList2));
                f26547m.j(v.h());
                f26541g.j(arrayList2);
            } else {
                f26536a.getClass();
                m();
            }
            dVar = d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            m();
        }
        b.a aVar2 = f26537b;
        if (aVar2 != null) {
            aVar2.a(treeMap);
        }
    }

    @Override // vl.b.a
    public final void b(int i10) {
        b.a aVar = f26537b;
        if (aVar != null) {
            aVar.b(i10);
        }
    }

    @Override // vl.b.a
    public final void c() {
        f();
        ArrayList<ul.b> arrayList = f26538d;
        if (arrayList != null && (!arrayList.isEmpty())) {
            w<ArrayList<ul.b>> wVar = f26549o;
            ArrayList<ul.b> d10 = wVar.d();
            if (d10 == null) {
                d10 = new ArrayList<>();
            }
            d10.addAll(arrayList);
            wVar.j(d10);
            arrayList.clear();
        }
        ArrayList<ul.b> arrayList2 = f26539e;
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            w<ArrayList<ul.b>> wVar2 = f26551q;
            ArrayList<ul.b> d11 = wVar2.d();
            if (d11 == null) {
                d11 = new ArrayList<>();
            }
            d11.addAll(arrayList2);
            wVar2.j(d11);
            arrayList2.clear();
        }
        b.a aVar = f26537b;
        if (aVar != null) {
            aVar.c();
        }
    }
}

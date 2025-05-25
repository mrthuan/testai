package en;

import androidx.lifecycle.j0;
import androidx.lifecycle.w;
import en.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;

/* compiled from: Pdf2ImageViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final w f16822d = a.f16817d;

    public static int d() {
        ArrayList arrayList = (ArrayList) a.f16817d.d();
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void e(ArrayList arrayList) {
        w<ArrayList<bn.a>> wVar = a.f16815a;
        ArrayList<bn.a> b10 = a.C0215a.b();
        int size = b10.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bn.a aVar = (bn.a) it.next();
            aVar.f5492f = true;
            size++;
            aVar.f5493g = size;
            b10.add(aVar);
        }
        a.c.j(b10);
    }

    public final void f(List<bn.a> images) {
        g.e(images, "images");
        w<ArrayList<bn.a>> wVar = a.f16815a;
        ArrayList<bn.a> b10 = a.C0215a.b();
        int size = b10.size();
        for (bn.a aVar : images) {
            if (!aVar.f5492f) {
                aVar.f5492f = true;
                size++;
                aVar.f5493g = size;
                b10.add(aVar);
            }
        }
        a.c.j(b10);
    }

    public final void g() {
        w<ArrayList<bn.a>> wVar = a.f16815a;
        ArrayList<bn.a> d10 = a.c.d();
        if (d10 != null) {
            for (bn.a aVar : d10) {
                aVar.f5492f = false;
            }
        }
        a.c.j(new ArrayList<>());
    }
}

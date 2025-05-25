package an;

import an.a;
import androidx.lifecycle.j0;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g;

/* compiled from: PdfPageManagerViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final w f1705d = a.c;

    public final void d(bn.a aVar) {
        if (aVar != null) {
            w<ArrayList<bn.a>> wVar = a.f1699a;
            ArrayList<bn.a> a10 = a.C0003a.a();
            aVar.f5492f = true;
            aVar.f5493g = a10.size() + 1;
            a10.add(aVar);
            a.f1700b.j(a10);
        }
    }

    public final void e(ArrayList arrayList) {
        w<ArrayList<bn.a>> wVar = a.f1699a;
        ArrayList<bn.a> a10 = a.C0003a.a();
        int size = a10.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bn.a aVar = (bn.a) it.next();
            aVar.f5492f = true;
            size++;
            aVar.f5493g = size;
            a10.add(aVar);
        }
        a.f1700b.j(a10);
    }

    public final void f() {
        w<ArrayList<bn.a>> wVar = a.f1699a;
        ArrayList<bn.a> d10 = a.f1700b.d();
        if (d10 != null) {
            for (bn.a aVar : d10) {
                aVar.f5492f = false;
            }
        }
        a.f1700b.j(new ArrayList<>());
    }

    public final void g(bn.a image) {
        int i10;
        g.e(image, "image");
        w<ArrayList<bn.a>> wVar = a.f1699a;
        int i11 = image.f5493g;
        image.f5492f = false;
        ArrayList<bn.a> a10 = a.C0003a.a();
        a10.remove(image);
        for (bn.a aVar : a10) {
            if (aVar.f5492f && i11 != -1 && (i10 = aVar.f5493g) > i11) {
                aVar.f5493g = i10 - 1;
            }
        }
        a.f1700b.j(a10);
    }
}

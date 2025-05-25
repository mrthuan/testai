package vk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import qk.r;

/* compiled from: HtmlRenderer.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f30834a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f30835b;

    /* compiled from: HtmlRenderer.java */
    /* loaded from: classes3.dex */
    public class a implements e {
        @Override // vk.e
        public final vk.c a(d dVar) {
            return new vk.c(dVar);
        }
    }

    /* compiled from: HtmlRenderer.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f30836a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f30837b = new ArrayList();
    }

    /* compiled from: HtmlRenderer.java */
    /* loaded from: classes3.dex */
    public class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final g f30838a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f30839b;
        public final androidx.core.content.e c = new androidx.core.content.e(14);

        public c(g gVar) {
            this.f30838a = gVar;
            this.f30839b = new ArrayList(f.this.f30834a.size());
            Iterator it = f.this.f30834a.iterator();
            while (it.hasNext()) {
                this.f30839b.add(((vk.b) it.next()).a());
            }
            ArrayList arrayList = f.this.f30835b;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    vk.c a10 = ((e) arrayList.get(size)).a(this);
                    androidx.core.content.e eVar = this.c;
                    eVar.getClass();
                    Iterator it2 = a10.L().iterator();
                    while (it2.hasNext()) {
                        ((Map) eVar.f3529a).put((Class) it2.next(), a10);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public f(b bVar) {
        bVar.getClass();
        this.f30834a = new ArrayList(bVar.f30836a);
        ArrayList arrayList = bVar.f30837b;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        this.f30835b = arrayList2;
        arrayList2.addAll(arrayList);
        arrayList2.add(new a());
    }

    public final String a(r rVar) {
        if (rVar != null) {
            StringBuilder sb2 = new StringBuilder();
            new c(new g(sb2)).c.k(rVar);
            return sb2.toString();
        }
        throw new NullPointerException("node must not be null");
    }
}

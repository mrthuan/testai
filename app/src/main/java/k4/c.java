package k4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import t3.f;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f19578a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f19579b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    /* loaded from: classes.dex */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f19580a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f19581b;
        public final f<T, R> c;

        public a(Class<T> cls, Class<R> cls2, f<T, R> fVar) {
            this.f19580a = cls;
            this.f19581b = cls2;
            this.c = fVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f19578a.contains(str)) {
            this.f19578a.add(str);
        }
        list = (List) this.f19579b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f19579b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z10;
        arrayList = new ArrayList();
        Iterator it = this.f19578a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f19579b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.f19580a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f19581b)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !arrayList.contains(aVar.f19581b)) {
                        arrayList.add(aVar.f19581b);
                    }
                }
            }
        }
        return arrayList;
    }
}

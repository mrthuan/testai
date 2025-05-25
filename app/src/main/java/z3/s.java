package z3;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q4.a;
import z3.o;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e  reason: collision with root package name */
    public static final c f32271e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final a f32272f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f32273a;

    /* renamed from: b  reason: collision with root package name */
    public final c f32274b;
    public final HashSet c;

    /* renamed from: d  reason: collision with root package name */
    public final w0.d<List<Throwable>> f32275d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class a implements o<Object, Object> {
        @Override // z3.o
        public final boolean a(Object obj) {
            return false;
        }

        @Override // z3.o
        public final o.a<Object> b(Object obj, int i10, int i11, t3.e eVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f32276a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f32277b;
        public final p<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f32276a = cls;
            this.f32277b = cls2;
            this.c = pVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    public s(a.c cVar) {
        c cVar2 = f32271e;
        this.f32273a = new ArrayList();
        this.c = new HashSet();
        this.f32275d = cVar;
        this.f32274b = cVar2;
    }

    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        b bVar = new b(cls, cls2, pVar);
        ArrayList arrayList = this.f32273a;
        arrayList.add(arrayList.size(), bVar);
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f32273a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.c.contains(bVar) && bVar.f32276a.isAssignableFrom(cls)) {
                    this.c.add(bVar);
                    o b10 = bVar.c.b(this);
                    com.google.android.play.core.assetpacks.c.l(b10);
                    arrayList.add(b10);
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.c.clear();
            throw th2;
        }
        return arrayList;
    }

    public final synchronized <Model, Data> o<Model, Data> c(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f32273a.iterator();
            boolean z10 = false;
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                b<?, ?> bVar = (b) it.next();
                if (this.c.contains(bVar)) {
                    z10 = true;
                } else {
                    if (!bVar.f32276a.isAssignableFrom(cls) || !bVar.f32277b.isAssignableFrom(cls2)) {
                        z11 = false;
                    }
                    if (z11) {
                        this.c.add(bVar);
                        arrayList.add(d(bVar));
                        this.c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f32274b;
                w0.d<List<Throwable>> dVar = this.f32275d;
                cVar.getClass();
                return new r(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            } else if (z10) {
                return f32272f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.c.clear();
            throw th2;
        }
    }

    public final <Model, Data> o<Model, Data> d(b<?, ?> bVar) {
        o<Model, Data> oVar = (o<Model, Data>) bVar.c.b(this);
        com.google.android.play.core.assetpacks.c.l(oVar);
        return oVar;
    }

    public final synchronized ArrayList e(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f32273a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f32277b) && bVar.f32276a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f32277b);
            }
        }
        return arrayList;
    }
}

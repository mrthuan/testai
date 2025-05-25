package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v3.j;
import z3.o;

/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
public final class d<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6945a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6946b = new ArrayList();
    public com.bumptech.glide.d c;

    /* renamed from: d  reason: collision with root package name */
    public Object f6947d;

    /* renamed from: e  reason: collision with root package name */
    public int f6948e;

    /* renamed from: f  reason: collision with root package name */
    public int f6949f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f6950g;

    /* renamed from: h  reason: collision with root package name */
    public DecodeJob.e f6951h;

    /* renamed from: i  reason: collision with root package name */
    public t3.e f6952i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, t3.h<?>> f6953j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f6954k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6955l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6956m;

    /* renamed from: n  reason: collision with root package name */
    public t3.b f6957n;

    /* renamed from: o  reason: collision with root package name */
    public Priority f6958o;

    /* renamed from: p  reason: collision with root package name */
    public v3.f f6959p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6960q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6961r;

    public final ArrayList a() {
        boolean z10 = this.f6956m;
        ArrayList arrayList = this.f6946b;
        if (!z10) {
            this.f6956m = true;
            arrayList.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a aVar = (o.a) b10.get(i10);
                if (!arrayList.contains(aVar.f32257a)) {
                    arrayList.add(aVar.f32257a);
                }
                int i11 = 0;
                while (true) {
                    List<t3.b> list = aVar.f32258b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f6955l;
        ArrayList arrayList = this.f6945a;
        if (!z10) {
            this.f6955l = true;
            arrayList.clear();
            List g10 = this.c.f6842b.g(this.f6947d);
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a b10 = ((o) g10.get(i10)).b(this.f6947d, this.f6948e, this.f6949f, this.f6952i);
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data> j<Data, ?, Transcode> c(Class<Data> cls) {
        j<Data, ?, Transcode> jVar;
        Registry registry = this.c.f6842b;
        Class<?> cls2 = this.f6950g;
        Class cls3 = this.f6954k;
        k4.b bVar = registry.f6829i;
        j<Data, ?, Transcode> jVar2 = null;
        p4.i andSet = bVar.f19577b.getAndSet(null);
        if (andSet == null) {
            andSet = new p4.i();
        }
        andSet.f23701a = cls;
        andSet.f23702b = cls2;
        andSet.c = cls3;
        synchronized (bVar.f19576a) {
            jVar = (j<Data, ?, Transcode>) bVar.f19576a.getOrDefault(andSet, null);
        }
        bVar.f19577b.set(andSet);
        registry.f6829i.getClass();
        if (k4.b.c.equals(jVar)) {
            return null;
        }
        if (jVar == null) {
            ArrayList e10 = registry.e(cls, cls2, cls3);
            if (!e10.isEmpty()) {
                jVar2 = new j<>(cls, cls2, cls3, e10, registry.f6830j);
            }
            registry.f6829i.a(cls, cls2, cls3, jVar2);
            return jVar2;
        }
        return jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        r1 = (t3.a<X>) r3.f19575b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <X> t3.a<X> d(X r6) {
        /*
            r5 = this;
            com.bumptech.glide.d r0 = r5.c
            com.bumptech.glide.Registry r0 = r0.f6842b
            k4.a r0 = r0.f6823b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f19573a     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L38
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L38
            k4.a$a r3 = (k4.a.C0262a) r3     // Catch: java.lang.Throwable -> L38
            java.lang.Class<T> r4 = r3.f19574a     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L11
            t3.a<T> r1 = r3.f19575b     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)
            goto L2b
        L29:
            monitor-exit(r0)
            r1 = 0
        L2b:
            if (r1 == 0) goto L2e
            return r1
        L2e:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L38:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.d.d(java.lang.Object):t3.a");
    }

    public final <Z> t3.h<Z> e(Class<Z> cls) {
        t3.h<Z> hVar = (t3.h<Z>) this.f6953j.get(cls);
        if (hVar == null) {
            Iterator<Map.Entry<Class<?>, t3.h<?>>> it = this.f6953j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, t3.h<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    hVar = (t3.h<Z>) next.getValue();
                    break;
                }
            }
        }
        if (hVar == null) {
            if (this.f6953j.isEmpty() && this.f6960q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return b4.a.f5324b;
        }
        return hVar;
    }
}

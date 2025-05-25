package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import v3.m;
import z3.o;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
public final class h implements c, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final c.a f7020a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f7021b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f7022d = -1;

    /* renamed from: e  reason: collision with root package name */
    public t3.b f7023e;

    /* renamed from: f  reason: collision with root package name */
    public List<o<File, ?>> f7024f;

    /* renamed from: g  reason: collision with root package name */
    public int f7025g;

    /* renamed from: h  reason: collision with root package name */
    public volatile o.a<?> f7026h;

    /* renamed from: i  reason: collision with root package name */
    public File f7027i;

    /* renamed from: j  reason: collision with root package name */
    public m f7028j;

    public h(d<?> dVar, c.a aVar) {
        this.f7021b = dVar;
        this.f7020a = aVar;
    }

    @Override // com.bumptech.glide.load.engine.c
    public final boolean b() {
        List list;
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList a10 = this.f7021b.a();
        if (a10.isEmpty()) {
            return false;
        }
        d<?> dVar = this.f7021b;
        Registry registry = dVar.c.f6842b;
        Class<?> cls = dVar.f6947d.getClass();
        Class<?> cls2 = dVar.f6950g;
        Class<?> cls3 = dVar.f6954k;
        w1.f fVar = registry.f6828h;
        p4.i iVar = (p4.i) ((AtomicReference) fVar.f30907b).getAndSet(null);
        if (iVar == null) {
            iVar = new p4.i(cls, cls2, cls3);
        } else {
            iVar.f23701a = cls;
            iVar.f23702b = cls2;
            iVar.c = cls3;
        }
        synchronized (((y.b) fVar.c)) {
            list = (List) ((y.b) fVar.c).getOrDefault(iVar, null);
        }
        ((AtomicReference) fVar.f30907b).set(iVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = registry.f6822a.a(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = registry.c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!registry.f6826f.b(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            registry.f6828h.c(cls, cls2, cls3, Collections.unmodifiableList(arrayList2));
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            if (File.class.equals(this.f7021b.f6954k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f7021b.f6947d.getClass() + " to " + this.f7021b.f6954k);
        }
        while (true) {
            List<o<File, ?>> list2 = this.f7024f;
            if (list2 != null) {
                if (this.f7025g < list2.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f7026h = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.f7025g < this.f7024f.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List<o<File, ?>> list3 = this.f7024f;
                        int i10 = this.f7025g;
                        this.f7025g = i10 + 1;
                        File file = this.f7027i;
                        d<?> dVar2 = this.f7021b;
                        this.f7026h = list3.get(i10).b(file, dVar2.f6948e, dVar2.f6949f, dVar2.f6952i);
                        if (this.f7026h != null) {
                            if (this.f7021b.c(this.f7026h.c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.f7026h.c.e(this.f7021b.f6958o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i11 = this.f7022d + 1;
            this.f7022d = i11;
            if (i11 >= arrayList.size()) {
                int i12 = this.c + 1;
                this.c = i12;
                if (i12 >= a10.size()) {
                    return false;
                }
                this.f7022d = 0;
            }
            t3.b bVar = (t3.b) a10.get(this.c);
            Class cls5 = (Class) arrayList.get(this.f7022d);
            t3.h<Z> e10 = this.f7021b.e(cls5);
            d<?> dVar3 = this.f7021b;
            this.f7028j = new m(dVar3.c.f6841a, bVar, dVar3.f6957n, dVar3.f6948e, dVar3.f6949f, e10, cls5, dVar3.f6952i);
            File a11 = ((e.c) dVar3.f6951h).a().a(this.f7028j);
            this.f7027i = a11;
            if (a11 != null) {
                this.f7023e = bVar;
                this.f7024f = this.f7021b.c.f6842b.g(a11);
                this.f7025g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f7020a.a(this.f7028j, exc, this.f7026h.c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.c
    public final void cancel() {
        o.a<?> aVar = this.f7026h;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        this.f7020a.c(this.f7023e, obj, this.f7026h.c, DataSource.RESOURCE_DISK_CACHE, this.f7028j);
    }
}

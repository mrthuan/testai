package com.bykv.vk.openvk.preload.b;

import java.util.List;

/* compiled from: RealInterceptorChain.java */
/* loaded from: classes.dex */
final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    protected e f7467a;

    /* renamed from: b  reason: collision with root package name */
    private int f7468b;
    private List<h> c;

    /* renamed from: d  reason: collision with root package name */
    private d f7469d;

    /* compiled from: RealInterceptorChain.java */
    /* loaded from: classes.dex */
    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public i(List<h> list, int i10, e eVar, d dVar) {
        this.c = list;
        this.f7468b = i10;
        this.f7467a = eVar;
        this.f7469d = dVar;
    }

    private d c(Class cls) {
        d dVar = this.f7469d;
        while (dVar != null && dVar.getClass() != cls) {
            dVar = dVar.f7453a;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Object obj) {
        d dVar = this.f7469d;
        if (dVar != null) {
            dVar.c = obj;
            com.bykv.vk.openvk.preload.b.b.a aVar = dVar.f7455d;
            if (aVar != null) {
                aVar.b(dVar.f7456e, dVar);
            }
        }
        if (this.f7468b >= this.c.size()) {
            return obj;
        }
        h hVar = this.c.get(this.f7468b);
        Class<? extends d> cls = hVar.f7463a;
        d dVar2 = (d) this.f7467a.a(cls);
        if (dVar2 != null) {
            com.bykv.vk.openvk.preload.b.b.a aVar2 = hVar.f7464b;
            i iVar = new i(this.c, this.f7468b + 1, this.f7467a, dVar2);
            dVar2.a(iVar, this.f7469d, obj, aVar2, hVar.c);
            com.bykv.vk.openvk.preload.b.b.a aVar3 = dVar2.f7455d;
            if (aVar3 != null) {
                aVar3.a(dVar2.f7456e, dVar2);
            }
            try {
                Object a10 = dVar2.a(iVar, obj);
                com.bykv.vk.openvk.preload.b.b.a aVar4 = dVar2.f7455d;
                if (aVar4 != null) {
                    aVar4.c(dVar2.f7456e, dVar2);
                }
                return a10;
            } catch (a e10) {
                Throwable cause = e10.getCause();
                if (dVar2.f7455d != null) {
                    dVar2.f7455d.b(dVar2.f7456e, dVar2, cause);
                }
                throw e10;
            } catch (Throwable th2) {
                if (dVar2.f7455d != null) {
                    dVar2.f7455d.a(dVar2.f7456e, dVar2, th2);
                }
                throw new a(th2);
            }
        }
        throw new IllegalArgumentException("interceptor == null , index = " + obj + " , class: " + cls);
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object b(Class cls) {
        d c = c(cls);
        if (c != null) {
            return c.c;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }

    @Override // com.bykv.vk.openvk.preload.b.b
    public final Object a(Class cls) {
        d c = c(cls);
        if (c != null) {
            return c.f7454b;
        }
        throw new IllegalArgumentException("can not find pre Interceptor , class:".concat(String.valueOf(cls)));
    }
}

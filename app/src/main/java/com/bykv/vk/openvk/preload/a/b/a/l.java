package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.q;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;

/* compiled from: TreeTypeAdapter.java */
/* loaded from: classes.dex */
public final class l<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final com.bykv.vk.openvk.preload.a.f f7233a;

    /* renamed from: b  reason: collision with root package name */
    private final q<T> f7234b;
    private final com.bykv.vk.openvk.preload.a.j<T> c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.c.a<T> f7235d;

    /* renamed from: g  reason: collision with root package name */
    private t<T> f7238g;

    /* renamed from: f  reason: collision with root package name */
    private final l<T>.a f7237f = new a(this, (byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final u f7236e = null;

    /* compiled from: TreeTypeAdapter.java */
    /* loaded from: classes.dex */
    public final class a {
        private a() {
        }

        public /* synthetic */ a(l lVar, byte b10) {
            this();
        }
    }

    public l(q<T> qVar, com.bykv.vk.openvk.preload.a.j<T> jVar, com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        this.f7234b = qVar;
        this.c = jVar;
        this.f7233a = fVar;
        this.f7235d = aVar;
    }

    private t<T> b() {
        t<T> tVar = this.f7238g;
        if (tVar != null) {
            return tVar;
        }
        t<T> a10 = this.f7233a.a(this.f7236e, this.f7235d);
        this.f7238g = a10;
        return a10;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        if (this.c == null) {
            return b().a(aVar);
        }
        if (com.bykv.vk.openvk.preload.a.b.k.a(aVar) instanceof com.bykv.vk.openvk.preload.a.m) {
            return null;
        }
        return this.c.a();
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t4) {
        q<T> qVar = this.f7234b;
        if (qVar == null) {
            b().a(cVar, t4);
        } else if (t4 == null) {
            cVar.e();
        } else {
            com.bykv.vk.openvk.preload.a.b.k.a(qVar.a(), cVar);
        }
    }
}

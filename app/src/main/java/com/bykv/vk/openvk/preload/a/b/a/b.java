package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: CollectionTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f7190a;

    public b(com.bykv.vk.openvk.preload.a.b.c cVar) {
        this.f7190a = cVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Type type = aVar.c;
        Class<? super T> cls = aVar.f7360b;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type a10 = com.bykv.vk.openvk.preload.a.b.b.a(type, (Class<?>) cls);
        return new a(fVar, a10, fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(a10)), this.f7190a.a(aVar));
    }

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* loaded from: classes.dex */
    public static final class a<E> extends t<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final t<E> f7191a;

        /* renamed from: b  reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.i<? extends Collection<E>> f7192b;

        public a(com.bykv.vk.openvk.preload.a.f fVar, Type type, t<E> tVar, com.bykv.vk.openvk.preload.a.b.i<? extends Collection<E>> iVar) {
            this.f7191a = new m(fVar, tVar, type);
            this.f7192b = iVar;
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.e();
                return;
            }
            cVar.a();
            for (E e10 : collection) {
                this.f7191a.a(cVar, e10);
            }
            cVar.b();
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            Collection<E> a10 = this.f7192b.a();
            aVar.a();
            while (aVar.e()) {
                a10.add(this.f7191a.a(aVar));
            }
            aVar.b();
            return a10;
        }
    }
}

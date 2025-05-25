package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* compiled from: ArrayTypeAdapter.java */
/* loaded from: classes.dex */
public final class a<E> extends t<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final u f7187a = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.a.1
        @Override // com.bykv.vk.openvk.preload.a.u
        public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            Type type = aVar.c;
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type d10 = com.bykv.vk.openvk.preload.a.b.b.d(type);
            return new a(fVar, fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(d10)), com.bykv.vk.openvk.preload.a.b.b.b(d10));
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final Class<E> f7188b;
    private final t<E> c;

    public a(com.bykv.vk.openvk.preload.a.f fVar, t<E> tVar, Class<E> cls) {
        this.c = new m(fVar, tVar, cls);
        this.f7188b = cls;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final Object a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
            aVar.k();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.e()) {
            arrayList.add(this.c.a(aVar));
        }
        aVar.b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f7188b, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) {
        if (obj == null) {
            cVar.e();
            return;
        }
        cVar.a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.c.a(cVar, Array.get(obj, i10));
        }
        cVar.b();
    }
}

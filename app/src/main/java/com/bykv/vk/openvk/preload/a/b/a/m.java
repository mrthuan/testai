package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.b.a.i;
import com.bykv.vk.openvk.preload.a.t;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes.dex */
public final class m<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.f f7240a;

    /* renamed from: b  reason: collision with root package name */
    private final t<T> f7241b;
    private final Type c;

    public m(com.bykv.vk.openvk.preload.a.f fVar, t<T> tVar, Type type) {
        this.f7240a = fVar;
        this.f7241b = tVar;
        this.c = type;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        return this.f7241b.a(aVar);
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t4) {
        t<T> tVar = this.f7241b;
        Type type = this.c;
        if (t4 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t4.getClass();
        }
        if (type != this.c) {
            tVar = this.f7240a.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type));
            if (tVar instanceof i.a) {
                t<T> tVar2 = this.f7241b;
                if (!(tVar2 instanceof i.a)) {
                    tVar = tVar2;
                }
            }
        }
        tVar.a(cVar, t4);
    }
}

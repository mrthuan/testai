package com.bykv.vk.openvk.preload.a;

import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* loaded from: classes.dex */
public abstract class t<T> {
    public final t<T> a() {
        return new t<T>() { // from class: com.bykv.vk.openvk.preload.a.t.1
            @Override // com.bykv.vk.openvk.preload.a.t
            public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t4) {
                if (t4 == null) {
                    cVar.e();
                } else {
                    t.this.a(cVar, t4);
                }
            }

            @Override // com.bykv.vk.openvk.preload.a.t
            public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) {
                if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                    aVar.k();
                    return null;
                }
                return (T) t.this.a(aVar);
            }
        };
    }

    public abstract T a(com.bykv.vk.openvk.preload.a.d.a aVar);

    public abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t4);

    public final k a(T t4) {
        try {
            com.bykv.vk.openvk.preload.a.b.a.f fVar = new com.bykv.vk.openvk.preload.a.b.a.f();
            a(fVar, t4);
            if (fVar.f7203a.isEmpty()) {
                return fVar.f7204b;
            }
            throw new IllegalStateException("Expected one JSON element but was " + fVar.f7203a);
        } catch (IOException e10) {
            throw new l(e10);
        }
    }
}

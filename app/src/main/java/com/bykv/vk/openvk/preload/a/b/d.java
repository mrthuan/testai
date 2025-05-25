package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: Excluder.java */
/* loaded from: classes.dex */
public final class d implements u, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static final d f7315a = new d();

    /* renamed from: e  reason: collision with root package name */
    public boolean f7318e;

    /* renamed from: b  reason: collision with root package name */
    public double f7316b = -1.0d;
    public int c = ShapeTypes.FLOW_CHART_INTERNAL_STORAGE;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7317d = true;

    /* renamed from: f  reason: collision with root package name */
    public List<com.bykv.vk.openvk.preload.a.b> f7319f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public List<com.bykv.vk.openvk.preload.a.b> f7320g = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public static boolean b(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls)) {
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean c(Class<?> cls) {
        if (cls.isMemberClass() && !d(cls)) {
            return true;
        }
        return false;
    }

    private static boolean d(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a(Class<?> cls) {
        if (this.f7316b == -1.0d || a((com.bykv.vk.openvk.preload.a.a.d) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.d.class), (com.bykv.vk.openvk.preload.a.a.e) cls.getAnnotation(com.bykv.vk.openvk.preload.a.a.e.class))) {
            return (!this.f7317d && c(cls)) || b(cls);
        }
        return true;
    }

    public final boolean a(boolean z10) {
        for (com.bykv.vk.openvk.preload.a.b bVar : z10 ? this.f7319f : this.f7320g) {
            if (bVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(com.bykv.vk.openvk.preload.a.a.d dVar, com.bykv.vk.openvk.preload.a.a.e eVar) {
        return a(dVar) && a(eVar);
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.d dVar) {
        return dVar == null || dVar.a() <= this.f7316b;
    }

    private boolean a(com.bykv.vk.openvk.preload.a.a.e eVar) {
        return eVar == null || eVar.a() > this.f7316b;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(final com.bykv.vk.openvk.preload.a.f fVar, final com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        boolean a10 = a(aVar.f7360b);
        final boolean z10 = a10 || a(true);
        final boolean z11 = a10 || a(false);
        if (z10 || z11) {
            return new t<T>() { // from class: com.bykv.vk.openvk.preload.a.b.d.1

                /* renamed from: f  reason: collision with root package name */
                private t<T> f7325f;

                private t<T> b() {
                    t<T> tVar = this.f7325f;
                    if (tVar != null) {
                        return tVar;
                    }
                    t<T> a11 = fVar.a(d.this, aVar);
                    this.f7325f = a11;
                    return a11;
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final T a(com.bykv.vk.openvk.preload.a.d.a aVar2) {
                    if (z11) {
                        aVar2.o();
                        return null;
                    }
                    return b().a(aVar2);
                }

                @Override // com.bykv.vk.openvk.preload.a.t
                public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t4) {
                    if (z10) {
                        cVar.e();
                    } else {
                        b().a(cVar, t4);
                    }
                }
            };
        }
        return null;
    }
}

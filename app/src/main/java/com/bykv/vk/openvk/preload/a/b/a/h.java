package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes.dex */
public final class h extends t<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final u f7211a = new u() { // from class: com.bykv.vk.openvk.preload.a.b.a.h.1
        @Override // com.bykv.vk.openvk.preload.a.u
        public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
            if (aVar.f7360b == Object.class) {
                return new h(fVar);
            }
            return null;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.f f7212b;

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: com.bykv.vk.openvk.preload.a.b.a.h$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7213a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            f7213a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7213a[com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7213a[com.bykv.vk.openvk.preload.a.d.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7213a[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7213a[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7213a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public h(com.bykv.vk.openvk.preload.a.f fVar) {
        this.f7212b = fVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final Object a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        switch (AnonymousClass2.f7213a[aVar.f().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.e()) {
                    arrayList.add(a(aVar));
                }
                aVar.b();
                return arrayList;
            case 2:
                com.bykv.vk.openvk.preload.a.b.h hVar = new com.bykv.vk.openvk.preload.a.b.h();
                aVar.c();
                while (aVar.e()) {
                    hVar.put(aVar.h(), a(aVar));
                }
                aVar.d();
                return hVar;
            case 3:
                return aVar.i();
            case 4:
                return Double.valueOf(aVar.l());
            case 5:
                return Boolean.valueOf(aVar.j());
            case 6:
                aVar.k();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) {
        if (obj == null) {
            cVar.e();
            return;
        }
        t a10 = this.f7212b.a((Class) obj.getClass());
        if (a10 instanceof h) {
            cVar.c();
            cVar.d();
            return;
        }
        a10.a(cVar, obj);
    }
}

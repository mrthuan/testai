package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.t;

/* compiled from: BooleanTypeAdapter.java */
/* loaded from: classes.dex */
public final class a extends t<Boolean> {

    /* compiled from: BooleanTypeAdapter.java */
    /* renamed from: com.bykv.vk.openvk.preload.geckox.c.a$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7553a;

        static {
            int[] iArr = new int[com.bykv.vk.openvk.preload.a.d.b.values().length];
            f7553a = iArr;
            try {
                iArr[com.bykv.vk.openvk.preload.a.d.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7553a[com.bykv.vk.openvk.preload.a.d.b.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7553a[com.bykv.vk.openvk.preload.a.d.b.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final /* synthetic */ void a(c cVar, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null) {
            cVar.e();
        } else {
            cVar.a(bool2);
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.t
    public final /* synthetic */ Boolean a(com.bykv.vk.openvk.preload.a.d.a aVar) {
        com.bykv.vk.openvk.preload.a.d.b f10 = aVar.f();
        int i10 = AnonymousClass1.f7553a[f10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                aVar.k();
                return null;
            } else if (i10 == 3) {
                return Boolean.valueOf(aVar.n() != 0);
            } else {
                throw new o("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f10)));
            }
        }
        return Boolean.valueOf(aVar.j());
    }
}

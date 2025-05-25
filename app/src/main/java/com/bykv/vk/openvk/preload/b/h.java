package com.bykv.vk.openvk.preload.b;

/* compiled from: Pipe.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    Class<? extends d> f7463a;

    /* renamed from: b  reason: collision with root package name */
    com.bykv.vk.openvk.preload.b.b.a f7464b;
    Object[] c;

    public /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    /* compiled from: Pipe.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        Class<? extends d> f7465a;

        /* renamed from: b  reason: collision with root package name */
        public com.bykv.vk.openvk.preload.b.b.a f7466b;
        public Object[] c;

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f7465a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final h a() {
            return new h(this, (byte) 0);
        }
    }

    private h(a aVar) {
        Class<? extends d> cls = aVar.f7465a;
        this.f7463a = cls;
        this.f7464b = aVar.f7466b;
        this.c = aVar.c;
        if (cls == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}

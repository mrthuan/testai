package y;

import java.util.Map;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public final class a extends h<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f31907d;

    public a(b bVar) {
        this.f31907d = bVar;
    }

    @Override // y.h
    public final void a() {
        this.f31907d.clear();
    }

    @Override // y.h
    public final Object b(int i10, int i11) {
        return this.f31907d.f31943b[(i10 << 1) + i11];
    }

    @Override // y.h
    public final Map<Object, Object> c() {
        return this.f31907d;
    }

    @Override // y.h
    public final int d() {
        return this.f31907d.c;
    }

    @Override // y.h
    public final int e(Object obj) {
        return this.f31907d.e(obj);
    }

    @Override // y.h
    public final int f(Object obj) {
        return this.f31907d.g(obj);
    }

    @Override // y.h
    public final void g(Object obj, Object obj2) {
        this.f31907d.put(obj, obj2);
    }

    @Override // y.h
    public final void h(int i10) {
        this.f31907d.j(i10);
    }

    @Override // y.h
    public final Object i(int i10, Object obj) {
        return this.f31907d.k(i10, obj);
    }
}

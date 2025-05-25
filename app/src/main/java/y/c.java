package y;

import java.util.Map;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class c extends h<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f31909d;

    public c(d dVar) {
        this.f31909d = dVar;
    }

    @Override // y.h
    public final void a() {
        this.f31909d.clear();
    }

    @Override // y.h
    public final Object b(int i10, int i11) {
        return this.f31909d.f31917b[i10];
    }

    @Override // y.h
    public final Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // y.h
    public final int d() {
        return this.f31909d.c;
    }

    @Override // y.h
    public final int e(Object obj) {
        return this.f31909d.indexOf(obj);
    }

    @Override // y.h
    public final int f(Object obj) {
        return this.f31909d.indexOf(obj);
    }

    @Override // y.h
    public final void g(Object obj, Object obj2) {
        this.f31909d.add(obj);
    }

    @Override // y.h
    public final void h(int i10) {
        this.f31909d.e(i10);
    }

    @Override // y.h
    public final Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}

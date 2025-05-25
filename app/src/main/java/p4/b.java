package p4;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes.dex */
public final class b<K, V> extends y.b<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public int f23689i;

    @Override // y.i, java.util.Map
    public final void clear() {
        this.f23689i = 0;
        super.clear();
    }

    @Override // y.i, java.util.Map
    public final int hashCode() {
        if (this.f23689i == 0) {
            this.f23689i = super.hashCode();
        }
        return this.f23689i;
    }

    @Override // y.i
    public final void i(y.i<? extends K, ? extends V> iVar) {
        this.f23689i = 0;
        super.i(iVar);
    }

    @Override // y.i
    public final V j(int i10) {
        this.f23689i = 0;
        return (V) super.j(i10);
    }

    @Override // y.i
    public final V k(int i10, V v10) {
        this.f23689i = 0;
        return (V) super.k(i10, v10);
    }

    @Override // y.i, java.util.Map
    public final V put(K k10, V v10) {
        this.f23689i = 0;
        return (V) super.put(k10, v10);
    }
}

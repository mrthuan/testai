package x6;

/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class a<T> implements pf.a<T> {
    public static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile pf.a<T> f31623a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f31624b = c;

    public a(b bVar) {
        this.f31623a = bVar;
    }

    public static pf.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        return new a(bVar);
    }

    @Override // pf.a
    public final T get() {
        boolean z10;
        T t4 = (T) this.f31624b;
        Object obj = c;
        if (t4 == obj) {
            synchronized (this) {
                t4 = this.f31624b;
                if (t4 == obj) {
                    t4 = this.f31623a.get();
                    Object obj2 = this.f31624b;
                    if (obj2 != obj) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && obj2 != t4) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t4 + ". This is likely due to a circular dependency.");
                    }
                    this.f31624b = t4;
                    this.f31623a = null;
                }
            }
        }
        return t4;
    }
}

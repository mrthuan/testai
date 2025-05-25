package ga;

/* compiled from: Lazy.java */
/* loaded from: classes2.dex */
public final class m<T> implements db.b<T> {
    public static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f17733a = c;

    /* renamed from: b  reason: collision with root package name */
    public volatile db.b<T> f17734b;

    public m(db.b<T> bVar) {
        this.f17734b = bVar;
    }

    @Override // db.b
    public final T get() {
        T t4 = (T) this.f17733a;
        Object obj = c;
        if (t4 == obj) {
            synchronized (this) {
                t4 = this.f17733a;
                if (t4 == obj) {
                    t4 = this.f17734b.get();
                    this.f17733a = t4;
                    this.f17734b = null;
                }
            }
        }
        return t4;
    }
}

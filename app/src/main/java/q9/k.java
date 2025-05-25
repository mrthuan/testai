package q9;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class k implements l {
    public static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile l f29128a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f29129b = c;

    public k(l lVar) {
        this.f29128a = lVar;
    }

    public static l b(l lVar) {
        if (lVar instanceof k) {
            return lVar;
        }
        return new k(lVar);
    }

    @Override // q9.m
    public final Object a() {
        Object obj = this.f29129b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f29129b;
                if (obj == obj2) {
                    obj = this.f29128a.a();
                    Object obj3 = this.f29129b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f29129b = obj;
                    this.f29128a = null;
                }
            }
        }
        return obj;
    }
}

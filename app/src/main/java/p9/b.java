package p9;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class b implements c {
    public static final Object c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile c f23802a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f23803b = c;

    public b(c cVar) {
        this.f23802a = cVar;
    }

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        return new b(cVar);
    }

    @Override // p9.c
    public final Object zza() {
        Object obj = this.f23803b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f23803b;
                if (obj == obj2) {
                    obj = this.f23802a.zza();
                    Object obj3 = this.f23803b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f23803b = obj;
                    this.f23802a = null;
                }
            }
        }
        return obj;
    }
}

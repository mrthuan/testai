package v6;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes.dex */
public final class t implements s6.f {

    /* renamed from: a  reason: collision with root package name */
    public final Set<s6.b> f30726a;

    /* renamed from: b  reason: collision with root package name */
    public final s f30727b;
    public final v c;

    public t(Set set, j jVar, v vVar) {
        this.f30726a = set;
        this.f30727b = jVar;
        this.c = vVar;
    }

    @Override // s6.f
    public final u a(String str, s6.b bVar, s6.d dVar) {
        Set<s6.b> set = this.f30726a;
        if (set.contains(bVar)) {
            return new u(this.f30727b, str, bVar, dVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }
}

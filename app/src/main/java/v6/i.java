package v6;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: a  reason: collision with root package name */
    public final s f30707a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30708b;
    public final s6.c<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final s6.d<?, byte[]> f30709d;

    /* renamed from: e  reason: collision with root package name */
    public final s6.b f30710e;

    public i(s sVar, String str, s6.c cVar, s6.d dVar, s6.b bVar) {
        this.f30707a = sVar;
        this.f30708b = str;
        this.c = cVar;
        this.f30709d = dVar;
        this.f30710e = bVar;
    }

    @Override // v6.r
    public final s6.b a() {
        return this.f30710e;
    }

    @Override // v6.r
    public final s6.c<?> b() {
        return this.c;
    }

    @Override // v6.r
    public final s6.d<?, byte[]> c() {
        return this.f30709d;
    }

    @Override // v6.r
    public final s d() {
        return this.f30707a;
    }

    @Override // v6.r
    public final String e() {
        return this.f30708b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f30707a.equals(rVar.d()) && this.f30708b.equals(rVar.e()) && this.c.equals(rVar.b()) && this.f30709d.equals(rVar.c()) && this.f30710e.equals(rVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f30707a.hashCode() ^ 1000003) * 1000003) ^ this.f30708b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f30709d.hashCode()) * 1000003) ^ this.f30710e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f30707a + ", transportName=" + this.f30708b + ", event=" + this.c + ", transformer=" + this.f30709d + ", encoding=" + this.f30710e + "}";
    }
}

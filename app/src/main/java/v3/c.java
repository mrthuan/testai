package v3;

import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
public final class c implements t3.b {

    /* renamed from: b  reason: collision with root package name */
    public final t3.b f30502b;
    public final t3.b c;

    public c(t3.b bVar, t3.b bVar2) {
        this.f30502b = bVar;
        this.c = bVar2;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        this.f30502b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f30502b.equals(cVar.f30502b) || !this.c.equals(cVar.c)) {
            return false;
        }
        return true;
    }

    @Override // t3.b
    public final int hashCode() {
        return this.c.hashCode() + (this.f30502b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f30502b + ", signature=" + this.c + '}';
    }
}

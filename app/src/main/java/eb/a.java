package eb;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes2.dex */
public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public final String f16536a;

    /* renamed from: b  reason: collision with root package name */
    public final long f16537b;
    public final long c;

    public a(String str, long j10, long j11) {
        this.f16536a = str;
        this.f16537b = j10;
        this.c = j11;
    }

    @Override // eb.h
    public final String a() {
        return this.f16536a;
    }

    @Override // eb.h
    public final long b() {
        return this.c;
    }

    @Override // eb.h
    public final long c() {
        return this.f16537b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f16536a.equals(hVar.a()) && this.f16537b == hVar.c() && this.c == hVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f16537b;
        long j11 = this.c;
        return ((((this.f16536a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f16536a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f16537b);
        sb2.append(", tokenCreationTimestamp=");
        return android.support.v4.media.session.h.e(sb2, this.c, "}");
    }
}

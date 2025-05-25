package lb;

import androidx.activity.r;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f20538a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20539b;

    public a(String str, String str2) {
        if (str != null) {
            this.f20538a = str;
            if (str2 != null) {
                this.f20539b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // lb.d
    public final String a() {
        return this.f20538a;
    }

    @Override // lb.d
    public final String b() {
        return this.f20539b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f20538a.equals(dVar.a()) && this.f20539b.equals(dVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20538a.hashCode() ^ 1000003) * 1000003) ^ this.f20539b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f20538a);
        sb2.append(", version=");
        return r.g(sb2, this.f20539b, "}");
    }
}

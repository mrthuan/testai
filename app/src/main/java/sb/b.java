package sb;

import androidx.activity.r;

/* compiled from: NetResponse.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f29774a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29775b;

    public b(int i10, String str) {
        this.f29774a = i10;
        this.f29775b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f29774a == bVar.f29774a && kotlin.jvm.internal.g.a(this.f29775b, bVar.f29775b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29775b.hashCode() + (this.f29774a * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetResponse(code=");
        sb2.append(this.f29774a);
        sb2.append(", data=");
        return r.f(sb2, this.f29775b, ')');
    }
}

package mb;

import java.util.HashSet;
import java.util.Set;

/* compiled from: AutoValue_ConfigUpdate.java */
/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f21961a;

    public a(HashSet hashSet) {
        this.f21961a = hashSet;
    }

    @Override // mb.b
    public final Set<String> a() {
        return this.f21961a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f21961a.equals(((b) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f21961a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f21961a + "}";
    }
}

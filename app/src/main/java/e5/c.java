package e5;

/* compiled from: UpdateInfo.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f16456a;

    public c() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && kotlin.jvm.internal.g.a(this.f16456a, ((c) obj).f16456a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        a aVar = this.f16456a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "PlanB(lan=" + this.f16456a + ')';
    }

    public c(a aVar) {
        this.f16456a = aVar;
    }
}

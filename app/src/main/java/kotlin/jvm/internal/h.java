package kotlin.jvm.internal;

/* compiled from: PackageReference.kt */
/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f19948a;

    public h(Class jClass) {
        g.e(jClass, "jClass");
        this.f19948a = jClass;
    }

    @Override // kotlin.jvm.internal.b
    public final Class<?> a() {
        return this.f19948a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (g.a(this.f19948a, ((h) obj).f19948a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19948a.hashCode();
    }

    public final String toString() {
        return this.f19948a.toString() + " (Kotlin reflection is not available)";
    }
}

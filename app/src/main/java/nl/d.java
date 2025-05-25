package nl;

/* compiled from: ManagerFilesPermissionResult.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22599a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22600b;

    public d(boolean z10, String str) {
        kotlin.jvm.internal.g.e(str, ea.a.p("UmM_aQVpFnk8YVll", "6Ssl3LEU"));
        this.f22599a = z10;
        this.f22600b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f22599a == dVar.f22599a && kotlin.jvm.internal.g.a(this.f22600b, dVar.f22600b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z10 = this.f22599a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.f22600b.hashCode() + (r02 * 31);
    }

    public final String toString() {
        return "ManagerFilesPermissionResult(isList=" + this.f22599a + ", activityName=" + this.f22600b + ")";
    }
}

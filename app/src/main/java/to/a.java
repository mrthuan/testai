package to;

/* compiled from: RecentAddUIState.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f30068a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30069b;

    public a() {
        this(false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f30068a == aVar.f30068a && this.f30069b == aVar.f30069b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z10 = this.f30068a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.f30069b;
    }

    public final String toString() {
        return "RecentAddUIState(visible=" + this.f30068a + ", count=" + this.f30069b + ")";
    }

    public a(boolean z10, int i10) {
        this.f30068a = z10;
        this.f30069b = i10;
    }
}

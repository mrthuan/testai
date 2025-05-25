package t2;

/* compiled from: NetworkState.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f29912a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29913b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f29914d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f29912a = z10;
        this.f29913b = z11;
        this.c = z12;
        this.f29914d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f29912a == bVar.f29912a && this.f29913b == bVar.f29913b && this.c == bVar.c && this.f29914d == bVar.f29914d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        boolean z10 = this.f29913b;
        ?? r12 = this.f29912a;
        int i10 = r12;
        if (z10) {
            i10 = r12 + 16;
        }
        int i11 = i10;
        if (this.c) {
            i11 = i10 + 256;
        }
        if (this.f29914d) {
            return i11 + 4096;
        }
        return i11;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f29912a), Boolean.valueOf(this.f29913b), Boolean.valueOf(this.c), Boolean.valueOf(this.f29914d));
    }
}

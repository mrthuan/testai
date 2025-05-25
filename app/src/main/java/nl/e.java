package nl;

/* compiled from: MediaStoreFirstScanResult.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f22601a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22602b;

    public e(long j10, int i10) {
        this.f22601a = j10;
        this.f22602b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f22601a == eVar.f22601a && this.f22602b == eVar.f22602b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f22601a;
        return (((int) (j10 ^ (j10 >>> 32))) * 31) + this.f22602b;
    }

    public final String toString() {
        return "MediaStoreFirstScanResult(time=" + this.f22601a + ", count=" + this.f22602b + ")";
    }
}

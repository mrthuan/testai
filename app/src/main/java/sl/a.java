package sl;

/* compiled from: UseSize.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f29823a;

    /* renamed from: b  reason: collision with root package name */
    public final int f29824b;

    public a() {
        this(0, 0);
    }

    public final float a() {
        return (this.f29823a * 1.0f) / this.f29824b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f29823a == aVar.f29823a && this.f29824b == aVar.f29824b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29823a * 31) + this.f29824b;
    }

    public final String toString() {
        float a10 = a();
        return this.f29823a + " " + this.f29824b + " " + a10;
    }

    public a(int i10, int i11) {
        this.f29823a = i10;
        this.f29824b = i11;
    }
}

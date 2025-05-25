package ga;

/* compiled from: Dependency.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final q<?> f17729a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17730b;
    public final int c;

    public k(Class<?> cls, int i10, int i11) {
        this(q.a(cls), i10, i11);
    }

    public static k a(Class<?> cls) {
        return new k(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.f17729a.equals(kVar.f17729a) || this.f17730b != kVar.f17730b || this.c != kVar.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f17729a.hashCode() ^ 1000003) * 1000003) ^ this.f17730b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f17729a);
        sb2.append(", type=");
        int i10 = this.f17730b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(b.a.c("Unsupported injection: ", i11));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return androidx.activity.r.g(sb2, str2, "}");
    }

    public k(q<?> qVar, int i10, int i11) {
        this.f17729a = qVar;
        this.f17730b = i10;
        this.c = i11;
    }
}

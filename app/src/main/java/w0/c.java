package w0;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public final class c<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f30902a;

    /* renamed from: b  reason: collision with root package name */
    public final S f30903b;

    public c(F f10, S s4) {
        this.f30902a = f10;
        this.f30903b = s4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!b.a(cVar.f30902a, this.f30902a) || !b.a(cVar.f30903b, this.f30903b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        F f10 = this.f30902a;
        if (f10 == null) {
            hashCode = 0;
        } else {
            hashCode = f10.hashCode();
        }
        S s4 = this.f30903b;
        if (s4 != null) {
            i10 = s4.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f30902a + " " + this.f30903b + "}";
    }
}

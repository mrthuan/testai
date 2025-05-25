package hg;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f18331d = new c(1, 0);

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public final boolean b(int i10) {
        if (this.f18326a <= i10 && i10 <= this.f18327b) {
            return true;
        }
        return false;
    }

    @Override // hg.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f18326a == cVar.f18326a) {
                    if (this.f18327b == cVar.f18327b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // hg.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f18326a * 31) + this.f18327b;
    }

    @Override // hg.a
    public final boolean isEmpty() {
        if (this.f18326a > this.f18327b) {
            return true;
        }
        return false;
    }

    @Override // hg.a
    public final String toString() {
        return this.f18326a + ".." + this.f18327b;
    }
}

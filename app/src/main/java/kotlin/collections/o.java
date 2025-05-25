package kotlin.collections;

/* compiled from: IndexedValue.kt */
/* loaded from: classes.dex */
public final class o<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f19930a;

    /* renamed from: b  reason: collision with root package name */
    public final T f19931b;

    public o(int i10, T t4) {
        this.f19930a = i10;
        this.f19931b = t4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f19930a == oVar.f19930a && kotlin.jvm.internal.g.a(this.f19931b, oVar.f19931b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f19930a * 31;
        T t4 = this.f19931b;
        if (t4 == null) {
            hashCode = 0;
        } else {
            hashCode = t4.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f19930a + ", value=" + this.f19931b + ')';
    }
}

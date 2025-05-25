package p4;

/* compiled from: MultiClassKey.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f23701a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f23702b;
    public Class<?> c;

    public i() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f23701a.equals(iVar.f23701a) && this.f23702b.equals(iVar.f23702b) && j.a(this.c, iVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f23702b.hashCode() + (this.f23701a.hashCode() * 31)) * 31;
        Class<?> cls = this.c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f23701a + ", second=" + this.f23702b + '}';
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f23701a = cls;
        this.f23702b = cls2;
        this.c = cls3;
    }
}

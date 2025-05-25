package ga;

import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes2.dex */
public final class q<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Annotation> f17740a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<T> f17741b;

    /* compiled from: Qualified.java */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public q(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f17740a = cls;
        this.f17741b = cls2;
    }

    public static <T> q<T> a(Class<T> cls) {
        return new q<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f17741b.equals(qVar.f17741b)) {
            return false;
        }
        return this.f17740a.equals(qVar.f17740a);
    }

    public final int hashCode() {
        return this.f17740a.hashCode() + (this.f17741b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f17741b;
        Class<? extends Annotation> cls2 = this.f17740a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}

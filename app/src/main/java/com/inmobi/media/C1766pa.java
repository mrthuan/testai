package com.inmobi.media;

/* renamed from: com.inmobi.media.pa  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1766pa {

    /* renamed from: a  reason: collision with root package name */
    public final String f15382a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f15383b;

    public C1766pa(String fieldName, Class<?> originClass) {
        kotlin.jvm.internal.g.e(fieldName, "fieldName");
        kotlin.jvm.internal.g.e(originClass, "originClass");
        this.f15382a = fieldName;
        this.f15383b = originClass;
    }

    public final C1766pa a(String fieldName, Class<?> originClass) {
        kotlin.jvm.internal.g.e(fieldName, "fieldName");
        kotlin.jvm.internal.g.e(originClass, "originClass");
        return new C1766pa(fieldName, originClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1766pa)) {
            return false;
        }
        C1766pa c1766pa = (C1766pa) obj;
        if (kotlin.jvm.internal.g.a(this.f15382a, c1766pa.f15382a) && kotlin.jvm.internal.g.a(this.f15383b, c1766pa.f15383b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f15383b.hashCode() + (this.f15382a.hashCode() * 31);
    }

    public String toString() {
        return "RuleKey(fieldName=" + this.f15382a + ", originClass=" + this.f15383b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C1766pa a(C1766pa c1766pa, String str, Class cls, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c1766pa.f15382a;
        }
        if ((i10 & 2) != 0) {
            cls = c1766pa.f15383b;
        }
        return c1766pa.a(str, cls);
    }
}

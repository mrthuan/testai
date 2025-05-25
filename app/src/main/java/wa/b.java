package wa;

import java.util.Collections;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f31069a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f31070b;

    public b(String str, Map<Class<?>, Object> map) {
        this.f31069a = str;
        this.f31070b = map;
    }

    public static b a(String str) {
        return new b(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f31069a.equals(bVar.f31069a) && this.f31070b.equals(bVar.f31070b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31070b.hashCode() + (this.f31069a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f31069a + ", properties=" + this.f31070b.values() + "}";
    }
}

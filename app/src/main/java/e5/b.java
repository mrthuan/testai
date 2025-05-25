package e5;

import java.util.List;

/* compiled from: UpdateInfo.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f16454a;

    /* renamed from: b  reason: collision with root package name */
    public final List<g> f16455b;

    public b() {
        this("", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.g.a(this.f16454a, bVar.f16454a) && kotlin.jvm.internal.g.a(this.f16455b, bVar.f16455b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f16454a.hashCode() * 31;
        List<g> list = this.f16455b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "PlanA(title=" + this.f16454a + ", list=" + this.f16455b + ')';
    }

    public b(String title, List<g> list) {
        kotlin.jvm.internal.g.e(title, "title");
        this.f16454a = title;
        this.f16455b = list;
    }
}

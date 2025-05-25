package ol;

import java.util.List;

/* compiled from: ProductInfo.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f23487a;

    /* renamed from: b  reason: collision with root package name */
    public final List<k> f23488b;

    public h(String str, List<k> list) {
        ea.a.p("Q3IkZAZjFklk", "0D6qXXZi");
        kotlin.jvm.internal.g.e(list, ea.a.p("P2xQbnM=", "cxhKbXvz"));
        this.f23487a = str;
        this.f23488b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.g.a(this.f23487a, hVar.f23487a) && kotlin.jvm.internal.g.a(this.f23488b, hVar.f23488b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23488b.hashCode() + (this.f23487a.hashCode() * 31);
    }

    public final String toString() {
        return "SaveProductInfo(productId=" + this.f23487a + ", plans=" + this.f23488b + ")";
    }
}

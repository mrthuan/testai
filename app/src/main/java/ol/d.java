package ol;

import java.util.List;

/* compiled from: ProductInfo.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f23476a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23477b;
    public final List<i> c;

    public d(String str, String str2, List<i> list) {
        ea.a.p("Q3IkZAZjFklk", "qCka0sMB");
        ea.a.p("V2k4Yxx1DHQ=", "qBB5rI01");
        kotlin.jvm.internal.g.e(list, ea.a.p("SWwEbnM=", "Ej9e33o9"));
        this.f23476a = str;
        this.f23477b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.g.a(this.f23476a, dVar.f23476a) && kotlin.jvm.internal.g.a(this.f23477b, dVar.f23477b) && kotlin.jvm.internal.g.a(this.c, dVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.activity.f.h(this.f23477b, this.f23476a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ProductInfo(productId=" + this.f23476a + ", discount=" + this.f23477b + ", plans=" + this.c + ")";
    }
}

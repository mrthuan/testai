package ol;

import java.util.List;

/* compiled from: ProductInfo.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<j> f23473a;

    public b(List<j> list) {
        kotlin.jvm.internal.g.e(list, ea.a.p("BGwibnM=", "J7tCYhO7"));
        this.f23473a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && kotlin.jvm.internal.g.a(this.f23473a, ((b) obj).f23473a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23473a.hashCode();
    }

    public final String toString() {
        return "CouponProductInfo(plans=" + this.f23473a + ")";
    }
}

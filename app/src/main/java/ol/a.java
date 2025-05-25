package ol;

import androidx.activity.r;

/* compiled from: ProductInfo.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f23472a;

    public a(String str) {
        ea.a.p("LG9XZhxlZ3IzY2U=", "WFFOPzvn");
        this.f23472a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && kotlin.jvm.internal.g.a(this.f23472a, ((a) obj).f23472a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23472a.hashCode();
    }

    public final String toString() {
        return r.g(new StringBuilder("CoffeeProductInfo(coffeePrice="), this.f23472a, ")");
    }
}

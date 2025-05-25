package a6;

import java.util.Currency;

/* compiled from: InAppPurchase.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f63a;

    /* renamed from: b  reason: collision with root package name */
    public final double f64b;
    public final Currency c;

    public a(String eventName, double d10, Currency currency) {
        kotlin.jvm.internal.g.e(eventName, "eventName");
        kotlin.jvm.internal.g.e(currency, "currency");
        this.f63a = eventName;
        this.f64b = d10;
        this.c = currency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.g.a(this.f63a, aVar.f63a) && Double.compare(this.f64b, aVar.f64b) == 0 && kotlin.jvm.internal.g.a(this.c, aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f64b);
        return this.c.hashCode() + (((this.f63a.hashCode() * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31);
    }

    public final String toString() {
        return "InAppPurchase(eventName=" + this.f63a + ", amount=" + this.f64b + ", currency=" + this.c + ')';
    }
}

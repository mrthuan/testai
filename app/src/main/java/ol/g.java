package ol;

import com.android.billingclient.api.Purchase;

/* compiled from: PurchaseResult.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23485a;

    /* renamed from: b  reason: collision with root package name */
    public final Purchase f23486b;

    public g(boolean z10, Purchase purchase) {
        this.f23485a = z10;
        this.f23486b = purchase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f23485a == gVar.f23485a && kotlin.jvm.internal.g.a(this.f23486b, gVar.f23486b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        int hashCode;
        boolean z10 = this.f23485a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        Purchase purchase = this.f23486b;
        if (purchase == null) {
            hashCode = 0;
        } else {
            hashCode = purchase.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        return "PurchaseResult(isSuccess=" + this.f23485a + ", purchase=" + this.f23486b + ")";
    }
}

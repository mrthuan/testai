package pm;

import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;

/* compiled from: SubscribeUiState.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final SubscriptionType f28973a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f28974b;

    public a() {
        this(0);
    }

    public static a a(a aVar, SubscriptionType selectType, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            selectType = aVar.f28973a;
        }
        if ((i10 & 2) != 0) {
            z10 = aVar.f28974b;
        }
        aVar.getClass();
        g.e(selectType, "selectType");
        return new a(selectType, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f28973a == aVar.f28973a && this.f28974b == aVar.f28974b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f28973a.hashCode() * 31;
        boolean z10 = this.f28974b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "SubscribeUiState(selectType=" + this.f28973a + ", hasFreeTrial=" + this.f28974b + ")";
    }

    public a(SubscriptionType subscriptionType, boolean z10) {
        g.e(subscriptionType, ea.a.p("AGUCZVV0Bnk4ZQ==", "NQsn6R7E"));
        this.f28973a = subscriptionType;
        this.f28974b = z10;
    }

    public /* synthetic */ a(int i10) {
        this(SubscriptionType.YEAR, false);
    }
}

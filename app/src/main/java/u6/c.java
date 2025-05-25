package u6;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f30241a;

    public c(ArrayList arrayList) {
        this.f30241a = arrayList;
    }

    @Override // u6.g
    public final List<i> a() {
        return this.f30241a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f30241a.equals(((g) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f30241a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f30241a + "}";
    }
}

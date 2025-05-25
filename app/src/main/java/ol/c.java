package ol;

import com.android.billingclient.api.h;

/* compiled from: IapEventInfo.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final h.d f23474a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23475b;

    public c(h.d dVar, int i10) {
        ea.a.p("K2VFYRBs", "Et1DGdXY");
        this.f23474a = dVar;
        this.f23475b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.g.a(this.f23474a, cVar.f23474a) && this.f23475b == cVar.f23475b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23474a.hashCode() * 31) + this.f23475b;
    }

    public final String toString() {
        return "IapEventInfo(detail=" + this.f23474a + ", modeType=" + this.f23475b + ")";
    }
}

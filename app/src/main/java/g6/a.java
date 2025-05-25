package g6;

import kotlin.jvm.internal.g;

/* compiled from: GateKeeper.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f17667a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f17668b;

    public a(String name, boolean z10) {
        g.e(name, "name");
        this.f17667a = name;
        this.f17668b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (g.a(this.f17667a, aVar.f17667a) && this.f17668b == aVar.f17668b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f17667a.hashCode() * 31;
        boolean z10 = this.f17668b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "GateKeeper(name=" + this.f17667a + ", value=" + this.f17668b + ')';
    }
}

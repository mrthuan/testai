package cm;

import kotlin.jvm.internal.g;

/* compiled from: AdSourceData.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f5713a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5714b;

    public a(String str) {
        g.e(str, ea.a.p("MG8-chdl", "GpCKtcHq"));
        this.f5713a = str;
        this.f5714b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (g.a(this.f5713a, aVar.f5713a) && this.f5714b == aVar.f5714b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f5713a.hashCode() * 31;
        boolean z10 = this.f5714b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        boolean z10 = this.f5714b;
        return "AdSourceData(source=" + this.f5713a + ", enable=" + z10 + ")";
    }
}

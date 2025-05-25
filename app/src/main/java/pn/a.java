package pn;

import kotlin.jvm.internal.g;

/* compiled from: ReasonType.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f28984a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28985b;

    public a(String str, boolean z10) {
        this.f28984a = str;
        this.f28985b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (g.a(this.f28984a, aVar.f28984a) && this.f28985b == aVar.f28985b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.f28984a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        boolean z10 = this.f28985b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        return i10 + i11;
    }

    public final String toString() {
        boolean z10 = this.f28985b;
        return "ReasonType(content=" + this.f28984a + ", selected=" + z10 + ")";
    }
}

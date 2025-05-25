package bb;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* loaded from: classes2.dex */
public final class a extends n {

    /* renamed from: a  reason: collision with root package name */
    public final String f5396a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f5397b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f5396a = str;
            this.f5397b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // bb.n
    public final List<String> a() {
        return this.f5397b;
    }

    @Override // bb.n
    public final String b() {
        return this.f5396a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f5396a.equals(nVar.b()) && this.f5397b.equals(nVar.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5396a.hashCode() ^ 1000003) * 1000003) ^ this.f5397b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f5396a + ", usedDates=" + this.f5397b + "}";
    }
}

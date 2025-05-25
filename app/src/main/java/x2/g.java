package x2;

/* compiled from: SystemIdInfo.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f31545a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31546b;

    public g(String str, int i10) {
        this.f31545a = str;
        this.f31546b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f31546b != gVar.f31546b) {
            return false;
        }
        return this.f31545a.equals(gVar.f31545a);
    }

    public final int hashCode() {
        return (this.f31545a.hashCode() * 31) + this.f31546b;
    }
}

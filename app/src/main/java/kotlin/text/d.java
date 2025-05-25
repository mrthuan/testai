package kotlin.text;

/* compiled from: Regex.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f19977a;

    /* renamed from: b  reason: collision with root package name */
    public final hg.c f19978b;

    public d(String str, hg.c cVar) {
        this.f19977a = str;
        this.f19978b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.g.a(this.f19977a, dVar.f19977a) && kotlin.jvm.internal.g.a(this.f19978b, dVar.f19978b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19978b.hashCode() + (this.f19977a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f19977a + ", range=" + this.f19978b + ')';
    }
}

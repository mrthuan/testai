package e5;

/* compiled from: UpdateInfo.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f16457a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16458b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final c f16459d;

    public d() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.g.a(this.f16457a, dVar.f16457a) && kotlin.jvm.internal.g.a(this.f16458b, dVar.f16458b) && kotlin.jvm.internal.g.a(this.c, dVar.c) && kotlin.jvm.internal.g.a(this.f16459d, dVar.f16459d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int h10 = androidx.activity.f.h(this.f16458b, this.f16457a.hashCode() * 31, 31);
        int i10 = 0;
        b bVar = this.c;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i11 = (h10 + hashCode) * 31;
        c cVar = this.f16459d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "UpdateInfo(name=" + this.f16457a + ", plan=" + this.f16458b + ", planA=" + this.c + ", planB=" + this.f16459d + ')';
    }

    public /* synthetic */ d(int i10) {
        this("", "", null, null);
    }

    public d(String name, String plan, b bVar, c cVar) {
        kotlin.jvm.internal.g.e(name, "name");
        kotlin.jvm.internal.g.e(plan, "plan");
        this.f16457a = name;
        this.f16458b = plan;
        this.c = bVar;
        this.f16459d = cVar;
    }
}

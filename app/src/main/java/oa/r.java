package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes2.dex */
public final class r extends b0.e.d.a.b.AbstractC0312d {

    /* renamed from: a  reason: collision with root package name */
    public final String f23009a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23010b;
    public final c0<b0.e.d.a.b.AbstractC0312d.AbstractC0313a> c;

    public r() {
        throw null;
    }

    public r(String str, int i10, c0 c0Var) {
        this.f23009a = str;
        this.f23010b = i10;
        this.c = c0Var;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0312d
    public final c0<b0.e.d.a.b.AbstractC0312d.AbstractC0313a> a() {
        return this.c;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0312d
    public final int b() {
        return this.f23010b;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0312d
    public final String c() {
        return this.f23009a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0312d)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0312d abstractC0312d = (b0.e.d.a.b.AbstractC0312d) obj;
        if (this.f23009a.equals(abstractC0312d.c()) && this.f23010b == abstractC0312d.b() && this.c.equals(abstractC0312d.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23009a.hashCode() ^ 1000003) * 1000003) ^ this.f23010b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f23009a + ", importance=" + this.f23010b + ", frames=" + this.c + "}";
    }
}

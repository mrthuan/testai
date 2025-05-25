package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes2.dex */
public final class n extends b0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final c0<b0.e.d.a.b.AbstractC0312d> f22993a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.e.d.a.b.AbstractC0311b f22994b;
    public final b0.a c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.a.b.c f22995d;

    /* renamed from: e  reason: collision with root package name */
    public final c0<b0.e.d.a.b.AbstractC0309a> f22996e;

    public n() {
        throw null;
    }

    public n(c0 c0Var, b0.e.d.a.b.AbstractC0311b abstractC0311b, b0.a aVar, b0.e.d.a.b.c cVar, c0 c0Var2) {
        this.f22993a = c0Var;
        this.f22994b = abstractC0311b;
        this.c = aVar;
        this.f22995d = cVar;
        this.f22996e = c0Var2;
    }

    @Override // oa.b0.e.d.a.b
    public final b0.a a() {
        return this.c;
    }

    @Override // oa.b0.e.d.a.b
    public final c0<b0.e.d.a.b.AbstractC0309a> b() {
        return this.f22996e;
    }

    @Override // oa.b0.e.d.a.b
    public final b0.e.d.a.b.AbstractC0311b c() {
        return this.f22994b;
    }

    @Override // oa.b0.e.d.a.b
    public final b0.e.d.a.b.c d() {
        return this.f22995d;
    }

    @Override // oa.b0.e.d.a.b
    public final c0<b0.e.d.a.b.AbstractC0312d> e() {
        return this.f22993a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b)) {
            return false;
        }
        b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
        c0<b0.e.d.a.b.AbstractC0312d> c0Var = this.f22993a;
        if (c0Var != null ? c0Var.equals(bVar.e()) : bVar.e() == null) {
            b0.e.d.a.b.AbstractC0311b abstractC0311b = this.f22994b;
            if (abstractC0311b != null ? abstractC0311b.equals(bVar.c()) : bVar.c() == null) {
                b0.a aVar = this.c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f22995d.equals(bVar.d()) && this.f22996e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = 0;
        c0<b0.e.d.a.b.AbstractC0312d> c0Var = this.f22993a;
        if (c0Var == null) {
            hashCode = 0;
        } else {
            hashCode = c0Var.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        b0.e.d.a.b.AbstractC0311b abstractC0311b = this.f22994b;
        if (abstractC0311b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC0311b.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        b0.a aVar = this.c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((i10 ^ i12) * 1000003) ^ this.f22995d.hashCode()) * 1000003) ^ this.f22996e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f22993a + ", exception=" + this.f22994b + ", appExitInfo=" + this.c + ", signal=" + this.f22995d + ", binaries=" + this.f22996e + "}";
    }
}

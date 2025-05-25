package oa;

import oa.d0;

/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes2.dex */
public final class x extends d0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0.a f23037a;

    /* renamed from: b  reason: collision with root package name */
    public final d0.c f23038b;
    public final d0.b c;

    public x(y yVar, a0 a0Var, z zVar) {
        this.f23037a = yVar;
        this.f23038b = a0Var;
        this.c = zVar;
    }

    @Override // oa.d0
    public final d0.a a() {
        return this.f23037a;
    }

    @Override // oa.d0
    public final d0.b b() {
        return this.c;
    }

    @Override // oa.d0
    public final d0.c c() {
        return this.f23038b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f23037a.equals(d0Var.a()) && this.f23038b.equals(d0Var.c()) && this.c.equals(d0Var.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23037a.hashCode() ^ 1000003) * 1000003) ^ this.f23038b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f23037a + ", osData=" + this.f23038b + ", deviceData=" + this.c + "}";
    }
}

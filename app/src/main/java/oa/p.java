package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes2.dex */
public final class p extends b0.e.d.a.b.AbstractC0311b {

    /* renamed from: a  reason: collision with root package name */
    public final String f23003a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23004b;
    public final c0<b0.e.d.a.b.AbstractC0312d.AbstractC0313a> c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.a.b.AbstractC0311b f23005d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23006e;

    public p() {
        throw null;
    }

    public p(String str, String str2, c0 c0Var, b0.e.d.a.b.AbstractC0311b abstractC0311b, int i10) {
        this.f23003a = str;
        this.f23004b = str2;
        this.c = c0Var;
        this.f23005d = abstractC0311b;
        this.f23006e = i10;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0311b
    public final b0.e.d.a.b.AbstractC0311b a() {
        return this.f23005d;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0311b
    public final c0<b0.e.d.a.b.AbstractC0312d.AbstractC0313a> b() {
        return this.c;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0311b
    public final int c() {
        return this.f23006e;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0311b
    public final String d() {
        return this.f23004b;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0311b
    public final String e() {
        return this.f23003a;
    }

    public final boolean equals(Object obj) {
        String str;
        b0.e.d.a.b.AbstractC0311b abstractC0311b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0311b)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0311b abstractC0311b2 = (b0.e.d.a.b.AbstractC0311b) obj;
        if (this.f23003a.equals(abstractC0311b2.e()) && ((str = this.f23004b) != null ? str.equals(abstractC0311b2.d()) : abstractC0311b2.d() == null) && this.c.equals(abstractC0311b2.b()) && ((abstractC0311b = this.f23005d) != null ? abstractC0311b.equals(abstractC0311b2.a()) : abstractC0311b2.a() == null) && this.f23006e == abstractC0311b2.c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f23003a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f23004b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        b0.e.d.a.b.AbstractC0311b abstractC0311b = this.f23005d;
        if (abstractC0311b != null) {
            i10 = abstractC0311b.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f23006e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f23003a);
        sb2.append(", reason=");
        sb2.append(this.f23004b);
        sb2.append(", frames=");
        sb2.append(this.c);
        sb2.append(", causedBy=");
        sb2.append(this.f23005d);
        sb2.append(", overflowCount=");
        return a6.h.g(sb2, this.f23006e, "}");
    }
}

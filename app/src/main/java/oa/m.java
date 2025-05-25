package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes2.dex */
public final class m extends b0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final b0.e.d.a.b f22985a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<b0.c> f22986b;
    public final c0<b0.c> c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f22987d;

    /* renamed from: e  reason: collision with root package name */
    public final int f22988e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.e.d.a.AbstractC0308a {

        /* renamed from: a  reason: collision with root package name */
        public b0.e.d.a.b f22989a;

        /* renamed from: b  reason: collision with root package name */
        public c0<b0.c> f22990b;
        public c0<b0.c> c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f22991d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f22992e;

        public a(b0.e.d.a aVar) {
            this.f22989a = aVar.c();
            this.f22990b = aVar.b();
            this.c = aVar.d();
            this.f22991d = aVar.a();
            this.f22992e = Integer.valueOf(aVar.e());
        }

        public final m a() {
            String str;
            if (this.f22989a == null) {
                str = " execution";
            } else {
                str = "";
            }
            if (this.f22992e == null) {
                str = str.concat(" uiOrientation");
            }
            if (str.isEmpty()) {
                return new m(this.f22989a, this.f22990b, this.c, this.f22991d, this.f22992e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public m() {
        throw null;
    }

    public m(b0.e.d.a.b bVar, c0 c0Var, c0 c0Var2, Boolean bool, int i10) {
        this.f22985a = bVar;
        this.f22986b = c0Var;
        this.c = c0Var2;
        this.f22987d = bool;
        this.f22988e = i10;
    }

    @Override // oa.b0.e.d.a
    public final Boolean a() {
        return this.f22987d;
    }

    @Override // oa.b0.e.d.a
    public final c0<b0.c> b() {
        return this.f22986b;
    }

    @Override // oa.b0.e.d.a
    public final b0.e.d.a.b c() {
        return this.f22985a;
    }

    @Override // oa.b0.e.d.a
    public final c0<b0.c> d() {
        return this.c;
    }

    @Override // oa.b0.e.d.a
    public final int e() {
        return this.f22988e;
    }

    public final boolean equals(Object obj) {
        c0<b0.c> c0Var;
        c0<b0.c> c0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a)) {
            return false;
        }
        b0.e.d.a aVar = (b0.e.d.a) obj;
        if (this.f22985a.equals(aVar.c()) && ((c0Var = this.f22986b) != null ? c0Var.equals(aVar.b()) : aVar.b() == null) && ((c0Var2 = this.c) != null ? c0Var2.equals(aVar.d()) : aVar.d() == null) && ((bool = this.f22987d) != null ? bool.equals(aVar.a()) : aVar.a() == null) && this.f22988e == aVar.e()) {
            return true;
        }
        return false;
    }

    @Override // oa.b0.e.d.a
    public final a f() {
        return new a(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f22985a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        c0<b0.c> c0Var = this.f22986b;
        if (c0Var == null) {
            hashCode = 0;
        } else {
            hashCode = c0Var.hashCode();
        }
        int i11 = (hashCode3 ^ hashCode) * 1000003;
        c0<b0.c> c0Var2 = this.c;
        if (c0Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c0Var2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        Boolean bool = this.f22987d;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((i12 ^ i10) * 1000003) ^ this.f22988e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f22985a);
        sb2.append(", customAttributes=");
        sb2.append(this.f22986b);
        sb2.append(", internalKeys=");
        sb2.append(this.c);
        sb2.append(", background=");
        sb2.append(this.f22987d);
        sb2.append(", uiOrientation=");
        return a6.h.g(sb2, this.f22988e, "}");
    }
}

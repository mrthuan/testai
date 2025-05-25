package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes2.dex */
public final class h extends b0.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f22935a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22936b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f22937d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f22938e;

    /* renamed from: f  reason: collision with root package name */
    public final b0.e.a f22939f;

    /* renamed from: g  reason: collision with root package name */
    public final b0.e.f f22940g;

    /* renamed from: h  reason: collision with root package name */
    public final b0.e.AbstractC0316e f22941h;

    /* renamed from: i  reason: collision with root package name */
    public final b0.e.c f22942i;

    /* renamed from: j  reason: collision with root package name */
    public final c0<b0.e.d> f22943j;

    /* renamed from: k  reason: collision with root package name */
    public final int f22944k;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.e.b {

        /* renamed from: a  reason: collision with root package name */
        public String f22945a;

        /* renamed from: b  reason: collision with root package name */
        public String f22946b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public Long f22947d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f22948e;

        /* renamed from: f  reason: collision with root package name */
        public b0.e.a f22949f;

        /* renamed from: g  reason: collision with root package name */
        public b0.e.f f22950g;

        /* renamed from: h  reason: collision with root package name */
        public b0.e.AbstractC0316e f22951h;

        /* renamed from: i  reason: collision with root package name */
        public b0.e.c f22952i;

        /* renamed from: j  reason: collision with root package name */
        public c0<b0.e.d> f22953j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f22954k;

        public a(b0.e eVar) {
            this.f22945a = eVar.e();
            this.f22946b = eVar.g();
            this.c = Long.valueOf(eVar.i());
            this.f22947d = eVar.c();
            this.f22948e = Boolean.valueOf(eVar.k());
            this.f22949f = eVar.a();
            this.f22950g = eVar.j();
            this.f22951h = eVar.h();
            this.f22952i = eVar.b();
            this.f22953j = eVar.d();
            this.f22954k = Integer.valueOf(eVar.f());
        }

        public final h a() {
            String str;
            if (this.f22945a == null) {
                str = " generator";
            } else {
                str = "";
            }
            if (this.f22946b == null) {
                str = str.concat(" identifier");
            }
            if (this.c == null) {
                str = a6.h.c(str, " startedAt");
            }
            if (this.f22948e == null) {
                str = a6.h.c(str, " crashed");
            }
            if (this.f22949f == null) {
                str = a6.h.c(str, " app");
            }
            if (this.f22954k == null) {
                str = a6.h.c(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new h(this.f22945a, this.f22946b, this.c.longValue(), this.f22947d, this.f22948e.booleanValue(), this.f22949f, this.f22950g, this.f22951h, this.f22952i, this.f22953j, this.f22954k.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public h() {
        throw null;
    }

    public h(String str, String str2, long j10, Long l10, boolean z10, b0.e.a aVar, b0.e.f fVar, b0.e.AbstractC0316e abstractC0316e, b0.e.c cVar, c0 c0Var, int i10) {
        this.f22935a = str;
        this.f22936b = str2;
        this.c = j10;
        this.f22937d = l10;
        this.f22938e = z10;
        this.f22939f = aVar;
        this.f22940g = fVar;
        this.f22941h = abstractC0316e;
        this.f22942i = cVar;
        this.f22943j = c0Var;
        this.f22944k = i10;
    }

    @Override // oa.b0.e
    public final b0.e.a a() {
        return this.f22939f;
    }

    @Override // oa.b0.e
    public final b0.e.c b() {
        return this.f22942i;
    }

    @Override // oa.b0.e
    public final Long c() {
        return this.f22937d;
    }

    @Override // oa.b0.e
    public final c0<b0.e.d> d() {
        return this.f22943j;
    }

    @Override // oa.b0.e
    public final String e() {
        return this.f22935a;
    }

    public final boolean equals(Object obj) {
        Long l10;
        b0.e.f fVar;
        b0.e.AbstractC0316e abstractC0316e;
        b0.e.c cVar;
        c0<b0.e.d> c0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e)) {
            return false;
        }
        b0.e eVar = (b0.e) obj;
        if (this.f22935a.equals(eVar.e()) && this.f22936b.equals(eVar.g()) && this.c == eVar.i() && ((l10 = this.f22937d) != null ? l10.equals(eVar.c()) : eVar.c() == null) && this.f22938e == eVar.k() && this.f22939f.equals(eVar.a()) && ((fVar = this.f22940g) != null ? fVar.equals(eVar.j()) : eVar.j() == null) && ((abstractC0316e = this.f22941h) != null ? abstractC0316e.equals(eVar.h()) : eVar.h() == null) && ((cVar = this.f22942i) != null ? cVar.equals(eVar.b()) : eVar.b() == null) && ((c0Var = this.f22943j) != null ? c0Var.equals(eVar.d()) : eVar.d() == null) && this.f22944k == eVar.f()) {
            return true;
        }
        return false;
    }

    @Override // oa.b0.e
    public final int f() {
        return this.f22944k;
    }

    @Override // oa.b0.e
    public final String g() {
        return this.f22936b;
    }

    @Override // oa.b0.e
    public final b0.e.AbstractC0316e h() {
        return this.f22941h;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.c;
        int hashCode5 = (((((this.f22935a.hashCode() ^ 1000003) * 1000003) ^ this.f22936b.hashCode()) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i11 = 0;
        Long l10 = this.f22937d;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i12 = (hashCode5 ^ hashCode) * 1000003;
        if (this.f22938e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode6 = (((i12 ^ i10) * 1000003) ^ this.f22939f.hashCode()) * 1000003;
        b0.e.f fVar = this.f22940g;
        if (fVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fVar.hashCode();
        }
        int i13 = (hashCode6 ^ hashCode2) * 1000003;
        b0.e.AbstractC0316e abstractC0316e = this.f22941h;
        if (abstractC0316e == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = abstractC0316e.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        b0.e.c cVar = this.f22942i;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        c0<b0.e.d> c0Var = this.f22943j;
        if (c0Var != null) {
            i11 = c0Var.hashCode();
        }
        return ((i15 ^ i11) * 1000003) ^ this.f22944k;
    }

    @Override // oa.b0.e
    public final long i() {
        return this.c;
    }

    @Override // oa.b0.e
    public final b0.e.f j() {
        return this.f22940g;
    }

    @Override // oa.b0.e
    public final boolean k() {
        return this.f22938e;
    }

    @Override // oa.b0.e
    public final a l() {
        return new a(this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f22935a);
        sb2.append(", identifier=");
        sb2.append(this.f22936b);
        sb2.append(", startedAt=");
        sb2.append(this.c);
        sb2.append(", endedAt=");
        sb2.append(this.f22937d);
        sb2.append(", crashed=");
        sb2.append(this.f22938e);
        sb2.append(", app=");
        sb2.append(this.f22939f);
        sb2.append(", user=");
        sb2.append(this.f22940g);
        sb2.append(", os=");
        sb2.append(this.f22941h);
        sb2.append(", device=");
        sb2.append(this.f22942i);
        sb2.append(", events=");
        sb2.append(this.f22943j);
        sb2.append(", generatorType=");
        return a6.h.g(sb2, this.f22944k, "}");
    }
}

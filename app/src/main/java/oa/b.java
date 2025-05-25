package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes2.dex */
public final class b extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f22893b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22894d;

    /* renamed from: e  reason: collision with root package name */
    public final String f22895e;

    /* renamed from: f  reason: collision with root package name */
    public final String f22896f;

    /* renamed from: g  reason: collision with root package name */
    public final String f22897g;

    /* renamed from: h  reason: collision with root package name */
    public final b0.e f22898h;

    /* renamed from: i  reason: collision with root package name */
    public final b0.d f22899i;

    /* renamed from: j  reason: collision with root package name */
    public final b0.a f22900j;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.b {

        /* renamed from: a  reason: collision with root package name */
        public String f22901a;

        /* renamed from: b  reason: collision with root package name */
        public String f22902b;
        public Integer c;

        /* renamed from: d  reason: collision with root package name */
        public String f22903d;

        /* renamed from: e  reason: collision with root package name */
        public String f22904e;

        /* renamed from: f  reason: collision with root package name */
        public String f22905f;

        /* renamed from: g  reason: collision with root package name */
        public b0.e f22906g;

        /* renamed from: h  reason: collision with root package name */
        public b0.d f22907h;

        /* renamed from: i  reason: collision with root package name */
        public b0.a f22908i;

        public a(b0 b0Var) {
            this.f22901a = b0Var.h();
            this.f22902b = b0Var.d();
            this.c = Integer.valueOf(b0Var.g());
            this.f22903d = b0Var.e();
            this.f22904e = b0Var.b();
            this.f22905f = b0Var.c();
            this.f22906g = b0Var.i();
            this.f22907h = b0Var.f();
            this.f22908i = b0Var.a();
        }

        public final b a() {
            String str;
            if (this.f22901a == null) {
                str = " sdkVersion";
            } else {
                str = "";
            }
            if (this.f22902b == null) {
                str = str.concat(" gmpAppId");
            }
            if (this.c == null) {
                str = a6.h.c(str, " platform");
            }
            if (this.f22903d == null) {
                str = a6.h.c(str, " installationUuid");
            }
            if (this.f22904e == null) {
                str = a6.h.c(str, " buildVersion");
            }
            if (this.f22905f == null) {
                str = a6.h.c(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.f22901a, this.f22902b, this.c.intValue(), this.f22903d, this.f22904e, this.f22905f, this.f22906g, this.f22907h, this.f22908i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, b0.e eVar, b0.d dVar, b0.a aVar) {
        this.f22893b = str;
        this.c = str2;
        this.f22894d = i10;
        this.f22895e = str3;
        this.f22896f = str4;
        this.f22897g = str5;
        this.f22898h = eVar;
        this.f22899i = dVar;
        this.f22900j = aVar;
    }

    @Override // oa.b0
    public final b0.a a() {
        return this.f22900j;
    }

    @Override // oa.b0
    public final String b() {
        return this.f22896f;
    }

    @Override // oa.b0
    public final String c() {
        return this.f22897g;
    }

    @Override // oa.b0
    public final String d() {
        return this.c;
    }

    @Override // oa.b0
    public final String e() {
        return this.f22895e;
    }

    public final boolean equals(Object obj) {
        b0.e eVar;
        b0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f22893b.equals(b0Var.h()) && this.c.equals(b0Var.d()) && this.f22894d == b0Var.g() && this.f22895e.equals(b0Var.e()) && this.f22896f.equals(b0Var.b()) && this.f22897g.equals(b0Var.c()) && ((eVar = this.f22898h) != null ? eVar.equals(b0Var.i()) : b0Var.i() == null) && ((dVar = this.f22899i) != null ? dVar.equals(b0Var.f()) : b0Var.f() == null)) {
            b0.a aVar = this.f22900j;
            if (aVar == null) {
                if (b0Var.a() == null) {
                    return true;
                }
            } else if (aVar.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // oa.b0
    public final b0.d f() {
        return this.f22899i;
    }

    @Override // oa.b0
    public final int g() {
        return this.f22894d;
    }

    @Override // oa.b0
    public final String h() {
        return this.f22893b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((((((this.f22893b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f22894d) * 1000003) ^ this.f22895e.hashCode()) * 1000003) ^ this.f22896f.hashCode()) * 1000003) ^ this.f22897g.hashCode()) * 1000003;
        int i10 = 0;
        b0.e eVar = this.f22898h;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int i11 = (hashCode3 ^ hashCode) * 1000003;
        b0.d dVar = this.f22899i;
        if (dVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = dVar.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        b0.a aVar = this.f22900j;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i12 ^ i10;
    }

    @Override // oa.b0
    public final b0.e i() {
        return this.f22898h;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f22893b + ", gmpAppId=" + this.c + ", platform=" + this.f22894d + ", installationUuid=" + this.f22895e + ", buildVersion=" + this.f22896f + ", displayVersion=" + this.f22897g + ", session=" + this.f22898h + ", ndkPayload=" + this.f22899i + ", appExitInfo=" + this.f22900j + "}";
    }
}

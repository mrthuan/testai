package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* loaded from: classes2.dex */
public final class c extends b0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f22910a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22911b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22912d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22913e;

    /* renamed from: f  reason: collision with root package name */
    public final long f22914f;

    /* renamed from: g  reason: collision with root package name */
    public final long f22915g;

    /* renamed from: h  reason: collision with root package name */
    public final String f22916h;

    /* renamed from: i  reason: collision with root package name */
    public final c0<b0.a.AbstractC0306a> f22917i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.a.b {

        /* renamed from: a  reason: collision with root package name */
        public Integer f22918a;

        /* renamed from: b  reason: collision with root package name */
        public String f22919b;
        public Integer c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f22920d;

        /* renamed from: e  reason: collision with root package name */
        public Long f22921e;

        /* renamed from: f  reason: collision with root package name */
        public Long f22922f;

        /* renamed from: g  reason: collision with root package name */
        public Long f22923g;

        /* renamed from: h  reason: collision with root package name */
        public String f22924h;

        /* renamed from: i  reason: collision with root package name */
        public c0<b0.a.AbstractC0306a> f22925i;

        public final c a() {
            String str;
            if (this.f22918a == null) {
                str = " pid";
            } else {
                str = "";
            }
            if (this.f22919b == null) {
                str = str.concat(" processName");
            }
            if (this.c == null) {
                str = a6.h.c(str, " reasonCode");
            }
            if (this.f22920d == null) {
                str = a6.h.c(str, " importance");
            }
            if (this.f22921e == null) {
                str = a6.h.c(str, " pss");
            }
            if (this.f22922f == null) {
                str = a6.h.c(str, " rss");
            }
            if (this.f22923g == null) {
                str = a6.h.c(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.f22918a.intValue(), this.f22919b, this.c.intValue(), this.f22920d.intValue(), this.f22921e.longValue(), this.f22922f.longValue(), this.f22923g.longValue(), this.f22924h, this.f22925i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a b(String str) {
            if (str != null) {
                this.f22919b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
    }

    public c() {
        throw null;
    }

    public c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, c0 c0Var) {
        this.f22910a = i10;
        this.f22911b = str;
        this.c = i11;
        this.f22912d = i12;
        this.f22913e = j10;
        this.f22914f = j11;
        this.f22915g = j12;
        this.f22916h = str2;
        this.f22917i = c0Var;
    }

    @Override // oa.b0.a
    public final c0<b0.a.AbstractC0306a> a() {
        return this.f22917i;
    }

    @Override // oa.b0.a
    public final int b() {
        return this.f22912d;
    }

    @Override // oa.b0.a
    public final int c() {
        return this.f22910a;
    }

    @Override // oa.b0.a
    public final String d() {
        return this.f22911b;
    }

    @Override // oa.b0.a
    public final long e() {
        return this.f22913e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a)) {
            return false;
        }
        b0.a aVar = (b0.a) obj;
        if (this.f22910a == aVar.c() && this.f22911b.equals(aVar.d()) && this.c == aVar.f() && this.f22912d == aVar.b() && this.f22913e == aVar.e() && this.f22914f == aVar.g() && this.f22915g == aVar.h() && ((str = this.f22916h) != null ? str.equals(aVar.i()) : aVar.i() == null)) {
            c0<b0.a.AbstractC0306a> c0Var = this.f22917i;
            if (c0Var == null) {
                if (aVar.a() == null) {
                    return true;
                }
            } else if (c0Var.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // oa.b0.a
    public final int f() {
        return this.c;
    }

    @Override // oa.b0.a
    public final long g() {
        return this.f22914f;
    }

    @Override // oa.b0.a
    public final long h() {
        return this.f22915g;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f22913e;
        long j11 = this.f22914f;
        long j12 = this.f22915g;
        int hashCode2 = (((((((((((((this.f22910a ^ 1000003) * 1000003) ^ this.f22911b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.f22912d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        int i10 = 0;
        String str = this.f22916h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        c0<b0.a.AbstractC0306a> c0Var = this.f22917i;
        if (c0Var != null) {
            i10 = c0Var.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // oa.b0.a
    public final String i() {
        return this.f22916h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f22910a + ", processName=" + this.f22911b + ", reasonCode=" + this.c + ", importance=" + this.f22912d + ", pss=" + this.f22913e + ", rss=" + this.f22914f + ", timestamp=" + this.f22915g + ", traceFile=" + this.f22916h + ", buildIdMappingForArch=" + this.f22917i + "}";
    }
}

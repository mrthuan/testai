package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes2.dex */
public final class k extends b0.e.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f22961a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22962b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22963d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22964e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f22965f;

    /* renamed from: g  reason: collision with root package name */
    public final int f22966g;

    /* renamed from: h  reason: collision with root package name */
    public final String f22967h;

    /* renamed from: i  reason: collision with root package name */
    public final String f22968i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f22969a;

        /* renamed from: b  reason: collision with root package name */
        public String f22970b;
        public Integer c;

        /* renamed from: d  reason: collision with root package name */
        public Long f22971d;

        /* renamed from: e  reason: collision with root package name */
        public Long f22972e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f22973f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f22974g;

        /* renamed from: h  reason: collision with root package name */
        public String f22975h;

        /* renamed from: i  reason: collision with root package name */
        public String f22976i;

        public final k a() {
            String str;
            if (this.f22969a == null) {
                str = " arch";
            } else {
                str = "";
            }
            if (this.f22970b == null) {
                str = str.concat(" model");
            }
            if (this.c == null) {
                str = a6.h.c(str, " cores");
            }
            if (this.f22971d == null) {
                str = a6.h.c(str, " ram");
            }
            if (this.f22972e == null) {
                str = a6.h.c(str, " diskSpace");
            }
            if (this.f22973f == null) {
                str = a6.h.c(str, " simulator");
            }
            if (this.f22974g == null) {
                str = a6.h.c(str, " state");
            }
            if (this.f22975h == null) {
                str = a6.h.c(str, " manufacturer");
            }
            if (this.f22976i == null) {
                str = a6.h.c(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new k(this.f22969a.intValue(), this.f22970b, this.c.intValue(), this.f22971d.longValue(), this.f22972e.longValue(), this.f22973f.booleanValue(), this.f22974g.intValue(), this.f22975h, this.f22976i);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f22961a = i10;
        this.f22962b = str;
        this.c = i11;
        this.f22963d = j10;
        this.f22964e = j11;
        this.f22965f = z10;
        this.f22966g = i12;
        this.f22967h = str2;
        this.f22968i = str3;
    }

    @Override // oa.b0.e.c
    public final int a() {
        return this.f22961a;
    }

    @Override // oa.b0.e.c
    public final int b() {
        return this.c;
    }

    @Override // oa.b0.e.c
    public final long c() {
        return this.f22964e;
    }

    @Override // oa.b0.e.c
    public final String d() {
        return this.f22967h;
    }

    @Override // oa.b0.e.c
    public final String e() {
        return this.f22962b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.c)) {
            return false;
        }
        b0.e.c cVar = (b0.e.c) obj;
        if (this.f22961a == cVar.a() && this.f22962b.equals(cVar.e()) && this.c == cVar.b() && this.f22963d == cVar.g() && this.f22964e == cVar.c() && this.f22965f == cVar.i() && this.f22966g == cVar.h() && this.f22967h.equals(cVar.d()) && this.f22968i.equals(cVar.f())) {
            return true;
        }
        return false;
    }

    @Override // oa.b0.e.c
    public final String f() {
        return this.f22968i;
    }

    @Override // oa.b0.e.c
    public final long g() {
        return this.f22963d;
    }

    @Override // oa.b0.e.c
    public final int h() {
        return this.f22966g;
    }

    public final int hashCode() {
        int i10;
        long j10 = this.f22963d;
        long j11 = this.f22964e;
        int hashCode = (((((((((this.f22961a ^ 1000003) * 1000003) ^ this.f22962b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f22965f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((hashCode ^ i10) * 1000003) ^ this.f22966g) * 1000003) ^ this.f22967h.hashCode()) * 1000003) ^ this.f22968i.hashCode();
    }

    @Override // oa.b0.e.c
    public final boolean i() {
        return this.f22965f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f22961a);
        sb2.append(", model=");
        sb2.append(this.f22962b);
        sb2.append(", cores=");
        sb2.append(this.c);
        sb2.append(", ram=");
        sb2.append(this.f22963d);
        sb2.append(", diskSpace=");
        sb2.append(this.f22964e);
        sb2.append(", simulator=");
        sb2.append(this.f22965f);
        sb2.append(", state=");
        sb2.append(this.f22966g);
        sb2.append(", manufacturer=");
        sb2.append(this.f22967h);
        sb2.append(", modelClass=");
        return androidx.activity.r.g(sb2, this.f22968i, "}");
    }
}

package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes2.dex */
public final class l extends b0.e.d {

    /* renamed from: a  reason: collision with root package name */
    public final long f22977a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22978b;
    public final b0.e.d.a c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.d.c f22979d;

    /* renamed from: e  reason: collision with root package name */
    public final b0.e.d.AbstractC0315d f22980e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        public Long f22981a;

        /* renamed from: b  reason: collision with root package name */
        public String f22982b;
        public b0.e.d.a c;

        /* renamed from: d  reason: collision with root package name */
        public b0.e.d.c f22983d;

        /* renamed from: e  reason: collision with root package name */
        public b0.e.d.AbstractC0315d f22984e;

        public a(b0.e.d dVar) {
            this.f22981a = Long.valueOf(dVar.d());
            this.f22982b = dVar.e();
            this.c = dVar.a();
            this.f22983d = dVar.b();
            this.f22984e = dVar.c();
        }

        public final l a() {
            String str;
            if (this.f22981a == null) {
                str = " timestamp";
            } else {
                str = "";
            }
            if (this.f22982b == null) {
                str = str.concat(" type");
            }
            if (this.c == null) {
                str = a6.h.c(str, " app");
            }
            if (this.f22983d == null) {
                str = a6.h.c(str, " device");
            }
            if (str.isEmpty()) {
                return new l(this.f22981a.longValue(), this.f22982b, this.c, this.f22983d, this.f22984e);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public l(long j10, String str, b0.e.d.a aVar, b0.e.d.c cVar, b0.e.d.AbstractC0315d abstractC0315d) {
        this.f22977a = j10;
        this.f22978b = str;
        this.c = aVar;
        this.f22979d = cVar;
        this.f22980e = abstractC0315d;
    }

    @Override // oa.b0.e.d
    public final b0.e.d.a a() {
        return this.c;
    }

    @Override // oa.b0.e.d
    public final b0.e.d.c b() {
        return this.f22979d;
    }

    @Override // oa.b0.e.d
    public final b0.e.d.AbstractC0315d c() {
        return this.f22980e;
    }

    @Override // oa.b0.e.d
    public final long d() {
        return this.f22977a;
    }

    @Override // oa.b0.e.d
    public final String e() {
        return this.f22978b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d)) {
            return false;
        }
        b0.e.d dVar = (b0.e.d) obj;
        if (this.f22977a == dVar.d() && this.f22978b.equals(dVar.e()) && this.c.equals(dVar.a()) && this.f22979d.equals(dVar.b())) {
            b0.e.d.AbstractC0315d abstractC0315d = this.f22980e;
            if (abstractC0315d == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (abstractC0315d.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f22977a;
        int hashCode2 = (((((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f22978b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f22979d.hashCode()) * 1000003;
        b0.e.d.AbstractC0315d abstractC0315d = this.f22980e;
        if (abstractC0315d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0315d.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f22977a + ", type=" + this.f22978b + ", app=" + this.c + ", device=" + this.f22979d + ", log=" + this.f22980e + "}";
    }
}

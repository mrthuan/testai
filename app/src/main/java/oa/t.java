package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes2.dex */
public final class t extends b0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    public final Double f23019a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23020b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23021d;

    /* renamed from: e  reason: collision with root package name */
    public final long f23022e;

    /* renamed from: f  reason: collision with root package name */
    public final long f23023f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Double f23024a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f23025b;
        public Boolean c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f23026d;

        /* renamed from: e  reason: collision with root package name */
        public Long f23027e;

        /* renamed from: f  reason: collision with root package name */
        public Long f23028f;

        public final t a() {
            String str;
            if (this.f23025b == null) {
                str = " batteryVelocity";
            } else {
                str = "";
            }
            if (this.c == null) {
                str = str.concat(" proximityOn");
            }
            if (this.f23026d == null) {
                str = a6.h.c(str, " orientation");
            }
            if (this.f23027e == null) {
                str = a6.h.c(str, " ramUsed");
            }
            if (this.f23028f == null) {
                str = a6.h.c(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new t(this.f23024a, this.f23025b.intValue(), this.c.booleanValue(), this.f23026d.intValue(), this.f23027e.longValue(), this.f23028f.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public t(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f23019a = d10;
        this.f23020b = i10;
        this.c = z10;
        this.f23021d = i11;
        this.f23022e = j10;
        this.f23023f = j11;
    }

    @Override // oa.b0.e.d.c
    public final Double a() {
        return this.f23019a;
    }

    @Override // oa.b0.e.d.c
    public final int b() {
        return this.f23020b;
    }

    @Override // oa.b0.e.d.c
    public final long c() {
        return this.f23023f;
    }

    @Override // oa.b0.e.d.c
    public final int d() {
        return this.f23021d;
    }

    @Override // oa.b0.e.d.c
    public final long e() {
        return this.f23022e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.c)) {
            return false;
        }
        b0.e.d.c cVar = (b0.e.d.c) obj;
        Double d10 = this.f23019a;
        if (d10 != null ? d10.equals(cVar.a()) : cVar.a() == null) {
            if (this.f23020b == cVar.b() && this.c == cVar.f() && this.f23021d == cVar.d() && this.f23022e == cVar.e() && this.f23023f == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // oa.b0.e.d.c
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d10 = this.f23019a;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f23020b) * 1000003;
        if (this.c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j10 = this.f23022e;
        long j11 = this.f23023f;
        return ((((((i11 ^ i10) * 1000003) ^ this.f23021d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f23019a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f23020b);
        sb2.append(", proximityOn=");
        sb2.append(this.c);
        sb2.append(", orientation=");
        sb2.append(this.f23021d);
        sb2.append(", ramUsed=");
        sb2.append(this.f23022e);
        sb2.append(", diskUsed=");
        return android.support.v4.media.session.h.e(sb2, this.f23023f, "}");
    }
}

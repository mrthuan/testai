package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes2.dex */
public final class o extends b0.e.d.a.b.AbstractC0309a {

    /* renamed from: a  reason: collision with root package name */
    public final long f22997a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22998b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f22999d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.e.d.a.b.AbstractC0309a.AbstractC0310a {

        /* renamed from: a  reason: collision with root package name */
        public Long f23000a;

        /* renamed from: b  reason: collision with root package name */
        public Long f23001b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f23002d;

        public final o a() {
            String str;
            if (this.f23000a == null) {
                str = " baseAddress";
            } else {
                str = "";
            }
            if (this.f23001b == null) {
                str = str.concat(" size");
            }
            if (this.c == null) {
                str = a6.h.c(str, " name");
            }
            if (str.isEmpty()) {
                return new o(this.f23000a.longValue(), this.f23001b.longValue(), this.c, this.f23002d);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public o(long j10, long j11, String str, String str2) {
        this.f22997a = j10;
        this.f22998b = j11;
        this.c = str;
        this.f22999d = str2;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0309a
    public final long a() {
        return this.f22997a;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0309a
    public final String b() {
        return this.c;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0309a
    public final long c() {
        return this.f22998b;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0309a
    public final String d() {
        return this.f22999d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0309a)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0309a abstractC0309a = (b0.e.d.a.b.AbstractC0309a) obj;
        if (this.f22997a == abstractC0309a.a() && this.f22998b == abstractC0309a.c() && this.c.equals(abstractC0309a.b())) {
            String str = this.f22999d;
            if (str == null) {
                if (abstractC0309a.d() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0309a.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f22997a;
        long j11 = this.f22998b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.f22999d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f22997a);
        sb2.append(", size=");
        sb2.append(this.f22998b);
        sb2.append(", name=");
        sb2.append(this.c);
        sb2.append(", uuid=");
        return androidx.activity.r.g(sb2, this.f22999d, "}");
    }
}

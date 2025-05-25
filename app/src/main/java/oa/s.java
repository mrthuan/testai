package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes2.dex */
public final class s extends b0.e.d.a.b.AbstractC0312d.AbstractC0313a {

    /* renamed from: a  reason: collision with root package name */
    public final long f23011a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23012b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23013d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23014e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    /* loaded from: classes2.dex */
    public static final class a extends b0.e.d.a.b.AbstractC0312d.AbstractC0313a.AbstractC0314a {

        /* renamed from: a  reason: collision with root package name */
        public Long f23015a;

        /* renamed from: b  reason: collision with root package name */
        public String f23016b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public Long f23017d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f23018e;

        public final s a() {
            String str;
            if (this.f23015a == null) {
                str = " pc";
            } else {
                str = "";
            }
            if (this.f23016b == null) {
                str = str.concat(" symbol");
            }
            if (this.f23017d == null) {
                str = a6.h.c(str, " offset");
            }
            if (this.f23018e == null) {
                str = a6.h.c(str, " importance");
            }
            if (str.isEmpty()) {
                return new s(this.f23015a.longValue(), this.f23016b, this.c, this.f23017d.longValue(), this.f23018e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public s(long j10, String str, String str2, long j11, int i10) {
        this.f23011a = j10;
        this.f23012b = str;
        this.c = str2;
        this.f23013d = j11;
        this.f23014e = i10;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0312d.AbstractC0313a
    public final String a() {
        return this.c;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0312d.AbstractC0313a
    public final int b() {
        return this.f23014e;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0312d.AbstractC0313a
    public final long c() {
        return this.f23013d;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0312d.AbstractC0313a
    public final long d() {
        return this.f23011a;
    }

    @Override // oa.b0.e.d.a.b.AbstractC0312d.AbstractC0313a
    public final String e() {
        return this.f23012b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0312d.AbstractC0313a)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0312d.AbstractC0313a abstractC0313a = (b0.e.d.a.b.AbstractC0312d.AbstractC0313a) obj;
        if (this.f23011a == abstractC0313a.d() && this.f23012b.equals(abstractC0313a.e()) && ((str = this.c) != null ? str.equals(abstractC0313a.a()) : abstractC0313a.a() == null) && this.f23013d == abstractC0313a.c() && this.f23014e == abstractC0313a.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f23011a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f23012b.hashCode()) * 1000003;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j11 = this.f23013d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f23014e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f23011a);
        sb2.append(", symbol=");
        sb2.append(this.f23012b);
        sb2.append(", file=");
        sb2.append(this.c);
        sb2.append(", offset=");
        sb2.append(this.f23013d);
        sb2.append(", importance=");
        return a6.h.g(sb2, this.f23014e, "}");
    }
}

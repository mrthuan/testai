package v6;

import java.util.Map;
import v6.n;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    public final String f30697a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f30698b;
    public final m c;

    /* renamed from: d  reason: collision with root package name */
    public final long f30699d;

    /* renamed from: e  reason: collision with root package name */
    public final long f30700e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f30701f;

    /* compiled from: AutoValue_EventInternal.java */
    /* loaded from: classes.dex */
    public static final class a extends n.a {

        /* renamed from: a  reason: collision with root package name */
        public String f30702a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f30703b;
        public m c;

        /* renamed from: d  reason: collision with root package name */
        public Long f30704d;

        /* renamed from: e  reason: collision with root package name */
        public Long f30705e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f30706f;

        public final h b() {
            String str;
            if (this.f30702a == null) {
                str = " transportName";
            } else {
                str = "";
            }
            if (this.c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.f30704d == null) {
                str = a6.h.c(str, " eventMillis");
            }
            if (this.f30705e == null) {
                str = a6.h.c(str, " uptimeMillis");
            }
            if (this.f30706f == null) {
                str = a6.h.c(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f30702a, this.f30703b, this.c, this.f30704d.longValue(), this.f30705e.longValue(), this.f30706f);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final a c(m mVar) {
            if (mVar != null) {
                this.c = mVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final a d(String str) {
            if (str != null) {
                this.f30702a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public h(String str, Integer num, m mVar, long j10, long j11, Map map) {
        this.f30697a = str;
        this.f30698b = num;
        this.c = mVar;
        this.f30699d = j10;
        this.f30700e = j11;
        this.f30701f = map;
    }

    @Override // v6.n
    public final Map<String, String> b() {
        return this.f30701f;
    }

    @Override // v6.n
    public final Integer c() {
        return this.f30698b;
    }

    @Override // v6.n
    public final m d() {
        return this.c;
    }

    @Override // v6.n
    public final long e() {
        return this.f30699d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f30697a.equals(nVar.g()) && ((num = this.f30698b) != null ? num.equals(nVar.c()) : nVar.c() == null) && this.c.equals(nVar.d()) && this.f30699d == nVar.e() && this.f30700e == nVar.h() && this.f30701f.equals(nVar.b())) {
            return true;
        }
        return false;
    }

    @Override // v6.n
    public final String g() {
        return this.f30697a;
    }

    @Override // v6.n
    public final long h() {
        return this.f30700e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f30697a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f30698b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j10 = this.f30699d;
        long j11 = this.f30700e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f30701f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f30697a + ", code=" + this.f30698b + ", encodedPayload=" + this.c + ", eventMillis=" + this.f30699d + ", uptimeMillis=" + this.f30700e + ", autoMetadata=" + this.f30701f + "}";
    }
}

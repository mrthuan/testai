package u6;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;
import u6.h;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: a  reason: collision with root package name */
    public final long f30242a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f30243b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f30244d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30245e;

    /* renamed from: f  reason: collision with root package name */
    public final long f30246f;

    /* renamed from: g  reason: collision with root package name */
    public final NetworkConnectionInfo f30247g;

    /* compiled from: AutoValue_LogEvent.java */
    /* loaded from: classes.dex */
    public static final class a extends h.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f30248a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f30249b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f30250d;

        /* renamed from: e  reason: collision with root package name */
        public String f30251e;

        /* renamed from: f  reason: collision with root package name */
        public Long f30252f;

        /* renamed from: g  reason: collision with root package name */
        public NetworkConnectionInfo f30253g;
    }

    public d(long j10, Integer num, long j11, byte[] bArr, String str, long j12, NetworkConnectionInfo networkConnectionInfo) {
        this.f30242a = j10;
        this.f30243b = num;
        this.c = j11;
        this.f30244d = bArr;
        this.f30245e = str;
        this.f30246f = j12;
        this.f30247g = networkConnectionInfo;
    }

    @Override // u6.h
    public final Integer a() {
        return this.f30243b;
    }

    @Override // u6.h
    public final long b() {
        return this.f30242a;
    }

    @Override // u6.h
    public final long c() {
        return this.c;
    }

    @Override // u6.h
    public final NetworkConnectionInfo d() {
        return this.f30247g;
    }

    @Override // u6.h
    public final byte[] e() {
        return this.f30244d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] e10;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f30242a == hVar.b() && ((num = this.f30243b) != null ? num.equals(hVar.a()) : hVar.a() == null) && this.c == hVar.c()) {
            if (hVar instanceof d) {
                e10 = ((d) hVar).f30244d;
            } else {
                e10 = hVar.e();
            }
            if (Arrays.equals(this.f30244d, e10) && ((str = this.f30245e) != null ? str.equals(hVar.f()) : hVar.f() == null) && this.f30246f == hVar.g()) {
                NetworkConnectionInfo networkConnectionInfo = this.f30247g;
                if (networkConnectionInfo == null) {
                    if (hVar.d() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(hVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // u6.h
    public final String f() {
        return this.f30245e;
    }

    @Override // u6.h
    public final long g() {
        return this.f30246f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f30242a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f30243b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f30244d)) * 1000003;
        String str = this.f30245e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f30246f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f30247g;
        if (networkConnectionInfo != null) {
            i11 = networkConnectionInfo.hashCode();
        }
        return i12 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f30242a + ", eventCode=" + this.f30243b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.f30244d) + ", sourceExtensionJsonProto3=" + this.f30245e + ", timezoneOffsetSeconds=" + this.f30246f + ", networkConnectionInfo=" + this.f30247g + "}";
    }
}

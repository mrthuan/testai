package u6;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: a  reason: collision with root package name */
    public final long f30254a;

    /* renamed from: b  reason: collision with root package name */
    public final long f30255b;
    public final ClientInfo c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f30256d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30257e;

    /* renamed from: f  reason: collision with root package name */
    public final List<h> f30258f;

    /* renamed from: g  reason: collision with root package name */
    public final QosTier f30259g;

    public e() {
        throw null;
    }

    public e(long j10, long j11, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f30254a = j10;
        this.f30255b = j11;
        this.c = clientInfo;
        this.f30256d = num;
        this.f30257e = str;
        this.f30258f = list;
        this.f30259g = qosTier;
    }

    @Override // u6.i
    public final ClientInfo a() {
        return this.c;
    }

    @Override // u6.i
    public final List<h> b() {
        return this.f30258f;
    }

    @Override // u6.i
    public final Integer c() {
        return this.f30256d;
    }

    @Override // u6.i
    public final String d() {
        return this.f30257e;
    }

    @Override // u6.i
    public final QosTier e() {
        return this.f30259g;
    }

    public final boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<h> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f30254a == iVar.f() && this.f30255b == iVar.g() && ((clientInfo = this.c) != null ? clientInfo.equals(iVar.a()) : iVar.a() == null) && ((num = this.f30256d) != null ? num.equals(iVar.c()) : iVar.c() == null) && ((str = this.f30257e) != null ? str.equals(iVar.d()) : iVar.d() == null) && ((list = this.f30258f) != null ? list.equals(iVar.b()) : iVar.b() == null)) {
            QosTier qosTier = this.f30259g;
            if (qosTier == null) {
                if (iVar.e() == null) {
                    return true;
                }
            } else if (qosTier.equals(iVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // u6.i
    public final long f() {
        return this.f30254a;
    }

    @Override // u6.i
    public final long g() {
        return this.f30255b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.f30254a;
        long j11 = this.f30255b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        int i11 = 0;
        ClientInfo clientInfo = this.c;
        if (clientInfo == null) {
            hashCode = 0;
        } else {
            hashCode = clientInfo.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        Integer num = this.f30256d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        String str = this.f30257e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        List<h> list = this.f30258f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        QosTier qosTier = this.f30259g;
        if (qosTier != null) {
            i11 = qosTier.hashCode();
        }
        return i15 ^ i11;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f30254a + ", requestUptimeMs=" + this.f30255b + ", clientInfo=" + this.c + ", logSource=" + this.f30256d + ", logSourceName=" + this.f30257e + ", logEvents=" + this.f30258f + ", qosTier=" + this.f30259g + "}";
    }
}

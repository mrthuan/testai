package u6;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: a  reason: collision with root package name */
    public final long f30260a;

    public f(long j10) {
        this.f30260a = j10;
    }

    @Override // u6.j
    public final long b() {
        return this.f30260a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof j) && this.f30260a == ((j) obj).b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f30260a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return android.support.v4.media.session.h.e(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f30260a, "}");
    }
}

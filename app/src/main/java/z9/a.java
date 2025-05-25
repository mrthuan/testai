package z9;

import android.support.v4.media.session.h;

/* compiled from: AutoValue_StartupTime.java */
/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    public final long f32301a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32302b;
    public final long c;

    public a(long j10, long j11, long j12) {
        this.f32301a = j10;
        this.f32302b = j11;
        this.c = j12;
    }

    @Override // z9.g
    public final long a() {
        return this.f32302b;
    }

    @Override // z9.g
    public final long b() {
        return this.f32301a;
    }

    @Override // z9.g
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f32301a == gVar.b() && this.f32302b == gVar.a() && this.c == gVar.c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f32301a;
        long j11 = this.f32302b;
        long j12 = this.c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f32301a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f32302b);
        sb2.append(", uptimeMillis=");
        return h.e(sb2, this.c, "}");
    }
}

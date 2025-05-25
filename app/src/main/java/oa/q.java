package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes2.dex */
public final class q extends b0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f23007a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23008b;
    public final long c;

    public q(String str, String str2, long j10) {
        this.f23007a = str;
        this.f23008b = str2;
        this.c = j10;
    }

    @Override // oa.b0.e.d.a.b.c
    public final long a() {
        return this.c;
    }

    @Override // oa.b0.e.d.a.b.c
    public final String b() {
        return this.f23008b;
    }

    @Override // oa.b0.e.d.a.b.c
    public final String c() {
        return this.f23007a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.c)) {
            return false;
        }
        b0.e.d.a.b.c cVar = (b0.e.d.a.b.c) obj;
        if (this.f23007a.equals(cVar.c()) && this.f23008b.equals(cVar.b()) && this.c == cVar.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.c;
        return ((((this.f23007a.hashCode() ^ 1000003) * 1000003) ^ this.f23008b.hashCode()) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f23007a);
        sb2.append(", code=");
        sb2.append(this.f23008b);
        sb2.append(", address=");
        return android.support.v4.media.session.h.e(sb2, this.c, "}");
    }
}

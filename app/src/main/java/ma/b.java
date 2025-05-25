package ma;

import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* loaded from: classes2.dex */
public final class b extends z {

    /* renamed from: a  reason: collision with root package name */
    public final oa.b0 f21878a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21879b;
    public final File c;

    public b(oa.b bVar, String str, File file) {
        this.f21878a = bVar;
        if (str != null) {
            this.f21879b = str;
            this.c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    @Override // ma.z
    public final oa.b0 a() {
        return this.f21878a;
    }

    @Override // ma.z
    public final File b() {
        return this.c;
    }

    @Override // ma.z
    public final String c() {
        return this.f21879b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f21878a.equals(zVar.a()) && this.f21879b.equals(zVar.c()) && this.c.equals(zVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21878a.hashCode() ^ 1000003) * 1000003) ^ this.f21879b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f21878a + ", sessionId=" + this.f21879b + ", reportFile=" + this.c + "}";
    }
}

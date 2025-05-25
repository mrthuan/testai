package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes2.dex */
public final class u extends b0.e.d.AbstractC0315d {

    /* renamed from: a  reason: collision with root package name */
    public final String f23029a;

    public u(String str) {
        this.f23029a = str;
    }

    @Override // oa.b0.e.d.AbstractC0315d
    public final String a() {
        return this.f23029a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.d.AbstractC0315d) {
            return this.f23029a.equals(((b0.e.d.AbstractC0315d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f23029a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.activity.r.g(new StringBuilder("Log{content="), this.f23029a, "}");
    }
}

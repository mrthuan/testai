package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes2.dex */
public final class w extends b0.e.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f23036a;

    public w(String str) {
        this.f23036a = str;
    }

    @Override // oa.b0.e.f
    public final String a() {
        return this.f23036a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0.e.f) {
            return this.f23036a.equals(((b0.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f23036a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.activity.r.g(new StringBuilder("User{identifier="), this.f23036a, "}");
    }
}

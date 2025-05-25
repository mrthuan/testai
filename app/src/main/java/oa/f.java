package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* loaded from: classes2.dex */
public final class f extends b0.d {

    /* renamed from: a  reason: collision with root package name */
    public final c0<b0.d.a> f22931a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22932b;

    public f() {
        throw null;
    }

    public f(c0 c0Var, String str) {
        this.f22931a = c0Var;
        this.f22932b = str;
    }

    @Override // oa.b0.d
    public final c0<b0.d.a> a() {
        return this.f22931a;
    }

    @Override // oa.b0.d
    public final String b() {
        return this.f22932b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.d)) {
            return false;
        }
        b0.d dVar = (b0.d) obj;
        if (this.f22931a.equals(dVar.a())) {
            String str = this.f22932b;
            if (str == null) {
                if (dVar.b() == null) {
                    return true;
                }
            } else if (str.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f22931a.hashCode() ^ 1000003) * 1000003;
        String str = this.f22932b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f22931a);
        sb2.append(", orgId=");
        return androidx.activity.r.g(sb2, this.f22932b, "}");
    }
}

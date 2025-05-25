package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes2.dex */
public final class e extends b0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f22929a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22930b;

    public e(String str, String str2) {
        this.f22929a = str;
        this.f22930b = str2;
    }

    @Override // oa.b0.c
    public final String a() {
        return this.f22929a;
    }

    @Override // oa.b0.c
    public final String b() {
        return this.f22930b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.c)) {
            return false;
        }
        b0.c cVar = (b0.c) obj;
        if (this.f22929a.equals(cVar.a()) && this.f22930b.equals(cVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22929a.hashCode() ^ 1000003) * 1000003) ^ this.f22930b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f22929a);
        sb2.append(", value=");
        return androidx.activity.r.g(sb2, this.f22930b, "}");
    }
}

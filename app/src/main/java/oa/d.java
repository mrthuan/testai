package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* loaded from: classes2.dex */
public final class d extends b0.a.AbstractC0306a {

    /* renamed from: a  reason: collision with root package name */
    public final String f22927a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22928b;
    public final String c;

    public d(String str, String str2, String str3) {
        this.f22927a = str;
        this.f22928b = str2;
        this.c = str3;
    }

    @Override // oa.b0.a.AbstractC0306a
    public final String a() {
        return this.f22927a;
    }

    @Override // oa.b0.a.AbstractC0306a
    public final String b() {
        return this.c;
    }

    @Override // oa.b0.a.AbstractC0306a
    public final String c() {
        return this.f22928b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a.AbstractC0306a)) {
            return false;
        }
        b0.a.AbstractC0306a abstractC0306a = (b0.a.AbstractC0306a) obj;
        if (this.f22927a.equals(abstractC0306a.a()) && this.f22928b.equals(abstractC0306a.c()) && this.c.equals(abstractC0306a.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f22927a.hashCode() ^ 1000003) * 1000003) ^ this.f22928b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f22927a);
        sb2.append(", libraryName=");
        sb2.append(this.f22928b);
        sb2.append(", buildId=");
        return androidx.activity.r.g(sb2, this.c, "}");
    }
}

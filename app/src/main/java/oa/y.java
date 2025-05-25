package oa;

import oa.d0;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes2.dex */
public final class y extends d0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f23039a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23040b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f23041d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23042e;

    /* renamed from: f  reason: collision with root package name */
    public final ja.d f23043f;

    public y(String str, String str2, String str3, String str4, int i10, ja.d dVar) {
        if (str != null) {
            this.f23039a = str;
            if (str2 != null) {
                this.f23040b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.f23041d = str4;
                        this.f23042e = i10;
                        if (dVar != null) {
                            this.f23043f = dVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // oa.d0.a
    public final String a() {
        return this.f23039a;
    }

    @Override // oa.d0.a
    public final int b() {
        return this.f23042e;
    }

    @Override // oa.d0.a
    public final ja.d c() {
        return this.f23043f;
    }

    @Override // oa.d0.a
    public final String d() {
        return this.f23041d;
    }

    @Override // oa.d0.a
    public final String e() {
        return this.f23040b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0.a)) {
            return false;
        }
        d0.a aVar = (d0.a) obj;
        if (this.f23039a.equals(aVar.a()) && this.f23040b.equals(aVar.e()) && this.c.equals(aVar.f()) && this.f23041d.equals(aVar.d()) && this.f23042e == aVar.b() && this.f23043f.equals(aVar.c())) {
            return true;
        }
        return false;
    }

    @Override // oa.d0.a
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((this.f23039a.hashCode() ^ 1000003) * 1000003) ^ this.f23040b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f23041d.hashCode()) * 1000003) ^ this.f23042e) * 1000003) ^ this.f23043f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f23039a + ", versionCode=" + this.f23040b + ", versionName=" + this.c + ", installUuid=" + this.f23041d + ", deliveryMechanism=" + this.f23042e + ", developmentPlatformProvider=" + this.f23043f + "}";
    }
}

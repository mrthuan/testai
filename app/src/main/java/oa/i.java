package oa;

import oa.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes2.dex */
public final class i extends b0.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f22955a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22956b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final b0.e.a.AbstractC0307a f22957d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f22958e;

    /* renamed from: f  reason: collision with root package name */
    public final String f22959f;

    /* renamed from: g  reason: collision with root package name */
    public final String f22960g;

    public i(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f22955a = str;
        this.f22956b = str2;
        this.c = str3;
        this.f22958e = str4;
        this.f22959f = str5;
        this.f22960g = str6;
    }

    @Override // oa.b0.e.a
    public final String a() {
        return this.f22959f;
    }

    @Override // oa.b0.e.a
    public final String b() {
        return this.f22960g;
    }

    @Override // oa.b0.e.a
    public final String c() {
        return this.c;
    }

    @Override // oa.b0.e.a
    public final String d() {
        return this.f22955a;
    }

    @Override // oa.b0.e.a
    public final String e() {
        return this.f22958e;
    }

    public final boolean equals(Object obj) {
        String str;
        b0.e.a.AbstractC0307a abstractC0307a;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.a)) {
            return false;
        }
        b0.e.a aVar = (b0.e.a) obj;
        if (this.f22955a.equals(aVar.d()) && this.f22956b.equals(aVar.g()) && ((str = this.c) != null ? str.equals(aVar.c()) : aVar.c() == null) && ((abstractC0307a = this.f22957d) != null ? abstractC0307a.equals(aVar.f()) : aVar.f() == null) && ((str2 = this.f22958e) != null ? str2.equals(aVar.e()) : aVar.e() == null) && ((str3 = this.f22959f) != null ? str3.equals(aVar.a()) : aVar.a() == null)) {
            String str4 = this.f22960g;
            if (str4 == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // oa.b0.e.a
    public final b0.e.a.AbstractC0307a f() {
        return this.f22957d;
    }

    @Override // oa.b0.e.a
    public final String g() {
        return this.f22956b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f22955a.hashCode() ^ 1000003) * 1000003) ^ this.f22956b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        b0.e.a.AbstractC0307a abstractC0307a = this.f22957d;
        if (abstractC0307a == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC0307a.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.f22958e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str3 = this.f22959f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        String str4 = this.f22960g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i14 ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f22955a);
        sb2.append(", version=");
        sb2.append(this.f22956b);
        sb2.append(", displayVersion=");
        sb2.append(this.c);
        sb2.append(", organization=");
        sb2.append(this.f22957d);
        sb2.append(", installationUuid=");
        sb2.append(this.f22958e);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f22959f);
        sb2.append(", developmentPlatformVersion=");
        return androidx.activity.r.g(sb2, this.f22960g, "}");
    }
}

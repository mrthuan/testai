package com.google.firebase.installations.local;

import a6.h;
import androidx.activity.r;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.b;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public final String f13605b;
    public final PersistedInstallation.RegistrationStatus c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13606d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13607e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13608f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13609g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13610h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: com.google.firebase.installations.local.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0176a extends b.a {

        /* renamed from: a  reason: collision with root package name */
        public String f13611a;

        /* renamed from: b  reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f13612b;
        public String c;

        /* renamed from: d  reason: collision with root package name */
        public String f13613d;

        /* renamed from: e  reason: collision with root package name */
        public Long f13614e;

        /* renamed from: f  reason: collision with root package name */
        public Long f13615f;

        /* renamed from: g  reason: collision with root package name */
        public String f13616g;

        public C0176a(b bVar) {
            this.f13611a = bVar.c();
            this.f13612b = bVar.f();
            this.c = bVar.a();
            this.f13613d = bVar.e();
            this.f13614e = Long.valueOf(bVar.b());
            this.f13615f = Long.valueOf(bVar.g());
            this.f13616g = bVar.d();
        }

        public final a a() {
            String str;
            if (this.f13612b == null) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (this.f13614e == null) {
                str = str.concat(" expiresInSecs");
            }
            if (this.f13615f == null) {
                str = h.c(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f13611a, this.f13612b, this.c, this.f13613d, this.f13614e.longValue(), this.f13615f.longValue(), this.f13616g);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public final C0176a b(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus != null) {
                this.f13612b = registrationStatus;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }
    }

    public a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j10, long j11, String str4) {
        this.f13605b = str;
        this.c = registrationStatus;
        this.f13606d = str2;
        this.f13607e = str3;
        this.f13608f = j10;
        this.f13609g = j11;
        this.f13610h = str4;
    }

    @Override // com.google.firebase.installations.local.b
    public final String a() {
        return this.f13606d;
    }

    @Override // com.google.firebase.installations.local.b
    public final long b() {
        return this.f13608f;
    }

    @Override // com.google.firebase.installations.local.b
    public final String c() {
        return this.f13605b;
    }

    @Override // com.google.firebase.installations.local.b
    public final String d() {
        return this.f13610h;
    }

    @Override // com.google.firebase.installations.local.b
    public final String e() {
        return this.f13607e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str3 = this.f13605b;
        if (str3 != null ? str3.equals(bVar.c()) : bVar.c() == null) {
            if (this.c.equals(bVar.f()) && ((str = this.f13606d) != null ? str.equals(bVar.a()) : bVar.a() == null) && ((str2 = this.f13607e) != null ? str2.equals(bVar.e()) : bVar.e() == null) && this.f13608f == bVar.b() && this.f13609g == bVar.g()) {
                String str4 = this.f13610h;
                if (str4 == null) {
                    if (bVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(bVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.b
    public final PersistedInstallation.RegistrationStatus f() {
        return this.c;
    }

    @Override // com.google.firebase.installations.local.b
    public final long g() {
        return this.f13609g;
    }

    public final C0176a h() {
        return new C0176a(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i10 = 0;
        String str = this.f13605b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.f13606d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f13607e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j10 = this.f13608f;
        long j11 = this.f13609g;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f13610h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f13605b);
        sb2.append(", registrationStatus=");
        sb2.append(this.c);
        sb2.append(", authToken=");
        sb2.append(this.f13606d);
        sb2.append(", refreshToken=");
        sb2.append(this.f13607e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f13608f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f13609g);
        sb2.append(", fisError=");
        return r.g(sb2, this.f13610h, "}");
    }
}

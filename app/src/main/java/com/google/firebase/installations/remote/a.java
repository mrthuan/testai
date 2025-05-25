package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes2.dex */
public final class a extends InstallationResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f13620a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13621b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final TokenResult f13622d;

    /* renamed from: e  reason: collision with root package name */
    public final InstallationResponse.ResponseCode f13623e;

    public a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f13620a = str;
        this.f13621b = str2;
        this.c = str3;
        this.f13622d = tokenResult;
        this.f13623e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final TokenResult a() {
        return this.f13622d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String b() {
        return this.f13621b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final InstallationResponse.ResponseCode d() {
        return this.f13623e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String e() {
        return this.f13620a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f13620a;
        if (str != null ? str.equals(installationResponse.e()) : installationResponse.e() == null) {
            String str2 = this.f13621b;
            if (str2 != null ? str2.equals(installationResponse.b()) : installationResponse.b() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(installationResponse.c()) : installationResponse.c() == null) {
                    TokenResult tokenResult = this.f13622d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.a()) : installationResponse.a() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f13623e;
                        if (responseCode == null) {
                            if (installationResponse.d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        String str = this.f13620a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f13621b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        TokenResult tokenResult = this.f13622d;
        if (tokenResult == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = tokenResult.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f13623e;
        if (responseCode != null) {
            i10 = responseCode.hashCode();
        }
        return i10 ^ i14;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f13620a + ", fid=" + this.f13621b + ", refreshToken=" + this.c + ", authToken=" + this.f13622d + ", responseCode=" + this.f13623e + "}";
    }
}

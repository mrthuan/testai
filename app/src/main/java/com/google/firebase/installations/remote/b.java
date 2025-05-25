package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes2.dex */
public final class b extends TokenResult {

    /* renamed from: a  reason: collision with root package name */
    public final String f13624a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13625b;
    public final TokenResult.ResponseCode c;

    public b(String str, long j10, TokenResult.ResponseCode responseCode) {
        this.f13624a = str;
        this.f13625b = j10;
        this.c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.ResponseCode a() {
        return this.c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final String b() {
        return this.f13624a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final long c() {
        return this.f13625b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f13624a;
        if (str != null ? str.equals(tokenResult.b()) : tokenResult.b() == null) {
            if (this.f13625b == tokenResult.c()) {
                TokenResult.ResponseCode responseCode = this.c;
                if (responseCode == null) {
                    if (tokenResult.a() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        String str = this.f13624a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f13625b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        TokenResult.ResponseCode responseCode = this.c;
        if (responseCode != null) {
            i10 = responseCode.hashCode();
        }
        return i10 ^ i11;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f13624a + ", tokenExpirationTimestamp=" + this.f13625b + ", responseCode=" + this.c + "}";
    }
}

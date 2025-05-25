package com.facebook.appevents;

import java.io.Serializable;

/* compiled from: AccessTokenAppIdPair.kt */
/* loaded from: classes.dex */
public final class AccessTokenAppIdPair implements Serializable {
    public static final a Companion = new a();
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    /* compiled from: AccessTokenAppIdPair.kt */
    /* loaded from: classes.dex */
    public static final class SerializationProxyV1 implements Serializable {
        public static final a Companion = new a();
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        /* compiled from: AccessTokenAppIdPair.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        public SerializationProxyV1(String str, String appId) {
            kotlin.jvm.internal.g.e(appId, "appId");
            this.accessTokenString = str;
            this.appId = appId;
        }

        private final Object readResolve() {
            return new AccessTokenAppIdPair(this.accessTokenString, this.appId);
        }
    }

    /* compiled from: AccessTokenAppIdPair.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public AccessTokenAppIdPair(String str, String applicationId) {
        kotlin.jvm.internal.g.e(applicationId, "applicationId");
        this.applicationId = applicationId;
        this.accessTokenString = com.facebook.internal.p.v(str) ? null : str;
    }

    private final Object writeReplace() {
        return new SerializationProxyV1(this.accessTokenString, this.applicationId);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (!com.facebook.internal.p.a(accessTokenAppIdPair.accessTokenString, this.accessTokenString) || !com.facebook.internal.p.a(accessTokenAppIdPair.applicationId, this.applicationId)) {
            return false;
        }
        return true;
    }

    public final String getAccessTokenString() {
        return this.accessTokenString;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public int hashCode() {
        int i10;
        String str = this.accessTokenString;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i10 ^ this.applicationId.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessTokenAppIdPair(com.facebook.a accessToken) {
        this(accessToken.f9426e, com.facebook.d.b());
        kotlin.jvm.internal.g.e(accessToken, "accessToken");
    }
}

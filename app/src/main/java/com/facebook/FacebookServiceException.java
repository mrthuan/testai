package com.facebook;

/* compiled from: FacebookServiceException.kt */
/* loaded from: classes.dex */
public final class FacebookServiceException extends FacebookException {
    public static final a Companion = new a();
    private static final long serialVersionUID = 1;
    private final FacebookRequestError requestError;

    /* compiled from: FacebookServiceException.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError requestError, String str) {
        super(str);
        kotlin.jvm.internal.g.e(requestError, "requestError");
        this.requestError = requestError;
    }

    public final FacebookRequestError getRequestError() {
        return this.requestError;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.requestError.f9409a + ", facebookErrorCode: " + this.requestError.f9410b + ", facebookErrorType: " + this.requestError.f9411d + ", message: " + this.requestError.a() + "}";
        kotlin.jvm.internal.g.d(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }

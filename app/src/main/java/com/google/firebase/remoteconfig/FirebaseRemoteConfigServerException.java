package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.httpStatusCode = i10;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.httpStatusCode = i10;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = i10;
    }

    public FirebaseRemoteConfigServerException(String str, Throwable th2, FirebaseRemoteConfigException.Code code) {
        super(str, th2, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, Throwable th2, FirebaseRemoteConfigException.Code code) {
        super(str, th2, code);
        this.httpStatusCode = i10;
    }
}

package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(String str, Throwable th2) {
        super(str, th2);
    }

    public FirebaseRemoteConfigClientException(String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
    }

    public FirebaseRemoteConfigClientException(String str, Throwable th2, FirebaseRemoteConfigException.Code code) {
        super(str, th2, code);
    }
}

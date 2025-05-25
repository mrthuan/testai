package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    private final Code code;

    /* loaded from: classes2.dex */
    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        
        private final int value;

        Code(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.code = Code.UNKNOWN;
    }

    public Code getCode() {
        return this.code;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2) {
        super(str, th2);
        this.code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Code code) {
        super(str);
        this.code = code;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2, Code code) {
        super(str, th2);
        this.code = code;
    }
}

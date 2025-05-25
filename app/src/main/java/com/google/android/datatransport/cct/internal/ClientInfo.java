package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class ClientInfo {

    /* loaded from: classes.dex */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        ClientType(int i10) {
            this.value = i10;
        }
    }

    public abstract u6.a a();

    public abstract ClientType b();
}

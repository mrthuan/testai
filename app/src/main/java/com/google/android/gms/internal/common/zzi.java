package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes2.dex */
public class zzi extends Handler {
    private final Looper zza;

    public zzi() {
        this.zza = Looper.getMainLooper();
    }

    public zzi(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzi(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}

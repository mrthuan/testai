package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class zza extends Handler {
    private final Looper zza;

    public zza() {
        this.zza = Looper.getMainLooper();
    }

    public zza(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}

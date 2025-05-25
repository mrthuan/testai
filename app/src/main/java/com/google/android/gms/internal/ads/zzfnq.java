package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfnq implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfnt.zzc;
        if (handler != null) {
            handler2 = zzfnt.zzc;
            runnable = zzfnt.zzd;
            handler2.post(runnable);
            handler3 = zzfnt.zzc;
            runnable2 = zzfnt.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}

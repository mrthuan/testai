package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhf extends BroadcastReceiver implements Runnable {
    private final Handler zza;

    public zzhf(zzhh zzhhVar, Handler handler, zzhg zzhgVar) {
        this.zza = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzrs extends Handler {
    final /* synthetic */ zzru zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrs(zzru zzruVar, Looper looper) {
        super(looper);
        this.zza = zzruVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzru.zza(this.zza, message);
    }
}

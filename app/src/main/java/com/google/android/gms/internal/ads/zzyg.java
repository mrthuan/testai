package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzyg {
    private final Handler zza;
    private final zzyi zzb;
    private boolean zzc;

    public zzyg(Handler handler, zzyi zzyiVar) {
        this.zza = handler;
        this.zzb = zzyiVar;
    }

    public final void zzc() {
        this.zzc = true;
    }
}

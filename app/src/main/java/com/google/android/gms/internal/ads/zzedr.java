package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzedr extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zzc;

    public zzedr(zzeds zzedsVar, AlertDialog alertDialog, Timer timer, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzc;
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}

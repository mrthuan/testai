package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcnz implements zzbix {
    final /* synthetic */ zzcoa zza;

    public zzcnz(zzcoa zzcoaVar) {
        this.zza = zzcoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcoa.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcny
                @Override // java.lang.Runnable
                public final void run() {
                    zzcof zzcofVar;
                    zzcofVar = zzcnz.this.zza.zzd;
                    zzcofVar.zzj();
                }
            });
        }
    }
}

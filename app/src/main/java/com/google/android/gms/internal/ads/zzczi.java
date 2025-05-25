package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzczi implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzczj zzczjVar = (zzczj) this.zza.get();
        if (zzczjVar != null) {
            zzczjVar.zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzcze
                @Override // com.google.android.gms.internal.ads.zzdcg
                public final void zza(Object obj) {
                    ((zzczc) obj).zzb();
                }
            });
        }
    }
}

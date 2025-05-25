package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzemn implements zzczb {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zza.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzczb
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfbq.zza(this.zza, new zzfbp() { // from class: com.google.android.gms.internal.ads.zzemm
            @Override // com.google.android.gms.internal.ads.zzfbp
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).Y(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }
}

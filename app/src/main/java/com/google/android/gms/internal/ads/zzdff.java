package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdff extends zzdch {
    public zzdff(Set set) {
        super(set);
    }

    public final synchronized void zza(final com.google.android.gms.ads.nonagon.signalgeneration.zzay zzayVar) {
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzdfd
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((zzdfc) obj).zze(com.google.android.gms.ads.nonagon.signalgeneration.zzay.this);
            }
        });
    }

    public final synchronized void zzb(final String str) {
        zzq(new zzdcg() { // from class: com.google.android.gms.internal.ads.zzdfe
            @Override // com.google.android.gms.internal.ads.zzdcg
            public final void zza(Object obj) {
                ((zzdfc) obj).zzf(str);
            }
        });
    }
}

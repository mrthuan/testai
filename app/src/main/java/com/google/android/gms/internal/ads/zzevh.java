package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzevh implements zzevo {
    private final boolean zza;

    public zzevh(zzfcg zzfcgVar) {
        boolean z10;
        if (zzfcgVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        zzevn zzevnVar;
        if (this.zza) {
            zzevnVar = new zzevn() { // from class: com.google.android.gms.internal.ads.zzevg
                @Override // com.google.android.gms.internal.ads.zzevn
                public final void zzj(Object obj) {
                    ((Bundle) obj).putBoolean("sdk_prefetch", true);
                }
            };
        } else {
            zzevnVar = null;
        }
        return zzgcj.zzh(zzevnVar);
    }
}

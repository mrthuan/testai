package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbjr implements zzbix {
    private final zzdvi zza;

    public zzbjr(zzdvi zzdviVar) {
        if (zzdviVar != null) {
            this.zza = zzdviVar;
            return;
        }
        throw new NullPointerException("The Inspector Manager must not be null");
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j10 = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j10 = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get("extras"), j10);
        }
    }
}

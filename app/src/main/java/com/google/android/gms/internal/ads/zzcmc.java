package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcmc implements zzcly {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcmc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcly
    public final void zza(Map map) {
        this.zza.g(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}

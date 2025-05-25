package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbiy implements zzbix {
    private final zzdvi zza;

    public zzbiy(zzdvi zzdviVar) {
        if (zzdviVar != null) {
            this.zza = zzdviVar;
            return;
        }
        throw new NullPointerException("The Inspector Manager must not be null");
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("persistentData") && !TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            this.zza.zzj((String) map.get("persistentData"));
        }
    }
}

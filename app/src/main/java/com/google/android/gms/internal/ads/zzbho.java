package com.google.android.gms.internal.ads;

import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbho implements zzbix {
    private final zzbhp zza;

    public zzbho(zzbhp zzbhpVar) {
        this.zza = zzbhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(NamingTable.TAG);
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("App event with no name parameter.");
        } else {
            this.zza.zzb(str, (String) map.get("info"));
        }
    }
}

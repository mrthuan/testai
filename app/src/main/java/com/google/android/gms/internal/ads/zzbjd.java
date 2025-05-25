package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbjd implements zzbix {
    private final Context zza;
    private final Map zzb;

    public zzbjd(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        char c;
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        if (!zzuVar.f10574x.zzp(this.zza)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int hashCode = str.hashCode();
        if (hashCode != 94399) {
            if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("_ac")) {
                    c = 0;
                }
                c = 65535;
            }
        } else {
            if (str.equals("_aa")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    com.google.android.gms.ads.internal.util.client.zzm.c("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                zzuVar.f10574x.zzh(this.zza, str2);
                return;
            }
            zzuVar.f10574x.zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            return;
        }
        zzuVar.f10574x.zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
    }
}

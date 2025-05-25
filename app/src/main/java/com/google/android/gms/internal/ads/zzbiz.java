package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbiz implements zzbix {
    private final zzbja zza;

    public zzbiz(zzbja zzbjaVar) {
        this.zza = zzbjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f10 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f10 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
        this.zza.zzc(equals);
        this.zza.zzb(equals2, f10);
        zzcejVar.zzay(equals);
    }
}

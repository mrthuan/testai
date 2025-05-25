package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdrn implements zzfjm {
    private final Map zza;
    private final zzbav zzb;

    public zzdrn(zzbav zzbavVar, Map map) {
        this.zza = map;
        this.zzb = zzbavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzd(zzfjf zzfjfVar, String str) {
        if (this.zza.containsKey(zzfjfVar)) {
            this.zzb.zzc(((zzdrm) this.zza.get(zzfjfVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdD(zzfjf zzfjfVar, String str, Throwable th2) {
        if (this.zza.containsKey(zzfjfVar)) {
            this.zzb.zzc(((zzdrm) this.zza.get(zzfjfVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdE(zzfjf zzfjfVar, String str) {
        if (this.zza.containsKey(zzfjfVar)) {
            this.zzb.zzc(((zzdrm) this.zza.get(zzfjfVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final void zzdC(zzfjf zzfjfVar, String str) {
    }
}

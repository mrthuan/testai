package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zztr implements zzvz {
    private final zzvz zza;
    private final zzfxr zzb;

    public zztr(zzvz zzvzVar, List list) {
        this.zza = zzvzVar;
        this.zzb = zzfxr.zzk(list);
    }

    public final zzfxr zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzm(long j10) {
        this.zza.zzm(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzo(zzkf zzkfVar) {
        return this.zza.zzo(zzkfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zzp() {
        return this.zza.zzp();
    }
}

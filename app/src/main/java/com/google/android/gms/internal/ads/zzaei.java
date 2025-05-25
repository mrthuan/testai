package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaei implements zzack {
    private final zzek zza = new zzek(4);
    private final zzadk zzb = new zzadk(-1, -1, "image/avif");

    private final boolean zza(zzacl zzaclVar, int i10) {
        this.zza.zzH(4);
        ((zzaby) zzaclVar).zzm(this.zza.zzM(), 0, 4, false);
        if (this.zza.zzu() != i10) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) {
        return this.zzb.zzb(zzaclVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzb.zze(zzacnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        this.zzb.zzi(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        ((zzaby) zzaclVar).zzl(4, false);
        if (!zza(zzaclVar, 1718909296) || !zza(zzaclVar, 1635150182)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}

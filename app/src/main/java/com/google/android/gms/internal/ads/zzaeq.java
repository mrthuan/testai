package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaeq implements zzack {
    private zzacn zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaep zzo;
    private zzaeu zzp;
    private final zzek zza = new zzek(4);
    private final zzek zzb = new zzek(9);
    private final zzek zzc = new zzek(11);
    private final zzek zzd = new zzek();
    private final zzaer zze = new zzaer();
    private int zzg = 1;

    private final zzek zza(zzacl zzaclVar) {
        if (this.zzl > this.zzd.zzc()) {
            zzek zzekVar = this.zzd;
            int zzc = zzekVar.zzc();
            zzekVar.zzI(new byte[Math.max(zzc + zzc, this.zzl)], 0);
        } else {
            this.zzd.zzK(0);
        }
        this.zzd.zzJ(this.zzl);
        ((zzaby) zzaclVar).zzn(this.zzd.zzM(), 0, this.zzl, false);
        return this.zzd;
    }

    private final void zzg() {
        if (!this.zzn) {
            this.zzf.zzO(new zzadh(-9223372036854775807L, 0L));
            this.zzn = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacl r17, com.google.android.gms.internal.ads.zzadf r18) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeq.zzb(com.google.android.gms.internal.ads.zzacl, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzf = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        zzaby zzabyVar = (zzaby) zzaclVar;
        zzabyVar.zzm(this.zza.zzM(), 0, 3, false);
        this.zza.zzK(0);
        if (this.zza.zzo() != 4607062) {
            return false;
        }
        zzabyVar.zzm(this.zza.zzM(), 0, 2, false);
        this.zza.zzK(0);
        if ((this.zza.zzq() & 250) != 0) {
            return false;
        }
        zzabyVar.zzm(this.zza.zzM(), 0, 4, false);
        this.zza.zzK(0);
        int zzg = this.zza.zzg();
        zzaclVar.zzj();
        zzaby zzabyVar2 = (zzaby) zzaclVar;
        zzabyVar2.zzl(zzg, false);
        zzabyVar2.zzm(this.zza.zzM(), 0, 4, false);
        this.zza.zzK(0);
        if (this.zza.zzg() != 0) {
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

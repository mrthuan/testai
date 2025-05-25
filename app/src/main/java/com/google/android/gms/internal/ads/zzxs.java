package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzxs extends zzxp {
    private final boolean zze;
    private final zzxi zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final int zzr;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:154:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzxs(int r5, com.google.android.gms.internal.ads.zzcd r6, int r7, com.google.android.gms.internal.ads.zzxi r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxs.<init>(int, com.google.android.gms.internal.ads.zzcd, int, com.google.android.gms.internal.ads.zzxi, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzxs zzxsVar, zzxs zzxsVar2) {
        zzfzc zzfzcVar;
        zzfzc zza;
        if (!zzxsVar.zze || !zzxsVar.zzh) {
            zzfzcVar = zzxt.zzb;
            zza = zzfzcVar.zza();
        } else {
            zza = zzxt.zzb;
        }
        zzfxg zzj = zzfxg.zzj();
        boolean z10 = zzxsVar.zzf.zzy;
        return zzj.zzc(Integer.valueOf(zzxsVar.zzk), Integer.valueOf(zzxsVar2.zzk), zza).zzc(Integer.valueOf(zzxsVar.zzj), Integer.valueOf(zzxsVar2.zzj), zza).zza();
    }

    public static /* synthetic */ int zzd(zzxs zzxsVar, zzxs zzxsVar2) {
        zzfxg zzc = zzfxg.zzj().zzd(zzxsVar.zzh, zzxsVar2.zzh).zzb(zzxsVar.zzm, zzxsVar2.zzm).zzd(zzxsVar.zzn, zzxsVar2.zzn).zzd(zzxsVar.zzi, zzxsVar2.zzi).zzd(zzxsVar.zze, zzxsVar2.zze).zzd(zzxsVar.zzg, zzxsVar2.zzg).zzc(Integer.valueOf(zzxsVar.zzl), Integer.valueOf(zzxsVar2.zzl), zzfzc.zzc().zza());
        boolean z10 = zzxsVar.zzp;
        zzfxg zzd = zzc.zzd(z10, zzxsVar2.zzp);
        boolean z11 = zzxsVar.zzq;
        zzfxg zzd2 = zzd.zzd(z11, zzxsVar2.zzq);
        if (z10 && z11) {
            zzd2 = zzd2.zzb(zzxsVar.zzr, zzxsVar2.zzr);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final int zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final /* bridge */ /* synthetic */ boolean zzc(zzxp zzxpVar) {
        zzxs zzxsVar = (zzxs) zzxpVar;
        if (zzet.zzG(this.zzd.zzm, zzxsVar.zzd.zzm)) {
            boolean z10 = this.zzf.zzF;
            if (this.zzp == zzxsVar.zzp && this.zzq == zzxsVar.zzq) {
                return true;
            }
            return false;
        }
        return false;
    }
}

package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzkx {
    private static final zzui zzt = new zzui(new Object(), -1);
    public final zzcc zza;
    public final zzui zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzhw zzf;
    public final boolean zzg;
    public final zzwi zzh;
    public final zzyc zzi;
    public final List zzj;
    public final zzui zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzbq zzn;
    public final boolean zzo = false;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzkx(zzcc zzccVar, zzui zzuiVar, long j10, long j11, int i10, zzhw zzhwVar, boolean z10, zzwi zzwiVar, zzyc zzycVar, List list, zzui zzuiVar2, boolean z11, int i11, zzbq zzbqVar, long j12, long j13, long j14, long j15, boolean z12) {
        this.zza = zzccVar;
        this.zzb = zzuiVar;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
        this.zzf = zzhwVar;
        this.zzg = z10;
        this.zzh = zzwiVar;
        this.zzi = zzycVar;
        this.zzj = list;
        this.zzk = zzuiVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = zzbqVar;
        this.zzp = j12;
        this.zzq = j13;
        this.zzr = j14;
        this.zzs = j15;
    }

    public static zzkx zzg(zzyc zzycVar) {
        zzcc zzccVar = zzcc.zza;
        zzui zzuiVar = zzt;
        return new zzkx(zzccVar, zzuiVar, -9223372036854775807L, 0L, 1, null, false, zzwi.zza, zzycVar, zzfxr.zzm(), zzuiVar, false, 0, zzbq.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzui zzh() {
        return zzt;
    }

    public final zzkx zza(zzui zzuiVar) {
        return new zzkx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzuiVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzkx zzb(zzui zzuiVar, long j10, long j11, long j12, long j13, zzwi zzwiVar, zzyc zzycVar, List list) {
        zzui zzuiVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        zzbq zzbqVar = this.zzn;
        long j14 = this.zzp;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzkx(this.zza, zzuiVar, j11, j12, this.zze, this.zzf, this.zzg, zzwiVar, zzycVar, list, zzuiVar2, z10, i10, zzbqVar, j14, j13, j10, elapsedRealtime, false);
    }

    public final zzkx zzc(boolean z10, int i10) {
        return new zzkx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzkx zzd(zzhw zzhwVar) {
        return new zzkx(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhwVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzkx zze(int i10) {
        return new zzkx(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzkx zzf(zzcc zzccVar) {
        return new zzkx(zzccVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final boolean zzi() {
        if (this.zze == 3 && this.zzl && this.zzm == 0) {
            return true;
        }
        return false;
    }
}

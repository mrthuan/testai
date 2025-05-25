package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaml {
    private final zzadp zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzaml(zzadp zzadpVar, boolean z10, boolean z11) {
        this.zza = zzadpVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzfi(bArr, 0, 0);
        this.zzh = false;
    }

    private final void zzg(int i10) {
        long j10 = this.zzj;
        if (j10 == -9223372036854775807L) {
            return;
        }
        this.zza.zzs(j10, this.zzk ? 1 : 0, (int) (this.zzf - this.zzi), i10, null);
    }

    private final void zzh() {
        boolean z10 = this.zzl;
        boolean z11 = this.zzk;
        int i10 = this.zze;
        boolean z12 = true;
        if (i10 != 5 && (!z10 || i10 != 1)) {
            z12 = false;
        }
        this.zzk = z11 | z12;
    }

    public final void zza(long j10) {
        zzh();
        this.zzf = j10;
        zzg(0);
        this.zzh = false;
    }

    public final void zzb(zzff zzffVar) {
        this.zzc.append(zzffVar.zza, zzffVar);
    }

    public final void zzc(zzfg zzfgVar) {
        this.zzb.append(zzfgVar.zzd, zzfgVar);
    }

    public final void zzd() {
        this.zzh = false;
    }

    public final void zze(long j10, int i10, long j11, boolean z10) {
        this.zze = i10;
        this.zzg = j11;
        this.zzf = j10;
        this.zzl = z10;
    }

    public final boolean zzf(long j10, int i10, boolean z10) {
        if (this.zze == 9) {
            if (z10 && this.zzh) {
                zzg(i10 + ((int) (j10 - this.zzf)));
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        zzh();
        return this.zzk;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzajd implements zzajj {
    private final zzaji zza;
    private final long zzb;
    private final long zzc;
    private final zzajo zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzajd(zzajo zzajoVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzdi.zzd(z11);
        this.zzd = zzajoVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 != j11 - j10 && !z10) {
            this.zze = 0;
        } else {
            this.zzf = j13;
            this.zze = 4;
        }
        this.zza = new zzaji();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzajj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzacl r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzd(com.google.android.gms.internal.ads.zzacl):long");
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final /* bridge */ /* synthetic */ zzadi zze() {
        if (this.zzf == 0) {
            return null;
        }
        return new zzajc(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzg(long j10) {
        this.zzh = Math.max(0L, Math.min(j10, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}

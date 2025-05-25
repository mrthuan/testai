package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamq implements zzamf {
    private final String zza;
    private final int zzb;
    private final zzek zzc;
    private final zzej zzd;
    private zzadp zze;
    private String zzf;
    private zzaf zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private String zzv;

    public zzamq(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
        zzek zzekVar = new zzek(1024);
        this.zzc = zzekVar;
        byte[] zzM = zzekVar.zzM();
        this.zzd = new zzej(zzM, zzM.length);
        this.zzl = -9223372036854775807L;
    }

    private final int zzf(zzej zzejVar) {
        int zza = zzejVar.zza();
        zzabf zzb = zzabg.zzb(zzejVar, true);
        this.zzv = zzb.zzc;
        this.zzs = zzb.zza;
        this.zzu = zzb.zzb;
        return zza - zzejVar.zza();
    }

    private static long zzg(zzej zzejVar) {
        return zzejVar.zzd((zzejVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
        if (r14.zzm == false) goto L105;
     */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r15) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamq.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zze = zzacnVar.zzw(zzansVar.zza(), 1);
        this.zzf = zzansVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        this.zzl = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
    }
}

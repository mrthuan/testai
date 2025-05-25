package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamo implements zzamf {
    private final zzani zza;
    private String zzb;
    private zzadp zzc;
    private zzamn zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamx zzg = new zzamx(32, 128);
    private final zzamx zzh = new zzamx(33, 128);
    private final zzamx zzi = new zzamx(34, 128);
    private final zzamx zzj = new zzamx(39, 128);
    private final zzamx zzk = new zzamx(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzek zzn = new zzek();

    public zzamo(zzani zzaniVar) {
        this.zza = zzaniVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        this.zzd.zzc(bArr, i10, i11);
        if (!this.zze) {
            this.zzg.zza(bArr, i10, i11);
            this.zzh.zza(bArr, i10, i11);
            this.zzi.zza(bArr, i10, i11);
        }
        this.zzj.zza(bArr, i10, i11);
        this.zzk.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01aa  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r32) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamo.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzb = zzansVar.zzb();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzamn(zzw);
        this.zza.zzb(zzacnVar, zzansVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
        zzdi.zzb(this.zzc);
        int i10 = zzet.zza;
        if (z10) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        this.zzm = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfh.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzamn zzamnVar = this.zzd;
        if (zzamnVar != null) {
            zzamnVar.zzd();
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamm implements zzamf {
    private final zzani zza;
    private long zze;
    private String zzg;
    private zzadp zzh;
    private zzaml zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamx zzb = new zzamx(7, 128);
    private final zzamx zzc = new zzamx(8, 128);
    private final zzamx zzd = new zzamx(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzek zzm = new zzek();

    public zzamm(zzani zzaniVar, boolean z10, boolean z11) {
        this.zza = zzaniVar;
    }

    private final void zzf(byte[] bArr, int i10, int i11) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i10, i11);
            this.zzc.zza(bArr, i10, i11);
        }
        this.zzd.zza(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r19) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamm.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzg = zzansVar.zzb();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 2);
        this.zzh = zzw;
        this.zzi = new zzaml(zzw, false, false);
        this.zza.zzb(zzacnVar, zzansVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
        zzdi.zzb(this.zzh);
        int i10 = zzet.zza;
        if (z10) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        boolean z10;
        this.zzk = j10;
        int i11 = i10 & 2;
        boolean z11 = this.zzl;
        if (i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzl = z10 | z11;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzfh.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaml zzamlVar = this.zzi;
        if (zzamlVar != null) {
            zzamlVar.zzd();
        }
    }
}

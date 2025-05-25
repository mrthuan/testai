package com.google.android.gms.internal.ads;

import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamk implements zzamf {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzanv zzb;
    private final zzek zzc;
    private final boolean[] zzd;
    private final zzami zze;
    private final zzamx zzf;
    private zzamj zzg;
    private long zzh;
    private String zzi;
    private zzadp zzj;
    private boolean zzk;
    private long zzl;

    public zzamk() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzek r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamk.zza(com.google.android.gms.internal.ads.zzek):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzi = zzansVar.zzb();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzamj(zzw);
        zzanv zzanvVar = this.zzb;
        if (zzanvVar != null) {
            zzanvVar.zzb(zzacnVar, zzansVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z10) {
        zzdi.zzb(this.zzg);
        if (z10) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j10, int i10) {
        this.zzl = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        zzfh.zzf(this.zzd);
        this.zze.zzb();
        zzamj zzamjVar = this.zzg;
        if (zzamjVar != null) {
            zzamjVar.zzd();
        }
        zzamx zzamxVar = this.zzf;
        if (zzamxVar != null) {
            zzamxVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    public zzamk(zzanv zzanvVar) {
        zzek zzekVar;
        this.zzb = zzanvVar;
        this.zzd = new boolean[4];
        this.zze = new zzami(128);
        this.zzl = -9223372036854775807L;
        if (zzanvVar != null) {
            this.zzf = new zzamx(ShapeTypes.MATH_MULTIPLY, 128);
            zzekVar = new zzek();
        } else {
            zzekVar = null;
            this.zzf = null;
        }
        this.zzc = zzekVar;
    }
}

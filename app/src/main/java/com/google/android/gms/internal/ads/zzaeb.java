package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaeb implements zzack {
    private final zzek zza;
    private final zzaea zzb;
    private final boolean zzc;
    private final zzajy zzd;
    private int zze;
    private zzacn zzf;
    private zzaec zzg;
    private long zzh;
    private zzaee[] zzi;
    private long zzj;
    private zzaee zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaeb() {
        this(1, zzajy.zza);
    }

    private final zzaee zzg(int i10) {
        zzaee[] zzaeeVarArr;
        for (zzaee zzaeeVar : this.zzi) {
            if (zzaeeVar.zzg(i10)) {
                return zzaeeVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacl r28, com.google.android.gms.internal.ads.zzadf r29) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeb.zzb(com.google.android.gms.internal.ads.zzacl, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zze = 0;
        if (this.zzc) {
            zzacnVar = new zzakc(zzacnVar, this.zzd);
        }
        this.zzf = zzacnVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        this.zzj = -1L;
        this.zzk = null;
        int i10 = 0;
        for (zzaee zzaeeVar : this.zzi) {
            zzaeeVar.zzf(j10);
        }
        if (j10 == 0) {
            if (this.zzi.length != 0) {
                i10 = 3;
            }
            this.zze = i10;
            return;
        }
        this.zze = 6;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        ((zzaby) zzaclVar).zzm(this.zza.zzM(), 0, 12, false);
        this.zza.zzK(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzL(4);
        if (this.zza.zzi() != 541677121) {
            return false;
        }
        return true;
    }

    public zzaeb(int i10, zzajy zzajyVar) {
        this.zzd = zzajyVar;
        this.zzc = 1 == (i10 ^ 1);
        this.zza = new zzek(12);
        this.zzb = new zzaea(null);
        this.zzf = new zzaci();
        this.zzi = new zzaee[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}

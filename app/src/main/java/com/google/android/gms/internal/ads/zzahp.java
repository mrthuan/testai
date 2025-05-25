package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.List;
import lib.zj.office.fc.hpsf.Variant;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzahp implements zzack {
    private final zzek zza;
    private final zzadc zzb;
    private final zzacy zzc;
    private final zzada zzd;
    private final zzadp zze;
    private zzacn zzf;
    private zzadp zzg;
    private zzadp zzh;
    private int zzi;
    private zzbk zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private zzahr zzo;
    private boolean zzp;

    public zzahp() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzg(com.google.android.gms.internal.ads.zzacl r25) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahp.zzg(com.google.android.gms.internal.ads.zzacl):int");
    }

    private final long zzh(long j10) {
        zzadc zzadcVar = this.zzb;
        return ((j10 * 1000000) / zzadcVar.zzd) + this.zzk;
    }

    private static boolean zzk(int i10, long j10) {
        if ((i10 & (-128000)) == (j10 & (-128000))) {
            return true;
        }
        return false;
    }

    private final boolean zzl(zzacl zzaclVar) {
        zzahr zzahrVar = this.zzo;
        if (zzahrVar != null) {
            long zzd = zzahrVar.zzd();
            if (zzd != -1 && zzaclVar.zze() > zzd - 4) {
                return true;
            }
        }
        try {
            if (!zzaclVar.zzm(this.zza.zzM(), 0, 4, true)) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzacl zzaclVar, boolean z10) {
        int i10;
        int i11;
        int zzb;
        int i12;
        zzaclVar.zzj();
        if (zzaclVar.zzf() == 0) {
            zzbk zza = this.zzd.zza(zzaclVar, null);
            this.zzj = zza;
            if (zza != null) {
                this.zzc.zzb(zza);
            }
            i10 = (int) zzaclVar.zze();
            if (!z10) {
                ((zzaby) zzaclVar).zzo(i10, false);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = i11;
        int i14 = i13;
        while (true) {
            if (zzl(zzaclVar)) {
                if (i13 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.zza.zzK(0);
                int zzg = this.zza.zzg();
                if ((i11 != 0 && !zzk(zzg, i11)) || (zzb = zzadd.zzb(zzg)) == -1) {
                    if (true != z10) {
                        i12 = 131072;
                    } else {
                        i12 = Variant.VT_RESERVED;
                    }
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw zzbo.zza("Searched too many bytes.", null);
                    }
                    if (z10) {
                        zzaclVar.zzj();
                        ((zzaby) zzaclVar).zzl(i10 + i15, false);
                    } else {
                        ((zzaby) zzaclVar).zzo(1, false);
                    }
                    i11 = 0;
                    i14 = i15;
                    i13 = 0;
                } else {
                    i13++;
                    if (i13 == 1) {
                        this.zzb.zza(zzg);
                        i11 = zzg;
                    } else if (i13 == 4) {
                        break;
                    }
                    ((zzaby) zzaclVar).zzl(zzb - 4, false);
                }
            }
        }
        if (z10) {
            ((zzaby) zzaclVar).zzo(i10 + i14, false);
        } else {
            zzaclVar.zzj();
        }
        this.zzi = i11;
        return true;
    }

    public final void zza() {
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) {
        zzdi.zzb(this.zzg);
        int i10 = zzet.zza;
        int zzg = zzg(zzaclVar);
        if (zzg == -1 && (this.zzo instanceof zzahn)) {
            if (this.zzo.zza() != zzh(this.zzl)) {
                zzahn zzahnVar = (zzahn) this.zzo;
                throw null;
            }
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzf = zzacnVar;
        zzadp zzw = zzacnVar.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
        this.zzf.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzn = 0;
        zzahr zzahrVar = this.zzo;
        if (!(zzahrVar instanceof zzahn)) {
            return;
        }
        zzahn zzahnVar = (zzahn) zzahrVar;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        return zzm(zzaclVar, true);
    }

    public zzahp(int i10) {
        this.zza = new zzek(10);
        this.zzb = new zzadc();
        this.zzc = new zzacy();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzada();
        zzacj zzacjVar = new zzacj();
        this.zze = zzacjVar;
        this.zzh = zzacjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}

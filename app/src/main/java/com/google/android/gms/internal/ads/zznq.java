package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zznq implements zzln {
    private final zzdj zza;
    private final zzca zzb;
    private final zzcb zzc;
    private final zznp zzd;
    private final SparseArray zze;
    private zzdz zzf;
    private zzbw zzg;
    private zzdt zzh;
    private boolean zzi;

    public zznq(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
        this.zzf = new zzdz(zzet.zzy(), zzdjVar, new zzdx() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzdx
            public final void zza(Object obj, zzab zzabVar) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
        zzca zzcaVar = new zzca();
        this.zzb = zzcaVar;
        this.zzc = new zzcb();
        this.zzd = new zznp(zzcaVar);
        this.zze = new SparseArray();
    }

    public static /* synthetic */ void zzV(zznq zznqVar) {
        final zzlo zzT = zznqVar.zzT();
        zznqVar.zzY(zzT, 1028, new zzdw(zzT) { // from class: com.google.android.gms.internal.ads.zzls
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
        zznqVar.zzf.zze();
    }

    private final zzlo zzZ(zzui zzuiVar) {
        zzcc zza;
        this.zzg.getClass();
        if (zzuiVar == null) {
            zza = null;
        } else {
            zza = this.zzd.zza(zzuiVar);
        }
        if (zzuiVar != null && zza != null) {
            return zzU(zza, zza.zzn(zzuiVar.zza, this.zzb).zzc, zzuiVar);
        }
        int zzd = this.zzg.zzd();
        zzcc zzn = this.zzg.zzn();
        if (zzd >= zzn.zzc()) {
            zzn = zzcc.zza;
        }
        return zzU(zzn, zzd, null);
    }

    private final zzlo zzaa(int i10, zzui zzuiVar) {
        zzbw zzbwVar = this.zzg;
        zzbwVar.getClass();
        if (zzuiVar != null) {
            if (this.zzd.zza(zzuiVar) != null) {
                return zzZ(zzuiVar);
            }
            return zzU(zzcc.zza, i10, zzuiVar);
        }
        zzcc zzn = zzbwVar.zzn();
        if (i10 >= zzn.zzc()) {
            zzn = zzcc.zza;
        }
        return zzU(zzn, i10, null);
    }

    private final zzlo zzab() {
        return zzZ(this.zzd.zzd());
    }

    private final zzlo zzac() {
        return zzZ(this.zzd.zze());
    }

    private final zzlo zzad(zzbp zzbpVar) {
        zzui zzuiVar;
        if ((zzbpVar instanceof zzhw) && (zzuiVar = ((zzhw) zzbpVar).zzh) != null) {
            return zzZ(zzuiVar);
        }
        return zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzA(final zzaf zzafVar, final zzho zzhoVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 1009, new zzdw() { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zze(zzlo.this, zzafVar, zzhoVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzB(final long j10) {
        final zzlo zzac = zzac();
        zzY(zzac, 1010, new zzdw(zzac, j10) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzC(final Exception exc) {
        final zzlo zzac = zzac();
        zzY(zzac, 1014, new zzdw(zzac, exc) { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzD(final zzpf zzpfVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 1031, new zzdw(zzac, zzpfVar) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzE(final zzpf zzpfVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 1032, new zzdw(zzac, zzpfVar) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzF(final int i10, final long j10, final long j11) {
        final zzlo zzac = zzac();
        zzY(zzac, 1011, new zzdw(zzac, i10, j10, j11) { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzG(final int i10, final long j10) {
        final zzlo zzab = zzab();
        zzY(zzab, 1018, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzh(zzlo.this, i10, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzH(final Object obj, final long j10) {
        final zzlo zzac = zzac();
        zzY(zzac, 26, new zzdw() { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj2) {
                ((zzlq) obj2).zzn(zzlo.this, obj, j10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzI(final Exception exc) {
        final zzlo zzac = zzac();
        zzY(zzac, 1030, new zzdw(zzac, exc) { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzJ(final String str, final long j10, final long j11) {
        final zzlo zzac = zzac();
        zzY(zzac, 1016, new zzdw(zzac, str, j11, j10) { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzK(final String str) {
        final zzlo zzac = zzac();
        zzY(zzac, 1019, new zzdw(zzac, str) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzL(final zzhn zzhnVar) {
        final zzlo zzab = zzab();
        zzY(zzab, 1020, new zzdw() { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzo(zzlo.this, zzhnVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzM(final zzhn zzhnVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 1015, new zzdw(zzac, zzhnVar) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzN(final long j10, final int i10) {
        final zzlo zzab = zzab();
        zzY(zzab, 1021, new zzdw(zzab, j10, i10) { // from class: com.google.android.gms.internal.ads.zzms
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzO(final zzaf zzafVar, final zzho zzhoVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 1017, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzp(zzlo.this, zzafVar, zzhoVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzP() {
        zzdt zzdtVar = this.zzh;
        zzdi.zzb(zzdtVar);
        zzdtVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zznh
            @Override // java.lang.Runnable
            public final void run() {
                zznq.zzV(zznq.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzQ(zzlq zzlqVar) {
        this.zzf.zzf(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzR(final zzbw zzbwVar, Looper looper) {
        zzfxr zzfxrVar;
        boolean z10 = true;
        if (this.zzg != null) {
            zzfxrVar = this.zzd.zzb;
            if (!zzfxrVar.isEmpty()) {
                z10 = false;
            }
        }
        zzdi.zzf(z10);
        zzbwVar.getClass();
        this.zzg = zzbwVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdx() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzdx
            public final void zza(Object obj, zzab zzabVar) {
                zznq.this.zzW(zzbwVar, (zzlq) obj, zzabVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzS(List list, zzui zzuiVar) {
        zzbw zzbwVar = this.zzg;
        zzbwVar.getClass();
        this.zzd.zzh(list, zzuiVar, zzbwVar);
    }

    public final zzlo zzT() {
        return zzZ(this.zzd.zzb());
    }

    public final zzlo zzU(zzcc zzccVar, int i10, zzui zzuiVar) {
        zzui zzuiVar2;
        boolean z10 = true;
        if (true == zzccVar.zzo()) {
            zzuiVar2 = null;
        } else {
            zzuiVar2 = zzuiVar;
        }
        long zza = this.zza.zza();
        if (!zzccVar.equals(this.zzg.zzn()) || i10 != this.zzg.zzd()) {
            z10 = false;
        }
        long j10 = 0;
        if (zzuiVar2 != null && zzuiVar2.zzb()) {
            if (z10 && this.zzg.zzb() == zzuiVar2.zzb && this.zzg.zzc() == zzuiVar2.zzc) {
                j10 = this.zzg.zzk();
            }
        } else if (z10) {
            j10 = this.zzg.zzj();
        } else if (!zzccVar.zzo()) {
            long j11 = zzccVar.zze(i10, this.zzc, 0L).zzl;
            j10 = zzet.zzu(0L);
        }
        return new zzlo(zza, zzccVar, i10, zzuiVar2, j10, this.zzg.zzn(), this.zzg.zzd(), this.zzd.zzb(), this.zzg.zzk(), this.zzg.zzm());
    }

    public final /* synthetic */ void zzW(zzbw zzbwVar, zzlq zzlqVar, zzab zzabVar) {
        zzlqVar.zzi(zzbwVar, new zzlp(zzabVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzyi
    public final void zzX(final int i10, final long j10, final long j11) {
        final zzlo zzZ = zzZ(this.zzd.zzc());
        zzY(zzZ, ErrorCodes.SSL_HANDSHAKE_EXCEPTION, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzf(zzlo.this, i10, j10, j11);
            }
        });
    }

    public final void zzY(zzlo zzloVar, int i10, zzdw zzdwVar) {
        this.zze.put(i10, zzloVar);
        zzdz zzdzVar = this.zzf;
        zzdzVar.zzd(i10, zzdwVar);
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zza(final zzbt zzbtVar) {
        final zzlo zzT = zzT();
        zzY(zzT, 13, new zzdw(zzT, zzbtVar) { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzae(int i10, zzui zzuiVar, final zzue zzueVar) {
        final zzlo zzaa = zzaa(i10, zzuiVar);
        zzY(zzaa, ErrorCodes.PROTOCOL_EXCEPTION, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzg(zzlo.this, zzueVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzaf(int i10, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        final zzlo zzaa = zzaa(i10, zzuiVar);
        zzY(zzaa, 1002, new zzdw(zzaa, zztzVar, zzueVar) { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzag(int i10, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        final zzlo zzaa = zzaa(i10, zzuiVar);
        zzY(zzaa, 1001, new zzdw(zzaa, zztzVar, zzueVar) { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzah(int i10, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar, final IOException iOException, final boolean z10) {
        final zzlo zzaa = zzaa(i10, zzuiVar);
        zzY(zzaa, ErrorCodes.MALFORMED_URL_EXCEPTION, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzj(zzlo.this, zztzVar, zzueVar, iOException, z10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzus
    public final void zzai(int i10, zzui zzuiVar, final zztz zztzVar, final zzue zzueVar) {
        final zzlo zzaa = zzaa(i10, zzuiVar);
        zzY(zzaa, 1000, new zzdw(zzaa, zztzVar, zzueVar) { // from class: com.google.android.gms.internal.ads.zzlw
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzb(final boolean z10) {
        final zzlo zzT = zzT();
        zzY(zzT, 3, new zzdw(zzT, z10) { // from class: com.google.android.gms.internal.ads.zzlu
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzc(final boolean z10) {
        final zzlo zzT = zzT();
        zzY(zzT, 7, new zzdw(zzT, z10) { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzd(final zzbc zzbcVar, final int i10) {
        final zzlo zzT = zzT();
        zzY(zzT, 1, new zzdw(zzT, zzbcVar, i10) { // from class: com.google.android.gms.internal.ads.zzlz
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zze(final zzbh zzbhVar) {
        final zzlo zzT = zzT();
        zzY(zzT, 14, new zzdw(zzT, zzbhVar) { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzf(final boolean z10, final int i10) {
        final zzlo zzT = zzT();
        zzY(zzT, 5, new zzdw(zzT, z10, i10) { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzg(final zzbq zzbqVar) {
        final zzlo zzT = zzT();
        zzY(zzT, 12, new zzdw(zzT, zzbqVar) { // from class: com.google.android.gms.internal.ads.zzlr
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzh(final int i10) {
        final zzlo zzT = zzT();
        zzY(zzT, 4, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzk(zzlo.this, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzi(final int i10) {
        final zzlo zzT = zzT();
        zzY(zzT, 6, new zzdw(zzT, i10) { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzj(final zzbp zzbpVar) {
        final zzlo zzad = zzad(zzbpVar);
        zzY(zzad, 10, new zzdw() { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzl(zzlo.this, zzbpVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzk(final zzbp zzbpVar) {
        final zzlo zzad = zzad(zzbpVar);
        zzY(zzad, 10, new zzdw(zzad, zzbpVar) { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzl(final boolean z10, final int i10) {
        final zzlo zzT = zzT();
        zzY(zzT, -1, new zzdw(zzT, z10, i10) { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzm(final zzbv zzbvVar, final zzbv zzbvVar2, final int i10) {
        if (i10 == 1) {
            this.zzi = false;
            i10 = 1;
        }
        zznp zznpVar = this.zzd;
        zzbw zzbwVar = this.zzg;
        zzbwVar.getClass();
        zznpVar.zzg(zzbwVar);
        final zzlo zzT = zzT();
        zzY(zzT, 11, new zzdw() { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                ((zzlq) obj).zzm(zzlo.this, zzbvVar, zzbvVar2, i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzn(final boolean z10) {
        final zzlo zzac = zzac();
        zzY(zzac, 23, new zzdw(zzac, z10) { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzo(final int i10, final int i11) {
        final zzlo zzac = zzac();
        zzY(zzac, 24, new zzdw(zzac, i10, i11) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzp(zzcc zzccVar, final int i10) {
        zzbw zzbwVar = this.zzg;
        zzbwVar.getClass();
        this.zzd.zzi(zzbwVar);
        final zzlo zzT = zzT();
        zzY(zzT, 0, new zzdw(zzT, i10) { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzq(final zzck zzckVar) {
        final zzlo zzT = zzT();
        zzY(zzT, 2, new zzdw(zzT, zzckVar) { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzr(final zzcp zzcpVar) {
        final zzlo zzac = zzac();
        zzY(zzac, 25, new zzdw() { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlo zzloVar = zzlo.this;
                zzcp zzcpVar2 = zzcpVar;
                ((zzlq) obj).zzq(zzloVar, zzcpVar2);
                int i10 = zzcpVar2.zzb;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbu
    public final void zzs(final float f10) {
        final zzlo zzac = zzac();
        zzY(zzac, 22, new zzdw(zzac, f10) { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzt(zzlq zzlqVar) {
        this.zzf.zzb(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzu() {
        if (!this.zzi) {
            final zzlo zzT = zzT();
            this.zzi = true;
            zzY(zzT, -1, new zzdw(zzT) { // from class: com.google.android.gms.internal.ads.zznd
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj) {
                    zzlq zzlqVar = (zzlq) obj;
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzv(final Exception exc) {
        final zzlo zzac = zzac();
        zzY(zzac, 1029, new zzdw(zzac, exc) { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzw(final String str, final long j10, final long j11) {
        final zzlo zzac = zzac();
        zzY(zzac, 1008, new zzdw(zzac, str, j11, j10) { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzx(final String str) {
        final zzlo zzac = zzac();
        zzY(zzac, 1012, new zzdw(zzac, str) { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzy(final zzhn zzhnVar) {
        final zzlo zzab = zzab();
        zzY(zzab, 1013, new zzdw(zzab, zzhnVar) { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzln
    public final void zzz(final zzhn zzhnVar) {
        final zzlo zzac = zzac();
        zzY(zzac, ErrorCodes.IO_EXCEPTION, new zzdw(zzac, zzhnVar) { // from class: com.google.android.gms.internal.ads.zzlt
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                zzlq zzlqVar = (zzlq) obj;
            }
        });
    }
}

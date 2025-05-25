package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaam {
    private final zzaah zza;
    private zzcp zzf;
    private long zzh;
    private final zzzi zzj;
    private final zzaaf zzb = new zzaaf();
    private final zzeq zzc = new zzeq(10);
    private final zzeq zzd = new zzeq(10);
    private final zzec zze = new zzec(16);
    private zzcp zzg = zzcp.zza;
    private long zzi = -9223372036854775807L;

    public zzaam(zzzi zzziVar, zzaah zzaahVar) {
        this.zzj = zzziVar;
        this.zza = zzaahVar;
    }

    private static Object zzf(zzeq zzeqVar) {
        boolean z10;
        if (zzeqVar.zza() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        while (zzeqVar.zza() > 1) {
            zzeqVar.zzb();
        }
        Object zzb = zzeqVar.zzb();
        zzb.getClass();
        return zzb;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzi = -9223372036854775807L;
        zzeq zzeqVar = this.zzd;
        if (zzeqVar.zza() > 0) {
            this.zzd.zzd(0L, Long.valueOf(((Long) zzf(zzeqVar)).longValue()));
        }
        if (this.zzf == null) {
            zzeq zzeqVar2 = this.zzc;
            if (zzeqVar2.zza() > 0) {
                this.zzf = (zzcp) zzf(zzeqVar2);
                return;
            }
            return;
        }
        this.zzc.zze();
    }

    public final void zzb(long j10, long j11) {
        this.zzd.zzd(j10, Long.valueOf(j11));
    }

    public final void zzc(long j10, long j11) {
        zzaae zzaaeVar;
        zzaf zzafVar;
        zzaf zzafVar2;
        zzaae zzaaeVar2;
        zzdj zzdjVar;
        Pair pair;
        CopyOnWriteArraySet copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        CopyOnWriteArraySet copyOnWriteArraySet3;
        zzec zzecVar = this.zze;
        if (!zzecVar.zzd()) {
            zzeq zzeqVar = this.zzd;
            long zza = zzecVar.zza();
            Long l10 = (Long) zzeqVar.zzc(zza);
            if (l10 != null && l10.longValue() != this.zzh) {
                this.zzh = l10.longValue();
                this.zza.zzf();
            }
            int zza2 = this.zza.zza(zza, j10, j11, this.zzh, false, this.zzb);
            if (zza2 != 0 && zza2 != 1) {
                if (zza2 == 2 || zza2 == 3 || zza2 == 4) {
                    this.zzi = zza;
                    this.zze.zzb();
                    zzzi zzziVar = this.zzj;
                    copyOnWriteArraySet3 = zzziVar.zza.zzg;
                    Iterator it = copyOnWriteArraySet3.iterator();
                    while (it.hasNext()) {
                        ((zzzj) it.next()).zzb(zzziVar.zza);
                    }
                    zzdi.zzb(null);
                    throw null;
                }
                return;
            }
            this.zzi = zza;
            long longValue = Long.valueOf(this.zze.zzb()).longValue();
            zzcp zzcpVar = (zzcp) this.zzc.zzc(longValue);
            if (zzcpVar != null && !zzcpVar.equals(zzcp.zza) && !zzcpVar.equals(this.zzg)) {
                this.zzg = zzcpVar;
                zzzi zzziVar2 = this.zzj;
                zzad zzadVar = new zzad();
                zzadVar.zzac(zzcpVar.zzb);
                zzadVar.zzI(zzcpVar.zzc);
                zzadVar.zzX("video/raw");
                zzziVar2.zza.zzi = zzadVar.zzad();
                copyOnWriteArraySet2 = zzziVar2.zza.zzg;
                Iterator it2 = copyOnWriteArraySet2.iterator();
                while (it2.hasNext()) {
                    ((zzzj) it2.next()).zzc(zzziVar2.zza, zzcpVar);
                }
            }
            zzzi zzziVar3 = this.zzj;
            long j12 = this.zzh;
            if (this.zza.zzo()) {
                zzzt zzztVar = zzziVar3.zza;
                pair = zzztVar.zzl;
                if (pair != null) {
                    copyOnWriteArraySet = zzztVar.zzg;
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    while (it3.hasNext()) {
                        ((zzzj) it3.next()).zza(zzziVar3.zza);
                    }
                }
            }
            zzzt zzztVar2 = zzziVar3.zza;
            zzaaeVar = zzztVar2.zzj;
            if (zzaaeVar != null) {
                zzafVar = zzztVar2.zzi;
                if (zzafVar != null) {
                    zzafVar2 = zzztVar2.zzi;
                } else {
                    zzafVar2 = new zzad().zzad();
                }
                zzzt zzztVar3 = zzziVar3.zza;
                zzaaeVar2 = zzztVar3.zzj;
                zzdjVar = zzztVar3.zzh;
                zzdi.zzb(zzdjVar);
                zzaaeVar2.zza(longValue - j12, System.nanoTime(), zzafVar2, null);
            }
            zzdi.zzb(null);
            throw null;
        }
    }

    public final void zzd(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        this.zza.zzm(f10);
    }

    public final boolean zze(long j10) {
        long j11 = this.zzi;
        if (j11 != -9223372036854775807L && j11 >= j10) {
            return true;
        }
        return false;
    }
}

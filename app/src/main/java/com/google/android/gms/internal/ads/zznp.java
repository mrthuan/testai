package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zznp {
    private final zzca zza;
    private zzfxr zzb = zzfxr.zzm();
    private zzfxu zzc = zzfxu.zzd();
    private zzui zzd;
    private zzui zze;
    private zzui zzf;

    public zznp(zzca zzcaVar) {
        this.zza = zzcaVar;
    }

    private static zzui zzj(zzbw zzbwVar, zzfxr zzfxrVar, zzui zzuiVar, zzca zzcaVar) {
        Object zzf;
        int i10;
        zzcc zzn = zzbwVar.zzn();
        int zze = zzbwVar.zze();
        if (zzn.zzo()) {
            zzf = null;
        } else {
            zzf = zzn.zzf(zze);
        }
        if (!zzbwVar.zzw() && !zzn.zzo()) {
            i10 = zzn.zzd(zze, zzcaVar, false).zzc(zzet.zzr(zzbwVar.zzk()));
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < zzfxrVar.size(); i11++) {
            zzui zzuiVar2 = (zzui) zzfxrVar.get(i11);
            if (zzm(zzuiVar2, zzf, zzbwVar.zzw(), zzbwVar.zzb(), zzbwVar.zzc(), i10)) {
                return zzuiVar2;
            }
        }
        if (zzfxrVar.isEmpty() && zzuiVar != null) {
            if (zzm(zzuiVar, zzf, zzbwVar.zzw(), zzbwVar.zzb(), zzbwVar.zzc(), i10)) {
                return zzuiVar;
            }
        }
        return null;
    }

    private final void zzk(zzfxt zzfxtVar, zzui zzuiVar, zzcc zzccVar) {
        if (zzuiVar != null) {
            if (zzccVar.zza(zzuiVar.zza) != -1) {
                zzfxtVar.zza(zzuiVar, zzccVar);
                return;
            }
            zzcc zzccVar2 = (zzcc) this.zzc.get(zzuiVar);
            if (zzccVar2 != null) {
                zzfxtVar.zza(zzuiVar, zzccVar2);
            }
        }
    }

    private final void zzl(zzcc zzccVar) {
        zzfxt zzfxtVar = new zzfxt();
        if (this.zzb.isEmpty()) {
            zzk(zzfxtVar, this.zze, zzccVar);
            if (!zzfur.zza(this.zzf, this.zze)) {
                zzk(zzfxtVar, this.zzf, zzccVar);
            }
            if (!zzfur.zza(this.zzd, this.zze) && !zzfur.zza(this.zzd, this.zzf)) {
                zzk(zzfxtVar, this.zzd, zzccVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzfxtVar, (zzui) this.zzb.get(i10), zzccVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfxtVar, this.zzd, zzccVar);
            }
        }
        this.zzc = zzfxtVar.zzc();
    }

    private static boolean zzm(zzui zzuiVar, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!zzuiVar.zza.equals(obj)) {
            return false;
        }
        if (z10) {
            if (zzuiVar.zzb != i10 || zzuiVar.zzc != i11) {
                return false;
            }
        } else if (zzuiVar.zzb != -1 || zzuiVar.zze != i12) {
            return false;
        }
        return true;
    }

    public final zzcc zza(zzui zzuiVar) {
        return (zzcc) this.zzc.get(zzuiVar);
    }

    public final zzui zzb() {
        return this.zzd;
    }

    public final zzui zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfxr zzfxrVar = this.zzb;
        if (zzfxrVar instanceof List) {
            if (!zzfxrVar.isEmpty()) {
                obj = zzfxrVar.get(zzfxrVar.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = zzfxrVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzui) obj;
    }

    public final zzui zzd() {
        return this.zze;
    }

    public final zzui zze() {
        return this.zzf;
    }

    public final void zzg(zzbw zzbwVar) {
        this.zzd = zzj(zzbwVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzui zzuiVar, zzbw zzbwVar) {
        this.zzb = zzfxr.zzk(list);
        if (!list.isEmpty()) {
            this.zze = (zzui) list.get(0);
            zzuiVar.getClass();
            this.zzf = zzuiVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbwVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzbwVar.zzn());
    }

    public final void zzi(zzbw zzbwVar) {
        this.zzd = zzj(zzbwVar, this.zzb, this.zze, this.zza);
        zzl(zzbwVar.zzn());
    }
}

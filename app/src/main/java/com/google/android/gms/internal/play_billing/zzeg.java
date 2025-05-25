package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzeg implements zzeo {
    private final zzec zza;
    private final zzff zzb;
    private final boolean zzc;
    private final zzce zzd;

    private zzeg(zzff zzffVar, zzce zzceVar, zzec zzecVar) {
        this.zzb = zzffVar;
        this.zzc = zzceVar.zzf(zzecVar);
        this.zzd = zzceVar;
        this.zza = zzecVar;
    }

    public static zzeg zzc(zzff zzffVar, zzce zzceVar, zzec zzecVar) {
        return new zzeg(zzffVar, zzceVar, zzecVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zza(Object obj) {
        zzff zzffVar = this.zzb;
        int zzb = zzffVar.zzb(zzffVar.zzd(obj));
        if (this.zzc) {
            return zzb + this.zzd.zzb(obj).zzc();
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        zzec zzecVar = this.zza;
        if (zzecVar instanceof zzcs) {
            return ((zzcs) zzecVar).zzl();
        }
        return zzecVar.zzE().zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzf(Object obj) {
        this.zzb.zzg(obj);
        this.zzd.zzd(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzeq.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzeq.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzbc zzbcVar) {
        zzcs zzcsVar = (zzcs) obj;
        if (zzcsVar.zzc == zzfg.zzc()) {
            zzcsVar.zzc = zzfg.zzf();
        }
        zzco zzcoVar = (zzco) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzi(Object obj, zzfx zzfxVar) {
        Iterator zzf = this.zzd.zzb(obj).zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzch zzchVar = (zzch) entry.getKey();
            if (zzchVar.zze() == zzfw.MESSAGE && !zzchVar.zzg() && !zzchVar.zzf()) {
                if (entry instanceof zzdf) {
                    zzfxVar.zzw(zzchVar.zza(), ((zzdf) entry).zza().zzb());
                } else {
                    zzfxVar.zzw(zzchVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzff zzffVar = this.zzb;
        zzffVar.zzi(zzffVar.zzd(obj), zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        zzff zzffVar = this.zzb;
        if (!zzffVar.zzd(obj).equals(zzffVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzk(Object obj) {
        return this.zzd.zzb(obj).zzj();
    }
}

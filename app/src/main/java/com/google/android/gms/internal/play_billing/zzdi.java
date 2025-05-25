package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public class zzdi {
    private static final zzcd zzb = zzcd.zza;
    protected volatile zzec zza;
    private volatile zzbq zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdi)) {
            return false;
        }
        zzdi zzdiVar = (zzdi) obj;
        zzec zzecVar = this.zza;
        zzec zzecVar2 = zzdiVar.zza;
        if (zzecVar == null && zzecVar2 == null) {
            return zzb().equals(zzdiVar.zzb());
        }
        if (zzecVar != null && zzecVar2 != null) {
            return zzecVar.equals(zzecVar2);
        }
        if (zzecVar != null) {
            zzdiVar.zzd(zzecVar.zzh());
            return zzecVar.equals(zzdiVar.zza);
        }
        zzd(zzecVar2.zzh());
        return this.zza.equals(zzecVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzbn) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzf();
        }
        return 0;
    }

    public final zzbq zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzbq.zzb;
            } else {
                this.zzc = this.zza.zzb();
            }
            return this.zzc;
        }
    }

    public final zzec zzc(zzec zzecVar) {
        zzec zzecVar2 = this.zza;
        this.zzc = null;
        this.zza = zzecVar;
        return zzecVar2;
    }

    public final void zzd(zzec zzecVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzecVar;
                this.zzc = zzbq.zzb;
            } catch (zzdc unused) {
                this.zza = zzecVar;
                this.zzc = zzbq.zzb;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public class zzgyu {
    protected volatile zzgzj zza;
    private volatile zzgwm zzb;

    static {
        int i10 = zzgxi.zzb;
        int i11 = zzgzt.zza;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyu)) {
            return false;
        }
        zzgyu zzgyuVar = (zzgyu) obj;
        zzgzj zzgzjVar = this.zza;
        zzgzj zzgzjVar2 = zzgyuVar.zza;
        if (zzgzjVar == null && zzgzjVar2 == null) {
            return zzb().equals(zzgyuVar.zzb());
        }
        if (zzgzjVar != null && zzgzjVar2 != null) {
            return zzgzjVar.equals(zzgzjVar2);
        }
        if (zzgzjVar != null) {
            zzgyuVar.zzd(zzgzjVar.zzbt());
            return zzgzjVar.equals(zzgyuVar.zza);
        }
        zzd(zzgzjVar2.zzbt());
        return this.zza.equals(zzgzjVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgwk) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgwm zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            if (this.zza == null) {
                this.zzb = zzgwm.zzb;
            } else {
                this.zzb = this.zza.zzaN();
            }
            return this.zzb;
        }
    }

    public final zzgzj zzc(zzgzj zzgzjVar) {
        zzgzj zzgzjVar2 = this.zza;
        this.zzb = null;
        this.zza = zzgzjVar;
        return zzgzjVar2;
    }

    public final void zzd(zzgzj zzgzjVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzgzjVar;
                this.zzb = zzgwm.zzb;
            } catch (zzgyn unused) {
                this.zza = zzgzjVar;
                this.zzb = zzgwm.zzb;
            }
        }
    }
}

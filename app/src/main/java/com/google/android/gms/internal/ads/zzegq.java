package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzegq extends zzbvx implements zzcya {
    private zzbvy zza;
    private zzcxz zzb;
    private zzdfb zzc;

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zza(zzcxz zzcxzVar) {
        this.zzb = zzcxzVar;
    }

    public final synchronized void zzc(zzbvy zzbvyVar) {
        this.zza = zzbvyVar;
    }

    public final synchronized void zzd(zzdfb zzdfbVar) {
        this.zzc = zzdfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        zzbvy zzbvyVar = this.zza;
        if (zzbvyVar != null) {
            ((zzejv) zzbvyVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        zzbvy zzbvyVar = this.zza;
        if (zzbvyVar != null) {
            zzbvyVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i10) {
        zzcxz zzcxzVar = this.zzb;
        if (zzcxzVar != null) {
            zzcxzVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) {
        zzbvy zzbvyVar = this.zza;
        if (zzbvyVar != null) {
            ((zzejv) zzbvyVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        zzcxz zzcxzVar = this.zzb;
        if (zzcxzVar != null) {
            zzcxzVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        zzbvy zzbvyVar = this.zza;
        if (zzbvyVar != null) {
            ((zzejv) zzbvyVar).zza.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i10) {
        zzdfb zzdfbVar = this.zzc;
        if (zzdfbVar != null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Fail to initialize adapter ".concat(String.valueOf(((zzeju) zzdfbVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) {
        zzdfb zzdfbVar = this.zzc;
        if (zzdfbVar != null) {
            Executor zzc = zzejw.zzc(((zzeju) zzdfbVar).zzd);
            final zzeew zzeewVar = ((zzeju) zzdfbVar).zzc;
            final zzfel zzfelVar = ((zzeju) zzdfbVar).zzb;
            final zzfex zzfexVar = ((zzeju) zzdfbVar).zza;
            final zzeju zzejuVar = (zzeju) zzdfbVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejt
                @Override // java.lang.Runnable
                public final void run() {
                    zzejw zzejwVar = zzeju.this.zzd;
                    zzejw.zze(zzfexVar, zzfelVar, zzeewVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbvz zzbvzVar) {
        zzbvy zzbvyVar = this.zza;
        if (zzbvyVar != null) {
            ((zzejv) zzbvyVar).zzd.zza(zzbvzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) {
        zzbvy zzbvyVar = this.zza;
        if (zzbvyVar != null) {
            ((zzejv) zzbvyVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) {
        zzbvy zzbvyVar = this.zza;
        if (zzbvyVar != null) {
            ((zzejv) zzbvyVar).zzd.zzc();
        }
    }
}

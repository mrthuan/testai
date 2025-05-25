package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzefu implements zzeet {
    private final zzcql zza;
    private final Context zzb;
    private final zzdpl zzc;
    private final zzffg zzd;
    private final Executor zze;
    private final zzful zzf;

    public zzefu(zzcql zzcqlVar, Context context, Executor executor, zzdpl zzdplVar, zzffg zzffgVar, zzful zzfulVar) {
        this.zzb = context;
        this.zza = zzcqlVar;
        this.zze = executor;
        this.zzc = zzdplVar;
        this.zzd = zzffgVar;
        this.zzf = zzfulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        return zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzefu.this.zzc(zzfexVar, zzfelVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        zzfeq zzfeqVar = zzfelVar.zzs;
        if (zzfeqVar != null && zzfeqVar.zza != null) {
            return true;
        }
        return false;
    }

    public final y9.a zzc(zzfex zzfexVar, zzfel zzfelVar, Object obj) {
        View zzdpoVar;
        com.google.android.gms.ads.internal.client.zzq zza = zzffm.zza(this.zzb, zzfelVar.zzu);
        final zzcej zza2 = this.zzc.zza(zza, zzfelVar, zzfexVar.zzb.zzb);
        zza2.zzac(zzfelVar.zzW);
        zzbbn zzbbnVar = zzbbw.zzgZ;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && zzfelVar.zzag) {
            zzdpoVar = zzcrg.zza(this.zzb, (View) zza2, zzfelVar);
        } else {
            zzdpoVar = new zzdpo(this.zzb, (View) zza2, (com.google.android.gms.ads.internal.util.zzau) this.zzf.apply(zzfelVar));
        }
        final zzcpl zza3 = this.zza.zza(new zzcsk(zzfexVar, zzfelVar, null), new zzcpr(zzdpoVar, zza2, new zzcrs() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzcrs
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcej.this.zzq();
            }
        }, zzffm.zzb(zza)));
        zza3.zzh().zzi(zza2, false, null);
        zzcxi zzc = zza3.zzc();
        zzcxk zzcxkVar = new zzcxk() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // com.google.android.gms.internal.ads.zzcxk
            public final void zzr() {
                zzcej zzcejVar = zzcej.this;
                if (zzcejVar.zzN() != null) {
                    zzcejVar.zzN().zzr();
                }
            }
        };
        zzgcu zzgcuVar = zzbzo.zzf;
        zzc.zzo(zzcxkVar, zzgcuVar);
        String str = zzfelVar.zzs.zza;
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzeC)).booleanValue() && zza3.zzi().zze(true)) {
            str = zzcfu.zzb(str, zzcfu.zza(zzfelVar));
        }
        zza3.zzh();
        y9.a zzj = zzdpk.zzj(zza2, zzfelVar.zzs.zzb, str);
        if (zzfelVar.zzM) {
            zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcej.this.zzah();
                }
            }, this.zze);
        }
        zzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // java.lang.Runnable
            public final void run() {
                zzefu.this.zzd(zza2);
            }
        }, this.zze);
        return zzgcj.zzm(zzj, new zzful() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj2) {
                return zzcpl.this.zza();
            }
        }, zzgcuVar);
    }

    public final void zzd(zzcej zzcejVar) {
        zzcejVar.zzab();
        zzcfl zzq = zzcejVar.zzq();
        com.google.android.gms.ads.internal.client.zzfk zzfkVar = this.zzd.zza;
        if (zzfkVar != null && zzq != null) {
            zzq.zzs(zzfkVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaZ)).booleanValue() && !zzcejVar.isAttachedToWindow()) {
            zzcejVar.onPause();
            zzcejVar.zzav(true);
        }
    }
}

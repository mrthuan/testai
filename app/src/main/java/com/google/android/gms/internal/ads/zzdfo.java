package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdfo extends zzcru {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzddu zze;
    private final zzdgx zzf;
    private final zzcsp zzg;
    private final zzfos zzh;
    private final zzcxd zzi;
    private final zzbzi zzj;
    private boolean zzk;

    public zzdfo(zzcrt zzcrtVar, Context context, zzcej zzcejVar, zzddu zzdduVar, zzdgx zzdgxVar, zzcsp zzcspVar, zzfos zzfosVar, zzcxd zzcxdVar, zzbzi zzbziVar) {
        super(zzcrtVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcejVar);
        this.zze = zzdduVar;
        this.zzf = zzdgxVar;
        this.zzg = zzcspVar;
        this.zzh = zzfosVar;
        this.zzi = zzcxdVar;
        this.zzj = zzbziVar;
    }

    public final void finalize() {
        try {
            final zzcej zzcejVar = (zzcej) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzga)).booleanValue()) {
                if (!this.zzk && zzcejVar != null) {
                    zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcej.this.destroy();
                        }
                    });
                }
            } else if (zzcejVar != null) {
                zzcejVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z10, Activity activity) {
        zzfel zzD;
        this.zze.zzb();
        zzbbn zzbbnVar = zzbbw.zzat;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            if (com.google.android.gms.ads.internal.util.zzt.e(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzau)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcej zzcejVar = (zzcej) this.zzd.get();
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzkU)).booleanValue() && zzcejVar != null && (zzD = zzcejVar.zzD()) != null && zzD.zzar && zzD.zzas != this.zzj.zzb()) {
            com.google.android.gms.ads.internal.util.client.zzm.e("The interstitial consent form has been shown.");
            this.zzi.zza(zzfgi.zzd(12, "The consent form has already been shown.", null));
        } else {
            if (this.zzk) {
                com.google.android.gms.ads.internal.util.client.zzm.e("The interstitial ad has been shown.");
                this.zzi.zza(zzfgi.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z10, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdgw e10) {
                    this.zzi.zzc(e10);
                }
            }
        }
        return false;
    }
}

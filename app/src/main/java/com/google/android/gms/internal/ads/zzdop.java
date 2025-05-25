package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdop extends zzcru {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgx zze;
    private final zzddu zzf;
    private final zzcxd zzg;
    private final zzcyk zzh;
    private final zzcsp zzi;
    private final zzbwd zzj;
    private final zzfos zzk;
    private final zzfez zzl;
    private boolean zzm;

    public zzdop(zzcrt zzcrtVar, Context context, zzcej zzcejVar, zzdgx zzdgxVar, zzddu zzdduVar, zzcxd zzcxdVar, zzcyk zzcykVar, zzcsp zzcspVar, zzfel zzfelVar, zzfos zzfosVar, zzfez zzfezVar) {
        super(zzcrtVar);
        String str;
        int i10;
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdgxVar;
        this.zzd = new WeakReference(zzcejVar);
        this.zzf = zzdduVar;
        this.zzg = zzcxdVar;
        this.zzh = zzcykVar;
        this.zzi = zzcspVar;
        this.zzk = zzfosVar;
        zzbvz zzbvzVar = zzfelVar.zzl;
        if (zzbvzVar != null) {
            str = zzbvzVar.zza;
        } else {
            str = "";
        }
        if (zzbvzVar != null) {
            i10 = zzbvzVar.zzb;
        } else {
            i10 = 1;
        }
        this.zzj = new zzbwx(str, i10);
        this.zzl = zzfezVar;
    }

    public final void finalize() {
        try {
            final zzcej zzcejVar = (zzcej) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzga)).booleanValue()) {
                if (!this.zzm && zzcejVar != null) {
                    zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoo
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

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwd zzc() {
        return this.zzj;
    }

    public final zzfez zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcej zzcejVar = (zzcej) this.zzd.get();
        if (zzcejVar != null && !zzcejVar.zzaG()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z10, Activity activity) {
        zzbbn zzbbnVar = zzbbw.zzat;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            if (com.google.android.gms.ads.internal.util.zzt.e(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzau)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            com.google.android.gms.ads.internal.util.client.zzm.e("The rewarded ad have been showed.");
            this.zzg.zza(zzfgi.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z10, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdgw e10) {
            this.zzg.zzc(e10);
            return false;
        }
    }
}

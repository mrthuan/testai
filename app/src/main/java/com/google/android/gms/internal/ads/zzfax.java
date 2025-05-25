package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfax implements zzena {
    private final Context zza;
    private final Executor zzb;
    private final zzcgj zzc;
    private final zzemk zzd;
    private final zzemo zze;
    private final ViewGroup zzf;
    private zzbcr zzg;
    private final zzczj zzh;
    private final zzfki zzi;
    private final zzdbp zzj;
    private final zzffe zzk;
    private y9.a zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzemz zzo;

    public zzfax(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcgj zzcgjVar, zzemk zzemkVar, zzemo zzemoVar, zzffe zzffeVar, zzdbp zzdbpVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgjVar;
        this.zzd = zzemkVar;
        this.zze = zzemoVar;
        this.zzk = zzffeVar;
        this.zzh = zzcgjVar.zzf();
        this.zzi = zzcgjVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdbpVar;
        zzffeVar.zzs(zzqVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        this.zzl = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhp)).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfat
                @Override // java.lang.Runnable
                public final void run() {
                    zzfax.this.zzk();
                }
            });
        }
        zzemz zzemzVar = this.zzo;
        if (zzemzVar != null) {
            zzemzVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        y9.a aVar = this.zzl;
        if (aVar != null && !aVar.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) {
        zzcql zzk;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfav
                @Override // java.lang.Runnable
                public final void run() {
                    zzfax.this.zzl();
                }
            });
            return false;
        }
        if (zza()) {
            if (!this.zzk.zzS()) {
                this.zzm = true;
            }
        } else {
            zzbbn zzbbnVar = zzbbw.zzia;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && zzlVar.f10204f) {
                this.zzc.zzl().zzo(true);
            }
            String zza = zzdrt.DYNAMITE_ENTER.zza();
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            Bundle zza2 = zzdrv.zza(new Pair(zzdrt.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.f10224z)), new Pair(zza, Long.valueOf(System.currentTimeMillis())));
            zzffe zzffeVar = this.zzk;
            zzffeVar.zzt(str);
            zzffeVar.zzH(zzlVar);
            zzffeVar.zzA(zza2);
            Context context = this.zza;
            zzffg zzJ = zzffeVar.zzJ();
            zzfju zzb = zzfjt.zzb(context, zzfke.zzf(zzJ), 3, zzlVar);
            zzfkf zzfkfVar = null;
            if (((Boolean) zzbdy.zze.zze()).booleanValue() && this.zzk.zzh().f10247k) {
                zzemk zzemkVar = this.zzd;
                if (zzemkVar != null) {
                    zzemkVar.zzdB(zzfgi.zzd(7, null, null));
                }
            } else {
                if (((Boolean) zzbaVar.c.zza(zzbbw.zzhp)).booleanValue()) {
                    zzcqk zze = this.zzc.zze();
                    zzcvy zzcvyVar = new zzcvy();
                    zzcvyVar.zze(this.zza);
                    zzcvyVar.zzi(zzJ);
                    zze.zzi(zzcvyVar.zzj());
                    zzdci zzdciVar = new zzdci();
                    zzdciVar.zzj(this.zzd, this.zzb);
                    zzdciVar.zzk(this.zzd, this.zzb);
                    zze.zzf(zzdciVar.zzn());
                    zze.zze(new zzekt(this.zzg));
                    zze.zzd(new zzdhg(zzdjm.zza, null));
                    zze.zzg(new zzcrm(this.zzh, this.zzj));
                    zze.zzc(new zzcph(this.zzf));
                    zzk = zze.zzk();
                } else {
                    zzcqk zze2 = this.zzc.zze();
                    zzcvy zzcvyVar2 = new zzcvy();
                    zzcvyVar2.zze(this.zza);
                    zzcvyVar2.zzi(zzJ);
                    zze2.zzi(zzcvyVar2.zzj());
                    zzdci zzdciVar2 = new zzdci();
                    zzdciVar2.zzj(this.zzd, this.zzb);
                    zzdciVar2.zza(this.zzd, this.zzb);
                    zzdciVar2.zza(this.zze, this.zzb);
                    zzdciVar2.zzl(this.zzd, this.zzb);
                    zzdciVar2.zzd(this.zzd, this.zzb);
                    zzdciVar2.zze(this.zzd, this.zzb);
                    zzdciVar2.zzf(this.zzd, this.zzb);
                    zzdciVar2.zzb(this.zzd, this.zzb);
                    zzdciVar2.zzk(this.zzd, this.zzb);
                    zzdciVar2.zzi(this.zzd, this.zzb);
                    zze2.zzf(zzdciVar2.zzn());
                    zze2.zze(new zzekt(this.zzg));
                    zze2.zzd(new zzdhg(zzdjm.zza, null));
                    zze2.zzg(new zzcrm(this.zzh, this.zzj));
                    zze2.zzc(new zzcph(this.zzf));
                    zzk = zze2.zzk();
                }
                if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
                    zzfkfVar = zzk.zzj();
                    zzfkfVar.zzi(3);
                    zzfkfVar.zzb(zzlVar.f10214p);
                    zzfkfVar.zzf(zzlVar.f10211m);
                }
                this.zzo = zzemzVar;
                zzctc zzd = zzk.zzd();
                y9.a zzi = zzd.zzi(zzd.zzj());
                this.zzl = zzi;
                zzgcj.zzr(zzi, new zzfaw(this, zzfkfVar, zzb, zzk), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzffe zzg() {
        return this.zzk;
    }

    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(this.zzn);
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdB(zzfgi.zzd(6, null, null));
    }

    public final void zzm() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzn() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final void zzp(zzczc zzczcVar) {
        this.zzh.zzo(zzczcVar, this.zzb);
    }

    public final void zzq(zzbcr zzbcrVar) {
        this.zzg = zzbcrVar;
    }

    public final void zzr() {
        synchronized (this) {
            y9.a aVar = this.zzl;
            if (aVar != null && aVar.isDone()) {
                try {
                    zzcpk zzcpkVar = (zzcpk) this.zzl.get();
                    this.zzl = null;
                    this.zzf.removeAllViews();
                    if (zzcpkVar.zzd() != null) {
                        ViewParent parent = zzcpkVar.zzd().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = "";
                            if (zzcpkVar.zzm() != null) {
                                str = zzcpkVar.zzm().zzg();
                            }
                            com.google.android.gms.ads.internal.util.client.zzm.e("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                            ((ViewGroup) parent).removeView(zzcpkVar.zzd());
                        }
                    }
                    zzbbn zzbbnVar = zzbbw.zzhp;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                    if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                        zzday zzo = zzcpkVar.zzo();
                        zzo.zza(this.zzd);
                        zzo.zzc(this.zze);
                    }
                    this.zzf.addView(zzcpkVar.zzd());
                    this.zzo.zzb(zzcpkVar);
                    if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                        Executor executor = this.zzb;
                        final zzemk zzemkVar = this.zzd;
                        Objects.requireNonNull(zzemkVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfau
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzemk.this.zzs();
                            }
                        });
                    }
                    if (zzcpkVar.zza() >= 0) {
                        this.zzm = false;
                        this.zzh.zzd(zzcpkVar.zza());
                        this.zzh.zze(zzcpkVar.zzc());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcpkVar.zzc());
                    }
                } catch (InterruptedException | ExecutionException unused) {
                    zzu();
                    com.google.android.gms.ads.internal.util.zze.i();
                    this.zzm = true;
                    this.zzh.zza();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.h("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.h("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zza();
            }
        }
    }

    public final boolean zzt() {
        PowerManager powerManager;
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        Context context = view.getContext();
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        if (applicationContext != null) {
            powerManager = (PowerManager) applicationContext.getSystemService("power");
        } else {
            powerManager = null;
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return com.google.android.gms.ads.internal.util.zzt.o(view, powerManager, keyguardManager);
    }
}

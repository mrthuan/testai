package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfki implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdpy zzj;
    private final List zzk;
    private final zzbvj zzm;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfko zzg = zzfkr.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfki(Context context, VersionInfoParcel versionInfoParcel, zzdpy zzdpyVar, zzebn zzebnVar, zzbvj zzbvjVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdpyVar;
        this.zzm = zzbvjVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhW)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.w();
        } else {
            this.zzk = zzfxr.zzm();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        boolean z10;
        synchronized (zza) {
            if (zzb == null) {
                if (!((Boolean) zzbdl.zzb.zze()).booleanValue()) {
                    zzb = Boolean.FALSE;
                } else {
                    if (Math.random() < ((Double) zzbdl.zza.zze()).doubleValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zzb = Boolean.valueOf(z10);
                }
            }
            booleanValue = zzb.booleanValue();
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzaV = ((zzfkr) this.zzg.zzbr()).zzaV();
                        this.zzg.zzc();
                    }
                    new zzebm(this.zze, this.zzf.f10345a, this.zzm, Binder.getCallingUid()).zza(new zzebk((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhQ), 60000, new HashMap(), zzaV, "application/x-protobuf", false));
                } catch (Exception e10) {
                    if ((e10 instanceof zzdwl) && ((zzdwl) e10).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(e10, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfjy zzfjyVar) {
        zzbzo.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkh
            @Override // java.lang.Runnable
            public final void run() {
                zzfki.this.zzc(zzfjyVar);
            }
        });
    }

    public final void zzc(zzfjy zzfjyVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                        this.zzh = com.google.android.gms.ads.internal.util.zzt.C(this.zze);
                    } catch (RemoteException | RuntimeException e10) {
                        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f10884b;
                    Context context = this.zze;
                    googleApiAvailabilityLight.getClass();
                    this.zzi = GoogleApiAvailabilityLight.a(context);
                    zzbbn zzbbnVar = zzbbw.zzhR;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                    int intValue = ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue();
                    if (((Boolean) zzbaVar.c.zza(zzbbw.zzkT)).booleanValue()) {
                        long j10 = intValue;
                        zzbzo.zzd.scheduleWithFixedDelay(this, j10, j10, TimeUnit.MILLISECONDS);
                    } else {
                        long j11 = intValue;
                        zzbzo.zzd.scheduleAtFixedRate(this, j11, j11, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfjyVar != null) {
            synchronized (zzc) {
                int zza2 = this.zzg.zza();
                zzbbn zzbbnVar2 = zzbbw.zzhS;
                com.google.android.gms.ads.internal.client.zzba zzbaVar2 = com.google.android.gms.ads.internal.client.zzba.f10115d;
                if (zza2 >= ((Integer) zzbaVar2.c.zza(zzbbnVar2)).intValue()) {
                    return;
                }
                zzfkk zza3 = zzfkm.zza();
                zza3.zzu(zzfjyVar.zzm());
                zza3.zzq(zzfjyVar.zzl());
                zza3.zzg(zzfjyVar.zzb());
                zza3.zzw(3);
                zza3.zzn(this.zzf.f10345a);
                zza3.zzb(this.zzh);
                zza3.zzk(Build.VERSION.RELEASE);
                zza3.zzr(Build.VERSION.SDK_INT);
                zza3.zzv(zzfjyVar.zzo());
                zza3.zzj(zzfjyVar.zza());
                zza3.zze(this.zzi);
                zza3.zzt(zzfjyVar.zzn());
                zza3.zzc(zzfjyVar.zze());
                zza3.zzf(zzfjyVar.zzg());
                zza3.zzh(zzfjyVar.zzh());
                zza3.zzi(this.zzj.zzb(zzfjyVar.zzh()));
                zza3.zzl(zzfjyVar.zzi());
                zza3.zzm(zzfjyVar.zzd());
                zza3.zzd(zzfjyVar.zzf());
                zza3.zzs(zzfjyVar.zzk());
                zza3.zzo(zzfjyVar.zzj());
                zza3.zzp(zzfjyVar.zzc());
                if (((Boolean) zzbaVar2.c.zza(zzbbw.zzhW)).booleanValue()) {
                    zza3.zza(this.zzk);
                }
                zzfko zzfkoVar = this.zzg;
                zzfkp zza4 = zzfkq.zza();
                zza4.zza(zza3);
                zzfkoVar.zzb(zza4);
            }
        }
    }
}

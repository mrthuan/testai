package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbze {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzbzi zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    private zzbcb zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzbzd zzl;
    private final Object zzm;
    private y9.a zzn;
    private final AtomicBoolean zzo;

    public zzbze() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzbzi(com.google.android.gms.ads.internal.client.zzay.f10107f.c, zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzbzd(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public final boolean zzA(Context context) {
        if (PlatformVersion.a()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhC)).booleanValue()) {
                return this.zzo.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final Context zzd() {
        return this.zze;
    }

    public final Resources zze() {
        if (this.zzf.f10347d) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjV)).booleanValue()) {
                try {
                    return DynamiteModule.c(this.zze, DynamiteModule.f11410b, ModuleDescriptor.MODULE_ID).f11422a.getResources();
                } catch (Exception e10) {
                    throw new com.google.android.gms.ads.internal.util.client.zzp(e10);
                }
            }
            try {
                DynamiteModule.c(this.zze, DynamiteModule.f11410b, ModuleDescriptor.MODULE_ID).f11422a.getResources();
                return null;
            } catch (Exception e11) {
                throw new com.google.android.gms.ads.internal.util.client.zzp(e11);
            }
        } catch (com.google.android.gms.ads.internal.util.client.zzp unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
            return null;
        }
        com.google.android.gms.ads.internal.util.client.zzm.g(5);
        return null;
    }

    public final zzbcb zzg() {
        zzbcb zzbcbVar;
        synchronized (this.zza) {
            zzbcbVar = this.zzh;
        }
        return zzbcbVar;
    }

    public final zzbzi zzh() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzi() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final y9.a zzk() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzcv)).booleanValue()) {
                synchronized (this.zzm) {
                    y9.a aVar = this.zzn;
                    if (aVar != null) {
                        return aVar;
                    }
                    y9.a zzb = zzbzo.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyz
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbze.this.zzo();
                        }
                    });
                    this.zzn = zzb;
                    return zzb;
                }
            }
        }
        return zzgcj.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzo() {
        Context zza = zzbvl.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo c = Wrappers.a(zza).c(4096, zza.getApplicationInfo().packageName);
            if (c.requestedPermissions != null && c.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = c.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((c.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzu(Context context, VersionInfoParcel versionInfoParcel) {
        zzbcb zzbcbVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                    zzuVar.f10556f.zzc(this.zzc);
                    this.zzb.k(this.zze);
                    zzbtq.zzb(this.zze, this.zzf);
                    zzbcc zzbccVar = zzuVar.f10562l;
                    zzbbn zzbbnVar = zzbbw.zzbN;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                    if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.zze.h("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbcbVar = null;
                    } else {
                        zzbcbVar = new zzbcb();
                    }
                    this.zzh = zzbcbVar;
                    if (zzbcbVar != null) {
                        zzbzr.zza(new zzbza(this).zzb(), "AppState.registerCsiReporter");
                    }
                    if (PlatformVersion.a()) {
                        if (((Boolean) zzbaVar.c.zza(zzbbw.zzhC)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbzb(this));
                            } catch (RuntimeException unused) {
                                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                                this.zzo.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.zzu.B.c.v(context, versionInfoParcel.f10345a);
    }

    public final void zzv(Throwable th2, String str) {
        zzbtq.zzb(this.zze, this.zzf).zzi(th2, str, ((Double) zzbeb.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable th2, String str) {
        zzbtq.zzb(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzx(Throwable th2, String str) {
        zzbtq.zzd(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzy(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzz(String str) {
        this.zzg = str;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeay extends zzbuj {
    private final Context zza;
    private final zzgcu zzb;
    private final zzebq zzc;
    private final zzclv zzd;
    private final ArrayDeque zze;
    private final zzfki zzf;
    private final zzbvj zzg;

    public zzeay(Context context, zzgcu zzgcuVar, zzbvj zzbvjVar, zzclv zzclvVar, zzebq zzebqVar, ArrayDeque arrayDeque, zzebn zzebnVar, zzfki zzfkiVar) {
        zzbbw.zza(context);
        this.zza = context;
        this.zzb = zzgcuVar;
        this.zzg = zzbvjVar;
        this.zzc = zzebqVar;
        this.zzd = zzclvVar;
        this.zze = arrayDeque;
        this.zzf = zzfkiVar;
    }

    private final synchronized zzeav zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzeav zzeavVar = (zzeav) it.next();
            if (zzeavVar.zzc.equals(str)) {
                it.remove();
                return zzeavVar;
            }
        }
        return null;
    }

    private static y9.a zzl(y9.a aVar, zzfjl zzfjlVar, zzbno zzbnoVar, zzfkf zzfkfVar, zzfju zzfjuVar) {
        zzbne zza = zzbnoVar.zza("AFMA_getAdDictionary", zzbnl.zza, new zzbng() { // from class: com.google.android.gms.internal.ads.zzeaq
            @Override // com.google.android.gms.internal.ads.zzbng
            public final Object zza(JSONObject jSONObject) {
                return new zzbvd(jSONObject);
            }
        });
        zzfke.zzd(aVar, zzfjuVar);
        zzfiq zza2 = zzfjlVar.zzb(zzfjf.BUILD_URL, aVar).zzf(zza).zza();
        zzfke.zzc(zza2, zzfkfVar, zzfjuVar);
        return zza2;
    }

    private static y9.a zzm(final zzbvb zzbvbVar, zzfjl zzfjlVar, final zzewr zzewrVar) {
        zzgbq zzgbqVar = new zzgbq() { // from class: com.google.android.gms.internal.ads.zzeak
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzewr.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.i((Bundle) obj), zzbvbVar.zzm);
            }
        };
        return zzfjlVar.zzb(zzfjf.GMS_SIGNALS, zzgcj.zzh(zzbvbVar.zza)).zzf(zzgbqVar).zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzeal
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.h("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.h(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzeav zzeavVar) {
        zzo();
        this.zze.addLast(zzeavVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbdz.zzc.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(y9.a aVar, zzbuu zzbuuVar, zzbvb zzbvbVar) {
        zzgcj.zzr(zzgcj.zzn(aVar, new zzgbq(this) { // from class: com.google.android.gms.internal.ads.zzear
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzgcj.zzh(zzfgh.zza((InputStream) obj));
            }
        }, zzbzo.zza), new zzeau(this, zzbuuVar, zzbvbVar), zzbzo.zzf);
    }

    public final y9.a zzb(final zzbvb zzbvbVar, int i10) {
        if (!((Boolean) zzbdz.zza.zze()).booleanValue()) {
            return zzgcj.zzg(new Exception("Split request is disabled."));
        }
        zzfhb zzfhbVar = zzbvbVar.zzi;
        if (zzfhbVar == null) {
            return zzgcj.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfhbVar.zzc != 0 && zzfhbVar.zzd != 0) {
            zzbno zzb = com.google.android.gms.ads.internal.zzu.B.f10566p.zzb(this.zza, VersionInfoParcel.d(), this.zzf);
            zzewr zzr = this.zzd.zzr(zzbvbVar, i10);
            zzfjl zzc = zzr.zzc();
            final y9.a zzm = zzm(zzbvbVar, zzc, zzr);
            zzfkf zzd = zzr.zzd();
            final zzfju zza = zzfjt.zza(this.zza, 9);
            final y9.a zzl = zzl(zzm, zzc, zzb, zzd, zza);
            return zzc.zza(zzfjf.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeao
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeay.this.zzj(zzl, zzm, zzbvbVar, zza);
                }
            }).zza();
        }
        return zzgcj.zzg(new Exception("Caching is disabled."));
    }

    public final y9.a zzc(final zzbvb zzbvbVar, int i10) {
        zzeav zzk;
        zzfju zzfjuVar;
        zzfiq zza;
        zzbno zzb = com.google.android.gms.ads.internal.zzu.B.f10566p.zzb(this.zza, VersionInfoParcel.d(), this.zzf);
        zzewr zzr = this.zzd.zzr(zzbvbVar, i10);
        zzbne zza2 = zzb.zza("google.afma.response.normalize", zzeax.zza, zzbnl.zzb);
        if (!((Boolean) zzbdz.zza.zze()).booleanValue()) {
            String str = zzbvbVar.zzj;
            zzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.h("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzk = zzk(zzbvbVar.zzh);
            if (zzk == null) {
                com.google.android.gms.ads.internal.util.zze.h("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzk == null) {
            zzfjuVar = zzfjt.zza(this.zza, 9);
        } else {
            zzfjuVar = zzk.zzd;
        }
        zzfkf zzd = zzr.zzd();
        zzd.zzd(zzbvbVar.zza.getStringArrayList("ad_types"));
        zzebp zzebpVar = new zzebp(zzbvbVar.zzg, zzd, zzfjuVar);
        zzebm zzebmVar = new zzebm(this.zza, zzbvbVar.zzb.f10345a, this.zzg, i10);
        zzfjl zzc = zzr.zzc();
        zzfju zza3 = zzfjt.zza(this.zza, 11);
        if (zzk == null) {
            final y9.a zzm = zzm(zzbvbVar, zzc, zzr);
            final y9.a zzl = zzl(zzm, zzc, zzb, zzd, zzfjuVar);
            zzfju zza4 = zzfjt.zza(this.zza, 10);
            final zzfiq zza5 = zzc.zza(zzfjf.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbvb zzbvbVar2;
                    Bundle bundle;
                    zzbvd zzbvdVar = (zzbvd) y9.a.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue() && (bundle = (zzbvbVar2 = zzbvbVar).zzm) != null) {
                        bundle.putLong(zzdrt.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbvdVar.zzc());
                        zzbvbVar2.zzm.putLong(zzdrt.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbvdVar.zzb());
                    }
                    return new zzebo((JSONObject) zzm.get(), zzbvdVar);
                }
            }).zze(zzebpVar).zze(new zzfka(zza4)).zze(zzebmVar).zza();
            zzfke.zza(zza5, zzd, zza4);
            zzfke.zzd(zza5, zza3);
            zza = zzc.zza(zzfjf.PRE_PROCESS, zzm, zzl, zza5).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzean
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue() && (bundle = zzbvb.this.zzm) != null) {
                        String zza6 = zzdrt.HTTP_RESPONSE_READY.zza();
                        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                        bundle.putLong(zza6, System.currentTimeMillis());
                    }
                    return new zzeax((zzebl) zza5.get(), (JSONObject) zzm.get(), (zzbvd) zzl.get());
                }
            }).zzf(zza2).zza();
        } else {
            zzebo zzeboVar = new zzebo(zzk.zzb, zzk.zza);
            zzfju zza6 = zzfjt.zza(this.zza, 10);
            final zzfiq zza7 = zzc.zzb(zzfjf.HTTP, zzgcj.zzh(zzeboVar)).zze(zzebpVar).zze(new zzfka(zza6)).zze(zzebmVar).zza();
            zzfke.zza(zza7, zzd, zza6);
            final y9.a zzh = zzgcj.zzh(zzk);
            zzfke.zzd(zza7, zza3);
            zza = zzc.zza(zzfjf.PRE_PROCESS, zza7, zzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    y9.a aVar = zzh;
                    return new zzeax((zzebl) y9.a.this.get(), ((zzeav) aVar.get()).zzb, ((zzeav) aVar.get()).zza);
                }
            }).zzf(zza2).zza();
        }
        zzfke.zza(zza, zzd, zza3);
        return zza;
    }

    public final y9.a zzd(final zzbvb zzbvbVar, int i10) {
        zzbno zzb = com.google.android.gms.ads.internal.zzu.B.f10566p.zzb(this.zza, VersionInfoParcel.d(), this.zzf);
        if (!((Boolean) zzbee.zza.zze()).booleanValue()) {
            return zzgcj.zzg(new Exception("Signal collection disabled."));
        }
        zzewr zzr = this.zzd.zzr(zzbvbVar, i10);
        final zzevr zza = zzr.zza();
        zzbne zza2 = zzb.zza("google.afma.request.getSignals", zzbnl.zza, zzbnl.zzb);
        zzfju zza3 = zzfjt.zza(this.zza, 22);
        zzfiq zza4 = zzr.zzc().zzb(zzfjf.GET_SIGNALS, zzgcj.zzh(zzbvbVar.zza)).zze(new zzfka(zza3)).zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzeas
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzevr.this.zza(com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.i((Bundle) obj), zzbvbVar.zzm);
            }
        }).zzb(zzfjf.JS_SIGNALS).zzf(zza2).zza();
        zzfkf zzd = zzr.zzd();
        zzd.zzd(zzbvbVar.zza.getStringArrayList("ad_types"));
        zzd.zzf(zzbvbVar.zza.getBundle("extras"));
        zzfke.zzb(zza4, zzd, zza3);
        if (((Boolean) zzbds.zzg.zze()).booleanValue()) {
            zzebq zzebqVar = this.zzc;
            Objects.requireNonNull(zzebqVar);
            zza4.addListener(new zzeap(zzebqVar), this.zzb);
        }
        return zza4;
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zze(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        zzp(zzb(zzbvbVar, Binder.getCallingUid()), zzbuuVar, zzbvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzf(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue() && (bundle = zzbvbVar.zzm) != null) {
            String zza = zzdrt.SERVICE_CONNECTED.zza();
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            bundle.putLong(zza, System.currentTimeMillis());
        }
        zzp(zzd(zzbvbVar, Binder.getCallingUid()), zzbuuVar, zzbvbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzg(zzbvb zzbvbVar, zzbuu zzbuuVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue() && (bundle = zzbvbVar.zzm) != null) {
            String zza = zzdrt.SERVICE_CONNECTED.zza();
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            bundle.putLong(zza, System.currentTimeMillis());
        }
        y9.a zzc = zzc(zzbvbVar, Binder.getCallingUid());
        zzp(zzc, zzbuuVar, zzbvbVar);
        if (((Boolean) zzbds.zze.zze()).booleanValue()) {
            zzebq zzebqVar = this.zzc;
            Objects.requireNonNull(zzebqVar);
            zzc.addListener(new zzeap(zzebqVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzh(String str, zzbuu zzbuuVar) {
        zzp(zzi(str), zzbuuVar, null);
    }

    public final y9.a zzi(String str) {
        if (!((Boolean) zzbdz.zza.zze()).booleanValue()) {
            return zzgcj.zzg(new Exception("Split request is disabled."));
        }
        zzeat zzeatVar = new zzeat(this);
        if (zzk(str) == null) {
            return zzgcj.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzgcj.zzh(zzeatVar);
    }

    public final /* synthetic */ InputStream zzj(y9.a aVar, y9.a aVar2, zzbvb zzbvbVar, zzfju zzfjuVar) {
        String zze = ((zzbvd) aVar.get()).zze();
        String str = zzbvbVar.zzh;
        zzn(new zzeav((zzbvd) aVar.get(), (JSONObject) aVar2.get(), str, zze, zzfjuVar));
        return new ByteArrayInputStream(zze.getBytes(zzfuj.zzc));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdun {
    private final long zzd;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqb zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsu zzl;
    private final VersionInfoParcel zzm;
    private final zzddp zzo;
    private final zzfki zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzbzt zze = new zzbzt();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;

    public zzdun(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqb zzdqbVar, ScheduledExecutorService scheduledExecutorService, zzdsu zzdsuVar, VersionInfoParcel versionInfoParcel, zzddp zzddpVar, zzfki zzfkiVar) {
        this.zzh = zzdqbVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsuVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzddpVar;
        this.zzp = zzfkiVar;
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zzd = SystemClock.elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static void zzj(final zzdun zzdunVar, String str) {
        String str2;
        String str3 = "data";
        int i10 = 5;
        final zzfju zza = zzfjt.zza(zzdunVar.zzf, 5);
        zza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfju zza2 = zzfjt.zza(zzdunVar.zzf, i10);
                zza2.zzi();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzbzt zzbztVar = new zzbzt();
                y9.a zzo = zzgcj.zzo(zzbztVar, ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbE)).longValue(), TimeUnit.SECONDS, zzdunVar.zzk);
                zzdunVar.zzl.zzc(next);
                zzdunVar.zzo.zzc(next);
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdue
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdun.this.zzq(obj, zzbztVar, next, elapsedRealtime, zza2);
                    }
                }, zzdunVar.zzi);
                arrayList.add(zzo);
                final zzdum zzdumVar = new zzdum(zzdunVar, obj, next, elapsedRealtime, zza2, zzbztVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray(str3);
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject(str3);
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    str2 = str3;
                                    try {
                                        String next2 = keys2.next();
                                        bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                        jSONArray = jSONArray;
                                        str3 = str2;
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            String str4 = str3;
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzblf(optString, bundle));
                            i11++;
                            jSONArray = jSONArray2;
                            str3 = str4;
                        }
                    } catch (JSONException unused2) {
                    }
                }
                str2 = str3;
                zzdunVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfge zzc = zzdunVar.zzh.zzc(next, new JSONObject());
                        zzdunVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdui
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdun.this.zzn(next, zzdumVar, zzc, arrayList2);
                            }
                        });
                    } catch (zzffn unused3) {
                        zzdumVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                }
                str3 = str2;
                i10 = 5;
            }
            zzgcj.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzduf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdun.this.zzf(zza);
                    return null;
                }
            }, zzdunVar.zzi);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.i();
            zzdunVar.zzo.zza("MalformedJson");
            zzdunVar.zzl.zza("MalformedJson");
            zzdunVar.zze.zzd(e10);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdapterInitializer.updateAdapterStatus");
            zzfki zzfkiVar = zzdunVar.zzp;
            zza.zzh(e10);
            zza.zzg(false);
            zzfkiVar.zzb(zza.zzm());
        }
    }

    private final synchronized y9.a zzu() {
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        String zzc = zzuVar.f10557g.zzi().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgcj.zzh(zzc);
        }
        final zzbzt zzbztVar = new zzbzt();
        zzuVar.f10557g.zzi().q(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdug
            @Override // java.lang.Runnable
            public final void run() {
                zzdun.this.zzo(zzbztVar);
            }
        });
        return zzbztVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i10) {
        this.zzn.put(str, new zzbkv(str, z10, i10, str2));
    }

    public final /* synthetic */ Object zzf(zzfju zzfjuVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfjuVar.zzg(true);
        this.zzp.zzb(zzfjuVar.zzm());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbkv zzbkvVar = (zzbkv) this.zzn.get(str);
            arrayList.add(new zzbkv(str, zzbkvVar.zzb, zzbkvVar.zzc, zzbkvVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (SystemClock.elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    public final void zzn(String str, zzbkz zzbkzVar, zzfge zzfgeVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbkzVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfgeVar.zzi(context, zzbkzVar, list);
            } catch (RemoteException e10) {
                throw new zzfvq(e10);
            } catch (zzffn unused) {
                zzbkzVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException unused2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final /* synthetic */ void zzo(final zzbzt zzbztVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdud
            @Override // java.lang.Runnable
            public final void run() {
                String zzc = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzh().zzc();
                boolean isEmpty = TextUtils.isEmpty(zzc);
                zzbzt zzbztVar2 = zzbztVar;
                if (!isEmpty) {
                    zzbztVar2.zzc(zzc);
                } else {
                    zzbztVar2.zzd(new Exception());
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final void zzq(Object obj, zzbzt zzbztVar, String str, long j10, zzfju zzfjuVar) {
        synchronized (obj) {
            if (!zzbztVar.isDone()) {
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                zzv(str, false, "Timeout.", (int) (SystemClock.elapsedRealtime() - j10));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfki zzfkiVar = this.zzp;
                zzfjuVar.zzc("Timeout");
                zzfjuVar.zzg(false);
                zzfkiVar.zzb(zzfjuVar.zzm());
                zzbztVar.zzc(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbdy.zza.zze()).booleanValue()) {
            int i10 = this.zzm.c;
            zzbbn zzbbnVar = zzbbw.zzbD;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (i10 >= ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue() && this.zzq) {
                if (!this.zza) {
                    synchronized (this) {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zzf();
                        this.zzo.zzf();
                        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduj
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdun.this.zzp();
                            }
                        }, this.zzi);
                        this.zza = true;
                        y9.a zzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduc
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdun.this.zzm();
                            }
                        }, ((Long) zzbaVar.c.zza(zzbbw.zzbF)).longValue(), TimeUnit.SECONDS);
                        zzgcj.zzr(zzu, new zzdul(this), this.zzi);
                        return;
                    }
                }
                return;
            }
        }
        if (!this.zza) {
            zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
            this.zze.zzc(Boolean.FALSE);
            this.zza = true;
            this.zzb = true;
        }
    }

    public final void zzs(final zzblc zzblcVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduh
            @Override // java.lang.Runnable
            public final void run() {
                zzdun zzdunVar = zzdun.this;
                try {
                    zzblcVar.zzb(zzdunVar.zzg());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}

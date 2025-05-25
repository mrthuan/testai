package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbna {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfki zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;
    private zzbmz zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbna(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, zzfki zzfkiVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfkiVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public final zzbmu zzb(zzauo zzauoVar) {
        com.google.android.gms.ads.internal.util.zze.h("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.h("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.h("refreshIfDestroyed: Trying to acquire lock");
            synchronized (this.zza) {
                com.google.android.gms.ads.internal.util.zze.h("refreshIfDestroyed: Lock acquired");
                zzbmz zzbmzVar = this.zzh;
                if (zzbmzVar != null && this.zzi == 0) {
                    zzbmzVar.zzj(new zzbzx() { // from class: com.google.android.gms.internal.ads.zzbmg
                        @Override // com.google.android.gms.internal.ads.zzbzx
                        public final void zza(Object obj) {
                            zzbna.this.zzk((zzblv) obj);
                        }
                    }, new zzbzv() { // from class: com.google.android.gms.internal.ads.zzbmh
                        @Override // com.google.android.gms.internal.ads.zzbzv
                        public final void zza() {
                        }
                    });
                }
            }
            com.google.android.gms.ads.internal.util.zze.h("refreshIfDestroyed: Lock released");
            zzbmz zzbmzVar2 = this.zzh;
            if (zzbmzVar2 != null && zzbmzVar2.zze() != -1) {
                int i10 = this.zzi;
                if (i10 == 0) {
                    com.google.android.gms.ads.internal.util.zze.h("getEngine (NO_UPDATE): Lock released");
                    return this.zzh.zza();
                } else if (i10 == 1) {
                    this.zzi = 2;
                    zzd(null);
                    com.google.android.gms.ads.internal.util.zze.h("getEngine (PENDING_UPDATE): Lock released");
                    return this.zzh.zza();
                } else {
                    com.google.android.gms.ads.internal.util.zze.h("getEngine (UPDATING): Lock released");
                    return this.zzh.zza();
                }
            }
            this.zzi = 2;
            this.zzh = zzd(null);
            com.google.android.gms.ads.internal.util.zze.h("getEngine (NULL or REJECTED): Lock released");
            return this.zzh.zza();
        }
    }

    public final zzbmz zzd(zzauo zzauoVar) {
        zzfju zza = zzfjt.zza(this.zzb, 6);
        zza.zzi();
        final zzbmz zzbmzVar = new zzbmz(this.zzg);
        com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzbzo.zze.execute(new Runnable(null, zzbmzVar) { // from class: com.google.android.gms.internal.ads.zzbmk
            public final /* synthetic */ zzbmz zzb;

            {
                this.zzb = zzbmzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbna.this.zzj(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.h("loadNewJavascriptEngine: Promise created");
        zzbmzVar.zzj(new zzbmp(this, zzbmzVar, zza), new zzbmq(this, zzbmzVar, zza));
        return zzbmzVar;
    }

    public final void zzi(zzbmz zzbmzVar, final zzblv zzblvVar, ArrayList arrayList, long j10) {
        com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbmzVar.zze() != -1 && zzbmzVar.zze() != 1) {
                zzbbn zzbbnVar = zzbbw.zzgS;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                    zzbmzVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbmzVar.zzg();
                }
                zzgcu zzgcuVar = zzbzo.zze;
                Objects.requireNonNull(zzblvVar);
                zzgcuVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblv.this.zzc();
                    }
                });
                String valueOf = String.valueOf(zzbaVar.c.zza(zzbbw.zzb));
                int zze = zzbmzVar.zze();
                int i10 = this.zzi;
                String valueOf2 = String.valueOf(arrayList.get(0));
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                long currentTimeMillis = System.currentTimeMillis() - j10;
                com.google.android.gms.ads.internal.util.zze.h("Could not receive /jsLoaded in " + valueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zze + ". Update status(onEngLoadedTimeout) is " + i10 + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + currentTimeMillis + " ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    public final void zzj(zzauo zzauoVar, zzbmz zzbmzVar) {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before createJavascriptEngine");
            zzbmd zzbmdVar = new zzbmd(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmdVar.zzk(new zzbmj(this, arrayList, currentTimeMillis, zzbmzVar, zzbmdVar));
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmdVar.zzq("/jsLoaded", new zzbml(this, currentTimeMillis, zzbmzVar, zzbmdVar));
            com.google.android.gms.ads.internal.util.zzby zzbyVar = new com.google.android.gms.ads.internal.util.zzby();
            zzbmm zzbmmVar = new zzbmm(this, null, zzbmdVar, zzbyVar);
            zzbyVar.f10441a = zzbmmVar;
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmdVar.zzq("/requestReload", zzbmmVar);
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmdVar.zzh(this.zzc);
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmdVar.zzf(this.zzc);
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmdVar.zzg(this.zzc);
                com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.h("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzt.f10496l.postDelayed(new zzbmo(this, zzbmzVar, zzbmdVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzc)).intValue());
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            zzbbn zzbbnVar = zzbbw.zzgS;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                zzbmzVar.zzh(th2, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzgU)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbmzVar.zzg();
                return;
            }
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbmzVar.zzg();
        }
    }

    public final /* synthetic */ void zzk(zzblv zzblvVar) {
        if (zzblvVar.zzi()) {
            this.zzi = 1;
        }
    }
}

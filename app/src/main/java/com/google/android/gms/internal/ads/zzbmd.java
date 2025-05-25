package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbmd implements zzblv, zzblu {
    private final zzcej zza;

    public zzbmd(Context context, VersionInfoParcel versionInfoParcel, zzauo zzauoVar, com.google.android.gms.ads.internal.zza zzaVar) {
        zzcew zzcewVar = com.google.android.gms.ads.internal.zzu.B.f10554d;
        zzcej zza = zzcew.zza(context, zzcgd.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbav.zza(), null, null, null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        boolean z10;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
        zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            com.google.android.gms.ads.internal.util.zze.h("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.h("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
        if (!com.google.android.gms.ads.internal.util.zzt.f10496l.post(runnable)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(final String str) {
        com.google.android.gms.ads.internal.util.zze.h("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblz
            @Override // java.lang.Runnable
            public final void run() {
                zzbmd.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblt.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblt.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblt.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzf(final String str) {
        com.google.android.gms.ads.internal.util.zze.h("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbma
            @Override // java.lang.Runnable
            public final void run() {
                zzbmd.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzg(final String str) {
        com.google.android.gms.ads.internal.util.zze.h("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblx
            @Override // java.lang.Runnable
            public final void run() {
                zzbmd.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzh(String str) {
        com.google.android.gms.ads.internal.util.zze.h("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmb
            @Override // java.lang.Runnable
            public final void run() {
                zzbmd.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final zzbnc zzj() {
        return new zzbnc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zzk(final zzbmj zzbmjVar) {
        zzcgb zzN = this.zza.zzN();
        Objects.requireNonNull(zzbmjVar);
        zzN.zzH(new zzcga() { // from class: com.google.android.gms.internal.ads.zzbly
            @Override // com.google.android.gms.internal.ads.zzcga
            public final void zza() {
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                zzbmj zzbmjVar2 = zzbmj.this;
                final long j10 = zzbmjVar2.zzc;
                final ArrayList arrayList = zzbmjVar2.zzb;
                arrayList.add(Long.valueOf(currentTimeMillis - j10));
                String valueOf = String.valueOf(arrayList.get(0));
                com.google.android.gms.ads.internal.util.zze.h("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
                com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
                final zzbna zzbnaVar = zzbmjVar2.zza;
                final zzbmz zzbmzVar = zzbmjVar2.zzd;
                final zzblv zzblvVar = zzbmjVar2.zze;
                zzfVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbna.this.zzi(zzbmzVar, zzblvVar, arrayList, j10);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzb)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzblt.zzd(this, str, jSONObject);
    }

    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzq(String str, zzbix zzbixVar) {
        this.zza.zzag(str, new zzbmc(this, zzbixVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zzr(String str, final zzbix zzbixVar) {
        this.zza.zzaA(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzblw
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbix zzbixVar2;
                zzbix zzbixVar3 = (zzbix) obj;
                if (zzbixVar3 instanceof zzbmc) {
                    zzbix zzbixVar4 = zzbix.this;
                    zzbixVar2 = ((zzbmc) zzbixVar3).zzb;
                    if (zzbixVar2.equals(zzbixVar4)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }
}

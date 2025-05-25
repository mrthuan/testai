package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import n2.k;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfmb {
    private final zzfmd zza;
    private final WebView zzb;
    private final HashMap zzc = new HashMap();
    private final zzfmp zzd = new zzfmp();

    private zzfmb(zzfmd zzfmdVar, WebView webView, boolean z10) {
        zzfnj.zza();
        this.zza = zzfmdVar;
        this.zzb = webView;
        if (b.b.I("WEB_MESSAGE_LISTENER")) {
            zzg();
            m2.d.a(webView, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfma(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static zzfmb zza(zzfmd zzfmdVar, WebView webView, boolean z10) {
        return new zzfmb(zzfmdVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzfmb zzfmbVar, String str) {
        zzflq zzflqVar = (zzflq) zzfmbVar.zzc.get(str);
        if (zzflqVar != null) {
            zzflqVar.zzc();
            zzfmbVar.zzc.remove(str);
        }
    }

    public static /* bridge */ /* synthetic */ void zzd(zzfmb zzfmbVar, String str) {
        zzflv zzflvVar = zzflv.DEFINED_BY_JAVASCRIPT;
        zzfly zzflyVar = zzfly.DEFINED_BY_JAVASCRIPT;
        zzfmc zzfmcVar = zzfmc.JAVASCRIPT;
        zzflu zzfluVar = new zzflu(zzflr.zza(zzflvVar, zzflyVar, zzfmcVar, zzfmcVar, false), zzfls.zzb(zzfmbVar.zza, zzfmbVar.zzb, null, null), str);
        zzfmbVar.zzc.put(str, zzfluVar);
        zzfluVar.zzd(zzfmbVar.zzb);
        for (zzfmo zzfmoVar : zzfmbVar.zzd.zza()) {
            zzfluVar.zzb((View) zzfmoVar.zzb().get(), zzfmoVar.zza(), zzfmoVar.zzc());
        }
        zzfluVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        WebView webView = this.zzb;
        int i10 = m2.d.f21795a;
        if (n2.j.c.d()) {
            k.a.f22330a.createWebView(webView).removeWebMessageListener("omidJsSessionService");
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public final void zze(View view, zzflx zzflxVar, String str) {
        for (zzflq zzflqVar : this.zzc.values()) {
            zzflqVar.zzb(view, zzflxVar, "Ad overlay");
        }
        this.zzd.zzb(view, zzflxVar, "Ad overlay");
    }

    public final void zzf(zzcey zzceyVar) {
        for (zzflq zzflqVar : this.zzc.values()) {
            zzflqVar.zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzflz(this, zzceyVar, timer), 1000L);
    }
}

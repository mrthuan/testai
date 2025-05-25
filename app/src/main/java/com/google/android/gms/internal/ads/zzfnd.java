package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfnd extends zzfmz {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfnd(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfmz
    public final void zzc() {
        long convert;
        super.zzc();
        if (this.zzb == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfnc(this), Math.max(4000 - convert, 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmz
    public final void zzi(zzflu zzfluVar, zzfls zzflsVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzflsVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzj(zzfluVar, zzflsVar, jSONObject);
        } else {
            zzfme zzfmeVar = (zzfme) zzi.get((String) it.next());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmz
    public final void zzn() {
        WebView webView = new WebView(zzfmq.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfnb(this));
        zzm(this.zza);
        zzfms.zzj(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfme zzfmeVar = (zzfme) this.zzc.get((String) it.next());
        throw null;
    }
}

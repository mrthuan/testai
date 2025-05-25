package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzffk;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzgcu;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10619a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f10620b;
    public final zzauo c;

    /* renamed from: d  reason: collision with root package name */
    public final zzffk f10621d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10622e;

    /* renamed from: f  reason: collision with root package name */
    public final zzdsp f10623f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10624g;

    /* renamed from: h  reason: collision with root package name */
    public final zzgcu f10625h = zzbzo.zze;

    /* renamed from: i  reason: collision with root package name */
    public final zzfll f10626i;

    /* renamed from: j  reason: collision with root package name */
    public final zze f10627j;

    public a(WebView webView, zzauo zzauoVar, zzdsp zzdspVar, zzfll zzfllVar, zzffk zzffkVar, zze zzeVar) {
        this.f10620b = webView;
        Context context = webView.getContext();
        this.f10619a = context;
        this.c = zzauoVar;
        this.f10623f = zzdspVar;
        zzbbw.zza(context);
        zzbbn zzbbnVar = zzbbw.zziI;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        this.f10622e = ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue();
        this.f10624g = ((Boolean) zzbaVar.c.zza(zzbbw.zziJ)).booleanValue();
        this.f10626i = zzfllVar;
        this.f10621d = zzffkVar;
        this.f10627j = zzeVar;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzuVar.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String zze = this.c.zzc().zze(this.f10619a, str, this.f10620b);
            if (this.f10624g) {
                zzuVar.f10560j.getClass();
                zzq.d(this.f10623f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        int min = Math.min(i10, this.f10622e);
        try {
            return (String) zzbzo.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return a.this.getClickSignals(str);
                }
            }).get(min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (!(e10 instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final e eVar = new e(this, uuid);
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            this.f10627j.b(this.f10620b, eVar);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziL)).booleanValue()) {
                this.f10625h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z10;
                        a aVar = a.this;
                        aVar.getClass();
                        CookieManager i10 = com.google.android.gms.ads.internal.zzu.B.f10555e.i();
                        if (i10 != null) {
                            z10 = i10.acceptThirdPartyCookies(aVar.f10620b);
                        } else {
                            z10 = false;
                        }
                        Bundle bundle2 = bundle;
                        bundle2.putBoolean("accept_3p_cookie", z10);
                        QueryInfo.a(aVar.f10619a, AdFormat.BANNER, new AdRequest((AdRequest.Builder) new AdRequest.Builder().a(bundle2)), eVar);
                    }
                });
            } else {
                QueryInfo.a(this.f10619a, AdFormat.BANNER, new AdRequest((AdRequest.Builder) new AdRequest.Builder().a(bundle)), eVar);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzuVar.f10560j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String zzh = this.c.zzc().zzh(this.f10619a, this.f10620b, null);
            if (this.f10624g) {
                zzuVar.f10560j.getClass();
                zzq.d(this.f10623f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        int min = Math.min(i10, this.f10622e);
        try {
            return (String) zzbzo.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return a.this.getViewSignals();
                }
            }).get(min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (!(e10 instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziN)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzba
                @Override // java.lang.Runnable
                public final void run() {
                    zzffk zzffkVar;
                    a aVar = a.this;
                    aVar.getClass();
                    Uri parse = Uri.parse(str);
                    try {
                        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzla)).booleanValue();
                        WebView webView = aVar.f10620b;
                        Context context = aVar.f10619a;
                        if (booleanValue && (zzffkVar = aVar.f10621d) != null) {
                            parse = zzffkVar.zza(parse, context, webView, null);
                        } else {
                            parse = aVar.c.zza(parse, context, webView, null);
                        }
                    } catch (zzaup e10) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(3);
                        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "TaggingLibraryJsInterface.recordClick");
                    }
                    aVar.f10626i.zzc(parse.toString(), null);
                }
            });
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i10 = jSONObject.getInt("x");
            i11 = jSONObject.getInt(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);
            i12 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            i13 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
        try {
            if (i13 != 0) {
                int i16 = 1;
                if (i13 != 1) {
                    i16 = 2;
                    if (i13 != 2) {
                        i16 = 3;
                        if (i13 != 3) {
                            i14 = -1;
                        }
                    }
                }
                i15 = i16;
                this.c.zzd(MotionEvent.obtain(0L, i12, i15, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            i14 = 0;
            this.c.zzd(MotionEvent.obtain(0L, i12, i15, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e12) {
            e = e12;
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i15 = i14;
    }
}

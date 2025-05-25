package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbdx;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class e extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f10636a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10637b;

    public e(a aVar, String str) {
        this.f10636a = str;
        this.f10637b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        long j10;
        com.google.android.gms.ads.internal.util.client.zzm.e("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[3];
        objArr[0] = this.f10636a;
        objArr[1] = str;
        zzbdc zzbdcVar = zzbdx.zza;
        if (((Boolean) zzbdcVar.zze()).booleanValue()) {
            j10 = ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziX)).longValue();
        } else {
            j10 = 0;
        }
        objArr[2] = Long.valueOf(j10);
        final String format = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'error': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", objArr);
        boolean booleanValue = ((Boolean) zzbdcVar.zze()).booleanValue();
        a aVar = this.f10637b;
        if (booleanValue) {
            try {
                aVar.f10625h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.f10637b.f10620b.evaluateJavascript(format, null);
                    }
                });
                return;
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(e10, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
                return;
            }
        }
        aVar.f10620b.evaluateJavascript(format, null);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        final String format;
        long j10;
        String str = this.f10636a;
        String str2 = queryInfo.f10766a.f10178a;
        long j11 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str);
            jSONObject.put("signal", str2);
            if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
                j10 = ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziX)).longValue();
            } else {
                j10 = 0;
            }
            jSONObject.put("sdk_ttl_ms", j10);
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = queryInfo.f10766a.f10178a;
            if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
                j11 = ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziX)).longValue();
            }
            objArr[2] = Long.valueOf(j11);
            format = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'signal': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", objArr);
        }
        boolean booleanValue = ((Boolean) zzbdx.zza.zze()).booleanValue();
        a aVar = this.f10637b;
        if (booleanValue) {
            try {
                aVar.f10625h.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.f10637b.f10620b.evaluateJavascript(format, null);
                    }
                });
                return;
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(e10, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
                return;
            }
        }
        aVar.f10620b.evaluateJavascript(format, null);
    }
}

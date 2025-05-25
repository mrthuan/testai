package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import m2.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfma implements d.a {
    final /* synthetic */ zzfmb zza;

    public zzfma(zzfmb zzfmbVar) {
        this.zza = zzfmbVar;
    }

    @Override // m2.d.a
    public final void onPostMessage(WebView webView, m2.c cVar, Uri uri, boolean z10, m2.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(cVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    zzfln.zza.booleanValue();
                    return;
                } else {
                    zzfmb.zzb(this.zza, string2);
                    return;
                }
            }
            zzfmb.zzd(this.zza, string2);
        } catch (JSONException e10) {
            zzfng.zza("Error parsing JS message in JavaScriptSessionService.", e10);
        }
    }
}

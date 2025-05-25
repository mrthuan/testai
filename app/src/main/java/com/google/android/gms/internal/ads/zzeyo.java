package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeyo implements zzevn {
    private final Bundle zza;

    public zzeyo(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbs.e("play_store", com.google.android.gms.ads.internal.util.zzbs.e("device", jSONObject)).put("parental_controls", com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.i(this.zza));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.h("Failed putting parental controls bundle.");
            }
        }
    }
}

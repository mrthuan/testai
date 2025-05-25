package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzewv implements zzevn {
    private final String zza;

    public zzewv(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }
}

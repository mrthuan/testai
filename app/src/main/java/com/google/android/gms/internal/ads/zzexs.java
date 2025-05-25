package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzexs implements zzevn {
    private final String zza;

    public zzexs(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        try {
            JSONObject e10 = com.google.android.gms.ads.internal.util.zzbs.e("pii", (JSONObject) obj);
            if (!TextUtils.isEmpty(this.zza)) {
                e10.put("attok", this.zza);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }
}

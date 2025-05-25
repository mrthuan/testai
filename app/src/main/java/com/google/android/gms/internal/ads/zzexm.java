package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzexm implements zzevn {
    final String zza;
    final int zzb;

    public zzexm(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            try {
                JSONObject e10 = com.google.android.gms.ads.internal.util.zzbs.e("pii", jSONObject);
                e10.put("pvid", this.zza);
                e10.put("pvid_s", this.zzb);
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.i();
            }
        }
    }
}

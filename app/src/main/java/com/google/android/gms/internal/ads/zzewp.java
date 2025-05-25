package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzewp implements zzevn {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfry zzc;

    public zzewp(AdvertisingIdClient.Info info, String str, zzfry zzfryVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        try {
            JSONObject e10 = com.google.android.gms.ads.internal.util.zzbs.e("pii", (JSONObject) obj);
            AdvertisingIdClient.Info info = this.zza;
            if (info != null && !TextUtils.isEmpty(info.getId())) {
                e10.put("rdid", this.zza.getId());
                e10.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                e10.put("idtype", "adid");
                zzfry zzfryVar = this.zzc;
                if (zzfryVar.zzc()) {
                    e10.put("paidv1_id_android_3p", zzfryVar.zzb());
                    e10.put("paidv1_creation_time_android_3p", this.zzc.zza());
                    return;
                }
                return;
            }
            String str = this.zzb;
            if (str != null) {
                e10.put("pdid", str);
                e10.put("pdidtype", "ssaid");
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.i();
        }
    }
}

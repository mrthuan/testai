package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhm implements zzbix {
    private final zzbhn zza;

    public zzbhm(zzbhn zzbhnVar) {
        this.zza = zzbhnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get(NamingTable.TAG);
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.d("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbs.a(new JSONObject((String) map.get("info")));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}

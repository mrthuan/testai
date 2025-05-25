package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbin implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcejVar.getContext()).edit();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                edit.remove(jSONArray.getString(i10));
            }
            edit.apply();
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "GMSG clear local storage keys handler");
        }
    }
}

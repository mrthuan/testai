package com.google.android.gms.internal.ads;

import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdmj {
    private final Executor zza;
    private final zzdme zzb;

    public zzdmj(Executor executor, zzdme zzdmeVar) {
        this.zza = executor;
        this.zzb = zzdmeVar;
    }

    public final y9.a zza(JSONObject jSONObject, String str) {
        y9.a zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgcj.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                zzh = zzgcj.zzh(null);
            } else {
                final String optString = optJSONObject.optString(NamingTable.TAG);
                if (optString == null) {
                    zzh = zzgcj.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzh = zzgcj.zzh(new zzdmi(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzh = zzgcj.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzful() { // from class: com.google.android.gms.internal.ads.zzdmg
                            @Override // com.google.android.gms.internal.ads.zzful
                            public final Object apply(Object obj) {
                                return new zzdmi(optString, (zzbeq) obj);
                            }
                        }, this.zza);
                    } else {
                        zzh = zzgcj.zzh(null);
                    }
                }
            }
            arrayList.add(zzh);
        }
        return zzgcj.zzm(zzgcj.zzd(arrayList), new zzful() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdmi zzdmiVar : (List) obj) {
                    if (zzdmiVar != null) {
                        arrayList2.add(zzdmiVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}

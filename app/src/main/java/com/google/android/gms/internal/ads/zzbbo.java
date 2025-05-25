package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbbo {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbbn zzbbnVar : this.zzb) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbbx.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        for (zzbbn zzbbnVar : this.zzc) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar);
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbbx.zzb());
        return zza;
    }

    public final void zzc(zzbbn zzbbnVar) {
        this.zzb.add(zzbbnVar);
    }

    public final void zzd(zzbbn zzbbnVar) {
        this.zza.add(zzbbnVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i10, JSONObject jSONObject) {
        for (zzbbn zzbbnVar : this.zza) {
            if (zzbbnVar.zze() == 1) {
                zzbbnVar.zzd(editor, zzbbnVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.c("Flag Json is null.");
        }
    }
}

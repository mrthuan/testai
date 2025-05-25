package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeya implements zzevo {
    private final JSONObject zza;

    public zzeya(Context context) {
        this.zza = zzbux.zzc(context, VersionInfoParcel.d());
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkX)).booleanValue()) {
            return zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzexy
                @Override // com.google.android.gms.internal.ads.zzevn
                public final void zzj(Object obj) {
                    JSONObject jSONObject = (JSONObject) obj;
                }
            });
        }
        return zzgcj.zzh(new zzevn() { // from class: com.google.android.gms.internal.ads.zzexz
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
                zzeya.this.zzc((JSONObject) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.h("Failed putting version constants.");
        }
    }
}

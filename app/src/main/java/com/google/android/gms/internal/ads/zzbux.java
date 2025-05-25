package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbux extends zzbuv {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbne zzd;
    private final VersionInfoParcel zze;

    public zzbux(Context context, zzbne zzbneVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbneVar;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbds.zzb.zze()).booleanValue()) {
                jSONObject.put(InMobiNetworkValues.PACKAGE_NAME, context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.f10345a);
            jSONObject.put("mf", zzbds.zzc.zze());
            jSONObject.put("cl", "661295874");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbuv
    public final y9.a zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        long j10 = 0;
        if (sharedPreferences != null) {
            j10 = sharedPreferences.getLong("js_last_update", 0L);
        }
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        if (System.currentTimeMillis() - j10 < ((Long) zzbds.zzd.zze()).longValue()) {
            return zzgcj.zzh(null);
        }
        return zzgcj.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzful() { // from class: com.google.android.gms.internal.ads.zzbuw
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                zzbux.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzbzo.zzf);
    }

    public final Void zzb(JSONObject jSONObject) {
        zzbbn zzbbnVar = zzbbw.zza;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        zzbbp zzbbpVar = zzbaVar.f10117b;
        SharedPreferences zza = zzbbp.zza(this.zzb);
        if (zza != null) {
            SharedPreferences.Editor edit = zza.edit();
            int i10 = zzbdi.zza;
            zzbaVar.f10116a.zze(edit, 1, jSONObject);
            edit.commit();
            SharedPreferences sharedPreferences = this.zzc;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                edit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                return null;
            }
            return null;
        }
        return null;
    }
}

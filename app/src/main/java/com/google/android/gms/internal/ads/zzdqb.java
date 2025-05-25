package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdqb {
    private final zzfgc zza;
    private final zzdpy zzb;

    public zzdqb(zzfgc zzfgcVar, zzdpy zzdpyVar) {
        this.zza = zzfgcVar;
        this.zzb = zzdpyVar;
    }

    public final zzbom zza() {
        zzbom zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbql zzb(String str) {
        zzbql zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfge zzc(String str, JSONObject jSONObject) {
        zzbop zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbpn(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbpn(new zzbre());
            } else {
                zzbom zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(6);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfge zzfgeVar = new zzfge(zzb);
            this.zzb.zzc(str, zzfgeVar);
            return zzfgeVar;
        } catch (Throwable th2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzix)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzffn(th2);
        }
    }

    public final boolean zzd() {
        if (this.zza.zzb() != null) {
            return true;
        }
        return false;
    }
}

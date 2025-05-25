package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcwj extends com.google.android.gms.ads.internal.client.zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeey zzh;
    private final Bundle zzi;

    public zzcwj(zzfel zzfelVar, String str, zzeey zzeeyVar, zzfeo zzfeoVar, String str2) {
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (zzfelVar == null) {
            str3 = null;
        } else {
            str3 = zzfelVar.zzab;
        }
        this.zzb = str3;
        this.zzc = str2;
        if (zzfeoVar == null) {
            str4 = null;
        } else {
            str4 = zzfeoVar.zzb;
        }
        this.zzd = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str6 = zzfelVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str6 != null ? str6 : str;
        this.zze = zzeeyVar.zzc();
        this.zzh = zzeeyVar;
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zzf = System.currentTimeMillis() / 1000;
        zzbbn zzbbnVar = zzbbw.zzgf;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && zzfeoVar != null) {
            this.zzi = zzfeoVar.zzk;
        } else {
            this.zzi = new Bundle();
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzir)).booleanValue() && zzfeoVar != null && !TextUtils.isEmpty(zzfeoVar.zzi)) {
            str5 = zzfeoVar.zzi;
        } else {
            str5 = "";
        }
        this.zzg = str5;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final com.google.android.gms.ads.internal.client.zzu zzf() {
        zzeey zzeeyVar = this.zzh;
        if (zzeeyVar != null) {
            return zzeeyVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}

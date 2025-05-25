package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzduw implements zzcwt, zzczo, zzcyi {
    private final zzdvi zza;
    private final String zzb;
    private final String zzc;
    private zzcwj zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzduv zze = zzduv.AD_REQUESTED;

    public zzduw(zzdvi zzdviVar, zzffg zzffgVar, String str) {
        this.zza = zzdviVar;
        this.zzc = str;
        this.zzb = zzffgVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.c);
        jSONObject.put("errorCode", zzeVar.f10146a);
        jSONObject.put("errorDescription", zzeVar.f10147b);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.f10148d;
        if (zzeVar2 == null) {
            zzh = null;
        } else {
            zzh = zzh(zzeVar2);
        }
        jSONObject.put("underlyingError", zzh);
        return jSONObject;
    }

    private final JSONObject zzi(zzcwj zzcwjVar) {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcwjVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcwjVar.zzc());
        jSONObject.put("responseId", zzcwjVar.zzi());
        zzbbn zzbbnVar = zzbbw.zzir;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            String zzd = zzcwjVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zziu)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzu zzuVar : zzcwjVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.f10255a);
            jSONObject2.put("latencyMillis", zzuVar.f10256b);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzis)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a.i(zzuVar.f10257d));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.c;
            if (zzeVar == null) {
                zzh = null;
            } else {
                zzh = zzh(zzeVar);
            }
            jSONObject2.put("error", zzh);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcyi
    public final void zza(zzcru zzcruVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcruVar.zzm();
            this.zze = zzduv.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziy)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzfel.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziy)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject2.put("shown", this.zzn);
            }
        }
        zzcwj zzcwjVar = this.zzf;
        if (zzcwjVar != null) {
            jSONObject = zzi(zzcwjVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.f10149e) != null) {
                zzcwj zzcwjVar2 = (zzcwj) iBinder;
                jSONObject3 = zzi(zzcwjVar2);
                if (zzcwjVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = zzduv.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziy)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziy)).booleanValue() && this.zza.zzq()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(zzfex zzfexVar) {
        if (this.zza.zzq()) {
            int i10 = 0;
            if (!zzfexVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzfel) zzfexVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfexVar.zzb.zzb.zzl)) {
                this.zzh = zzfexVar.zzb.zzb.zzl;
            }
            if (!TextUtils.isEmpty(zzfexVar.zzb.zzb.zzm)) {
                this.zzi = zzfexVar.zzb.zzb.zzm;
            }
            if (zzfexVar.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfexVar.zzb.zzb.zzp;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziu)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfexVar.zzb.zzb.zzn)) {
                    this.zzj = zzfexVar.zzb.zzb.zzn;
                }
                if (zzfexVar.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfexVar.zzb.zzb.zzo;
                }
                zzdvi zzdviVar = this.zza;
                JSONObject jSONObject = this.zzk;
                if (jSONObject != null) {
                    i10 = jSONObject.toString().length();
                }
                if (!TextUtils.isEmpty(this.zzj)) {
                    i10 += this.zzj.length();
                }
                zzdviVar.zzk(i10);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        if (this.zze != zzduv.AD_REQUESTED) {
            return true;
        }
        return false;
    }
}

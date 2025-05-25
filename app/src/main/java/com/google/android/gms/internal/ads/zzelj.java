package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.os.SystemClock;
import com.tom_roush.fontbox.ttf.NamingTable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzelj extends zzbqn {
    private final String zza;
    private final zzbql zzb;
    private final zzbzt zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzelj(String str, zzbql zzbqlVar, zzbzt zzbztVar, long j10) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzbztVar;
        this.zza = str;
        this.zzb = zzbqlVar;
        this.zze = j10;
        try {
            jSONObject.put("adapter_version", zzbqlVar.zzf().toString());
            jSONObject.put("sdk_version", zzbqlVar.zzg().toString());
            jSONObject.put(NamingTable.TAG, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzbzt zzbztVar) {
        synchronized (zzelj.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NamingTable.TAG, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbq)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzbztVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    private final synchronized void zzh(String str, int i10) {
        if (this.zzf) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
            zzbbn zzbbnVar = zzbbw.zzbr;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                JSONObject jSONObject = this.zzd;
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzbq)).booleanValue()) {
                this.zzd.put("signal_error_code", i10);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbq)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqo
    public final synchronized void zze(String str) {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            zzbbn zzbbnVar = zzbbw.zzbr;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                JSONObject jSONObject = this.zzd;
                com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzbq)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqo
    public final synchronized void zzf(String str) {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqo
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzeVar.f10147b, 2);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdvi implements zzdwj, zzdut {
    private final zzdvt zza;
    private final zzdwk zzb;
    private final zzduu zzc;
    private final zzdvd zzd;
    private final zzdus zze;
    private final zzdwf zzf;
    private final zzdvp zzg;
    private final zzdvp zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzdve zzr = zzdve.NONE;
    private zzdvh zzv = zzdvh.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzdvi(zzdvt zzdvtVar, zzdwk zzdwkVar, zzduu zzduuVar, Context context, VersionInfoParcel versionInfoParcel, zzdvd zzdvdVar, zzdwf zzdwfVar, zzdvp zzdvpVar, zzdvp zzdvpVar2, String str) {
        this.zza = zzdvtVar;
        this.zzb = zzdwkVar;
        this.zzc = zzduuVar;
        this.zze = new zzdus(context);
        this.zzi = versionInfoParcel.f10345a;
        this.zzk = str;
        this.zzd = zzdvdVar;
        this.zzf = zzdwfVar;
        this.zzg = zzdvpVar;
        this.zzh = zzdvpVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzu.B.f10563m.f10415g = this;
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdve) Enum.valueOf(zzdve.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzl.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzduw zzduwVar : (List) entry.getValue()) {
                if (zzduwVar.zzg()) {
                    jSONArray.put(zzduwVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzu() {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbbn zzbbnVar = zzbbw.zziD;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!TextUtils.isEmpty((CharSequence) zzbaVar.c.zza(zzbbnVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) zzbaVar.c.zza(zzbbnVar)).split(",")));
        }
        zzbbn zzbbnVar2 = zzbbw.zziE;
        if (!TextUtils.isEmpty((CharSequence) zzbaVar.c.zza(zzbbnVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) zzbaVar.c.zza(zzbbnVar2)).split(",")));
        }
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzA(zzuVar.f10557g.zzi().zzn());
        this.zzx = zzuVar.f10557g.zzi().zzo();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().s(zzd());
    }

    private final synchronized void zzw(zzdve zzdveVar, boolean z10) {
        if (this.zzr != zzdveVar) {
            if (zzq()) {
                zzy();
            }
            this.zzr = zzdveVar;
            if (zzq()) {
                zzz();
            }
            if (z10) {
                zzv();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:12:0x0026, B:17:0x0035, B:13:0x002a, B:15:0x0030), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzx(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L3c
            if (r0 != r2) goto L6
            goto L3a
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbbn r2 = com.google.android.gms.internal.ads.zzbbw.zzip     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbbu r0 = r0.c     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L26
            com.google.android.gms.ads.internal.zzu r2 = com.google.android.gms.ads.internal.zzu.B     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.ads.internal.util.zzay r2 = r2.f10563m     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L2a
        L26:
            r1.zzz()     // Catch: java.lang.Throwable -> L3c
            goto L33
        L2a:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L33
            r1.zzy()     // Catch: java.lang.Throwable -> L3c
        L33:
            if (r3 == 0) goto L3a
            r1.zzv()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            return
        L3a:
            monitor-exit(r1)
            return
        L3c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvi.zzx(boolean, boolean):void");
    }

    private final synchronized void zzy() {
        int ordinal = this.zzr.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
            return;
        }
        this.zzb.zzb();
    }

    private final synchronized void zzz() {
        int ordinal = this.zzr.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzc();
            return;
        }
        this.zzb.zzc();
    }

    public final zzdve zza() {
        return this.zzr;
    }

    public final synchronized y9.a zzb(String str) {
        zzbzt zzbztVar;
        zzbztVar = new zzbzt();
        if (this.zzm.containsKey(str)) {
            zzbztVar.zzc((zzduw) this.zzm.get(str));
        } else {
            if (!this.zzn.containsKey(str)) {
                this.zzn.put(str, new ArrayList());
            }
            ((List) this.zzn.get(str)).add(zzbztVar);
        }
        return zzbztVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzia)).booleanValue() && zzq()) {
            long j10 = this.zzq;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            if (j10 < System.currentTimeMillis() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            } else if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            long j10 = this.zzq;
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            if (j10 > System.currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.zzk)) {
                String str = this.zzk;
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + str);
            }
            jSONObject.put("internalSdkVersion", this.zzi);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            zzbbn zzbbnVar = zzbbw.zziA;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                String zzn = com.google.android.gms.ads.internal.zzu.B.f10557g.zzn();
                if (!TextUtils.isEmpty(zzn)) {
                    jSONObject.put("plugin", zzn);
                }
            }
            long j10 = this.zzq;
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            zzuVar.f10560j.getClass();
            if (j10 < System.currentTimeMillis() / 1000) {
                this.zzo = "{}";
            }
            jSONObject.put("networkExtras", this.zzo);
            jSONObject.put("adSlots", zzt());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = zzuVar.f10557g.zzi().zzh().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zziq)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                String obj = jSONObject2.toString();
                com.google.android.gms.ads.internal.util.client.zzm.b("Server data: " + obj);
                jSONObject.put("serverData", this.zzp);
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzip)).booleanValue()) {
                jSONObject.put("openAction", this.zzv);
                jSONObject.put("gesture", this.zzr);
            }
            jSONObject.put("isGamRegisteredTestDevice", zzuVar.f10563m.g());
            com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
            jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.m());
            if (((Boolean) zzbaVar.c.zza(zzbbw.zziC)).booleanValue()) {
                jSONObject.put("uiStorage", new JSONObject(this.zzx));
            }
            if (!TextUtils.isEmpty((CharSequence) zzbaVar.c.zza(zzbbw.zziE))) {
                jSONObject.put("gmaDisk", this.zzh.zza());
            }
            if (!TextUtils.isEmpty((CharSequence) zzbaVar.c.zza(zzbbw.zziD))) {
                jSONObject.put("userDisk", this.zzg.zza());
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(e10, "Inspector.toJson");
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzduw zzduwVar) {
        zzbbn zzbbnVar = zzbbw.zzia;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) zzbaVar.c.zza(zzbbw.zzic)).intValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzduwVar);
            if (((Boolean) zzbaVar.c.zza(zzbbw.zziy)).booleanValue()) {
                String zzc = zzduwVar.zzc();
                this.zzm.put(zzc, zzduwVar);
                if (this.zzn.containsKey(zzc)) {
                    List<zzbzt> list = (List) this.zzn.get(zzc);
                    for (zzbzt zzbztVar : list) {
                        zzbztVar.zzc(zzduwVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        zzbbn zzbbnVar = zzbbw.zzia;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzip)).booleanValue() && com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzR()) {
                zzu();
                return;
            }
            String zzn = com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().zzn();
            if (!TextUtils.isEmpty(zzn)) {
                try {
                    if (new JSONObject(zzn).optBoolean("isTestMode", false)) {
                        zzu();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzdvh zzdvhVar) {
        if (!zzq()) {
            try {
                zzdaVar.zze(zzfgi.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzia)).booleanValue()) {
            try {
                zzdaVar.zze(zzfgi.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Ad inspector had an internal error.");
                return;
            }
        }
        this.zzv = zzdvhVar;
        this.zza.zzj(zzdaVar, new zzbjr(this), new zzbjk(this.zzf), new zzbiy(this));
        return;
    }

    public final synchronized void zzi(String str, long j10) {
        this.zzo = str;
        this.zzq = j10;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzu.B.f10557g.zzi().n(this.zzx);
    }

    public final synchronized void zzk(long j10) {
        this.zzw += j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzu()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzz()
            return
        L15:
            boolean r2 = r1.zzq()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvi.zzl(boolean):void");
    }

    public final void zzm(zzdve zzdveVar) {
        zzw(zzdveVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z10) {
        if (!this.zzu && z10) {
            zzu();
        }
        zzx(z10, true);
    }

    public final boolean zzp() {
        if (this.zzp != null) {
            return true;
        }
        return false;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzip)).booleanValue()) {
            if (!this.zzs && !com.google.android.gms.ads.internal.zzu.B.f10563m.g()) {
                return false;
            }
            return true;
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        if (this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziv)).longValue()) {
            return true;
        }
        return false;
    }
}

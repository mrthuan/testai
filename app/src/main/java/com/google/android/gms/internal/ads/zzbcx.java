package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbcx {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zze zzb;
    private Runnable zzc;
    private zzbcu zzd;
    private u.l zze;
    private String zzf;
    private long zzg = 0;
    private long zzh;
    private JSONArray zzi;
    private Context zzj;

    public zzbcx(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zze zzeVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (android.os.SystemClock.elapsedRealtime() <= r6.zzg) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(com.google.android.gms.internal.ads.zzbbw.zziT)).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        r0 = r6.zze;
        r1 = android.net.Uri.parse(r6.zzf);
        r0.getClass();
        r2 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        r3 = new android.os.Bundle();
        r4 = r0.f30110e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        r3.putParcelable("android.support.customtabs.extra.SESSION_ID", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r3.isEmpty() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        r4 = r0.c;
        r0 = r0.f30108b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r3 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        r2.putAll(r3);
        r0.G0(r4, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        r0.k0(r4, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbcu r0 = r6.zzd
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzm.c(r0)
            return
        La:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r6.zzf
            if (r0 == 0) goto L9f
            u.l r0 = r6.zze
            if (r0 == 0) goto L9f
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            if (r0 == 0) goto L9f
            long r0 = r6.zzg
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L3c
        L2a:
            com.google.android.gms.ads.internal.zzu r0 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.common.util.DefaultClock r0 = r0.f10560j
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.zzg
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L3c
            goto L4e
        L3c:
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zziT
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9f
        L4e:
            u.l r0 = r6.zze
            java.lang.String r1 = r6.zzf
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.getClass()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle     // Catch: android.os.RemoteException -> L85
            r3.<init>()     // Catch: android.os.RemoteException -> L85
            android.app.PendingIntent r4 = r0.f30110e     // Catch: android.os.RemoteException -> L85
            if (r4 == 0) goto L6e
            if (r4 == 0) goto L6e
            java.lang.String r5 = "android.support.customtabs.extra.SESSION_ID"
            r3.putParcelable(r5, r4)     // Catch: android.os.RemoteException -> L85
        L6e:
            boolean r4 = r3.isEmpty()     // Catch: android.os.RemoteException -> L85
            if (r4 == 0) goto L75
            r3 = 0
        L75:
            e.a r4 = r0.c
            e.b r0 = r0.f30108b
            if (r3 == 0) goto L82
            r2.putAll(r3)     // Catch: android.os.RemoteException -> L85
            r0.G0(r4, r1, r2)     // Catch: android.os.RemoteException -> L85
            goto L85
        L82:
            r0.k0(r4, r1)     // Catch: android.os.RemoteException -> L85
        L85:
            java.util.concurrent.ScheduledExecutorService r0 = r6.zza
            java.lang.Runnable r1 = r6.zzc
            com.google.android.gms.internal.ads.zzbbn r2 = com.google.android.gms.internal.ads.zzbbw.zziU
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r3 = r3.c
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L9f:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcx.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzi == null) {
                this.zzi = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziW));
            }
            jSONObject.put("eids", this.zzi);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final u.l zzb() {
        return this.zze;
    }

    public final JSONObject zzc(String str, String str2) {
        long j10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            j10 = ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziX)).longValue();
        } else {
            j10 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j10);
        zzk(jSONObject);
        return jSONObject;
    }

    public final JSONObject zzd(String str, String str2) {
        long j10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            j10 = ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziX)).longValue();
        } else {
            j10 = 0;
        }
        jSONObject.put("sdk_ttl_ms", j10);
        zzk(jSONObject);
        return jSONObject;
    }

    public final void zzf() {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zzg = SystemClock.elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zziS)).intValue();
        if (this.zzc == null) {
            this.zzc = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcv
                @Override // java.lang.Runnable
                public final void run() {
                    zzbcx.this.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, u.d dVar, String str, u.b bVar) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (dVar != null) {
                    this.zzj = context;
                    this.zzf = str;
                    zzbcu zzbcuVar = new zzbcu(this, bVar);
                    this.zzd = zzbcuVar;
                    u.l b10 = dVar.b(zzbcuVar);
                    this.zze = b10;
                    if (b10 == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.c("CustomTabsClient failed to create new session.");
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("CustomTabsClient parameter is null");
            }
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        throw new IllegalArgumentException("App Context parameter is null");
    }

    public final void zzh(String str) {
        try {
            u.l lVar = this.zze;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzh).toString());
            zzk(jSONObject);
            lVar.a(jSONObject.toString());
            zzbcw zzbcwVar = new zzbcw(this, str);
            if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
                this.zzb.b(this.zze, zzbcwVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.a(this.zzj, AdFormat.BANNER, new AdRequest((AdRequest.Builder) new AdRequest.Builder().a(bundle)), zzbcwVar);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    public final void zzi(long j10) {
        this.zzh = j10;
    }
}

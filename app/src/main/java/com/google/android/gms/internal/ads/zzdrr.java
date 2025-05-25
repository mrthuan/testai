package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdrr implements zzczo, zzcye, zzcwt, zzdfc {
    private final zzdsf zza;
    private final zzdsp zzb;

    public zzdrr(zzdsf zzdsfVar, zzdsp zzdspVar) {
        this.zza = zzdsfVar;
        this.zzb = zzdspVar;
    }

    private final void zzc(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                long j10 = bundle.getLong(str);
                if (j10 >= 0) {
                    this.zza.zzc(str, String.valueOf(j10));
                }
            }
        }
    }

    private final void zzd(Bundle bundle, zzfxr zzfxrVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbS)).booleanValue() && bundle != null) {
            String zza = zzdrt.PUBLIC_API_CALLBACK.zza();
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            bundle.putLong(zza, System.currentTimeMillis());
            zzdsf zzdsfVar = this.zza;
            if (true != bundle.getBoolean("ls")) {
                str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            } else {
                str = "1";
            }
            zzdsfVar.zzc("ls", str);
            int size = zzfxrVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzdru zzdruVar = (zzdru) zzfxrVar.get(i10);
                long j10 = bundle.getLong(zzdruVar.zza().zza(), -1L);
                long j11 = bundle.getLong(zzdruVar.zzb().zza(), -1L);
                if (j10 > 0 && j11 > 0) {
                    this.zza.zzc(zzdruVar.zzc(), String.valueOf(j11 - j10));
                }
            }
            zzc(bundle.getBundle("client_sig_latency_key"));
            zzc(bundle.getBundle("gms_sig_latency_key"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwt
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzc("ftl", String.valueOf(zzeVar.f10146a));
        this.zza.zzc("ed", zzeVar.c);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdn(zzbvb zzbvbVar) {
        this.zza.zze(zzbvbVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdo(zzfex zzfexVar) {
        this.zza.zzd(zzfexVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    @Override // com.google.android.gms.internal.ads.zzdfc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzay r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzgo
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r2 = r1.c
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.String r0 = "sgs"
            java.lang.String r2 = "action"
            if (r7 != 0) goto L3b
            com.google.android.gms.internal.ads.zzdsf r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            r7.put(r2, r0)
            com.google.android.gms.internal.ads.zzdsf r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "request_id"
            java.lang.String r1 = "-1"
            r7.put(r0, r1)
            com.google.android.gms.internal.ads.zzdsp r7 = r6.zzb
            com.google.android.gms.internal.ads.zzdsf r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        L3b:
            com.google.android.gms.internal.ads.zzbvb r3 = r7.c
            if (r3 == 0) goto L46
            android.os.Bundle r4 = r3.zzm
            com.google.android.gms.internal.ads.zzfxr r5 = com.google.android.gms.internal.ads.zzdru.zza
            r6.zzd(r4, r5)
        L46:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> La1
            java.lang.String r7 = r7.f10694b     // Catch: org.json.JSONException -> La1
            r4.<init>(r7)     // Catch: org.json.JSONException -> La1
            com.google.android.gms.internal.ads.zzdsf r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            r7.put(r2, r0)
            com.google.android.gms.internal.ads.zzdsf r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zziM
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6d
            goto L85
        L6d:
            java.lang.String r0 = "extras"
            org.json.JSONObject r0 = r4.getJSONObject(r0)     // Catch: org.json.JSONException -> L81
            java.lang.String r1 = "accept_3p_cookie"
            boolean r0 = r0.getBoolean(r1)     // Catch: org.json.JSONException -> L81
            if (r0 == 0) goto L7e
            java.lang.String r0 = "1"
            goto L87
        L7e:
            java.lang.String r0 = "0"
            goto L87
        L81:
            r0 = 6
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
        L85:
            java.lang.String r0 = "na"
        L87:
            java.lang.String r1 = "tpc"
            r7.put(r1, r0)
            if (r3 == 0) goto L95
            com.google.android.gms.internal.ads.zzdsf r7 = r6.zza
            android.os.Bundle r0 = r3.zza
            r7.zze(r0)
        L95:
            com.google.android.gms.internal.ads.zzdsp r7 = r6.zzb
            com.google.android.gms.internal.ads.zzdsf r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        La1:
            com.google.android.gms.internal.ads.zzdsf r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "sgf"
            r7.put(r2, r0)
            com.google.android.gms.internal.ads.zzdsf r7 = r6.zza
            java.util.Map r7 = r7.zzb()
            java.lang.String r0 = "sgf_reason"
            java.lang.String r1 = "request_invalid"
            r7.put(r0, r1)
            com.google.android.gms.internal.ads.zzdsp r7 = r6.zzb
            com.google.android.gms.internal.ads.zzdsf r0 = r6.zza
            java.util.Map r0 = r0.zzb()
            r7.zzf(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrr.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzay):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zzf(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgo)).booleanValue()) {
            return;
        }
        this.zza.zzb().put("action", "sgf");
        this.zza.zzc("sgf_reason", str);
        this.zzb.zzf(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzs() {
        String str;
        this.zza.zzb().put("action", "loaded");
        zzd(this.zza.zza(), zzdru.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzlG)).booleanValue()) {
            zzdsf zzdsfVar = this.zza;
            if (true != b.b.I("MUTE_AUDIO")) {
                str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            } else {
                str = "1";
            }
            zzdsfVar.zzb().put("mafe", str);
        }
        this.zzb.zzf(this.zza.zzb());
    }
}

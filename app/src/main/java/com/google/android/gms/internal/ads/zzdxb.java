package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdxb implements zzhfc {
    private final zzhfu zza;

    public zzdxb(zzhfu zzhfuVar) {
        this.zza = zzhfuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzhfu r0 = r4.zza
            com.google.android.gms.internal.ads.zzcwh r0 = (com.google.android.gms.internal.ads.zzcwh) r0
            com.google.android.gms.internal.ads.zzffg r0 = r0.zza()
            com.google.android.gms.internal.ads.zzbbn r1 = com.google.android.gms.internal.ads.zzbbw.zzgy
            com.google.android.gms.ads.internal.client.zzba r2 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r2 = r2.c
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L51
            com.google.android.gms.ads.internal.client.zzl r1 = r0.zzd
            java.lang.String r1 = r1.f10222x
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L36
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L36
            r2.<init>(r1)     // Catch: org.json.JSONException -> L36
            java.lang.String r1 = r2.getString(r3)     // Catch: org.json.JSONException -> L36
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L36
            if (r2 != 0) goto L36
            goto L61
        L36:
            com.google.android.gms.ads.internal.client.zzl r1 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r1 = r1.f10217s
            if (r1 == 0) goto L51
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L51
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd     // Catch: org.json.JSONException -> L51
            com.google.android.gms.ads.internal.client.zzc r0 = r0.f10217s     // Catch: org.json.JSONException -> L51
            java.lang.String r0 = r0.f10119a     // Catch: org.json.JSONException -> L51
            r1.<init>(r0)     // Catch: org.json.JSONException -> L51
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L51
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L51
            if (r0 == 0) goto L61
        L51:
            com.google.android.gms.ads.internal.client.zzay r0 = com.google.android.gms.ads.internal.client.zzay.f10107f
            java.util.Random r0 = r0.f10111e
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L61:
            com.google.android.gms.internal.ads.zzhfk.zzb(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxb.zzb():java.lang.Object");
    }
}

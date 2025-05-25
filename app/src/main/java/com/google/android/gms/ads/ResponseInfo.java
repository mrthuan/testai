package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class ResponseInfo {

    /* renamed from: a  reason: collision with root package name */
    public final zzdn f10049a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f10050b = new ArrayList();
    public final AdapterResponseInfo c;

    public ResponseInfo(zzdn zzdnVar) {
        AdapterResponseInfo adapterResponseInfo;
        this.f10049a = zzdnVar;
        if (zzdnVar != null) {
            try {
                List<zzu> zzj = zzdnVar.zzj();
                if (zzj != null) {
                    for (zzu zzuVar : zzj) {
                        if (zzuVar != null) {
                            adapterResponseInfo = new AdapterResponseInfo(zzuVar);
                        } else {
                            adapterResponseInfo = null;
                        }
                        if (adapterResponseInfo != null) {
                            this.f10050b.add(adapterResponseInfo);
                        }
                    }
                }
            } catch (RemoteException unused) {
                zzm.g(6);
            }
        }
        zzdn zzdnVar2 = this.f10049a;
        if (zzdnVar2 != null) {
            try {
                zzu zzf = zzdnVar2.zzf();
                if (zzf != null) {
                    this.c = new AdapterResponseInfo(zzf);
                }
            } catch (RemoteException unused2) {
                zzm.g(6);
            }
        }
    }

    public final String a() {
        try {
            zzdn zzdnVar = this.f10049a;
            if (zzdnVar != null) {
                return zzdnVar.zzg();
            }
            return null;
        } catch (RemoteException unused) {
            zzm.g(6);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[LOOP:0: B:17:0x003a->B:19:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject b() {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzdn r1 = r6.f10049a
            r2 = 6
            if (r1 == 0) goto L12
            java.lang.String r3 = r1.zzi()     // Catch: android.os.RemoteException -> Lf
            goto L13
        Lf:
            com.google.android.gms.ads.internal.util.client.zzm.g(r2)
        L12:
            r3 = 0
        L13:
            java.lang.String r4 = "null"
            java.lang.String r5 = "Response ID"
            if (r3 != 0) goto L1d
            r0.put(r5, r4)
            goto L20
        L1d:
            r0.put(r5, r3)
        L20:
            java.lang.String r3 = r6.a()
            java.lang.String r5 = "Mediation Adapter Class Name"
            if (r3 != 0) goto L2c
            r0.put(r5, r4)
            goto L2f
        L2c:
            r0.put(r5, r3)
        L2f:
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.ArrayList r4 = r6.f10050b
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            com.google.android.gms.ads.AdapterResponseInfo r5 = (com.google.android.gms.ads.AdapterResponseInfo) r5
            org.json.JSONObject r5 = r5.a()
            r3.put(r5)
            goto L3a
        L4e:
            java.lang.String r4 = "Adapter Responses"
            r0.put(r4, r3)
            com.google.android.gms.ads.AdapterResponseInfo r3 = r6.c
            if (r3 == 0) goto L60
            org.json.JSONObject r3 = r3.a()
            java.lang.String r4 = "Loaded Adapter Response"
            r0.put(r4, r3)
        L60:
            if (r1 == 0) goto L6a
            android.os.Bundle r1 = r1.zze()     // Catch: android.os.RemoteException -> L67
            goto L6f
        L67:
            com.google.android.gms.ads.internal.util.client.zzm.g(r2)
        L6a:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L6f:
            if (r1 == 0) goto L7e
            com.google.android.gms.ads.internal.client.zzay r2 = com.google.android.gms.ads.internal.client.zzay.f10107f
            com.google.android.gms.ads.internal.util.client.zzf r2 = r2.f10108a
            org.json.JSONObject r1 = r2.i(r1)
            java.lang.String r2 = "Response Extras"
            r0.put(r2, r1)
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.ResponseInfo.b():org.json.JSONObject");
    }

    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}

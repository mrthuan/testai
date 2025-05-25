package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzgcu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zze {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10715a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f10716b = new HashMap();
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final zzdsp f10717d;

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f10718e;

    public zze(Context context, zzdsp zzdspVar, zzgcu zzgcuVar) {
        this.c = context;
        this.f10717d = zzdspVar;
        this.f10718e = zzgcuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r10.f10724a == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(final boolean r9, com.google.android.gms.ads.nonagon.signalgeneration.zzg r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashMap r0 = r8.f10715a     // Catch: java.lang.Throwable -> L93
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.ads.nonagon.signalgeneration.zzg r0 = (com.google.android.gms.ads.nonagon.signalgeneration.zzg) r0     // Catch: java.lang.Throwable -> L93
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2f
            com.google.android.gms.ads.internal.zzu r4 = com.google.android.gms.ads.internal.zzu.B     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.common.util.DefaultClock r4 = r4.f10560j     // Catch: java.lang.Throwable -> L93
            r4.getClass()     // Catch: java.lang.Throwable -> L93
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L93
            long r6 = r0.c     // Catch: java.lang.Throwable -> L93
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L24
            r4 = r2
            goto L25
        L24:
            r4 = r3
        L25:
            if (r4 != 0) goto L2f
            com.google.android.gms.ads.query.QueryInfo r0 = r0.f10724a     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L2f
            com.google.android.gms.ads.query.QueryInfo r0 = r10.f10724a     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L34
        L2f:
            java.util.HashMap r0 = r8.f10715a     // Catch: java.lang.Throwable -> L93
            r0.put(r1, r10)     // Catch: java.lang.Throwable -> L93
        L34:
            com.google.android.gms.ads.query.QueryInfo r0 = r10.f10724a     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L45
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zziY     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.ads.internal.client.zzba r4 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.internal.ads.zzbbu r4 = r4.c     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r4.zza(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L93
            goto L51
        L45:
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zziZ     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.ads.internal.client.zzba r4 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.internal.ads.zzbbu r4 = r4.c     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r4.zza(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L93
        L51:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.ads.query.QueryInfo r4 = r10.f10724a     // Catch: java.lang.Throwable -> L93
            if (r4 != 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            java.util.concurrent.ScheduledExecutorService r4 = com.google.android.gms.internal.ads.zzbzo.zzd     // Catch: java.lang.Throwable -> L93
            com.google.android.gms.ads.nonagon.signalgeneration.zzb r5 = new com.google.android.gms.ads.nonagon.signalgeneration.zzb     // Catch: java.lang.Throwable -> L93
            r5.<init>()     // Catch: java.lang.Throwable -> L93
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L93
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L93
            r4.schedule(r5, r6, r9)     // Catch: java.lang.Throwable -> L93
            java.util.HashMap r9 = r8.f10716b     // Catch: java.lang.Throwable -> L93
            java.lang.Object r9 = r9.get(r1)     // Catch: java.lang.Throwable -> L93
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L93
            java.util.HashMap r0 = r8.f10716b     // Catch: java.lang.Throwable -> L93
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L93
            r2.<init>()     // Catch: java.lang.Throwable -> L93
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L93
            if (r9 != 0) goto L7d
            goto L91
        L7d:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L93
        L81:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L91
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L93
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L93
            r8.d(r10, r0, r3)     // Catch: java.lang.Throwable -> L93
            goto L81
        L91:
            monitor-exit(r8)
            return
        L93:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zze.a(boolean, com.google.android.gms.ads.nonagon.signalgeneration.zzg):void");
    }

    public final synchronized void b(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(System.currentTimeMillis()));
        zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                CookieManager i10;
                zze zzeVar = zze.this;
                zzeVar.getClass();
                Object obj2 = obj;
                boolean z11 = false;
                if (!(obj2 instanceof WebView) || (i10 = com.google.android.gms.ads.internal.zzu.B.f10555e.i()) == null) {
                    z10 = false;
                } else {
                    z10 = i10.acceptThirdPartyCookies((WebView) obj2);
                }
                HashMap hashMap = zzeVar.f10715a;
                Boolean valueOf = Boolean.valueOf(z10);
                zzg zzgVar = (zzg) hashMap.get(valueOf);
                Pair pair2 = pair;
                if (zzgVar != null) {
                    com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
                    if (zzgVar.c <= System.currentTimeMillis()) {
                        z11 = true;
                    }
                    if (!z11) {
                        zzeVar.d(zzgVar, pair2, true);
                        return;
                    }
                }
                HashMap hashMap2 = zzeVar.f10716b;
                List list = (List) hashMap2.get(valueOf);
                if (list == null) {
                    list = new ArrayList();
                    hashMap2.put(valueOf, list);
                }
                list.add(pair2);
            }
        });
    }

    public final void c(final boolean z10) {
        HashMap hashMap = this.f10716b;
        Boolean valueOf = Boolean.valueOf(z10);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new ArrayList());
            this.f10718e.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
                @Override // java.lang.Runnable
                public final void run() {
                    zze.this.e(z10, false);
                }
            });
        }
    }

    public final void d(zzg zzgVar, Pair pair, boolean z10) {
        boolean z11 = true;
        zzgVar.f10727e.set(true);
        QueryInfo queryInfo = zzgVar.f10724a;
        if (queryInfo != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfo);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzgVar.f10725b);
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        pairArr[4] = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z10));
        if (queryInfo == null) {
            z11 = false;
        }
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(z11));
        zzq.d(this.f10717d, "sgpcr", pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0023, B:9:0x0029, B:14:0x0042, B:16:0x006e, B:19:0x007a, B:13:0x0037), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0023, B:9:0x0029, B:14:0x0042, B:16:0x006e, B:19:0x007a, B:13:0x0037), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0023, B:9:0x0029, B:14:0x0042, B:16:0x006e, B:19:0x007a, B:13:0x0037), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void e(boolean r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L83
            r0.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "query_info_type"
            java.lang.String r2 = "requester_type_6"
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = "accept_3p_cookie"
            r0.putBoolean(r1, r10)     // Catch: java.lang.Throwable -> L83
            java.util.HashMap r1 = r9.f10715a     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.nonagon.signalgeneration.zzg r1 = (com.google.android.gms.ads.nonagon.signalgeneration.zzg) r1     // Catch: java.lang.Throwable -> L83
            if (r11 == 0) goto L28
            if (r1 != 0) goto L23
            goto L28
        L23:
            int r11 = r1.f10726d     // Catch: java.lang.Throwable -> L83
            int r11 = r11 + 1
            goto L29
        L28:
            r11 = 0
        L29:
            r6 = r11
            java.util.HashMap r11 = r9.f10715a     // Catch: java.lang.Throwable -> L83
            java.lang.Object r11 = r11.get(r2)     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.nonagon.signalgeneration.zzg r11 = (com.google.android.gms.ads.nonagon.signalgeneration.zzg) r11     // Catch: java.lang.Throwable -> L83
            if (r11 != 0) goto L37
            r11 = 0
        L35:
            r7 = r11
            goto L42
        L37:
            java.util.concurrent.atomic.AtomicBoolean r11 = r11.f10727e     // Catch: java.lang.Throwable -> L83
            boolean r11 = r11.get()     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L83
            goto L35
        L42:
            com.google.android.gms.internal.ads.zzdsp r8 = r9.f10717d     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.nonagon.signalgeneration.zzf r11 = new com.google.android.gms.ads.nonagon.signalgeneration.zzf     // Catch: java.lang.Throwable -> L83
            r3 = r11
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.AdRequest$Builder r10 = new com.google.android.gms.ads.AdRequest$Builder     // Catch: java.lang.Throwable -> L83
            r10.<init>()     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.AbstractAdRequestBuilder r10 = r10.a(r0)     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.AdRequest$Builder r10 = (com.google.android.gms.ads.AdRequest.Builder) r10     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.AdRequest r0 = new com.google.android.gms.ads.AdRequest     // Catch: java.lang.Throwable -> L83
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.zzbbn r10 = com.google.android.gms.internal.ads.zzbbw.zzkg     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c     // Catch: java.lang.Throwable -> L83
            java.lang.Object r10 = r1.zza(r10)     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L83
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L83
            if (r10 == 0) goto L7a
            java.util.concurrent.ExecutorService r10 = r9.f10718e     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r1 = new com.google.android.gms.ads.nonagon.signalgeneration.zzd     // Catch: java.lang.Throwable -> L83
            r1.<init>()     // Catch: java.lang.Throwable -> L83
            r10.submit(r1)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r9)
            return
        L7a:
            android.content.Context r10 = r9.c     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.AdFormat r1 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.ads.query.QueryInfo.a(r10, r1, r0, r11)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r9)
            return
        L83:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zze.e(boolean, boolean):void");
    }
}

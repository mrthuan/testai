package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.W;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class W {

    /* renamed from: a  reason: collision with root package name */
    public final AdConfig.AdQualityConfig f14760a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f14761b;
    public final AtomicBoolean c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f14762d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f14763e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArrayList f14764f;

    /* renamed from: g  reason: collision with root package name */
    public AdQualityControl f14765g;

    /* renamed from: h  reason: collision with root package name */
    public AdQualityResult f14766h;

    /* renamed from: i  reason: collision with root package name */
    public String f14767i;

    /* renamed from: j  reason: collision with root package name */
    public JSONObject f14768j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f14769k;

    public W(AdConfig.AdQualityConfig adQualityConfig, A4 a42) {
        kotlin.jvm.internal.g.e(adQualityConfig, "adQualityConfig");
        this.f14760a = adQualityConfig;
        this.f14761b = a42;
        this.c = new AtomicBoolean(false);
        this.f14762d = new AtomicBoolean(false);
        this.f14763e = new AtomicBoolean(false);
        this.f14764f = new CopyOnWriteArrayList();
        this.f14767i = "";
        this.f14768j = new JSONObject();
        this.f14769k = new AtomicBoolean(false);
    }

    public final void a(AdQualityResult adQualityResult, boolean z10) {
        if (adQualityResult.getBeaconUrl().length() == 0) {
            a("beacon is empty");
            return;
        }
        C1868x9 c1868x9 = new C1868x9(adQualityResult);
        T t4 = new T(this, z10);
        ScheduledExecutorService scheduledExecutorService = P.f14562a;
        P.a(0L, new C1590d(c1868x9, t4));
    }

    public final void a(final View view, final long j10, final boolean z10, final M9 m92) {
        a("isCapture started - " + this.f14769k.get() + ", isReporting - " + z10);
        if (this.f14769k.get() && !z10) {
            a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            view.post(new Runnable() { // from class: qb.c0
                @Override // java.lang.Runnable
                public final void run() {
                    W.a(W.this, view, j10, z10, m92);
                }
            });
        }
    }

    public static final void a(W this$0, View adView, long j10, boolean z10, M9 m92) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(adView, "$adView");
        Da da2 = new Da(adView, this$0.f14760a);
        if (!z10) {
            this$0.f14764f.add(da2);
        }
        V v10 = new V(this$0, da2, z10, m92);
        ScheduledExecutorService scheduledExecutorService = P.f14562a;
        P.a(j10, new C1590d(da2, v10));
        this$0.f14769k.set(!z10);
    }

    public final void a(final Activity activity, final long j10, final boolean z10, final M9 m92) {
        a("isCapture started - " + this.f14769k.get() + ", isReporting - " + z10);
        if (this.f14769k.get() && !z10) {
            a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            activity.getWindow().getDecorView().post(new Runnable() { // from class: qb.b0
                @Override // java.lang.Runnable
                public final void run() {
                    W.a(W.this, activity, j10, z10, m92);
                }
            });
        }
    }

    public static final void a(W this$0, Activity activity, long j10, boolean z10, M9 m92) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(activity, "$activity");
        this$0.a("activity is visible");
        Window window = activity.getWindow();
        kotlin.jvm.internal.g.d(window, "getWindow(...)");
        C1726m9 c1726m9 = new C1726m9(window, this$0.f14760a);
        if (!z10) {
            this$0.f14764f.add(c1726m9);
        }
        V v10 = new V(this$0, c1726m9, z10, m92);
        ScheduledExecutorService scheduledExecutorService = P.f14562a;
        P.a(j10, new C1590d(c1726m9, v10));
        this$0.f14769k.set(!z10);
    }

    public final void a(String str, byte[] bArr, boolean z10) {
        Context d10 = Ha.d();
        if (d10 != null) {
            Sa sa2 = new Sa(d10.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z10) {
                this.f14764f.add(sa2);
            }
            U u7 = new U(this, z10, sa2, str);
            ScheduledExecutorService scheduledExecutorService = P.f14562a;
            P.a(0L, new C1590d(sa2, u7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r10) {
        /*
            r9 = this;
            com.inmobi.adquality.models.AdQualityControl r0 = r9.f14765g
            if (r0 == 0) goto Lbe
            java.lang.String r4 = r0.getBeacon()
            if (r4 == 0) goto Lbe
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f14764f
            boolean r0 = r0.isEmpty()
            r8 = 1
            if (r0 == 0) goto L42
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f14762d
            boolean r0 = r0.get()
            if (r0 == 0) goto L42
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f14763e
            boolean r0 = r0.get()
            if (r0 != 0) goto L42
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f14763e
            r10.set(r8)
            java.lang.String r10 = "session end - queuing result"
            r9.a(r10)
            com.inmobi.adquality.models.AdQualityResult r10 = r9.f14766h
            if (r10 != 0) goto L3e
            com.inmobi.adquality.models.AdQualityResult r10 = new com.inmobi.adquality.models.AdQualityResult
            java.lang.String r2 = "null"
            r3 = 0
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L3e:
            r9.a(r10, r8)
            return
        L42:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f14762d
            boolean r0 = r0.get()
            if (r0 == 0) goto L88
            if (r10 != 0) goto L88
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f14763e
            boolean r10 = r10.get()
            if (r10 != 0) goto L88
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f14763e
            r10.set(r8)
            java.lang.String r10 = "session stop - queuing result"
            r9.a(r10)
            java.util.concurrent.ScheduledExecutorService r10 = com.inmobi.media.P.f14562a
            if (r10 == 0) goto L73
            r10.shutdown()
            r10.shutdownNow()     // Catch: java.lang.InterruptedException -> L69
            goto L73
        L69:
            r10.shutdownNow()     // Catch: java.lang.Exception -> L6c
        L6c:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
        L73:
            com.inmobi.adquality.models.AdQualityResult r10 = r9.f14766h
            if (r10 != 0) goto L84
            com.inmobi.adquality.models.AdQualityResult r10 = new com.inmobi.adquality.models.AdQualityResult
            java.lang.String r2 = "null"
            r3 = 0
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L84:
            r9.a(r10, r8)
            return
        L88:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "list size - "
            r10.<init>(r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = r9.f14764f
            int r0 = r0.size()
            r10.append(r0)
            java.lang.String r0 = " session end triggered - "
            r10.append(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f14762d
            boolean r0 = r0.get()
            r10.append(r0)
            java.lang.String r0 = " queue triggered - "
            r10.append(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f14763e
            r10.append(r0)
            java.lang.String r0 = " waiting"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g.e(r10, r0)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.W.a(boolean):void");
    }

    public final void a(String str) {
        A4 a42 = this.f14761b;
        if (a42 != null) {
            ((B4) a42).a("AdQualityManager", str);
        }
    }

    public final void a(Exception exc, String str) {
        tf.d dVar;
        if (exc != null) {
            A4 a42 = this.f14761b;
            if (a42 != null) {
                ((B4) a42).a("AdQualityManager", str, exc);
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                return;
            }
        }
        A4 a43 = this.f14761b;
        if (a43 != null) {
            ((B4) a43).b("AdQualityManager", a0.a.h("Error with null exception : ", str));
            tf.d dVar2 = tf.d.f30009a;
        }
    }
}

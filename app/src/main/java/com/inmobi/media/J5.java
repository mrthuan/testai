package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Timer;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class J5 {

    /* renamed from: a  reason: collision with root package name */
    public final C1772q3 f14367a;

    /* renamed from: b  reason: collision with root package name */
    public String f14368b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f14369d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14370e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14371f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14372g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14373h;

    /* renamed from: i  reason: collision with root package name */
    public final tf.c f14374i;

    /* renamed from: j  reason: collision with root package name */
    public final tf.c f14375j;

    /* renamed from: k  reason: collision with root package name */
    public final long f14376k;

    /* renamed from: l  reason: collision with root package name */
    public final long f14377l;

    public J5(C1772q3 browserClient) {
        TelemetryConfig telemetryConfig;
        long j10;
        kotlin.jvm.internal.g.e(browserClient, "browserClient");
        this.f14367a = browserClient;
        this.f14368b = "";
        this.f14374i = kotlin.a.a(G5.f14272a);
        this.f14375j = kotlin.a.a(F5.f14245a);
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Config a10 = C1705l2.a("telemetry", Ha.b(), null);
        if (a10 instanceof TelemetryConfig) {
            telemetryConfig = (TelemetryConfig) a10;
        } else {
            telemetryConfig = null;
        }
        TelemetryConfig.LandingPageConfig lpConfig = telemetryConfig != null ? telemetryConfig.getLpConfig() : null;
        if (lpConfig != null) {
            j10 = lpConfig.getEbRedirectionInterval();
        } else {
            j10 = 1000;
        }
        this.f14376k = j10;
        this.f14377l = lpConfig != null ? lpConfig.getEbDeeplinkFallbackInterval() : 1000L;
    }

    public final void a() {
        ExecutorC1639g6 executorC1639g6 = (ExecutorC1639g6) G3.f14269d.getValue();
        androidx.appcompat.widget.y0 y0Var = new androidx.appcompat.widget.y0(this, 8);
        executorC1639g6.getClass();
        executorC1639g6.f15096a.post(y0Var);
    }

    public final void b() {
        ExecutorC1639g6 executorC1639g6 = (ExecutorC1639g6) G3.f14269d.getValue();
        androidx.appcompat.widget.z0 z0Var = new androidx.appcompat.widget.z0(this, 5);
        executorC1639g6.getClass();
        executorC1639g6.f15096a.post(z0Var);
    }

    public final void c() {
        if (!this.f14370e && !this.f14372g) {
            this.f14372g = true;
            ((Timer) this.f14374i.getValue()).cancel();
            try {
                ((Timer) this.f14375j.getValue()).schedule(new H5(this), this.f14377l);
            } catch (Exception e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
            this.f14373h = true;
        }
    }

    public final void d() {
        this.f14370e = true;
        ((Timer) this.f14374i.getValue()).cancel();
        ((Timer) this.f14375j.getValue()).cancel();
        this.f14373h = false;
    }

    public static final void a(J5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        int i10 = this$0.c;
        if (i10 != 3) {
            if (i10 == 2) {
                this$0.f14367a.a();
                this$0.d();
                return;
            }
            return;
        }
        C1772q3 c1772q3 = this$0.f14367a;
        int i11 = this$0.f14369d;
        D5 d52 = c1772q3.f15389h;
        if (d52 != null) {
            J5 j52 = c1772q3.f15388g;
            d52.a("landingsCompleteFailed", kotlin.collections.q.B0(new Pair("trigger", d52.a(j52 != null ? j52.f14368b : null)), new Pair("errorCode", Integer.valueOf(i11))));
        }
        this$0.d();
    }

    public static final void b(J5 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (this$0.f14370e) {
            return;
        }
        this$0.a();
    }
}

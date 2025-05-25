package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.p;
import com.inmobi.commons.core.configs.TelemetryConfig;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static long f6358b;

    /* renamed from: a  reason: collision with root package name */
    private final b f6359a;
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f6360d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.c) {
                    return;
                }
                c.this.f6359a.d();
                long unused = c.f6358b = SystemClock.uptimeMillis();
                f.a();
                p.b().a(c.this.f6360d, 500L);
                com.apm.insight.runtime.b.a(c.f6358b);
            }
        };
        this.f6360d = runnable;
        this.f6359a = bVar;
        p.b().a(runnable, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f6358b <= 15000;
    }

    public void a() {
        if (this.c) {
            return;
        }
        p.b().a(this.f6360d, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
    }

    public void b() {
        this.c = true;
    }
}

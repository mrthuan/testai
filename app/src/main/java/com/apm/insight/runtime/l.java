package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static Printer f6771a;

    /* renamed from: b  reason: collision with root package name */
    private static l f6772b;

    /* renamed from: f  reason: collision with root package name */
    private static final Printer f6773f = new Printer() { // from class: com.apm.insight.runtime.l.1
        @Override // android.util.Printer
        public void println(String str) {
            if (str == null) {
                return;
            }
            if (str.charAt(0) == '>') {
                l.a().a(str);
            } else if (str.charAt(0) == '<') {
                l.a().b(str);
            }
            if (l.f6771a != null && l.f6771a != l.f6773f) {
                l.f6771a.println(str);
            }
        }
    };
    private long c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final List<Printer> f6774d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<Printer> f6775e = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f6776g = false;

    private l() {
    }

    public static l a() {
        if (f6772b == null) {
            synchronized (l.class) {
                if (f6772b == null) {
                    f6772b = new l();
                }
            }
        }
        return f6772b;
    }

    public void b(String str) {
        this.c = SystemClock.uptimeMillis();
        try {
            a(this.f6775e, str);
        } catch (Exception e10) {
            com.apm.insight.l.p.b((Throwable) e10);
        }
    }

    public void a(String str) {
        com.apm.insight.b.f.a(false);
        this.c = -1L;
        try {
            a(this.f6774d, str);
        } catch (Exception e10) {
            com.apm.insight.l.p.a((Throwable) e10);
        }
    }

    public boolean b() {
        return this.c != -1 && SystemClock.uptimeMillis() - this.c > TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL;
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th2) {
            com.apm.insight.l.p.a(th2);
        }
    }
}

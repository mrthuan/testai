package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.i;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.s;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.Map;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private static Runnable f6557b = new Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public void run() {
            p.b().a().removeCallbacks(this);
            p.b().a(new b(p.b().a(), 0L, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, i.g()));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private Context f6558a;

    public b(Handler handler, long j10, long j11, Context context) {
        super(handler, j10, j11);
        this.f6558a = context;
    }

    public static void d() {
        p.b().a(f6557b, 100L);
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, Object> map;
        try {
            map = i.a().c().getCommonParams();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (com.apm.insight.runtime.d.a(map)) {
                    a(c());
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        s.a().a(map, com.apm.insight.entity.b.b());
    }
}

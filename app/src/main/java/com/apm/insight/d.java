package com.apm.insight;

import com.apm.insight.runtime.m;
import java.util.Map;

/* loaded from: classes.dex */
public class d {
    public d() {
        com.apm.insight.f.a.a();
    }

    public void a(String str) {
        a(str, "EnsureNotReachHere", null);
    }

    public void a(String str, String str2, Map<String, String> map) {
        if (i.i().isEnsureEnable()) {
            com.apm.insight.f.b.a(Thread.currentThread().getStackTrace(), 5, str, str2, map);
        }
    }

    public void a(String str, Throwable th2) {
        m.a(th2, str);
    }

    public void a(Throwable th2, String str) {
        if (a(th2)) {
            com.apm.insight.f.b.a(th2, str, true);
        }
    }

    public boolean a(Throwable th2) {
        return i.i().isEnsureEnable() && !com.apm.insight.l.i.a(th2);
    }
}

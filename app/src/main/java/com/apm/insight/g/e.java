package com.apm.insight.g;

import com.apm.insight.i;
import com.apm.insight.l.q;

/* loaded from: classes.dex */
public class e {
    public static boolean a(long j10) {
        if (q.a(2)) {
            return true;
        }
        if (q.a(1024)) {
            return false;
        }
        if ((com.apm.insight.runtime.a.b.c() == -1 || j10 - com.apm.insight.runtime.a.b.c() <= i.i().getLaunchCrashInterval()) && (!i.m() || i.p() != 0)) {
            return true;
        }
        return false;
    }
}

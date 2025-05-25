package com.apm.insight.runtime;

import android.system.Os;
import android.system.OsConstants;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static long f6793a = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static long f6794a = -1;

        public static long a() {
            if (q.f6793a == -1) {
                long unused = q.f6793a = 1000 / b();
            }
            return q.f6793a;
        }

        public static long b() {
            return a(100L);
        }

        public static long a(long j10) {
            long j11 = f6794a;
            if (j11 > 0) {
                return j11;
            }
            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            if (sysconf > 0) {
                j10 = sysconf;
            }
            f6794a = j10;
            return j10;
        }

        private static long a(String str, long j10) {
            try {
                int i10 = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField("os").get(null), Integer.valueOf(i10))).longValue();
            } catch (Throwable th2) {
                th2.printStackTrace();
                return j10;
            }
        }
    }
}

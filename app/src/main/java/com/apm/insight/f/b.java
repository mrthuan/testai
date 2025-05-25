package com.apm.insight.f;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.c;
import com.apm.insight.k.g;
import com.apm.insight.l.p;
import com.apm.insight.l.u;
import com.apm.insight.runtime.a.f;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    private static String a(StackTraceElement[] stackTraceElementArr, int i10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < stackTraceElementArr.length) {
            u.a(stackTraceElementArr[i10], sb2);
            i10++;
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, Throwable th2, String str, boolean z10, Map<String, String> map, String str2) {
        c(obj, th2, str, z10, map, "EnsureNotReachHere", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, Throwable th2, String str, boolean z10, Map<String, String> map, String str2, String str3) {
        if (th2 == null) {
            return;
        }
        try {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            String a10 = u.a(th2);
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            c a11 = c.a(stackTraceElement, a10, str, Thread.currentThread().getName(), z10, str2, str3);
            if (obj != null) {
                a11.a("exception_line_num", (Object) com.apm.insight.entity.b.a(obj, th2, stackTrace));
            }
            a(map, a11);
            f.a().a(CrashType.ENSURE, a11);
            g.a(obj, a11);
            p.b("[reportException] " + str);
        } catch (Throwable th3) {
            p.b(th3);
        }
    }

    public static void a(final Object obj, final Throwable th2, final String str, final boolean z10, final Map<String, String> map, final String str2, final String str3) {
        try {
            com.apm.insight.runtime.p.b().a(new Runnable() { // from class: com.apm.insight.f.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.c(obj, th2, str, z10, map, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(StackTraceElement[] stackTraceElementArr, int i10, String str, String str2, String str3, Map<String, String> map) {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i10 + 1 && (stackTraceElement = stackTraceElementArr[i10]) != null) {
                    String a10 = a(stackTraceElementArr, i10);
                    if (TextUtils.isEmpty(a10)) {
                        return;
                    }
                    c a11 = c.a(stackTraceElement, a10, str, Thread.currentThread().getName(), true, str2, str3);
                    a(map, a11);
                    f.a().a(CrashType.ENSURE, a11);
                    g.a(a11);
                    p.b("[report] " + str);
                }
            } catch (Throwable th2) {
                p.b(th2);
            }
        }
    }

    public static void a(Throwable th2, String str, boolean z10) {
        a(th2, str, z10, "core_exception_monitor");
    }

    public static void a(Throwable th2, String str, boolean z10, String str2) {
        a(th2, str, z10, (Map<String, String>) null, str2);
    }

    public static void a(final Throwable th2, final String str, final boolean z10, final Map<String, String> map, final String str2) {
        try {
            com.apm.insight.runtime.p.b().a(new Runnable() { // from class: com.apm.insight.f.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.b((Object) null, th2, str, z10, map, str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void a(Map<String, String> map, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                cVar.a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(final StackTraceElement[] stackTraceElementArr, final int i10, final String str, final String str2, final Map<String, String> map) {
        try {
            com.apm.insight.runtime.p.b().a(new Runnable() { // from class: com.apm.insight.f.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.b(stackTraceElementArr, i10, str, str2, "core_exception_monitor", map);
                }
            });
        } catch (Throwable unused) {
        }
    }
}

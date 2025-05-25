package ge;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Locale;

/* compiled from: MemoryUtils.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static g f17776a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f17777b = -1;
    public static int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static long f17778d = -1;

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long b(int i10, String str, String str2) {
        return Long.parseLong(str.split(str2)[0].trim()) * i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r5[1];
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r1 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        fe.a.a().c(r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.io.File r5) {
        /*
            java.lang.String r0 = "MemTotal"
            boolean r1 = r5.exists()
            r2 = 0
            if (r1 == 0) goto L64
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r5 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
        L15:
            java.lang.String r5 = r1.readLine()     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L53
            if (r5 == 0) goto L46
            java.lang.String r3 = "\\s*:\\s*"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L53
            r4 = 2
            java.lang.String[] r5 = r3.split(r5, r4)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L53
            int r3 = r5.length     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L53
            r4 = 1
            if (r3 <= r4) goto L15
            r3 = 0
            r3 = r5[r3]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L53
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L53
            if (r3 == 0) goto L15
            r5 = r5[r4]     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L53
            r2 = r5
            goto L46
        L37:
            r5 = move-exception
            goto L3d
        L39:
            r5 = move-exception
            goto L55
        L3b:
            r5 = move-exception
            r1 = r2
        L3d:
            fe.a r0 = fe.a.a()     // Catch: java.lang.Throwable -> L53
            r0.c(r5)     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L64
        L46:
            r1.close()     // Catch: java.io.IOException -> L4a
            goto L64
        L4a:
            r5 = move-exception
            fe.a r0 = fe.a.a()
            r0.c(r5)
            goto L64
        L53:
            r5 = move-exception
            r2 = r1
        L55:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5b
            goto L63
        L5b:
            r0 = move-exception
            fe.a r1 = fe.a.a()
            r1.c(r0)
        L63:
            throw r5
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.g.c(java.io.File):java.lang.String");
    }

    public static synchronized g d() {
        g gVar;
        synchronized (g.class) {
            if (f17776a == null) {
                f17776a = new g();
            }
            gVar = f17776a;
        }
        return gVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005b -> B:21:0x005d). Please submit an issue!!! */
    public final synchronized long e() {
        long j10;
        if (f17778d == -1) {
            String c10 = c(new File("/proc/meminfo"));
            if (!TextUtils.isEmpty(c10)) {
                String upperCase = c10.toUpperCase(Locale.US);
                try {
                    if (upperCase.endsWith("KB")) {
                        j10 = b(1024, upperCase, "KB");
                    } else if (upperCase.endsWith("MB")) {
                        j10 = b(1048576, upperCase, "MB");
                    } else if (upperCase.endsWith("GB")) {
                        j10 = b(1073741824, upperCase, "GB");
                    }
                } catch (NumberFormatException e10) {
                    fe.a.a().c(e10);
                }
                f17778d = j10;
            }
            j10 = 0;
            f17778d = j10;
        }
        return f17778d;
    }

    public final boolean f(Context context) {
        long a10;
        try {
            a10 = a(context);
            fe.a a11 = fe.a.a();
            a11.b("free memory:" + ((((float) a10) / 1024.0f) / 1024.0f));
            if (c == -1) {
                c = de.e.d(context, null, "low_memory_value", 100);
                fe.a a12 = fe.a.a();
                a12.b("low_memory_value:" + c);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (a10 > c * 1024 * 1024) {
            return false;
        }
        long e10 = e();
        fe.a a13 = fe.a.a();
        a13.b("total memory:" + ((((float) e10) / 1024.0f) / 1024.0f));
        if (e10 != 0) {
            double d10 = (a10 / e10) * 100.0d;
            if (f17777b == -1) {
                f17777b = de.e.d(context, null, "low_memory_percent", 5);
                fe.a a14 = fe.a.a();
                a14.b("low_memory_percent:" + f17777b);
            }
            if (d10 < f17777b) {
                return true;
            }
        }
        return false;
    }
}

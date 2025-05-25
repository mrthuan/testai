package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.apm.insight.b.f;
import com.apm.insight.b.g;
import com.apm.insight.i;
import com.apm.insight.l.n;
import com.apm.insight.l.t;
import com.apm.insight.l.w;
import java.io.File;

/* loaded from: classes.dex */
public class NativeImpl {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f6667a = false;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f6668b = false;
    private static boolean c = true;

    public static int a(int i10) {
        if (f6667a && i10 >= 0) {
            try {
                return doLock("", i10);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static int b() {
        if (f6667a) {
            return doCreateCallbackThread();
        }
        return -1;
    }

    public static int c(String str) {
        if (f6667a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static void d(String str) {
        if (f6667a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    @Keep
    private static native boolean doCheckNativeCrash();

    @Keep
    private static native void doCloseFile(int i10);

    @Keep
    private static native int doCreateCallbackThread();

    @Keep
    private static native void doDump(String str);

    @Keep
    private static native void doDumpFds(String str);

    @Keep
    private static native void doDumpHprof(String str);

    @Keep
    private static native void doDumpLogcat(String str, String str2, String str3);

    @Keep
    private static native void doDumpMaps(String str);

    @Keep
    private static native void doDumpMemInfo(String str);

    @Keep
    private static native void doDumpThreads(String str);

    @Keep
    private static native long doGetAppCpuTime();

    @Keep
    private static native long doGetChildCpuTime();

    @Keep
    private static native String doGetCrashHeader(String str);

    @Keep
    private static native long doGetDeviceCpuTime();

    @Keep
    private static native int doGetFDCount();

    @Keep
    private static native String[] doGetFdDump(int i10, int i11, int[] iArr, String[] strArr);

    @Keep
    private static native long doGetFreeMemory();

    @Keep
    private static native long doGetThreadCpuTime(int i10);

    @Keep
    private static native int doGetThreadsCount();

    @Keep
    private static native long doGetTotalMemory();

    @Keep
    private static native long doGetVMSize();

    @Keep
    private static native void doInitThreadDump();

    @Keep
    private static native int doLock(String str, int i10);

    @Keep
    private static native int doOpenFile(String str);

    @Keep
    private static native void doRebuildTombstone(String str, String str2, String str3);

    @Keep
    private static native void doSetAlogConfigPath(String str);

    @Keep
    private static native void doSetAlogFlushAddr(long j10);

    @Keep
    private static native void doSetAlogLogDirAddr(long j10);

    @Keep
    private static native void doSetResendSigQuit(int i10);

    @Keep
    private static native void doSetUploadEnd();

    @Keep
    private static native void doSignalMainThread();

    @Keep
    private static native int doStart(int i10, String str, String str2, String str3, int i11);

    @Keep
    private static native void doStartAnrMonitor(int i10);

    @Keep
    private static native void doWriteFile(int i10, String str, int i11);

    public static void e(String str) {
        if (f6667a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void f() {
        w.a(new Runnable() { // from class: com.apm.insight.nativecrash.NativeImpl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    NativeImpl.l();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.c.a(th2, "NPTH_ANR_MONITOR_ERROR");
                    } catch (Throwable unused) {
                    }
                }
            }
        }, "NPTH-AnrMonitor");
    }

    public static void g(String str) {
        if (f6667a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static int h(String str) {
        if (f6667a) {
            try {
                return doOpenFile(str);
            } catch (Throwable unused) {
                return -1;
            }
        }
        return -1;
    }

    @Keep
    private static void handleNativeCrash(String str) {
        b.onNativeCrash(str);
    }

    public static void i() {
        if (f6667a) {
            doSetUploadEnd();
        }
    }

    @Keep
    private static native boolean is64Bit();

    public static void j() {
        if (!f6667a) {
            return;
        }
        doInitThreadDump();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l() {
        if (!f6667a) {
            return;
        }
        try {
            doStartAnrMonitor(Build.VERSION.SDK_INT);
        } catch (Throwable unused) {
        }
    }

    @Keep
    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            i.j();
            f.b(true);
            com.apm.insight.b.d.b();
            g.a(i.g()).a().e();
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        if (f6667a) {
            return doGetCrashHeader(str);
        }
        return null;
    }

    public static void b(int i10) {
        if (f6667a) {
            try {
                doCloseFile(i10);
            } catch (Throwable unused) {
            }
        }
    }

    public static long c(int i10) {
        if (f6667a) {
            return doGetThreadCpuTime(i10);
        }
        return 0L;
    }

    public static boolean d() {
        if (f6667a) {
            try {
                return doCheckNativeCrash();
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static boolean e() {
        if (f6667a) {
            try {
                return is64Bit();
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static void f(String str) {
        if (f6667a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean g() {
        return c;
    }

    public static void h() {
        if (f6667a) {
            doSignalMainThread();
        }
    }

    public static void i(String str) {
        if (f6667a) {
            doDump(str);
        }
    }

    public static void a(int i10, String str) {
        if (f6667a && !TextUtils.isEmpty(str)) {
            try {
                doWriteFile(i10, str, str.length());
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(long j10) {
        if (f6667a) {
            try {
                doSetAlogFlushAddr(j10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void c() {
    }

    public static void a(long j10) {
    }

    public static void b(String str) {
        if (f6667a) {
            doDumpHprof(str);
        }
    }

    public static void c(long j10) {
        if (f6667a) {
            try {
                doSetAlogLogDirAddr(j10);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(File file) {
        if (f6667a) {
            doRebuildTombstone(n.c(file).getAbsolutePath(), n.b(file).getAbsolutePath(), n.d(file).getAbsolutePath());
        }
    }

    public static void a(String str, String str2, String str3) {
        if (f6667a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(boolean z10) {
        c = z10;
        if (f6667a) {
            doSetResendSigQuit(z10 ? 1 : 0);
        }
    }

    public static boolean a() {
        if (f6668b) {
            return f6667a;
        }
        f6668b = true;
        if (!f6667a) {
            f6667a = t.a("apminsighta");
        }
        return f6667a;
    }

    public static boolean a(Context context) {
        String a10;
        boolean a11 = a();
        if (a11) {
            String str = n.j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                a10 = context.getApplicationInfo().nativeLibraryDir;
            } else {
                a10 = com.apm.insight.h.b.a();
                com.apm.insight.h.b.b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, a10, str, i.f(), i.l());
        }
        return a11;
    }
}

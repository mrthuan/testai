package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.i;
import com.apm.insight.l.e;
import com.apm.insight.l.h;
import com.apm.insight.l.j;
import com.apm.insight.l.n;
import com.apm.insight.l.q;
import com.apm.insight.l.u;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.office.fc.hpsf.Variant;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static a f6489a = null;

    /* renamed from: i  reason: collision with root package name */
    private static volatile boolean f6490i = false;

    /* renamed from: j  reason: collision with root package name */
    private static volatile ThreadLocal<Boolean> f6491j = new ThreadLocal<>();

    /* renamed from: l  reason: collision with root package name */
    private static ArrayList<b> f6492l = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f6493b;
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private c f6494d;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f6495e = 0;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f6496f = 0;

    /* renamed from: g  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6497g = new ConcurrentHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f6498h = new ConcurrentHashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private JSONArray f6499k;

    private a() {
        d();
    }

    private static int a(Throwable th2, Thread thread) {
        int i10 = 0;
        for (int i11 = 0; i11 < f6492l.size(); i11++) {
            try {
                try {
                    i10 |= f6492l.get(i11).a(th2, thread);
                } catch (Throwable th3) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th3);
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    private static Throwable b(Throwable th2, Thread thread) {
        for (int i10 = 0; i10 < f6492l.size(); i10++) {
            try {
                try {
                    f6492l.get(i10).b(th2, thread);
                } catch (Throwable th3) {
                    return th3;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            try {
                Looper.loop();
                return null;
            } catch (Throwable th4) {
                return th4;
            }
        }
        return null;
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a("data", (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a10 = f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (a10 != null) {
                            com.apm.insight.k.d.a().b(a10.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f6493b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private void e() {
        synchronized (this) {
            this.f6496f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f6496f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50L);
        }
    }

    private void f() {
        File a10 = n.a(i.g());
        File a11 = n.a();
        if (h.b(a10) && h.b(a11)) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!com.apm.insight.k.i.a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private boolean g() {
        if (com.apm.insight.runtime.a.a("exception_modules", "oom_callback") == 1) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        do {
            th2 = a(thread, th2);
        } while (th2 != null);
    }

    public static a a() {
        if (f6489a == null) {
            f6489a = new a();
        }
        return f6489a;
    }

    private void c(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6493b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this || q.a(512)) {
            return;
        }
        this.f6493b.uncaughtException(thread, th2);
    }

    public void b(c cVar) {
        this.f6494d = cVar;
    }

    private String a(File file, boolean z10, Throwable th2, String str, Thread thread, boolean z11) {
        String absolutePath = file.getAbsolutePath();
        this.f6498h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String str2 = null;
        if (z11) {
            int h10 = NativeImpl.h(absolutePath);
            if (h10 > 0) {
                try {
                    NativeImpl.a(h10, com.apm.insight.l.a.c(i.g()));
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, th2.getMessage());
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, th2.getClass().getName());
                    if (th2.getMessage() != null) {
                        NativeImpl.a(h10, ": ");
                        NativeImpl.a(h10, th2.getMessage());
                    }
                    NativeImpl.a(h10, "\n");
                    NativeImpl.a(h10, thread.getName());
                    NativeImpl.a(h10, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(h10, "stack:");
                    NativeImpl.a(h10, "\n");
                } catch (Throwable unused3) {
                }
                u.a(th2, h10);
                NativeImpl.b(h10);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                if (q.a((int) Variant.VT_RESERVED)) {
                    throw new RuntimeException("test exception before write stack");
                }
                fileOutputStream.write((com.apm.insight.l.a.c(i.g()) + "\n").getBytes());
                fileOutputStream.write((th2.getMessage() + "\n").getBytes());
                fileOutputStream.write((th2 + "\n").getBytes());
                fileOutputStream.write((thread.getName() + "\n").getBytes());
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused4) {
                }
                try {
                } catch (Throwable th3) {
                    try {
                        if (q.a(16384)) {
                            throw new RuntimeException("test exception system write stack");
                        }
                        th2.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                            fileOutputStream.write((th4 + "\n").getBytes());
                        } catch (Throwable unused5) {
                        }
                    }
                }
                if (q.a(8192)) {
                    throw new RuntimeException("test exception npth write stack");
                }
                str2 = u.a(th2, thread, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new e.a() { // from class: com.apm.insight.g.a.1

                    /* renamed from: a  reason: collision with root package name */
                    boolean f6500a = false;

                    @Override // com.apm.insight.l.e.a
                    public boolean a(String str3) {
                        if (!this.f6500a && str3.contains("android.os.Looper.loop")) {
                            this.f6500a = true;
                        }
                        return !this.f6500a;
                    }
                } : new e.a());
                j.a(fileOutputStream);
                j.a(fileOutputStream);
            } catch (Throwable unused6) {
            }
        }
        return str2;
    }

    public static boolean b() {
        return f6490i;
    }

    public static boolean c() {
        Boolean bool = f6491j.get();
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:7|(1:9)|10|(2:11|12)|(3:186|187|(34:189|15|16|(2:180|181)(2:18|19)|20|21|22|23|24|(21:(2:166|167)|27|28|29|(1:31)(1:162)|32|(3:154|(1:156)(1:158)|157)(1:35)|36|(1:152)(3:39|40|41)|42|(1:44)|46|47|(1:49)(1:147)|50|51|(2:56|(6:58|59|60|61|62|(4:(1:72)(2:66|67)|68|69|70)(4:73|1f2|78|79)))|133|(3:136|137|(5:141|142|143|62|(0)(0)))|135|(0)(0))|172|28|29|(0)(0)|32|(0)|154|(0)(0)|157|36|(0)|152|42|(0)|46|47|(0)(0)|50|51|(3:53|56|(0))|133|(0)|135|(0)(0)))|14|15|16|(0)(0)|20|21|22|23|24|(0)|172|28|29|(0)(0)|32|(0)|154|(0)(0)|157|36|(0)|152|42|(0)|46|47|(0)(0)|50|51|(0)|133|(0)|135|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(40:7|(1:9)|10|11|12|(3:186|187|(34:189|15|16|(2:180|181)(2:18|19)|20|21|22|23|24|(21:(2:166|167)|27|28|29|(1:31)(1:162)|32|(3:154|(1:156)(1:158)|157)(1:35)|36|(1:152)(3:39|40|41)|42|(1:44)|46|47|(1:49)(1:147)|50|51|(2:56|(6:58|59|60|61|62|(4:(1:72)(2:66|67)|68|69|70)(4:73|1f2|78|79)))|133|(3:136|137|(5:141|142|143|62|(0)(0)))|135|(0)(0))|172|28|29|(0)(0)|32|(0)|154|(0)(0)|157|36|(0)|152|42|(0)|46|47|(0)(0)|50|51|(3:53|56|(0))|133|(0)|135|(0)(0)))|14|15|16|(0)(0)|20|21|22|23|24|(0)|172|28|29|(0)(0)|32|(0)|154|(0)(0)|157|36|(0)|152|42|(0)|46|47|(0)(0)|50|51|(0)|133|(0)|135|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0206, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0211, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0212, code lost:
        r4 = r5;
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0218, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0219, code lost:
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021f, code lost:
        r21 = false;
        r2 = r2;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0222, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0223, code lost:
        r5 = r10;
        r2 = 1;
        r7 = r28;
        r9 = r27;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023c, code lost:
        com.apm.insight.l.p.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0241, code lost:
        if (r19 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024b, code lost:
        a(r27, r28, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x024e, code lost:
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0253, code lost:
        monitor-enter(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0254, code lost:
        r26.f6496f -= r2;
        r26.f6495e -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0263, code lost:
        return b(r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (com.apm.insight.i.i().isCrashIgnored(r7) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023c A[Catch: all -> 0x0267, TRY_LEAVE, TryCatch #6 {all -> 0x0267, blocks: (B:128:0x0236, B:130:0x023c), top: B:178:0x0236 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de A[Catch: all -> 0x0211, TRY_ENTER, TryCatch #13 {all -> 0x0211, blocks: (B:53:0x0103, B:50:0x00de, B:52:0x00e3, B:51:0x00e1), top: B:192:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1 A[Catch: all -> 0x0211, TryCatch #13 {all -> 0x0211, blocks: (B:53:0x0103, B:50:0x00de, B:52:0x00e3, B:51:0x00e1), top: B:192:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #8 {all -> 0x0209, blocks: (B:57:0x0121, B:59:0x0129, B:61:0x012f), top: B:182:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138 A[Catch: all -> 0x0206, TRY_ENTER, TryCatch #5 {all -> 0x0206, blocks: (B:64:0x0138, B:66:0x013d, B:68:0x015b, B:71:0x0161, B:65:0x013b), top: B:176:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b A[Catch: all -> 0x0206, TryCatch #5 {all -> 0x0206, blocks: (B:64:0x0138, B:66:0x013d, B:68:0x015b, B:71:0x0161, B:65:0x013b), top: B:176:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b A[Catch: all -> 0x0206, TryCatch #5 {all -> 0x0206, blocks: (B:64:0x0138, B:66:0x013d, B:68:0x015b, B:71:0x0161, B:65:0x013b), top: B:176:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d3  */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r2v20, types: [com.apm.insight.a.a] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Throwable a(java.lang.Thread r27, java.lang.Throwable r28) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.g.a.a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    public boolean b(String str) {
        return this.f6497g.containsKey(str);
    }

    private boolean b(Thread thread, Throwable th2) {
        ICrashFilter b10 = i.b().b();
        if (b10 != null) {
            try {
                return b10.onJavaCrashFilter(th2, thread);
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    public void a(String str) {
        this.f6497g.put(str, new Object());
    }

    private void a(Thread thread, Throwable th2, boolean z10, long j10) {
        List<IOOMCallback> a10 = o.a().a();
        CrashType crashType = z10 ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : a10) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iOOMCallback).a(crashType, th2, thread, j10, this.f6499k);
                } else {
                    iOOMCallback.onCrash(crashType, th2, thread, j10);
                }
            } catch (Throwable th3) {
                com.apm.insight.l.p.b(th3);
            }
        }
    }

    public void a(Thread thread, Throwable th2, boolean z10, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> c;
        CrashType crashType;
        if (z10) {
            c = o.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            c = o.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : c) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, u.a(th2), thread, this.f6499k);
                } else {
                    iCrashCallback.onCrash(crashType, u.a(th2), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th3) {
                com.apm.insight.l.p.b(th3);
                aVar.b("callback_err_".concat(iCrashCallback.getClass().getName()), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    public static void a(final Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.apm.insight.entity.a a10 = com.apm.insight.entity.a.a(System.currentTimeMillis(), i.g(), (Thread) null, th2);
                        a10.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a a11 = f.a().a(CrashType.CUSTOM_JAVA, a10);
                        if (a11 != null) {
                            com.apm.insight.k.d.a().b(a11.h());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j10) {
        return e.a(j10);
    }
}

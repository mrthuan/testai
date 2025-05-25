package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.n;
import com.apm.insight.l.o;
import com.apm.insight.l.v;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.q;
import com.apm.insight.runtime.s;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f6562d;
    private Context c;

    /* renamed from: f  reason: collision with root package name */
    private C0050b f6566f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<String, C0050b> f6567g;

    /* renamed from: a  reason: collision with root package name */
    List<File> f6563a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    List<File> f6564b = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f6565e = -1;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f6568h = false;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f6569i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public void run() {
            b.this.g();
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private Runnable f6570j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public void run() {
            b.this.e();
        }
    };

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        File f6578a;

        /* renamed from: b  reason: collision with root package name */
        long f6579b;
        long c;

        /* renamed from: d  reason: collision with root package name */
        CrashType f6580d;

        /* renamed from: e  reason: collision with root package name */
        String f6581e;

        public a(File file, long j10, CrashType crashType) {
            this.c = -1L;
            this.f6578a = file;
            this.f6579b = j10;
            this.f6580d = crashType;
            this.f6581e = file.getName();
        }

        public a(File file, CrashType crashType) {
            this.f6579b = -1L;
            this.c = -1L;
            this.f6578a = file;
            this.f6580d = crashType;
            this.f6581e = file.getName();
        }
    }

    /* renamed from: com.apm.insight.k.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0050b {

        /* renamed from: a  reason: collision with root package name */
        String f6582a;

        /* renamed from: d  reason: collision with root package name */
        a f6584d;

        /* renamed from: e  reason: collision with root package name */
        a f6585e;

        /* renamed from: b  reason: collision with root package name */
        List<a> f6583b = new ArrayList();
        List<a> c = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        boolean f6586f = false;

        /* renamed from: g  reason: collision with root package name */
        int f6587g = 0;

        public C0050b(String str) {
            this.f6582a = str;
        }
    }

    private b(Context context) {
        this.c = context;
    }

    private com.apm.insight.entity.e a(File file, CrashType crashType, String str, long j10, long j11) {
        com.apm.insight.entity.e eVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.h.a(file);
                    return null;
                }
                boolean z10 = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.h.d(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th2) {
                        th = th2;
                        eVar = null;
                        com.apm.insight.l.h.a(file);
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        return eVar;
                    }
                }
                com.apm.insight.entity.e a10 = com.apm.insight.l.h.a(file, crashType);
                try {
                    JSONObject b10 = a10.b();
                    if (a10.b() == null) {
                        com.apm.insight.l.h.a(file);
                    } else if (crashType == CrashType.ANR) {
                        return a10;
                    } else {
                        b10.put("crash_time", j10);
                        b10.put("app_start_time", j11);
                        JSONObject optJSONObject = b10.optJSONObject("header");
                        if (optJSONObject == null) {
                            optJSONObject = Header.a(this.c, j10).f();
                        } else if (z10) {
                            b10.remove("header");
                        }
                        String optString = optJSONObject.optString("sdk_version_name", null);
                        if (optString == null) {
                            optString = "1.3.8.nourl-alpha.22";
                        }
                        com.apm.insight.entity.a.a(b10, "filters", "sdk_version", optString);
                        if (com.apm.insight.l.h.a(b10.optJSONArray("logcat"))) {
                            b10.put("logcat", com.apm.insight.runtime.k.b(str));
                        }
                        com.apm.insight.entity.a.a(b10, "filters", "has_dump", "true");
                        com.apm.insight.entity.a.a(b10, "filters", "has_logcat", String.valueOf(!com.apm.insight.l.k.a(b10, "logcat")));
                        com.apm.insight.entity.a.a(b10, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                        com.apm.insight.entity.a.a(b10, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                        com.apm.insight.entity.a.a(b10, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.d(str)));
                        com.apm.insight.entity.a.a(b10, "filters", "is_64_devices", String.valueOf(Header.a()));
                        com.apm.insight.entity.a.a(b10, "filters", "is_64_runtime", String.valueOf(NativeImpl.e()));
                        com.apm.insight.entity.a.a(b10, "filters", "is_x86_devices", String.valueOf(Header.b()));
                        com.apm.insight.entity.a.a(b10, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.entity.a.a(str)));
                        com.apm.insight.entity.a.a(b10, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.c.m()));
                        b10.put("launch_did", com.apm.insight.i.a.a(this.c));
                        b10.put("crash_uuid", file.getName());
                        b10.put("jiffy", q.a.a());
                        long parseLong = Long.parseLong(com.apm.insight.runtime.b.a(j10, str));
                        com.apm.insight.entity.a.a(b10, "filters", "lastAliveTime", Math.abs(parseLong - j10) < 60000 ? "< 60s" : "> 60s");
                        b10.put("lastAliveTime", String.valueOf(parseLong));
                        b10.put("has_dump", "true");
                        if (b10.opt("storage") == null) {
                            com.apm.insight.entity.a.a(b10, v.a(com.apm.insight.i.g()));
                        }
                        if (Header.b(optJSONObject)) {
                            com.apm.insight.entity.a.a(b10, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        com.apm.insight.entity.d.b(b10);
                        a10.b().put("upload_scene", "launch_scan");
                        if (z10) {
                            JSONObject jSONObject = new JSONObject();
                            b10.put("event_type", "start_crash");
                            b10.put("stack", b10.remove("data"));
                            jSONObject.put("data", new JSONArray().put(b10));
                            jSONObject.put("header", optJSONObject);
                            a10.a(jSONObject);
                        } else {
                            b10.put("isJava", 1);
                        }
                    }
                    return a10;
                } catch (Throwable th3) {
                    th = th3;
                    eVar = a10;
                    com.apm.insight.l.h.a(file);
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                    return eVar;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            eVar = null;
        }
    }

    private void d() {
        if (this.f6566f != null) {
            return;
        }
        this.f6566f = new C0050b("old_uuid");
        HashMap<String, C0050b> hashMap = new HashMap<>();
        this.f6567g = hashMap;
        a(hashMap);
        b(this.f6567g, this.f6566f);
        c(this.f6567g, this.f6566f);
        a(this.f6567g, this.f6566f);
        b(this.f6566f, true, null);
        a(this.f6566f, true, null);
        this.f6566f = null;
        if (this.f6567g.isEmpty()) {
            f();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!this.f6568h && this.f6567g != null) {
            if (!o.b(this.c)) {
                f();
            }
            boolean h10 = h();
            com.apm.insight.runtime.h hVar = new com.apm.insight.runtime.h(this.c);
            for (C0050b c0050b : this.f6567g.values()) {
                b(c0050b, h10, hVar);
            }
            for (C0050b c0050b2 : this.f6567g.values()) {
                a(c0050b2, h10, hVar);
            }
            for (C0050b c0050b3 : this.f6567g.values()) {
                a(c0050b3);
            }
            hVar.a();
            com.apm.insight.runtime.b.a();
            f();
        }
    }

    private void f() {
        this.f6568h = true;
        this.f6567g = null;
        NativeImpl.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f6568h) {
            return;
        }
        if (o.b(this.c) && (System.currentTimeMillis() - com.apm.insight.i.j() > TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL || !com.apm.insight.i.i().isApmExists() || Npth.hasCrash())) {
            e();
        } else {
            p.b().a(this.f6569i, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
        }
    }

    private boolean h() {
        if (this.f6565e == -1) {
            if (!com.apm.insight.runtime.a.b() || !com.apm.insight.runtime.a.g()) {
                this.f6565e = 0;
            } else {
                this.f6565e = 1;
            }
        }
        if (this.f6565e != 1) {
            return false;
        }
        return true;
    }

    private void i() {
        File[] listFiles = n.i(this.c).listFiles();
        if (listFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a().a(file.getAbsolutePath());
            } else {
                try {
                    com.apm.insight.entity.e e10 = com.apm.insight.l.h.e(file.getAbsolutePath());
                    if (e10 != null) {
                        if (e10.b() != null) {
                            e10.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), e10.e(), e10.d(), e10.f(), e10.g())) {
                            com.apm.insight.l.h.a(file);
                            com.apm.insight.l.h.a(e10.c());
                        }
                    } else {
                        com.apm.insight.l.h.a(file);
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
            }
        }
    }

    public void b() {
        try {
            if (!this.f6568h && com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                p.b().a(this.f6570j);
            }
        } catch (Throwable unused) {
        }
    }

    public static b a() {
        if (f6562d == null) {
            synchronized (b.class) {
                if (f6562d == null) {
                    f6562d = new b(com.apm.insight.i.g());
                }
            }
        }
        return f6562d;
    }

    private void b(final C0050b c0050b, boolean z10, com.apm.insight.runtime.h hVar) {
        Iterator<a> it;
        boolean z11;
        JSONObject a10;
        a aVar;
        if (c0050b.c.size() <= 1 && c0050b.c.isEmpty()) {
            c0050b.f6585e = c0050b.f6584d;
            return;
        }
        boolean b10 = o.b(this.c);
        c0050b.f6585e = c0050b.f6584d;
        com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(this.c);
        Iterator<a> it2 = c0050b.c.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            final File file = next.f6578a;
            try {
                cVar.a(file);
                a10 = a(cVar);
            } catch (Throwable th2) {
                th = th2;
                it = it2;
            }
            if (a10 != null && a10.length() != 0) {
                if (a10.length() != 0) {
                    if (z10) {
                        it = it2;
                        z11 = b10;
                        if (hVar != null && !hVar.a("default")) {
                            cVar.k();
                        }
                    } else {
                        long optLong = a10.optLong("crash_time");
                        try {
                            aVar = c0050b.f6585e;
                        } catch (Throwable th3) {
                            th = th3;
                            it = it2;
                            z11 = b10;
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            com.apm.insight.l.h.a(file);
                            b10 = z11;
                            it2 = it;
                        }
                        if (aVar == null) {
                            c0050b.f6585e = next;
                            c0050b.f6586f = true;
                            if (hVar == null || hVar.a("default")) {
                                it = it2;
                                z11 = b10;
                            } else {
                                cVar.k();
                            }
                        } else {
                            it = it2;
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                                z11 = b10;
                            }
                            if (c0050b.f6586f) {
                                z11 = b10;
                            } else {
                                z11 = b10;
                                try {
                                } catch (Throwable th5) {
                                    th = th5;
                                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                                    com.apm.insight.l.h.a(file);
                                    b10 = z11;
                                    it2 = it;
                                }
                                if (optLong < aVar.f6579b) {
                                    c0050b.f6585e = next;
                                    if (hVar == null || hVar.a("default")) {
                                        if (!a(file)) {
                                            a(file, c0050b);
                                        }
                                        c0050b.f6586f = true;
                                    } else {
                                        cVar.k();
                                        b10 = z11;
                                        it2 = it;
                                    }
                                }
                            }
                            com.apm.insight.entity.a.a(a10, "filters", "aid", String.valueOf(a10.optJSONObject("header").opt("aid")));
                            a10.optJSONObject("header").put("aid", 2010);
                        }
                    }
                    com.apm.insight.entity.a.a(a10, "filters", "start_uuid", c0050b.f6582a);
                    com.apm.insight.entity.a.a(a10, "filters", "crash_thread_name", a10.optString("crash_thread_name", "unknown"));
                    if (z11) {
                        try {
                            c.a aVar2 = new c.a(a10, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(a10, com.apm.insight.entity.b.a(aVar2.c(), aVar2.a(), s.a().b(aVar2.b() == -1 ? System.currentTimeMillis() : aVar2.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public void a(JSONObject jSONObject) {
                                    d.a().a(jSONObject, file, n.a(b.this.c, c0050b.f6582a));
                                }
                            });
                            if (!cVar.k()) {
                                cVar.h();
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            com.apm.insight.c.a().a("NPTH_CATCH", th);
                            com.apm.insight.l.h.a(file);
                            b10 = z11;
                            it2 = it;
                        }
                    }
                    c.a(CrashType.NATIVE, a10);
                } else {
                    it = it2;
                    z11 = b10;
                }
                b10 = z11;
                it2 = it;
            }
            it = it2;
            z11 = b10;
            cVar.k();
            b10 = z11;
            it2 = it;
        }
    }

    private void c(HashMap<String, C0050b> hashMap, C0050b c0050b) {
        com.apm.insight.l.h.a(n.b(this.c));
    }

    private JSONObject a(com.apm.insight.nativecrash.c cVar) {
        JSONObject d10 = cVar.d();
        if (d10 == null || d10.length() == 0) {
            if (com.apm.insight.i.d()) {
                cVar.l();
            }
            if (!cVar.c()) {
                cVar.k();
                return null;
            } else if (!cVar.f()) {
                cVar.k();
                return null;
            } else if (cVar.g()) {
                cVar.k();
                return null;
            } else {
                cVar.e();
                return cVar.j();
            }
        }
        return d10;
    }

    public boolean c() {
        return this.f6568h;
    }

    private void a(C0050b c0050b) {
        com.apm.insight.l.h.a(n.a(this.c, c0050b.f6582a));
    }

    private void b(HashMap<String, C0050b> hashMap, C0050b c0050b) {
        File[] listFiles = n.a(this.c).listFiles();
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        for (File file : listFiles) {
            try {
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            if (!com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                if (!com.apm.insight.l.h.g(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (!file.isFile()) {
                        a(hashMap, c0050b, file, file.getName());
                    }
                }
            }
            com.apm.insight.l.h.a(file);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:36|37|38|(1:40)(1:76)|41|(2:70|(3:74|75|20))(5:45|46|47|48|49)|50|51|52|53|(1:55)|56|57|20) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148 A[Catch: all -> 0x015d, TryCatch #4 {all -> 0x015d, blocks: (B:63:0x013c, B:65:0x0148, B:66:0x0157), top: B:88:0x013c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.apm.insight.k.b.C0050b r21, boolean r22, com.apm.insight.runtime.h r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.h):void");
    }

    private void a(File file, C0050b c0050b) {
    }

    private void a(HashMap<String, C0050b> hashMap) {
        File[] listFiles = n.f(this.c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            try {
                if (file.isDirectory() && file.getName().endsWith(OperatorName.STROKING_COLOR_GRAY)) {
                    String name = file.getName();
                    C0050b c0050b = hashMap.get(name);
                    if (c0050b == null) {
                        c0050b = new C0050b(name);
                        hashMap.put(name, c0050b);
                    }
                    JSONArray a10 = com.apm.insight.nativecrash.d.a(n.l(file), n.m(file));
                    int length = a10.length();
                    c0050b.f6587g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.h.a(n.n(file), a10, false);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.h.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
                com.apm.insight.l.h.a(file);
            }
        }
    }

    private void a(HashMap<String, C0050b> hashMap, C0050b c0050b) {
        File[] listFiles = n.d(this.c).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < listFiles.length && i10 < 5; i10++) {
            File file = listFiles[i10];
            try {
                if (file.isDirectory() && file.getName().endsWith(OperatorName.STROKING_COLOR_GRAY)) {
                    String name = file.getName();
                    C0050b c0050b2 = hashMap.get(name);
                    if (c0050b2 == null) {
                        c0050b2 = new C0050b(name);
                        hashMap.put(name, c0050b2);
                    }
                    c0050b2.c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.h.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
                com.apm.insight.l.h.a(file);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0.equals("launch") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0050b> r12, com.apm.insight.k.b.C0050b r13, java.io.File r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "G"
            boolean r0 = r15.endsWith(r0)
            if (r0 == 0) goto Lc2
            java.lang.String r0 = "_"
            java.lang.String[] r0 = r15.split(r0)
            int r1 = r0.length
            r2 = 5
            r3 = 0
            if (r1 >= r2) goto L1e
            java.util.List<com.apm.insight.k.b$a> r12 = r13.f6583b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r3)
            r12.add(r13)
            return
        L1e:
            r1 = 0
            r2 = r0[r1]     // Catch: java.lang.Throwable -> La3
            long r4 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> La3
            r2 = 4
            r2 = r0[r2]     // Catch: java.lang.Throwable -> La3
            long r6 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> La3
            r13 = 2
            r2 = r0[r13]
            r8 = 1
            r0 = r0[r8]
            r0.getClass()
            int r9 = r0.hashCode()
            r10 = -1
            switch(r9) {
                case -1109843021: goto L55;
                case 96741: goto L4a;
                case 3254818: goto L3f;
                default: goto L3d;
            }
        L3d:
            r1 = r10
            goto L5e
        L3f:
            java.lang.String r1 = "java"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L3d
        L48:
            r1 = r13
            goto L5e
        L4a:
            java.lang.String r13 = "anr"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L53
            goto L3d
        L53:
            r1 = r8
            goto L5e
        L55:
            java.lang.String r13 = "launch"
            boolean r13 = r0.equals(r13)
            if (r13 != 0) goto L5e
            goto L3d
        L5e:
            switch(r1) {
                case 0: goto L68;
                case 1: goto L65;
                case 2: goto L62;
                default: goto L61;
            }
        L61:
            goto L6a
        L62:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.JAVA
            goto L6a
        L65:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.ANR
            goto L6a
        L68:
            com.apm.insight.CrashType r3 = com.apm.insight.CrashType.LAUNCH
        L6a:
            java.lang.Object r13 = r12.get(r2)
            com.apm.insight.k.b$b r13 = (com.apm.insight.k.b.C0050b) r13
            if (r13 != 0) goto L7a
            com.apm.insight.k.b$b r13 = new com.apm.insight.k.b$b
            r13.<init>(r2)
            r12.put(r2, r13)
        L7a:
            com.apm.insight.k.b$a r12 = new com.apm.insight.k.b$a
            r12.<init>(r14, r4, r3)
            r12.c = r6
            com.apm.insight.k.b$a r14 = r13.f6584d
            if (r14 == 0) goto L8d
            long r0 = r14.f6579b
            long r4 = r12.f6579b
            int r14 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r14 <= 0) goto L9d
        L8d:
            if (r3 == 0) goto L9d
            com.apm.insight.CrashType r14 = com.apm.insight.CrashType.ANR
            if (r3 == r14) goto L9d
            java.lang.String r14 = "ignore"
            boolean r14 = r15.contains(r14)
            if (r14 != 0) goto L9d
            r13.f6584d = r12
        L9d:
            java.util.List<com.apm.insight.k.b$a> r13 = r13.f6583b
            r13.add(r12)
            goto Lc5
        La3:
            java.util.List<com.apm.insight.k.b$a> r12 = r13.f6583b
            com.apm.insight.k.b$a r13 = new com.apm.insight.k.b$a
            r13.<init>(r14, r3)
            r12.add(r13)
            com.apm.insight.d r12 = com.apm.insight.c.a()
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "err format crashTime:"
            java.lang.String r14 = r14.concat(r15)
            r13.<init>(r14)
            java.lang.String r14 = "NPTH_CATCH"
            r12.a(r14, r13)
            return
        Lc2:
            com.apm.insight.l.h.a(r14)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b, java.io.File, java.lang.String):void");
    }

    public void a(boolean z10) {
        if (!Npth.isStopUpload() && z10) {
            d();
            i();
            com.apm.insight.c.a.a();
        }
    }

    private boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }
}

package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.activity.r;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.Header;
import com.apm.insight.i;
import com.apm.insight.l.h;
import com.apm.insight.l.j;
import com.apm.insight.l.n;
import com.apm.insight.l.v;
import com.apm.insight.runtime.q;
import com.apm.insight.runtime.s;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f6672d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f6673a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f6674b = null;
    private b c;

    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader;
            String readLine;
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                try {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                    return "";
                } finally {
                    j.a(bufferedReader2);
                }
            }
            if (readLine == null) {
                j.a(bufferedReader);
                return "";
            } else if (readLine.startsWith("[FATAL:jni_android.cc") && readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                StringBuilder sb2 = new StringBuilder();
                int indexOf = readLine.indexOf(" ttwebview:");
                sb2.append("Caused by: ");
                sb2.append("Please include Java exception stack in crash report");
                sb2.append("\n");
                sb2.append(readLine.substring(indexOf + 11));
                while (true) {
                    sb2.append("\n");
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 != null) {
                        sb2.append(readLine2);
                    } else {
                        String sb3 = sb2.toString();
                        j.a(bufferedReader);
                        return sb3;
                    }
                }
            } else {
                j.a(bufferedReader);
                return "";
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: b  reason: collision with root package name */
        private final com.apm.insight.nativecrash.e f6676b;
        private final com.apm.insight.nativecrash.a c;

        /* renamed from: d  reason: collision with root package name */
        private final File f6677d;

        /* renamed from: e  reason: collision with root package name */
        private final File f6678e;

        public b(File file) {
            this.f6677d = file;
            this.f6678e = n.a(i.g(), file.getName());
            com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(file);
            this.c = aVar;
            com.apm.insight.nativecrash.e eVar = new com.apm.insight.nativecrash.e(file);
            this.f6676b = eVar;
            if (aVar.a() && eVar.a() == null) {
                eVar.a(file);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:4:0x0008, B:6:0x000e, B:11:0x001c), top: B:16:0x0008 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long a() {
            /*
                r3 = this;
                com.apm.insight.nativecrash.a r0 = r3.c
                java.util.Map r0 = r0.c()
                if (r0 == 0) goto L19
                boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto L19
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L17
                goto L1a
            L17:
                r0 = move-exception
                goto L21
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L2a
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L17
                return r0
            L21:
                com.apm.insight.d r1 = com.apm.insight.c.a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.a(r2, r0)
            L2a:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.b.a():long");
        }

        public File b() {
            return this.f6677d;
        }

        public boolean c() {
            return this.c.a();
        }
    }

    /* renamed from: com.apm.insight.nativecrash.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0051c extends e {
        public C0051c() {
            super();
            this.c = "Total FD Count:";
            this.f6681b = n.i(c.this.c.b());
            this.f6682d = ":";
            this.f6683e = -2;
        }
    }

    /* loaded from: classes.dex */
    public class d extends e {
        public d() {
            super();
            this.c = "VmSize:";
            this.f6681b = n.k(c.this.c.b());
            this.f6682d = "\\s+";
            this.f6683e = -1;
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: b  reason: collision with root package name */
        protected File f6681b;
        protected String c;

        /* renamed from: d  reason: collision with root package name */
        protected String f6682d;

        /* renamed from: e  reason: collision with root package name */
        protected int f6683e;

        public e() {
        }

        public int a() {
            int i10;
            Throwable th2;
            if (!this.f6681b.exists() || !this.f6681b.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f6681b));
                int i11 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i11 = a(readLine);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10 = i11;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a().a("NPTH_CATCH", th2);
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                j.a(bufferedReader);
                            }
                        }
                    }
                } while (i11 == -1);
                j.a(bufferedReader2);
                return i11;
            } catch (Throwable th4) {
                i10 = -1;
                th2 = th4;
            }
        }

        public int a(String str) {
            int i10 = this.f6683e;
            if (str.startsWith(this.c)) {
                try {
                    i10 = Integer.parseInt(str.split(this.f6682d)[1].trim());
                } catch (NumberFormatException e10) {
                    com.apm.insight.c.a().a("NPTH_CATCH", e10);
                }
                if (i10 < 0) {
                    return -2;
                }
                return i10;
            }
            return i10;
        }
    }

    /* loaded from: classes.dex */
    public class f extends e {
        public f() {
            super();
            this.c = "Total Threads Count:";
            this.f6681b = n.j(c.this.c.b());
            this.f6682d = ":";
            this.f6683e = -2;
        }
    }

    public c(Context context) {
        this.f6673a = context;
    }

    private void c(com.apm.insight.entity.a aVar) {
        Map<String, String> b10 = this.c.f6676b.b();
        if (b10.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : b10.keySet()) {
            String a10 = a(b10.get(str));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str);
                jSONObject.put("lib_uuid", a10);
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                com.apm.insight.c.a().a("NPTH_CATCH", e10);
            }
        }
        aVar.a("crash_lib_uuid", (Object) jSONArray);
    }

    private void f(com.apm.insight.entity.a aVar) {
        File a10 = n.a(this.c.b());
        if (a10.exists()) {
            try {
                aVar.a("native_log", (Object) h.b(h.a(a10.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
    }

    private void g(com.apm.insight.entity.a aVar) {
        BufferedReader bufferedReader;
        File h10 = n.h(this.c.b());
        if (!h10.exists()) {
            NativeImpl.a(h10.getAbsolutePath(), String.valueOf(i.i().getLogcatDumpCount()), String.valueOf(i.i().getLogcatLevel()));
        }
        JSONArray jSONArray = new JSONArray();
        String g10 = r.g(new StringBuilder(" "), this.c.c.c().get("pid"), " ");
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(h10));
        } catch (Throwable unused) {
        }
        try {
            if (h10.length() > 512000) {
                bufferedReader.skip(h10.length() - 512000);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if ((readLine.length() > 32 ? readLine.substring(0, 31) : readLine).contains(g10)) {
                    jSONArray.put(readLine);
                }
            }
            j.a(bufferedReader);
        } catch (Throwable unused2) {
            bufferedReader2 = bufferedReader;
            j.a(bufferedReader2);
            aVar.a("logcat", (Object) jSONArray);
        }
        aVar.a("logcat", (Object) jSONArray);
    }

    public static long i() {
        if (NativeImpl.e()) {
            return Long.MAX_VALUE;
        }
        if (Header.a()) {
            return 3891200L;
        }
        return 2867200L;
    }

    public static boolean m() {
        Boolean bool = f6672d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 11; i10++) {
            try {
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            if (new File(strArr[i10]).exists()) {
                f6672d = Boolean.TRUE;
                return true;
            }
            continue;
        }
        f6672d = Boolean.FALSE;
        return false;
    }

    private Header n() {
        Header header = new Header(this.f6673a);
        JSONObject a10 = s.a().a(this.c.a());
        if (a10 != null) {
            header.a(a10);
            header.d();
            header.e();
        }
        Header.b(header);
        return header;
    }

    private int o() {
        return new C0051c().a();
    }

    private int p() {
        return new f().a();
    }

    private int q() {
        return new d().a();
    }

    public String b() {
        b bVar = this.c;
        if (bVar != null) {
            String c = bVar.f6676b.c();
            return (c == null || c.isEmpty()) ? this.c.c.b() : c;
        }
        return null;
    }

    public JSONObject d() {
        File f10 = n.f(this.c.b());
        if (f10.exists()) {
            try {
                String c = h.c(f10.getAbsolutePath());
                if (c != null && !c.isEmpty()) {
                    return new JSONObject(c);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
            return null;
        }
        return null;
    }

    public void e() {
        try {
            File e10 = n.e(this.c.b());
            File file = new File(e10.getAbsolutePath() + ".tmp'");
            if (file.exists()) {
                file.delete();
            }
            int i10 = 0;
            if (e10.exists()) {
                while (i10 < com.apm.insight.nativecrash.b.a()) {
                    File file2 = new File(e10.getAbsolutePath() + '.' + i10);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    i10++;
                }
                return;
            }
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            for (int i11 = 0; i11 < com.apm.insight.nativecrash.b.a(); i11++) {
                File file3 = new File(e10.getAbsolutePath() + '.' + i11);
                if (file3.exists()) {
                    try {
                        String c = h.c(file3.getAbsolutePath());
                        if (!TextUtils.isEmpty(c)) {
                            JSONObject jSONObject = new JSONObject(c);
                            if (jSONObject.length() > 0) {
                                aVar.c(jSONObject);
                            }
                        }
                    } catch (JSONException e11) {
                        com.apm.insight.c.a().a("NPTH_CATCH", e11);
                    }
                }
            }
            JSONObject h10 = aVar.h();
            try {
                if (h10.length() != 0 && h10.opt("storage") == null) {
                    com.apm.insight.entity.a.a(h10, v.a(i.g()));
                }
            } catch (Throwable unused) {
            }
            if (h10.length() != 0) {
                this.f6674b = h10;
                h.b(file, h10, false);
                if (file.renameTo(e10)) {
                    while (i10 < com.apm.insight.nativecrash.b.a()) {
                        File file4 = new File(e10.getAbsolutePath() + '.' + i10);
                        if (file4.exists()) {
                            file4.delete();
                        }
                        i10++;
                    }
                }
            }
        } catch (IOException e12) {
            com.apm.insight.c.a().a("NPTH_CATCH", e12);
        }
    }

    public void h() {
        com.apm.insight.e.a.a().a(com.apm.insight.e.a.a.a(n.f(this.c.b()).getAbsolutePath()));
    }

    public JSONObject j() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            a(aVar);
            h(aVar);
            c(aVar);
            d(aVar);
            e(aVar);
            g(aVar);
            f(aVar);
            b(aVar);
            File f10 = n.f(this.c.b());
            JSONObject h10 = aVar.h();
            h.a(f10, h10, false);
            return h10;
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
            return null;
        }
    }

    public boolean k() {
        return h.a(this.c.b());
    }

    public void l() {
        try {
            String absolutePath = this.c.b().getAbsolutePath();
            h.c(absolutePath, Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + i.g().getPackageName() + PackagingURIHelper.FORWARD_SLASH_STRING + this.c.b().getName() + ".zip");
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
    }

    private String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb2.append(str);
            } else {
                sb2.append(str.charAt(6));
                sb2.append(str.charAt(7));
                sb2.append(str.charAt(4));
                sb2.append(str.charAt(5));
                sb2.append(str.charAt(2));
                sb2.append(str.charAt(3));
                sb2.append(str.charAt(0));
                sb2.append(str.charAt(1));
                sb2.append(str.charAt(10));
                sb2.append(str.charAt(11));
                sb2.append(str.charAt(8));
                sb2.append(str.charAt(9));
                sb2.append(str.charAt(14));
                sb2.append(str.charAt(15));
                sb2.append(str.charAt(12));
                sb2.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb2.append((CharSequence) str, 16, 32);
                    sb2.append('0');
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
        return sb2.toString().toUpperCase();
    }

    private void b(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.d.b(aVar.h());
        HashMap hashMap = new HashMap();
        if (m()) {
            hashMap.put("is_root", "true");
            aVar.a("is_root", "true");
        } else {
            hashMap.put("is_root", "false");
            aVar.a("is_root", "false");
        }
        a(hashMap);
        int o10 = o();
        if (o10 > 0) {
            if (o10 > 960) {
                hashMap.put("fd_leak", "true");
            } else {
                hashMap.put("fd_leak", "false");
            }
            aVar.a("fd_count", Integer.valueOf(o10));
        }
        int p10 = p();
        if (p10 > 0) {
            if (p10 > 350) {
                hashMap.put("threads_leak", "true");
            } else {
                hashMap.put("threads_leak", "false");
            }
            aVar.a("threads_count", Integer.valueOf(p10));
        }
        int q5 = q();
        if (q5 > 0) {
            if (q5 > i()) {
                hashMap.put("memory_leak", "true");
            } else {
                hashMap.put("memory_leak", "false");
            }
            aVar.a("memory_size", Integer.valueOf(q5));
        }
        hashMap.put("sdk_version", "1.3.8.nourl-alpha.22");
        hashMap.put("has_java_stack", String.valueOf(aVar.h().opt("java_data") != null));
        JSONArray a10 = com.apm.insight.nativecrash.d.a(n.l(this.c.f6677d), n.m(this.c.f6677d));
        hashMap.put("leak_threads_count", String.valueOf(a10.length()));
        if (a10.length() > 0) {
            try {
                h.a(n.n(this.c.f6677d), a10, false);
            } catch (Throwable unused) {
            }
        }
        aVar.b();
        aVar.c();
        aVar.c(hashMap);
    }

    private void d(com.apm.insight.entity.a aVar) {
        File e10 = n.e(this.c.b());
        if (!e10.exists() && this.f6674b == null) {
            aVar.b(v.a(i.g()));
            aVar.a("has_callback", "false");
            return;
        }
        try {
            JSONObject jSONObject = this.f6674b;
            if (jSONObject == null) {
                jSONObject = new JSONObject(h.c(e10.getAbsolutePath()));
            }
            aVar.c(jSONObject);
            aVar.a("has_callback", "true");
            if (aVar.h().opt("storage") == null) {
                aVar.b(v.a(i.g()));
            }
            com.apm.insight.l.r.a(aVar, aVar.i(), CrashType.NATIVE);
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
        long j10 = -1;
        long optLong = aVar.h().optLong("crash_time", -1L);
        long optLong2 = aVar.h().optLong("java_end", -1L);
        if (optLong2 != -1 && optLong != -1) {
            j10 = optLong2 - optLong;
        }
        try {
            aVar.b("total_cost", String.valueOf(j10));
            aVar.a("total_cost", String.valueOf(j10 / 1000));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:15:0x0047, B:17:0x004d), top: B:22:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.apm.insight.entity.a r5) {
        /*
            r4 = this;
            com.apm.insight.nativecrash.c$b r0 = r4.c
            java.io.File r0 = r0.b()
            java.io.File r0 = com.apm.insight.l.n.g(r0)
            boolean r1 = r0.exists()
            java.lang.String r2 = "NPTH_CATCH"
            if (r1 == 0) goto L23
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = com.apm.insight.l.u.a(r0)     // Catch: java.lang.Throwable -> L1b
            goto L25
        L1b:
            r0 = move-exception
            com.apm.insight.d r1 = com.apm.insight.c.a()
            r1.a(r2, r0)
        L23:
            java.lang.String r0 = ""
        L25:
            com.apm.insight.nativecrash.c$b r1 = r4.c
            java.io.File r1 = r1.b()
            java.io.File r1 = com.apm.insight.l.n.o(r1)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L47
            java.lang.String r1 = com.apm.insight.nativecrash.c.a.a(r1)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L46
            java.lang.String r3 = "\n"
            java.lang.String r0 = androidx.activity.f.m(r0, r3, r1)
            goto L47
        L46:
            r0 = r1
        L47:
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L5b
            java.lang.String r1 = "java_data"
            r5.a(r1, r0)     // Catch: java.lang.Throwable -> L53
            goto L5b
        L53:
            r5 = move-exception
            com.apm.insight.d r0 = com.apm.insight.c.a()
            r0.a(r2, r5)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.e(com.apm.insight.entity.a):void");
    }

    private void h(com.apm.insight.entity.a aVar) {
        Map<String, String> a10 = a();
        if (a10 == null || aVar == null) {
            return;
        }
        String str = a10.get("process_name");
        if (str != null) {
            aVar.a("process_name", (Object) str);
        }
        String str2 = a10.get("start_time");
        if (str2 != null) {
            try {
                aVar.a(Long.decode(str2).longValue());
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        String str3 = a10.get("pid");
        if (str3 != null) {
            try {
                aVar.a("pid", Long.decode(str3));
            } catch (Throwable th3) {
                com.apm.insight.c.a().a("NPTH_CATCH", th3);
            }
        }
        String str4 = a10.get("crash_thread_name");
        if (str4 != null) {
            aVar.a("crash_thread_name", (Object) str4);
        }
        String str5 = a10.get("crash_time");
        if (str5 != null) {
            try {
                aVar.a("crash_time", Long.decode(str5));
            } catch (Throwable th4) {
                com.apm.insight.c.a().a("NPTH_CATCH", th4);
            }
        }
        aVar.a("data", (Object) b());
    }

    public boolean c() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    public boolean f() {
        ICrashFilter b10 = i.b().b();
        if (b10 != null) {
            try {
                return b10.onNativeCrashFilter(b(), "");
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
                return true;
            }
        }
        return true;
    }

    public Map<String, String> a() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c.c();
        }
        return null;
    }

    private void a(com.apm.insight.entity.a aVar) {
        aVar.a(n());
        aVar.a("is_native_crash", (Object) 1);
        aVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
        aVar.a("crash_uuid", (Object) this.c.b().getName());
        aVar.a("jiffy", Long.valueOf(q.a.a()));
    }

    public void a(File file) {
        this.c = new b(file);
    }

    private void a(Map<String, String> map) {
        map.put("has_fds_file", n.i(this.c.b()).exists() ? "true" : "false");
        File h10 = n.h(this.c.b());
        map.put("has_logcat_file", (!h10.exists() || h10.length() <= 128) ? "false" : "true");
        map.put("has_maps_file", n.d(this.c.b()).exists() ? "true" : "false");
        map.put("has_tombstone_file", n.b(this.c.b()).exists() ? "true" : "false");
        map.put("has_meminfo_file", n.k(this.c.b()).exists() ? "true" : "false");
        map.put("has_threads_file", n.j(this.c.b()).exists() ? "true" : "false");
    }

    public boolean g() {
        return com.apm.insight.e.a.a().a(n.f(this.c.b()).getAbsolutePath());
    }
}

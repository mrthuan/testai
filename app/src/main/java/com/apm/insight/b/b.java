package com.apm.insight.b;

import android.content.Context;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.CrashConfig;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f6330a = true;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f6331f;
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f6333d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f6334e;

    /* renamed from: j  reason: collision with root package name */
    private JSONObject f6338j;

    /* renamed from: k  reason: collision with root package name */
    private JSONObject f6339k;

    /* renamed from: p  reason: collision with root package name */
    private JSONArray f6344p;

    /* renamed from: q  reason: collision with root package name */
    private JSONObject f6345q;

    /* renamed from: t  reason: collision with root package name */
    private JSONArray f6348t;

    /* renamed from: u  reason: collision with root package name */
    private JSONArray f6349u;

    /* renamed from: v  reason: collision with root package name */
    private JSONObject f6350v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6351w;

    /* renamed from: y  reason: collision with root package name */
    private volatile boolean f6353y;

    /* renamed from: g  reason: collision with root package name */
    private long f6335g = -1;

    /* renamed from: h  reason: collision with root package name */
    private File f6336h = null;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6337i = true;

    /* renamed from: l  reason: collision with root package name */
    private String f6340l = "unknown";

    /* renamed from: m  reason: collision with root package name */
    private String f6341m = "unknown";

    /* renamed from: n  reason: collision with root package name */
    private String f6342n = "unknown";

    /* renamed from: o  reason: collision with root package name */
    private String f6343o = "npth_inner_default";

    /* renamed from: r  reason: collision with root package name */
    private int f6346r = 0;

    /* renamed from: s  reason: collision with root package name */
    private long f6347s = -1;

    /* renamed from: x  reason: collision with root package name */
    private final Object f6352x = new Object();

    /* renamed from: z  reason: collision with root package name */
    private long f6354z = -1;
    private long A = 0;
    private final Runnable B = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.a(200, 25);
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
    };
    private int C = 0;
    private List<Pattern> D = null;

    /* renamed from: b  reason: collision with root package name */
    Pattern f6332b = null;
    private File E = null;

    public b(Context context) {
        this.f6333d = context;
    }

    private static String a(float f10) {
        return f10 <= 0.0f ? "0%" : f10 <= 0.1f ? "0% - 10%" : f10 <= 0.3f ? "10% - 30%" : f10 <= 0.6f ? "30% - 60%" : f10 <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String b(float f10) {
        return a(f10 / 100.0f);
    }

    private String c(long j10) {
        long j11 = j10 - com.apm.insight.i.j();
        return j11 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL ? "0 - 30s" : j11 < 60000 ? "30s - 1min" : j11 < 120000 ? "1min - 2min" : j11 < 300000 ? "2min - 5min" : j11 < TTAdConstant.AD_MAX_EVENT_TIME ? "5min - 10min" : j11 < 1800000 ? "10min - 30min" : j11 < 3600000 ? "30min - 1h" : "1h - ";
    }

    private boolean g() {
        boolean z10 = !com.apm.insight.l.a.a(this.f6333d);
        if (z10 && com.apm.insight.runtime.a.b.d().e() <= 2000) {
            return false;
        }
        return z10;
    }

    private File h() {
        if (this.E == null) {
            File filesDir = this.f6333d.getFilesDir();
            this.E = new File(filesDir, "has_anr_signal_" + com.apm.insight.l.a.c(this.f6333d).replaceAll(":", "_"));
        }
        return this.E;
    }

    private boolean i() {
        return com.apm.insight.runtime.a.i();
    }

    public void d() {
        if (f6331f) {
            return;
        }
        synchronized (this.f6352x) {
            if (f6331f) {
                return;
            }
            this.B.run();
        }
    }

    public void e() {
        if (NativeImpl.g()) {
            try {
                com.apm.insight.l.h.a(h(), String.valueOf(this.C + 1), false);
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        this.f6354z = SystemClock.uptimeMillis();
        this.f6353y = true;
    }

    public void f() {
        File h10 = h();
        try {
            int intValue = Integer.decode(com.apm.insight.l.h.c(h10.getAbsolutePath())).intValue();
            this.C = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.h.a(h10);
        }
    }

    private static String a(float f10, float f11) {
        return f11 > 0.0f ? a(f10 / f11) : f10 > 0.0f ? "100%" : "0%";
    }

    private JSONObject c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a10 = com.apm.insight.l.k.a(256, 128, jSONArray);
        if (a10.length() != jSONArray.length()) {
            this.f6346r++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < a10.length(); i10++) {
                sb2.append(a10.getString(i10));
                sb2.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb2.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void b() {
        if (this.f6334e) {
            this.f6334e = false;
            c cVar = this.c;
            if (cVar != null) {
                cVar.b();
            }
            this.c = null;
        }
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray a10 = com.apm.insight.l.k.a(256, 128, jSONArray);
        if (a10.length() != jSONArray.length()) {
            this.f6346r++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", a10);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private void b(long j10) {
        if (this.A != this.f6354z) {
            try {
                this.f6347s = System.currentTimeMillis();
                this.f6349u = g.b().c();
                this.f6348t = k.a(100, j10);
                this.f6339k = g.b().a(j10).a();
                JSONObject jSONObject = new JSONObject();
                this.f6350v = jSONObject;
                com.apm.insight.l.a.a(this.f6333d, jSONObject);
                this.f6351w = g();
                this.f6337i = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f6335g = this.f6347s;
                String b10 = n.b();
                File file = new File(n.f(this.f6333d), b10);
                File file2 = new File(file, "trace_" + com.apm.insight.l.a.c(this.f6333d).replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.h.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                r.a("anr_trace", b10);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray b11 = com.apm.insight.l.h.b(file2.getAbsolutePath());
                    this.f6344p = b11;
                    a(b11);
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
                if (this.f6338j == null) {
                    this.f6338j = d.a(true);
                }
            } catch (Throwable th3) {
                com.apm.insight.c.a().a("NPTH_CATCH", th3);
            }
            com.apm.insight.l.f.a();
        } else {
            try {
                this.f6335g = this.f6347s;
                String b12 = n.b();
                File file3 = new File(n.f(this.f6333d), b12);
                File file4 = new File(file3, "trace" + com.apm.insight.l.a.c(this.f6333d).replace(':', '_') + ".txt");
                file4.getParentFile().mkdirs();
                com.apm.insight.l.h.a(file4, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                r.a("anr_trace", b12);
                NativeImpl.i(file4.getAbsolutePath());
                try {
                    JSONArray b13 = com.apm.insight.l.h.b(file4.getAbsolutePath());
                    this.f6344p = b13;
                    a(b13);
                } catch (IOException unused3) {
                } catch (Throwable th4) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th4);
                }
                if (this.f6338j == null) {
                    this.f6338j = d.a(true);
                }
            } catch (Throwable th5) {
                com.apm.insight.c.a().a("NPTH_CATCH", th5);
            }
        }
        long j11 = this.f6354z;
        this.A = j11;
        this.f6354z = -1L;
        if (j11 == -1) {
            this.A = (-1) - 1;
        }
    }

    public void c() {
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : o.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
    }

    public void a() {
        if (this.f6334e) {
            return;
        }
        this.c = new c(this);
        this.f6335g = com.apm.insight.i.j();
        this.f6334e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f0, code lost:
        if (r7 != 5) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a0 A[LOOP:2: B:101:0x01da->B:157:0x02a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b7 A[EDGE_INSN: B:237:0x03b7->B:207:0x03b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x039f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0395 A[EDGE_INSN: B:240:0x0395->B:199:0x0395 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r26, org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(java.lang.String, org.json.JSONObject):void");
    }

    private int[] b(JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String optString = jSONArray.optString(i10);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.f6332b == null) {
                    this.f6332b = Pattern.compile("[^0-9]+");
                }
                String[] split = this.f6332b.split(optString.substring(indexOf));
                if (split == null || split.length < 2) {
                    return null;
                }
                int intValue = Integer.decode(split[1]).intValue();
                int intValue2 = Integer.decode(split[2]).intValue();
                return new int[]{intValue, intValue2, intValue + intValue2};
            }
        }
        return null;
    }

    private static void a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) {
        String str2;
        String a10;
        String h10 = a0.a.h("npth_anr_", str);
        if (hashMap.isEmpty()) {
            str2 = a6.h.c(h10, "_total");
            a10 = "not found";
        } else {
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                if (key.endsWith("user")) {
                    f10 += entry.getValue().floatValue();
                } else if (key.endsWith("kernel")) {
                    f11 += entry.getValue().floatValue();
                } else if (key.endsWith("iowait")) {
                    f12 += entry.getValue().floatValue();
                } else if (key.endsWith("irq")) {
                    f13 += entry.getValue().floatValue();
                } else if (key.endsWith("softirq")) {
                    f14 += entry.getValue().floatValue();
                }
            }
            float f15 = f10 + f11 + f12 + f13 + f14;
            jSONObject.put(a6.h.c(h10, "_total"), b(f15));
            jSONObject.put(h10 + "_kernel_user_ratio", a(f11, f15));
            str2 = h10 + "_iowait_user_ratio";
            a10 = a(f12, f15);
        }
        jSONObject.put(str2, a10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0171, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(org.json.JSONArray r15) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(org.json.JSONArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03df A[Catch: all -> 0x0483, TRY_ENTER, TryCatch #3 {all -> 0x0483, blocks: (B:77:0x017f, B:81:0x01fc, B:83:0x0201, B:86:0x020a, B:88:0x020e, B:90:0x0214, B:92:0x021c, B:126:0x03df, B:127:0x0408, B:129:0x040c, B:130:0x0412, B:137:0x0467, B:91:0x021a), top: B:153:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0408 A[Catch: all -> 0x0483, TryCatch #3 {all -> 0x0483, blocks: (B:77:0x017f, B:81:0x01fc, B:83:0x0201, B:86:0x020a, B:88:0x020e, B:90:0x0214, B:92:0x021c, B:126:0x03df, B:127:0x0408, B:129:0x040c, B:130:0x0412, B:137:0x0467, B:91:0x021a), top: B:153:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.b.b.a(int, int):boolean");
    }

    private boolean a(long j10) {
        if (this.f6353y) {
            this.f6353y = false;
            b(j10);
        }
        return false;
    }

    private boolean a(String str) {
        if (this.D == null) {
            JSONArray c = com.apm.insight.runtime.a.c();
            if (c != null) {
                this.D = new LinkedList();
                this.f6343o = c.optString(0);
                for (int i10 = 1; i10 < c.length(); i10++) {
                    try {
                        this.D.add(Pattern.compile(c.optString(i10)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.D == null) {
                LinkedList linkedList = new LinkedList();
                this.D = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.D.add(Pattern.compile("^default_npth_thread$"));
                this.D.add(Pattern.compile("^RenderThread$"));
                this.D.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        for (Pattern pattern : this.D) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}

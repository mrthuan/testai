package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.t;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Context f6525a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Application f6526b = null;
    private static long c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static String f6527d = "default";

    /* renamed from: e  reason: collision with root package name */
    private static boolean f6528e = false;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f  reason: collision with root package name */
    private static com.apm.insight.runtime.d f6529f;

    /* renamed from: i  reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f6532i;

    /* renamed from: n  reason: collision with root package name */
    private static volatile String f6537n;

    /* renamed from: g  reason: collision with root package name */
    private static ConfigManager f6530g = new ConfigManager();

    /* renamed from: h  reason: collision with root package name */
    private static a f6531h = new a();

    /* renamed from: j  reason: collision with root package name */
    private static t f6533j = null;

    /* renamed from: k  reason: collision with root package name */
    private static volatile String f6534k = null;

    /* renamed from: l  reason: collision with root package name */
    private static Object f6535l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private static volatile int f6536m = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f6538o = 0;

    /* renamed from: p  reason: collision with root package name */
    private static boolean f6539p = true;

    /* renamed from: q  reason: collision with root package name */
    private static boolean f6540q = true;

    /* renamed from: r  reason: collision with root package name */
    private static boolean f6541r = false;

    /* renamed from: s  reason: collision with root package name */
    private static boolean f6542s = true;

    public static com.apm.insight.runtime.d a() {
        if (f6529f == null) {
            f6529f = com.apm.insight.runtime.i.a(f6525a);
        }
        return f6529f;
    }

    public static a b() {
        return f6531h;
    }

    public static t c() {
        if (f6533j == null) {
            synchronized (i.class) {
                f6533j = new t(f6525a);
            }
        }
        return f6533j;
    }

    public static void d(boolean z10) {
        f6541r = z10;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + OperatorName.STROKING_COLOR_GRAY;
    }

    public static String f() {
        if (f6534k == null) {
            synchronized (f6535l) {
                if (f6534k == null) {
                    f6534k = Long.toHexString(new Random().nextLong()) + PDBorderStyleDictionary.STYLE_UNDERLINE;
                }
            }
        }
        return f6534k;
    }

    public static Context g() {
        return f6525a;
    }

    public static Application h() {
        return f6526b;
    }

    public static ConfigManager i() {
        return f6530g;
    }

    public static long j() {
        return c;
    }

    public static String k() {
        return f6527d;
    }

    public static int l() {
        return f6538o;
    }

    public static boolean m() {
        return f6528e;
    }

    public static String n() {
        Object obj = a().a().get("channel");
        if (obj == null) {
            return "unknown";
        }
        return String.valueOf(obj);
    }

    public static ConcurrentHashMap<Integer, String> o() {
        return f6532i;
    }

    public static int p() {
        return f6536m;
    }

    public static String q() {
        return f6537n;
    }

    public static boolean r() {
        return f6539p;
    }

    public static boolean s() {
        return f6540q;
    }

    public static boolean t() {
        return f6541r;
    }

    public static boolean u() {
        return f6542s;
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(j());
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(OperatorName.STROKING_COLOR_GRAY);
        return sb2.toString();
    }

    public static void b(int i10, String str) {
        f6536m = i10;
        f6537n = str;
    }

    public static void c(boolean z10) {
        f6540q = z10;
    }

    public static boolean d() {
        return i().isDebugMode() && n().contains("local_test");
    }

    public static void e(boolean z10) {
        f6542s = z10;
    }

    public static void a(int i10) {
        f6538o = i10;
    }

    public static void b(boolean z10) {
        f6539p = z10;
    }

    public static void a(int i10, String str) {
        if (f6532i == null) {
            synchronized (i.class) {
                if (f6532i == null) {
                    f6532i = new ConcurrentHashMap<>();
                }
            }
        }
        f6532i.put(Integer.valueOf(i10), str);
    }

    public static void a(Application application) {
        if (application != null) {
            f6526b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f6526b == null) {
            c = System.currentTimeMillis();
            f6525a = context;
            f6526b = application;
            f6534k = Long.toHexString(new Random().nextLong()) + OperatorName.STROKING_COLOR_GRAY;
        }
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f6529f = new com.apm.insight.runtime.d(f6525a, iCommonParams, a());
    }

    public static void a(com.apm.insight.runtime.d dVar) {
        f6529f = dVar;
    }

    public static void a(String str) {
        f6527d = str;
    }

    public static void a(boolean z10) {
        f6528e = z10;
    }
}

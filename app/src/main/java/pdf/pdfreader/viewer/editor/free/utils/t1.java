package pdf.pdfreader.viewer.editor.free.utils;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k5.a;
import p5.a;

/* compiled from: XLogToFileUtils.java */
/* loaded from: classes3.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28779a = false;

    public static void a() {
        ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
        File file = new File(a6.h.c(v.C(ea.a.p("UHIqc2g=", "EYv4mela")), "/crash.log"));
        if (!f28779a || !file.exists()) {
            a.C0263a c0263a = new a.C0263a();
            c0263a.f19587a = OperatorName.SET_FLATNESS;
            if (c0263a.f19588b == null) {
                Map<Class<?>, Object> map = m5.a.f21819a;
                c0263a.f19588b = new com.google.android.play.core.assetpacks.b1();
            }
            if (c0263a.c == null) {
                Map<Class<?>, Object> map2 = m5.a.f21819a;
                c0263a.c = new com.google.android.play.core.assetpacks.c();
            }
            if (c0263a.f19589d == null) {
                Map<Class<?>, Object> map3 = m5.a.f21819a;
                c0263a.f19589d = new aj.b(0);
            }
            if (c0263a.f19590e == null) {
                Map<Class<?>, Object> map4 = m5.a.f21819a;
                c0263a.f19590e = new ge.a(3);
            }
            if (c0263a.f19591f == null) {
                Map<Class<?>, Object> map5 = m5.a.f21819a;
                c0263a.f19591f = new z3.c(4);
            }
            if (c0263a.f19592g == null) {
                Map<Class<?>, Object> map6 = m5.a.f21819a;
                c0263a.f19592g = new ge.a(2);
            }
            if (c0263a.f19593h == null) {
                c0263a.f19593h = new HashMap(m5.a.f21819a);
            }
            k5.a aVar = new k5.a(c0263a);
            a.C0325a c0325a = new a.C0325a(v.C(ea.a.p("UHIqc2g=", "EYv4mela")));
            c0325a.f23713b = new a();
            c0325a.f23714d = new ea.a();
            c0325a.f23715e = new l5.b();
            if (c0325a.f23713b == null) {
                Map<Class<?>, Object> map7 = m5.a.f21819a;
                c0325a.f23713b = new s5.a("log");
            }
            if (c0325a.c == null) {
                Map<Class<?>, Object> map8 = m5.a.f21819a;
                c0325a.c = new t0();
            }
            if (c0325a.f23714d == null) {
                Map<Class<?>, Object> map9 = m5.a.f21819a;
                c0325a.f23714d = new aj.b(0);
            }
            o5.a[] aVarArr = {new p5.a(c0325a)};
            if (k5.d.f19601b) {
                m5.b.f21820a.b();
            }
            k5.d.f19601b = true;
            k5.d.f19600a = new k5.c(aVar, new g3.b(aVarArr));
            ge.a.f17758i = new u0.a(12);
        }
        f28779a = true;
    }

    public static synchronized void b(String str) {
        synchronized (t1.class) {
            try {
                a();
                k5.d.a(str);
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static synchronized void c(String str, Throwable th2) {
        synchronized (t1.class) {
            try {
                a();
                k5.d.b(str, th2);
            } catch (Error | Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: XLogToFileUtils.java */
    /* loaded from: classes3.dex */
    public class a implements s5.b {
        @Override // s5.b
        public final String a() {
            return ea.a.p("D3IwcwcuVW9n", "kblQo9Vq");
        }

        @Override // s5.b
        public final void b() {
        }
    }
}

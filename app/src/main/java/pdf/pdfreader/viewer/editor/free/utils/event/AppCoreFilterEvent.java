package pdf.pdfreader.viewer.editor.free.utils.event;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import tf.c;

/* compiled from: AppCoreFilterEvent.kt */
/* loaded from: classes3.dex */
public final class AppCoreFilterEvent {

    /* renamed from: a  reason: collision with root package name */
    public static AppOpenSource f28650a = AppOpenSource.Desk;

    /* renamed from: b  reason: collision with root package name */
    public static final c f28651b = a.a(new cg.a<Context>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent$applicationContext$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Context invoke() {
            return ReaderPdfApplication.m();
        }
    });
    public static final ConcurrentHashMap<String, Boolean> c = new ConcurrentHashMap<>();

    public static void a(String... strArr) {
        for (String str : strArr) {
            c.put(str, Boolean.FALSE);
        }
    }

    public static void b() {
        a(ea.a.p("Wm0sMgNfA2Rq", "rA0NCodr"), ea.a.p("IG0dMjhfV28mdgNy", "siIzH4HX"), ea.a.p("Wm0sMgNfEWgddw==", "VmWxQM0P"));
    }

    public static void c() {
        a(ea.a.p("XGM5XxBhD2UAYWt2AGV3", "xZScD4dV"), ea.a.p("IGNDXxhkXV8saS93", "1TwibjIY"), ea.a.p("BmMmXzVlAXUkdDl2XWV3", "9GiTGrlx"));
        d();
    }

    public static void d() {
        a(ea.a.p("IGNDXwlhUGUFcy9sEGMcX0NpC3c=", "tdvw3u42"), ea.a.p("IGNDXwlhUGUFYSZ0EHI3dlxldw==", "rddu1Z3c"), ea.a.p("XGM5XwNhBWUtclFzHGwiXzJpV3c=", "n7LSR11Q"));
    }

    public static void e() {
        a(ea.a.p("PzJGXw9pUnc=", "ufnLOylO"));
    }

    public static void f() {
        a(ea.a.p("OzI4XzlpMnc=", "XMLHOWwW"));
    }

    public static void g(String str) {
        Context context = (Context) f28651b.getValue();
        String p10 = ea.a.p("LG9DZSZmQm40ZWw=", "xttPCvxm");
        boolean z10 = tn.a.f30064a;
        if (context != null && !TextUtils.isEmpty(p10) && !TextUtils.isEmpty(str)) {
            tn.a.d(context, p10, str, "", true);
        }
    }

    public static void h(String str) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = c;
        Boolean bool = concurrentHashMap.get(str);
        Boolean bool2 = Boolean.TRUE;
        if (!g.a(bool, bool2)) {
            g(str);
            concurrentHashMap.put(str, bool2);
        }
    }

    public static void i(AppOpenSource appOpenSource) {
        g.e(appOpenSource, "<set-?>");
        f28650a = appOpenSource;
    }
}

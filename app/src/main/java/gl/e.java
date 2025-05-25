package gl;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: HomeListBanner.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static a f17920d;

    /* renamed from: b  reason: collision with root package name */
    public static final String f17919b = ea.a.p("e28mZT9pEXQwYVpuDHIXfAxvX2UKaTB0L2E9biJyQg==", "mSGXr2dm");

    /* renamed from: a  reason: collision with root package name */
    public static final e f17918a = new e();
    public static String c = "";

    public static void a(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        f.f17921p.b(activity);
        g.f17922p.b(activity);
    }

    public static Bitmap b() {
        String str = c;
        f fVar = f.f17921p;
        if (kotlin.jvm.internal.g.a(str, fVar.f())) {
            return fVar.f24015o;
        }
        g gVar = g.f17922p;
        if (kotlin.jvm.internal.g.a(str, gVar.f())) {
            return gVar.f24015o;
        }
        return null;
    }

    public static boolean c() {
        String str = c;
        f fVar = f.f17921p;
        if (kotlin.jvm.internal.g.a(str, fVar.f())) {
            return fVar.g();
        }
        g gVar = g.f17922p;
        if (kotlin.jvm.internal.g.a(str, gVar.f())) {
            return gVar.g();
        }
        return false;
    }

    public static void d() {
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmgqbQBMPnMSQi1uNmU9IF1vGGQ=", "XPedWfLX");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            return;
        }
        String p11 = ea.a.p("W28mZT9pEXQwYVpuDHJ2dDZpVWcjcmNmXnUudCRyQWxcYWQ=", "2ZAaWRS8");
        int i11 = zk.a.f32399a;
        t1.b(p11);
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.a(f17919b);
        }
    }

    public static boolean e() {
        f fVar = f.f17921p;
        if ((fVar.f24010j && !g.f17922p.g()) || (g.f17922p.f24010j && !fVar.g())) {
            return true;
        }
        return false;
    }

    public static void f(String str) {
        c = str;
        f fVar = f.f17921p;
        if (TextUtils.equals(fVar.f(), str)) {
            for (n nVar : fVar.e()) {
                nVar.e();
            }
            return;
        }
        g gVar = g.f17922p;
        if (TextUtils.equals(gVar.f(), str)) {
            for (n nVar2 : gVar.e()) {
                nVar2.e();
            }
        }
    }
}

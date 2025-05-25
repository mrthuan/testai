package gl;

import android.app.Activity;
import android.widget.LinearLayout;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: HomeBottomBanner.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f17915b = ea.a.p("J29cZTtvQ3Q1bQhhG24NcnR8Bm8oZSdvGXQXbQxhGG4qckI=", "IduXmxNv");

    /* renamed from: a  reason: collision with root package name */
    public static final b f17914a = new b();

    public static void a(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        c.f17916o.e(activity);
        d.f17917o.e(activity);
    }

    public static void b() {
        String p10 = ea.a.p("W28mZTFvFnQdbXZhB24zcmR0QGkhZyZyFWZYdR10NnITci5mAWURaA==", "54iSzSkA");
        int i10 = zk.a.f32399a;
        t1.b(p10);
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.a(ea.a.p("PWVCdRRld2g1bS9CGnQcb1hCD24rZRdBPWgWbSxCO3Q7b1xCGG5ZZShC", "JN8KAyIT"));
        }
    }

    public static void c(String str, LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        c cVar = c.f17916o;
        if (kotlin.jvm.internal.g.a(str, cVar.i())) {
            cVar.p(linearLayout);
            return;
        }
        d dVar = d.f17917o;
        if (kotlin.jvm.internal.g.a(str, dVar.i())) {
            dVar.p(linearLayout);
        }
    }
}

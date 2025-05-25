package gl;

import android.app.Activity;
import android.widget.LinearLayout;
import com.lib.flutter.encrypt.EngineHelper;
import java.util.LinkedHashMap;

/* compiled from: Image2PDFConvertBanner.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final String f17928b = ea.a.p("Jm1QZxwyZ0QcQyVuA2UadHdhAG4gciR8G20LZw8yZEQJQ15uD2VFdBhhJG4QckI=", "YwBPrjj4");

    /* renamed from: a  reason: collision with root package name */
    public static final k f17927a = new k();

    public static void a(Activity activity, LinearLayout linearLayout, com.lib.flutter.encrypt.e listener) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(listener, "listener");
        if (linearLayout == null) {
            return;
        }
        EngineHelper.f15726a.getClass();
        LinkedHashMap linkedHashMap = EngineHelper.f15732h;
        String str = f17928b;
        if (!kotlin.jvm.internal.g.a((com.lib.flutter.encrypt.e) linkedHashMap.get(str), listener)) {
            EngineHelper.h(str, listener);
            d(activity, linearLayout);
        }
    }

    public static void b(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        l.f17929o.e(activity);
        m.f17930o.e(activity);
    }

    public static boolean c() {
        if (!l.f17929o.j() && !m.f17930o.j()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.app.Activity r3, android.widget.LinearLayout r4) {
        /*
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g.e(r3, r0)
            java.lang.String r0 = "adLayout"
            kotlin.jvm.internal.g.e(r4, r0)
            pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl r0 = pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl.c
            boolean r0 = r0.w()
            if (r0 == 0) goto L20
            java.lang.String r3 = "Q3IubRp1DyAHc1FyRSAlay1wEmkrYSRlXFAWRnNvBnZWcj9CEm4MZQAgWG8IZA=="
            java.lang.String r4 = "nR0hvkEm"
            java.lang.String r3 = ea.a.p(r3, r4)
            int r4 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r3)
            return
        L20:
            android.content.Context r0 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m()
            java.lang.String r1 = "VGU_SR1zFmEcY1EoKQ=="
            java.lang.String r2 = "JXlabwZw"
            java.lang.String r1 = ea.a.p(r1, r2)
            kotlin.jvm.internal.g.d(r0, r1)
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.c1.F(r0)
            if (r0 != 0) goto L43
            java.lang.String r3 = "Jm1QZxwyZ0QcQyVuA2UadHdhAG4gckVzPWkCIANkV2wgYWQ="
            java.lang.String r4 = "kXXGVrbw"
            java.lang.String r3 = ea.a.p(r3, r4)
            int r4 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r3)
            return
        L43:
            boolean r0 = ge.h.a(r3)
            if (r0 != 0) goto L5d
            boolean r0 = c()
            if (r0 != 0) goto L5d
            java.lang.String r3 = "LG9fdhxyQyA4YSRuEHJIc15pHiApbwRkWiAAZS53AXIkIFRyC29y"
            java.lang.String r4 = "Jv2hvnZn"
            java.lang.String r3 = ea.a.p(r3, r4)
            int r4 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r3)
            return
        L5d:
            gl.l r0 = gl.l.f17929o
            boolean r1 = r0.f23997k
            r2 = 0
            if (r1 != 0) goto L6a
            boolean r0 = r0.j()
            if (r0 != 0) goto L77
        L6a:
            gl.m r0 = gl.m.f17930o
            boolean r1 = r0.f23997k
            if (r1 != 0) goto L79
            boolean r0 = r0.j()
            if (r0 != 0) goto L77
            goto L79
        L77:
            r0 = r2
            goto L7a
        L79:
            r0 = 1
        L7a:
            if (r0 == 0) goto L9f
            boolean r3 = androidx.activity.s.x(r3)
            if (r3 != 0) goto L9f
            android.content.Context r3 = r4.getContext()
            java.lang.String r0 = "LmR9YQBvQnR0YyVuAWUQdA=="
            java.lang.String r1 = "ZoM4WI1i"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.d(r3, r0)
            pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation r0 = new pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation
            r0.<init>(r3, r2)
            r4.removeAllViews()
            r4.addView(r0)
            r0.r()
        L9f:
            java.lang.String r3 = "Wm0qZxYyMkQ0Q1tuH2UkdAZhXG4jcmN0AWkSZzZyaGZfdT90FnJCbB1hZA=="
            java.lang.String r4 = "suSHjvB8"
            java.lang.String r3 = ea.a.p(r3, r4)
            int r4 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r3)
            com.lib.flutter.encrypt.EngineHelper r3 = com.lib.flutter.encrypt.EngineHelper.f15726a
            r3.getClass()
            com.lib.flutter.encrypt.FlutterAppApi r3 = com.lib.flutter.encrypt.EngineHelper.f15727b
            if (r3 == 0) goto Lbb
            java.lang.String r4 = gl.k.f17928b
            r3.a(r4)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.k.d(android.app.Activity, android.widget.LinearLayout):void");
    }

    public static void e(String str, LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        l lVar = l.f17929o;
        if (kotlin.jvm.internal.g.a(str, lVar.i())) {
            lVar.p(linearLayout);
            return;
        }
        m mVar = m.f17930o;
        if (kotlin.jvm.internal.g.a(str, mVar.i())) {
            mVar.p(linearLayout);
        }
    }
}

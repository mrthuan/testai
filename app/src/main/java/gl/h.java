package gl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: HomeScanBanner.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final String f17924b = ea.a.p("O280ZQRjMW4KYQhuUXIWfHBvP2UaY1duNmEfbjRyQg==", "67sYWPdQ");

    /* renamed from: a  reason: collision with root package name */
    public static final h f17923a = new h();

    public static void a(LinearLayout linearLayout, boolean z10) {
        ViewParent viewParent;
        ViewGroup viewGroup = null;
        if (linearLayout != null) {
            viewParent = linearLayout.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewParent;
        }
        if (viewGroup != null) {
            no.f.b(viewGroup.getContext()).getClass();
            boolean f10 = no.f.f();
            Context context = viewGroup.getContext();
            kotlin.jvm.internal.g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "NYknTTuE"));
            String a10 = bp.a.a(context);
            if (f10 && (TextUtils.equals(a10, ea.a.p("Qg==", "xcrsHDTE")) || TextUtils.equals(a10, ea.a.p("Qw==", "54Eub0wS")))) {
                return;
            }
            if (z10) {
                viewGroup.setElevation(viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.dp_10));
            } else {
                viewGroup.setElevation(0.0f);
            }
        }
    }

    public static void b(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        i.f17925o.e(activity);
        j.f17926o.e(activity);
    }

    public static void c(String str, LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        i iVar = i.f17925o;
        if (kotlin.jvm.internal.g.a(str, iVar.i())) {
            iVar.p(linearLayout);
            return;
        }
        j jVar = j.f17926o;
        if (kotlin.jvm.internal.g.a(str, jVar.i())) {
            jVar.p(linearLayout);
        }
    }
}

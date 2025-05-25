package gl;

import android.view.ViewGroup;

/* compiled from: PreviewBottomBanner.kt */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final String f17932b = ea.a.p("Q3IudhplFUIddEBvBEI3biplQEE6cDFlJGkEdy1vNnRcbQlhHW4HckI=", "RaoBUQ9P");

    /* renamed from: a  reason: collision with root package name */
    public static final o f17931a = new o();

    public static void a(String str, ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        p pVar = p.f17933p;
        if (kotlin.jvm.internal.g.a(str, pVar.i())) {
            pVar.p(viewGroup);
            return;
        }
        q qVar = q.f17934p;
        if (kotlin.jvm.internal.g.a(str, qVar.i())) {
            qVar.p(viewGroup);
        }
    }

    public static void b() {
        p.f17933p.d();
        q.f17934p.d();
    }
}

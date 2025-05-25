package dl;

import android.content.Context;
import android.support.v4.media.session.h;
import android.text.TextUtils;
import de.e;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;

/* compiled from: HomeBannerAdManager.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16263a = false;

    /* compiled from: HomeBannerAdManager.java */
    /* renamed from: dl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0199a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16264a = new a();
    }

    public static boolean a(Context context) {
        boolean z10;
        c1 c1Var = c1.f28564a;
        g.e(context, "context");
        String p10 = ea.a.p("SmVz", "zp0UZI0B");
        String h10 = e.h(c1.f28577h, p10);
        if (h.b("LG9fZhBn", "8sMccB3D", h10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h10 = p10;
        }
        if (!TextUtils.equals(p10, h10) || AdUtils.a(context)) {
            return false;
        }
        boolean g10 = c.g(context);
        boolean z11 = bl.a.J(context).f5470i;
        if (g10 && !z11) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
        if (r0.j() != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.app.Activity r5, android.widget.LinearLayout r6) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dl.a.b(android.app.Activity, android.widget.LinearLayout):void");
    }
}

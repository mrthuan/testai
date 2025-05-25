package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: ToolsCreatePdfFullAdManager.kt */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f23972a;

    static {
        ea.a.p("Z28kbABDEGUTdFFQDWYQdShsc2QLYW4=", "YQ5beNug");
        f23972a = new n();
    }

    public final void a() {
        String p10 = ea.a.p("Gm8KbCNDA2UpdANQUGYRdVRsE2QEYVggWS1cLXwtby1jLUVlPmQ-ZhhyCWNRcyQgFS1_LWQtGy0t", "kINePq8i");
        int i10 = zk.a.f32399a;
        t1.b(p10);
        FullScreenManage.g(4);
        wk.b.b().k(this);
    }

    public final boolean b(Activity activity) {
        boolean containsKey;
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("G29ebApDRWU7dC9QEWYudVlsL2QIYQsgJ3IdbS11XCA6c1RyVSBEazNwamMabh5lR3QodSlsJGR3bBdhZA==", "RoyoWxD1");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            return false;
        }
        wk.b b10 = wk.b.b();
        synchronized (b10) {
            containsKey = b10.f31308b.containsKey(this);
        }
        if (!containsKey) {
            String p11 = ea.a.p("G29ebApDRWU7dC9QEWYudVlsL2QIYQsgVC1nLR4tZi1iLRFzDWFFdApyJWMQcxsgGC1DLWgtSC0t", "XQMtyJ3K");
            int i11 = zk.a.f32399a;
            t1.b(p11);
            wk.b.b().i(this);
        }
        if (activity != null) {
            if (ge.h.a(activity)) {
                return FullScreenManage.d(activity, null, 4, true);
            }
            String p12 = ea.a.p("G29ebApDRWU7dC9QEWYudVlsL2QIYQsgI28oZBNvNHYqckVQPUZxdTZsC2RVcwNpRSACbyRkSSA6ZS53P3IxICpyQ29y", "DBi1TZPZ");
            int i12 = zk.a.f32399a;
            t1.b(p12);
        }
        return false;
    }

    public final void c(Activity activity, cg.a<tf.d> aVar, cg.a<tf.d> aVar2) {
        a();
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("Z28kbABDEGUTdFFQDWYQdShsc2QLYS0gMXILbR91WCBGcy5yXyARaxtwFHAbZSBpIXd0dSpsAmRhcwZvdw==", "Anv5XqXP");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            aVar.invoke();
        } else if (activity != null) {
            if (AdUtils.b(activity) && FullScreenManage.c(4, activity, false)) {
                g.m().k(activity, new h5.i(aVar2, activity));
            } else {
                aVar.invoke();
            }
        }
    }

    public final void d(Activity activity, cg.a<tf.d> aVar) {
        if (BillingConfigImpl.c.w()) {
            a();
            String p10 = ea.a.p("Z28kbABDEGUTdFFQDWYQdShsc2QLYS0gEnIqbSV1LiBGcy5yXyARaxtwFHAbZSBpIXd0dSpsAmRCcydvdw==", "bOLCHpc0");
            int i10 = zk.a.f32399a;
            t1.b(p10);
        } else if (activity != null && AdUtils.b(activity) && FullScreenManage.c(4, activity, false)) {
            g.m().k(activity, new androidx.privacysandbox.ads.adservices.java.internal.a(activity, aVar));
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public final void refreshConvertFullAd(al.a aVar) {
        String p10 = ea.a.p("Z28kbABDEGUTdFFQDWYQdShsc2QLYS0gCGUiZVB2L3ITTg5UJE8wS1JTYUMqRQVTaGJXZy9uY2w1YSUgem8kdlZyP0YGbA5BZA==", "ZA9Jp0YG");
        int i10 = zk.a.f32399a;
        t1.b(p10);
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            f23972a.b(l10);
        }
    }
}

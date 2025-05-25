package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.b;
import androidx.appcompat.app.c;
import ea.a;
import java.util.Iterator;
import o9.d;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;

/* compiled from: WidgetLandingActivity.kt */
/* loaded from: classes3.dex */
public final class WidgetLandingActivity extends c {
    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<Activity> it = ReaderPdfApplication.f23858j.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next instanceof ReaderSplashActivity) {
                ((ReaderSplashActivity) next).finish();
            }
        }
        ReaderPdfApplication.d();
        if (getIntent().getIntExtra(a.p("VXIkbQ==", "sAavmMia"), 0) == 6) {
            AppOpenManager c = AppOpenManager.c();
            c.f23908h = true;
            Handler handler = c.f23906f;
            b bVar = c.f23911k;
            handler.removeCallbacks(bVar);
            handler.postDelayed(bVar, 2000L);
        }
        Intent intent = new Intent(this, ReaderSplashActivity.class);
        intent.setData(getIntent().getData());
        intent.putExtras(getIntent());
        startActivity(intent);
        finish();
        String p10 = a.p("OGlVZxx0aHQ7Zw==", "ZseLnYMy");
        boolean z10 = ReaderHomeActivity.Z1;
        d.s(p10, " enter WidgetLandingActivity  isEnterHome " + z10);
        int intExtra = getIntent().getIntExtra(a.p("RGkvZxZ0PWlk", "Bneiyu52"), 0);
        if (intExtra != 30) {
            if (intExtra != 31) {
                if (intExtra != 40) {
                    if (intExtra != 41) {
                        if (intExtra != 50) {
                            if (intExtra != 51) {
                                switch (intExtra) {
                                    case 10:
                                        tf.c cVar = WidgetEventCenter.f28682a;
                                        WidgetEventCenter.c(a.p("RGkvZxZ0EV8BZVVyCmgJYyhpUWs=", "H2Svhi48"), a.p("MQ==", "OHT2m0dQ"));
                                        return;
                                    case 11:
                                        tf.c cVar2 = WidgetEventCenter.f28682a;
                                        WidgetEventCenter.c(a.p("RGkvZxZ0EV8ab1llNmM6aSdr", "JX5wetoW"), a.p("MQ==", "T0thN5n1"));
                                        return;
                                    case 12:
                                        tf.c cVar3 = WidgetEventCenter.f28682a;
                                        WidgetEventCenter.c(a.p("RGkvZxZ0EV8AZVdlB3QJYyhpUWs=", "2SMJDrfs"), a.p("MQ==", "NKjiUbmV"));
                                        return;
                                    case 13:
                                        tf.c cVar4 = WidgetEventCenter.f28682a;
                                        WidgetEventCenter.c(a.p("OGlVZxx0RF84byVrGGEaa2pjAmkmaw==", "zxzunrdF"), a.p("MQ==", "AAYUKvDN"));
                                        return;
                                    case 14:
                                        tf.c cVar5 = WidgetEventCenter.f28682a;
                                        WidgetEventCenter.c(a.p("AGkuZzN0O18tZA90a2M7aVtr", "HYwJVHrZ"), a.p("MQ==", "yihvMGZi"));
                                        return;
                                    default:
                                        switch (intExtra) {
                                            case 20:
                                                tf.c cVar6 = WidgetEventCenter.f28682a;
                                                WidgetEventCenter.c(a.p("BGkQZzN0RF87ZQdyV2gIY1RpMWs=", "costV7Ar"), a.p("Mg==", "4H1OtIeF"));
                                                return;
                                            case 21:
                                                tf.c cVar7 = WidgetEventCenter.f28682a;
                                                WidgetEventCenter.c(a.p("OGlVZxx0RF88bzhtFHQ3Y1lpDWs=", "PER22xBd"), a.p("P2RXXzI=", "hGsRiVgE"));
                                                return;
                                            case 22:
                                                tf.c cVar8 = WidgetEventCenter.f28682a;
                                                WidgetEventCenter.c(a.p("OGlVZxx0RF88bzhtFHQ3Y1lpDWs=", "bxioLVM2"), a.p("OG9DZCYy", "lylzIgfZ"));
                                                return;
                                            case 23:
                                                tf.c cVar9 = WidgetEventCenter.f28682a;
                                                WidgetEventCenter.c(a.p("RGkvZxZ0EV8Ub0ZtCHQJYyhpUWs=", "S4KZx09h"), a.p("KnhSZRVfMg==", "JYi2wYoZ"));
                                                return;
                                            case 24:
                                                tf.c cVar10 = WidgetEventCenter.f28682a;
                                                WidgetEventCenter.c(a.p("RGkvZxZ0EV8Ub0ZtCHQJYyhpUWs=", "i6O5uVz0"), a.p("HnA2XzI=", "tPnBpe9L"));
                                                return;
                                            case 25:
                                                tf.c cVar11 = WidgetEventCenter.f28682a;
                                                WidgetEventCenter.c(a.p("OGlVZxx0RF8ubyVsBl8LbFxjaw==", "vu4wQOU8"), a.p("Mg==", "WX7jr2Du"));
                                                return;
                                            default:
                                                return;
                                        }
                                }
                            }
                            tf.c cVar12 = WidgetEventCenter.f28682a;
                            WidgetEventCenter.c(a.p("RGkvZxZ0EV8XZF10NmM6aSdr", "RrRWOi0C"), a.p("OA==", "s481RKm4"));
                            return;
                        }
                        tf.c cVar13 = WidgetEventCenter.f28682a;
                        WidgetEventCenter.c(a.p("OGlVZxx0RF8_ZCN0KmMEaVZr", "2jppzKme"), a.p("NQ==", "ICgPiP7w"));
                        return;
                    }
                    tf.c cVar14 = WidgetEventCenter.f28682a;
                    WidgetEventCenter.c(a.p("RGkvZxZ0EV8BY1VuW3AyZhtjXmklaw==", "rmV33uiS"), a.p("Nw==", "NJoHr32L"));
                    return;
                }
                tf.c cVar15 = WidgetEventCenter.f28682a;
                WidgetEventCenter.c(a.p("OGlVZxx0RF8pYytuR3AMZmpjAmkmaw==", "TAegYjM6"), a.p("NA==", "rep7IH1D"));
                return;
            }
            tf.c cVar16 = WidgetEventCenter.f28682a;
            WidgetEventCenter.c(a.p("RGkvZxZ0EV8bbVMyGWQwXydsW2Nr", "wWFeSPfh"), a.p("Ng==", "wvvKPqC1"));
            return;
        }
        tf.c cVar17 = WidgetEventCenter.f28682a;
        WidgetEventCenter.c(a.p("RGkvZxZ0EV8bbVMyGWQwXydsW2Nr", "kJzAC0me"), a.p("Mw==", "xa01Ky5V"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }
}

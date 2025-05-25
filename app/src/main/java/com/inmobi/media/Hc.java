package com.inmobi.media;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class Hc {
    public static boolean a(WebView view, RenderProcessGoneDetail renderProcessGoneDetail, String source) {
        boolean z10;
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(source, "source");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        Pair pair = new Pair("source", source);
        if (renderProcessGoneDetail != null) {
            z10 = renderProcessGoneDetail.didCrash();
        } else {
            z10 = false;
        }
        LinkedHashMap B0 = kotlin.collections.q.B0(pair, new Pair("isCrashed", Boolean.valueOf(z10)));
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b("WebViewRenderProcessGoneEvent", B0, EnumC1686jb.f15238a);
        view.destroy();
        return true;
    }
}

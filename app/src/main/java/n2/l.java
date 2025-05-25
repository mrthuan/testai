package n2;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: WebViewProviderFactory.java */
/* loaded from: classes.dex */
public interface l {
    WebViewProviderBoundaryInterface createWebView(WebView webView);

    String[] d();

    StaticsBoundaryInterface getStatics();
}

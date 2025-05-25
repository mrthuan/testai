package m2;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import mk.a;
import n2.h;
import n2.j;
import n2.k;

/* compiled from: WebViewCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f21795a = 0;

    /* compiled from: WebViewCompat.java */
    /* loaded from: classes.dex */
    public interface a {
        void onPostMessage(WebView webView, c cVar, Uri uri, boolean z10, m2.a aVar);
    }

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set<String> set, a aVar) {
        if (j.c.d()) {
            k.a.f22330a.createWebView(webView).addWebMessageListener(str, (String[]) set.toArray(new String[0]), new a.C0292a(new h(aVar)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }
}

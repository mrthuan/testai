package com.iab.omid.library.inmobi.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.internal.g;
import com.iab.omid.library.inmobi.internal.h;
import com.iab.omid.library.inmobi.utils.c;
import com.iab.omid.library.inmobi.utils.f;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g  reason: collision with root package name */
    private WebView f13992g;

    /* renamed from: h  reason: collision with root package name */
    private Long f13993h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f13994i;

    /* renamed from: j  reason: collision with root package name */
    private final String f13995j;

    /* loaded from: classes2.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            renderProcessGoneDetail.toString();
            Objects.toString(webView);
            if (b.this.getWebView() == webView) {
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.inmobi.publisher.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0184b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f13997a;

        public RunnableC0184b() {
            this.f13997a = b.this.f13992g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13997a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f13993h = null;
        this.f13994i = map;
        this.f13995j = str2;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void b() {
        long convert;
        super.b();
        if (this.f13993h == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(f.b() - this.f13993h.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new RunnableC0184b(), Math.max(4000 - convert, 2000L));
        this.f13992g = null;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f13992g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f13992g.getSettings().setAllowContentAccess(false);
        this.f13992g.getSettings().setAllowFileAccess(false);
        this.f13992g.setWebViewClient(new a());
        a(this.f13992g);
        h.a().c(this.f13992g, this.f13995j);
        for (String str : this.f13994i.keySet()) {
            h.a().c(this.f13992g, this.f13994i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f13993h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}

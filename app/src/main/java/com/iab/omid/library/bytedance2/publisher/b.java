package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: f  reason: collision with root package name */
    private WebView f13882f;

    /* renamed from: g  reason: collision with root package name */
    private Long f13883g = null;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f13884h;

    /* renamed from: i  reason: collision with root package name */
    private final String f13885i;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f13886a;

        public a() {
            this.f13886a = b.this.f13882f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13886a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f13884h = map;
        this.f13885i = str;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        long convert;
        super.b();
        if (this.f13883g == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(f.b() - this.f13883g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a(), Math.max(4000 - convert, 2000L));
        this.f13882f = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.bytedance2.internal.f.b().a());
        this.f13882f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f13882f.getSettings().setAllowContentAccess(false);
        this.f13882f.getSettings().setAllowFileAccess(false);
        a(this.f13882f);
        g.a().c(this.f13882f, this.f13885i);
        for (String str : this.f13884h.keySet()) {
            g.a().a(this.f13882f, this.f13884h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f13883g = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}

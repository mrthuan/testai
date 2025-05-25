package com.iab.omid.library.inmobi.adsession;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import b.b;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.internal.f;
import com.iab.omid.library.inmobi.utils.g;
import com.iab.omid.library.inmobi.utils.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import m2.c;
import m2.d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JavaScriptSessionService {
    private static String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static String JS_MESSAGE_KEY_DATA = "data";
    private static String JS_MESSAGE_KEY_METHOD = "method";
    private static String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private static i webViewUtil = new i();
    private final HashMap<String, AdSession> adSessions = new HashMap<>();
    private final f friendlyObstructions = new f();
    private final boolean isHtmlAdView;
    private final Partner partner;
    private com.iab.omid.library.inmobi.weakreference.a weakAdView;
    private final WebView webView;

    /* loaded from: classes2.dex */
    public interface TearDownHandler {
        void onTearDown(boolean z10);
    }

    private JavaScriptSessionService(Partner partner, WebView webView, boolean z10) {
        g.a();
        g.a(partner, "Partner is null");
        g.a(webView, "WebView is null");
        this.partner = partner;
        this.webView = webView;
        this.isHtmlAdView = z10;
        addWebViewListener();
    }

    private void addWebViewListener() {
        if (b.I("WEB_MESSAGE_LISTENER")) {
            removeWebViewListener();
            webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE, new HashSet(Arrays.asList("*")), new d.a() { // from class: com.iab.omid.library.inmobi.adsession.JavaScriptSessionService.2
                @Override // m2.d.a
                public void onPostMessage(WebView webView, c cVar, Uri uri, boolean z10, m2.a aVar) {
                    try {
                        JSONObject jSONObject = new JSONObject(cVar.a());
                        String string = jSONObject.getString(JavaScriptSessionService.JS_MESSAGE_KEY_METHOD);
                        String string2 = jSONObject.getJSONObject(JavaScriptSessionService.JS_MESSAGE_KEY_DATA).getString(JavaScriptSessionService.JS_MESSAGE_DATA_AD_SESSION_ID);
                        if (string.equals(JavaScriptSessionService.JS_MESSAGE_METHOD_START_SESSION)) {
                            JavaScriptSessionService.this.startSession(string2);
                        } else if (string.equals(JavaScriptSessionService.JS_MESSAGE_METHOD_FINISH_SESSION)) {
                            JavaScriptSessionService.this.finishSession(string2);
                        } else {
                            com.iab.omid.library.inmobi.utils.d.b("Unexpected method in JavaScriptSessionService: ".concat(string));
                        }
                    } catch (JSONException e10) {
                        com.iab.omid.library.inmobi.utils.d.a("Error parsing JS message in JavaScriptSessionService.", e10);
                    }
                }
            });
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static JavaScriptSessionService create(Partner partner, WebView webView, boolean z10) {
        return new JavaScriptSessionService(partner, webView, z10);
    }

    private AdSessionConfiguration createAdSessionConfiguration() {
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    private AdSessionContext createAdSessionContext() {
        if (this.isHtmlAdView) {
            return AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, null, null);
        }
        return AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishSession(String str) {
        AdSession adSession = this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWebViewListener() {
        webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSession(String str) {
        View adView;
        a aVar = new a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, aVar);
        if (this.isHtmlAdView) {
            adView = this.webView;
        } else {
            adView = getAdView();
        }
        aVar.registerAdView(adView);
        for (e eVar : this.friendlyObstructions.a()) {
            aVar.addFriendlyObstruction(eVar.c().get(), eVar.b(), eVar.a());
        }
        aVar.start();
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        for (AdSession adSession : this.adSessions.values()) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.a(view, friendlyObstructionPurpose, str);
    }

    public View getAdView() {
        com.iab.omid.library.inmobi.weakreference.a aVar = this.weakAdView;
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    public void removeAllFriendlyObstructions() {
        for (AdSession adSession : this.adSessions.values()) {
            adSession.removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.b();
    }

    public void removeFriendlyObstruction(View view) {
        for (AdSession adSession : this.adSessions.values()) {
            adSession.removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.c(view);
    }

    public void setAdView(View view) {
        if (this.isHtmlAdView) {
            if (view == this.webView) {
                return;
            }
            throw new UnsupportedOperationException("For HTML-rendered ads, the ad view is automatically set to the web view and cannot be changed.");
        }
        for (AdSession adSession : this.adSessions.values()) {
            adSession.registerAdView(view);
        }
        this.weakAdView = new com.iab.omid.library.inmobi.weakreference.a(view);
    }

    public void tearDown(final TearDownHandler tearDownHandler) {
        for (AdSession adSession : this.adSessions.values()) {
            adSession.finish();
        }
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() { // from class: com.iab.omid.library.inmobi.adsession.JavaScriptSessionService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                JavaScriptSessionService.this.removeWebViewListener();
                tearDownHandler.onTearDown(true);
                timer.cancel();
            }
        }, 1000L);
    }
}

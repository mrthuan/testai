package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcei extends WebChromeClient {
    private final zzcej zza;

    public zzcei(zzcej zzcejVar) {
        this.zza = zzcejVar;
    }

    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcej)) {
            return webView.getContext();
        }
        zzcej zzcejVar = (zzcej) webView;
        Activity zzi = zzcejVar.zzi();
        if (zzi != null) {
            return zzi;
        }
        return zzcejVar.getContext();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcej)) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = ((zzcej) webView).zzL();
        if (zzL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzL.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String g10 = a6.h.g(android.support.v4.media.session.h.f("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (g10.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzceh.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && i10 != 4) {
                    if (i10 != 5) {
                        com.google.android.gms.ads.internal.util.client.zzm.d(g10);
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.b(g10);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.d(g10);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.e(g10);
            }
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.c(g10);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzH() != null) {
            webView2.setWebViewClient(this.zza.zzH());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(Math.min(131072L, j13) + j10, 1048576L);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            zzcej zzcejVar = this.zza;
            com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
            com.google.android.gms.ads.internal.util.zzt zztVar = zzuVar.c;
            if (!com.google.android.gms.ads.internal.util.zzt.a(zzcejVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzcej zzcejVar2 = this.zza;
                com.google.android.gms.ads.internal.util.zzt zztVar2 = zzuVar.c;
                if (!com.google.android.gms.ads.internal.util.zzt.a(zzcejVar2.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = false;
                    callback.invoke(str, z10, true);
                }
            }
            z10 = true;
            callback.invoke(str, z10, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zza.zzL();
        if (zzL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not get ad overlay when hiding custom view.");
        } else {
            zzL.zzg();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zza.zzL();
        if (zzL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = zzL.f10308a;
        FrameLayout frameLayout = new FrameLayout(activity);
        zzL.f10313g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        zzL.f10313g.addView(view, -1, -1);
        activity.setContentView(zzL.f10313g);
        zzL.f10323q = true;
        zzL.f10314h = customViewCallback;
        zzL.f10312f = true;
        zzL.K(i10);
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        zzcej zzcejVar;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzcejVar = this.zza;
        } catch (WindowManager.BadTokenException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
        if (zzcejVar != null && zzcejVar.zzN() != null && this.zza.zzN().zzd() != null && (zzd = this.zza.zzN().zzd()) != null && !zzd.b()) {
            zzd.a("window." + str + "('" + str3 + "')");
            return false;
        }
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        AlertDialog.Builder i10 = com.google.android.gms.ads.internal.util.zzt.i(context);
        i10.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            i10.setView(linearLayout).setPositiveButton(17039370, new zzceg(jsPromptResult, editText)).setNegativeButton(17039360, new zzcef(jsPromptResult)).setOnCancelListener(new zzcee(jsPromptResult)).create().show();
        } else {
            i10.setMessage(str3).setPositiveButton(17039370, new zzced(jsResult)).setNegativeButton(17039360, new zzcec(jsResult)).setOnCancelListener(new zzceb(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}

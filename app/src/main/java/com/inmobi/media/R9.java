package com.inmobi.media;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.inmobi.media.R9;
import com.inmobi.media.S9;

/* loaded from: classes2.dex */
public final class R9 extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S9 f14618a;

    public R9(S9 s92) {
        this.f14618a = s92;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static final void b(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.g.e(result, "$result");
        result.confirm();
    }

    public static final void c(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.g.e(result, "$result");
        result.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster == null) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        return defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage cm2) {
        kotlin.jvm.internal.g.e(cm2, "cm");
        String str = cm2.message() + " -- From line " + cm2.lineNumber() + " of " + cm2.sourceId();
        A4 a42 = this.f14618a.f14665j;
        if (a42 != null) {
            String str2 = S9.O0;
            ((B4) a42).c(str2, AbstractC1890z5.a(str2, "access$getTAG$cp(...)", "Console message:", str));
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
        kotlin.jvm.internal.g.e(origin, "origin");
        kotlin.jvm.internal.g.e(callback, "callback");
        if (this.f14618a.f14671m.get() != null) {
            new AlertDialog.Builder((Context) this.f14618a.f14671m.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: qb.r
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    R9.a(callback, origin, dialogInterface, i10);
                }
            }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: qb.s
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    R9.b(callback, origin, dialogInterface, i10);
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(origin, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(message, "message");
        kotlin.jvm.internal.g.e(result, "result");
        A4 a42 = this.f14618a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).a(str, "jsAlert called with: " + message + url);
        }
        if (S9.a(this.f14618a, result)) {
            Activity fullScreenActivity = this.f14618a.getFullScreenActivity();
            if (fullScreenActivity != null) {
                new AlertDialog.Builder(fullScreenActivity).setMessage(message).setTitle(url).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: qb.t
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        R9.a(result, dialogInterface, i10);
                    }
                }).setCancelable(false).create().show();
                return true;
            }
            result.cancel();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(message, "message");
        kotlin.jvm.internal.g.e(result, "result");
        A4 a42 = this.f14618a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).a(str, "jsConfirm called with: " + message + url);
        }
        if (S9.a(this.f14618a, result)) {
            if (this.f14618a.getFullScreenActivity() != null) {
                new AlertDialog.Builder(this.f14618a.getFullScreenActivity()).setMessage(message).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: qb.n
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        R9.b(result, dialogInterface, i10);
                    }
                }).setNegativeButton(17039360, new DialogInterface.OnClickListener() { // from class: qb.o
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        R9.c(result, dialogInterface, i10);
                    }
                }).create().show();
                return true;
            }
            result.cancel();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(message, "message");
        kotlin.jvm.internal.g.e(defaultValue, "defaultValue");
        kotlin.jvm.internal.g.e(result, "result");
        A4 a42 = this.f14618a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).a(str, "jsPrompt called with: " + message + url);
        }
        if (!S9.a(this.f14618a, result)) {
            return true;
        }
        if (this.f14618a.getFullScreenActivity() == null) {
            result.cancel();
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        A4 a42 = this.f14618a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).c(str, "webview progress changed - " + i10);
        }
        super.onProgressChanged(webView, i10);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        FrameLayout frameLayout;
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(callback, "callback");
        if (this.f14618a.f14671m.get() != null) {
            S9 s92 = this.f14618a;
            s92.N = view;
            s92.O = callback;
            view.setOnTouchListener(new qb.p());
            Activity activity = (Activity) this.f14618a.f14671m.get();
            if (activity != null) {
                frameLayout = (FrameLayout) activity.findViewById(16908290);
            } else {
                frameLayout = null;
            }
            View view2 = this.f14618a.N;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f14618a.N, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.f14618a.N;
            if (view3 != null) {
                view3.requestFocus();
            }
            final S9 s93 = this.f14618a;
            View view4 = s93.N;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: qb.q
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i10, KeyEvent keyEvent) {
                    return R9.a(S9.this, this, view5, i10, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public static final void a(JsResult result, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.g.e(result, "$result");
        result.confirm();
    }

    public static final void b(GeolocationPermissions.Callback callback, String origin, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.g.e(callback, "$callback");
        kotlin.jvm.internal.g.e(origin, "$origin");
        callback.invoke(origin, false, false);
    }

    public static final boolean a(S9 this$0, R9 this$1, View view, int i10, KeyEvent keyEvent) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(this$1, "this$1");
        if (4 == keyEvent.getKeyCode() && keyEvent.getAction() == 0) {
            A4 a42 = this$0.f14665j;
            if (a42 != null) {
                String str = S9.O0;
                kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
                ((B4) a42).a(str, "Back pressed when HTML5 video is playing.");
            }
            this$1.a();
            return true;
        }
        return false;
    }

    public final void a() {
        S9 s92 = this.f14618a;
        if (s92.N == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = s92.O;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        S9 s93 = this.f14618a;
        s93.O = null;
        View view = s93.N;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.f14618a.N;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f14618a.N);
            }
            this.f14618a.N = null;
        }
    }

    public static final void a(GeolocationPermissions.Callback callback, String origin, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.g.e(callback, "$callback");
        kotlin.jvm.internal.g.e(origin, "$origin");
        callback.invoke(origin, true, false);
    }
}

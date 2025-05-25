package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Nv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1009Nv extends WebViewClient {
    public static byte[] A05;
    public InterfaceC1005Nr A00 = new InterfaceC1005Nr() { // from class: com.facebook.ads.redexgen.X.Uz
        @Override // com.facebook.ads.redexgen.X.InterfaceC1005Nr
        public final boolean A9c(String str) {
            return C1009Nv.A04(str);
        }
    };
    public WeakReference<InterfaceC1007Nt> A01 = new WeakReference<>(null);
    public final WeakReference<C1314Zs> A02;
    public final WeakReference<InterfaceC1006Ns> A03;
    public final WeakReference<C1002No> A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Field.NUMCHARS, 31, 18, 8, 9, Field.FORMCHECKBOX, 31, 17, Field.NUMCHARS, 19, 22, Field.PAGEREF, 42, Field.NUMWORDS, Field.PAGEREF, Field.FILLIN, 48, Field.DDE, Field.GOTOBUTTON, Field.DDE, 48, 61, 12, 3, 9, 31, 2, 4, 9, Field.INCLUDEPICTURE, 4, 3, 25, 8, 3, 25, Field.INCLUDEPICTURE, 12, 14, 25, 4, 2, 3, Field.INCLUDEPICTURE, 59, 36, Field.DATA, 58, 119, 120, 114, 100, 121, Byte.MAX_VALUE, 114, 56, Byte.MAX_VALUE, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, Field.ADVANCE, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.SECTION, Field.FILESIZE, Field.CONTROL, Field.ADVANCE, Field.LISTNUM, Field.FORMDROPDOWN, 117, 101, 120, 96, 100, 114, 101, Field.NOTEREF, 113, 118, 123, 123, 117, 118, 116, 124, Field.NOTEREF, 98, 101, 123, Field.MACROBUTTON, Field.AUTONUM, Field.QUOTE, Field.AUTONUM, 97, 102, 124, 109, 102, 124, 2, 5, Field.NUMWORDS, 77, Field.CONTROL, 31, 13, 10, Field.IMPORT, 30, 1, 13, 31};
    }

    public C1009Nv(WeakReference<C1314Zs> weakReference, WeakReference<InterfaceC1006Ns> weakReference2, WeakReference<C1002No> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1314Zs c1314Zs) {
        c1314Zs.A07().AA0(A00(11, 11, 104), C8E.A09, new C8F(A00(111, 5, 91) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (r0.contains(r2) == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03(android.webkit.WebView r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1009Nv.A03(android.webkit.WebView, java.lang.String):boolean");
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(InterfaceC1005Nr interfaceC1005Nr) {
        this.A00 = interfaceC1005Nr;
    }

    public final void A06(WeakReference<InterfaceC1007Nt> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1002No timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1006Ns interfaceC1006Ns = this.A03.get();
        if (interfaceC1006Ns != null) {
            interfaceC1006Ns.ACw(str);
        }
        InterfaceC1007Nt interfaceC1007Nt = this.A01.get();
        if (interfaceC1007Nt != null) {
            interfaceC1007Nt.ABL(webView.canGoBack());
            interfaceC1007Nt.AC0(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1006Ns listener = this.A03.get();
        if (listener != null) {
            listener.ACy(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        C1314Zs c1314Zs = this.A02.get();
        if (c1314Zs != null) {
            StringBuilder sb2 = new StringBuilder();
            String A00 = A00(0, 0, 109);
            String errorMessage = LT.A01(i10, sb2.append(A00).append(str).toString(), A00 + str2);
            c1314Zs.A0E().A96(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1314Zs c1314Zs = this.A02.get();
        if (c1314Zs != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String A00 = A00(0, 0, 109);
            String errorMessage = LT.A01(errorCode, sb2.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl());
            c1314Zs.A0E().A96(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1314Zs context = this.A02.get();
        if (context != null) {
            context.A0E().A97();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1314Zs context = this.A02.get();
        if (context != null) {
            context.A0E().A98();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1012Ny.A02(C8E.A2e);
        InterfaceC1006Ns listener = this.A03.get();
        if (listener != null) {
            listener.ADL();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}

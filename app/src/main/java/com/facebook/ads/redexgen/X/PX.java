package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class PX extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"", "6FWFK2Rjg5lzc4YxuKyAM2pjdKcDgsPX", "X8DXQa0II", "SNpKLA", "Qdf29haAswqAmNE65waVoEZq7xKg2wdQ", "zoYtBkcpJPqvxBhZCETS8Gv12yQPTvJi", "ExNOaNYHlEOFqs215y0dlBgemejMJNEa", "gJ6ZUqdzTjndwEo8cFEFcqem1uRbclUa"};
    public final /* synthetic */ C1041Pb A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A02[5].charAt(10) != 'q') {
                throw new RuntimeException();
            }
            A02[5] = "pKC7szj5R0qBwTmNDTYZuLrnbbbgOopj";
            copyOfRange[i13] = (byte) (i14 ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 99, 117, 101, 116, 111, 118, 114, 111, 105, 104, 124, 113, 124, Field.HTMLCONTROL, 106, 121, 107, 112, 6, 17, 17, 12, 17, 32, 12, 7, 6, Field.LISTNUM, Field.ADDRESSBLOCK, 74, Field.DOCPROPERTY, Field.SHAPE, Field.FORMDROPDOWN, 82, 18, Field.DOCPROPERTY, Field.SHAPE, Field.FORMDROPDOWN, 13, 17, 17, 21, 58, 0, 23, 23, 10, 23, 19, 17, 10, 12, 17, 10, 23, 26, 106, 109, 115};
    }

    static {
        A01();
    }

    public PX(C1041Pb c1041Pb) {
        this.A00 = c1041Pb;
    }

    private void A02(int i10, String str, String str2, boolean z10) {
        JF jf2;
        C1314Zs c1314Zs;
        PO po2;
        if (z10) {
            this.A00.A0S();
        }
        jf2 = this.A00.A0D;
        jf2.A04(JE.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 66), i10);
            jSONObject.put(A00(0, 11, 39), str);
            jSONObject.put(A00(57, 3, 62), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1314Zs = this.A00.A0B;
        c1314Zs.A0E().A5l(jSONObject2);
        po2 = this.A00.A0E;
        po2.A04(C8E.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        JF jf2;
        C1314Zs c1314Zs;
        long j10;
        PZ pz;
        PZ pz2;
        jf2 = this.A00.A0D;
        jf2.A04(JE.A0R, null);
        c1314Zs = this.A00.A0B;
        C0S A0E = c1314Zs.A0E();
        j10 = this.A00.A00;
        A0E.A5m(C0956Lu.A01(j10));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        pz = this.A00.A03;
        if (pz == null) {
            return;
        }
        pz2 = this.A00.A03;
        pz2.AED();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i10, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb2 = new StringBuilder();
        String A00 = A00(0, 0, 93);
        A02(errorCode, sb2.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i10;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 29))) {
            return;
        }
        if (webResourceResponse != null) {
            i10 = webResourceResponse.getStatusCode();
        } else {
            i10 = -1;
        }
        A02(i10, A00(39, 10, 68), A00(0, 0, 93) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1314Zs c1314Zs;
        AbstractC1456cD abstractC1456cD;
        InterfaceC1040Pa interfaceC1040Pa;
        InterfaceC1040Pa interfaceC1040Pa2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 57), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 66), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1314Zs = this.A00.A0B;
        String message = A02[5];
        if (message.charAt(10) == 'q') {
            A02[3] = "cKmn9F08G0LbJgt48cswTZGSotGQ5jj";
            c1314Zs.A0E().A5h(jSONObject2);
            abstractC1456cD = this.A00.A09;
            AbstractC1042Pc.A04(abstractC1456cD.A0l());
            interfaceC1040Pa = this.A00.A04;
            if (interfaceC1040Pa != null) {
                interfaceC1040Pa2 = this.A00.A04;
                interfaceC1040Pa2.ADE();
            }
            String message2 = A02[5];
            if (message2.charAt(10) == 'q') {
                A02[3] = "Jr1n";
                return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1314Zs c1314Zs;
        C05906f c05906f;
        C1053Pn c1053Pn;
        AbstractC1456cD abstractC1456cD;
        c1314Zs = this.A00.A0B;
        c05906f = this.A00.A0A;
        c1053Pn = this.A00.A0H;
        abstractC1456cD = this.A00.A09;
        return C1055Pp.A00(c1314Zs, c05906f, webResourceRequest, c1053Pn, abstractC1456cD.A10());
    }
}

package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class O3 extends WebViewClient {
    public static byte[] A0B;
    public static String[] A0C = {"zsPwasR1y7408", "ZGgsKLkccpHpwEVEMRkr0P5MO", "FzTF8imkK53ZXE3O7c0sd3pyoR5CtRCL", "JPkvHHHSAaAEWhLae7UVRehZAXg5QbZs", "c", "Jl8ZDZjQ485DOmiNP3uI8E", "DJVtCfMEOJ4BXbKH6y5pb3wK31xmWsao", OperatorName.STROKING_COLOR_CMYK};
    public Date A00;
    public boolean A01 = false;
    public final C1314Zs A02;
    public final WeakReference<C1185Up> A03;
    public final WeakReference<O1> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<C0957Lv> A06;
    public final WeakReference<C1102Rk> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;
    public final boolean A0A;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {8, Field.ASK, Field.DATA, Field.DDE, 42, -14, 8, Field.AUTONUMOUT, Field.MACROBUTTON, Field.SYMBOL, Field.IMPORT, Field.AUTONUMOUT, Field.EQ, -69, -36, -27, -32, -36, -37, Field.NUMCHARS, 77, 56, Field.INCLUDEPICTURE, 76, 56, Field.MERGESEQ, 64, Field.FILESIZE, Field.USERADDRESS, -9, 44, 41, 32, -9, Field.FILLIN, 56, Field.MERGESEQ, Field.BARCODE, -9, 61, Field.FORMTEXT, Field.TOA, -9, 29, 64, Field.INCLUDEPICTURE, 60, -9, 24, 58, 58, 60, 74, 74, -9, -46, 5, 1, -1, -18, -83, -15, -18, 1, -18, -57, -83, 60, Field.NOTEREF, Field.NOTEREF, Field.INCLUDETEXT, 20, Field.SYMBOL, 102, 102, 99, 102, 59, Field.ADVANCE, Field.AUTOTEXTLIST, Field.FORMCHECKBOX, 76, Field.MERGESEQ, 6, 56, Field.MERGESEQ, Field.CONTROL, Field.HTMLCONTROL, Field.MERGESEQ, Field.AUTOTEXTLIST, Field.LISTNUM, 6, 76, Field.DOCPROPERTY, Field.HYPERLINK, 6, 44, Field.AUTOTEXT, 82, Field.MERGESEQ, 6, Field.FILLIN, Field.TOA, Field.TOA, Field.MERGESEQ, Field.AUTOTEXTLIST, Field.AUTOTEXTLIST, 6, 34, 59, 64, Field.DDEAUTO, Field.MACROBUTTON, Field.GOTOBUTTON, -19, 31, Field.GOTOBUTTON, Field.USERADDRESS, Field.SECTIONPAGES, Field.GOTOBUTTON, 64, Field.SECTION, -19, Field.MACROBUTTON, 60, Field.BARCODE, -19, 19, Field.AUTONUM, Field.SYMBOL, Field.GOTOBUTTON, -19, 14, 48, 48, Field.GOTOBUTTON, 64, 64, -19, Field.EQ, Field.GOTOBUTTON, 59, Field.AUTONUM, Field.GOTOBUTTON, Field.EQ, Field.INCLUDEPICTURE, Field.INCLUDETEXT, 77, Field.NOTEREF, Field.INCLUDETEXT, Field.INCLUDEPICTURE, Field.USERADDRESS, Field.ADVANCE, Field.ADDIN, Field.NOTEREF, Field.USERADDRESS, Field.AUTOTEXT, 64, Field.FORMDROPDOWN, Field.FORMCHECKBOX, Field.BARCODE, 76, 76, Field.TOA, 76, Field.SYMBOL, 61, Field.TOA, Field.USERADDRESS, Field.BARCODE, Field.DATA, Field.AUTONUMLGL, Field.AUTONUMLGL, Field.GOTOBUTTON, Field.AUTONUMLGL, 34, Field.FILLIN, Field.DATA, Field.AUTONUM, Field.ASK, Field.AUTONUMLGL, 44, Field.MACROBUTTON, Field.IMPORT, 44, Field.GOTOBUTTON, Field.EQ, 15, 10, 31, 18, 12, 24, 23, -41, 18, 12, 24, 19, 22, 25, 18, Field.AUTOTEXTLIST, 99, Field.AUTOTEXT, 103, Field.DOCPROPERTY, 82, Field.AUTOTEXT, 98, Field.DOCPROPERTY, 99, Field.SHAPE, 101, 98, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.AUTOTEXT, Field.DOCPROPERTY, 98, 98, Field.SHAPE, 98, Field.FORMTEXT, Field.TOA, 59, Field.USERADDRESS, Field.INCLUDEPICTURE, Field.NOTEREF, Field.SECTION, Field.SYMBOL, 78, Field.INCLUDEPICTURE, Field.FORMCHECKBOX, Field.BARCODE, Field.SYMBOL, Field.INCLUDEPICTURE, Field.NOTEREF, Field.SYMBOL, Field.FORMCHECKBOX, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.FORMTEXT, Field.INCLUDEPICTURE, 77, -3, -12, 3, -55, -55, -44, -31, -31, -18, -44, -36, -33, -29, -24, -18, -31, -44, -30, -33, -34, -35, -30, -44, Field.DDEAUTO, Field.GLOSSARY, -19, Field.MACROBUTTON, Field.AUTONUMOUT, Field.GLOSSARY, Field.GOTOBUTTON, Field.PAGEREF, Field.SECTIONPAGES, Field.AUTONUMLGL, Field.SECTION, Field.FILESIZE, Field.AUTONUMLGL, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.GLOSSARY, Field.SYMBOL, Field.AUTONUMOUT, 101, 86, 105, 101, 32, 97, Field.ADDRESSBLOCK, 82, Field.LISTNUM, Field.SHAPE, -8, -29, -18, -21, -26, -31, -14, -29, -10, -22, Field.USERADDRESS, 44, 41, Field.ASK, 61, 48, 44, Field.USERADDRESS};
        String[] strArr = A0C;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[3] = "rhE0g4ovzatryzU62WuE8blUNequGZ6x";
        strArr2[6] = "8iaaY9YuVC21lqcoOxYFj2DPKFldlJdP";
        A0B = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A0A(String str, List<String> list) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        for (String str2 : list) {
            if (lowerCase.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public O3(C1314Zs c1314Zs, WeakReference<O1> weakReference, WeakReference<C1102Rk> weakReference2, WeakReference<C0957Lv> weakReference3, WeakReference<AtomicBoolean> checkAssetsByJavascriptBridge, WeakReference<C1185Up> weakReference4, AtomicInteger atomicInteger, AtomicReference<String> requestId, boolean z10) {
        this.A02 = c1314Zs;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z10;
    }

    private WebResourceResponse A00() {
        return new WebResourceResponse(A01(286, 10, 123), StandardCharsets.UTF_8.name(), TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, A01(13, 6, 1), Collections.singletonMap(A01(0, 13, 79), A01(268, 8, 74)), new ByteArrayInputStream(A01(13, 6, 1).getBytes()));
    }

    private void A03(int i10, CharSequence charSequence, long j10) {
        JSONObject jSONObject = new JSONObject();
        boolean z10 = charSequence != null;
        try {
            jSONObject.put(A01(160, 10, 100), i10);
            jSONObject.put(A01(ShapeTypes.ACTION_BUTTON_DOCUMENT, 17, 77), charSequence);
            jSONObject.put(A01(202, 21, 122), z10);
            jSONObject.put(A01(223, 22, 100), j10);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (JSONException unused) {
        }
        this.A02.A07().AA0(A01(306, 8, 81), C8E.A2f, new C8F(AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, String str) {
        if (A01(245, 23, 25).equals(str)) {
            this.A02.A0E().AHY();
            return;
        }
        this.A02.A0E().AHZ(i10, str);
        Date finishTime = new Date();
        long time = finishTime.getTime();
        Date finishTime2 = this.A00;
        A03(i10, str, time - finishTime2.getTime());
        if (this.A04.get() != null) {
            this.A04.get().ABx(i10, str);
        }
    }

    private final void A05(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A01(ShapeTypes.CHART_PLUS, 11, 51))) {
            return;
        }
        this.A02.A0E().AHd(webResourceResponse.getStatusCode(), LT.A01(webResourceResponse.getStatusCode(), A01(67, 10, 126), A01(0, 0, 53) + webResourceRequest.getUrl()));
    }

    private void A07(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(ShapeTypes.FLOW_CHART_PUNCHED_TAPE, 15, 105), str);
            jSONObject.put(A01(296, 10, 12), str2);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (JSONException unused) {
        }
        if (this.A02 != null) {
            this.A02.A07().AA0(A01(306, 8, 81), C8E.A2c, new C8F(AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        r4 = new java.lang.StringBuilder();
        r0 = A01(19, 36, 97);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
        r5 = com.facebook.ads.redexgen.X.C05906f.A09(r7.A02);
        r6 = A0A(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
        r4 = new java.lang.StringBuilder();
        r0 = A01(77, 31, 112);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
        r4 = com.facebook.ads.redexgen.X.C1185Up.A0H;
        r0 = A01(108, 37, 87);
        android.util.Log.w(r4, r0);
        r0 = r5.toString();
        A07(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r4 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r3 = r8.getPath()
            java.lang.String r4 = r8.getScheme()
            if (r3 == 0) goto Lbb
            if (r4 == 0) goto Lbb
            r5 = 198(0xc6, float:2.77E-43)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.O3.A0C
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L26
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L26:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.O3.A0C
            java.lang.String r1 = "5na5yijD7UxFpHVkXXcSH2RW6Zg"
            r0 = 5
            r2[r0] = r1
            r1 = 4
            r0 = 55
            java.lang.String r0 = A01(r5, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lbb
            boolean r4 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.O3.A0C
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb1
            if (r4 == 0) goto L6c
        L52:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 19
            r1 = 36
            r0 = 97
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            r0.toString()
        L6c:
            com.facebook.ads.redexgen.X.Zs r0 = r7.A02
            java.util.List r5 = com.facebook.ads.redexgen.X.C05906f.A09(r0)
            boolean r6 = A0A(r3, r5)
            if (r6 != 0) goto Lb0
            boolean r0 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            if (r0 == 0) goto L98
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 77
            r1 = 31
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            r0.toString()
        L98:
            java.lang.String r4 = com.facebook.ads.redexgen.X.C1185Up.A03()
            r2 = 108(0x6c, float:1.51E-43)
            r1 = 37
            r0 = 87
            java.lang.String r0 = A01(r2, r1, r0)
            android.util.Log.w(r4, r0)
            java.lang.String r0 = r5.toString()
            r7.A07(r3, r0)
        Lb0:
            return r6
        Lb1:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.O3.A0C
            java.lang.String r1 = "2SO0ZWlaSU1SnxqLnXbiPhTsGSHCmzPH"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L6c
            goto L52
        Lbb:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.O3.A08(android.net.Uri):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0E().AHa(this.A03.get() != null);
        if (this.A03.get() != null) {
            AtomicBoolean atomicBoolean = this.A05.get();
            String[] strArr = A0C;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[3] = "U2DnXjrenRRLx1oMUBfcSIJQu5ANNJpT";
            strArr2[6] = "L4ZmgD3GCXt8DfDAt3P3IJDf6GSeHMJn";
            if (atomicBoolean != null && !this.A05.get().get()) {
                this.A03.get().A0F();
            }
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0E().AHb();
        this.A00 = new Date();
        new Handler().postDelayed(new C1186Uq(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.A01 = true;
        A04(i10, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean A0y = C0877Im.A0y(this.A02);
        String A01 = A01(0, 0, 53);
        if (A0y || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()));
            return;
        }
        this.A02.A0E().AHc(LT.A01(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()), A01 + webResourceRequest.getUrl()));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A05(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0E().AHe();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1012Ny.A02(C8E.A2b);
        O1 adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.AEC();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A08(url)) {
            WebResourceResponse A00 = A00();
            A05(webResourceRequest, A00);
            return A00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().ABV(str, new O8().A03(this.A07.get()).A02(this.A06.get()).A05());
        }
        if (A0C[2].charAt(27) != 'C') {
            throw new RuntimeException();
        }
        A0C[5] = "jV60qdj1rgKoRn";
        return true;
    }
}

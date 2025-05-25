package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.CJ.Eh;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ExpressClient.java */
/* loaded from: classes.dex */
public class hm extends com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh {
    public ArrayList<Integer> Qhi;
    private final tP cJ;

    public hm(Context context, NFd nFd, tP tPVar, com.bytedance.sdk.openadsdk.cJ.zc zcVar) {
        super(context, nFd, tPVar.HLI(), zcVar, false);
        this.Qhi = new ArrayList<>();
        this.cJ = tPVar;
    }

    private String ac() {
        tP tPVar = this.cJ;
        if (tPVar != null && tPVar.es() != null) {
            return this.cJ.es().zc();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int Qhi() {
        /*
            r5 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r5.Qhi
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = -1
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            r4 = 3
            if (r3 == r4) goto L27
            int r3 = r1.intValue()
            r4 = 2
            if (r3 == r4) goto L27
            int r3 = r1.intValue()
            if (r3 != r2) goto L6
        L27:
            int r0 = r1.intValue()
            return r0
        L2c:
            java.lang.String r0 = r5.ac()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L37
            return r2
        L37:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.nativeexpress.hm.Qhi():int");
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.ROR = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.Sf = false;
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("ExpressClient", "shouldInterceptRequest error1", th2);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.Qhi.cJ.Qhi Qhi = Qhi(webView, str);
            Qhi(currentTimeMillis, System.currentTimeMillis(), str, (Qhi == null || Qhi.Qhi() == null) ? 2 : 1);
            if (Qhi != null && Qhi.cJ() != 5) {
                Qhi.cJ();
                this.Qhi.add(Integer.valueOf(Qhi.cJ()));
            }
            if (Qhi != null && Qhi.Qhi() != null) {
                return Qhi.Qhi();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("ExpressClient", "shouldInterceptRequest error2", th2);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private com.bytedance.sdk.component.adexpress.Qhi.cJ.Qhi Qhi(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.hpZ hpz = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Eh.Qhi Qhi = Eh.Qhi(str);
        if (Qhi != Eh.Qhi.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.hpZ> it = this.cJ.cjC().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.hpZ next = it.next();
                if (!TextUtils.isEmpty(next.Qhi()) && !TextUtils.isEmpty(str)) {
                    String Qhi2 = next.Qhi();
                    if (Qhi2.startsWith(Constants.SCHEME)) {
                        Qhi2 = Qhi2.replaceFirst(Constants.SCHEME, "http");
                    }
                    if ((str.startsWith(Constants.SCHEME) ? str.replaceFirst(Constants.SCHEME, "http") : str).equals(Qhi2)) {
                        hpz = next;
                        break;
                    }
                }
            }
        }
        if (Qhi != Eh.Qhi.IMAGE && hpz == null) {
            return com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.Qhi(str, Qhi, "", ac());
        }
        com.bytedance.sdk.component.adexpress.Qhi.cJ.Qhi qhi = new com.bytedance.sdk.component.adexpress.Qhi.cJ.Qhi();
        qhi.Qhi(5);
        qhi.Qhi(Qhi(str, com.bytedance.sdk.openadsdk.core.nativeexpress.Qhi.cJ.Qhi(this.cJ, str)));
        return qhi;
    }

    private WebResourceResponse Qhi(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream Qhi = com.bytedance.sdk.openadsdk.ROR.fl.Qhi(str, str2);
            if (Qhi != null) {
                return new WebResourceResponse(Eh.Qhi.IMAGE.Qhi(), "utf-8", Qhi);
            }
            return null;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("ExpressClient", "get image WebResourceResponse error", th2);
            return null;
        }
    }

    private void Qhi(long j10, long j11, String str, int i10) {
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.Tgh;
        if (zcVar == null || zcVar.cJ() == null) {
            return;
        }
        Eh.Qhi Qhi = Eh.Qhi(str);
        if (Qhi == Eh.Qhi.HTML) {
            this.Tgh.cJ().Qhi(str, j10, j11, i10);
        } else if (Qhi == Eh.Qhi.JS) {
            this.Tgh.cJ().cJ(str, j10, j11, i10);
        }
    }
}

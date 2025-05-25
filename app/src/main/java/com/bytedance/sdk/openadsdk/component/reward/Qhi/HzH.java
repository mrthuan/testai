package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.common.api.Api;
import org.json.JSONObject;

/* compiled from: VastEndCardManager.java */
/* loaded from: classes.dex */
public class HzH implements com.bytedance.sdk.openadsdk.WAv.Sf {
    private ImageView CJ;
    private final Activity Qhi;
    private boolean ROR;
    private volatile boolean Sf;
    private com.bytedance.sdk.openadsdk.core.cJ.Sf Tgh;
    private int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private SSWebView f8793ac;
    private final tP cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8794fl;

    /* renamed from: hm  reason: collision with root package name */
    private final Qhi f8795hm;

    public HzH(Qhi qhi) {
        this.f8795hm = qhi;
        this.cJ = qhi.cJ;
        this.Qhi = qhi.FQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void CJ() {
        Qhi(Api.BaseClientBuilder.API_PRIORITY_OTHER, (String) null);
    }

    private void fl() {
        this.f8793ac.g_();
        Qhi(this.f8793ac);
        this.f8793ac.setDisplayZoomControls(false);
        this.f8793ac.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.HzH.4
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (i10 == 100) {
                    HzH.this.CJ();
                }
            }
        });
        this.f8793ac.setWebViewClient(new SSWebView.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.HzH.5
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                HzH.this.CJ();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                String str;
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (!webResourceRequest.isForMainFrame()) {
                    return;
                }
                int statusCode = webResourceResponse.getStatusCode();
                if (webResourceRequest.getUrl() != null) {
                    str = webResourceRequest.getUrl().toString();
                } else {
                    str = null;
                }
                HzH.this.Qhi(statusCode, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (HzH.this.Qhi(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    public boolean ac() {
        if (this.f8794fl) {
            ImageView imageView = this.CJ;
            if (imageView != null) {
                imageView.performClick();
                return true;
            }
            SSWebView sSWebView = this.f8793ac;
            if (sSWebView != null) {
                this.Tgh.onClick(sSWebView);
                return true;
            }
            return false;
        }
        return false;
    }

    public void cJ() {
        DeviceUtils.AudioInfoReceiver.cJ(this);
        SSWebView sSWebView = this.f8793ac;
        if (sSWebView != null) {
            lG.Qhi(sSWebView.getWebView());
        }
    }

    public void Qhi() {
        DeviceUtils.AudioInfoReceiver.Qhi(this);
        this.WAv = DeviceUtils.ROR();
        if (this.cJ.cJP() != null) {
            this.Tgh = new com.bytedance.sdk.openadsdk.core.cJ.Sf("VAST_END_CARD", this.cJ.cJP()) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.HzH.1
            };
            com.bytedance.sdk.openadsdk.core.ROR.ac ac2 = this.cJ.cJP().ac();
            if (ac2 != null) {
                final String fl2 = ac2.fl();
                if (!TextUtils.isEmpty(fl2)) {
                    this.f8794fl = true;
                    this.CJ = (ImageView) this.f8795hm.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Sf);
                    Qhi(ac2.cJ(), ac2.ac());
                    com.bytedance.sdk.openadsdk.ROR.fl.Qhi(fl2).Qhi(ac2.cJ()).cJ(ac2.ac()).fl(zn.CJ(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).CJ(zn.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).ac(2).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(this.cJ, fl2, new com.bytedance.sdk.component.fl.HzH<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.HzH.2
                        @Override // com.bytedance.sdk.component.fl.HzH
                        public void Qhi(com.bytedance.sdk.component.fl.zc<Bitmap> zcVar) {
                            if (HzH.this.CJ == null || zcVar == null) {
                                return;
                            }
                            Bitmap cJ = zcVar.cJ();
                            if (cJ != null) {
                                HzH.this.CJ.setImageBitmap(cJ);
                                HzH.this.ROR = true;
                                HzH.this.CJ();
                                return;
                            }
                            HzH.this.Qhi(-1, fl2);
                        }

                        @Override // com.bytedance.sdk.component.fl.HzH
                        public void Qhi(int i10, String str, Throwable th2) {
                            if (HzH.this.CJ != null) {
                                HzH.this.CJ.setVisibility(8);
                            }
                            HzH.this.Qhi(-2, fl2);
                        }
                    }));
                    return;
                }
                SSWebView sSWebView = (SSWebView) this.f8795hm.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.f9380hm);
                this.f8793ac = sSWebView;
                if (sSWebView == null) {
                    return;
                }
                fl();
                String CJ = ac2.CJ();
                if (CJ != null) {
                    this.f8794fl = true;
                    if (CJ.startsWith("http")) {
                        this.f8793ac.a_(CJ);
                        return;
                    }
                    String Qhi = com.bytedance.sdk.openadsdk.core.ROR.Tgh.Qhi(CJ);
                    String str = TextUtils.isEmpty(Qhi) ? CJ : Qhi;
                    this.f8793ac.setDefaultTextEncodingName("UTF -8");
                    this.f8793ac.Qhi(null, str, "text/html", "UTF-8", null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(final int i10, final String str) {
        if (this.Sf) {
            return;
        }
        this.Sf = true;
        final String Gm = this.cJ.cJP() != null ? this.cJ.cJP().Gm() : "";
        if (i10 == Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.cJ.ac.cJ(this.cJ, Gm, "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(new com.bytedance.sdk.component.Sf.hm("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.HzH.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i10);
                        jSONObject.put("error_code", i10);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put(InMobiNetworkValues.URL, str2);
                        }
                        com.bytedance.sdk.openadsdk.cJ.ac.cJ(HzH.this.cJ, Gm, "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void Qhi(SSWebView sSWebView) {
        sSWebView.setVerticalScrollBarEnabled(false);
        sSWebView.setHorizontalScrollBarEnabled(false);
        sSWebView.setMixedContentMode(0);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setDatabaseEnabled(true);
        sSWebView.setAppCacheEnabled(true);
        sSWebView.setAllowFileAccess(false);
        sSWebView.setSupportZoom(true);
        sSWebView.setBuiltInZoomControls(true);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        sSWebView.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Qhi(String str) {
        tP tPVar;
        if (str == null || (tPVar = this.cJ) == null || tPVar.cJP() == null || this.Tgh == null) {
            return false;
        }
        this.cJ.cJP().ROR(str);
        this.Tgh.onClick(this.f8793ac);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Qhi(int i10, int i11) {
        float f10;
        float f11;
        if (i10 == 0 || i11 == 0 || this.CJ == null) {
            return;
        }
        int ac2 = zn.ac((Context) this.Qhi);
        int CJ = zn.CJ((Context) this.Qhi);
        if (i10 / i11 <= ac2 / CJ) {
            ac2 = (int) Math.ceil(f11 * f10);
        } else {
            CJ = (int) Math.ceil(f11 / f10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.CJ.getLayoutParams();
        layoutParams.width = ac2;
        layoutParams.height = CJ;
        layoutParams.gravity = 17;
        this.CJ.setLayoutParams(layoutParams);
        this.CJ.setOnClickListener(this.Tgh);
        this.CJ.setOnTouchListener(this.Tgh);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean Qhi(pA pAVar) {
        com.bytedance.sdk.openadsdk.core.ROR.ac ac2;
        if (this.f8794fl) {
            ImageView imageView = this.CJ;
            if (imageView != null && this.ROR) {
                imageView.setVisibility(0);
            } else {
                SSWebView sSWebView = this.f8793ac;
                if (sSWebView != null) {
                    sSWebView.setVisibility(0);
                    if (this.f8793ac.getWebView() != null) {
                        this.f8793ac.getWebView().setOnTouchListener(this.Tgh);
                    }
                }
            }
            tP tPVar = this.cJ;
            if (tPVar == null || tPVar.cJP() == null || (ac2 = this.cJ.cJP().ac()) == null) {
                return true;
            }
            ac2.cJ(pAVar != null ? pAVar.ROR() : -1L);
            return true;
        }
        return false;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.cJ.Tgh tgh) {
        com.bytedance.sdk.openadsdk.core.cJ.Sf sf2 = this.Tgh;
        if (sf2 != null) {
            sf2.Qhi(tgh);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.WAv.Sf
    public void Qhi(int i10) {
        int i11 = this.WAv;
        if (i11 == 0 && i10 > 0) {
            this.cJ.cJP().Qhi().hm(this.f8795hm.bxS.ROR());
        } else if (i11 > 0 && i10 == 0) {
            this.cJ.cJP().Qhi().Sf(this.f8795hm.bxS.ROR());
        }
        this.WAv = i10;
    }
}

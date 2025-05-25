package com.bytedance.sdk.openadsdk.activity;

import a6.h;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.activity.f;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.hm;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.net.URLEncoder;

/* loaded from: classes.dex */
public class TTWebsiteActivity extends TTBaseActivity {
    private String Qhi = null;

    /* renamed from: ac  reason: collision with root package name */
    private WebView f8559ac;
    private hm cJ;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HzH.cJ(getApplicationContext());
        if (!iMK.fl()) {
            finish();
            return;
        }
        final String stringExtra = getIntent().getStringExtra("_extra_meta");
        String stringExtra2 = getIntent().getStringExtra("_extra_glo_d");
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setFitsSystemWindows(true);
        pAGLinearLayout.setBackgroundColor(-1);
        pAGLinearLayout.setId(520093726);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        try {
            setContentView(pAGLinearLayout);
            int cJ = zn.cJ(this, 5.0f);
            int cJ2 = zn.cJ(this, 8.0f);
            int cJ3 = zn.cJ(this, 10.0f);
            int cJ4 = zn.cJ(this, 12.0f);
            int cJ5 = zn.cJ(this, 14.0f);
            int cJ6 = zn.cJ(this, 20.0f);
            int cJ7 = zn.cJ(this, 24.0f);
            int cJ8 = zn.cJ(this, 40.0f);
            int cJ9 = zn.cJ(this, 44.0f);
            int cJ10 = zn.cJ(this, 191.0f);
            PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this);
            pAGRelativeLayout.setGravity(15);
            pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, cJ9));
            PAGImageView pAGImageView = new PAGImageView(this);
            pAGImageView.setId(520093720);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(cJ8, cJ9);
            layoutParams.setMarginStart(cJ2);
            pAGImageView.setLayoutParams(layoutParams);
            pAGImageView.setClickable(true);
            pAGImageView.setFocusable(true);
            pAGImageView.setPadding(cJ5, cJ4, cJ5, cJ4);
            pAGImageView.setImageDrawable(MQ.ac(this, "tt_ad_arrow_backward"));
            final PAGImageView pAGImageView2 = new PAGImageView(this);
            pAGImageView2.setId(520093716);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(cJ8, cJ9);
            layoutParams2.addRule(17, 520093720);
            pAGImageView2.setLayoutParams(layoutParams2);
            pAGImageView2.setClickable(true);
            pAGImageView2.setFocusable(true);
            pAGImageView2.setPadding(cJ4, cJ5, cJ4, cJ5);
            pAGImageView2.setImageDrawable(MQ.ac(this, "tt_ad_xmark"));
            PAGTextView pAGTextView = new PAGTextView(this);
            pAGTextView.setId(com.bytedance.sdk.openadsdk.utils.iMK.DaO);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(cJ10, cJ7);
            layoutParams3.setMarginStart(cJ);
            layoutParams3.addRule(15);
            layoutParams3.addRule(16, 520093741);
            layoutParams3.addRule(17, 520093716);
            pAGTextView.setLayoutParams(layoutParams3);
            pAGTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            pAGTextView.setGravity(17);
            pAGTextView.setSingleLine(true);
            pAGTextView.setTextColor(Color.parseColor("#222222"));
            pAGTextView.setTextSize(17.0f);
            PAGImageView pAGImageView3 = new PAGImageView(this);
            pAGImageView3.setId(520093741);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(cJ8, cJ9);
            layoutParams4.addRule(16, 520093742);
            pAGImageView3.setLayoutParams(layoutParams4);
            pAGImageView3.setPadding(cJ3, cJ4, cJ3, cJ4);
            pAGImageView3.setImageDrawable(MQ.ac(this, "tt_ad_link"));
            PAGImageView pAGImageView4 = new PAGImageView(this);
            pAGImageView4.setId(520093742);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(cJ8, cJ9);
            layoutParams5.addRule(21);
            layoutParams5.setMarginEnd(cJ2);
            pAGImageView4.setLayoutParams(layoutParams5);
            pAGImageView4.setPadding(cJ4, cJ6, cJ4, cJ6);
            pAGImageView4.setImageDrawable(MQ.ac(this, "tt_ad_threedots"));
            final PAGProgressBar pAGProgressBar = new PAGProgressBar(this, null, 16973855);
            pAGProgressBar.setId(520093743);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, zn.cJ(this, 2.0f));
            layoutParams6.addRule(12);
            pAGProgressBar.setLayoutParams(layoutParams6);
            pAGProgressBar.setProgress(1);
            pAGProgressBar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.hm.Qhi(this, "tt_privacy_progress_style"));
            View view = new View(this);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, zn.cJ(this, 1.0f));
            layoutParams7.addRule(12);
            view.setLayoutParams(layoutParams7);
            pAGRelativeLayout.addView(pAGImageView);
            pAGRelativeLayout.addView(pAGImageView2);
            pAGRelativeLayout.addView(pAGTextView);
            pAGRelativeLayout.addView(pAGImageView3);
            pAGRelativeLayout.addView(pAGImageView4);
            pAGRelativeLayout.addView(pAGProgressBar);
            pAGRelativeLayout.addView(view);
            pAGLinearLayout.addView(pAGRelativeLayout);
            try {
                WebView webView = new WebView(this);
                this.f8559ac = webView;
                webView.setBackgroundColor(-1);
                pAGLinearLayout.addView(this.f8559ac, new ViewGroup.LayoutParams(-1, -1));
                pAGImageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.f8559ac.canGoBack()) {
                            TTWebsiteActivity.this.f8559ac.goBack();
                        } else {
                            TTWebsiteActivity.this.finish();
                        }
                    }
                });
                pAGImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.this.finish();
                    }
                });
                pAGImageView2.setVisibility(4);
                pAGImageView2.setClickable(false);
                pAGTextView.setText(MQ.Qhi(this, "tt_privacy_title"));
                pAGImageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String url = TTWebsiteActivity.this.f8559ac.getUrl();
                        if (!TextUtils.isEmpty(url)) {
                            intent.setData(Uri.parse(url));
                            com.bytedance.sdk.component.utils.cJ.Qhi(TTWebsiteActivity.this, intent, null);
                        }
                    }
                });
                pAGImageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TTWebsiteActivity.this.cJ == null) {
                            TTWebsiteActivity.this.cJ = new hm(TTWebsiteActivity.this);
                            TTWebsiteActivity.this.cJ.Qhi(stringExtra);
                            TTWebsiteActivity.this.cJ.setCanceledOnTouchOutside(false);
                        }
                        TTWebsiteActivity.this.cJ.show();
                    }
                });
                if (HzH.CJ() != null) {
                    this.Qhi = HzH.CJ().es();
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        String encode = URLEncoder.encode(stringExtra2);
                        if (this.Qhi.contains("?")) {
                            this.Qhi = f.o(new StringBuilder(), this.Qhi, "&gdid_encrypted=", encode);
                        } else {
                            this.Qhi = f.o(new StringBuilder(), this.Qhi, "?gdid_encrypted=", encode);
                        }
                    }
                }
                if (this.Qhi != null) {
                    WebSettings settings = this.f8559ac.getSettings();
                    settings.setMixedContentMode(0);
                    try {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setSavePassword(false);
                        settings.setAllowFileAccess(false);
                    } catch (Throwable unused) {
                    }
                    try {
                        this.f8559ac.loadUrl(this.Qhi, h.h("Referer", TTAdConstant.REQUEST_HEAD_REFERER));
                    } catch (Throwable unused2) {
                        this.f8559ac.loadUrl(this.Qhi);
                    }
                    this.f8559ac.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                        @Override // android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView2, int i10) {
                            super.onProgressChanged(webView2, i10);
                            if (pAGProgressBar != null && !TTWebsiteActivity.this.isFinishing()) {
                                if (i10 == 100) {
                                    pAGProgressBar.setVisibility(8);
                                    if (webView2.canGoBack()) {
                                        pAGImageView2.setVisibility(0);
                                        pAGImageView2.setClickable(true);
                                        return;
                                    }
                                    pAGImageView2.setVisibility(4);
                                    pAGImageView2.setClickable(false);
                                    return;
                                }
                                pAGProgressBar.setVisibility(0);
                                pAGProgressBar.setProgress(i10);
                            }
                        }
                    });
                    this.f8559ac.setWebViewClient(new SSWebView.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView2, String str) {
                            super.onPageFinished(webView2, str);
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            super.onReceivedError(webView2, webResourceRequest, webResourceError);
                            ABk.Qhi("TTAD.TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                            ABk.Qhi("TTAD.TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=".concat(String.valueOf(webResourceResponse)));
                        }

                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                            if (webView2 != null && webResourceRequest != null) {
                                webView2.loadUrl(webResourceRequest.getUrl().toString());
                                return true;
                            }
                            return false;
                        }

                        @Override // android.webkit.WebViewClient
                        public void onReceivedError(WebView webView2, int i10, String str, String str2) {
                            super.onReceivedError(webView2, i10, str, str2);
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.widget.Qhi.ac.cJ(this.f8559ac);
                    return;
                }
                finish();
            } catch (Exception e10) {
                ABk.Qhi("TTAD.TTWebsiteActivity", "onCreate: ", e10);
                finish();
            }
        } catch (Throwable unused3) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        lG.Qhi(this.f8559ac);
    }

    public static void Qhi(Context context, tP tPVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(System.currentTimeMillis(), tPVar, str, "open_policy");
        if (TextUtils.isEmpty(HzH.CJ().es())) {
            return;
        }
        Intent intent = new Intent(context, TTWebsiteActivity.class);
        if (tPVar != null) {
            intent.putExtra("_extra_meta", tPVar.SO().toString());
            intent.putExtra("_extra_glo_d", tPVar.MIe());
        }
        com.bytedance.sdk.component.utils.cJ.Qhi(context, intent, null);
    }
}

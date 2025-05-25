package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONObject;

/* compiled from: TTBottomNewStyleManager.java */
/* loaded from: classes.dex */
public class Sf {
    private final String CJ;
    private final LinearLayout Qhi;
    private ImageView ROR;
    private ROR.Qhi Sf;
    private ImageView Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final tP f8721ac;
    private final SSWebView cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final Context f8722fl;

    public Sf(Context context, LinearLayout linearLayout, SSWebView sSWebView, tP tPVar, String str) {
        this.f8722fl = context;
        this.Qhi = linearLayout;
        this.cJ = sSWebView;
        this.f8721ac = tPVar;
        this.CJ = str;
        ac();
    }

    private void ac() {
        this.Tgh = (ImageView) this.Qhi.findViewById(iMK.Ura);
        this.ROR = (ImageView) this.Qhi.findViewById(iMK.PER);
        this.Tgh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Sf.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Sf.this.cJ != null && Sf.this.cJ.fl()) {
                    if (Sf.this.Sf != null) {
                        Sf.this.Sf.Qhi();
                    }
                    Sf.this.Qhi("backward");
                    Sf.this.cJ.Tgh();
                }
            }
        });
        this.ROR.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Sf.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Sf.this.cJ != null && Sf.this.cJ.ROR()) {
                    Sf.this.Qhi("forward");
                    Sf.this.cJ.Sf();
                }
            }
        });
        ((ImageView) this.Qhi.findViewById(iMK.Gy)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Sf.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Sf.this.cJ != null) {
                    Sf.this.cJ("refresh");
                    Sf.this.cJ.CJ();
                }
            }
        });
        ((ImageView) this.Qhi.findViewById(iMK.et)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Sf.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Sf.this.cJ != null) {
                    Sf.this.cJ("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = Sf.this.cJ.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        com.bytedance.sdk.component.utils.cJ.Qhi(Sf.this.f8722fl, intent, null);
                    }
                }
            }
        });
        this.Qhi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.Sf.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.Tgh.setClickable(false);
        this.ROR.setClickable(false);
        this.Tgh.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.ROR.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    public void Qhi(WebView webView, ROR.Qhi qhi) {
        this.Sf = qhi;
        try {
            if (this.Tgh != null) {
                if (webView.canGoBack()) {
                    this.Tgh.setClickable(true);
                    this.Tgh.clearColorFilter();
                } else {
                    this.Tgh.setClickable(false);
                    this.Tgh.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.ROR != null) {
                if (webView.canGoForward()) {
                    this.ROR.setClickable(true);
                    this.ROR.clearColorFilter();
                    return;
                }
                this.ROR.setClickable(false);
                this.ROR.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
            }
        } catch (Throwable unused) {
        }
    }

    public void cJ() {
        if (this.Qhi.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.Qhi, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.cJ.getWebView() != null && (copyBackForwardList = this.cJ.getWebView().copyBackForwardList()) != null) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.cJ.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(InMobiNetworkValues.URL, url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(System.currentTimeMillis(), this.f8721ac, this.CJ, str, jSONObject, (com.bytedance.sdk.openadsdk.cJ.Sf) null, (com.bytedance.sdk.openadsdk.cJ.cJ.Qhi) null);
    }

    public void Qhi() {
        if (this.Qhi.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.Qhi, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.cJ.getWebView() != null && (copyBackForwardList = this.cJ.getWebView().copyBackForwardList()) != null) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.cJ.getUrl();
                }
                String url2 = str.equals("backward") ? copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl() : "";
                int i10 = 1;
                if (str.equals("forward")) {
                    url2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(InMobiNetworkValues.URL, url);
                jSONObject2.putOpt("next_url", url2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i10 = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i10));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(System.currentTimeMillis(), this.f8721ac, this.CJ, str, jSONObject, (com.bytedance.sdk.openadsdk.cJ.Sf) null, (com.bytedance.sdk.openadsdk.cJ.cJ.Qhi) null);
    }
}

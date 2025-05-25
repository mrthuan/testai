package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.cJ.zc;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserDownloadButton;
import com.bytedance.sdk.openadsdk.common.LandingPageBrowserNewBottomBar;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.common.Sf;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowImageView;
import com.bytedance.sdk.openadsdk.core.widget.ShadowTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity {
    private LandingPageLoadingLayout Dq;
    private com.bytedance.sdk.openadsdk.common.cJ EGK;
    private View Hf;
    private View NBs;
    TTAdDislikeToast Qe;
    private LinearLayout ReL;
    private boolean dI;
    TTAdDislikeDialog dIT;
    private TextView dVA;
    private PAGLogoView gga;
    private boolean oU;
    private long ots;
    private Sf pv;
    private TextView zjb;
    private boolean HLI = false;
    final AtomicBoolean YB = new AtomicBoolean(false);
    final AtomicBoolean cjC = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void HzH() {
        TTAdDislikeToast tTAdDislikeToast;
        if (!isFinishing() && (tTAdDislikeToast = this.Qe) != null) {
            tTAdDislikeToast.Qhi(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void hpZ() {
        try {
            if (this.dIT == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.f8554fl, this.hpZ);
                this.dIT = tTAdDislikeDialog;
                tTAdDislikeDialog.setDislikeSource("landing_page");
                this.dIT.setCallback(new TTAdDislikeDialog.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                    public void Qhi(View view) {
                        TTVideoLandingPageLink2Activity.this.YB.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                    public void cJ(View view) {
                        TTVideoLandingPageLink2Activity.this.YB.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.Qhi
                    public void Qhi(int i10, FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.cjC.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.cjC.set(true);
                        TTVideoLandingPageLink2Activity.this.HzH();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(16908290);
            frameLayout.addView(this.dIT);
            if (this.Qe == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.f8554fl);
                this.Qe = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LandingPageLoadingLayout landingPageLoadingLayout = this.Dq;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.Qhi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        tP tPVar;
        SSWebView sSWebView;
        long j10;
        super.onCreate(bundle);
        if (iMK.fl() && (tPVar = this.hpZ) != null && (sSWebView = this.Qhi) != null) {
            com.bytedance.sdk.openadsdk.common.cJ Qhi = js.Qhi(tPVar, sSWebView, this.f8554fl, this.lB);
            this.EGK = Qhi;
            if (Qhi != null) {
                Qhi.Qhi("landingpage_split_screen");
            }
            this.oU = HzH.CJ().bxS();
            if (this.Qhi.getWebView() != null) {
                this.Qhi.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                    @Override // android.view.View.OnScrollChangeListener
                    public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                        zc zcVar = TTVideoLandingPageLink2Activity.this.FQ;
                        if (zcVar != null) {
                            zcVar.cJ(i11);
                        }
                    }
                });
            }
            this.Qhi.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh(this.f8554fl, this.WAv, this.Sf, this.EGK, this.FQ, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTVideoLandingPageLink2Activity.this.Hf != null && !TTVideoLandingPageLink2Activity.this.dI) {
                            TTVideoLandingPageLink2Activity.this.Hf.setVisibility(8);
                        }
                        if (TTVideoLandingPageLink2Activity.this.ReL != null) {
                            TTVideoLandingPageLink2Activity.this.ReL.setVisibility(0);
                        }
                        TTVideoLandingPageLink2Activity.this.HLI = true;
                        TTVideoLandingPageLink2Activity.this.iMK();
                        TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tTVideoLandingPageLink2Activity.hpZ, tTVideoLandingPageLink2Activity.lB, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.ots, true);
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    TTVideoLandingPageLink2Activity.this.ots = System.currentTimeMillis();
                }
            });
            this.Qhi.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.fl(this.WAv, this.FQ, this.EGK) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.fl, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (TTVideoLandingPageLink2Activity.this.oU && TTVideoLandingPageLink2Activity.this.pv != null && i10 == 100) {
                        TTVideoLandingPageLink2Activity.this.pv.Qhi(webView, TTVideoLandingPageLink2Activity.this.jPH);
                    }
                    if (TTVideoLandingPageLink2Activity.this.Dq != null) {
                        TTVideoLandingPageLink2Activity.this.Dq.Qhi(i10);
                    }
                }
            });
            TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.iMK.czB);
            if (textView != null && this.hpZ.hm() != null) {
                textView.setText(this.hpZ.hm().fl());
            }
            tP tPVar2 = this.hpZ;
            if (tPVar2 != null && tPVar2.hm() != null) {
                j10 = this.hpZ.hm().Qhi() * 1000;
            } else {
                j10 = 10000;
            }
            iMK.ac().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TTVideoLandingPageLink2Activity.this.dI = true;
                        if (TTVideoLandingPageLink2Activity.this.Dq != null) {
                            TTVideoLandingPageLink2Activity.this.Dq.cJ();
                        }
                        TTVideoLandingPageLink2Activity.this.NBs.setVisibility(0);
                        if (TTVideoLandingPageLink2Activity.this.gga != null) {
                            TTVideoLandingPageLink2Activity.this.gga.setVisibility(0);
                        }
                        if (!TTVideoLandingPageLink2Activity.this.HLI) {
                            TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tTVideoLandingPageLink2Activity.hpZ, tTVideoLandingPageLink2Activity.lB, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.ots, false);
                        }
                    } catch (Exception unused) {
                    }
                }
            }, j10);
            return;
        }
        finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    public void onDestroy() {
        iMK();
        if (!this.dI && this.FQ != null && this.Qhi != null && this.Dq.getVisibility() == 8) {
            this.FQ.Qhi(this.Qhi);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ABk() {
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.hpZ, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iMK() {
        LandingPageLoadingLayout landingPageLoadingLayout = this.Dq;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.cJ();
        }
    }

    private void pA() {
        TTAdDislikeToast tTAdDislikeToast = this.Qe;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.Qhi(TTAdDislikeToast.getDislikeTip());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void CJ() {
        if (fl()) {
            super.CJ();
            NativeVideoTsView nativeVideoTsView = this.iMK;
            if (nativeVideoTsView != null) {
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.iMK.getNativeVideoController().Qhi(false);
                    ((com.bytedance.sdk.openadsdk.core.video.nativevideo.ac) this.iMK.getNativeVideoController()).ROR(false);
                    this.f8557zc.setClickable(true);
                    this.f8557zc.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 0) {
                                TTVideoLandingPageLink2Activity.this.ABk();
                                return false;
                            }
                            return false;
                        }
                    });
                }
                this.iMK.getNativeVideoController().Qhi(new fl.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
                    public void Qhi() {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
                    public void Qhi(long j10, int i10) {
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
                    public void Qhi(long j10, long j11) {
                        if (TTVideoLandingPageLink2Activity.this.dVA != null) {
                            int max = (int) Math.max(0L, (j11 - j10) / 1000);
                            TTVideoLandingPageLink2Activity.this.dVA.setText(String.valueOf(max));
                            if (max <= 0) {
                                TTVideoLandingPageLink2Activity.this.dVA.setVisibility(8);
                            }
                        }
                    }

                    @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.Qhi
                    public void cJ(long j10, int i10) {
                    }
                });
                return;
            }
            return;
        }
        try {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.hpZ.cjC().get(0), imageView, this.hpZ);
            this.f8557zc.setVisibility(0);
            this.f8557zc.removeAllViews();
            this.f8557zc.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.openadsdk.cJ.ac.cJ(TTVideoLandingPageLink2Activity.this.hpZ, "landingpage_split_screen");
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void ac() {
        super.ac();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(MQ.Qhi(HzH.Qhi(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.zc();
                }
            });
        }
        this.dVA = (TextView) findViewById(520093714);
        this.Dq = (LandingPageLoadingLayout) findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Qe);
        this.Hf = findViewById(com.bytedance.sdk.openadsdk.utils.iMK.dIT);
        this.NBs = findViewById(com.bytedance.sdk.openadsdk.utils.iMK.f9386zn);
        TextView textView2 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.iMK.cjC);
        TextView textView3 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Dq);
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) findViewById(com.bytedance.sdk.openadsdk.utils.iMK.YB);
        this.zjb = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Hf);
        if (this.hpZ.dIT() != null && !TextUtils.isEmpty(this.hpZ.dIT().Qhi())) {
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.hpZ.dIT(), tTRoundRectImageView, this.hpZ);
        }
        textView2.setText(this.hpZ.PAe());
        textView3.setText(this.hpZ.zjb());
        findViewById(com.bytedance.sdk.openadsdk.utils.iMK.NBs).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.Qhi(tTVideoLandingPageLink2Activity.f8554fl, tTVideoLandingPageLink2Activity.hpZ, tTVideoLandingPageLink2Activity.lB);
            }
        });
        SSWebView sSWebView = this.Qhi;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            js.Qhi(this.hpZ, this.Qhi);
        }
        boolean bxS = HzH.CJ().bxS();
        this.oU = bxS;
        if (bxS) {
            ((PangleViewStub) findViewById(com.bytedance.sdk.openadsdk.utils.iMK.dVA)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Ri);
            this.ReL = linearLayout;
            linearLayout.setVisibility(8);
            this.pv = new Sf(this, this.ReL, this.Qhi, this.hpZ, "landingpage_split_screen");
            if (this.Qhi.getWebView() != null) {
                this.Qhi.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    float Qhi = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.Qhi = motionEvent.getY();
                        }
                        zc zcVar = TTVideoLandingPageLink2Activity.this.FQ;
                        if (zcVar != null) {
                            zcVar.Qhi(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.EGK != null) {
                            TTVideoLandingPageLink2Activity.this.EGK.Qhi(motionEvent);
                        }
                        if (motionEvent.getAction() == 2) {
                            float y10 = motionEvent.getY();
                            float f10 = this.Qhi;
                            if (y10 - f10 > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.pv != null) {
                                    TTVideoLandingPageLink2Activity.this.pv.Qhi();
                                }
                                return false;
                            } else if (y10 - f10 < -8.0f && TTVideoLandingPageLink2Activity.this.pv != null) {
                                TTVideoLandingPageLink2Activity.this.pv.cJ();
                            }
                        }
                        return false;
                    }
                });
            }
        } else if (this.Qhi.getWebView() != null) {
            this.Qhi.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    zc zcVar = TTVideoLandingPageLink2Activity.this.FQ;
                    if (zcVar != null) {
                        zcVar.Qhi(motionEvent);
                    }
                    if (TTVideoLandingPageLink2Activity.this.EGK != null) {
                        TTVideoLandingPageLink2Activity.this.EGK.Qhi(motionEvent);
                        return false;
                    }
                    return false;
                }
            });
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.Dq;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.Qhi(this.hpZ);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public boolean fl() {
        int i10 = this.ABk;
        return i10 == 5 || i10 == 15 || i10 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void hm() {
        super.hm();
        tP tPVar = this.hpZ;
        if (tPVar != null) {
            tPVar.Tgh(true);
        }
        TextView textView = this.zjb;
        if (textView != null) {
            textView.setText(cJ());
            this.zjb.setClickable(true);
            this.zjb.setOnClickListener(this.MND);
            this.zjb.setOnTouchListener(this.MND);
        }
    }

    public void zc() {
        if (isFinishing()) {
            return;
        }
        if (this.cjC.get()) {
            pA();
            return;
        }
        if (this.dIT == null) {
            hpZ();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.dIT;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.Qhi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public View Qhi() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this);
        pAGLinearLayout.setFitsSystemWindows(true);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setBackgroundColor(-1);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(this);
        pAGLinearLayout.addView(pAGFrameLayout, new LinearLayout.LayoutParams(-1, zn.cJ(this, 220.0f)));
        View pAGFrameLayout2 = new PAGFrameLayout(this);
        pAGFrameLayout2.setId(com.bytedance.sdk.openadsdk.utils.iMK.es);
        pAGFrameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setPadding(0, zn.cJ(this, 20.0f), 0, 0);
        pAGFrameLayout.addView(pAGLinearLayout2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout2.addView(view, layoutParams);
        ShadowTextView shadowTextView = new ShadowTextView(this);
        shadowTextView.setId(520093713);
        shadowTextView.setGravity(17);
        shadowTextView.setText(MQ.cJ(this, "tt_reward_feedback"));
        shadowTextView.setTextColor(-1);
        shadowTextView.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, zn.cJ(this, 28.0f));
        int cJ = zn.cJ(this, 16.0f);
        layoutParams2.rightMargin = cJ;
        layoutParams2.leftMargin = cJ;
        pAGLinearLayout2.addView(shadowTextView, layoutParams2);
        ShadowImageView shadowImageView = new ShadowImageView(this);
        shadowImageView.setId(com.bytedance.sdk.openadsdk.utils.iMK.yN);
        shadowImageView.setPadding(zn.cJ(this, 7.0f), zn.cJ(this, 7.0f), zn.cJ(this, 7.0f), zn.cJ(this, 7.0f));
        shadowImageView.setImageResource(MQ.CJ(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(zn.cJ(this, 28.0f), zn.cJ(this, 28.0f));
        layoutParams3.rightMargin = zn.cJ(this, 12.0f);
        pAGLinearLayout2.addView(shadowImageView, layoutParams3);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(this);
        pAGRelativeLayout.setVisibility(8);
        pAGRelativeLayout.setId(com.bytedance.sdk.openadsdk.utils.iMK.FQ);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = zn.cJ(this, 10.0f);
        pAGLinearLayout.addView(pAGRelativeLayout, layoutParams4);
        CornerIV cornerIV = new CornerIV(this);
        cornerIV.setId(com.bytedance.sdk.openadsdk.utils.iMK.PAe);
        cornerIV.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        cornerIV.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(zn.cJ(this, 44.0f), zn.cJ(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = zn.cJ(this, 5.0f);
        pAGRelativeLayout.addView(cornerIV, layoutParams5);
        PAGTextView pAGTextView = new PAGTextView(this);
        int i10 = com.bytedance.sdk.openadsdk.utils.iMK.f9381ip;
        pAGTextView.setId(i10);
        pAGTextView.setBackground(hm.Qhi(this, "tt_circle_solid_mian"));
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 19.0f);
        pAGTextView.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(zn.cJ(this, 44.0f), zn.cJ(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = zn.cJ(this, 5.0f);
        pAGRelativeLayout.addView(pAGTextView, layoutParams6);
        PAGTextView pAGTextView2 = new PAGTextView(this);
        pAGTextView2.setId(com.bytedance.sdk.openadsdk.utils.iMK.xyz);
        pAGTextView2.setMaxLines(1);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setTextColor(Color.parseColor("#e5000000"));
        pAGTextView2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = zn.cJ(this, 5.0f);
        layoutParams7.rightMargin = zn.cJ(this, 80.0f);
        layoutParams7.addRule(1, i10);
        pAGRelativeLayout.addView(pAGTextView2, layoutParams7);
        PAGTextView pAGTextView3 = new PAGTextView(this);
        pAGTextView3.setId(com.bytedance.sdk.openadsdk.utils.iMK.jPH);
        pAGTextView3.setClickable(true);
        pAGTextView3.setMaxLines(1);
        pAGTextView3.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView3.setFocusable(true);
        pAGTextView3.setGravity(17);
        pAGTextView3.setText(MQ.cJ(this, "tt_video_mobile_go_detail"));
        pAGTextView3.setTextColor(-1);
        pAGTextView3.setTextSize(2, 14.0f);
        pAGTextView3.setPadding(zn.cJ(this, 2.0f), zn.cJ(this, 2.0f), zn.cJ(this, 2.0f), zn.cJ(this, 2.0f));
        pAGTextView3.setBackground(hm.Qhi(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(zn.cJ(this, 90.0f), zn.cJ(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = zn.cJ(this, 5.0f);
        pAGRelativeLayout.addView(pAGTextView3, layoutParams8);
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(this);
        pAGLinearLayout.addView(pAGFrameLayout3, new LinearLayout.LayoutParams(-1, -1));
        View sSWebView = new SSWebView(this);
        sSWebView.setId(com.bytedance.sdk.openadsdk.utils.iMK.MND);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = zn.cJ(this, 2.0f);
        pAGFrameLayout3.addView(sSWebView, layoutParams9);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(this);
        pAGRelativeLayout2.setId(com.bytedance.sdk.openadsdk.utils.iMK.dIT);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        pAGFrameLayout3.addView(pAGRelativeLayout2, new FrameLayout.LayoutParams(-1, -1));
        View landingPageLoadingLayout = new LandingPageLoadingLayout(this);
        landingPageLoadingLayout.setId(com.bytedance.sdk.openadsdk.utils.iMK.Qe);
        pAGRelativeLayout2.addView(landingPageLoadingLayout, new RelativeLayout.LayoutParams(-1, -1));
        PAGLinearLayout pAGLinearLayout3 = new PAGLinearLayout(this);
        pAGLinearLayout3.setId(com.bytedance.sdk.openadsdk.utils.iMK.f9386zn);
        pAGLinearLayout3.setOrientation(1);
        pAGLinearLayout3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        pAGRelativeLayout2.addView(pAGLinearLayout3, layoutParams10);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this);
        tTRoundRectImageView.setId(com.bytedance.sdk.openadsdk.utils.iMK.YB);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(zn.cJ(this, 80.0f), zn.cJ(this, 80.0f));
        layoutParams11.gravity = 17;
        pAGLinearLayout3.addView(tTRoundRectImageView, layoutParams11);
        PAGTextView pAGTextView4 = new PAGTextView(this);
        pAGTextView4.setId(com.bytedance.sdk.openadsdk.utils.iMK.cjC);
        pAGTextView4.setTextColor(Color.parseColor("#161823"));
        pAGTextView4.setTextSize(0, zn.cJ(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = zn.cJ(this, 12.0f);
        pAGLinearLayout3.addView(pAGTextView4, layoutParams12);
        PAGTextView pAGTextView5 = new PAGTextView(this);
        pAGTextView5.setId(com.bytedance.sdk.openadsdk.utils.iMK.Dq);
        pAGTextView5.setTextColor(Color.parseColor("#80161823"));
        pAGTextView5.setTextSize(0, zn.cJ(this, 16.0f));
        pAGTextView5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int cJ2 = zn.cJ(this, 60.0f);
        layoutParams13.rightMargin = cJ2;
        layoutParams13.leftMargin = cJ2;
        layoutParams13.topMargin = zn.cJ(this, 8.0f);
        pAGLinearLayout3.addView(pAGTextView5, layoutParams13);
        PAGTextView pAGTextView6 = new PAGTextView(this);
        pAGTextView6.setId(com.bytedance.sdk.openadsdk.utils.iMK.Hf);
        pAGTextView6.setGravity(17);
        pAGTextView6.setTextColor(-1);
        pAGTextView6.setText(MQ.cJ(this, "tt_video_mobile_go_detail"));
        pAGTextView6.setBackground(hm.Qhi(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(zn.cJ(this, 255.0f), zn.cJ(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = zn.cJ(this, 32.0f);
        pAGLinearLayout3.addView(pAGTextView6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.gga = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.iMK.NBs);
        this.gga.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, zn.cJ(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = zn.cJ(this, 18.0f);
        layoutParams15.bottomMargin = zn.cJ(this, 61.0f);
        pAGRelativeLayout2.addView(this.gga, layoutParams15);
        View pangleViewStub = new PangleViewStub(this, new PangleViewStub.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.Qhi
            public View Qhi(Context context) {
                return new LandingPageBrowserDownloadButton(context);
            }
        });
        pangleViewStub.setId(com.bytedance.sdk.openadsdk.utils.iMK.dI);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, zn.cJ(this, 48.0f));
        layoutParams16.gravity = 81;
        pAGFrameLayout3.addView(pangleViewStub, layoutParams16);
        View pangleViewStub2 = new PangleViewStub(this, new PangleViewStub.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.PangleViewStub.Qhi
            public View Qhi(Context context) {
                return new LandingPageBrowserNewBottomBar(context);
            }
        });
        pangleViewStub2.setId(com.bytedance.sdk.openadsdk.utils.iMK.dVA);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, zn.cJ(this, 44.0f));
        layoutParams17.gravity = 80;
        pAGFrameLayout3.addView(pangleViewStub2, layoutParams17);
        return pAGLinearLayout;
    }
}

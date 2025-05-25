package com.bytedance.sdk.openadsdk.core.model;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.cJ.ac;
import com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LandingPageModel.java */
/* loaded from: classes.dex */
public class HzH implements Handler.Callback {
    com.bytedance.sdk.openadsdk.core.cJ.Qhi ABk;
    FrameLayout CJ;
    private LandingPageLoadingLayout CQU;
    private int Dq;
    private FrameLayout Dww;
    private NFd EBS;
    private ImageView Eh;
    private boolean FQ;
    ObjectAnimator Gm;
    private com.bytedance.sdk.openadsdk.common.cJ Hf;
    private View HzH;
    private final com.bytedance.sdk.openadsdk.core.video.ac.cJ Jma;
    private ILoader MND;
    private TTRoundRectImageView MQ;
    private long NFd;
    ImageView Qhi;
    final tP ROR;
    FrameLayout Sf;
    RelativeLayout Tgh;
    ObjectAnimator WAv;
    private View aP;

    /* renamed from: ac  reason: collision with root package name */
    TextView f9071ac;
    private SSWebView bxS;
    FrameLayout cJ;
    private int cjC;
    private com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl es;

    /* renamed from: fl  reason: collision with root package name */
    View f9072fl;

    /* renamed from: hm  reason: collision with root package name */
    ObjectAnimator f9073hm;
    private View hpZ;
    com.bytedance.sdk.openadsdk.core.cJ.cJ iMK;

    /* renamed from: ip  reason: collision with root package name */
    private boolean f9074ip;
    private String jPH;
    private final View js;
    private TextView kYc;
    private final Activity lB;
    private String lG;
    private Handler pA;
    private View pM;
    private TextView qMt;
    private TextView tP;
    private com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh xyz;
    private com.bytedance.sdk.openadsdk.cJ.zc yN;

    /* renamed from: zc  reason: collision with root package name */
    fl.Qhi f9075zc;

    /* renamed from: zn  reason: collision with root package name */
    private int f9076zn;
    private final AtomicBoolean sDy = new AtomicBoolean(false);
    private final AtomicBoolean PAe = new AtomicBoolean(false);
    private volatile int dIT = 0;
    private volatile int Qe = 0;
    private volatile int YB = 0;

    public HzH(Activity activity, final tP tPVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar, View view) {
        int i10;
        this.lB = activity;
        this.ROR = tPVar;
        this.lG = str;
        this.Jma = cJVar;
        this.js = view;
        this.f9076zn = js.Qhi(str);
        if (tPVar != null) {
            this.jPH = tPVar.Ri();
        }
        if (!TextUtils.isEmpty(this.jPH)) {
            this.MND = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().cJ();
            int Qhi = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(this.MND, this.jPH);
            this.cjC = Qhi;
            if (Qhi > 0) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.Dq = i10;
        }
        boolean ac2 = ac(tPVar);
        boolean CJ = CJ(tPVar);
        if (cJ(tPVar)) {
            this.lG = "landingpage_split_screen";
        } else if (ac2) {
            this.lG = "landingpage_direct";
        } else if (CJ) {
            this.lG = "aggregate_page";
        }
        this.ABk = new com.bytedance.sdk.openadsdk.core.cJ.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), tPVar, this.lG, js.Qhi(str));
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        this.ABk.Qhi(hashMap);
        View findViewById = activity.findViewById(16908290);
        this.ABk.Qhi(findViewById);
        com.bytedance.sdk.openadsdk.core.cJ.cJ cJVar2 = new com.bytedance.sdk.openadsdk.core.cJ.cJ(activity, tPVar, this.lG, js.Qhi(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.1
            @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ
            public boolean Qhi(Gm gm2, Map<String, Object> map) {
                if (HzH.ROR(tPVar) && HzH.this.xyz != null) {
                    HzH.this.xyz.Qhi(gm2);
                    HzH.this.xyz.Qhi(map);
                    if (HzH.Tgh(HzH.this.ROR) || HzH.this.f9074ip) {
                        return true;
                    }
                }
                return super.Qhi(gm2, map);
            }
        };
        this.iMK = cJVar2;
        cJVar2.Qhi(hashMap);
        this.iMK.Qhi(findViewById);
        this.Sf = frameLayout;
        if (ac2 || CJ) {
            try {
                Handler handler = new Handler(Looper.getMainLooper(), this);
                this.pA = handler;
                handler.sendMessage(handler.obtainMessage(100, 0, 0));
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ int HzH(HzH hzH) {
        int i10 = hzH.YB;
        hzH.YB = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int hpZ(HzH hzH) {
        int i10 = hzH.Qe;
        hzH.Qe = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int iMK(HzH hzH) {
        int i10 = hzH.dIT;
        hzH.dIT = i10 + 1;
        return i10;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long j10;
        tP tPVar;
        tP tPVar2;
        if (message.what == 100) {
            int i10 = message.arg1;
            if (ac(this.ROR) && (tPVar2 = this.ROR) != null && tPVar2.hm() != null) {
                j10 = this.ROR.hm().cJ();
            } else if (CJ(this.ROR) && (tPVar = this.ROR) != null && tPVar.hm() != null) {
                j10 = this.ROR.hm().CJ();
            } else {
                j10 = 20;
            }
            fl.Qhi qhi = this.f9075zc;
            if (qhi != null) {
                qhi.Qhi(i10 * 1000, j10 * 1000);
            }
            int i11 = (i10 > j10 ? 1 : (i10 == j10 ? 0 : -1));
            if (i11 >= 0) {
                fl.Qhi qhi2 = this.f9075zc;
                if (qhi2 != null) {
                    qhi2.Qhi(j10 * 1000, 100);
                }
            } else if (i11 < 0 && this.pA != null) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i10 + 1;
                this.pA.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }

    private void ABk() {
        if ((ac(this.ROR) || CJ(this.ROR)) && (this.lB instanceof com.bytedance.sdk.openadsdk.core.video.ac.cJ)) {
            this.Jma.Gm();
            this.Jma.zc();
        }
    }

    public static boolean CJ(tP tPVar) {
        return tPVar != null && tPVar.hpZ() == 33;
    }

    private void Gm() {
        this.Tgh.setVisibility(8);
        if (ac(this.ROR) || CJ(this.ROR) || !ac()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.Gm = ofFloat;
        ofFloat.setDuration(100L);
        this.Gm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) HzH.this.Dww.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                HzH.this.Qhi((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                HzH.this.Dww.setLayoutParams(layoutParams);
            }
        });
        this.Gm.start();
    }

    public static boolean ROR(tP tPVar) {
        if (tPVar != null) {
            return tPVar.hpZ() == 19 || tPVar.hpZ() == 20;
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Sf() {
        LandingPageLoadingLayout landingPageLoadingLayout;
        SSWebView sSWebView = this.bxS;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.Qhi.ac.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi()).Qhi(false).cJ(false).Qhi(this.bxS.getWebView());
            SSWebView sSWebView2 = this.bxS;
            if (sSWebView2 != null && sSWebView2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.cJ.zc Qhi = new com.bytedance.sdk.openadsdk.cJ.zc(this.ROR, this.bxS.getWebView(), new com.bytedance.sdk.openadsdk.cJ.Gm() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.9
                    @Override // com.bytedance.sdk.openadsdk.cJ.Gm
                    public void Qhi(int i10) {
                        int i11 = HzH.this.cjC;
                        int i12 = HzH.this.YB;
                        int i13 = HzH.this.Qe;
                        int i14 = HzH.this.dIT - HzH.this.Qe;
                        HzH hzH = HzH.this;
                        ac.Qhi.Qhi(i11, i12, i13, i14, hzH.ROR, hzH.lG, i10);
                    }
                }, this.Dq).Qhi(true);
                this.yN = Qhi;
                Qhi.Qhi(this.lG);
                com.bytedance.sdk.openadsdk.common.cJ Qhi2 = js.Qhi(this.ROR, this.bxS, this.lB, this.lG);
                this.Hf = Qhi2;
                if (Qhi2 != null) {
                    Qhi2.Qhi(this.lG);
                }
                js.Qhi(this.ROR, this.bxS);
            }
            hm();
            this.bxS.setLandingPage(true);
            this.bxS.setTag(this.lG);
            this.bxS.setMaterialMeta(this.ROR.ne());
            com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh tgh = new com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), this.EBS, this.ROR.HLI(), this.Hf, this.yN, true) { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.10
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    HzH.this.WAv();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    HzH.this.Jma.Gm();
                    HzH.this.NFd = System.currentTimeMillis();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str, String str2) {
                    boolean z10;
                    boolean z11;
                    super.onReceivedError(webView, i10, str, str2);
                    String CJ = com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh.CJ(str2);
                    boolean z12 = true;
                    if (this.Tgh != null) {
                        if (webView != null && str2 != null && str2.equals(webView.getUrl())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.Tgh.Qhi(webView, i10, str, str2, com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh.CJ(str2), z11);
                    }
                    if (CJ != null && CJ.startsWith("image")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (CJ == null || !CJ.startsWith("mp4")) {
                        z12 = false;
                    }
                    if (!z10 && !z12 && !HzH.this.sDy.get()) {
                        HzH.this.zc();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        HzH.this.zc();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(HzH.this.jPH)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        HzH.iMK(HzH.this);
                        WebResourceResponseModel Qhi3 = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(HzH.this.MND, HzH.this.jPH, str);
                        if (Qhi3 != null && Qhi3.getWebResourceResponse() != null) {
                            HzH.hpZ(HzH.this);
                            return Qhi3.getWebResourceResponse();
                        }
                        if (Qhi3 != null && Qhi3.getMsg() == 2) {
                            HzH.HzH(HzH.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ABk.Qhi("LandingPageModel", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.xyz = tgh;
            this.bxS.setWebViewClient(tgh);
            this.xyz.Qhi(this.ROR);
            this.xyz.Qhi(this.lG);
            this.bxS.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.fl(this.EBS, this.yN, this.Hf) { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.11
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.fl, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (HzH.this.lB != null && !HzH.this.lB.isFinishing() && i10 == 100) {
                        HzH.this.WAv();
                    }
                    if (HzH.this.CQU != null) {
                        HzH.this.CQU.Qhi(i10);
                    }
                }
            });
            if (this.es == null) {
                this.es = com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), this.ROR, this.lG);
            }
            this.bxS.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.12
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                    if (HzH.this.es != null) {
                        HzH.this.es.CJ();
                    }
                }
            });
            SSWebView sSWebView3 = this.bxS;
            sSWebView3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.HzH.Qhi(sSWebView3.getWebView(), (int) BuildConfig.VERSION_CODE));
            this.bxS.setMixedContentMode(0);
            this.bxS.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.13
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    if (HzH.this.yN != null) {
                        HzH.this.yN.cJ(i11);
                    }
                }
            });
            this.bxS.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.14
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if ((!HzH.this.f9074ip || HzH.ROR(HzH.this.ROR)) && !HzH.CJ(HzH.this.ROR)) {
                        HzH.this.iMK.onTouch(view, motionEvent);
                    }
                    if ((!HzH.this.f9074ip || HzH.ROR(HzH.this.ROR)) && !HzH.CJ(HzH.this.ROR) && motionEvent.getAction() == 1 && HzH.this.iMK.ROR()) {
                        HzH.this.bxS.getWebView().performClick();
                        HzH.this.f9074ip = true;
                    }
                    if (HzH.this.yN != null) {
                        HzH.this.yN.Qhi(motionEvent);
                    }
                    if (HzH.this.Hf != null) {
                        HzH.this.Hf.Qhi(motionEvent);
                        return false;
                    }
                    return false;
                }
            });
            this.bxS.getWebView().setOnClickListener(this.iMK);
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.ROR, this.lG, this.Dq);
            com.bytedance.sdk.openadsdk.utils.tP.Qhi(this.bxS, this.ROR.YB());
            this.FQ = true;
        }
        if (this.bxS == null || (landingPageLoadingLayout = this.CQU) == null) {
            return;
        }
        landingPageLoadingLayout.Qhi();
    }

    public static boolean Tgh(tP tPVar) {
        return (tPVar == null || tPVar.mz() == 1 || !ROR(tPVar)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void WAv() {
        if (this.sDy.get() || this.PAe.get()) {
            return;
        }
        this.sDy.set(true);
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.ROR, this.lG, System.currentTimeMillis() - this.NFd, true);
        Gm();
    }

    public static boolean fl(tP tPVar) {
        return ac(tPVar) && !Sf(tPVar);
    }

    private void hm() {
        NFd nFd = new NFd(this.lB);
        this.EBS = nFd;
        nFd.cJ(this.bxS).ac(this.ROR.HLI()).CJ(this.ROR.EGK()).Qhi(this.ROR).cJ(CJ(this.ROR) ? this.f9076zn : -1).Qhi(this.ROR.zn()).cJ(this.lG).fl(this.ROR.bIO()).Qhi(this.bxS).Qhi(new com.bytedance.sdk.openadsdk.core.widget.ac() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.15
            @Override // com.bytedance.sdk.openadsdk.core.widget.ac
            public void Qhi() {
                if (HzH.CJ(HzH.this.ROR) && (HzH.this.lB instanceof com.bytedance.sdk.openadsdk.core.video.ac.cJ)) {
                    ((com.bytedance.sdk.openadsdk.core.video.ac.cJ) HzH.this.lB).c_();
                } else if (HzH.this.xyz != null) {
                    HzH.this.xyz.cJ();
                }
            }
        });
    }

    private void iMK() {
        if (ac()) {
            this.pM.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.Eh, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.f9073hm = duration;
            duration.setRepeatMode(2);
            this.f9073hm.setRepeatCount(-1);
            this.f9073hm.start();
            this.pM.setClickable(true);
            this.pM.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.4
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!HzH.this.f9074ip) {
                        HzH.this.iMK.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    HzH.this.WAv = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    HzH.this.WAv.setDuration(200L);
                    HzH.this.WAv.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) HzH.this.Dww.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            HzH.this.Qhi((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            HzH.this.Dww.setLayoutParams(layoutParams);
                        }
                    });
                    if (HzH.this.iMK.ROR()) {
                        HzH.this.pM.performClick();
                        HzH.this.f9074ip = true;
                    }
                    HzH.this.WAv.start();
                    HzH.this.pM.setVisibility(8);
                    return true;
                }
            });
            this.pM.setOnClickListener(this.iMK);
        }
        if (!pA()) {
            this.Sf.setVisibility(8);
            this.cJ.setVisibility(0);
            this.Qhi.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.Qhi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    HzH hzH = HzH.this;
                    com.bytedance.sdk.openadsdk.cJ.ac.cJ(hzH.ROR, hzH.lG);
                }
            });
            tP tPVar = this.ROR;
            if (tPVar != null && tPVar.cjC() != null && this.ROR.cjC().size() > 0 && this.ROR.cjC().get(0) != null && !TextUtils.isEmpty(this.ROR.cjC().get(0).Qhi())) {
                com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.ROR.cjC().get(0), this.Qhi, this.ROR);
            }
        }
        try {
            String Qhi = this.ROR.cjC().get(0).Qhi();
            com.bytedance.sdk.openadsdk.ROR.fl.Qhi().Qhi(Qhi).Qhi(this.ROR.cjC().get(0).cJ()).cJ(this.ROR.cjC().get(0).ac()).fl(zn.CJ(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).CJ(zn.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).ac(2).Qhi(new com.bytedance.sdk.component.fl.hm() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.7
                @Override // com.bytedance.sdk.component.fl.hm
                public Bitmap Qhi(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.CJ.kYc.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), bitmap, 25);
                }
            }).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(this.ROR, Qhi, new com.bytedance.sdk.component.fl.HzH<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.6
                @Override // com.bytedance.sdk.component.fl.HzH
                public void Qhi(int i10, String str, Throwable th2) {
                }

                @Override // com.bytedance.sdk.component.fl.HzH
                public void Qhi(com.bytedance.sdk.component.fl.zc<Bitmap> zcVar) {
                    try {
                        Bitmap cJ = zcVar.cJ();
                        if (cJ != null && zcVar.ac() != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.HzH.Qhi().getResources(), cJ);
                            if (!HzH.this.pA()) {
                                HzH.this.cJ.setBackground(bitmapDrawable);
                                return;
                            }
                            HzH.this.CJ.setBackground(bitmapDrawable);
                            View WAv = HzH.this.Jma.WAv();
                            if (WAv == null || !(WAv.getParent() instanceof View)) {
                                return;
                            }
                            ((View) WAv.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pA() {
        return tP.fl(this.ROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void zc() {
        if (this.sDy.get()) {
            return;
        }
        ABk();
        this.PAe.set(true);
        this.Jma.Sf();
        LandingPageLoadingLayout landingPageLoadingLayout = this.CQU;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.cJ();
        }
        if (CJ(this.ROR)) {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(System.currentTimeMillis(), this.ROR, this.lG, "show_agg_backup");
            View view = this.HzH;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.HzH.getLayoutParams();
                layoutParams.addRule(13);
                layoutParams.addRule(10, 0);
                this.HzH.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = this.Tgh;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.hpZ.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.hpZ.getLayoutParams();
        layoutParams2.addRule(13);
        layoutParams2.addRule(10, 0);
        this.hpZ.setLayoutParams(layoutParams2);
        if (this.ROR.dIT() != null && !TextUtils.isEmpty(this.ROR.dIT().Qhi())) {
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.ROR.dIT().Qhi(), this.ROR.dIT().cJ(), this.ROR.dIT().ac(), this.MQ, this.ROR);
        }
        this.kYc.setText(this.ROR.PAe());
        this.tP.setText(this.ROR.zjb());
        if (this.qMt != null) {
            cJ();
            this.qMt.setClickable(true);
            this.qMt.setOnClickListener(this.ABk);
            this.qMt.setOnTouchListener(this.ABk);
        }
    }

    public boolean ac() {
        return this.ROR.gga() == 15 || this.ROR.gga() == 16;
    }

    public void cJ() {
        tP tPVar = this.ROR;
        if (tPVar == null || TextUtils.isEmpty(tPVar.ots())) {
            return;
        }
        this.qMt.setText(this.ROR.ots());
    }

    public void CJ() {
        FrameLayout frameLayout = this.Dww;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.aP;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public void fl() {
        SSWebView sSWebView;
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.yN;
        if (zcVar != null && (sSWebView = this.bxS) != null) {
            zcVar.Qhi(sSWebView);
        }
        Handler handler = this.pA;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ObjectAnimator objectAnimator = this.WAv;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.WAv.cancel();
        }
        ObjectAnimator objectAnimator2 = this.Gm;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.Gm.cancel();
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.CQU;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.cJ();
        }
        ObjectAnimator objectAnimator3 = this.f9073hm;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        SSWebView sSWebView2 = this.bxS;
        if (sSWebView2 != null) {
            lG.Qhi(sSWebView2.getWebView());
        }
        this.bxS = null;
        NFd nFd = this.EBS;
        if (nFd != null) {
            nFd.Gm();
        }
        com.bytedance.sdk.openadsdk.cJ.zc zcVar2 = this.yN;
        if (zcVar2 != null) {
            zcVar2.ac(true);
        }
        if (!TextUtils.isEmpty(this.jPH) && this.FQ) {
            ac.Qhi.Qhi(this.Qe, this.dIT, this.ROR);
        }
        com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(this.MND);
    }

    public static boolean ac(tP tPVar) {
        if (tPVar == null) {
            return false;
        }
        if (Sf(tPVar)) {
            return true;
        }
        return tPVar.ip() == 3 && tPVar.hpZ() == 5 && !bxS.cJ(tPVar) && (tPVar.Oy() == 0.0f || tPVar.Oy() == 100.0f);
    }

    public static boolean cJ(tP tPVar) {
        return tPVar != null && tPVar.ip() == 3 && tPVar.hpZ() == 6 && !bxS.cJ(tPVar) && tPVar.SL() == 1 && (tPVar.Oy() == 0.0f || tPVar.Oy() == 100.0f);
    }

    public void Qhi(fl.Qhi qhi) {
        this.f9075zc = qhi;
    }

    public void ROR() {
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.yN;
        if (zcVar != null) {
            zcVar.Sf();
        }
    }

    public void Tgh() {
        NFd nFd = this.EBS;
        if (nFd != null) {
            nFd.WAv();
        }
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.yN;
        if (zcVar != null) {
            zcVar.ROR();
        }
    }

    public void Qhi() {
        long Qhi;
        View view;
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        SSWebView sSWebView = (SSWebView) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.qMt);
        this.bxS = sSWebView;
        if (sSWebView != null && !tP.Qhi(this.ROR)) {
            this.bxS.g_();
        } else {
            zn.Qhi((View) this.bxS, 8);
        }
        this.Dww = (FrameLayout) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.MQ);
        this.CQU = (LandingPageLoadingLayout) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.CQU);
        this.pM = this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.EBS);
        this.Eh = (ImageView) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.bxS);
        this.aP = this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Jma);
        this.cJ = (FrameLayout) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.kYc);
        this.Qhi = (ImageView) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.tP);
        this.Tgh = (RelativeLayout) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Dww);
        this.f9071ac = (TextView) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.czB);
        this.CJ = (FrameLayout) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.WAv);
        View findViewById = this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.pM);
        this.hpZ = findViewById;
        if (findViewById == null) {
            this.hpZ = this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.f9386zn);
        }
        this.HzH = this.lB.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.Eh);
        this.kYc = (TextView) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.NFd);
        this.tP = (TextView) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.sDy);
        this.MQ = (TTRoundRectImageView) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.aP);
        this.qMt = (TextView) this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.lB);
        if (this.f9071ac != null && this.ROR.hm() != null) {
            this.f9071ac.setText(this.ROR.hm().fl());
        }
        this.f9072fl = this.js.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.lG);
        if ((ac(this.ROR) || cJ(this.ROR) || CJ(this.ROR)) && this.ROR.hm() != null) {
            View view2 = this.f9072fl;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (CJ(this.ROR)) {
                Qhi = this.ROR.hm().ac();
            } else {
                Qhi = this.ROR.hm().Qhi();
            }
            com.bytedance.sdk.openadsdk.core.iMK.ac().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.HzH.8
                @Override // java.lang.Runnable
                public void run() {
                    if (!HzH.this.sDy.get()) {
                        HzH hzH = HzH.this;
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(hzH.ROR, hzH.lG, System.currentTimeMillis() - HzH.this.NFd, false);
                        HzH.this.zc();
                    }
                }
            }, Qhi * 1000);
        }
        Sf();
        if (cJ(this.ROR)) {
            iMK();
            if (!ac()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Dww.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.Dww.setLayoutParams(layoutParams);
            }
        }
        if ((ac(this.ROR) || CJ(this.ROR)) && (view = this.aP) != null) {
            view.setVisibility(8);
        }
        LandingPageLoadingLayout landingPageLoadingLayout = this.CQU;
        if (landingPageLoadingLayout != null) {
            landingPageLoadingLayout.Qhi(this.ROR);
        }
        ac.Qhi.Qhi(SystemClock.elapsedRealtime() - valueOf.longValue(), this.ROR, this.lG, this.MND, this.jPH);
    }

    public static boolean hm(tP tPVar) {
        return (tPVar == null || !com.bytedance.sdk.openadsdk.core.HzH.CJ().bxS() || !tPVar.js() || cJ(tPVar) || ac(tPVar) || CJ(tPVar)) ? false : true;
    }

    public static boolean Sf(tP tPVar) {
        return tPVar != null && tPVar.hpZ() == 19;
    }

    public static boolean Qhi(tP tPVar) {
        if (tPVar == null || Sf(tPVar)) {
            return false;
        }
        return ac(tPVar) || cJ(tPVar) || CJ(tPVar);
    }

    public void Qhi(float f10) {
        try {
            this.Jma.hm();
        } catch (Throwable unused) {
        }
    }
}

package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.vk.openvk.component.video.api.CJ.fl;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.CJ.kYc;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.component.utils.bxS;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cJ.Gm;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.cJ.ac;
import com.bytedance.sdk.openadsdk.cJ.zc;
import com.bytedance.sdk.openadsdk.common.PangleViewStub;
import com.bytedance.sdk.openadsdk.core.Dww;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseActivity implements com.bytedance.sdk.openadsdk.Sf.fl {
    protected TextView CJ;
    protected TextView CQU;
    private int Dq;
    protected CornerIV Dww;
    protected RelativeLayout EBS;
    protected PangleViewStub Eh;
    protected zc FQ;
    protected int Gm;
    private int Hf;
    protected com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl NFd;
    protected SSWebView Qhi;
    protected String Sf;
    protected int Tgh;
    protected NFd WAv;
    protected Button aP;

    /* renamed from: ac  reason: collision with root package name */
    protected ImageView f8553ac;
    protected TextView bxS;
    protected ImageView cJ;
    private ILoader dIT;
    protected int es;

    /* renamed from: fl  reason: collision with root package name */
    protected Context f8554fl;

    /* renamed from: hm  reason: collision with root package name */
    protected String f8555hm;
    protected tP hpZ;
    protected NativeVideoTsView iMK;
    protected ROR.Qhi jPH;
    protected String lB;
    protected long pA;
    protected TextView pM;
    protected String xyz;
    protected com.bytedance.sdk.openadsdk.multipro.cJ.Qhi yN;

    /* renamed from: zc  reason: collision with root package name */
    protected FrameLayout f8557zc;
    protected int ABk = -1;
    protected int HzH = 0;
    protected int kYc = 0;
    protected int tP = 0;
    protected int MQ = 0;
    protected String qMt = "ダウンロード";
    protected boolean sDy = false;
    protected boolean lG = false;
    protected boolean Jma = true;
    protected boolean js = false;

    /* renamed from: zn  reason: collision with root package name */
    protected String f8558zn = null;
    protected AtomicBoolean PAe = new AtomicBoolean(true);

    /* renamed from: ip  reason: collision with root package name */
    protected JSONArray f8556ip = null;
    private final AtomicInteger Qe = new AtomicInteger(0);
    private final AtomicInteger YB = new AtomicInteger(0);
    private final AtomicInteger cjC = new AtomicInteger(0);
    protected com.bytedance.sdk.openadsdk.core.cJ.Qhi MND = null;
    private final fl.cJ NBs = new fl.cJ() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.component.video.api.CJ.fl.cJ
        public void Qhi(boolean z10) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.sDy = z10;
            if (!tTVideoLandingPageActivity.isFinishing()) {
                if (z10) {
                    zn.Qhi((View) TTVideoLandingPageActivity.this.Qhi, 8);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f8557zc.getLayoutParams();
                    TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                    tTVideoLandingPageActivity2.kYc = marginLayoutParams.leftMargin;
                    tTVideoLandingPageActivity2.HzH = marginLayoutParams.topMargin;
                    tTVideoLandingPageActivity2.tP = marginLayoutParams.width;
                    tTVideoLandingPageActivity2.MQ = marginLayoutParams.height;
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    marginLayoutParams.topMargin = 0;
                    marginLayoutParams.leftMargin = 0;
                    tTVideoLandingPageActivity2.f8557zc.setLayoutParams(marginLayoutParams);
                    return;
                }
                zn.Qhi((View) TTVideoLandingPageActivity.this.Qhi, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f8557zc.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                marginLayoutParams2.width = tTVideoLandingPageActivity3.tP;
                marginLayoutParams2.height = tTVideoLandingPageActivity3.MQ;
                marginLayoutParams2.leftMargin = tTVideoLandingPageActivity3.kYc;
                marginLayoutParams2.topMargin = tTVideoLandingPageActivity3.HzH;
                tTVideoLandingPageActivity3.f8557zc.setLayoutParams(marginLayoutParams2);
            }
        }
    };
    private final bxS.Qhi dI = new bxS.Qhi() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.bxS.Qhi
        public void Qhi(Context context, Intent intent, boolean z10, final int i10) {
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    Qhi(i10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Qhi(int i10) {
            SSWebView sSWebView;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.es == 0 && i10 != 0 && (sSWebView = tTVideoLandingPageActivity.Qhi) != null && (str = tTVideoLandingPageActivity.f8558zn) != null) {
                sSWebView.a_(str);
            }
            NativeVideoTsView nativeVideoTsView = TTVideoLandingPageActivity.this.iMK;
            if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.lG && tTVideoLandingPageActivity2.es != i10) {
                    ((com.bytedance.sdk.openadsdk.core.video.nativevideo.ac) tTVideoLandingPageActivity2.iMK.getNativeVideoController()).ac(i10);
                }
            }
            TTVideoLandingPageActivity.this.es = i10;
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    /* loaded from: classes.dex */
    public static class Qhi extends AsyncTask<Void, Void, Drawable> {
        private final Bitmap Qhi;
        private final WeakReference<com.bykv.vk.openvk.component.video.api.CJ.ac> cJ;

        @Override // android.os.AsyncTask
        /* renamed from: Qhi */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap Qhi = kYc.Qhi(HzH.Qhi(), this.Qhi, 25);
                if (Qhi == null) {
                    return null;
                }
                return new BitmapDrawable(HzH.Qhi().getResources(), Qhi);
            } catch (Throwable th2) {
                ABk.Qhi("TTVideoLandingPage", th2.getMessage());
                return null;
            }
        }

        private Qhi(Bitmap bitmap, com.bykv.vk.openvk.component.video.api.CJ.ac acVar) {
            this.Qhi = bitmap;
            this.cJ = new WeakReference<>(acVar);
        }

        @Override // android.os.AsyncTask
        /* renamed from: Qhi */
        public void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.component.video.api.CJ.ac> weakReference;
            if (drawable == null || (weakReference = this.cJ) == null || weakReference.get() == null) {
                return;
            }
            this.cJ.get().Qhi(drawable);
        }
    }

    private void ABk() {
        NFd nFd = new NFd(this);
        this.WAv = nFd;
        nFd.cJ(this.Qhi).ac(this.Sf).CJ(this.f8555hm).cJ(this.Gm).Qhi(this.hpZ).Qhi(this.hpZ.zn()).Qhi(this.Qhi).cJ("landingpage_split_screen").fl(this.hpZ.bIO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean HzH() {
        if (!TextUtils.isEmpty(this.f8558zn) && this.f8558zn.contains("__luban_sdk")) {
            return true;
        }
        return false;
    }

    private boolean hpZ() {
        NativeVideoTsView nativeVideoTsView = this.iMK;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            return this.iMK.getNativeVideoController().pA();
        }
        return true;
    }

    private void iMK() {
        NativeVideoTsView nativeVideoTsView = this.iMK;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null && !hpZ()) {
            this.iMK.ABk();
        }
    }

    private void kYc() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.WAv.Qhi("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void pA() {
        if (this.iMK != null && !hpZ()) {
            this.iMK.ABk();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zc() {
        tP tPVar = this.hpZ;
        if (tPVar != null && tPVar.ip() == 4) {
            this.Eh.setVisibility(0);
            Button button = (Button) findViewById(iMK.SL);
            this.aP = button;
            if (button != null) {
                Qhi(cJ());
                this.aP.setOnClickListener(this.MND);
                this.aP.setOnTouchListener(this.MND);
            }
        }
    }

    public void Gm() {
        try {
            bxS.Qhi(this.dI);
        } catch (Exception unused) {
        }
    }

    public abstract View Qhi();

    public int ROR() {
        NativeVideoTsView nativeVideoTsView = this.iMK;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            return this.iMK.getNativeVideoController().WAv();
        }
        return 0;
    }

    public void Sf() {
        String str;
        tP tPVar = this.hpZ;
        if (tPVar != null && tPVar.ip() == 4) {
            zn.Qhi((View) this.EBS, 0);
            if (!TextUtils.isEmpty(this.hpZ.dVA())) {
                str = this.hpZ.dVA();
            } else if (!TextUtils.isEmpty(this.hpZ.zjb())) {
                str = this.hpZ.zjb();
            } else if (!TextUtils.isEmpty(this.hpZ.PAe())) {
                str = this.hpZ.PAe();
            } else {
                str = "";
            }
            if (this.hpZ.dIT() != null && this.hpZ.dIT().Qhi() != null) {
                zn.Qhi((View) this.Dww, 0);
                zn.Qhi((View) this.bxS, 4);
                com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi(this.hpZ.dIT(), this.Dww, this.hpZ);
            } else if (!TextUtils.isEmpty(str)) {
                zn.Qhi((View) this.Dww, 4);
                zn.Qhi((View) this.bxS, 0);
                this.bxS.setText(str.substring(0, 1));
            }
            if (!TextUtils.isEmpty(this.hpZ.ots())) {
                this.pM.setText(this.hpZ.ots());
            }
            if (!TextUtils.isEmpty(str)) {
                this.CQU.setText(str);
            }
            zn.Qhi((View) this.CQU, 0);
            zn.Qhi((View) this.pM, 0);
        }
    }

    public void WAv() {
        bxS.Qhi(this.dI, this.f8554fl);
    }

    public abstract boolean fl();

    @SuppressLint({"ClickableViewAccessibility"})
    public void hm() {
        tP tPVar = this.hpZ;
        if (tPVar == null) {
            return;
        }
        this.NFd = com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(this, tPVar, this.lB);
        com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.core.cJ.Qhi(this, this.hpZ, this.lB, this.Gm);
        this.MND = qhi;
        qhi.Qhi(false);
        this.MND.ac(true);
        this.pM.setOnClickListener(this.MND);
        this.pM.setOnTouchListener(this.MND);
        this.MND.Qhi(this.NFd);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        NativeVideoTsView nativeVideoTsView;
        if (this.sDy && (nativeVideoTsView = this.iMK) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((com.bykv.vk.openvk.component.video.api.CJ.cJ) this.iMK.getNativeVideoController()).fl(null, null);
            this.sDy = false;
        } else if (HzH() && !this.PAe.getAndSet(true)) {
            kYc();
            Qhi(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zc();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i10;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.iMK.fl()) {
            finish();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            HzH.cJ(this);
        } catch (Throwable unused2) {
        }
        this.es = hpZ.ac(getApplicationContext());
        try {
            setContentView(Qhi());
            this.f8554fl = this;
            Intent intent = getIntent();
            this.Tgh = intent.getIntExtra("sdk_version", 1);
            this.Sf = intent.getStringExtra("adid");
            this.f8555hm = intent.getStringExtra("log_extra");
            this.Gm = intent.getIntExtra("source", -1);
            this.f8558zn = intent.getStringExtra(InMobiNetworkValues.URL);
            String stringExtra = intent.getStringExtra("web_title");
            this.lB = intent.getStringExtra("event_tag");
            this.xyz = intent.getStringExtra("gecko_id");
            this.js = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.pA = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.hpZ = com.bytedance.sdk.openadsdk.core.cJ.Qhi(new JSONObject(stringExtra3));
                    } catch (Exception unused3) {
                    }
                }
                tP tPVar = this.hpZ;
                if (tPVar != null) {
                    this.ABk = tPVar.gga();
                }
            } else {
                tP cJ = Dww.Qhi().cJ();
                this.hpZ = cJ;
                if (cJ != null) {
                    this.ABk = cJ.gga();
                }
                Dww.Qhi().Tgh();
            }
            if (this.hpZ == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.xyz)) {
                this.dIT = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().cJ();
                int Qhi2 = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(this.dIT, this.xyz);
                this.Dq = Qhi2;
                if (Qhi2 > 0) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.Hf = i10;
            }
            if (stringExtra2 != null) {
                try {
                    this.yN = com.bytedance.sdk.openadsdk.multipro.cJ.Qhi.Qhi(new JSONObject(stringExtra2));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.cJ.Qhi qhi = this.yN;
                if (qhi != null) {
                    this.pA = qhi.ROR;
                }
            }
            if (bundle != null) {
                String string = bundle.getString("material_meta");
                if (this.hpZ == null) {
                    try {
                        this.hpZ = com.bytedance.sdk.openadsdk.core.cJ.Qhi(new JSONObject(string));
                    } catch (Throwable unused5) {
                    }
                }
                long j10 = bundle.getLong("video_play_position");
                if (j10 > 0) {
                    this.pA = j10;
                }
            }
            ac();
            hm();
            ABk();
            Qhi(4);
            if (this.Qhi != null) {
                com.bytedance.sdk.openadsdk.core.widget.Qhi.ac.Qhi(this.f8554fl).Qhi(true).cJ(false).Qhi(this.Qhi.getWebView());
                zc Qhi3 = new zc(this.hpZ, this.Qhi.getWebView(), new Gm() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.cJ.Gm
                    public void Qhi(int i11) {
                        ac.Qhi.Qhi(TTVideoLandingPageActivity.this.Dq, TTVideoLandingPageActivity.this.cjC.get(), TTVideoLandingPageActivity.this.YB.get(), TTVideoLandingPageActivity.this.Qe.get() - TTVideoLandingPageActivity.this.YB.get(), TTVideoLandingPageActivity.this.hpZ, "landingpage_split_screen", i11);
                    }
                }, this.Hf).Qhi(true);
                this.FQ = Qhi3;
                this.jPH = Qhi3.Qhi;
                Qhi3.Qhi("landingpage_split_screen");
            }
            SSWebView sSWebView = this.Qhi;
            if (sSWebView != null) {
                sSWebView.setLandingPage(true);
                this.Qhi.setTag("landingpage_split_screen");
                this.Qhi.setMaterialMeta(this.hpZ.ne());
                this.Qhi.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh(this.f8554fl, this.WAv, this.Sf, this.FQ, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.xyz)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.Qe.incrementAndGet();
                            WebResourceResponseModel Qhi4 = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(TTVideoLandingPageActivity.this.dIT, TTVideoLandingPageActivity.this.xyz, str);
                            if (Qhi4 != null && Qhi4.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.YB.incrementAndGet();
                                return Qhi4.getWebResourceResponse();
                            }
                            if (Qhi4 != null && Qhi4.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.cjC.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th2) {
                            ABk.Qhi("TTVideoLandingPage", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                SSWebView sSWebView2 = this.Qhi;
                sSWebView2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.HzH.Qhi(sSWebView2.getWebView(), this.Tgh));
            }
            SSWebView sSWebView3 = this.Qhi;
            if (sSWebView3 != null) {
                sSWebView3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.hpZ, "landingpage_split_screen", this.Hf);
            com.bytedance.sdk.openadsdk.utils.tP.Qhi(this.Qhi, this.f8558zn);
            this.Qhi.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.fl(this.WAv, this.FQ) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.fl, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i11) {
                    super.onProgressChanged(webView, i11);
                }
            });
            this.Qhi.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
                    com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl flVar = TTVideoLandingPageActivity.this.NFd;
                    if (flVar != null) {
                        flVar.CJ();
                    }
                }
            });
            TextView textView = this.CJ;
            if (textView != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = MQ.Qhi(this, "tt_web_title_default");
                }
                textView.setText(stringExtra);
            }
            WAv();
            CJ();
            zc();
            ac.Qhi.Qhi(SystemClock.elapsedRealtime() - elapsedRealtime, this.hpZ, "landingpage_split_screen", this.dIT, this.xyz);
        } catch (Throwable unused6) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Gm();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.hpZ.Tgh(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.Qhi;
        if (sSWebView != null) {
            com.bytedance.sdk.openadsdk.core.lG.Qhi(sSWebView.getWebView());
        }
        this.Qhi = null;
        NFd nFd = this.WAv;
        if (nFd != null) {
            nFd.Gm();
        }
        NativeVideoTsView nativeVideoTsView = this.iMK;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            this.iMK.getNativeVideoController().CJ();
        }
        this.iMK = null;
        this.hpZ = null;
        zc zcVar = this.FQ;
        if (zcVar != null) {
            zcVar.ac(true);
        }
        if (!TextUtils.isEmpty(this.xyz)) {
            ac.Qhi.Qhi(this.YB.get(), this.Qe.get(), this.hpZ);
        }
        com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(this.dIT);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        pA();
        NativeVideoTsView nativeVideoTsView = this.iMK;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            Qhi(this.iMK.getNativeVideoController());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.Jma) {
            iMK();
        }
        this.Jma = false;
        NFd nFd = this.WAv;
        if (nFd != null) {
            nFd.WAv();
        }
        zc zcVar = this.FQ;
        if (zcVar != null) {
            zcVar.ROR();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        tP tPVar = this.hpZ;
        if (tPVar != null) {
            str = tPVar.mZ().toString();
        } else {
            str = null;
        }
        bundle.putString("material_meta", str);
        bundle.putLong("video_play_position", this.pA);
        bundle.putBoolean("is_complete", this.lG);
        long j10 = this.pA;
        NativeVideoTsView nativeVideoTsView = this.iMK;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
            j10 = this.iMK.getNativeVideoController().fl();
        }
        bundle.putLong("video_play_position", j10);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.ac.Qhi(this, this.hpZ);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        zc zcVar = this.FQ;
        if (zcVar != null) {
            zcVar.Sf();
        }
    }

    private void Qhi(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.aP) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.aP != null && !tTVideoLandingPageActivity.isFinishing()) {
                    TTVideoLandingPageActivity.this.aP.setText(str);
                }
            }
        });
    }

    public void CJ() {
        if (fl()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.f8554fl, this.hpZ, true, null);
                this.iMK = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.iMK.getNativeVideoController().Qhi(false);
                }
                if (this.lG) {
                    this.f8557zc.setVisibility(0);
                    this.f8557zc.removeAllViews();
                    this.f8557zc.addView(this.iMK);
                    this.iMK.cJ(true);
                } else {
                    if (!this.js) {
                        this.pA = 0L;
                    }
                    if (this.yN != null && this.iMK.getNativeVideoController() != null) {
                        this.iMK.getNativeVideoController().cJ(this.yN.ROR);
                        this.iMK.getNativeVideoController().ac(this.yN.f9349fl);
                        this.iMK.setIsQuiet(HzH.CJ().ac(String.valueOf(this.hpZ.Hy())));
                    }
                    if (this.iMK.Qhi(this.pA, this.Jma, this.lG)) {
                        this.f8557zc.setVisibility(0);
                        this.f8557zc.removeAllViews();
                        this.f8557zc.addView(this.iMK);
                    }
                    if (this.iMK.getNativeVideoController() != null) {
                        this.iMK.getNativeVideoController().Qhi(false);
                        this.iMK.getNativeVideoController().Qhi(this.NBs);
                    }
                }
                String Qhi2 = this.hpZ.cjC().get(0).Qhi();
                com.bytedance.sdk.openadsdk.ROR.fl.Qhi().Qhi(Qhi2).Qhi(this.hpZ.cjC().get(0).cJ()).cJ(this.hpZ.cjC().get(0).ac()).fl(zn.CJ(HzH.Qhi())).CJ(zn.ac(HzH.Qhi())).ac(2).Qhi(new com.bytedance.sdk.openadsdk.ROR.cJ(this.hpZ, Qhi2, new com.bytedance.sdk.component.fl.HzH<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.fl.HzH
                    public void Qhi(int i10, String str, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fl.HzH
                    public void Qhi(com.bytedance.sdk.component.fl.zc<Bitmap> zcVar) {
                        try {
                            new Qhi(zcVar.cJ(), TTVideoLandingPageActivity.this.iMK.getNativeVideoController().ABk()).execute(new Void[0]);
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.iMK.findViewById(520093726).setOnTouchListener(null);
                this.iMK.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e10) {
                ABk.Qhi("TTVideoLandingPage", e10.getMessage());
                if (this.iMK == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e10);
                }
            }
            if (this.es == 0) {
                try {
                    Toast.makeText(this, MQ.cJ(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public long Tgh() {
        NativeVideoTsView nativeVideoTsView = this.iMK;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0L;
        }
        return this.iMK.getNativeVideoController().Sf();
    }

    public void ac() {
        this.Eh = (PangleViewStub) findViewById(iMK.dI);
        this.Qhi = (SSWebView) findViewById(iMK.MND);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.cJ = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObject;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.Qhi != null) {
                        ROR.Qhi qhi = tTVideoLandingPageActivity.jPH;
                        if (qhi != null) {
                            qhi.Qhi();
                        }
                        if (TTVideoLandingPageActivity.this.Qhi.fl()) {
                            TTVideoLandingPageActivity.this.Qhi.Tgh();
                        } else if (TTVideoLandingPageActivity.this.HzH()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                        } else {
                            NativeVideoTsView nativeVideoTsView = TTVideoLandingPageActivity.this.iMK;
                            if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null) {
                                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                                jSONObject = js.Qhi(tTVideoLandingPageActivity2.hpZ, tTVideoLandingPageActivity2.iMK.getNativeVideoController().Tgh(), TTVideoLandingPageActivity.this.iMK.getNativeVideoController().zc());
                            } else {
                                jSONObject = null;
                            }
                            JSONObject jSONObject2 = jSONObject;
                            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tTVideoLandingPageActivity3.hpZ, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.Tgh(), TTVideoLandingPageActivity.this.ROR(), jSONObject2, (Sf) null);
                            TTVideoLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.iMK;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.js);
        }
        ImageView imageView2 = (ImageView) findViewById(iMK.yN);
        this.f8553ac = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    JSONObject jSONObject;
                    NativeVideoTsView nativeVideoTsView2 = TTVideoLandingPageActivity.this.iMK;
                    if (nativeVideoTsView2 != null) {
                        if (nativeVideoTsView2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObject = js.Qhi(tTVideoLandingPageActivity.hpZ, tTVideoLandingPageActivity.iMK.getNativeVideoController().Tgh(), TTVideoLandingPageActivity.this.iMK.getNativeVideoController().zc());
                        } else {
                            jSONObject = null;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tTVideoLandingPageActivity2.hpZ, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.Tgh(), TTVideoLandingPageActivity.this.ROR(), jSONObject2, (Sf) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.CJ = (TextView) findViewById(iMK.DaO);
        this.f8557zc = (FrameLayout) findViewById(iMK.es);
        this.EBS = (RelativeLayout) findViewById(iMK.FQ);
        this.bxS = (TextView) findViewById(iMK.f9381ip);
        this.CQU = (TextView) findViewById(iMK.xyz);
        this.pM = (TextView) findViewById(iMK.jPH);
        this.Dww = (CornerIV) findViewById(iMK.PAe);
        Sf();
    }

    public String cJ() {
        tP tPVar = this.hpZ;
        if (tPVar != null && !TextUtils.isEmpty(tPVar.ots())) {
            this.qMt = this.hpZ.ots();
        }
        return this.qMt;
    }

    private void Qhi(com.bykv.vk.openvk.component.video.api.CJ.fl flVar) {
        this.lG = this.lG || flVar.pA();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.lG));
        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(flVar.fl()));
        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(flVar.Tgh() + flVar.Sf()));
        com.bytedance.sdk.openadsdk.multipro.CJ.cJ.Qhi("sp_multi_native_video_data", "key_video_duration", Long.valueOf(flVar.Sf()));
    }

    private void Qhi(final int i10) {
        if (this.f8553ac == null || !HzH()) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                zn.Qhi((View) TTVideoLandingPageActivity.this.f8553ac, i10);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.Sf.fl
    public void Qhi(boolean z10, JSONArray jSONArray) {
        if (!z10 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.f8556ip = jSONArray;
    }
}

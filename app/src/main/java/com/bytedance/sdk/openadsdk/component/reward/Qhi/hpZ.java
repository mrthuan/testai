package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import a6.h;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.activity.r;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.CJ.Eh;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.cJ.ac;
import com.bytedance.sdk.openadsdk.cJ.kYc;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.cJ.cJ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.media.C1646h;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullWebViewManager.java */
/* loaded from: classes.dex */
public class hpZ implements com.bytedance.sdk.openadsdk.WAv.Sf {
    private final boolean ABk;
    protected String CJ;
    private float CQU;
    private View Dww;
    private boolean EBS;
    private long Eh;
    private boolean FQ;
    private final String Gm;
    private String HLI;
    private SSWebView HzH;
    private boolean Jma;
    private boolean MQ;
    private boolean PAe;
    NFd Qhi;
    protected com.bytedance.sdk.openadsdk.cJ.ac.Tgh Sf;
    private final tP WAv;
    private String YB;
    private View bxS;
    NFd cJ;
    private ILoader cjC;
    private boolean dI;
    private int dIT;
    private ROR.Qhi dVA;
    private com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh es;

    /* renamed from: fl  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.cJ.zc f8819fl;
    private SSWebView hpZ;
    private int iMK;

    /* renamed from: ip  reason: collision with root package name */
    private boolean f8821ip;
    private long jPH;
    private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi js;
    private com.bytedance.sdk.openadsdk.common.ROR lG;
    private boolean oU;
    private boolean ots;
    private int pA;
    private float pM;
    private boolean qMt;
    private boolean yN;

    /* renamed from: zc  reason: collision with root package name */
    private int f8822zc;
    private com.bytedance.sdk.openadsdk.common.cJ zjb;

    /* renamed from: ac  reason: collision with root package name */
    protected boolean f8818ac = true;
    private boolean kYc = false;
    private final AtomicBoolean tP = new AtomicBoolean(true);
    int Tgh = 0;
    String ROR = "";

    /* renamed from: hm  reason: collision with root package name */
    boolean f8820hm = false;
    private SparseArray<ac.Qhi> aP = new SparseArray<>();
    private boolean NFd = true;
    private float sDy = -1.0f;
    private float lB = -1.0f;

    /* renamed from: zn  reason: collision with root package name */
    private boolean f8823zn = false;
    private long xyz = -1;
    private volatile int MND = 0;
    private int Qe = -1;
    private volatile int Dq = 0;
    private volatile int Hf = 0;
    private long NBs = 0;
    private int pv = -1;

    /* compiled from: RewardFullWebViewManager.java */
    /* loaded from: classes.dex */
    public static class ac implements com.bytedance.sdk.openadsdk.WAv.WAv {
        private final SSWebView Qhi;

        @Override // com.bytedance.sdk.openadsdk.WAv.WAv
        public void Qhi() {
            SSWebView sSWebView = this.Qhi;
            if (sSWebView == null) {
                return;
            }
            sSWebView.Gm();
        }

        @Override // com.bytedance.sdk.openadsdk.WAv.WAv
        public void cJ() {
            SSWebView sSWebView = this.Qhi;
            if (sSWebView == null) {
                return;
            }
            sSWebView.iMK();
        }

        private ac(SSWebView sSWebView) {
            this.Qhi = sSWebView;
        }
    }

    /* compiled from: RewardFullWebViewManager.java */
    /* loaded from: classes.dex */
    public static class cJ implements com.bytedance.sdk.openadsdk.WAv.Qhi {
        private final View Qhi;

        public cJ(View view) {
            this.Qhi = view;
        }

        @Override // com.bytedance.sdk.openadsdk.WAv.Qhi
        public int Qhi() {
            int i10;
            View view = this.Qhi;
            if (view != null) {
                i10 = view.getMeasuredHeight();
            } else {
                i10 = -1;
            }
            if (i10 <= 0) {
                return zn.CJ(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            }
            return i10;
        }

        @Override // com.bytedance.sdk.openadsdk.WAv.Qhi
        public int cJ() {
            int i10;
            View view = this.Qhi;
            if (view != null) {
                i10 = view.getMeasuredWidth();
            } else {
                i10 = -1;
            }
            if (i10 <= 0) {
                return zn.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
            }
            return i10;
        }
    }

    /* compiled from: RewardFullWebViewManager.java */
    /* loaded from: classes.dex */
    public interface fl {
        void Qhi(WebView webView, int i10);

        void Qhi(WebView webView, String str);

        void Qhi(WebView webView, String str, Bitmap bitmap);
    }

    public hpZ(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.js = qhi;
        this.WAv = qhi.cJ;
        this.Gm = qhi.f8798fl;
        this.ABk = qhi.CJ;
    }

    public static /* synthetic */ int HzH(hpZ hpz) {
        int i10 = hpz.MND;
        hpz.MND = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void PAe() {
        this.yN = true;
        this.oU = false;
        this.js.xyz.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
        this.js.xyz.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD);
        this.js.xyz.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
        this.js.js.CJ(false);
        this.js.tP.set(true);
        this.js.ReL.pA();
        this.WAv.qb();
        if (!this.WAv.qb() && js.Sf(bxS.Qhi(this.WAv))) {
            View WAv = this.js.es.WAv();
            View.OnClickListener onClickListener = (View.OnClickListener) WAv.getTag(WAv.getId());
            if (onClickListener != null) {
                Qhi qhi = new Qhi(this.js, WAv, onClickListener);
                WAv.setOnClickListener(qhi);
                WAv.setOnTouchListener(qhi);
            }
        }
    }

    public static /* synthetic */ int hpZ(hpZ hpz) {
        int i10 = hpz.Hf;
        hpz.Hf = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int iMK(hpZ hpz) {
        int i10 = hpz.Dq;
        hpz.Dq = i10 + 1;
        return i10;
    }

    private void ip() {
        this.cJ.Qhi("showPlayableEndCardOverlay", (JSONObject) null);
        this.js.xyz.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, 1000L);
        this.js.xyz.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.4
            @Override // java.lang.Runnable
            public void run() {
                hpZ.this.PAe();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.zc zcVar = this.js.gga;
        if (zcVar != null) {
            zcVar.Qhi(0L);
        }
    }

    private com.bytedance.sdk.openadsdk.cJ.ac.Tgh xyz() {
        int i10;
        String str;
        if (bxS.cJ(this.WAv)) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        if (this.ABk) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        return new kYc(i10, str, this.WAv);
    }

    public boolean FQ() {
        return this.yN;
    }

    public void Jma() {
        zn.Qhi((View) this.HzH, 8);
    }

    public boolean es() {
        SSWebView sSWebView = this.hpZ;
        if (sSWebView != null && sSWebView.getWebView() != null) {
            return false;
        }
        return true;
    }

    public boolean js() {
        if (this.MQ && this.tP.get()) {
            return true;
        }
        return false;
    }

    public void yN() {
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.f8819fl;
        if (zcVar != null) {
            zcVar.fl();
        }
    }

    public boolean zn() {
        return this.oU;
    }

    public void ABk() {
        String Tgh = bxS.Tgh(this.WAv);
        this.CJ = Tgh;
        String Qhi2 = Qhi(Tgh, this.WAv, this.f8822zc, this.pA, this.iMK);
        this.CJ = Qhi2;
        if (TextUtils.isEmpty(Qhi2)) {
            return;
        }
        this.FQ = this.CJ.contains("use_second_endcard=1");
    }

    public void CQU() {
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.Sf;
        if (tgh != null) {
            tgh.Sf();
        }
    }

    public boolean Dww() {
        return tP.ac(this.WAv) ? this.FQ && !this.PAe && this.js.Jma.zc() : this.FQ && !this.PAe && this.tP.get() && this.MQ;
    }

    public String EBS() {
        return this.ROR;
    }

    public void Eh() {
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.f8819fl;
        if (zcVar != null) {
            zcVar.Qhi(System.currentTimeMillis());
        }
    }

    public NFd Gm() {
        return this.cJ;
    }

    public boolean HzH() {
        return this.MQ;
    }

    public void MQ() {
        SSWebView sSWebView = this.hpZ;
        if (sSWebView != null) {
            sSWebView.hm();
        }
        SSWebView sSWebView2 = this.HzH;
        if (sSWebView2 != null) {
            sSWebView2.hm();
        }
        if (this.xyz == 0) {
            this.xyz = SystemClock.elapsedRealtime();
        }
        NFd nFd = this.Qhi;
        if (nFd != null) {
            nFd.WAv();
            SSWebView sSWebView3 = this.hpZ;
            if (sSWebView3 != null) {
                if (sSWebView3.getVisibility() == 0) {
                    this.Qhi.cJ(true);
                    cJ(this.Qhi, true);
                    Qhi(this.Qhi, false, true);
                } else {
                    this.Qhi.cJ(false);
                    cJ(this.Qhi, false);
                    Qhi(this.Qhi, true, false);
                }
            }
        }
        if (this.cJ != null && bxS.ac(this.WAv)) {
            this.cJ.WAv();
            SSWebView sSWebView4 = this.HzH;
            if (sSWebView4 != null) {
                if (sSWebView4.getVisibility() == 0) {
                    this.cJ.cJ(true);
                    cJ(this.cJ, true);
                    Qhi(this.cJ, false, true);
                    if (!this.yN && this.js.cJ.qb()) {
                        ip();
                    }
                } else {
                    this.cJ.cJ(false);
                    cJ(this.cJ, false);
                    Qhi(this.cJ, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.f8819fl;
        if (zcVar != null) {
            zcVar.ROR();
        }
    }

    public void NFd() {
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.Sf;
        if (tgh != null) {
            tgh.ac();
            this.Sf.CJ();
        }
    }

    public NFd WAv() {
        return this.Qhi;
    }

    public boolean aP() {
        return this.f8820hm;
    }

    public String bxS() {
        return this.CJ;
    }

    public SSWebView hm() {
        return this.HzH;
    }

    public boolean hpZ() {
        return this.tP.get();
    }

    public void iMK() {
        SSWebView sSWebView = this.hpZ;
        if (sSWebView != null) {
            lG.Qhi(sSWebView.getWebView());
        }
        SSWebView sSWebView2 = this.HzH;
        if (sSWebView2 != null) {
            lG.Qhi(sSWebView2.getWebView());
        }
        long j10 = this.jPH;
        boolean z10 = false;
        if (j10 > 0) {
            if (this.xyz > 0) {
                this.jPH = (SystemClock.elapsedRealtime() - this.xyz) + j10;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", tP.ac(this.WAv) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(this.js.cJ, this.Gm, "second_endcard_duration", jSONObject, this.jPH);
        }
        this.hpZ = null;
        if (this.Sf != null && !com.bytedance.sdk.openadsdk.core.model.HzH.ac(this.WAv) && !com.bytedance.sdk.openadsdk.core.model.HzH.CJ(this.WAv) && !tP.ac(this.WAv)) {
            this.Sf.Qhi(true);
            this.Sf.zc();
        }
        NFd nFd = this.Qhi;
        if (nFd != null) {
            nFd.Gm();
        }
        NFd nFd2 = this.cJ;
        if (nFd2 != null) {
            nFd2.Gm();
        }
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.f8819fl;
        if (zcVar != null) {
            if (this.WAv.js() || bxS.cJ(this.WAv)) {
                z10 = true;
            }
            zcVar.ac(z10);
        }
        DeviceUtils.AudioInfoReceiver.cJ(this);
    }

    public void kYc() {
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.Sf;
        if (tgh != null) {
            tgh.hm();
        }
        com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.f8819fl;
        if (zcVar != null) {
            zcVar.Sf();
        }
    }

    public boolean lB() {
        NFd nFd = this.Qhi;
        if (nFd == null) {
            return false;
        }
        return nFd.Sf();
    }

    public void lG() {
        zn.Qhi((View) this.hpZ, 0);
        zn.Qhi((View) this.HzH, 8);
    }

    public boolean pA() {
        String str = this.CJ;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void pM() {
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.Sf;
        if (tgh != null) {
            tgh.ROR();
        }
    }

    public int qMt() {
        return this.Tgh;
    }

    public void sDy() {
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.Sf;
        if (tgh != null) {
            tgh.WAv();
        }
    }

    public void tP() {
        SSWebView sSWebView = this.hpZ;
        if (sSWebView != null) {
            sSWebView.Gm();
        }
        SSWebView sSWebView2 = this.HzH;
        if (sSWebView2 != null) {
            sSWebView2.Gm();
        }
        if (this.xyz > 0) {
            this.jPH = (SystemClock.elapsedRealtime() - this.xyz) + this.jPH;
            this.xyz = 0L;
        }
        NFd nFd = this.Qhi;
        if (nFd != null) {
            nFd.cJ(false);
            cJ(this.Qhi, false);
            Qhi(this.Qhi, true, false);
        }
        if (this.cJ == null || !bxS.ac(this.WAv)) {
            return;
        }
        this.cJ.cJ(false);
        cJ(this.cJ, false);
        Qhi(this.cJ, true, false);
    }

    public com.bytedance.sdk.openadsdk.cJ.zc zc() {
        return this.f8819fl;
    }

    public void ROR() {
        if (this.hpZ == null) {
            return;
        }
        this.tP.set(this.qMt);
        if (this.HzH.getVisibility() == 0 && this.qMt) {
            ip();
            return;
        }
        this.js.js.ac(false);
        this.js.CQU.fl();
        Qhi(this.Qhi, true, false);
        cJ(this.Qhi, false);
        Qhi(this.Qhi, false);
        this.hpZ.zc();
        if (this.qMt) {
            this.HzH.setVisibility(0);
            Qhi(this.cJ, this.js.dIT, true);
            cJ(this.cJ, true);
            Qhi(this.cJ, true);
            this.js.xyz.removeMessages(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.js;
            if (!qhi.f8802zn.ac(qhi.ReL)) {
                this.js.ReL.Dww();
            }
        } else {
            if (this.js.CQU.tP()) {
                this.js.CQU.cJ(5);
            }
            this.js.f8802zn.CJ();
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.js;
            qhi2.gga.Qhi(qhi2.Sf);
        }
        this.oU = true;
    }

    public SSWebView Sf() {
        return this.hpZ;
    }

    public void Tgh() {
        com.bykv.vk.openvk.component.video.api.ac.cJ FQ = this.WAv.FQ();
        if (FQ == null) {
            return;
        }
        String zc2 = FQ.zc();
        this.HLI = zc2;
        if (TextUtils.isEmpty(zc2)) {
            return;
        }
        this.HLI = Qhi(this.HLI, this.WAv, this.f8822zc, this.pA, this.iMK);
        this.HzH.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), this.cJ, this.WAv.HLI(), this.f8819fl, this.WAv.js() || bxS.cJ(this.WAv)) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = hpZ.this.Sf;
                if (tgh != null) {
                    tgh.Tgh();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = hpZ.this.Sf;
                if (tgh != null) {
                    tgh.fl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                if (hpZ.this.Qhi(str2)) {
                    return;
                }
                hpZ.this.qMt = false;
                hpZ hpz = hpZ.this;
                hpz.Tgh = i10;
                hpz.ROR = str;
                if (hpz.Sf != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i10);
                        jSONObject.put("msg", str);
                        hpZ.this.Sf.Qhi(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                super.onReceivedError(webView, i10, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            @TargetApi(21)
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    hpZ.this.qMt = false;
                    if (webResourceResponse != null) {
                        hpZ.this.Tgh = webResourceResponse.getStatusCode();
                        hpZ.this.ROR = "onReceivedHttpError";
                    }
                }
                if (hpZ.this.Sf != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (webResourceResponse != null) {
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                        }
                        hpZ.this.Sf.Qhi(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                if (webResourceRequest != null) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
            @TargetApi(23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !hpZ.this.Qhi(webResourceRequest.getUrl().toString())) {
                    hpZ.this.qMt = false;
                    if (hpZ.this.Sf != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put("msg", webResourceError.getDescription());
                            }
                            hpZ.this.Sf.Qhi(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    if (webResourceError != null) {
                        hpZ.this.Tgh = webResourceError.getErrorCode();
                        hpZ.this.ROR = String.valueOf(webResourceError.getDescription());
                    }
                    if (webResourceRequest == null) {
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }
            }
        });
        this.HzH.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.fl(this.cJ, this.f8819fl) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.fl, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (hpZ.this.js.ROR && hpZ.this.js.oU != null) {
                    hpZ.this.js.oU.Qhi(webView, i10, hpZ.this.dVA);
                }
            }
        });
        com.bytedance.sdk.openadsdk.utils.tP.Qhi(this.HzH, this.HLI);
        this.qMt = true;
    }

    public void fl() {
        if (TextUtils.isEmpty(tP.Qhi(this.js.f8800ip, this.WAv))) {
            tP tPVar = this.WAv;
            if (tPVar != null && !tPVar.Ttc() && this.cjC == null && pA()) {
                this.YB = this.WAv.Ri();
                this.cjC = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().cJ();
                int Qhi2 = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(this.cjC, this.YB);
                this.dIT = Qhi2;
                this.Qe = Qhi2 > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.YB)) {
                    com.bytedance.sdk.openadsdk.cJ.zc zcVar = this.f8819fl;
                    if (zcVar != null) {
                        zcVar.Qhi(this.Qe);
                    }
                    ac.Qhi.Qhi(this.NBs, this.WAv, "landingpage_endcard", this.cjC, this.YB);
                }
            }
            if ((TextUtils.isEmpty(this.CJ) || !this.CJ.contains("play.google.com/store")) && !com.bytedance.sdk.openadsdk.core.model.HzH.fl(this.WAv) && !com.bytedance.sdk.openadsdk.core.model.HzH.CJ(this.WAv)) {
                if (this.f8818ac) {
                    if (this.hpZ != null && !TextUtils.isEmpty(this.CJ) && tP.cJ(this.WAv)) {
                        if (this.ots) {
                            return;
                        }
                        String g10 = r.g(new StringBuilder(), this.CJ, "&is_pre_render=1");
                        Objects.toString(this.hpZ.getWebView());
                        com.bytedance.sdk.openadsdk.cJ.zc zcVar2 = this.f8819fl;
                        if (zcVar2 != null) {
                            zcVar2.CJ();
                        }
                        com.bytedance.sdk.openadsdk.utils.tP.Qhi(this.hpZ, g10);
                        this.js.CQU.ac(g10);
                        this.ots = true;
                        return;
                    } else if (tP.ac(this.WAv)) {
                        this.js.Jma.ac();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            this.f8820hm = true;
        }
    }

    public boolean CJ() {
        return this.PAe;
    }

    public boolean ac() {
        return this.f8821ip;
    }

    public void cJ() {
        com.bytedance.sdk.openadsdk.common.ROR ror;
        this.bxS = this.js.FQ.findViewById(16908290);
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.js;
        boolean z10 = qhi.ROR;
        this.Jma = z10;
        if (z10 && (ror = this.lG) != null) {
            this.hpZ = ror.CJ();
        } else {
            SSWebView sSWebView = (SSWebView) qhi.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.iMK);
            this.hpZ = sSWebView;
            if (sSWebView != null && tP.cJ(this.WAv)) {
                this.hpZ.g_();
            } else {
                zn.Qhi((View) this.hpZ, 8);
            }
        }
        SSWebView sSWebView2 = (SSWebView) this.js.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.hpZ);
        this.HzH = sSWebView2;
        if (sSWebView2 != null && bxS.cJ(this.WAv)) {
            this.HzH.g_();
            this.HzH.setDisplayZoomControls(false);
        } else {
            zn.Qhi((View) this.HzH, 8);
        }
        SSWebView sSWebView3 = this.hpZ;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (hpZ.this.hpZ != null && hpZ.this.hpZ.getViewTreeObserver() != null) {
                        hpZ.this.hpZ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int measuredWidth = hpZ.this.hpZ.getMeasuredWidth();
                        int measuredHeight = hpZ.this.hpZ.getMeasuredHeight();
                        if (hpZ.this.hpZ.getVisibility() == 0) {
                            hpZ.this.Qhi(measuredWidth, measuredHeight);
                        }
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.HzH;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.HzH.setTag(bxS.cJ(this.WAv) ? this.Gm : "landingpage_endcard");
            this.HzH.setWebViewClient(new SSWebView.Qhi());
            this.HzH.setMaterialMeta(this.WAv.ne());
        }
    }

    public void CJ(boolean z10) {
        if (this.Qhi == null || this.js.FQ.isFinishing()) {
            return;
        }
        this.js.CQU.fl(z10);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            this.Qhi.Qhi("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void ac(boolean z10) {
        cJ(this.Qhi, z10);
    }

    /* compiled from: RewardFullWebViewManager.java */
    /* loaded from: classes.dex */
    public static class Qhi extends com.bytedance.sdk.openadsdk.core.cJ.Qhi implements cJ.Qhi {
        private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi Qhi;

        /* renamed from: ac  reason: collision with root package name */
        private final View.OnClickListener f8824ac;
        private final View cJ;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Qhi(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r5, android.view.View r6, android.view.View.OnClickListener r7) {
            /*
                r4 = this;
                android.app.Activity r0 = r5.FQ
                com.bytedance.sdk.openadsdk.core.model.tP r1 = r5.cJ
                java.lang.String r2 = r5.f8798fl
                boolean r3 = r5.CJ
                if (r3 == 0) goto Lc
                r3 = 7
                goto Ld
            Lc:
                r3 = 5
            Ld:
                r4.<init>(r0, r1, r2, r3)
                r4.Qhi = r5
                r4.cJ = r6
                r4.f8824ac = r7
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.lang.String r7 = "close_auto_click"
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r6.put(r7, r0)
                r7 = 2
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r0 = "click_scence"
                r6.put(r0, r7)
                r4.Qhi(r6)
                com.bytedance.sdk.openadsdk.component.reward.Qhi.fl r5 = r5.Dww
                com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl r5 = r5.ac()
                r4.Qhi(r5)
                r4.Qhi(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.Qhi.<init>(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi, android.view.View, android.view.View$OnClickListener):void");
        }

        @Override // com.bytedance.sdk.openadsdk.core.cJ.Qhi, com.bytedance.sdk.openadsdk.core.cJ.cJ, com.bytedance.sdk.openadsdk.core.cJ.ac
        public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
            if (((com.bytedance.sdk.openadsdk.core.cJ.cJ) this).Tgh.qb()) {
                this.f8824ac.onClick(view);
                this.cJ.setOnTouchListener(null);
                this.cJ.setOnClickListener(this.f8824ac);
                return;
            }
            super.Qhi(view, f10, f11, f12, f13, sparseArray, z10);
            this.Qhi.PAe.c_();
        }

        @Override // com.bytedance.sdk.openadsdk.core.cJ.cJ.Qhi
        public void Qhi(View view, int i10) {
            this.cJ.setOnTouchListener(null);
            this.cJ.setOnClickListener(this.f8824ac);
        }
    }

    public void Qhi() {
        if (this.EBS) {
            return;
        }
        this.EBS = true;
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.js;
        this.f8822zc = qhi.Dq;
        this.iMK = qhi.NBs;
        this.pA = qhi.dI;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cJ();
        this.NBs = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    public void Qhi(String str, final com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar) {
        Qhi(str, new fl() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.10
            @Override // com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.fl
            public void Qhi(WebView webView, String str2) {
                if (hpZ.this.js.FQ.isFinishing()) {
                    return;
                }
                hpZ.this.js.CQU.Tgh(hpZ.this.hpZ());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.fl
            public void Qhi(WebView webView, String str2, Bitmap bitmap) {
                if (hpZ.this.f8823zn || !bxS.Gm(hpZ.this.js.cJ)) {
                    return;
                }
                hpZ.this.f8823zn = true;
                hpZ.this.js.CQU.Qhi(hpZ.this.js.Tgh, hpZ.this.js.cJ, hpZ.this.js.cJ.LpL());
                if (!bxS.ac(hpZ.this.WAv)) {
                    hpZ.this.js.xyz.sendEmptyMessageDelayed(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, hpZ.this.js.CQU.Gm() * 1000);
                }
                hpZ.this.js.CQU.ROR();
                hpZ.this.js.PAe.Gm();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.fl
            public void Qhi(WebView webView, int i10) {
                try {
                    if (!bxS.Gm(hpZ.this.js.cJ) || !hpZ.this.js.cJ.Ls() || hpZ.this.js.FQ.isFinishing()) {
                        if (!hpZ.this.js.ROR || hpZ.this.js.oU == null) {
                            return;
                        }
                        hpZ.this.js.oU.Qhi(webView, i10, hpZ.this.dVA);
                        return;
                    }
                    hpZ.this.js.CQU.ac(i10);
                } catch (Exception unused) {
                }
            }
        });
        if (bxS.Gm(this.js.cJ)) {
            Qhi(this.HzH);
            this.js.CQU.Qhi(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.11
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j10) {
                    hpZ.this.js.Dww.cJ();
                    com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar2 = cJVar;
                    if (cJVar2 != null) {
                        cJVar2.CJ();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.js;
        qhi.CQU.Qhi(qhi.ots);
        Qhi(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.12
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j10) {
                hpZ.this.js.Dww.cJ();
                com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar2 = cJVar;
                if (cJVar2 != null) {
                    cJVar2.CJ();
                }
            }
        });
    }

    public void Qhi(com.bytedance.sdk.openadsdk.WAv.Tgh tgh, String str, final com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar) {
        if (this.hpZ == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (bxS.cJ(this.WAv)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.Sf = xyz();
        NFd nFd = new NFd(this.js.FQ);
        this.Qhi = nFd;
        nFd.Qhi(this.js.PAe);
        String bIO = this.WAv.bIO();
        this.Qhi.cJ(this.hpZ).Qhi(this.WAv).ac(this.WAv.HLI()).CJ(this.WAv.EGK()).cJ(this.WAv.LpL() ? 7 : 5).Qhi(new cJ(this.hpZ)).fl(bIO).Qhi(this.hpZ).cJ(pA() ? "landingpage_endcard" : str).Qhi(hashMap).Qhi(this.Sf).Qhi(new com.bytedance.sdk.openadsdk.core.widget.ac() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.ac
            public void Qhi() {
                if (hpZ.this.es != null) {
                    hpZ.this.es.cJ();
                }
                com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar2 = cJVar;
                if (cJVar2 != null) {
                    cJVar2.CJ();
                }
            }
        });
        HashMap hashMap2 = new HashMap();
        if (bxS.ac(this.WAv)) {
            hashMap2.put("click_scence", 2);
        }
        NFd nFd2 = new NFd(this.js.FQ);
        this.cJ = nFd2;
        nFd2.Qhi(this.js.PAe);
        NFd fl2 = this.cJ.cJ(this.HzH).Qhi(this.WAv).ac(this.WAv.HLI()).CJ(this.WAv.EGK()).cJ(this.WAv.LpL() ? 7 : 5).Qhi(new cJ(this.HzH)).Qhi(this.HzH).fl(bIO);
        if (pA()) {
            str = "landingpage_endcard";
        }
        fl2.cJ(str).Qhi(hashMap2).Qhi(this.Sf).Qhi(new com.bytedance.sdk.openadsdk.core.widget.ac() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.15
            @Override // com.bytedance.sdk.openadsdk.core.widget.ac
            public void Qhi() {
                if (hpZ.this.es != null) {
                    hpZ.this.es.cJ();
                }
            }
        }).Qhi(new NFd.Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.14
            @Override // com.bytedance.sdk.openadsdk.core.NFd.Qhi
            public void Qhi() {
                hpZ.this.PAe();
            }
        });
        this.Qhi.Qhi(new ac(this.hpZ));
        this.cJ.Qhi(new ac(this.HzH));
        this.Qhi.Qhi(this.js.es.WAv()).Qhi(this.js.ots).Qhi(tgh).Qhi(this.js.CQU.hpZ()).Qhi(new com.bytedance.sdk.openadsdk.WAv.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.16
            @Override // com.bytedance.sdk.openadsdk.WAv.cJ
            public void Qhi(boolean z10, int i10, String str2) {
                if (z10) {
                    hpZ.this.js.CQU.ac();
                    if (hpZ.this.dI) {
                        hpZ.this.dI = false;
                        hpZ hpz = hpZ.this;
                        hpz.Qhi(hpz.js.dIT, true);
                    }
                }
                if (!tP.CJ(hpZ.this.js.cJ) || bxS.cJ(hpZ.this.js.cJ)) {
                    return;
                }
                hpZ.this.Qhi(z10, i10, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.WAv.cJ
            public void Qhi() {
                hpZ.this.f8821ip = true;
                hpZ.this.js.es.WAv().performClick();
            }
        });
        this.Qhi.fl(this.FQ);
        this.cJ.Qhi(this.js.es.WAv()).Qhi(new com.bytedance.sdk.openadsdk.WAv.cJ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.17
            @Override // com.bytedance.sdk.openadsdk.WAv.cJ
            public void Qhi(boolean z10, int i10, String str2) {
            }

            @Override // com.bytedance.sdk.openadsdk.WAv.cJ
            public void Qhi() {
                hpZ.this.f8821ip = true;
                hpZ.this.js.es.WAv().performClick();
            }
        });
    }

    public void cJ(int i10) {
        zn.Qhi((View) this.hpZ, i10);
        SSWebView sSWebView = this.hpZ;
        if (sSWebView != null) {
            zn.Qhi((View) sSWebView.getWebView(), i10);
        }
        if (this.hpZ != null && (this.WAv.js() || bxS.cJ(this.WAv))) {
            this.hpZ.setLandingPage(true);
            this.hpZ.setTag(bxS.cJ(this.WAv) ? this.Gm : "landingpage_endcard");
            this.hpZ.setMaterialMeta(this.WAv.ne());
        }
        if (i10 == 0 && bxS.ac(this.WAv)) {
            Tgh();
        }
    }

    public void cJ(boolean z10) {
        Qhi(this.Qhi, z10);
    }

    public void cJ(NFd nFd, boolean z10) {
        try {
            this.js.CQU.CJ(z10);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z10 ? 1 : 0);
            nFd.Qhi("viewableChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void fl(boolean z10) {
        this.PAe = true;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("endcard_overlay_render_type", tP.ac(this.WAv) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.cJ(this.WAv, this.Gm, "use_second_endcard", jSONObject);
        this.xyz = SystemClock.elapsedRealtime();
        try {
            if (!tP.ac(this.WAv)) {
                this.Qhi.Qhi("click_endcard_close", (JSONObject) null);
            } else if (z10) {
                this.js.Jma.Sf();
                com.bytedance.sdk.openadsdk.cJ.ac.cJ(this.WAv, this.Gm, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.js;
        qhi.gga.Qhi(qhi.Sf);
    }

    public void Qhi(int i10, int i11) {
        if (this.Qhi != null && !this.js.FQ.isFinishing()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(InMobiNetworkValues.WIDTH, i10);
                jSONObject.put(InMobiNetworkValues.HEIGHT, i11);
                this.Qhi.Qhi("resize", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public void Qhi(boolean z10) {
        this.f8818ac = z10;
    }

    private static String Qhi(String str, tP tPVar, int i10, int i11, int i12) {
        String concat;
        String concat2;
        float Oy = tPVar.Oy();
        if (!TextUtils.isEmpty(str)) {
            if (i10 == 1) {
                if (str.contains("?")) {
                    concat2 = str.concat("&");
                } else {
                    concat2 = str.concat("?");
                }
                str = h.c(concat2, "orientation=portrait");
            }
            if (str.contains("?")) {
                concat = str.concat("&");
            } else {
                concat = str.concat("?");
            }
            str = concat + "height=" + i11 + "&width=" + i12 + "&aspect_ratio=" + Oy;
        }
        return !bxS.cJ(tPVar) ? com.bytedance.sdk.openadsdk.utils.fl.Qhi(str) : str;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.common.ROR ror) {
        this.lG = ror;
    }

    public void Qhi(float f10) {
        zn.Qhi(this.hpZ, f10);
    }

    public void Qhi(NFd nFd, boolean z10) {
        if (this.Qhi == null || this.js.FQ.isFinishing()) {
            return;
        }
        nFd.cJ(z10);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Qhi(String str, final fl flVar) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.hpZ;
        if (sSWebView2 != null && sSWebView2.getWebView() != null) {
            com.bytedance.sdk.openadsdk.cJ.zc Qhi2 = new com.bytedance.sdk.openadsdk.cJ.zc(this.WAv, this.hpZ.getWebView(), new com.bytedance.sdk.openadsdk.cJ.Gm() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.5
                @Override // com.bytedance.sdk.openadsdk.cJ.Gm
                public void Qhi(int i10) {
                    if (!TextUtils.isEmpty(hpZ.this.YB)) {
                        ac.Qhi.Qhi(hpZ.this.dIT, hpZ.this.MND, hpZ.this.Hf, hpZ.this.Dq - hpZ.this.Hf, hpZ.this.WAv, "landingpage_endcard", i10);
                    }
                }
            }, this.Qe).Qhi(true);
            this.f8819fl = Qhi2;
            this.dVA = Qhi2.Qhi;
            Qhi2.Qhi(pA() ? "landingpage_endcard" : str);
            this.f8819fl.cJ(this.Gm);
            this.f8819fl.cJ(true);
            int i10 = Build.VERSION.SDK_INT;
            this.hpZ.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.6
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                    com.bytedance.sdk.openadsdk.cJ.zc zcVar = hpZ.this.f8819fl;
                    if (zcVar != null) {
                        zcVar.cJ(i12);
                    }
                }
            });
            Sf sf2 = this.js.CQU;
            if (sf2 != null) {
                this.f8819fl.Qhi(sf2.MQ());
            }
            com.bytedance.sdk.openadsdk.common.cJ Qhi3 = js.Qhi(this.WAv, this.hpZ, this.js.FQ, this.Gm);
            this.zjb = Qhi3;
            if (Qhi3 != null) {
                if (pA()) {
                    str = "landingpage_endcard";
                }
                Qhi3.Qhi(str);
            }
            if (pA()) {
                js.Qhi(this.WAv, this.hpZ);
            }
            com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh tgh = new com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), this.Qhi, this.WAv.HLI(), this.zjb, this.f8819fl, this.WAv.js() || bxS.cJ(this.WAv)) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.7
                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    hpZ.this.ots = false;
                    hpZ.this.MQ = true;
                    DeviceUtils.AudioInfoReceiver.Qhi(hpZ.this);
                    hpZ.this.pv = DeviceUtils.ROR();
                    com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh2 = hpZ.this.Sf;
                    if (tgh2 != null) {
                        tgh2.Tgh();
                    }
                    hpZ.this.js.CQU.cJ(str2);
                    fl flVar2 = flVar;
                    if (flVar2 != null) {
                        flVar2.Qhi(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh2 = hpZ.this.Sf;
                    if (tgh2 != null) {
                        tgh2.fl();
                    }
                    fl flVar2 = flVar;
                    if (flVar2 != null) {
                        flVar2.Qhi(webView, str2, bitmap);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i11, String str2, String str3) {
                    super.onReceivedError(webView, i11, str2, str3);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                @TargetApi(21)
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    hpZ.this.js.CQU.Qhi(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    if (webResourceRequest.getUrl() != null) {
                        webResourceRequest.getUrl().toString();
                    }
                    if (webResourceRequest.isForMainFrame()) {
                        hpZ.this.tP.set(false);
                        hpZ.this.ots = false;
                        hpZ.this.Tgh = webResourceResponse.getStatusCode();
                        hpZ.this.ROR = "onReceivedHttpError";
                    }
                    if (hpZ.this.Sf != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                            hpZ.this.Sf.Qhi(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    if (!bxS.cJ(hpZ.this.WAv)) {
                        try {
                            if (TextUtils.isEmpty(hpZ.this.YB)) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            hpZ.iMK(hpZ.this);
                            WebResourceResponseModel Qhi4 = com.bytedance.sdk.openadsdk.fl.cJ.Qhi().Qhi(hpZ.this.cjC, hpZ.this.YB, str2);
                            if (Qhi4 != null && Qhi4.getWebResourceResponse() != null) {
                                hpZ.hpZ(hpZ.this);
                                return Qhi4.getWebResourceResponse();
                            }
                            if (Qhi4 != null && Qhi4.getMsg() == 2) {
                                hpZ.HzH(hpZ.this);
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable th2) {
                            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFWVM", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse Qhi5 = com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(hpZ.this.WAv.FQ().ABk(), bxS.Tgh(hpZ.this.WAv), str2);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (hpZ.this.Sf != null) {
                        Eh.Qhi Qhi6 = Eh.Qhi(str2);
                        int i11 = Qhi5 != null ? 1 : 2;
                        if (Qhi6 == Eh.Qhi.HTML) {
                            hpZ.this.Sf.Qhi(str2, currentTimeMillis, currentTimeMillis2, i11);
                        } else if (Qhi6 == Eh.Qhi.JS) {
                            hpZ.this.Sf.cJ(str2, currentTimeMillis, currentTimeMillis2, i11);
                        }
                    }
                    return Qhi5;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                @TargetApi(23)
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Objects.toString(webResourceError.getDescription());
                        webResourceRequest.getUrl().toString();
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !hpZ.this.Qhi(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            hpZ.this.js.CQU.Qhi(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            hpZ.this.tP.set(false);
                            hpZ.this.ots = false;
                        }
                        if (hpZ.this.Sf != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put("msg", webResourceError.getDescription());
                                }
                                hpZ.this.Sf.Qhi(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            hpZ.this.Tgh = webResourceError.getErrorCode();
                            hpZ.this.ROR = String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.Tgh, android.webkit.WebViewClient
                @TargetApi(21)
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFWVM", "shouldInterceptRequest error1", th2);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }
            };
            this.es = tgh;
            this.hpZ.setWebViewClient(tgh);
            this.es.Qhi(this.WAv);
            this.es.Qhi(this.ABk ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (this.WAv.js() && (sSWebView = this.hpZ) != null && sSWebView.getWebView() != null) {
                this.hpZ.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.8
                    private final int cJ = com.bytedance.sdk.openadsdk.core.HzH.cJ();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int i11;
                        int i12;
                        int i13;
                        int i14;
                        com.bytedance.sdk.openadsdk.cJ.zc zcVar = hpZ.this.f8819fl;
                        if (zcVar != null) {
                            zcVar.Qhi(motionEvent);
                        }
                        if (hpZ.this.zjb != null) {
                            hpZ.this.zjb.Qhi(motionEvent);
                        }
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                hpZ.this.NFd = true;
                                hpZ.this.aP = new SparseArray();
                                hpZ.this.CQU = motionEvent.getRawX();
                                hpZ.this.pM = motionEvent.getRawY();
                                hpZ.this.Eh = System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = hpZ.this.hpZ.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < hpZ.this.Eh) {
                                        hpZ.this.Eh = landingPageClickBegin;
                                        hpZ.this.hpZ.setLandingPageClickBegin(-1L);
                                    }
                                } catch (Exception unused) {
                                }
                                hpZ.this.sDy = -1.0f;
                                hpZ.this.lB = -1.0f;
                                i11 = 0;
                            } else {
                                int i15 = 3;
                                if (actionMasked != 1) {
                                    if (actionMasked != 2) {
                                        if (actionMasked != 3) {
                                            i15 = -1;
                                        } else {
                                            i15 = 4;
                                        }
                                    } else {
                                        float rawX = motionEvent.getRawX();
                                        float rawY = motionEvent.getRawY();
                                        if (Math.abs(rawX - hpZ.this.CQU) >= this.cJ || Math.abs(rawY - hpZ.this.pM) >= this.cJ) {
                                            hpZ.this.NFd = false;
                                        }
                                        hpZ.this.sDy += Math.abs(motionEvent.getX() - hpZ.this.CQU);
                                        hpZ.this.lB += Math.abs(motionEvent.getY() - hpZ.this.pM);
                                        if (System.currentTimeMillis() - hpZ.this.Eh > 200 && (hpZ.this.sDy > 8.0f || hpZ.this.lB > 8.0f)) {
                                            i14 = 1;
                                        } else {
                                            i14 = 2;
                                        }
                                        if (hpZ.this.Jma) {
                                            if (rawY - hpZ.this.pM > 8.0f) {
                                                hpZ.this.lG.Qhi();
                                            }
                                            if (rawY - hpZ.this.pM < -8.0f) {
                                                hpZ.this.lG.cJ();
                                            }
                                        }
                                        i11 = i14;
                                    }
                                }
                                i11 = i15;
                            }
                            hpZ.this.aP.put(motionEvent.getActionMasked(), new ac.Qhi(i11, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1) {
                                if ((!hpZ.this.kYc || com.bytedance.sdk.openadsdk.core.model.HzH.ROR(hpZ.this.WAv)) && hpZ.this.NFd) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("down_x", hpZ.this.CQU);
                                    jSONObject.put("down_y", hpZ.this.pM);
                                    jSONObject.put("down_time", hpZ.this.Eh);
                                    jSONObject.put("up_x", motionEvent.getRawX());
                                    jSONObject.put("up_y", motionEvent.getRawY());
                                    long currentTimeMillis = System.currentTimeMillis();
                                    try {
                                        long landingPageClickEnd = hpZ.this.hpZ.getLandingPageClickEnd();
                                        if (landingPageClickEnd > 0 && landingPageClickEnd < currentTimeMillis) {
                                            try {
                                                hpZ.this.hpZ.setLandingPageClickEnd(-1L);
                                            } catch (Exception unused2) {
                                            }
                                            currentTimeMillis = landingPageClickEnd;
                                        }
                                    } catch (Exception unused3) {
                                    }
                                    jSONObject.put("up_time", currentTimeMillis);
                                    int[] iArr = new int[2];
                                    if (hpZ.this.Jma) {
                                        hpZ hpz = hpZ.this;
                                        hpz.Dww = hpz.js.yN.findViewById(com.bytedance.sdk.openadsdk.utils.iMK.gga);
                                    } else {
                                        hpZ hpz2 = hpZ.this;
                                        hpz2.Dww = hpz2.js.yN.findViewById(520093713);
                                    }
                                    if (hpZ.this.Dww != null) {
                                        hpZ.this.Dww.getLocationOnScreen(iArr);
                                        jSONObject.put("button_x", iArr[0]);
                                        jSONObject.put("button_y", iArr[1]);
                                        jSONObject.put("button_width", hpZ.this.Dww.getWidth());
                                        jSONObject.put("button_height", hpZ.this.Dww.getHeight());
                                    }
                                    if (hpZ.this.bxS != null) {
                                        int[] iArr2 = new int[2];
                                        hpZ.this.bxS.getLocationOnScreen(iArr2);
                                        jSONObject.put("ad_x", iArr2[0]);
                                        jSONObject.put("ad_y", iArr2[1]);
                                        jSONObject.put(InMobiNetworkValues.WIDTH, hpZ.this.bxS.getWidth());
                                        jSONObject.put(InMobiNetworkValues.HEIGHT, hpZ.this.bxS.getHeight());
                                    }
                                    jSONObject.put("toolType", motionEvent.getToolType(0));
                                    jSONObject.put("deviceId", motionEvent.getDeviceId());
                                    jSONObject.put("source", motionEvent.getSource());
                                    SparseArray sparseArray = hpZ.this.aP;
                                    if (com.bytedance.sdk.openadsdk.core.hm.cJ().Qhi()) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.Gm.Qhi(sparseArray, i12));
                                    if (hpZ.this.NFd) {
                                        i13 = 1;
                                    } else {
                                        i13 = 2;
                                    }
                                    jSONObject.put("user_behavior_type", i13);
                                    jSONObject.put("click_scence", 2);
                                    if (hpZ.this.es != null) {
                                        hpZ.this.es.Qhi(jSONObject);
                                    }
                                    if (!hpZ.this.kYc && !com.bytedance.sdk.openadsdk.core.model.HzH.Tgh(hpZ.this.WAv)) {
                                        if (hpZ.this.ABk) {
                                            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(hpZ.this.WAv, "rewarded_video", C1646h.CLICK_BEACON, jSONObject);
                                        } else {
                                            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(hpZ.this.WAv, "fullscreen_interstitial_ad", C1646h.CLICK_BEACON, jSONObject);
                                        }
                                        hpZ.this.kYc = true;
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        } catch (Throwable unused4) {
                            return false;
                        }
                    }
                });
            }
            SSWebView sSWebView3 = this.hpZ;
            if (sSWebView3 != null) {
                sSWebView3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Qhi.fl(this.Qhi, this.f8819fl, this.zjb) { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.hpZ.9
                    @Override // com.bytedance.sdk.openadsdk.core.widget.Qhi.fl, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i11) {
                        super.onProgressChanged(webView, i11);
                        fl flVar2 = flVar;
                        if (flVar2 != null) {
                            flVar2.Qhi(webView, i11);
                        }
                    }
                });
            }
            Qhi(this.hpZ);
            if (i10 >= 24) {
                this.hpZ.setLayerType(1, null);
            }
            this.hpZ.setBackgroundColor(-1);
            this.hpZ.setDisplayZoomControls(false);
        }
        fl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.WAv.js() && str.endsWith(".mp4");
    }

    public void Qhi(DownloadListener downloadListener) {
        SSWebView sSWebView = this.hpZ;
        if (sSWebView == null || downloadListener == null) {
            return;
        }
        sSWebView.setDownloadListener(downloadListener);
    }

    public void Qhi(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.Qhi.ac.Qhi(this.js.FQ).Qhi(false).cJ(false).Qhi(sSWebView.getWebView());
        sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.HzH.Qhi(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
        sSWebView.setMixedContentMode(0);
    }

    public void Qhi(boolean z10, boolean z11) {
        Qhi(this.Qhi, z10, z11);
    }

    public void Qhi(NFd nFd, boolean z10, boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            jSONObject.put("endcard_show", z11);
            com.bytedance.sdk.openadsdk.activity.ROR ror = this.js.Ura;
            if (ror != null) {
                jSONObject.put("multi_ads_show", ror.bxS().Tgh());
            }
            nFd.Qhi("endcard_control_event", jSONObject);
            if (z11) {
                if (this.MQ) {
                    return;
                }
                this.dI = true;
                return;
            }
            this.dI = false;
        } catch (Exception unused) {
        }
    }

    public void Qhi(boolean z10, int i10, String str) {
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.Sf;
        if (tgh == null) {
            return;
        }
        if (z10) {
            tgh.cJ();
        } else {
            tgh.Qhi(i10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.WAv.Sf
    public void Qhi(int i10) {
        int i11 = this.pv;
        if (i11 <= 0 && i10 > 0) {
            CJ(false);
        } else if (i11 > 0 && i10 == 0) {
            CJ(true);
        }
        this.pv = i10;
    }
}

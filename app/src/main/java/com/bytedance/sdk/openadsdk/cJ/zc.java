package com.bytedance.sdk.openadsdk.cJ;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.widget.PangleWebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.CJ.MQ;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LandingPageLog.java */
/* loaded from: classes.dex */
public class zc {
    private static final int[] cJ = {10, 30, 50, 75, 100};
    private String ABk;
    private long CJ;
    private long CQU;
    private long Dww;
    private long EBS;
    private final boolean Eh;
    private volatile int FQ;
    private boolean Gm;
    private com.bytedance.sdk.openadsdk.hpZ.hm HzH;
    private Gm Jma;
    private final AtomicBoolean MND;
    private String MQ;
    private WebView NFd;
    private int PAe;
    private long Qe;
    public ROR.Qhi Qhi;
    private final AtomicBoolean ROR;
    private final AtomicBoolean Sf;
    private final AtomicBoolean Tgh;
    private int WAv;
    private final AtomicBoolean YB;
    private final AtomicInteger aP;

    /* renamed from: ac  reason: collision with root package name */
    private int f8708ac;
    private long bxS;
    private String cjC;
    private String dIT;
    private final AtomicInteger es;

    /* renamed from: fl  reason: collision with root package name */
    private int f8709fl;

    /* renamed from: hm  reason: collision with root package name */
    private final AtomicBoolean f8710hm;
    private boolean hpZ;
    private final Context iMK;

    /* renamed from: ip  reason: collision with root package name */
    private volatile long f8711ip;
    private volatile long jPH;
    private volatile long js;
    private hm kYc;
    private com.bytedance.sdk.openadsdk.cJ.ac.Tgh lB;
    private boolean lG;
    private com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR pA;
    private boolean pM;
    private long qMt;
    private boolean sDy;
    private final tP tP;
    private volatile long xyz;
    private final AtomicBoolean yN;

    /* renamed from: zc  reason: collision with root package name */
    private String f8712zc;

    /* renamed from: zn  reason: collision with root package name */
    private final AtomicInteger f8713zn;

    /* compiled from: LandingPageLog.java */
    /* loaded from: classes.dex */
    public class Qhi {
        private Qhi() {
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i10 = 0;
            try {
                int intValue = Float.valueOf(str).intValue();
                if (intValue > 100) {
                    i10 = 100;
                } else if (intValue >= 0) {
                    i10 = intValue;
                }
            } catch (Throwable unused) {
            }
            zc.this.aP.set(i10);
        }
    }

    public zc(tP tPVar, WebView webView, Gm gm2, int i10) {
        this(tPVar, webView);
        this.Jma = gm2;
        this.PAe = i10;
    }

    private int WAv() {
        WebView webView = this.NFd;
        if (webView != null) {
            try {
                WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                if (copyBackForwardList != null) {
                    if (copyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    private boolean hm() {
        tP tPVar;
        if (this.lG && (tPVar = this.tP) != null && tPVar.Ttc()) {
            return true;
        }
        return false;
    }

    public void CJ() {
        if (hm()) {
            this.f8711ip = SystemClock.elapsedRealtime();
            ac.Qhi(this.tP, this.dIT);
        }
    }

    public void ROR() {
        if (this.CQU == 0) {
            this.CQU = System.currentTimeMillis();
        }
        this.qMt = System.currentTimeMillis();
        if ("landingpage".equals(this.MQ) || "landingpage_endcard".equals(this.MQ) || "landingpage_split_screen".equals(this.MQ) || "landingpage_direct".equals(this.MQ) || "aggregate_page".equals(this.MQ)) {
            if (this.YB.compareAndSet(false, true)) {
                MQ.Qhi().Qhi("landingStart", this.tP, this.cjC);
            } else {
                MQ.Qhi().Qhi("landingContinue", this.tP, this.cjC);
            }
        }
    }

    public void Sf() {
        boolean z10;
        if (!"landingpage".equals(this.MQ) && !"landingpage_endcard".equals(this.MQ) && !"landingpage_split_screen".equals(this.MQ) && !"landingpage_direct".equals(this.MQ) && !"aggregate_page".equals(this.MQ)) {
            return;
        }
        if (this.f8709fl == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.EBS > 0 || !ac()) {
                long currentTimeMillis = System.currentTimeMillis() - Math.max(this.qMt, this.EBS);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.f8709fl);
                    jSONObject.put("max_scroll_percent", this.aP.get());
                    jSONObject.put("jump_times", this.f8713zn.getAndSet(0));
                    jSONObject.put("click_times", this.es.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.f8710hm.set(true);
                Qhi("stay_page", jSONObject, Math.min(currentTimeMillis, (long) TTAdConstant.AD_MAX_EVENT_TIME));
                MQ.Qhi().Qhi("landingPause", this.tP, this.cjC);
            }
        }
    }

    public void Tgh() {
        if (hm() && this.xyz > 0 && this.jPH > 0 && !this.MND.getAndSet(true)) {
            ac.cJ(this.jPH - this.xyz, this.tP, this.dIT, (String) null);
        }
    }

    public void fl() {
        if (hm()) {
            this.xyz = SystemClock.elapsedRealtime();
            Tgh();
        }
    }

    public boolean ac() {
        return this.lG;
    }

    public com.bytedance.sdk.openadsdk.cJ.ac.Tgh cJ() {
        return this.lB;
    }

    private String ac(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void cJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dIT = str;
    }

    public zc(tP tPVar, WebView webView) {
        this.f8708ac = 0;
        this.CJ = -1L;
        this.f8709fl = 1;
        this.Tgh = new AtomicBoolean(false);
        this.ROR = new AtomicBoolean(false);
        this.Sf = new AtomicBoolean(false);
        this.f8710hm = new AtomicBoolean(false);
        this.WAv = -1;
        this.MQ = "landingpage";
        this.qMt = 0L;
        this.EBS = 0L;
        this.bxS = 0L;
        this.Dww = 0L;
        this.CQU = 0L;
        this.pM = false;
        this.Eh = false;
        this.aP = new AtomicInteger(0);
        this.sDy = false;
        this.lG = false;
        this.js = 0L;
        this.f8713zn = new AtomicInteger(0);
        this.es = new AtomicInteger(0);
        this.yN = new AtomicBoolean(false);
        this.FQ = 0;
        this.PAe = -1;
        this.MND = new AtomicBoolean(false);
        this.YB = new AtomicBoolean(false);
        Context Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
        this.iMK = Qhi2;
        this.tP = tPVar;
        this.NFd = webView;
        if (tPVar != null && tPVar.xyz()) {
            com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR ror = new com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR(this.NFd, tPVar, Qhi2);
            this.pA = ror;
            this.Qhi = ror.ac();
        }
        if (webView == null) {
            return;
        }
        if (tPVar != null && tPVar.jPH() && com.bytedance.sdk.openadsdk.core.settings.HzH.YD().vml()) {
            this.kYc = new hm(tPVar, webView);
        }
        if (webView instanceof PangleWebView) {
            this.Qe = ((PangleWebView) this.NFd).Qhi;
        } else {
            this.Qe = System.currentTimeMillis();
        }
        try {
            this.NFd.addJavascriptInterface(new Qhi(), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("LandingPageLog", "addJavascriptInterface exception", e10);
        }
        if (tPVar != null && tPVar.KW() != null) {
            this.CJ = tPVar.KW().optLong("page_id", -1L);
        }
        this.cjC = String.valueOf(SystemClock.elapsedRealtime());
    }

    public tP Qhi() {
        return this.tP;
    }

    public void ac(boolean z10) {
        WebView webView = this.NFd;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("LandingPageLog", "removeJavascriptInterface exception", e10);
            }
        }
        if (this.ROR.compareAndSet(false, true)) {
            Qhi(z10, "1");
            if (this.sDy) {
                ac.Qhi(this.tP, this.MQ, System.currentTimeMillis() - this.CQU, this.PAe, WAv());
            }
        } else if (this.f8709fl == 2 && !this.f8710hm.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.f8709fl);
                jSONObject.put("max_scroll_percent", this.aP.get());
                jSONObject.put("jump_times", this.f8713zn.getAndSet(0));
                jSONObject.put("click_times", this.es.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            Qhi("stay_page", jSONObject, 0L);
        }
        this.NFd = null;
        if ("landingpage".equals(this.MQ) || "landingpage_endcard".equals(this.MQ) || "landingpage_split_screen".equals(this.MQ) || "landingpage_direct".equals(this.MQ) || "aggregate_page".equals(this.MQ)) {
            MQ.Qhi().Qhi("landingFinish", this.tP, this.cjC);
        }
    }

    public void Qhi(long j10) {
        this.EBS = j10;
    }

    public void cJ(boolean z10) {
        this.lG = z10;
    }

    public void Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR ror = this.pA;
        if (ror != null) {
            ror.Qhi(str);
        }
        hm hmVar = this.kYc;
        if (hmVar != null) {
            hmVar.CJ(str);
        }
        this.MQ = str;
    }

    public void cJ(WebView webView, String str, boolean z10) {
        hm hmVar = this.kYc;
        if (hmVar == null || !z10) {
            return;
        }
        hmVar.Qhi(webView, str);
    }

    public void cJ(int i10) {
        com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR ror = this.pA;
        if (ror == null || !this.hpZ) {
            return;
        }
        ror.Qhi(i10);
    }

    public void Qhi(int i10) {
        this.PAe = i10;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh) {
        this.lB = tgh;
    }

    public zc Qhi(boolean z10) {
        this.sDy = z10;
        return this;
    }

    public void Qhi(com.bytedance.sdk.openadsdk.hpZ.hm hmVar) {
        this.HzH = hmVar;
    }

    public void Qhi(WebView webView, int i10) {
        if (webView == null) {
            return;
        }
        if (this.js == 0) {
            this.js = SystemClock.elapsedRealtime();
        }
        if (this.bxS == 0 && i10 > 0) {
            this.bxS = System.currentTimeMillis();
        } else if (this.Dww == 0 && i10 == 100) {
            this.Dww = System.currentTimeMillis();
        }
        if (this.f8708ac != cJ.length && ("landingpage".equals(this.MQ) || "landingpage_endcard".equals(this.MQ) || "landingpage_split_screen".equals(this.MQ) || "landingpage_direct".equals(this.MQ) || "aggregate_page".equals(this.MQ))) {
            int i11 = this.f8708ac;
            while (true) {
                int[] iArr = cJ;
                if (i11 >= iArr.length || i10 < iArr[this.f8708ac]) {
                    break;
                }
                int i12 = i11 + 1;
                this.f8708ac = i12;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(InMobiNetworkValues.URL, webView.getUrl());
                    long j10 = this.CJ;
                    if (j10 != -1) {
                        jSONObject.put("page_id", j10);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i11]);
                } catch (Exception unused) {
                }
                Qhi("progress_load_finish", jSONObject);
                i11 = i12;
            }
        }
        if (i10 == 100) {
            Qhi(webView.getUrl(), "progress", Math.min(this.Dww - this.bxS, (long) TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    private void Qhi(String str, String str2, long j10) {
        if (this.Sf.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int indexOf = str.indexOf(38, 200);
                    int i10 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
                    if (indexOf == -1 || indexOf > 300) {
                        indexOf = str.indexOf(63);
                    }
                    if (indexOf != -1 && indexOf <= 300) {
                        i10 = indexOf;
                    }
                    str = str.substring(0, i10);
                }
                jSONObject.put(InMobiNetworkValues.URL, str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            Qhi("load_finish_progress", jSONObject, j10);
        }
    }

    public void Qhi(WebView webView, String str, Bitmap bitmap, boolean z10) {
        this.hpZ = z10;
        com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR ror = this.pA;
        if (ror != null && z10) {
            ror.cJ(str);
            this.pA.cJ();
        }
        hm hmVar = this.kYc;
        if (hmVar != null && z10) {
            hmVar.Qhi(str);
        }
        WebView webView2 = this.NFd;
        if (webView2 != null) {
            try {
                WebBackForwardList copyBackForwardList = webView2.copyBackForwardList();
                if (copyBackForwardList != null && copyBackForwardList.getCurrentIndex() > this.FQ) {
                    this.f8713zn.incrementAndGet();
                }
                this.FQ = copyBackForwardList.getCurrentIndex();
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.Qhi("LandingPageLog", "copyBackForwardList exception", e10);
            }
        }
        if (this.js == 0) {
            this.js = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.lB;
        if (tgh != null) {
            tgh.fl();
        }
        if (this.Tgh.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i10 = this.PAe;
                if (i10 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i10));
                }
            } catch (Exception unused) {
            }
            Qhi("load_start", jSONObject);
        }
    }

    public void Qhi(WebView webView, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR ror = this.pA;
        if (ror != null && z10) {
            ror.Qhi();
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.lB;
        if (tgh != null) {
            tgh.Tgh();
        }
        hm hmVar = this.kYc;
        if (hmVar != null && z10) {
            hmVar.cJ(str);
        }
        if (webView != null && !this.pM && this.sDy) {
            this.pM = true;
            com.bytedance.sdk.component.utils.zc.Qhi(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.ROR.compareAndSet(false, true)) {
            if (this.f8709fl != 3) {
                this.f8709fl = 2;
            }
            this.qMt = System.currentTimeMillis();
            boolean z11 = this.f8709fl == 2;
            int WAv = WAv();
            if (z11) {
                long j10 = this.Dww - this.bxS;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.WAv);
                    jSONObject.put("error_msg", this.f8712zc);
                    jSONObject.put("error_url", this.ABk);
                    int i10 = this.PAe;
                    if (i10 >= 0) {
                        jSONObject.put("preload_status", i10);
                    }
                    jSONObject.put("first_page", WAv);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put(InMobiNetworkValues.URL, this.tP.YB());
                    jSONObject.put("preload_h5_type", this.tP.jN());
                } catch (Exception unused) {
                }
                Qhi(z10, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                long min = Math.min(j10, (long) TTAdConstant.AD_MAX_EVENT_TIME);
                Qhi("load_finish", jSONObject, min);
                if (hm()) {
                    this.jPH = SystemClock.elapsedRealtime();
                    Tgh();
                    ac.Qhi(this.tP, this.dIT, this.jPH - this.f8711ip);
                }
                Qhi(str, "load_finish", min);
                Gm gm2 = this.Jma;
                if (gm2 != null) {
                    gm2.Qhi(WAv);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.WAv);
                jSONObject2.put("error_msg", this.f8712zc);
                jSONObject2.put("error_url", this.ABk);
                jSONObject2.put("first_page", WAv);
                int i11 = this.PAe;
                if (i11 >= 0) {
                    jSONObject2.put("preload_status", i11);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put(InMobiNetworkValues.URL, this.tP.YB());
                jSONObject2.put("preload_h5_type", this.tP.jN());
            } catch (Exception unused2) {
            }
            Qhi(z10, "2");
            Qhi("load_fail", jSONObject2);
            if (hm()) {
                ac.Qhi(this.tP, this.dIT, SystemClock.elapsedRealtime() - this.f8711ip, this.WAv, this.f8712zc, this.ABk);
            }
            if (this.Gm) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                Qhi("load_fail_main", jSONObject2);
            }
        }
    }

    public void Qhi(WebView webView, int i10, String str, String str2, String str3, boolean z10) {
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh = this.lB;
        if (tgh != null) {
            tgh.Qhi((JSONObject) null);
        }
        if (!(str3 != null && str3.startsWith("image")) && this.f8709fl != 2) {
            this.f8709fl = 3;
        }
        this.WAv = i10;
        this.f8712zc = str;
        this.ABk = str2;
        this.Gm = z10;
    }

    public void Qhi(SSWebView sSWebView) {
        int oU;
        Bitmap Qhi2;
        tP tPVar;
        if ((!"landingpage".equals(this.MQ) && !"landingpage_endcard".equals(this.MQ) && !"landingpage_split_screen".equals(this.MQ) && !"landingpage_direct".equals(this.MQ) && !"aggregate_page".equals(this.MQ)) || (oU = com.bytedance.sdk.openadsdk.core.HzH.CJ().oU()) == 0 || new Random().nextInt(100) + 1 > oU || sSWebView == null || sSWebView.getWebView() == null || sSWebView.getVisibility() != 0 || (Qhi2 = zn.Qhi(sSWebView)) == null || (tPVar = this.tP) == null) {
            return;
        }
        zn.Qhi(tPVar, this.MQ, "landing_page_blank", Qhi2, sSWebView.getUrl(), this.CJ);
    }

    private void Qhi(String str, JSONObject jSONObject) {
        Qhi(str, jSONObject, -1L);
    }

    private void Qhi(final String str, final JSONObject jSONObject, final long j10) {
        if (!this.sDy || this.tP == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.hpZ.hm hmVar = this.HzH;
        final int zn2 = hmVar != null ? hmVar.zn() : -1;
        ac.Qhi(System.currentTimeMillis(), this.tP, this.MQ, str, new com.bytedance.sdk.openadsdk.Gm.ac.Qhi() { // from class: com.bytedance.sdk.openadsdk.cJ.zc.1
            @Override // com.bytedance.sdk.openadsdk.Gm.ac.Qhi
            public JSONObject Qhi() {
                int i10;
                if (jSONObject == null) {
                    return null;
                }
                try {
                    boolean cJ2 = bxS.cJ(zc.this.tP);
                    JSONObject jSONObject2 = jSONObject;
                    int i11 = 1;
                    if (cJ2) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    jSONObject2.put("is_playable", i10);
                    JSONObject jSONObject3 = jSONObject;
                    if (!com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().Qhi(zc.this.tP)) {
                        i11 = 0;
                    }
                    jSONObject3.put("usecache", i11);
                    if (cJ2 && ("load_finish".equals(str) || "load_fail".equals(str))) {
                        jSONObject.put("playable_has_show", zn2);
                    }
                } catch (JSONException unused) {
                }
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("ad_extra_data", jSONObject.toString());
                        long j11 = j10;
                        if (j11 > 0) {
                            jSONObject4.put("duration", j11);
                        }
                    } catch (JSONException unused2) {
                    }
                    return jSONObject4;
                } catch (JSONException unused3) {
                    return null;
                }
            }
        });
    }

    public void Qhi(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR ror = this.pA;
        if (ror != null && this.hpZ) {
            ror.Qhi(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.js != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.es.incrementAndGet();
                if (this.yN.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(InMobiNetworkValues.URL, this.tP.YB());
                } catch (JSONException unused) {
                }
                Qhi("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.js, 0L));
            }
        }
    }

    public void Qhi(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.widget.Qhi.ROR ror = this.pA;
        if (ror != null && z10) {
            ror.ac(str);
        }
        hm hmVar = this.kYc;
        if (hmVar == null || !z10) {
            return;
        }
        hmVar.ac(str);
    }

    private void Qhi(boolean z10, final String str) {
        if (z10) {
            final int WAv = WAv();
            ac.Qhi(new com.bytedance.sdk.component.Sf.hm("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.cJ.zc.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.Sf pM = com.bytedance.sdk.openadsdk.core.HzH.CJ().pM();
                        boolean Qhi2 = zc.this.Qhi(pM, str);
                        if (!Qhi2) {
                            return;
                        }
                        if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.Sf.cJ)) {
                            zc.this.Qhi(WAv, str);
                        } else if (!TextUtils.isEmpty(pM.f9161ac) && Qhi2) {
                            String str2 = pM.f9161ac;
                            com.bytedance.sdk.component.ROR.cJ.cJ ac2 = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().ac();
                            ac2.cJ(str2);
                            HashMap hashMap = new HashMap();
                            hashMap.put("content-type", "application/json; charset=utf-8");
                            ac2.CJ(hashMap);
                            ac2.Qhi(9);
                            ac2.Qhi("sendPrefLog");
                            ac2.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.cJ.zc.2.1
                                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
                                public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.Sf.cJ = cJVar.CJ();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        zc.this.Qhi(WAv, str);
                                    } catch (Exception e10) {
                                        com.bytedance.sdk.component.utils.ABk.Qhi("LandingPageLog", "TTWebViewClient : onPageFinished", e10);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(int i10, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.Sf.cJ)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.Sf.cJ);
            jSONObject.putOpt("cid", Qhi().HLI());
            jSONObject.putOpt("ad_id", Qhi().HLI());
            jSONObject.put("log_extra", Qhi().EGK());
            js.Qhi(sb2, "\"/** adInfo **/\"", jSONObject.toString());
            js.Qhi(sb2, "\"/** first_page **/\"", String.valueOf(i10));
            int i11 = (this.CJ > (-1L) ? 1 : (this.CJ == (-1L) ? 0 : -1));
            String str2 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            js.Qhi(sb2, "\"/** ix_to_externalurl **/\"", i11 != 0 ? "1" : PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
            if (this.PAe == 2) {
                str2 = "2";
            }
            js.Qhi(sb2, "\"/** preload_status **/\"", str2);
            js.Qhi(sb2, "\"/** scene_state **/\"", str);
            js.Qhi(sb2, "\"/** web_init_time **/\"", String.valueOf(this.Qe));
            js.Qhi(sb2, "\"/** channel_name **/\"", OperatorName.SHOW_TEXT_LINE_AND_SPACE + Qhi().Ri() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            js.Qhi(sb2, "\"/** session_id **/\"", OperatorName.SHOW_TEXT_LINE_AND_SPACE + UUID.randomUUID().toString() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            js.Qhi(sb2, "\"/** web_url **/\"", OperatorName.SHOW_TEXT_LINE_AND_SPACE + Qhi().YB() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            String sb3 = sb2.toString();
            if (TextUtils.isEmpty(sb3)) {
                return;
            }
            final String ac2 = ac(sb3);
            if (TextUtils.isEmpty(ac2) || this.NFd == null) {
                return;
            }
            lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cJ.zc.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.zc.Qhi(zc.this.NFd, ac2);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Qhi(com.bytedance.sdk.openadsdk.core.settings.Sf sf2, String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
                    c = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return sf2.CJ;
            case 1:
                return sf2.f9162fl;
            case 2:
                return sf2.Tgh;
            default:
                return false;
        }
    }
}

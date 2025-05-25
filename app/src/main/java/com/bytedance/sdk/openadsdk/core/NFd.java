package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.pA;
import com.bytedance.sdk.openadsdk.core.tP;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.zn;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.media.C1646h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAndroidObject.java */
/* loaded from: classes.dex */
public class NFd implements com.bytedance.sdk.component.adexpress.fl.cJ, CQU.Qhi, com.bytedance.sdk.openadsdk.Sf.cJ {
    private static final Map<String, Boolean> Sf;
    private int ABk;
    private WeakReference<SSWebView> CJ;
    private com.bytedance.sdk.openadsdk.WAv.fl CQU;
    private com.bytedance.sdk.openadsdk.WAv.Tgh Dww;
    private com.bytedance.sdk.openadsdk.Sf.fl EBS;
    private com.bytedance.sdk.openadsdk.core.cJ.fl Eh;
    private WeakReference<View> Gm;
    private com.bytedance.sdk.openadsdk.core.model.tP HzH;
    private Context MND;
    private com.bytedance.sdk.openadsdk.core.nativeexpress.ABk MQ;
    private com.bytedance.sdk.openadsdk.WAv.WAv NFd;
    private com.bytedance.sdk.openadsdk.core.widget.Qhi.Qhi PAe;
    private Qhi Qe;
    protected Map<String, Object> Qhi;
    private com.bytedance.sdk.openadsdk.core.widget.ac ROR;
    private String Tgh;
    private String WAv;
    private com.bytedance.sdk.openadsdk.WAv.cJ aP;
    private com.bytedance.sdk.openadsdk.WAv.Qhi bxS;
    boolean cJ;
    private com.bytedance.sdk.openadsdk.core.video.ac.cJ dIT;
    private com.bytedance.sdk.component.Qhi.kYc es;

    /* renamed from: hm  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.Sf.ac f8929hm;
    private String iMK;

    /* renamed from: ip  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.WAv.ROR f8930ip;
    private boolean jPH;
    private JSONObject kYc;
    private List<com.bytedance.sdk.openadsdk.core.model.tP> lB;
    private HashMap<String, WAv> lG;
    private int pA;
    private JSONObject pM;
    private JSONObject qMt;
    private com.bytedance.sdk.component.adexpress.cJ.zc tP;
    private boolean xyz;
    private String yN;

    /* renamed from: zc  reason: collision with root package name */
    private String f8931zc;

    /* renamed from: zn  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.cJ.ac.Tgh f8932zn;
    private boolean hpZ = true;
    private boolean sDy = true;
    private boolean Jma = false;
    private boolean js = false;

    /* renamed from: ac  reason: collision with root package name */
    boolean f8927ac = false;
    private boolean FQ = false;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.sdk.component.utils.CQU f8928fl = new com.bytedance.sdk.component.utils.CQU(Looper.getMainLooper(), this);

    /* compiled from: TTAndroidObject.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi();
    }

    /* compiled from: TTAndroidObject.java */
    /* loaded from: classes.dex */
    public static class cJ {
        public JSONObject CJ;
        public String Qhi;

        /* renamed from: ac  reason: collision with root package name */
        public String f8935ac;
        public String cJ;

        /* renamed from: fl  reason: collision with root package name */
        public int f8936fl;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Sf = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public NFd(Context context) {
        this.MND = context;
    }

    private WebView ABk() {
        SSWebView sSWebView;
        WeakReference<SSWebView> weakReference = this.CJ;
        if (weakReference == null || (sSWebView = weakReference.get()) == null) {
            return null;
        }
        return sSWebView.getWebView();
    }

    private boolean EBS() {
        com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.HzH;
        if (tPVar == null || tPVar.et() == null || com.bytedance.sdk.openadsdk.core.model.bxS.cJ(this.HzH) || this.Jma || this.HzH.et().optInt("parent_type") != 2) {
            return false;
        }
        int sqa = this.HzH.sqa();
        if (sqa != 8 && sqa != 7) {
            return false;
        }
        this.Jma = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Gm(JSONObject jSONObject) {
        if (this.MQ != null && jSONObject != null) {
            try {
                this.MQ.Qhi(jSONObject.optBoolean("mute", false));
            } catch (Exception unused) {
            }
        }
    }

    private void HzH() {
        com.bytedance.sdk.openadsdk.WAv.WAv wAv = this.NFd;
        if (wAv == null) {
            return;
        }
        wAv.Qhi();
    }

    private void MQ() {
        if (this.MND == null || TextUtils.isEmpty(HzH.CJ().es())) {
            return;
        }
        TTWebsiteActivity.Qhi(this.MND, this.HzH, this.yN);
    }

    private void ROR(JSONObject jSONObject) {
        if (this.xyz) {
            com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.HzH;
            if ((tPVar instanceof com.bytedance.sdk.openadsdk.core.model.MQ) && ((com.bytedance.sdk.openadsdk.core.model.MQ) tPVar).mvd()) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("adInfos", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.tP tPVar2 : ((com.bytedance.sdk.openadsdk.core.model.MQ) this.HzH).Gf()) {
                    JSONObject jSONObject2 = new JSONObject();
                    Qhi(jSONObject2, tPVar2);
                    jSONArray.put(jSONObject2);
                }
                return;
            }
        }
        Qhi(jSONObject, this.HzH);
    }

    private void Sf(JSONObject jSONObject) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.bxS.CJ(this.HzH))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.bxS.CJ(this.HzH));
    }

    private void WAv(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.WAv.cJ cJVar = this.aP;
        if (cJVar == null || jSONObject == null) {
            return;
        }
        cJVar.Qhi(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString("msg", ""));
    }

    private void bxS() {
        if (this.f8929hm == null) {
            this.f8929hm = com.bytedance.sdk.openadsdk.Sf.Qhi.Qhi(this, this.HzH);
        }
    }

    private void hm(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh;
        if (jSONObject == null || (tgh = this.f8932zn) == null) {
            return;
        }
        tgh.cJ(jSONObject);
    }

    private Context hpZ() {
        WeakReference<SSWebView> weakReference = this.CJ;
        Activity Qhi2 = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.cJ.Qhi(this.CJ.get());
        return Qhi2 == null ? this.MND : Qhi2;
    }

    @JProtect
    private JSONObject iMK() {
        View view;
        SSWebView sSWebView;
        try {
            view = this.Gm.get();
            sSWebView = this.CJ.get();
        } catch (Throwable unused) {
        }
        if (view != null && sSWebView != null) {
            int[] cJ2 = zn.cJ(view);
            int[] cJ3 = zn.cJ((View) sSWebView);
            if (cJ2 != null && cJ3 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", zn.ac(HzH.Qhi(), cJ2[0] - cJ3[0]));
                jSONObject.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, zn.ac(HzH.Qhi(), cJ2[1] - cJ3[1]));
                jSONObject.put(OperatorName.SET_LINE_WIDTH, zn.ac(HzH.Qhi(), view.getWidth()));
                jSONObject.put("h", zn.ac(HzH.Qhi(), view.getHeight()));
                jSONObject.put("isExist", true);
                return jSONObject;
            }
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
            return null;
        }
        com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
        return null;
    }

    private void kYc() {
        com.bytedance.sdk.openadsdk.WAv.WAv wAv = this.NFd;
        if (wAv == null) {
            return;
        }
        wAv.cJ();
    }

    private List<String> pA() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[Catch: Exception -> 0x00d2, TryCatch #0 {Exception -> 0x00d2, blocks: (B:5:0x000c, B:7:0x0011, B:9:0x0017, B:11:0x001b, B:13:0x0021, B:15:0x004e, B:24:0x0067, B:26:0x0080, B:28:0x009a, B:32:0x00a3, B:34:0x00ac, B:36:0x00b2, B:38:0x00c4, B:41:0x00cf, B:25:0x0074), top: B:44:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject qMt() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.settings.ROR r1 = com.bytedance.sdk.openadsdk.core.HzH.CJ()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            com.bytedance.sdk.openadsdk.core.model.tP r1 = r10.HzH     // Catch: java.lang.Exception -> Ld2
            r2 = 0
            if (r1 == 0) goto L16
            int r1 = r1.Hy()     // Catch: java.lang.Exception -> Ld2
            goto L17
        L16:
            r1 = r2
        L17:
            com.bytedance.sdk.openadsdk.core.model.tP r3 = r10.HzH     // Catch: java.lang.Exception -> Ld2
            if (r3 == 0) goto L20
            int r3 = r3.sqa()     // Catch: java.lang.Exception -> Ld2
            goto L21
        L20:
            r3 = r2
        L21:
            com.bytedance.sdk.openadsdk.core.settings.ROR r4 = com.bytedance.sdk.openadsdk.core.HzH.CJ()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r5 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Ld2
            int r4 = r4.WAv(r5)     // Catch: java.lang.Exception -> Ld2
            com.bytedance.sdk.openadsdk.core.settings.ROR r5 = com.bytedance.sdk.openadsdk.core.HzH.CJ()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Ld2
            int r5 = r5.tP(r6)     // Catch: java.lang.Exception -> Ld2
            com.bytedance.sdk.openadsdk.core.settings.ROR r6 = com.bytedance.sdk.openadsdk.core.HzH.CJ()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Ld2
            boolean r6 = r6.Tgh(r7)     // Catch: java.lang.Exception -> Ld2
            com.bytedance.sdk.openadsdk.core.model.tP r7 = r10.HzH     // Catch: java.lang.Exception -> Ld2
            boolean r7 = com.bytedance.sdk.openadsdk.core.model.tP.fl(r7)     // Catch: java.lang.Exception -> Ld2
            r8 = 1
            if (r7 != 0) goto L5e
            com.bytedance.sdk.openadsdk.core.settings.ROR r7 = com.bytedance.sdk.openadsdk.core.HzH.CJ()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Ld2
            int r7 = r7.ABk(r9)     // Catch: java.lang.Exception -> Ld2
            if (r7 != r8) goto L5e
            r7 = r8
            goto L5f
        L5e:
            r7 = r2
        L5f:
            r9 = 7
            if (r3 == r9) goto L74
            r9 = 8
            if (r3 != r9) goto L67
            goto L74
        L67:
            com.bytedance.sdk.openadsdk.core.settings.ROR r3 = com.bytedance.sdk.openadsdk.core.HzH.CJ()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Ld2
            boolean r1 = r3.ac(r1)     // Catch: java.lang.Exception -> Ld2
            goto L80
        L74:
            com.bytedance.sdk.openadsdk.core.settings.ROR r3 = com.bytedance.sdk.openadsdk.core.HzH.CJ()     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Ld2
            boolean r1 = r3.HzH(r1)     // Catch: java.lang.Exception -> Ld2
        L80:
            java.lang.String r3 = "voice_control"
            r0.put(r3, r1)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = "rv_skip_time"
            r0.put(r1, r4)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = "fv_skip_show"
            r0.put(r1, r6)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = "iv_skip_time"
            r0.put(r1, r5)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = "show_dislike"
            com.bytedance.sdk.openadsdk.core.model.tP r3 = r10.HzH     // Catch: java.lang.Exception -> Ld2
            if (r3 == 0) goto La2
            boolean r3 = r3.rB()     // Catch: java.lang.Exception -> Ld2
            if (r3 == 0) goto La2
            r3 = r8
            goto La3
        La2:
            r3 = r2
        La3:
            r0.put(r1, r3)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = "video_adaptation"
            com.bytedance.sdk.openadsdk.core.model.tP r3 = r10.HzH     // Catch: java.lang.Exception -> Ld2
            if (r3 == 0) goto Lb1
            int r3 = r3.aP()     // Catch: java.lang.Exception -> Ld2
            goto Lb2
        Lb1:
            r3 = r2
        Lb2:
            r0.put(r1, r3)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = "skip_change_to_close"
            r0.put(r1, r7)     // Catch: java.lang.Exception -> Ld2
            java.lang.String r1 = "bar_render_platform"
            com.bytedance.sdk.openadsdk.core.model.tP r3 = r10.HzH     // Catch: java.lang.Exception -> Ld2
            boolean r3 = r3.hU()     // Catch: java.lang.Exception -> Ld2
            if (r3 == 0) goto Lcf
            com.bytedance.sdk.openadsdk.core.settings.ROR r3 = com.bytedance.sdk.openadsdk.core.settings.HzH.YD()     // Catch: java.lang.Exception -> Ld2
            boolean r3 = r3.gT()     // Catch: java.lang.Exception -> Ld2
            if (r3 == 0) goto Lcf
            r2 = r8
        Lcf:
            r0.put(r1, r2)     // Catch: java.lang.Exception -> Ld2
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.NFd.qMt():org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tP() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.ABk aBk = this.MQ;
        if (aBk != null) {
            aBk.Qhi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zc(JSONObject jSONObject) {
        if (this.MQ != null && jSONObject != null) {
            try {
                this.MQ.Qhi(jSONObject.optInt("stateType", -1));
            } catch (Exception unused) {
            }
        }
    }

    public void Tgh() {
        com.bytedance.sdk.openadsdk.WAv.cJ cJVar;
        if (this.jPH && (cJVar = this.aP) != null) {
            cJVar.Qhi();
            return;
        }
        Context context = this.MND;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.MQ.Qhi((Activity) context)) {
            ((Activity) this.MND).finish();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            ROR(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            Qhi(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NFd.4
                @Override // java.lang.Runnable
                public void run() {
                    NFd.this.zc(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public void chooseAdResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("video_choose");
            long optLong = jSONObject.optLong("video_choose_duration");
            com.bytedance.sdk.openadsdk.WAv.ROR ror = this.f8930ip;
            if (ror != null) {
                ror.Qhi(optInt, optLong);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NFd.5
                @Override // java.lang.Runnable
                public void run() {
                    NFd.this.ac(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            hpZ(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        ABk(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public String getTemplateInfo() {
        Qhi("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.qMt;
            if (jSONObject != null) {
                jSONObject.put("setting", qMt());
                com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.HzH;
                if (tPVar != null) {
                    this.qMt.put("extension", tPVar.wp());
                }
            }
            Qhi("getTemplateInfo", false);
            return this.qMt.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NFd.7
            @Override // java.lang.Runnable
            public void run() {
                if (NFd.this.PAe != null) {
                    NFd.this.PAe.Qhi();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NFd.3
                @Override // java.lang.Runnable
                public void run() {
                    NFd.this.Gm(jSONObject);
                }
            });
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            iMK(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NFd.6
            @Override // java.lang.Runnable
            public void run() {
                NFd.this.tP();
            }
        });
    }

    private boolean pA(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    public NFd fl(String str) {
        this.iMK = str;
        return this;
    }

    private void HzH(JSONObject jSONObject) {
        if (jSONObject == null || this.EBS == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.EBS.Qhi(true, optJSONArray);
            } else {
                this.EBS.Qhi(false, null);
            }
        } catch (Exception unused) {
            this.EBS.Qhi(false, null);
        }
    }

    private boolean kYc(JSONObject jSONObject) {
        try {
            jSONObject.put("creatives", cJ(this.lB));
        } catch (Exception unused) {
        }
        return true;
    }

    private void tP(JSONObject jSONObject) {
        WebView ABk;
        if (jSONObject == null || (ABk = ABk()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.zc.Qhi(ABk, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    public boolean CJ() {
        com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.HzH;
        return tPVar != null && tPVar.bxS();
    }

    public boolean Sf() {
        return this.FQ;
    }

    public void WAv() {
        EBS();
    }

    public NFd ac(String str) {
        this.WAv = str;
        return this;
    }

    public boolean fl() {
        return this.f8927ac;
    }

    public boolean hm() {
        com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.HzH;
        return tPVar != null && tPVar.yN() == 1;
    }

    private boolean ABk(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.ABk aBk = this.MQ;
        if (aBk != null && jSONObject != null) {
            double ac2 = aBk.ac();
            int CJ = this.MQ.CJ();
            try {
                jSONObject.put("currentTime", ac2 / 1000.0d);
                jSONObject.put("state", CJ);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject MQ(JSONObject jSONObject) {
        if (this.Qhi != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString("ad_extra_data", null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry<String, Object> entry : this.Qhi.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ABk.cJ(e10.toString());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Sf(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return hm();
        }
        return true;
    }

    private void hpZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri parse = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.HzH.Qhi(parse, this);
            }
        } catch (Exception unused) {
        }
    }

    public NFd CJ(String str) {
        this.f8931zc = str;
        return this;
    }

    public void Gm() {
        com.bytedance.sdk.openadsdk.Sf.ac acVar = this.f8929hm;
        if (acVar != null) {
            acVar.Qhi();
        }
        this.MND = null;
        this.dIT = null;
    }

    public com.bytedance.sdk.openadsdk.core.model.tP ac() {
        return this.HzH;
    }

    public NFd cJ(String str) {
        this.Tgh = str;
        return this;
    }

    public void fl(boolean z10) {
        this.jPH = z10;
    }

    public void zc() {
        Qhi qhi = this.Qe;
        if (qhi != null) {
            qhi.Qhi();
        }
    }

    private void hm(String str) {
        int indexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView ABk = ABk();
                    if (ABk != null) {
                        com.bytedance.sdk.component.utils.zc.Qhi(ABk, "javascript:ToutiaoJSBridge._fetchQueue()");
                    }
                } else if (!str.startsWith("bytedance://private/setresult/") || (indexOf = str.indexOf(38, 30)) <= 0) {
                } else {
                    String substring = str.substring(30, indexOf);
                    String substring2 = str.substring(indexOf + 1);
                    if (!substring.equals("SCENE_FETCHQUEUE") || substring2.length() <= 0) {
                        return;
                    }
                    ROR(substring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void CJ(boolean z10) {
        this.xyz = z10;
    }

    public void Tgh(String str) {
        this.yN = str;
    }

    public void ac(JSONObject jSONObject) {
        String str;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.qMt.Qhi("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String optString = jSONObject.optString("adId");
            int optInt = jSONObject.optInt("areaType", 1);
            String optString2 = jSONObject.optString("clickAreaType");
            JSONObject optJSONObject = jSONObject.optJSONObject("clickInfo");
            double d19 = 0.0d;
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("down_x", 0.0d);
                d12 = optJSONObject.optDouble("down_y", 0.0d);
                double optDouble2 = optJSONObject.optDouble("up_x", 0.0d);
                double optDouble3 = optJSONObject.optDouble("up_y", 0.0d);
                double optDouble4 = optJSONObject.optDouble("down_time", 0.0d);
                double optDouble5 = optJSONObject.optDouble("up_time", 0.0d);
                double optDouble6 = optJSONObject.optDouble("button_x", 0.0d);
                double optDouble7 = optJSONObject.optDouble("button_y", 0.0d);
                double optDouble8 = optJSONObject.optDouble("button_width", 0.0d);
                double optDouble9 = optJSONObject.optDouble("button_height", 0.0d);
                jSONObject2 = optJSONObject.optJSONObject("rectInfo");
                d18 = optDouble9;
                d19 = optDouble;
                d11 = optDouble2;
                d13 = optDouble4;
                d14 = optDouble5;
                d15 = optDouble6;
                d16 = optDouble7;
                d17 = optDouble8;
                str = optString;
                d10 = optDouble3;
            } else {
                str = optString;
                d10 = 0.0d;
                d11 = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                d14 = 0.0d;
                d15 = 0.0d;
                d16 = 0.0d;
                d17 = 0.0d;
                d18 = 0.0d;
                jSONObject2 = null;
            }
            com.bytedance.sdk.openadsdk.core.model.pA Qhi2 = new pA.Qhi().CJ((float) d19).ac((float) d12).cJ((float) d11).Qhi((float) d10).cJ((long) d13).Qhi((long) d14).ac((int) d15).CJ((int) d16).fl((int) d17).Tgh((int) d18).Qhi(optString2).Qhi((SparseArray<ac.Qhi>) null).Qhi(true).cJ(optInt).Qhi(jSONObject2).Qhi(jSONObject.optInt("clickAreaCategory", -1)).cJ(optJSONObject).Qhi();
            com.bytedance.sdk.component.adexpress.cJ.zc zcVar = this.tP;
            if (zcVar != null) {
                zcVar.Qhi(null, optInt, Qhi2);
            }
            Qhi(str, optInt, Qhi2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.cJ.zc zcVar2 = this.tP;
            if (zcVar2 != null) {
                zcVar2.Qhi(null, -1, null);
            }
        }
    }

    public NFd cJ(SSWebView sSWebView) {
        this.CJ = new WeakReference<>(sSWebView);
        return this;
    }

    public JSONObject fl(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.HzH;
            if (tPVar instanceof com.bytedance.sdk.openadsdk.core.model.MQ) {
                List<com.bytedance.sdk.openadsdk.core.model.tP> ac2 = ((com.bytedance.sdk.openadsdk.core.model.MQ) tPVar).XJ().ac();
                for (int i10 = 0; i10 < ac2.size(); i10++) {
                    jSONArray.put(cJ(ac2.get(i10)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void CJ(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tP Qhi2 = com.bytedance.sdk.openadsdk.core.cJ.Qhi(jSONObject);
        if (Qhi2 != null) {
            boolean CJ = com.bytedance.sdk.openadsdk.core.model.HzH.CJ(this.HzH);
            Qhi(Qhi2, CJ ? js.cJ(this.ABk) : this.yN, !CJ);
        }
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.core.widget.Qhi.Qhi qhi) {
        this.PAe = qhi;
        return this;
    }

    public void Tgh(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.Qhi XJ;
        if (jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.tP tPVar = this.HzH;
        if (!(tPVar instanceof com.bytedance.sdk.openadsdk.core.model.MQ) || (XJ = ((com.bytedance.sdk.openadsdk.core.model.MQ) tPVar).XJ()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.tP> ac2 = XJ.ac();
        if (optInt < 0 || optInt >= ac2.size()) {
            return;
        }
        Qhi(ac2.get(optInt), this.yN, false);
        com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar = this.dIT;
        if (cJVar != null) {
            cJVar.CJ();
        }
    }

    public NFd cJ(boolean z10) {
        this.js = z10;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.core.widget.ac acVar) {
        this.ROR = acVar;
        return this;
    }

    public void cJ() {
        com.bytedance.sdk.component.Qhi.kYc kyc = this.es;
        if (kyc == null) {
            return;
        }
        kyc.Qhi();
        this.es = null;
    }

    public NFd Qhi(SSWebView sSWebView) {
        WebView webView = sSWebView.getWebView();
        if (webView == null) {
            return this;
        }
        try {
            com.bytedance.sdk.component.Qhi.kYc cJ2 = com.bytedance.sdk.component.Qhi.kYc.Qhi(webView).Qhi(new com.bytedance.sdk.openadsdk.hm.Qhi()).Qhi("ToutiaoJSBridge").Qhi(new com.bytedance.sdk.component.Qhi.ABk() { // from class: com.bytedance.sdk.openadsdk.core.NFd.1
                @Override // com.bytedance.sdk.component.Qhi.ABk
                public <T> T Qhi(String str, Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.Qhi.ABk
                public <T> String Qhi(T t4) {
                    return null;
                }
            }).Qhi(hm.cJ().HzH()).cJ(true).Qhi().cJ();
            this.es = cJ2;
            com.bytedance.sdk.openadsdk.hm.Qhi.Tgh.Qhi(cJ2, this);
            com.bytedance.sdk.openadsdk.hm.Qhi.Qhi.Qhi(this.es, this);
            com.bytedance.sdk.openadsdk.hm.Qhi.cJ.Qhi(this.es, this);
            com.bytedance.sdk.openadsdk.hm.Qhi.ac.Qhi(this.es, this);
            com.bytedance.sdk.openadsdk.hm.Qhi.fl.Qhi(this.es, this);
            com.bytedance.sdk.openadsdk.hm.Qhi.Sf.Qhi(this.es, this);
            com.bytedance.sdk.openadsdk.hm.Qhi.WAv.Qhi(this.es, this);
            com.bytedance.sdk.openadsdk.hm.Qhi.hm.Qhi(this.es, sSWebView);
            com.bytedance.sdk.openadsdk.hm.Qhi.ROR.Qhi(this.es, this);
        } catch (Exception unused) {
        }
        return this;
    }

    public void ROR() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.ABk aBk = this.MQ;
        if (aBk != null) {
            aBk.cJ();
        }
    }

    public NFd cJ(int i10) {
        this.ABk = i10;
        return this;
    }

    private void ROR(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cJ cJVar = new cJ();
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        cJVar.Qhi = optJSONObject.optString("__msg_type", null);
                        cJVar.cJ = optJSONObject.optString("__callback_id", null);
                        cJVar.f8935ac = optJSONObject.optString("func");
                        cJVar.CJ = optJSONObject.optJSONObject("params");
                        cJVar.f8936fl = optJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(cJVar.Qhi) && !TextUtils.isEmpty(cJVar.f8935ac)) {
                    Message obtainMessage = this.f8928fl.obtainMessage(11);
                    obtainMessage.obj = cJVar;
                    this.f8928fl.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public void cJ(JSONObject jSONObject) {
        kYc.Qhi(hpZ(), this.MND instanceof Activity, jSONObject, this.HzH, this.yN, this.ABk, ABk(), this.ROR);
    }

    @JProtect
    private void iMK(JSONObject jSONObject) {
        int i10;
        double d10;
        double d11;
        JSONObject optJSONObject;
        boolean z10;
        double d12;
        com.bytedance.sdk.openadsdk.WAv.ROR ror;
        NFd nFd = this;
        if (nFd.tP == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.cJ.pA pAVar = new com.bytedance.sdk.component.adexpress.cJ.pA();
        pAVar.Qhi(1);
        try {
            boolean optBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("AdSize");
            if (optJSONObject2 != null) {
                d10 = optJSONObject2.optDouble(InMobiNetworkValues.WIDTH);
                d11 = optJSONObject2.optDouble(InMobiNetworkValues.HEIGHT);
            } else {
                d10 = 0.0d;
                d11 = 0.0d;
            }
            optJSONObject = jSONObject.optJSONObject("videoInfo");
            if (optJSONObject != null) {
                try {
                    double optDouble = optJSONObject.optDouble("x");
                    double optDouble2 = optJSONObject.optDouble(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);
                    z10 = optBoolean;
                    double optDouble3 = optJSONObject.optDouble(InMobiNetworkValues.WIDTH);
                    double optDouble4 = optJSONObject.optDouble(InMobiNetworkValues.HEIGHT);
                    if (nFd.pA(optJSONObject)) {
                        d12 = d11;
                        pAVar.Qhi((float) optJSONObject.optDouble("borderRadiusTopLeft"));
                        pAVar.cJ((float) optJSONObject.optDouble("borderRadiusTopRight"));
                        pAVar.ac((float) optJSONObject.optDouble("borderRadiusBottomLeft"));
                        pAVar.CJ((float) optJSONObject.optDouble("borderRadiusBottomRight"));
                    } else {
                        d12 = d11;
                    }
                    pAVar.ac(optDouble);
                    pAVar.CJ(optDouble2);
                    pAVar.fl(optDouble3);
                    pAVar.Tgh(optDouble4);
                } catch (Exception unused) {
                    i10 = 101;
                    nFd = this;
                    pAVar.cJ(i10);
                    pAVar.Qhi(Sf.Qhi(i10));
                    nFd.tP.Qhi(pAVar);
                }
            } else {
                z10 = optBoolean;
                d12 = d11;
            }
        } catch (Exception unused2) {
        }
        try {
            String optString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE, Sf.Qhi(101));
            int optInt = jSONObject.optInt("code", 101);
            try {
                pAVar.Qhi(z10);
                pAVar.Qhi(d10);
                pAVar.cJ(d12);
                pAVar.Qhi(optString);
                pAVar.cJ(optInt);
                nFd = this;
                nFd.tP.Qhi(pAVar);
                if (optJSONObject == null || (ror = nFd.f8930ip) == null) {
                    return;
                }
                ror.Qhi(pAVar);
            } catch (Exception unused3) {
                nFd = this;
                i10 = 101;
                pAVar.cJ(i10);
                pAVar.Qhi(Sf.Qhi(i10));
                nFd.tP.Qhi(pAVar);
            }
        } catch (Exception unused4) {
            nFd = this;
            i10 = 101;
            pAVar.cJ(i10);
            pAVar.Qhi(Sf.Qhi(i10));
            nFd.tP.Qhi(pAVar);
        }
    }

    public static JSONArray cJ(List<com.bytedance.sdk.openadsdk.core.model.tP> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(list.get(i10).mZ());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            tP(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void cJ(final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    hm(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(new com.bytedance.sdk.component.Sf.hm("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.NFd.2
                @Override // java.lang.Runnable
                public void run() {
                    long j10;
                    String str;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    NFd.this.yN = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (!NFd.this.Sf(queryParameter3)) {
                        return;
                    }
                    long j11 = 0;
                    try {
                        j10 = Long.parseLong(uri.getQueryParameter("value"));
                    } catch (Exception unused) {
                        j10 = 0;
                    }
                    try {
                        j11 = Long.parseLong(uri.getQueryParameter("ext_value"));
                    } catch (Exception unused2) {
                    }
                    long j12 = j11;
                    String queryParameter4 = uri.getQueryParameter("extra");
                    JSONObject jSONObject = null;
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(queryParameter4);
                            try {
                                jSONObject2.putOpt("ua_policy", Integer.valueOf(NFd.this.pA));
                            } catch (Exception unused3) {
                            }
                            jSONObject = jSONObject2;
                        } catch (Exception unused4) {
                        }
                    }
                    if (C1646h.CLICK_BEACON.equals(queryParameter3)) {
                        jSONObject = NFd.this.MQ(jSONObject);
                    }
                    if (!"landing_perf_error".equals(queryParameter3) && !"landing_perf_stats".equals(queryParameter3)) {
                        str = NFd.this.Qhi(queryParameter2, queryParameter3);
                    } else {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            for (String str2 : uri.getQueryParameterNames()) {
                                try {
                                    if ("extra".equals(str2)) {
                                        jSONObject3.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str2)).optString("ad_extra_data"));
                                    } else {
                                        jSONObject3.put(str2, uri.getQueryParameter(str2));
                                    }
                                } catch (Exception unused5) {
                                }
                            }
                            str = NFd.this.Tgh;
                            jSONObject = jSONObject3;
                        } catch (Exception unused6) {
                            return;
                        }
                    }
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(NFd.this.HzH, queryParameter, str, queryParameter3, j10, j12, jSONObject, com.bytedance.sdk.openadsdk.core.model.HzH.CJ(NFd.this.HzH));
                }
            });
        } catch (Exception unused) {
        }
    }

    public com.bytedance.sdk.component.Qhi.kYc Qhi() {
        return this.es;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.cJ.ac.Tgh tgh) {
        this.f8932zn = tgh;
        return this;
    }

    public NFd Qhi(boolean z10) {
        this.cJ = z10;
        return this;
    }

    public NFd Qhi(View view) {
        this.Gm = new WeakReference<>(view);
        return this;
    }

    private JSONObject cJ(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put("cid", tPVar.DS());
        jSONObject2.put("req_id", tPVar.jWV());
        jSONObject2.put("ad_id", tPVar.HLI());
        jSONObject2.put("log_extra", tPVar.EGK());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.HzH.YD().EGK());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", tPVar.usK());
        return jSONObject;
    }

    public NFd Qhi(int i10) {
        this.pA = i10;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        this.HzH = tPVar;
        if (tPVar != null) {
            this.kYc = tPVar.et();
        }
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.WAv.cJ cJVar) {
        this.aP = cJVar;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.WAv.WAv wAv) {
        this.NFd = wAv;
        return this;
    }

    public NFd Qhi(Map<String, Object> map) {
        this.Qhi = map;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.component.adexpress.cJ.zc zcVar) {
        this.tP = zcVar;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.core.nativeexpress.ABk aBk) {
        this.MQ = aBk;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.Sf.fl flVar) {
        this.EBS = flVar;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.core.cJ.fl flVar) {
        this.Eh = flVar;
        return this;
    }

    public NFd Qhi(JSONObject jSONObject) {
        this.qMt = jSONObject;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.WAv.Qhi qhi) {
        this.bxS = qhi;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.WAv.Tgh tgh) {
        this.Dww = tgh;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.WAv.fl flVar) {
        this.CQU = flVar;
        return this;
    }

    public NFd Qhi(List<com.bytedance.sdk.openadsdk.core.model.tP> list) {
        this.lB = list;
        return this;
    }

    public NFd Qhi(com.bytedance.sdk.openadsdk.WAv.ROR ror) {
        this.f8930ip = ror;
        return this;
    }

    @JProtect
    private void Qhi(JSONObject jSONObject, int i10) {
        JSONArray jSONArray = new JSONArray();
        for (String str : pA()) {
            jSONArray.put(str);
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.Qhi.Qhi());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.Qhi.fl());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.Qhi.cJ());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.Qhi.ac());
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.common.Qhi.CJ());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.Qhi.Tgh());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.Qhi.Qhi(HzH.Qhi()));
        if (DeviceUtils.cJ(HzH.Qhi())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", "Android");
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    public void ac(boolean z10) {
        this.f8927ac = z10;
    }

    private void ac(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "event");
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            tP(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void ac(int i10) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.ABk aBk = this.MQ;
        if (aBk != null) {
            aBk.cJ(i10);
        }
    }

    private static void Qhi(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        String HLI = tPVar.HLI();
        if (!TextUtils.isEmpty(HLI)) {
            jSONObject.put("cid", HLI);
        }
        String EGK = tPVar.EGK();
        if (!TextUtils.isEmpty(EGK)) {
            jSONObject.put("log_extra", EGK);
        }
        String bIO = tPVar.bIO();
        if (!TextUtils.isEmpty(bIO)) {
            jSONObject.put("download_url", bIO);
        }
        jSONObject.put("dc", TextUtils.isEmpty(HzH.CJ().PAe()) ? HzH.CJ().PAe() : "SG");
        jSONObject.put("language", zc.Qhi());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.HzH.YD().EGK());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0329, code lost:
        if (r3 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0374, code lost:
        if (r3 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0376, code lost:
        r2 = r3;
     */
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject Qhi(com.bytedance.sdk.openadsdk.core.NFd.cJ r21, int r22) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.NFd.Qhi(com.bytedance.sdk.openadsdk.core.NFd$cJ, int):org.json.JSONObject");
    }

    private void Qhi(JSONObject jSONObject, boolean z10, String str) {
        com.bytedance.sdk.openadsdk.core.widget.ac acVar;
        if (z10) {
            try {
                String optString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(optString) || new JSONObject(optString).optInt("agg_request_type", -1) != 1 || !C1646h.CLICK_BEACON.equals(str) || (acVar = this.ROR) == null) {
                    return;
                }
                acVar.Qhi();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AndroidObject", "callAggClickListener faile", th2);
            }
        }
    }

    private boolean Qhi(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        int i10;
        String str2;
        if (jSONObject != null) {
            i10 = jSONObject.optInt("landingStyle");
            str = jSONObject.optString(InMobiNetworkValues.URL);
            str2 = jSONObject.optString("fallback_url");
        } else {
            str = null;
            i10 = -1;
            str2 = null;
        }
        boolean z10 = false;
        if (i10 == 1) {
            if (!com.bytedance.sdk.component.utils.hpZ.Qhi(str)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e10) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AndroidObject", "handleUrl, EX1->: ", e10);
                }
                return z10;
            }
        } else if (i10 == 2) {
            try {
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    jSONObject2.put("empty_url", 1);
                } else if (!com.bytedance.sdk.component.utils.hpZ.Qhi(str2)) {
                    jSONObject2.put("invalid_url", 1);
                }
            } catch (JSONException e11) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AndroidObject", "handleUrl, EX2->: ", e11);
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    private void Qhi(String str, boolean z10) {
        if (this.f8932zn == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            this.f8932zn.Qhi(str);
        } else {
            this.f8932zn.cJ(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fl.cJ
    public void Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("time");
            String optString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.nativeexpress.ABk aBk = this.MQ;
            if (aBk != null) {
                aBk.Qhi(optInt, optString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    private void Qhi(final cJ cJVar, final JSONObject jSONObject) {
        if (cJVar == null) {
            return;
        }
        try {
            Qhi(cJVar.CJ, new com.bytedance.sdk.openadsdk.WAv.ac() { // from class: com.bytedance.sdk.openadsdk.core.NFd.8
                @Override // com.bytedance.sdk.openadsdk.WAv.ac
                public void Qhi(boolean z10, List<com.bytedance.sdk.openadsdk.core.model.tP> list) {
                    if (z10) {
                        try {
                            jSONObject.put("creatives", NFd.cJ(list));
                            NFd.this.cJ(cJVar.cJ, jSONObject);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    NFd.this.cJ(cJVar.cJ, jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @JProtect
    private boolean Qhi(String str, int i10, com.bytedance.sdk.openadsdk.core.model.pA pAVar) {
        HashMap<String, WAv> hashMap;
        if (TextUtils.isEmpty(str) || (hashMap = this.lG) == null || hashMap.get(str) == null) {
            return false;
        }
        throw null;
    }

    @JProtect
    public void Qhi(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.WAv.ac acVar) {
        if (acVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.WAv.ac acVar2 = new com.bytedance.sdk.openadsdk.WAv.ac() { // from class: com.bytedance.sdk.openadsdk.core.NFd.9
                @Override // com.bytedance.sdk.openadsdk.WAv.ac
                public void Qhi(final boolean z10, final List<com.bytedance.sdk.openadsdk.core.model.tP> list) {
                    com.bytedance.sdk.openadsdk.utils.lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NFd.9.1
                        @Override // java.lang.Runnable
                        public void run() {
                            acVar.Qhi(z10, list);
                        }
                    });
                }
            };
            if (this.HzH != null && !TextUtils.isEmpty(this.f8931zc)) {
                int sqa = this.HzH.sqa();
                AdSlot lB = this.HzH.lB();
                com.bytedance.sdk.openadsdk.core.model.qMt qmt = new com.bytedance.sdk.openadsdk.core.model.qMt();
                qmt.Tgh = true;
                if (this.HzH.es() != null) {
                    qmt.Sf = 2;
                }
                JSONObject jSONObject2 = this.kYc;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                qmt.ROR = jSONObject2;
                HzH.ac().Qhi(lB, qmt, sqa, new tP.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.NFd.10
                    @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
                    public void Qhi(int i10, String str) {
                        acVar2.Qhi(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tP.Qhi
                    public void Qhi(com.bytedance.sdk.openadsdk.core.model.Qhi qhi, com.bytedance.sdk.openadsdk.core.model.cJ cJVar) {
                        if (qhi.ac() != null && !qhi.ac().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.tP tPVar = qhi.ac().get(0);
                            if (tPVar != null) {
                                NFd.this.kYc = tPVar.et();
                            }
                            acVar2.Qhi(true, qhi.ac());
                            return;
                        }
                        acVar2.Qhi(false, null);
                        cJVar.Qhi(-3);
                        com.bytedance.sdk.openadsdk.core.model.cJ.Qhi(cJVar);
                    }
                });
                return;
            }
            acVar2.Qhi(false, null);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.AndroidObject", "get ads error", e10);
        }
    }

    public boolean Qhi(Uri uri) {
        if (uri == null) {
            return false;
        }
        if ("bytedance".equals(uri.getScheme())) {
            return Sf.containsKey(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Qhi(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.HzH.CJ(this.HzH)) {
            return "show".equals(str2) ? js.Qhi(this.ABk) : "aggregate_page";
        } else if (this.aP != null) {
            return js.Qhi(this.ABk);
        } else {
            return this.tP == null ? js.cJ(this.ABk) : str;
        }
    }

    @Override // com.bytedance.sdk.component.utils.CQU.Qhi
    public void Qhi(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof cJ) {
                try {
                    Qhi((cJ) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Sf.cJ
    public void Qhi(String str, JSONObject jSONObject) {
        ac(str, jSONObject);
    }

    private void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.core.cJ.Qhi(HzH.Qhi(), tPVar, str, this.ABk);
        qhi.Qhi(com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh.Qhi(HzH.Qhi(), tPVar, str));
        if (!z10) {
            qhi.Qhi(false);
        }
        qhi.onClick(null);
    }

    public void Qhi(com.bytedance.sdk.openadsdk.core.video.ac.cJ cJVar) {
        this.dIT = cJVar;
    }

    public void Qhi(Qhi qhi) {
        this.Qe = qhi;
    }
}

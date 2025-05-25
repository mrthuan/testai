package com.bytedance.sdk.openadsdk.hpZ;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.activity.f;
import com.adjust.sdk.Constants;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayablePlugin.java */
/* loaded from: classes.dex */
public class hm {
    private Runnable ABk;
    private int EGK;
    private boolean Ewb;
    private Runnable Gm;
    private ROR Gy;
    private int HWc;
    private String IC;
    private boolean KW;
    private boolean Ki;
    private int LcF;
    private String LpL;
    private boolean Ls;
    private String Ohm;
    private WeakReference<View> PER;
    private int Px;
    private JSONObject ReL;
    private Context Ri;
    private ac SL;
    private int SNp;
    private String SO;
    private int Ug;
    private WebView Ura;
    private int VV;
    private Qhi VnT;
    private Runnable WAv;
    private String Wrw;
    private String XH;
    private int YD;
    private int eG;
    private String eN;
    private com.bytedance.sdk.openadsdk.hpZ.Qhi et;
    private JSONObject gT;

    /* renamed from: hm  reason: collision with root package name */
    private Runnable f9325hm;
    private Runnable iMK;
    private String mZ;

    /* renamed from: ne  reason: collision with root package name */
    private int f9327ne;
    private cJ pA;
    private String rP;
    private String sRC;
    private String vml;
    private float wp;
    private boolean yy;
    private int zTC;
    private final String Tgh = "playable_stuck_check_ping";
    private final String ROR = "playable_apply_media_permission_callback";
    private final Handler Sf = new Handler(Looper.getMainLooper());

    /* renamed from: zc  reason: collision with root package name */
    private final Handler f9328zc = new Handler(Looper.getMainLooper());
    private boolean hpZ = true;
    private boolean HzH = true;
    private boolean kYc = true;
    public final String Qhi = "PL_sdk_playable_global_viewable";
    public final String cJ = "PL_sdk_page_screen_blank";

    /* renamed from: ac  reason: collision with root package name */
    public final String f9323ac = "PL_sdk_playable_destroy_analyze_summary";
    public final String CJ = "PL_sdk_playable_hardware_dialog_cancel";

    /* renamed from: fl  reason: collision with root package name */
    public final String f9324fl = "PL_sdk_playable_hardware_dialog_setting";
    private Set<String> tP = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
    private String MQ = null;
    private String qMt = "embeded_ad";
    private boolean EBS = true;
    private boolean bxS = true;
    private boolean Dww = false;
    private String CQU = "";
    private long pM = 10;
    private long Eh = 10;
    private int aP = OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD;
    private long NFd = 0;
    private long sDy = 0;
    private long lB = -1;
    private long lG = -1;
    private long Jma = -1;
    private long js = -1;

    /* renamed from: zn  reason: collision with root package name */
    private long f9329zn = -1;
    private long es = -1;
    private long yN = -1;
    private String FQ = "";
    private String PAe = "";

    /* renamed from: ip  reason: collision with root package name */
    private String f9326ip = "";
    private String xyz = "";
    private int jPH = 0;
    private int MND = 0;
    private boolean dIT = false;
    private int Qe = 0;
    private int YB = -1;
    private int cjC = 0;
    private int Dq = 0;
    private int Hf = 0;
    private String NBs = null;
    private boolean dI = false;
    private int dVA = 0;
    private int zjb = 0;
    private int ots = 0;
    private int HLI = 0;
    private long oU = 0;
    private long pv = 0;
    private int gga = 0;
    private int Oy = 0;
    private int DaO = 0;
    private JSONObject rB = new JSONObject();
    private Map<String, String> HUk = new HashMap();
    private JSONObject TKG = new JSONObject();
    private String cJP = "";
    private float bM = 0.0f;
    private float pF = 0.0f;
    private boolean mz = false;
    private boolean sqa = false;
    private boolean iWr = false;
    private List<JSONObject> ejU = new ArrayList();
    private boolean cfS = true;
    private volatile boolean Hy = true;
    private volatile boolean yBk = true;
    private ViewTreeObserver.OnGlobalLayoutListener bIO = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                View view = (View) hm.this.PER.get();
                if (view != null) {
                    hm.this.cJ(view);
                }
            } catch (Throwable th2) {
                Sf.Qhi("PlayablePlugin", "onSizeChanged error", th2);
            }
        }
    };
    private int jWV = -1;

    /* compiled from: PlayablePlugin.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private hm(Context context, WebView webView, ac acVar, com.bytedance.sdk.openadsdk.hpZ.Qhi qhi, Qhi qhi2) {
        this.EGK = -2;
        this.EGK = 0;
        this.VnT = qhi2;
        this.Ura = webView;
        WAv.Qhi(webView);
        Qhi(webView);
        Qhi(context, acVar, qhi);
    }

    public static /* synthetic */ int ABk(hm hmVar) {
        int i10 = hmVar.MND;
        hmVar.MND = i10 + 1;
        return i10;
    }

    private void FQ() {
        String str;
        if (this.TKG == null || (str = this.Wrw) == null || str.contains("/cid_")) {
            return;
        }
        String optString = this.TKG.optString("cid");
        if (!TextUtils.isEmpty(optString)) {
            String host = Uri.parse(this.Wrw).getHost();
            if (TextUtils.isEmpty(host)) {
                this.Wrw = f.o(new StringBuilder(), this.Wrw, "/cid_", optString);
            } else {
                this.Wrw = this.Wrw.replace(host, f.m(host, "/cid_", optString));
            }
        }
    }

    private void PAe() {
        Runnable runnable;
        Runnable runnable2;
        this.pA.Qhi(System.currentTimeMillis());
        Handler handler = this.f9328zc;
        if (handler != null) {
            int i10 = this.EGK;
            if (i10 == 0 && (runnable2 = this.ABk) != null) {
                handler.post(runnable2);
            } else if ((i10 == 1 || i10 == 2) && (runnable = this.iMK) != null) {
                handler.post(runnable);
            }
            this.pA.Qhi(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
        }
    }

    private void yN() {
        this.pA = new cJ(this, this.aP);
        this.f9325hm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.3
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.EBS) {
                    hm.this.EBS = false;
                    hm.this.Sf.removeCallbacks(hm.this.WAv);
                    hm.this.Qhi(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.WAv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.4
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.EBS) {
                    hm.this.EBS = false;
                    hm.this.Hy = false;
                    hm.this.Sf.removeCallbacks(hm.this.f9325hm);
                    hm.this.Qhi(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.ABk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.5
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (hm.this.Ura != null) {
                    hm.this.Ura.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.5.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: Qhi */
                        public void onReceiveValue(String str) {
                            if (hm.this.pA != null) {
                                hm.this.pA.Qhi(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (hm.this.f9328zc != null) {
                    hm.this.f9328zc.postDelayed(this, 500L);
                }
            }
        };
        this.iMK = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.6
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                hm.this.Qhi("playable_stuck_check_ping", new JSONObject());
                if (hm.this.f9328zc != null) {
                    hm.this.f9328zc.postDelayed(this, 500L);
                }
            }
        };
        this.Gm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.7
            @Override // java.lang.Runnable
            public void run() {
                if (hm.this.pv > 0) {
                    if (hm.this.pv - hm.this.oU <= hm.this.aP) {
                        hm.this.lB();
                        hm.this.oU = 0L;
                        hm.this.pv = 0L;
                        return;
                    }
                    hm.this.cJ(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                hm.this.cJ(1, "Clicking on the hot zone causes the program to freeze.");
            }
        };
    }

    public static /* synthetic */ int zc(hm hmVar) {
        int i10 = hmVar.jPH;
        hmVar.jPH = i10 + 1;
        return i10;
    }

    public void CQU() {
        if (this.et != null) {
            Qhi qhi = Qhi.LAND_PAGE;
        }
    }

    public void Dww() {
        this.dI = true;
    }

    public void EBS() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f9329zn > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.f9329zn);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.Jma > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.Jma;
                this.yN = currentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", currentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            ac("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void Eh() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f9329zn > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.f9329zn);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.Jma > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.Jma);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            ac("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public com.bytedance.sdk.openadsdk.hpZ.Qhi HzH() {
        return this.et;
    }

    public void Jma() {
        this.Oy = 0;
        this.DaO = 0;
        this.wp = 0.0f;
        this.VV = 0;
        this.Px = 0;
        this.HWc = 0;
        this.SNp = 0;
        this.YD = 0;
        this.eG = 0;
        this.Ug = 0;
        this.f9327ne = 0;
        this.zTC = 0;
        this.LcF = 0;
    }

    public JSONObject MQ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.wp);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(InMobiNetworkValues.WIDTH, this.VV);
            jSONObject2.put(InMobiNetworkValues.HEIGHT, this.Px);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.SNp);
            jSONObject3.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, this.HWc);
            jSONObject3.put(InMobiNetworkValues.WIDTH, this.YD);
            jSONObject3.put(InMobiNetworkValues.HEIGHT, this.eG);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.f9327ne);
            jSONObject4.put(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, this.Ug);
            jSONObject4.put(InMobiNetworkValues.WIDTH, this.zTC);
            jSONObject4.put(InMobiNetworkValues.HEIGHT, this.LcF);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "getViewport error", th2);
        }
        return jSONObject;
    }

    public void NFd() {
        int i10;
        int i11 = this.EGK;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (this.Hy) {
                this.Sf.postDelayed(this.f9325hm, this.pM * 1000);
            }
            if ((this.yBk && Gm(this.Wrw)) || (i10 = this.EGK) == 1 || i10 == 2) {
                this.Sf.postDelayed(this.WAv, this.Eh * 1000);
            }
        }
    }

    public void aP() {
        cJ cJVar;
        this.pv = System.currentTimeMillis();
        int i10 = this.EGK;
        if ((i10 == 1 || i10 == 2) && (cJVar = this.pA) != null) {
            cJVar.Qhi(System.currentTimeMillis());
        }
    }

    public void bxS() {
        this.YB = 2;
    }

    public String es() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public String hpZ() {
        com.bytedance.sdk.openadsdk.hpZ.Qhi qhi;
        if (TextUtils.isEmpty(this.f9326ip) && (qhi = this.et) != null) {
            this.f9326ip = qhi.Qhi().toString();
        }
        return this.f9326ip;
    }

    public JSONObject iMK() {
        boolean Qhi2;
        boolean Qhi3;
        try {
            boolean z10 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                Qhi2 = Tgh.Qhi(this.Ri, "android.permission.READ_MEDIA_IMAGES");
                Qhi3 = true;
            } else {
                Qhi2 = Tgh.Qhi(this.Ri, "android.permission.READ_EXTERNAL_STORAGE");
                Qhi3 = Tgh.Qhi(this.Ri, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", Qhi2);
            jSONObject.put("isHasWrite", Qhi3);
            if (!Qhi2 || !Qhi3) {
                z10 = false;
            }
            jSONObject.put("result", z10);
            return jSONObject;
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public void js() {
        if (this.iWr) {
            return;
        }
        this.iWr = true;
        this.sDy = 0L;
        this.HzH = true;
        Jma();
        try {
            View view = this.PER.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.bIO);
            }
        } catch (Throwable unused) {
        }
        try {
            this.Gy.cJ();
        } catch (Throwable unused2) {
        }
        try {
            cJ cJVar = this.pA;
            if (cJVar != null) {
                cJVar.Qhi();
                this.pA = null;
            }
            Handler handler = this.f9328zc;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.Wrw)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.jPH);
                jSONObject.put("playable_hit_times", this.MND);
                int i10 = this.jPH;
                if (i10 > 0) {
                    jSONObject.put("playable_hit_ratio", this.MND / (i10 * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                ac("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.Wrw)) {
                if (this.lB != -1) {
                    this.NFd += System.currentTimeMillis() - this.lB;
                    this.lB = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.NFd);
                ac("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.Hy = false;
        this.yBk = false;
        this.Sf.removeCallbacks(this.f9325hm);
        this.Sf.removeCallbacks(this.WAv);
        this.Sf.removeCallbacksAndMessages(null);
    }

    public JSONObject kYc() {
        if (this.rB.isNull(InMobiNetworkValues.WIDTH)) {
            View view = this.PER.get();
            if (view == null) {
                return this.rB;
            }
            cJ(view);
        }
        return this.rB;
    }

    public void lB() {
        if (!this.bxS) {
            return;
        }
        this.es = System.currentTimeMillis();
        if (this.VnT == Qhi.FEED_AWEME) {
            if (this.yy && this.gga == 3) {
                cJ cJVar = this.pA;
                if (cJVar != null && cJVar.cJ()) {
                    PAe();
                } else if (this.pA == null) {
                    this.pA = new cJ(this, this.aP);
                    PAe();
                }
            }
        } else if (this.yy && this.gga == 2) {
            cJ cJVar2 = this.pA;
            if (cJVar2 != null && cJVar2.cJ()) {
                PAe();
            } else if (this.pA == null) {
                this.pA = new cJ(this, this.aP);
                PAe();
            }
        }
    }

    public void lG() {
        try {
            cJ cJVar = this.pA;
            if (cJVar != null) {
                cJVar.Qhi();
            }
            Handler handler = this.f9328zc;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public JSONObject pA() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.VnT.ordinal());
            jSONObject.put("safe_area_top_height", this.bM);
            jSONObject.put("safe_area_bottom_height", this.pF);
            jSONObject.put("playable_enter_from", this.Dq);
            jSONObject.put("playable_retry_count", this.cjC);
            jSONObject.put("playable_card_session", this.FQ);
            jSONObject.put("playable_video_session", this.PAe);
            jSONObject.put("playable_network_type", hpZ());
            jSONObject.put("aweme_id", this.xyz);
            return jSONObject;
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "playableInfo error", th2);
            return new JSONObject();
        }
    }

    public void pM() {
        if (this.et != null) {
            Qhi qhi = Qhi.LAND_PAGE;
        }
    }

    public void qMt() {
        com.bytedance.sdk.openadsdk.hpZ.Qhi qhi = this.et;
        if (qhi != null) {
            qhi.cJ();
        }
    }

    public void sDy() {
        this.yBk = false;
        this.Sf.removeCallbacks(this.WAv);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.Jma > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.Jma);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            ac("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public JSONObject tP() {
        return this.TKG;
    }

    public int zn() {
        if (this.lG != -1 && this.yy) {
            return 2;
        }
        return 1;
    }

    private boolean Gm(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public JSONObject ABk() {
        try {
            boolean Qhi2 = Tgh.Qhi(this.Ri, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", Qhi2);
            return jSONObject;
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public String CJ() {
        return this.SO;
    }

    public String ROR() {
        return this.Ohm;
    }

    public boolean Sf() {
        return this.Ki;
    }

    public String Tgh() {
        return this.XH;
    }

    public JSONObject WAv() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.Ls);
            return jSONObject;
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "getPlayableClickStatus error", th2);
            return new JSONObject();
        }
    }

    public JSONObject ac() {
        return this.gT;
    }

    public String fl() {
        return this.mZ;
    }

    public boolean hm() {
        return this.yy;
    }

    public JSONObject zc() {
        try {
            boolean Qhi2 = Tgh.Qhi(this.Ri, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", Qhi2);
            return jSONObject;
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public hm CJ(String str) {
        this.XH = str;
        return this;
    }

    public Set<String> Gm() {
        return this.Gy.Qhi();
    }

    public JSONObject ROR(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt != 1) {
            if (optInt != 2) {
                return optInt != 3 ? jSONObject2 : iMK();
            }
            return ABk();
        }
        return zc();
    }

    public JSONObject Sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            jSONObject2.put("result", Tgh.cJ(this.Ri, "android.permission.RECORD_AUDIO"));
        } else if (optInt != 2) {
            if (optInt == 3) {
                jSONObject2.put("result", Tgh.Qhi(this.Ri));
            }
            return jSONObject2;
        } else {
            jSONObject2.put("result", Tgh.cJ(this.Ri, "android.permission.CAMERA"));
        }
        return jSONObject2;
    }

    public hm Tgh(String str) {
        Uri parse;
        String scheme;
        int indexOf;
        String decode;
        this.cJP = str;
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Throwable unused) {
        }
        if (!"http".equalsIgnoreCase(scheme) && !Constants.SCHEME.equalsIgnoreCase(scheme)) {
            String host = parse.getHost();
            if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.EGK == -1) {
                        cJ(2);
                    } else {
                        cJ(1);
                    }
                }
                this.Wrw = str;
                return this;
            }
            cJ(0);
            String queryParameter = parse.getQueryParameter(InMobiNetworkValues.URL);
            if (!TextUtils.isEmpty(queryParameter) && (decode = Uri.decode(queryParameter)) != null) {
                int indexOf2 = decode.indexOf("?");
                str = indexOf2 != -1 ? decode.substring(0, indexOf2) : decode;
            }
            this.Wrw = str;
            return this;
        }
        cJ(0);
        if (str != null && (indexOf = str.indexOf("?")) != -1) {
            str = str.substring(0, indexOf);
        }
        this.Wrw = str;
        return this;
    }

    public hm ac(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.gT = jSONObject;
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "setPlayableStyle error", th2);
        }
        return this;
    }

    public hm fl(String str) {
        this.Ohm = str;
        return this;
    }

    public void hm(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("success", true);
            if (optBoolean) {
                this.gga = 3;
                lB();
            } else {
                this.gga = -2;
            }
            if (optBoolean || !this.EBS) {
                return;
            }
            this.EBS = false;
            this.Hy = false;
            this.yBk = false;
            this.Sf.removeCallbacks(this.f9325hm);
            this.Sf.removeCallbacks(this.WAv);
            Qhi(4, "CaseRenderFail");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.Oy == view.getWidth() && this.DaO == view.getHeight()) {
                return;
            }
            this.Oy = view.getWidth();
            this.DaO = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InMobiNetworkValues.WIDTH, this.Oy);
            jSONObject.put(InMobiNetworkValues.HEIGHT, this.DaO);
            Qhi("resize", jSONObject);
            this.rB = jSONObject;
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "resetViewDataJsonByView error", th2);
        }
    }

    public void CJ(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.NBs = jSONObject.optString("section");
        }
    }

    public void fl(JSONObject jSONObject) {
        this.ReL = jSONObject;
        this.Hf++;
        lG();
        this.Sf.removeCallbacks(this.Gm);
        if (this.bxS) {
            this.es = System.currentTimeMillis();
            this.oU = System.currentTimeMillis();
            this.pv = 0L;
            int i10 = this.EGK;
            if (i10 == 0) {
                WebView webView = this.Ura;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.8
                        @Override // android.webkit.ValueCallback
                        /* renamed from: Qhi */
                        public void onReceiveValue(String str) {
                            hm.this.pv = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i10 == 1 || i10 == 2) {
                Qhi("playable_stuck_check_ping", new JSONObject());
            }
            this.Sf.postDelayed(this.Gm, this.aP);
        }
    }

    private String CJ(String str, String str2) {
        String format = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.Wrw = format;
        return format;
    }

    private void Qhi(Context context, ac acVar, com.bytedance.sdk.openadsdk.hpZ.Qhi qhi) {
        this.MQ = UUID.randomUUID().toString();
        this.Ri = context;
        this.et = qhi;
        this.SL = acVar;
        Gm.Qhi(qhi);
        this.Gy = new ROR(this);
        yN();
    }

    public JSONObject CJ(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (Sf.Qhi() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject Qhi2 = this.Gy.Qhi(str, jSONObject);
        if (Sf.Qhi()) {
            System.currentTimeMillis();
            if (Qhi2 != null) {
                Qhi2.toString();
            }
        }
        return Qhi2;
    }

    public void WAv(String str) {
        this.Sf.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.2
            @Override // java.lang.Runnable
            public void run() {
                hm.ABk(hm.this);
            }
        });
    }

    public hm ac(boolean z10) {
        this.Ls = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.Ls);
            Qhi("change_playable_click", jSONObject);
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "setPlayableClick error", th2);
        }
        return this;
    }

    public void ROR(String str) {
        this.gga = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.Jma = currentTimeMillis;
            long j10 = this.lG;
            jSONObject.put("playable_page_show_duration", j10 != -1 ? currentTimeMillis - j10 : 0L);
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "reportUrlLoadStart error", th2);
        }
        ac("PL_sdk_html_load_start", jSONObject);
        this.Hy = true;
        this.yBk = true;
        if (this.cfS) {
            NFd();
            this.Hy = false;
            this.yBk = false;
        }
        if (this.HzH) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (Tgh.Qhi(this.Ri, Tgh.f9317zc)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (Tgh.cJ(this.Ri, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    }
                } else {
                    stringBuffer2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                }
                if (Tgh.Qhi(this.Ri, Tgh.Gm)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                }
                if (Tgh.Qhi(this.Ri, Tgh.WAv)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                }
                if (Tgh.Qhi(this.Ri, Tgh.f9316hm)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                }
                if (Tgh.Qhi(this.Ri, Tgh.Sf)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (Tgh.cJ(this.Ri, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    }
                } else {
                    stringBuffer2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                }
                if (Tgh.Qhi(this.Ri, Tgh.ROR)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (Tgh.Qhi(this.Ri)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    }
                } else {
                    stringBuffer2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                    stringBuffer3.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                ac("PL_sdk_hardware_detect", jSONObject2);
                this.HzH = false;
            } catch (Throwable th3) {
                Sf.Qhi("PlayablePlugin", "Hardware detect error", th3);
            }
        }
    }

    public void Sf(String str) {
        WebView webView;
        boolean z10 = this.gga == -1;
        this.gga = 2;
        if (!z10) {
            this.vml = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.js = currentTimeMillis;
                long j10 = this.Jma;
                jSONObject.put("playable_html_load_start_duration", j10 != -1 ? currentTimeMillis - j10 : 0L);
                jSONObject.put("playable_has_show", zn());
            } catch (Throwable th2) {
                Sf.Qhi("PlayablePlugin", "reportUrlLoadFinish error", th2);
            }
            ac("PL_sdk_html_load_finish", jSONObject);
        }
        this.Hy = false;
        this.Sf.removeCallbacks(this.f9325hm);
        try {
            if (this.EGK == 0) {
                if (this.hpZ && (webView = this.Ura) != null) {
                    this.hpZ = false;
                    webView.evaluateJavascript(es(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.9
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                lB();
            }
        } catch (Throwable th3) {
            Sf.Qhi("PlayablePlugin", "crashMonitor error", th3);
        }
    }

    public hm CJ(boolean z10) {
        this.cfS = z10;
        return this;
    }

    public void Qhi(View view) {
        if (view == null) {
            return;
        }
        try {
            this.PER = new WeakReference<>(view);
            cJ(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.bIO);
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "setViewForScreenSize error", th2);
        }
    }

    public hm ac(JSONObject jSONObject) {
        this.TKG = jSONObject;
        return this;
    }

    private void ac(int i10, String str) {
        com.bytedance.sdk.openadsdk.hpZ.Qhi qhi = this.et;
        if (qhi != null) {
            qhi.Qhi(i10, str);
        }
    }

    public Map<String, String> cJ() {
        return this.HUk;
    }

    public hm cJ(String str) {
        this.SO = str;
        return this;
    }

    public void hm(String str) {
        this.Sf.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hpZ.hm.10
            @Override // java.lang.Runnable
            public void run() {
                hm.zc(hm.this);
            }
        });
    }

    private String ac(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.IC) && !TextUtils.isEmpty(this.cJP)) {
            Uri parse = Uri.parse(this.cJP);
            String host = parse.getHost();
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter = parse.getQueryParameter("surl");
                queryParameter2 = parse.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
                queryParameter2 = "";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(parse.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                appendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.IC = appendQueryParameter.toString();
        }
        return this.IC;
    }

    public hm cJ(long j10) {
        if (j10 <= 0) {
            this.Eh = 10L;
        } else {
            this.Eh = j10;
        }
        return this;
    }

    public Context Qhi() {
        return this.Ri;
    }

    private void fl(String str, JSONObject jSONObject) {
        try {
            int i10 = this.EGK;
            if (i10 == 0) {
                if (this.VnT != Qhi.LAND_PAGE && !Gm(this.Wrw)) {
                    FQ();
                }
                jSONObject.put("playable_url", this.Wrw);
            } else {
                if (i10 != 3 && i10 != 4) {
                    if (i10 == 1 || i10 == 2) {
                        jSONObject.put("playable_url", ac(this.eN, this.sRC));
                    }
                }
                jSONObject.put("playable_url", CJ(this.rP, this.LpL));
            }
            jSONObject.put("playable_render_type", this.EGK);
            if (this.et != null) {
                if (this.EGK == 0 && (this.VnT != Qhi.LAND_PAGE || Gm(this.Wrw))) {
                    this.et.Qhi(jSONObject);
                } else if (this.EGK != 0) {
                    this.et.Qhi(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public hm Qhi(String str, String str2) {
        this.HUk.put(str, str2);
        return this;
    }

    public hm cJ(boolean z10) {
        if (this.jWV == -1 || this.yy == z10) {
            return this;
        }
        this.yy = z10;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.yy) {
                jSONObject.put("playable_background_show_type", this.zjb);
            }
        } catch (JSONException unused) {
        }
        ac(this.yy ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.lG == -1 && this.yy) {
            this.lG = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", this.jWV == 1 ? 1 : 2);
                int i10 = this.jWV;
                if (i10 != -1) {
                    jSONObject2.put("webview_state", i10);
                }
            } catch (JSONException unused2) {
            }
            ac("PL_sdk_page_show", jSONObject2);
        }
        if (this.lG != -1 && !this.yy && !this.mz) {
            this.mz = true;
        }
        if (this.yy) {
            this.lB = System.currentTimeMillis();
        } else if (this.lB != -1) {
            this.NFd += System.currentTimeMillis() - this.lB;
            this.lB = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.yy);
            Qhi("viewableChange", jSONObject3);
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "setViewable error", th2);
        }
        if (this.yy) {
            lB();
        } else {
            lG();
        }
        return this;
    }

    public hm Qhi(String str) {
        this.mZ = str;
        return this;
    }

    public hm Qhi(boolean z10) {
        this.Ki = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.Ki);
            Qhi("volumeChange", jSONObject);
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "setIsMute error", th2);
        }
        return this;
    }

    public void Tgh(JSONObject jSONObject) {
        cJ(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public hm Qhi(long j10) {
        if (j10 <= 0) {
            this.pM = 10L;
        } else {
            this.pM = j10;
        }
        return this;
    }

    public void Qhi(int i10) {
        this.jWV = i10;
    }

    public void ac(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.dIT && this.MND > 0) {
                this.dIT = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.Ewb ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.yy);
            jSONObject.put("playable_session_id", this.MQ);
            int i10 = this.EGK;
            if (i10 == 0) {
                if (this.VnT != Qhi.LAND_PAGE && !Gm(this.Wrw)) {
                    FQ();
                }
                jSONObject.put("playable_url", this.Wrw);
            } else {
                if (i10 != 3 && i10 != 4) {
                    if (i10 == 1 || i10 == 2) {
                        jSONObject.put("playable_url", ac(this.eN, this.sRC));
                    }
                }
                jSONObject.put("playable_url", CJ(this.rP, this.LpL));
            }
            jSONObject.put("playable_full_url", this.cJP);
            jSONObject.put("playable_replay_count", this.Qe);
            jSONObject.put("playable_is_prerender", this.KW);
            jSONObject.put("playable_is_preload", this.dIT);
            jSONObject.put("playable_render_type", this.EGK);
            jSONObject.put("playable_scenes_type", this.VnT.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.eN) ? "" : this.eN);
            if (!TextUtils.isEmpty(this.sRC)) {
                str2 = this.sRC;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.rP);
            jSONObject.put("playable_minigamelite_schema", this.LpL);
            jSONObject.put("playable_is_debug", this.sqa);
            jSONObject.put("playable_retry_count", this.cjC);
            jSONObject.put("playable_enter_from", this.Dq);
            jSONObject.put("playable_sequence", this.Hf);
            jSONObject.put("playable_current_section", this.NBs);
            jSONObject.put("is_playable_finish", this.dI);
            jSONObject.put("playable_card_session", this.FQ);
            jSONObject.put("playable_video_session", this.PAe);
            jSONObject.put("playable_network_type", hpZ());
            jSONObject.put("playable_lynx_version", this.CQU);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.qMt);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.TKG.opt("cid"));
            jSONObject2.put("log_extra", this.TKG.opt("log_extra"));
            int i11 = this.EGK;
            if (i11 != -1 && i11 != -2) {
                if (this.et != null) {
                    List<JSONObject> list = this.ejU;
                    if (list != null && !list.isEmpty()) {
                        for (JSONObject jSONObject3 : this.ejU) {
                            JSONObject optJSONObject = jSONObject3.optJSONObject("ad_extra_data");
                            if (optJSONObject != null) {
                                optJSONObject.put("playable_render_type", this.EGK);
                                optJSONObject.put("playable_url", this.Wrw);
                            }
                            this.et.Qhi(optJSONObject);
                        }
                        this.ejU.clear();
                    }
                    if (this.EGK == 0 && (this.VnT != Qhi.LAND_PAGE || Gm(this.Wrw))) {
                        this.et.Qhi(jSONObject);
                        return;
                    } else if (this.EGK != 0) {
                        this.et.Qhi(jSONObject);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (this.ejU == null) {
                this.ejU = new ArrayList();
            }
            this.ejU.add(jSONObject2);
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "reportEvent error", th2);
        }
    }

    public void Qhi(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.hpZ.Qhi qhi = this.et;
        if (qhi == null || qhi.cJ(jSONObject) || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("resource_type", -1);
        String optString2 = jSONObject.optString("resource_name", "playable_media");
        if (optInt == 1) {
            cJ(optString2, optString);
        }
    }

    public void fl(boolean z10) {
        this.Ewb = z10;
    }

    public void Qhi(String str, JSONObject jSONObject) {
        if (Sf.Qhi() && jSONObject != null) {
            jSONObject.toString();
        }
        ac acVar = this.SL;
        if (acVar != null) {
            acVar.Qhi(str, jSONObject);
        }
    }

    public void Qhi(int i10, String str) {
        lG();
        ac(i10, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "reportRenderFatal error", th2);
        }
        ac("PL_sdk_global_faild", jSONObject);
    }

    public void Qhi(int i10, String str, String str2) {
        this.gga = -1;
        this.vml = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", zn());
        } catch (Throwable th2) {
            Sf.Qhi("PlayablePlugin", "onWebReceivedError error", th2);
        }
        ac("PL_sdk_html_load_error", jSONObject);
        if (this.EBS) {
            this.EBS = false;
            this.Hy = false;
            this.yBk = false;
            this.Sf.removeCallbacks(this.f9325hm);
            this.Sf.removeCallbacks(this.WAv);
            Qhi(1, "ContainerLoadFail");
        }
    }

    public void cJ(JSONObject jSONObject) {
        if (this.et != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public void cJ(String str, String str2) {
        Bitmap Qhi2;
        if (TextUtils.isEmpty(str2) || (Qhi2 = Tgh.Qhi(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.Ri.getContentResolver(), Qhi2, str, "");
    }

    public hm cJ(int i10) {
        this.EGK = i10;
        return this;
    }

    public void cJ(int i10, String str) {
        this.YB = i10;
        if (this.ReL == null) {
            this.ReL = new JSONObject();
        }
        try {
            this.ReL.put("playable_stuck_type", i10);
            this.ReL.put("playable_stuck_reason", str);
            if (this.es > 0) {
                this.ReL.put("playable_stuck_duration", System.currentTimeMillis() - this.es);
            } else {
                this.ReL.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        ac("PL_sdk_page_stuck", this.ReL);
        lG();
        if (this.et == null || i10 != 2) {
            return;
        }
        this.ReL = new JSONObject();
    }

    public void Qhi(boolean z10, String str, int i10) {
        if (z10) {
            this.gga = -1;
            this.vml = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i10);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", zn());
            } catch (Throwable th2) {
                Sf.Qhi("PlayablePlugin", "onWebReceivedHttpError error", th2);
            }
            ac("PL_sdk_html_load_error", jSONObject);
            if (this.EBS) {
                this.EBS = false;
                this.Hy = false;
                this.yBk = false;
                this.Sf.removeCallbacks(this.f9325hm);
                this.Sf.removeCallbacks(this.WAv);
                Qhi(1, "ContainerLoadFail");
            }
        }
    }

    public void cJ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fl(str, jSONObject);
    }

    public static hm Qhi(Context context, WebView webView, ac acVar, com.bytedance.sdk.openadsdk.hpZ.Qhi qhi) {
        if (webView == null || acVar == null || qhi == null) {
            return null;
        }
        return new hm(context, webView, acVar, qhi, Qhi.LAND_PAGE);
    }
}

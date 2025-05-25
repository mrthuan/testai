package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.CJ.tP;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.cJ.Qhi.pA;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.settings.TTSdkSettings;
import com.bytedance.sdk.openadsdk.core.settings.Tgh;
import com.bytedance.sdk.openadsdk.core.settings.hpZ;
import com.bytedance.sdk.openadsdk.core.settings.pA;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.google.android.gms.common.api.Api;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.C1646h;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hslf.record.SlideAtom;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTSdkSettings.java */
/* loaded from: classes.dex */
public class HzH implements ROR, pA.Qhi {
    private final AtomicBoolean ABk;
    final Tgh.cJ<ConcurrentHashMap<String, Integer>> CJ;
    private final Set<String> CQU;
    private final Tgh.cJ<Map<String, Integer>> Dww;
    private final BroadcastReceiver EBS;
    private Tgh.cJ<JSONObject> Eh;
    private final com.bytedance.sdk.openadsdk.core.settings.Qhi Gm;
    private int HzH;
    private WAv MQ;
    private Set<String> ROR;
    private final Gm WAv;
    private final Runnable bxS;

    /* renamed from: fl  reason: collision with root package name */
    Tgh.cJ<com.bytedance.sdk.openadsdk.cJ.Qhi.pA> f9159fl;
    private int hpZ;
    private volatile boolean iMK;
    private boolean kYc;
    private boolean pA;
    private final Tgh.cJ<Set<String>> pM;

    /* renamed from: zc  reason: collision with root package name */
    private final iMK f9160zc;
    private static final String Tgh = js.iMK();
    private static final com.bytedance.sdk.component.Sf.hm Sf = new com.bytedance.sdk.component.Sf.hm("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.1
        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.adexpress.Qhi.cJ.Tgh.cJ().hm();
            com.bytedance.sdk.component.adexpress.Qhi.cJ.Tgh.cJ().cJ(false);
            com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.cJ();
            com.bytedance.sdk.component.adexpress.Qhi.cJ.Tgh.cJ().ac();
        }
    };
    public static String Qhi = "";
    public static String cJ = "IABTCF_TCString";

    /* renamed from: hm  reason: collision with root package name */
    private static boolean f9158hm = false;
    private static final ConcurrentLinkedQueue<hpZ.Qhi> tP = new ConcurrentLinkedQueue<>();
    private static final zc qMt = new zc();

    /* renamed from: ac  reason: collision with root package name */
    static final ConcurrentHashMap<String, Integer> f9157ac = new ConcurrentHashMap<>();

    /* compiled from: TTSdkSettings.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.HzH$11  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass11 extends BroadcastReceiver {
        private final Runnable cJ = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.11.1
            @Override // java.lang.Runnable
            public void run() {
                lG.cJ(new com.bytedance.sdk.component.Sf.hm("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.11.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HzH.this.cJ();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        public AnonymousClass11() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            lG.cJ(new com.bytedance.sdk.component.Sf.hm("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.11.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        HzH.this.Qhi(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.Sf.Qhi().removeCallbacks(AnonymousClass11.this.cJ);
                        com.bytedance.sdk.component.utils.Sf.Qhi().postDelayed(AnonymousClass11.this.cJ, 10000L);
                    }
                }
            });
        }
    }

    /* compiled from: TTSdkSettings.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        static final HzH Qhi = new HzH();
    }

    private static SharedPreferences CJ(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    private long Ki() {
        long Qhi2 = this.f9160zc.Qhi("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        if (Qhi2 < 0 || Qhi2 > 86400000) {
            return TTAdConstant.AD_MAX_EVENT_TIME;
        }
        return Qhi2;
    }

    private String LcF() {
        return this.f9160zc.Qhi("force_language", "");
    }

    private int Ohm() {
        return this.f9160zc.Qhi("coppa", -99);
    }

    public static void SNp() {
        Context Qhi2;
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac() && (Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(Qhi2.getPackageName());
                intent.setAction("_dataChanged");
                Qhi2.sendBroadcast(intent);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.SdkSettings", "", th2);
            }
        }
    }

    public static boolean Ug() {
        return f9158hm;
    }

    public static ROR YD() {
        if (com.bytedance.sdk.openadsdk.core.HzH.Qhi() == null) {
            ApmHelper.reportCustomError("context is null", "context is null", new IllegalStateException("context is null"));
            return qMt;
        }
        return Qhi.Qhi;
    }

    private static int ac(boolean z10) {
        return z10 ? 20 : 5;
    }

    private Set<String> mz() {
        return (Set) this.f9160zc.Qhi("perf_con_applog_send", this.CQU, this.pM);
    }

    private long yy() {
        return this.f9160zc.Qhi("last_req_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean ABk() {
        return this.f9160zc.Qhi("support_mem_dynamic", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int CQU() {
        return this.f9160zc.Qhi("max", 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String DaO() {
        return this.f9160zc.Qhi("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Dq() {
        return this.iMK;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public long Dww() {
        return this.f9160zc.Qhi("duration", 10000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public WAv EBS() {
        WAv wAv = this.MQ;
        if (wAv != null) {
            return wAv;
        }
        WAv wAv2 = (WAv) this.WAv.Qhi("mediation_init_conf", WAv.Qhi, new Tgh.cJ<WAv>() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.cJ
            /* renamed from: Qhi */
            public WAv cJ(String str) {
                return new WAv(str);
            }
        });
        this.MQ = wAv2;
        return wAv2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean EGK() {
        if (!tP.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi())) {
            return false;
        }
        return this.f9160zc.Qhi("support_rtl", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String Eh() {
        return this.f9160zc.Qhi("playableLoadH5Url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String FQ() {
        return this.f9160zc.Qhi("dyn_draw_engine_url", Tgh);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int Gm() {
        return this.f9160zc.Qhi("load_callback_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Gy() {
        if (this.f9160zc.Qhi("perf_con_adlog_turn_off_retry_ad", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String[] HLI() {
        Set<String> set;
        try {
            set = this.ROR;
        } catch (Throwable unused) {
        }
        if (set == null || set.size() == 0) {
            JSONArray jSONArray = new JSONArray(this.f9160zc.Qhi("gecko_hosts", (String) null));
            if (jSONArray.length() != 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.ROR.add(jSONArray.getString(i10));
                }
            }
            Set<String> Qhi2 = iMK.Qhi(this.ROR);
            this.ROR = Qhi2;
            if (Qhi2 != null) {
                if (Qhi2.size() == 0) {
                }
            }
            return null;
        }
        return (String[]) this.ROR.toArray(new String[0]);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public com.bytedance.sdk.openadsdk.cJ.Qhi.pA HUk() {
        return (com.bytedance.sdk.openadsdk.cJ.Qhi.pA) this.f9160zc.Qhi("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.cJ.Qhi.pA.Qhi, this.f9159fl);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public Set<String> HWc() {
        return (Set) this.f9160zc.Qhi("perf_con_drop2rt_skip_label_list", Collections.emptySet(), Tgh.cJ);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Hf() {
        if (this.f9160zc.Qhi("global_rate", 1.0f) == 1.0f) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean HzH() {
        return this.f9160zc.Qhi("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int IC() {
        return this.f9160zc.Qhi("bus_con_arbitrage_loading_timeout", Constants.CP_MAC_ROMAN);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String Jma() {
        return this.f9160zc.Qhi("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int MND() {
        int Qhi2 = this.f9160zc.Qhi("privacy_personalized_ad", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (Qhi2 != Integer.MAX_VALUE) {
            return Qhi2;
        }
        int hpZ = js.hpZ();
        if (hpZ == 1 || hpZ == 2) {
            return 2;
        }
        if (hpZ == 3) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int MQ() {
        return this.f9160zc.Qhi("loadedCallbackOpportunity", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean NBs() {
        if (this.f9160zc.Qhi("read_video_from_cache", 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int NFd(String str) {
        Integer num;
        Map map = (Map) this.f9160zc.Qhi("perf_con_applog_rate", null, this.Dww);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int Oy() {
        int Qhi2 = this.f9160zc.Qhi("bus_con_token_thread_count", 4);
        if (Qhi2 <= 0 || Qhi2 > 30) {
            return 4;
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String PAe() {
        return this.f9160zc.Qhi("dc", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public long PER() {
        return this.f9160zc.Qhi("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Px() {
        if (this.f9160zc.Qhi("bus_con_video_keep_screen_on", 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Qe() {
        if (this.f9160zc.Qhi("bus_con_sec_type", Api.BaseClientBuilder.API_PRIORITY_OTHER) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void ROR() {
        this.f9160zc.Qhi().Qhi("tt_sdk_settings").Qhi("ab_test_param").Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void ReL() {
        this.pA = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int Ri() {
        return this.f9160zc.Qhi("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public long SL() {
        long Qhi2 = this.f9160zc.Qhi("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME);
        if (Qhi2 < 10000) {
            return 10000L;
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String SO() {
        return this.f9160zc.Qhi("dual_event_url", (String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Sf() {
        return this.f9160zc.Qhi("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int TKG() {
        return this.f9160zc.Qhi("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public long Tgh() {
        return this.f9160zc.Qhi("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Ura() {
        return this.f9160zc.Qhi("bus_con_adshow_check_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean VV() {
        if (this.f9160zc.Qhi("perf_con_is_new_net_thread", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean VnT() {
        if (this.f9160zc.Qhi("perf_con_apm_native", Api.BaseClientBuilder.API_PRIORITY_OTHER) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String WAv() {
        return this.f9160zc.Qhi("ab_test_version", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public JSONObject Wrw() {
        return (JSONObject) this.f9160zc.Qhi("perf_con_thread_pool_config", new JSONObject(), this.Eh);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int XH() {
        int Qhi2 = this.f9160zc.Qhi("bus_con_auto_click_delay", 3000);
        if (Qhi2 <= 0) {
            return 3000;
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean YB() {
        return this.f9160zc.Qhi("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int aP() {
        int Qhi2 = this.f9160zc.Qhi("fetch_tpl_timeout_ctrl", 3000);
        if (Qhi2 <= 0) {
            return 3000;
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String bM() {
        return this.f9160zc.Qhi("bus_con_check_clz", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean bxS() {
        return this.f9160zc.Qhi("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public float cJP() {
        return this.f9160zc.Qhi("bus_con_arbitrage_loading_alpha", 1.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean cjC() {
        if (this.f9160zc.Qhi("privacy_debug_unlock", 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int dI() {
        int Qhi2 = this.f9160zc.Qhi("perf_con_webview_cache_count", 0);
        if (Qhi2 < 0) {
            return 0;
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean dIT() {
        int Qhi2 = this.Gm.Qhi("perf_con_apm", 100);
        if (Qhi2 == 0) {
            return false;
        }
        if (Qhi2 >= 0 && Qhi2 < 100 && Qhi2 <= ((int) (Math.random() * 100.0d))) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int dVA() {
        int Qhi2 = this.f9160zc.Qhi("perf_con_webview_cache_count_v3", 0);
        if (Qhi2 < 0) {
            return 0;
        }
        return Qhi2;
    }

    public void eG() {
        if (!pA.Qhi()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.iMK.cJ().removeCallbacks(this.bxS);
        com.bytedance.sdk.openadsdk.core.iMK.cJ().postDelayed(this.bxS, Ki());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String es() {
        return this.f9160zc.Qhi("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean et() {
        if (this.f9160zc.Qhi("perf_con_adlog_turn_off_retry_stats", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public JSONObject fl() {
        return (JSONObject) this.f9160zc.Qhi("digest", null, Tgh.Qhi);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean gT() {
        if (this.f9160zc.Qhi("bus_con_rewardedfull_link", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int gga() {
        return this.f9160zc.Qhi("bus_con_send_log_type", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean hm() {
        return !(this.f9160zc.Qhi("support_tnc", 1) == 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int hpZ() {
        mz();
        return this.hpZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public Set<String> iMK() {
        return mz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int ip() {
        return this.f9160zc.Qhi("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean jPH() {
        int Qhi2 = this.f9160zc.Qhi("privacy_ad_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (Qhi2 == 1) {
            return true;
        }
        if (Qhi2 == 0) {
            return false;
        }
        int hpZ = js.hpZ();
        if (hpZ == 1 || hpZ == 2 || hpZ == 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String js() {
        return this.f9160zc.Qhi("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean kYc() {
        return this.f9160zc.Qhi("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int lB() {
        return this.f9160zc.Qhi("disable_rotate_banner_on_dislike", Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean lG() {
        return this.f9160zc.cJ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean mZ() {
        if (this.f9160zc.Qhi("perf_con_use_new_thread_pool", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int oU() {
        return this.f9160zc.Qhi("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int ots() {
        int Qhi2 = this.f9160zc.Qhi("perf_con_webview_preload_cache_v3", 0);
        if (Qhi2 < 0) {
            return 0;
        }
        if (Qhi2 > 5) {
            return 5;
        }
        int dVA = dVA();
        if (Qhi2 > dVA) {
            return dVA;
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int pA() {
        mz();
        return this.HzH;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean pF() {
        if (this.f9160zc.Qhi("bus_con_url_check", 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public Sf pM() {
        return (Sf) this.f9160zc.Qhi("insert_js_config", Sf.Qhi, new Tgh.cJ<Sf>() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.cJ
            /* renamed from: Qhi */
            public Sf cJ(String str) {
                return new Sf(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public JSONObject pv() {
        return (JSONObject) this.f9160zc.Qhi("video_cache_config", null, Tgh.Qhi);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String qMt() {
        return this.f9160zc.Qhi("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int rB() {
        return this.f9160zc.Qhi("bus_con_behavior_count", OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void sDy() {
        String LcF = LcF();
        if (!TextUtils.isEmpty(LcF)) {
            if (LcF.equals("zh-Hant")) {
                com.bytedance.sdk.component.utils.WAv.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), "zh", "tw");
            } else {
                com.bytedance.sdk.component.utils.WAv.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), LcF, null);
            }
            try {
                TTAdDislikeToast.Qhi();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.SdkSettings", th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean tP() {
        return this.f9160zc.Qhi("ad_revenue_enable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean vml() {
        return this.f9160zc.Qhi("bus_con_collect_arbitrage", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int wp() {
        return this.f9160zc.Qhi("perf_con_close_button_delay_check_time", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int xyz() {
        return this.f9160zc.Qhi("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int yN() {
        return this.f9160zc.Qhi("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int zc() {
        return this.f9160zc.Qhi("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int zjb() {
        int Qhi2 = this.f9160zc.Qhi("perf_con_webview_preload_cache", 0);
        if (Qhi2 < 0) {
            return 0;
        }
        if (Qhi2 > 5) {
            return 5;
        }
        int dI = dI();
        if (Qhi2 > dI) {
            return dI;
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String zn() {
        return this.Gm.Qhi("apm_url", "pangolin16.sgsnssdk.com");
    }

    private HzH() {
        this.ROR = Collections.synchronizedSet(new HashSet());
        this.WAv = new Gm();
        this.Gm = new com.bytedance.sdk.openadsdk.core.settings.Qhi();
        this.f9160zc = new iMK(new hpZ.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.6
            @Override // com.bytedance.sdk.openadsdk.core.settings.hpZ.Qhi
            public void Qhi() {
                hpZ.Qhi[] qhiArr;
                boolean unused = HzH.f9158hm = true;
                if (HzH.tP != null && HzH.tP.size() != 0 && (qhiArr = (hpZ.Qhi[]) HzH.tP.toArray()) != null) {
                    for (hpZ.Qhi qhi : qhiArr) {
                        qhi.Qhi();
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.hpZ.Qhi
            public void cJ() {
                if (HzH.tP != null && !HzH.tP.isEmpty()) {
                    Iterator it = HzH.tP.iterator();
                    while (it.hasNext()) {
                        ((hpZ.Qhi) it.next()).cJ();
                    }
                }
            }
        });
        this.ABk = new AtomicBoolean(false);
        this.iMK = false;
        this.pA = false;
        this.hpZ = 5000;
        this.HzH = 10;
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.EBS = anonymousClass11;
        this.bxS = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.12
            @Override // java.lang.Runnable
            public void run() {
                HzH.this.CJ(2);
                HzH.this.eG();
            }
        };
        this.CJ = new Tgh.cJ<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.13
            @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.cJ
            /* renamed from: Qhi */
            public ConcurrentHashMap<String, Integer> cJ(String str) {
                if (TextUtils.isEmpty(str)) {
                    return HzH.f9157ac;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int optInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && optInt >= 0 && optInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(optInt));
                        }
                    }
                } catch (JSONException e10) {
                    e10.getMessage();
                }
                return concurrentHashMap;
            }
        };
        this.Dww = new Tgh.cJ<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.cJ
            /* renamed from: Qhi */
            public Map<String, Integer> cJ(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap hashMap = new HashMap(jSONObject.length());
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int optInt = jSONObject.optInt(next, 100);
                            if (optInt >= 0 && optInt <= 100) {
                                hashMap.put(next, Integer.valueOf(optInt));
                            } else {
                                hashMap.put(next, 100);
                            }
                        }
                    }
                    return hashMap;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.ABk.cJ("get applog rate from sp failed:" + e10.getMessage());
                    return null;
                }
            }
        };
        this.CQU = new HashSet();
        this.pM = new Tgh.cJ<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.cJ
            /* renamed from: Qhi */
            public Set<String> cJ(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int optInt = jSONObject.optInt("applog_count");
                        if (optInt >= 2 && optInt <= 100) {
                            HzH.this.HzH = optInt;
                        }
                        int optInt2 = jSONObject.optInt("applog_interval");
                        if (optInt2 >= 100 && optInt2 <= 30000) {
                            HzH.this.hpZ = optInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                String string = jSONArray.getString(i10);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        e10.getMessage();
                    }
                }
                if (hashSet.size() == 0) {
                    return new HashSet(Arrays.asList(C1646h.CLICK_BEACON, "show", "insight_log", "mrc_show"));
                }
                return hashSet;
            }
        };
        this.Eh = new Tgh.cJ<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.cJ
            /* renamed from: Qhi */
            public JSONObject cJ(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.SdkSettings", th2.getMessage());
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return new JSONObject();
                }
                return jSONObject;
            }
        };
        this.f9159fl = new Tgh.cJ<com.bytedance.sdk.openadsdk.cJ.Qhi.pA>() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh.cJ
            /* renamed from: Qhi */
            public com.bytedance.sdk.openadsdk.cJ.Qhi.pA cJ(String str) {
                com.bytedance.sdk.openadsdk.cJ.Qhi.pA pAVar = new com.bytedance.sdk.openadsdk.cJ.Qhi.pA();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    pAVar.Qhi(jSONObject.optInt("enable_strategy", 0) == 1);
                    pAVar.Qhi(Qhi(jSONObject.optJSONObject("default")));
                    JSONObject optJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            pAVar.Qhi(next, Qhi(optJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return pAVar;
            }

            private pA.Qhi Qhi(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new pA.Qhi(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                Qhi2.registerReceiver(anonymousClass11, intentFilter, 4);
            } else {
                Qhi2.registerReceiver(anonymousClass11, intentFilter);
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.SdkSettings", "", e10);
        }
    }

    public static String ac(Context context) {
        SharedPreferences CJ;
        return (context == null || (CJ = CJ(context)) == null) ? "" : CJ.getString(cJ, "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int ABk(String str) {
        return Eh(String.valueOf(str)).Sf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int CJ() {
        return this.f9160zc.Qhi("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int CQU(String str) {
        return Eh(str).lG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Dww(String str) {
        return Eh(str).lB;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public cJ Eh(String str) {
        return ac.Qhi(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int Gm(String str) {
        return Eh(str).f9169zc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean HzH(String str) {
        return str == null || DeviceUtils.Sf(com.bytedance.sdk.openadsdk.core.HzH.Qhi()) == 0 || Eh(str).ABk == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean MQ(String str) {
        return Eh(str).qMt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int ROR(String str) {
        return Eh(str).kYc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Sf(String str) {
        return str == null || Eh(str).iMK == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Tgh(String str) {
        return Eh(str).ROR == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int WAv(String str) {
        return Eh(str).Gm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean aP(String str) {
        Set set = (Set) this.f9160zc.Qhi("privacy_fields_allowed", Collections.emptySet(), Tgh.cJ);
        if (set.isEmpty()) {
            int hpZ = js.hpZ();
            if (hpZ != 1) {
                if (hpZ != 2 && hpZ != 3) {
                    return false;
                }
                if (!"mcc".equals(str) && !"mnc".equals(str)) {
                    return false;
                }
            }
            return true;
        }
        return set.contains(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int bxS(String str) {
        return Eh(str).aP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean fl(String str) {
        int i10 = Eh(str).f9166fl;
        if (i10 != 1) {
            return i10 == 2 && com.bytedance.sdk.component.utils.hpZ.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi()) != 0;
        }
        return com.bytedance.sdk.component.utils.hpZ.CJ(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int hm(String str) {
        return str == null ? TTAdConstant.STYLE_SIZE_RADIO_3_2 : Eh(str).hpZ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean iMK(String str) {
        return ABk(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public JSONObject kYc(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(this.f9160zc.Qhi("core_settings", ""));
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            jSONObject.put("ad_slot_setting", Eh(str).dIT);
            return jSONObject;
        } catch (JSONException e11) {
            e = e11;
            jSONObject2 = jSONObject;
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
            return jSONObject2;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean pM(String str) {
        return com.bytedance.sdk.openadsdk.core.HzH.CJ().Eh(str).pA == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int qMt(String str) {
        return Eh(str).pM;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int tP(String str) {
        return Eh(str).MQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean zc(String str) {
        try {
            return Eh(str).bxS != null;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void cJ(int i10, boolean z10) {
        Context Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
        if (Qhi2 != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(Qhi2.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z10);
                intent.putExtra("_source", i10);
                Qhi2.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean CJ(String str) {
        return Eh(str).NFd;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int EBS(String str) {
        return Eh(str).Eh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void Qhi() {
        File file;
        File dataDir;
        try {
            ac.Qhi();
            this.f9160zc.ac();
            this.WAv.ac();
            this.Gm.ac();
            Context Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                dataDir = Qhi2.getDataDir();
                file = new File(dataDir, "shared_prefs");
            } else {
                file = new File(Qhi2.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs");
            }
            File file2 = new File(file, "tt_sdk_settings.xml");
            if (file2.exists() && file2.isFile()) {
                String replace = file2.getName().replace(".xml", "");
                if (i10 >= 24) {
                    Qhi2.deleteSharedPreferences(replace);
                    return;
                }
                Qhi2.getSharedPreferences(replace, 0).edit().clear().apply();
                com.bytedance.sdk.component.utils.ROR.ac(file2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean hpZ(String str) {
        return Eh(str).EBS == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int pA(String str) {
        return Eh(str).WAv;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public String ac() {
        return this.f9160zc.Qhi("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void CJ(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10) {
        Qhi(i10, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int NFd() {
        int Qhi2 = this.f9160zc.Qhi("fetch_tpl_second", 0);
        if (Qhi2 <= 0) {
            return 0;
        }
        return Qhi2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean ac(String str) {
        return Eh(str).f9165ac == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int ac(int i10) {
        return Eh(String.valueOf(i10)).f9167hm;
    }

    public static int cJ(Context context) {
        SharedPreferences CJ;
        if (context == null || (CJ = CJ(context)) == null) {
            return -2;
        }
        if ((CJ.getInt("IABTCF_CmpSdkID", SlideAtom.USES_MASTER_SLIDE_ID) == Integer.MIN_VALUE && CJ.getInt("IABTCF_CmpSdkVersion", SlideAtom.USES_MASTER_SLIDE_ID) == Integer.MIN_VALUE) ? false : true) {
            return CJ.getInt("IABTCF_gdprApplies", -1);
        }
        return -2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public synchronized void cJ() {
        SystemClock.elapsedRealtime();
        boolean z10 = !this.iMK;
        this.WAv.Qhi(this.iMK);
        this.Gm.Qhi(this.iMK);
        this.f9160zc.Qhi(this.iMK);
        ac.Qhi(z10);
        com.bytedance.sdk.openadsdk.core.hm.cJ().CJ(Ohm());
        this.iMK = true;
        SystemClock.elapsedRealtime();
        if (z10) {
            com.bytedance.sdk.openadsdk.core.iMK.cJ().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.7
                @Override // java.lang.Runnable
                public void run() {
                    if (pA.Qhi()) {
                        HzH.this.CJ(1);
                        HzH.this.eG();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi().cJ();
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void Qhi(JSONObject jSONObject, Tgh.Qhi qhi) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        iMK imk = this.f9160zc;
        String str = Tgh;
        String Qhi2 = imk.Qhi("dyn_draw_engine_url", str);
        final String optString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(Qhi2) && !TextUtils.isEmpty(optString) && !optString.equals(Qhi2)) {
            com.bytedance.sdk.openadsdk.core.iMK.cJ().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.HzH.8
                @Override // java.lang.Runnable
                public void run() {
                    if (!TextUtils.equals(HzH.this.f9160zc.Qhi("dyn_draw_engine_url", HzH.Tgh), optString)) {
                        return;
                    }
                    com.bytedance.sdk.component.adexpress.Qhi.cJ.Tgh.cJ().ac();
                }
            }, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
        }
        qhi.Qhi("dyn_draw_engine_url", optString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void cJ(JSONObject jSONObject, Tgh.Qhi qhi) {
        if (jSONObject.has("is_gdpr_user")) {
            int i10 = -1;
            int optInt = jSONObject.optInt("is_gdpr_user", -1);
            if (optInt == -1 || optInt == 1 || optInt == 0) {
                i10 = optInt;
            }
            qhi.Qhi("isGdprUser", i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int Qhi(String str) {
        if (str == null) {
            return 0;
        }
        return com.bytedance.sdk.openadsdk.core.HzH.CJ().Eh(str).tP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int Qhi(String str, boolean z10) {
        if (str == null) {
            return ac(z10);
        }
        int i10 = Eh(str).CQU;
        return i10 != -1 ? i10 : ac(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int cJ(String str) {
        Integer num;
        Map map = (Map) this.f9160zc.Qhi("perf_con_stats_rate", f9157ac, this.CJ);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int Qhi(int i10) {
        return Eh(String.valueOf(i10)).Jma;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public int cJ(int i10) {
        return Eh(String.valueOf(i10)).cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void Qhi(long j10) {
        this.f9160zc.Qhi().Qhi("last_req_time", j10).Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void Qhi(@TTSdkSettings.FETCH_REQUEST_SOURCE int i10, boolean z10) {
        if (!com.bytedance.sdk.openadsdk.core.iMK.fl() && i10 != 1 && i10 != 2) {
            if (z10) {
                this.kYc = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.hm.cJ().CJ())) {
                return;
            }
            if (this.kYc) {
                this.kYc = false;
                if (!z10) {
                    z10 = true;
                }
            }
            long yy = yy();
            long currentTimeMillis = System.currentTimeMillis();
            long Ki = Ki();
            long j10 = currentTimeMillis - yy;
            if (!z10 && j10 < Ki) {
                com.bytedance.sdk.openadsdk.core.Tgh.Qhi.Qhi();
            } else if (!pA.Qhi()) {
                cJ(i10, z10);
            } else if (this.ABk.compareAndSet(false, true)) {
                lG.cJ(new pA(this, this.f9160zc, this.WAv, this.Gm));
                com.bytedance.sdk.openadsdk.core.iMK.cJ().removeCallbacks(this.bxS);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.pA.Qhi
    public void Qhi(boolean z10) {
        this.ABk.set(false);
        eG();
        if (z10) {
            SNp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public void Qhi(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.EBS, intentFilter, 4);
            } else {
                context.registerReceiver(this.EBS, intentFilter);
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.SdkSettings", "", e10);
        }
        if (Dq()) {
            CJ(1);
            eG();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ROR
    public boolean Qhi(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        if (cryptDataScene != PangleEncryptConstant.CryptDataScene.GET_ADS && cryptDataScene != PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN) {
            if (cryptDataScene == PangleEncryptConstant.CryptDataScene.APP_LOG) {
                return this.f9160zc.Qhi("perf_con_crypt_V4_applog", false);
            }
            return this.f9160zc.Qhi("perf_con_crypt_V4", false);
        }
        return this.f9160zc.Qhi("perf_con_crypt_V4_get_ad", false);
    }

    public static void Qhi(hpZ.Qhi qhi) {
        ConcurrentLinkedQueue<hpZ.Qhi> concurrentLinkedQueue = tP;
        if (concurrentLinkedQueue.contains(qhi)) {
            return;
        }
        concurrentLinkedQueue.add(qhi);
    }
}

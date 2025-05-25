package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.settings.Tgh;
import com.bytedance.sdk.openadsdk.core.settings.hpZ;
import com.bytedance.sdk.openadsdk.utils.Dww;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.Api;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import lib.zj.office.fc.hpsf.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsDefaultRepository.java */
/* loaded from: classes.dex */
public class iMK extends hpZ {
    static final ArrayList<String> CJ = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", FacebookMediationAdapter.KEY_ID, "ru", "ar", "fr", "de", "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));

    /* renamed from: ac  reason: collision with root package name */
    public boolean f9178ac;

    /* renamed from: fl  reason: collision with root package name */
    private Set<String> f9179fl;

    public iMK(hpZ.Qhi qhi) {
        super("tt_sdk_settings.prop", qhi);
        this.f9179fl = Collections.synchronizedSet(new HashSet());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.Tgh
    public void Qhi(JSONObject jSONObject) {
        int optInt;
        Tgh.Qhi Qhi = Qhi();
        JSONObject fl2 = HzH.YD().fl();
        JSONObject optJSONObject = jSONObject.optJSONObject("digest");
        this.f9178ac = (optJSONObject == null || fl2 == null || !optJSONObject.toString().equals(fl2.toString())) ? false : true;
        if (optJSONObject != null) {
            Qhi.Qhi("digest", optJSONObject.toString());
        } else {
            Qhi.Qhi("digest");
        }
        Qhi.Qhi("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            long optLong = jSONObject.optLong("req_inter_min", 10L) * 60 * 1000;
            if (optLong < 0 || optLong > 86400000) {
                optLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            Qhi.Qhi("req_inter_min", optLong);
        }
        if (jSONObject.has("lp_new_style")) {
            Qhi.Qhi("landingpage_new_style", jSONObject.optInt("lp_new_style", Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
        if (jSONObject.has("blank_detect_rate")) {
            int optInt2 = jSONObject.optInt("blank_detect_rate", 30);
            Qhi.Qhi("blank_detect_rate", (optInt2 < 0 || optInt2 > 100) ? 30 : 30);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("feq_policy");
        if (optJSONObject2 != null) {
            if (optJSONObject2.has("duration")) {
                Qhi.Qhi("duration", optJSONObject2.optLong("duration") * 1000);
            }
            if (optJSONObject2.has("max")) {
                Qhi.Qhi("max", optJSONObject2.optInt("max"));
            }
        }
        if (jSONObject.has("vbtt")) {
            Qhi.Qhi("vbtt", jSONObject.optInt("vbtt", 5));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("abtest");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("version")) {
                Qhi.Qhi("ab_test_version", optJSONObject3.optString("version"));
            }
            if (optJSONObject3.has("param")) {
                Qhi.Qhi("ab_test_param", optJSONObject3.optString("param"));
            }
        } else {
            HzH.YD().ROR();
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("log_rate_conf");
        if (optJSONObject4 != null && optJSONObject4.has("global_rate")) {
            Qhi.Qhi("global_rate", (float) optJSONObject4.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            Qhi.Qhi("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            Qhi.Qhi("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            Qhi.Qhi("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("app_log_url")) {
            Qhi.Qhi("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("coppa")) {
            int optInt3 = jSONObject.optInt("coppa", -99);
            com.bytedance.sdk.openadsdk.core.hm.cJ().CJ(optInt3);
            Qhi.Qhi("coppa", optInt3);
        }
        if (jSONObject.has("privacy_url")) {
            Qhi.Qhi("policy_url", jSONObject.optString("privacy_url"));
        }
        if (jSONObject.has("consent_url")) {
            Qhi.Qhi("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            Qhi.Qhi("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            Qhi.Qhi("dc", jSONObject.optString("dc"));
        }
        HzH.YD().Qhi(jSONObject, Qhi);
        HzH.YD().cJ(jSONObject, Qhi);
        if (jSONObject.has("if_both_open")) {
            Qhi.Qhi("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            Qhi.Qhi("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            Qhi.Qhi("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            Qhi.Qhi("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("app_common_config");
        if (optJSONObject5 != null) {
            if (optJSONObject5.has("force_language")) {
                String optString = optJSONObject5.optString("force_language");
                if (!TextUtils.isEmpty(optString) && CJ.contains(optString)) {
                    Qhi.Qhi("force_language", optString);
                }
            }
            if (optJSONObject5.has("fetch_tpl_timeout_ctrl")) {
                Qhi.Qhi("fetch_tpl_timeout_ctrl", optJSONObject5.optInt("fetch_tpl_timeout_ctrl", 3000));
            }
            if (optJSONObject5.has("fetch_tpl_second")) {
                Qhi.Qhi("fetch_tpl_second", optJSONObject5.optInt("fetch_tpl_second", 0));
            }
            if (optJSONObject5.has("disable_rotate_banner_on_dislike")) {
                Qhi.Qhi("disable_rotate_banner_on_dislike", optJSONObject5.optInt("disable_rotate_banner_on_dislike", Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
            if (optJSONObject5.has("support_gzip")) {
                Qhi.Qhi("support_gzip", optJSONObject5.optBoolean("support_gzip", false));
            }
            if (optJSONObject5.has("aes_key")) {
                Qhi.Qhi("aes_key", optJSONObject5.optString("aes_key"));
            }
            if (optJSONObject5.has("support_rtl")) {
                Qhi.Qhi("support_rtl", optJSONObject5.optBoolean("support_rtl", false));
            }
            if (optJSONObject5.has("ad_revenue_enable")) {
                Qhi.Qhi("ad_revenue_enable", optJSONObject5.optBoolean("ad_revenue_enable", false));
            }
            if (optJSONObject5.has("gecko_hosts")) {
                try {
                    this.f9179fl.clear();
                    JSONArray optJSONArray = optJSONObject5.optJSONArray("gecko_hosts");
                    if (optJSONArray != null && optJSONArray.length() != 0) {
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            this.f9179fl.add(optJSONArray.getString(i10));
                        }
                    }
                    this.f9179fl = Qhi(this.f9179fl);
                    Qhi.Qhi("gecko_hosts", optJSONArray.toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ABk.cJ("GeckoLog: settings json error ".concat(String.valueOf(th2)));
                }
            }
        }
        if (jSONObject.has("read_video_from_cache")) {
            Qhi.Qhi("read_video_from_cache", jSONObject.optInt("read_video_from_cache", 1));
        }
        ac.Qhi(jSONObject.optJSONArray("ad_slot_conf_list"));
        JSONObject optJSONObject6 = jSONObject.optJSONObject("privacy");
        if (optJSONObject6 != null) {
            if (optJSONObject6.has("ad_enable")) {
                Qhi.Qhi("privacy_ad_enable", optJSONObject6.optInt("ad_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
            if (optJSONObject6.has("personalized_ad")) {
                Qhi.Qhi("privacy_personalized_ad", optJSONObject6.optInt("personalized_ad", Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
            if (optJSONObject6.has("sladar_enable")) {
                Qhi.Qhi("privacy_sladar_enable", optJSONObject6.optInt("sladar_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
            if (optJSONObject6.has("app_log_enable")) {
                Qhi.Qhi("privacy_app_log_enable", optJSONObject6.optInt("app_log_enable", Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
            if (optJSONObject6.has("debug_unlock")) {
                Qhi.Qhi("privacy_debug_unlock", optJSONObject6.optInt("debug_unlock", Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
            if (optJSONObject6.has("fields_allowed")) {
                String optString2 = optJSONObject6.optString("fields_allowed", "");
                if (!TextUtils.isEmpty(optString2)) {
                    Qhi.Qhi("privacy_fields_allowed", optString2);
                } else {
                    Qhi.Qhi("privacy_fields_allowed");
                }
            }
        }
        if (jSONObject.has("video_cache_config")) {
            Qhi.Qhi("video_cache_config", jSONObject.optString("video_cache_config"));
        }
        if (jSONObject.has("loaded_recall_time")) {
            int optInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (optInt4 != 0 && optInt4 != 1) {
                optInt4 = 0;
            }
            Qhi.Qhi("loadedCallbackOpportunity", optInt4);
        }
        if (jSONObject.has("load_strategy")) {
            int optInt5 = jSONObject.optInt("load_strategy", 0);
            if (optInt5 != 0 && optInt5 != 1) {
                optInt5 = 0;
            }
            Qhi.Qhi("load_callback_strategy", optInt5);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            int optInt6 = jSONObject.optInt("splash_video_load_strategy", 0);
            Qhi.Qhi("splash_video_load_strategy", (optInt6 < 0 || optInt6 > 3) ? 0 : 0);
        }
        if (jSONObject.has("support_mem_dynamic")) {
            int optInt7 = jSONObject.optInt("support_mem_dynamic", 0);
            if (optInt7 != 0 && optInt7 != 1) {
                optInt7 = 0;
            }
            Qhi.Qhi("support_mem_dynamic", optInt7);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            Qhi.Qhi("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("bus_con");
        if (optJSONObject7 != null) {
            if (optJSONObject7.has("bus_con_send_log_type")) {
                Qhi.Qhi("bus_con_send_log_type", optJSONObject7.optInt("bus_con_send_log_type", 1));
            }
            if (optJSONObject7.has("bus_con_sec_type")) {
                Qhi.Qhi("bus_con_sec_type", optJSONObject7.optInt("bus_con_sec_type", Api.BaseClientBuilder.API_PRIORITY_OTHER));
            }
            if (optJSONObject7.has("bus_con_dislike_report_raw")) {
                Qhi.Qhi("bus_con_dislike_report_raw", optJSONObject7.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (optJSONObject7.has("bus_con_adshow_check_enable")) {
                Qhi.Qhi("bus_con_adshow_check_enable", optJSONObject7.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (optJSONObject7.has("bus_con_tnc_interval")) {
                Qhi.Qhi("bus_con_tnc_interval", optJSONObject7.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (optJSONObject7.has("bus_con_token_thread_count")) {
                Qhi.Qhi("bus_con_token_thread_count", optJSONObject7.optInt("bus_con_token_thread_count", 4));
            }
            if (optJSONObject7.has("bus_con_video_keep_screen_on")) {
                Qhi.Qhi("bus_con_video_keep_screen_on", optJSONObject7.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (optJSONObject7.has("bus_con_auto_click_delay")) {
                Qhi.Qhi("bus_con_auto_click_delay", optJSONObject7.optInt("bus_con_auto_click_delay", 3000));
            }
            if (optJSONObject7.has("bus_con_express_host")) {
                Qhi.Qhi("bus_con_express_host", optJSONObject7.optString("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/"));
            }
            if (optJSONObject7.has("bus_con_rewardedfull_link")) {
                Qhi.Qhi("bus_con_rewardedfull_link", optJSONObject7.optInt("bus_con_rewardedfull_link", 0));
            }
            if (optJSONObject7.has("bus_con_check_clz")) {
                Qhi.Qhi("bus_con_check_clz", optJSONObject7.optString("bus_con_check_clz", ""));
            }
            if (optJSONObject7.has("bus_con_url_check")) {
                Qhi.Qhi("bus_con_url_check", optJSONObject7.optInt("bus_con_url_check", 1));
            }
            if (optJSONObject7.has("bus_con_behavior_count")) {
                Qhi.Qhi("bus_con_behavior_count", optJSONObject7.optInt("bus_con_behavior_count", OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT));
            }
            if (optJSONObject7.has("bus_con_collect_arbitrage")) {
                Qhi.Qhi("bus_con_collect_arbitrage", optJSONObject7.optBoolean("bus_con_collect_arbitrage", false));
            }
            if (optJSONObject7.has("bus_con_arbitrage_loading_timeout")) {
                Qhi.Qhi("bus_con_arbitrage_loading_timeout", optJSONObject7.optInt("bus_con_arbitrage_loading_timeout", Constants.CP_MAC_ROMAN));
            }
            if (optJSONObject7.has("bus_con_arbitrage_loading_alpha")) {
                Qhi.Qhi("bus_con_arbitrage_loading_alpha", (float) optJSONObject7.optDouble("bus_con_arbitrage_loading_alpha", 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject8 = jSONObject.optJSONObject("perf_con");
                if (optJSONObject8 != null) {
                    if (optJSONObject8.has("perf_con_stats_rate")) {
                        String optString3 = optJSONObject8.optString("perf_con_stats_rate");
                        if (!TextUtils.isEmpty(optString3)) {
                            Qhi.Qhi("perf_con_stats_rate", optString3);
                        }
                    }
                    if (optJSONObject8.has("perf_con_applog_send")) {
                        String optString4 = optJSONObject8.optString("perf_con_applog_send");
                        if (!TextUtils.isEmpty(optString4)) {
                            Qhi.Qhi("perf_con_applog_send", optString4);
                        }
                    }
                    if (optJSONObject8.has("perf_con_apm_native")) {
                        Qhi.Qhi("perf_con_apm_native", optJSONObject8.optInt("perf_con_apm_native"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache")) {
                        Qhi.Qhi("perf_con_webview_preload_cache", optJSONObject8.optInt("perf_con_webview_preload_cache"));
                    }
                    if (optJSONObject8.has("perf_con_webview_preload_cache_v3")) {
                        Qhi.Qhi("perf_con_webview_preload_cache_v3", optJSONObject8.optInt("perf_con_webview_preload_cache_v3"));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count")) {
                        Qhi.Qhi("perf_con_webview_cache_count", optJSONObject8.optInt("perf_con_webview_cache_count", 0));
                    }
                    if (optJSONObject8.has("perf_con_webview_cache_count_v3")) {
                        Qhi.Qhi("perf_con_webview_cache_count_v3", optJSONObject8.optInt("perf_con_webview_cache_count_v3", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_stack_size") && (optInt = optJSONObject8.optInt("perf_con_thread_stack_size")) >= -524288 && optInt <= 0) {
                        Qhi.Qhi("perf_con_thread_stack_size", optInt);
                    }
                    if (optJSONObject8.has("perf_con_use_new_thread_pool")) {
                        Qhi.Qhi("perf_con_use_new_thread_pool", optJSONObject8.optInt("perf_con_use_new_thread_pool", 0));
                    }
                    if (optJSONObject8.has("perf_con_thread_pool_config")) {
                        String optString5 = optJSONObject8.optString("perf_con_thread_pool_config");
                        if (!TextUtils.isEmpty(optString5)) {
                            Qhi.Qhi("perf_con_thread_pool_config", optString5);
                        }
                    }
                    if (optJSONObject8.has("perf_con_is_new_net_thread")) {
                        Qhi.Qhi("perf_con_is_new_net_thread", optJSONObject8.optInt("perf_con_is_new_net_thread", 0));
                    }
                    if (optJSONObject8.has("perf_con_use_prop")) {
                        Dww.Qhi(optJSONObject8.optInt("perf_con_use_prop", 1));
                    }
                    if (optJSONObject8.has("perf_con_adlog_expire_time")) {
                        Qhi.Qhi("perf_con_adlog_expire_time", optJSONObject8.optLong("perf_con_adlog_expire_time"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_ad")) {
                        Qhi.Qhi("perf_con_adlog_turn_off_retry_ad", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_ad"));
                    }
                    if (optJSONObject8.has("perf_con_adlog_turn_off_retry_stats")) {
                        Qhi.Qhi("perf_con_adlog_turn_off_retry_stats", optJSONObject8.optLong("perf_con_adlog_turn_off_retry_stats"));
                    }
                    if (optJSONObject8.has("perf_con_applog_rate")) {
                        Qhi.Qhi("perf_con_applog_rate", optJSONObject8.optString("perf_con_applog_rate"));
                    }
                    if (optJSONObject8.has("perf_con_track_url_strategy")) {
                        Qhi.Qhi("perf_con_track_url_strategy", optJSONObject8.optString("perf_con_track_url_strategy"));
                    }
                    if (optJSONObject8.has("perf_con_drawable_code")) {
                        Qhi.Qhi("perf_con_drawable_code", optJSONObject8.optInt("perf_con_drawable_code", 0));
                    }
                    if (optJSONObject8.has("perf_con_close_button_delay_check_time")) {
                        Qhi.Qhi("perf_con_close_button_delay_check_time", optJSONObject8.optInt("perf_con_close_button_delay_check_time", -1));
                    }
                    if (optJSONObject8.has("perf_con_drop2rt_skip_label_list")) {
                        Qhi.Qhi("perf_con_drop2rt_skip_label_list", optJSONObject8.optString("perf_con_drop2rt_skip_label_list"));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4_get_ad")) {
                        Qhi.Qhi("perf_con_crypt_V4_get_ad", optJSONObject8.optBoolean("perf_con_crypt_V4_get_ad", false));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4_applog")) {
                        Qhi.Qhi("perf_con_crypt_V4_applog", optJSONObject8.optBoolean("perf_con_crypt_V4_applog", false));
                    }
                    if (optJSONObject8.has("perf_con_crypt_V4")) {
                        Qhi.Qhi("perf_con_crypt_V4", optJSONObject8.optBoolean("perf_con_crypt_V4", false));
                    }
                }
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.ABk.Qhi("SettingsDefaultRepository", th3.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("app_common_config", optJSONObject5);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("SettingsDefaultRepository", "coreSettingJson", e10.getMessage());
        }
        Qhi.Qhi("core_settings", jSONObject2.toString());
        if (jSONObject.has("dual_event_url")) {
            Qhi.Qhi("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        Qhi.Qhi();
        HzH.YD().sDy();
        CJ();
    }

    public static Set<String> Qhi(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}

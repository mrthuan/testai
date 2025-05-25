package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.cJ.cJ;
import com.bytedance.sdk.openadsdk.multipro.cJ.Qhi;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: WebHelper.java */
/* loaded from: classes.dex */
public class lB {
    private static boolean Qhi = false;

    public static void Qhi(boolean z10) {
        Qhi = z10;
    }

    public static boolean cJ(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tP tPVar, int i10, String str2, boolean z10) {
        try {
            Intent Qhi2 = Qhi(context, str, tPVar, i10, (PAGNativeAd) null, (PangleAd) null, str2, z10, true);
            if (!(context instanceof Activity)) {
                Qhi2.addFlags(268435456);
            }
            context.startActivity(Qhi2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static com.bytedance.sdk.openadsdk.Gm.Qhi.cJ Qhi(int i10, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJVar = new com.bytedance.sdk.openadsdk.Gm.Qhi.cJ();
        cJVar.Qhi(cJ.Qhi.Qhi);
        cJVar.Qhi(tPVar);
        cJVar.cJ(js.Qhi(tPVar));
        cJVar.Qhi(i10);
        cJVar.Qhi(false);
        cJVar.cJ(tPVar.ip());
        return cJVar;
    }

    public static boolean Qhi(Context context, com.bytedance.sdk.openadsdk.core.model.tP tPVar, int i10, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl flVar, boolean z10, int i11) {
        String Qhi2;
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(-1, tPVar));
        if (context != null && tPVar != null && i10 != -1) {
            com.bytedance.sdk.openadsdk.core.model.zc ReL = tPVar.ReL();
            HashMap hashMap = new HashMap();
            if (tPVar.nR() == 0) {
                hashMap.put("dpl_probability_jump", Boolean.valueOf(i11 >= 11));
            }
            if (i11 != 0 && tPVar.IC()) {
                hashMap.put("dsp_click_type", Integer.valueOf(i11));
            }
            if (ReL != null && !TextUtils.isEmpty(ReL.Qhi())) {
                if (Qhi(context, tPVar, i10, str, z10, hashMap)) {
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(2, tPVar));
                    return true;
                }
                if (ReL.ac() != 2 || tPVar.gga() == 5 || tPVar.gga() == 15) {
                    if (ReL.ac() == 1 && !TextUtils.isEmpty(ReL.cJ())) {
                        Qhi2 = ReL.cJ();
                    } else {
                        Qhi2 = Qhi(tPVar);
                    }
                } else if (flVar != null) {
                    if (!flVar.Qhi()) {
                        if (flVar.fl()) {
                            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, "open_fallback_url", hashMap);
                            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(3, tPVar));
                            return true;
                        }
                        Qhi2 = Qhi(ReL, tPVar);
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(3, tPVar));
                    } else {
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, "open_fallback_url", hashMap);
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(3, tPVar));
                        return true;
                    }
                } else {
                    Qhi2 = Qhi(ReL, tPVar);
                }
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, "open_fallback_url", hashMap);
            } else {
                Qhi2 = Qhi(tPVar);
            }
            String str2 = Qhi2;
            if (tPVar.nR() == 0 && !TextUtils.isEmpty(str2) && str2.contains("play.google.com/store")) {
                String substring = str2.substring(str2.indexOf("?id=") + 4);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(4, tPVar));
                return com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.ac.Qhi(context, str2, substring, str, tPVar);
            }
            return Qhi(context, tPVar, i10, pAGNativeAd, pangleAd, str, z10, str2);
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(1, tPVar));
        return false;
    }

    private static String Qhi(com.bytedance.sdk.openadsdk.core.model.zc zcVar, com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (!TextUtils.isEmpty(zcVar.cJ())) {
            return zcVar.cJ();
        }
        return Qhi(tPVar);
    }

    private static String Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (tPVar.IC() && tPVar.cJP() != null) {
            return tPVar.cJP().hm();
        }
        return tPVar.YB();
    }

    public static boolean Qhi(Context context, com.bytedance.sdk.openadsdk.core.model.tP tPVar, int i10, String str, boolean z10, Map<String, Object> map) {
        if (tPVar == null) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.model.zc ReL = tPVar.ReL();
        if (ReL != null && !TextUtils.isEmpty(ReL.Qhi())) {
            if (map == null) {
                map = new HashMap<>();
            }
            String Qhi2 = ReL.Qhi();
            Uri parse = Uri.parse(Qhi2);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (js.Sf(context)) {
                js.cJ cJ = js.cJ(context, intent);
                if (cJ.cJ > 0) {
                    if (HzH.CJ().Sf()) {
                        js.Qhi(tPVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map.put("can_query_install", 1);
                    map.put("matched_count", Integer.valueOf(cJ.cJ));
                    map.put(InMobiNetworkValues.URL, Qhi2);
                    ComponentName componentName = cJ.Qhi;
                    if (componentName != null) {
                        intent.setComponent(componentName);
                    }
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, "open_url_app", map);
                    try {
                        context.startActivity(intent);
                        com.bytedance.sdk.openadsdk.cJ.ABk.Qhi().Qhi(map).Qhi(tPVar, str);
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi("dp_start_act_success", tPVar, str, map);
                        return true;
                    } catch (Exception e10) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("exception", e10.getMessage());
                            jSONObject.put("intent", intent.toString());
                            jSONObject.put("can_query_install", 1);
                        } catch (Exception unused) {
                        }
                        fl.Qhi(tPVar, str, -4, jSONObject);
                        if (!HzH.CJ().Sf()) {
                            Qhi(context, tPVar.YB(), tPVar, i10, str, z10);
                            com.bytedance.sdk.component.utils.ABk.Qhi("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", e10);
                        }
                        return false;
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("intent", intent.toString());
                    jSONObject2.put("can_query_install", 1);
                } catch (Exception unused2) {
                }
                fl.Qhi(tPVar, str, -3, jSONObject2);
            } else {
                try {
                    if (HzH.CJ().Sf()) {
                        js.Qhi(tPVar, str);
                    }
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    map.put("can_query_install", 0);
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, "open_url_app", map);
                    context.startActivity(intent);
                    com.bytedance.sdk.openadsdk.cJ.ABk.Qhi().Qhi(map).Qhi(tPVar, str);
                    return true;
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
        fl.Qhi(tPVar, str, ReL == null ? -1 : -2, ReL != null ? ReL.CJ() : null);
        return false;
    }

    public static boolean Qhi(Context context, com.bytedance.sdk.openadsdk.core.model.tP tPVar, int i10, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str, boolean z10, String str2) {
        if (TextUtils.isEmpty(str2) && !com.bytedance.sdk.openadsdk.core.model.bxS.cJ(tPVar)) {
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(Qhi(5, tPVar));
            return false;
        }
        int ip2 = tPVar.ip();
        if (ip2 != 2 && ip2 != 8) {
            com.bytedance.sdk.component.utils.cJ.Qhi(context, Qhi(context, str2, tPVar, i10, pAGNativeAd, pangleAd, str, z10), null);
            Qhi = false;
            return true;
        }
        return com.bytedance.sdk.openadsdk.utils.MQ.Qhi(context, str2, tPVar, cJ.Qhi.Qhi);
    }

    public static boolean Qhi(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tP tPVar, int i10, String str2, boolean z10) {
        try {
            context.startActivity(Qhi(context, str, tPVar, i10, (PAGNativeAd) null, (PangleAd) null, str2, z10));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Intent Qhi(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tP tPVar, int i10, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z10) {
        return Qhi(context, str, tPVar, i10, pAGNativeAd, pangleAd, str2, z10, false);
    }

    private static Intent Qhi(Context context, String str, com.bytedance.sdk.openadsdk.core.model.tP tPVar, int i10, PAGNativeAd pAGNativeAd, PangleAd pangleAd, String str2, boolean z10, boolean z11) {
        Intent intent;
        if (!z11 && com.bytedance.sdk.openadsdk.core.model.bxS.cJ(tPVar) && (pAGNativeAd != null || pangleAd != null)) {
            intent = new Intent(context, TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", Qhi(tPVar, z10));
            String fl2 = com.bytedance.sdk.openadsdk.core.model.bxS.fl(tPVar);
            if (!TextUtils.isEmpty(fl2)) {
                if (fl2.contains("?")) {
                    str = fl2.concat("&orientation=portrait");
                } else {
                    str = fl2.concat("?orientation=portrait");
                }
            }
        } else {
            intent = (z11 || tPVar.ip() != 3 || !(tPVar.hpZ() == 2 || (tPVar.hpZ() == 1 && Qhi)) || tPVar.GN()) ? new Intent(context, TTLandingPageActivity.class) : new Intent(context, TTVideoLandingPageLink2Activity.class);
        }
        intent.putExtra(InMobiNetworkValues.URL, str);
        intent.putExtra("gecko_id", tPVar.Ri());
        intent.putExtra("web_title", tPVar.dVA());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", tPVar.HLI());
        intent.putExtra("log_extra", tPVar.EGK());
        com.bytedance.sdk.openadsdk.multipro.cJ.Qhi qhi = null;
        intent.putExtra("icon_url", tPVar.dIT() == null ? null : tPVar.dIT().Qhi());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i10);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, tPVar.mZ().toString());
        } else {
            Dww.Qhi().Tgh();
            Dww.Qhi().Qhi(tPVar);
        }
        if (tPVar.gga() == 5 || tPVar.gga() == 15 || tPVar.gga() == 50) {
            if (pAGNativeAd != null) {
                if (pAGNativeAd instanceof Qhi.InterfaceC0135Qhi) {
                    qhi = ((Qhi.InterfaceC0135Qhi) pAGNativeAd).Tgh();
                } else if (pAGNativeAd instanceof com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.Qhi) {
                    qhi = ((com.bytedance.sdk.openadsdk.apiImpl.feed.feedexpress.Qhi) pAGNativeAd).cJ();
                }
                if (qhi != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, qhi.Qhi().toString());
                }
            }
            if ((pangleAd instanceof com.bytedance.sdk.openadsdk.core.bannerexpress.ac) && (qhi = ((com.bytedance.sdk.openadsdk.core.bannerexpress.ac) pangleAd).ac()) != null) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, qhi.Qhi().toString());
            }
            if (qhi != null) {
                intent.putExtra("video_is_auto_play", qhi.CJ);
                if (com.bytedance.sdk.component.utils.ABk.CJ()) {
                    qhi.Qhi().toString();
                }
            }
        }
        return intent;
    }

    private static boolean Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar, boolean z10) {
        if (z10 && tPVar != null && tPVar.ip() == 4) {
            return com.bytedance.sdk.openadsdk.core.model.bxS.cJ(tPVar);
        }
        return false;
    }
}

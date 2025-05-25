package com.bytedance.sdk.openadsdk.component.CJ;

import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.Gm.Qhi.fl;
import com.bytedance.sdk.openadsdk.Gm.ac;
import com.bytedance.sdk.openadsdk.core.model.CQU;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.Jma;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdReport.java */
/* loaded from: classes.dex */
public class cJ {
    public static void Qhi(final int i10, final int i11) {
        ac.Qhi("openad_load_ad_timeout", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.component.CJ.cJ.1
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i10);
                jSONObject.put("user_timeout_time", i11);
                return fl.cJ().Qhi("openad_load_ad_timeout").cJ(jSONObject.toString());
            }
        });
    }

    public static void cJ(tP tPVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", tP.fl(tPVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e10) {
            ABk.Qhi("TTAppOpenAdReport", "reportCacheLoss json error", e10);
        }
        com.bytedance.sdk.openadsdk.cJ.ac.CJ(tPVar, "cache_loss", jSONObject);
    }

    public static void Qhi(tP tPVar, int i10, int i11, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            Qhi(jSONObject, tPVar);
            jSONObject.put("openad_creative_type", tP.fl(tPVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("skip_time", i10);
            jSONObject.put("skip_show_time", i11);
            jSONObject.put("total_time", f10);
        } catch (JSONException e10) {
            ABk.Qhi("TTAppOpenAdReport", "reportSkip json error", e10);
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, "skip", i10, jSONObject);
    }

    public static void cJ(tP tPVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", tPVar.FQ().fl());
            jSONObject.put("video_duration", tPVar.FQ().Tgh());
            jSONObject.put("order", z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, "download_video_duration", j10, jSONObject);
    }

    public static void Qhi(tP tPVar, long j10, float f10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            Qhi(jSONObject, tPVar);
            jSONObject.put("openad_creative_type", tP.fl(tPVar) ? "video_normal_ad" : "image_normal_ad");
            if (z10) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put("video_percent", (int) (((j10 * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e10) {
            ABk.Qhi("TTAppOpenAdReport", "reportDestroy json error", e10);
        }
        com.bytedance.sdk.openadsdk.cJ.ac.CJ(tPVar, "destroy", jSONObject);
    }

    public static void Qhi(tP tPVar) {
        com.bytedance.sdk.openadsdk.cJ.ac.CJ(tPVar, "cache_expire", (JSONObject) null);
    }

    public static void Qhi(tP tPVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("order", z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, "download_image_duration", j10, jSONObject);
    }

    public static void Qhi(tP tPVar, int i10, CQU cqu) {
        JSONObject jSONObject = new JSONObject();
        long j10 = 0;
        try {
            jSONObject.put("openad_creative_type", tP.fl(tPVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i10);
            if (cqu != null) {
                cqu.cJ(Jma.Qhi());
                Qhi(jSONObject, tPVar);
                jSONObject.put("client_start_time", cqu.cJ());
                jSONObject.put("sever_time", cqu.CJ());
                jSONObject.put("network_time", cqu.ac());
                jSONObject.put("client_end_time", cqu.fl());
                jSONObject.put("download_resource_duration", cqu.ROR());
                jSONObject.put("resource_source", cqu.Sf());
                jSONObject.put("is_bidding", cqu.Qhi ? 1 : 0);
                if (cqu.Qhi) {
                    jSONObject.put("load_wait_time", cqu.cJ);
                }
                j10 = cqu.Tgh();
            }
        } catch (JSONException e10) {
            ABk.Qhi("TTAppOpenAdReport", "reportLoadNetDuration json error", e10);
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, "load_net_duration", j10, jSONObject);
    }

    public static void Qhi(tP tPVar, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            Qhi(jSONObject, tPVar);
            jSONObject.put("openad_creative_type", tP.fl(tPVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            ABk.Qhi("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, "load_cache_duration", j10, jSONObject);
    }

    private static void Qhi(JSONObject jSONObject, tP tPVar) {
        int i10;
        if (tPVar != null) {
            try {
                if (tPVar.czB()) {
                    i10 = 1;
                    jSONObject.put("is_icon_only", i10);
                }
            } catch (JSONException e10) {
                ABk.Qhi("TTAppOpenAdReport", e10.getMessage());
                return;
            }
        }
        i10 = 0;
        jSONObject.put("is_icon_only", i10);
    }
}

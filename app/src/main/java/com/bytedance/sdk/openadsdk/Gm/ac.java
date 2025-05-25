package com.bytedance.sdk.openadsdk.Gm;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.Gm.Qhi.fl;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.zc;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.io.File;
import org.json.JSONObject;

/* compiled from: StatsLogManager.java */
/* loaded from: classes.dex */
public class ac {
    private static volatile ac Qhi;

    private ac() {
    }

    public static void CJ() {
        Qhi("disk_log", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.11
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                File[] listFiles;
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j10 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long Qhi2 = ac.Qhi(file2);
                        j10 += Qhi2;
                        jSONObject.put(file2.getName(), Qhi2);
                    }
                }
                if (j10 < 524288000) {
                    return null;
                }
                return fl.cJ().Qhi("disk_log").cJ(jSONObject.toString());
            }
        });
    }

    public static ac Qhi() {
        if (Qhi == null) {
            synchronized (ac.class) {
                if (Qhi == null) {
                    Qhi = new ac();
                }
            }
        }
        return Qhi;
    }

    private boolean ac(fl flVar) {
        return flVar == null;
    }

    public static void cJ(final tP tPVar) {
        if (js.Qhi(tPVar) == null || TextUtils.isEmpty(tPVar.Ri())) {
            return;
        }
        Qhi("download_gecko_start", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.18
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(InMobiNetworkValues.URL, tP.this.YB());
                jSONObject.put("channel_name", tP.this.Ri());
                return fl.cJ().Qhi("download_gecko_start").Qhi(tP.this.eN()).cJ(jSONObject.toString());
            }
        });
    }

    public void ac() {
        Qhi("blind_mode_status", true, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.9
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                return fl.cJ().Qhi("blind_mode_status");
            }
        });
    }

    public static void ac(final String str) {
        Qhi("request_monitor_daily", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.15
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                return fl.cJ().Qhi("request_monitor_daily").cJ(str);
            }
        });
    }

    public void cJ(final fl flVar) {
        if (ac(flVar)) {
            return;
        }
        flVar.Qhi("show_backup_endcard");
        HzH.fl().Qhi(new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.21
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                return flVar;
            }
        });
    }

    public static void Qhi(final tP tPVar) {
        if (tPVar == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        Qhi("bidding_receive", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.1
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", currentTimeMillis);
                if (tPVar.eN() == 3) {
                    jSONObject.put("is_icon_only", tPVar.czB() ? 1 : 0);
                }
                return fl.cJ().Qhi("bidding_receive").cJ(jSONObject.toString());
            }
        });
    }

    public void cJ(final String str) {
        Qhi("close_playable_test_tool", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.3
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return fl.cJ().Qhi("close_playable_test_tool").cJ(jSONObject.toString());
            }
        });
    }

    public static void cJ() {
        lG.ac(new hm("showFailLog") { // from class: com.bytedance.sdk.openadsdk.Gm.ac.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ac.Qhi().Qhi("show_fail_log", new JSONObject());
                } catch (Throwable th2) {
                    ABk.Qhi("StatsLogManager", th2.getMessage());
                }
            }
        });
    }

    public static void Qhi(tP tPVar, final long j10) {
        if (tPVar == null) {
            return;
        }
        Qhi("bidding_load", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.12
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j10);
                return fl.cJ().Qhi("bidding_load").cJ(jSONObject.toString());
            }
        });
    }

    public static void cJ(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final fl cJ = fl.cJ().Qhi(str).cJ(str2);
                HzH.fl().Qhi(new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.13
                    @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                    public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                        return fl.this;
                    }
                }, false);
            }
        } catch (Throwable th2) {
            ABk.Qhi("StatsLogManager", th2.getMessage());
        }
    }

    public static void Qhi(final String str, final com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Qhi qhi) {
        if (qhi == null) {
            return;
        }
        Qhi(str, false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.17
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject ac2 = com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Qhi.this.ac();
                if (ac2 == null) {
                    ac2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac CJ = com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Qhi.this.CJ();
                if (CJ != null) {
                    CJ.Qhi(ac2);
                }
                return fl.cJ().Qhi(str).Qhi(com.bytedance.sdk.openadsdk.cJ.CJ.cJ.Qhi.this.Qhi().eN()).cJ(ac2.toString());
            }
        });
    }

    public static void Qhi(final tP tPVar, final JSONObject jSONObject) {
        if (js.Qhi(tPVar) == null || TextUtils.isEmpty(tPVar.Ri())) {
            return;
        }
        Qhi("download_gecko_end", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.19
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(InMobiNetworkValues.URL, tP.this.YB());
                jSONObject2.put("channel_name", tP.this.Ri());
                jSONObject2.put("data", jSONObject);
                return fl.cJ().Qhi("download_gecko_end").Qhi(tP.this.eN()).cJ(jSONObject2.toString());
            }
        });
    }

    public void Qhi(final fl flVar) {
        if (ac(flVar)) {
            return;
        }
        flVar.Qhi("express_ad_render");
        HzH.fl().Qhi(new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.20
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                return flVar;
            }
        });
    }

    public void Qhi(final String str) {
        Qhi("click_playable_test_tool", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.2
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return fl.cJ().Qhi("click_playable_test_tool").cJ(jSONObject.toString());
            }
        });
    }

    public void Qhi(final String str, final int i10, final String str2) {
        Qhi("use_playable_test_tool_error", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.4
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return fl.cJ().Qhi("use_playable_test_tool_error").cJ(jSONObject.toString());
            }
        });
    }

    public void Qhi(final long j10, final long j11) {
        final long j12 = j11 - j10;
        Qhi("general_label", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.5
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                int i10 = !iMK.cJ.get();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j10);
                    jSONObject.put("endtime", j11);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                return fl.cJ().Qhi("general_label").Sf(String.valueOf(j12)).cJ(jSONObject.toString());
            }
        });
    }

    public void Qhi(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        Qhi(str, false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.7
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                return fl.cJ().Qhi(str).cJ(jSONObject.toString());
            }
        });
    }

    public void Qhi(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Qhi(str, false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.8
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                return fl.cJ().Qhi(str).cJ(str2);
            }
        });
    }

    public void Qhi(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Object opt = jSONObject.opt("device_ad_mediation_platform");
        if (!(opt instanceof String) || TextUtils.isEmpty((String) opt)) {
            return;
        }
        Qhi("ad_revenue", true, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.10
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                try {
                    jSONObject.put("event", 272);
                    jSONObject.put("uuid", zc.ac(HzH.Qhi()));
                    String str = "";
                    if (zc.Qhi(HzH.Qhi()) != null) {
                        str = zc.Qhi(HzH.Qhi());
                    }
                    jSONObject.put("device_id", str);
                    jSONObject.put("platform", "android");
                    jSONObject.put("partner", "PangleSDK");
                } catch (Throwable th2) {
                    th2.getMessage();
                }
                return fl.cJ().Qhi("ad_revenue").cJ(jSONObject.toString());
            }
        });
    }

    public static long Qhi(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j10 = 0;
        for (File file2 : file.listFiles()) {
            j10 += Qhi(file2);
        }
        return j10;
    }

    public static void Qhi(String str, boolean z10, cJ cJVar) {
        int cJ = com.bytedance.sdk.openadsdk.core.settings.HzH.YD().cJ(str);
        if (TextUtils.isEmpty(str) || cJ == 0 || cJVar == null) {
            return;
        }
        boolean z11 = cJ == 100;
        if (!z11) {
            z11 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= cJ;
        }
        if (z11) {
            HzH.fl().Qhi(cJVar, z10);
        }
    }

    public static void Qhi(long j10, long j11, final String str, final int i10) {
        if (j10 == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final long j12 = elapsedRealtime - j10;
        final long j13 = elapsedRealtime - j11;
        final long j14 = j11 - j10;
        Qhi("ad_show_cost_time", false, new cJ() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.14
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j12);
                jSONObject.put("renderDuration", j13);
                jSONObject.put("showToRenderDuration", j14);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i10);
                return fl.cJ().Qhi("ad_show_cost_time").cJ(jSONObject.toString());
            }
        });
    }

    public static void Qhi(int i10, String str) {
        Qhi(i10, str, 0, (String) null);
    }

    public static void Qhi(final int i10, final String str, final int i11, final String str2) {
        Qhi("ipv6_req", false, (cJ) new cJ<com.bytedance.sdk.openadsdk.Gm.Qhi.ac>() { // from class: com.bytedance.sdk.openadsdk.Gm.ac.16
            @Override // com.bytedance.sdk.openadsdk.Gm.cJ
            public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(InMobiNetworkValues.URL, str);
                }
                jSONObject.put("status", str3);
                return fl.cJ().Qhi("ipv6_req").cJ(jSONObject.toString());
            }
        });
    }
}

package com.bytedance.sdk.openadsdk.fl;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.GeckoHubImp;
import com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.Gm.ac;
import com.bytedance.sdk.openadsdk.cJ.ac;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.zc;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: GeckoHub.java */
/* loaded from: classes.dex */
public class cJ {
    private static final String[] Qhi = {"gecko-pangle-sg.byteoversea.com"};

    /* compiled from: GeckoHub.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private static final cJ Qhi = new cJ();
    }

    private static String CJ() {
        String[] HLI = HzH.CJ().HLI();
        if (HLI == null) {
            HLI = Qhi;
        }
        String str = HLI[new SecureRandom().nextInt(HLI.length)];
        if (TextUtils.isEmpty(str)) {
            SecureRandom secureRandom = new SecureRandom();
            String[] strArr = Qhi;
            return strArr[secureRandom.nextInt(strArr.length)];
        }
        return str;
    }

    public static void ac() {
        try {
            GeckoHubImp.setThreadPoolExecutorCallback(new IThreadPoolCallback() { // from class: com.bytedance.sdk.openadsdk.fl.cJ.2
                @Override // com.bykv.vk.openvk.preload.geckox.IThreadPoolCallback
                public ExecutorService getThreadPool() {
                    return lG.CJ();
                }
            });
        } catch (Throwable th2) {
            ABk.Qhi("GeckoHub", "setThreadPoolExecutor error", th2);
        }
    }

    public ILoader cJ() {
        try {
            return GeckoHubImp.inst(HzH.Qhi()).getGeckoResLoader();
        } catch (Throwable th2) {
            ABk.Qhi("GeckoHub", "getGeckoResLoader error", th2);
            return null;
        }
    }

    private cJ() {
        try {
            GeckoHubImp.inst(HzH.Qhi());
        } catch (Throwable th2) {
            ABk.Qhi("GeckoHub", "GeckoHubImp init error", th2);
        }
    }

    public static cJ Qhi() {
        return Qhi.Qhi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cJ(Map<String, tP> map, JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("success", false);
                jSONObject2.put("msg", str);
                jSONObject2.put("code", 1);
                jSONObject = jSONObject2;
            }
            for (tP tPVar : map.values()) {
                ac.Qhi(tPVar, jSONObject);
            }
        } catch (Throwable th2) {
            ABk.Qhi("GeckoHub", "upLoadStateEvent error", th2);
        }
    }

    public void Qhi(final Map<String, tP> map) {
        try {
            String Qhi2 = zc.Qhi(HzH.Qhi());
            if (TextUtils.isEmpty(Qhi2)) {
                return;
            }
            for (tP tPVar : map.values()) {
                ac.cJ(tPVar);
            }
            GeckoHubImp.setRandomHost(CJ());
            GeckoHubImp.inst(HzH.Qhi()).preload(Qhi2, new IStatisticMonitor() { // from class: com.bytedance.sdk.openadsdk.fl.cJ.1
                @Override // com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor
                public void upload(String str, JSONObject jSONObject) {
                    if ("geckosdk_update_stats".equals(str)) {
                        tP tPVar2 = (tP) map.get(jSONObject.optString("channel"));
                        if (tPVar2 != null) {
                            ac.Qhi.Qhi(str, jSONObject, tPVar2);
                        }
                    } else if ("download_gecko_end".equals(str)) {
                        cJ.cJ(map, jSONObject, "");
                    }
                }
            }, map.keySet(), new com.bytedance.sdk.openadsdk.fl.Qhi());
        } catch (Throwable th2) {
            cJ(map, null, th2.toString());
            ABk.Qhi("GeckoHub", "releaseGeckoResLoader error", th2);
        }
    }

    public void Qhi(ILoader iLoader) {
        if (iLoader != null) {
            try {
                GeckoHubImp.inst(HzH.Qhi()).releaseGeckoResLoader(iLoader);
            } catch (Throwable th2) {
                ABk.Qhi("GeckoHub", "releaseGeckoResLoader error", th2);
            }
        }
    }

    public WebResourceResponseModel Qhi(ILoader iLoader, String str, String str2) {
        if (iLoader != null) {
            try {
                return GeckoHubImp.inst(HzH.Qhi()).findResAndMsg(iLoader, str, str2);
            } catch (Throwable th2) {
                ABk.Qhi("GeckoHub", "findRes error", th2);
                return null;
            }
        }
        return null;
    }

    public int Qhi(ILoader iLoader, String str) {
        try {
            return GeckoHubImp.inst(HzH.Qhi()).getResCount(iLoader, str);
        } catch (Throwable th2) {
            ABk.Qhi("GeckoHub", "getResCount error", th2);
            return 0;
        }
    }
}

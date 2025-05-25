package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.cJ.Qhi.fl;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.ac;
import com.bytedance.sdk.openadsdk.core.act.Qhi;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.zc;
import com.bytedance.sdk.openadsdk.iMK.cJ;
import com.bytedance.sdk.openadsdk.multipro.CJ.Tgh;
import com.bytedance.sdk.openadsdk.utils.NFd;
import com.bytedance.sdk.openadsdk.utils.bxS;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PAGInitHelper {
    public static final List<PAGSdk.PAGInitCallback> CALLBACK_LIST = new ArrayList();
    public static float animationScale = 1.0f;

    private static void Qhi(Context context) {
        ac.Qhi(context).Qhi("uuid", bxS.Qhi());
    }

    public static void initAPM() {
        if (com.bytedance.sdk.openadsdk.common.ac.Qhi()) {
            return;
        }
        try {
            String CJ = hm.cJ().CJ();
            if (TextUtils.isEmpty(CJ)) {
                return;
            }
            ApmHelper.initApm(HzH.Qhi(), new PAGConfig.Builder().appId(CJ).build());
        } catch (Exception unused) {
        }
    }

    public static void initAnimationScale(Context context) {
        try {
            float f10 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            animationScale = f10;
            if (f10 <= 0.0f) {
                animationScale = 1.0f;
            }
        } catch (Throwable unused) {
            animationScale = 1.0f;
        }
    }

    public static void initMemoryData() {
        HzH.CJ();
        Tgh.Qhi("ttopenadsdk", "a", 0);
        Tgh.Qhi("sp_global_file", "a", 0);
        Tgh.Qhi("sp_global_privacy", "a", 0);
        Tgh.Qhi("sp_global_app_id", "a", 0);
        Tgh.Qhi("sp_global_icon_id", "a", 0);
        Tgh.Qhi(cJ.Qhi, "a", 0);
        Tgh.Qhi("tpl_fetch_model", "a", 0);
        Tgh.Qhi("tt_sp", "a", 0);
        Tgh.Qhi("tt_sdk_event_net_ad", "a", 0);
        Tgh.Qhi("tt_sdk_event_net_state", "a", 0);
        Tgh.Qhi("tt_sdk_event_net_trail", "a", 0);
        Tgh.Qhi("tt_sdk_event_db_ad", "a", 0);
        Tgh.Qhi("tt_sdk_event_db_state", "a", 0);
        Tgh.Qhi("tt_sdk_event_db_trail", "a", 0);
    }

    public static void maybeAsyncInitTask(final Context context) {
        Qhi.Qhi(context);
        NFd.Qhi();
        zn.Qhi(context);
        Qhi(context);
        HzH.fl();
        String Qhi = zc.Qhi(context);
        com.bytedance.sdk.openadsdk.core.fl.ac.cJ(Qhi);
        fl.Qhi(Qhi, true);
        com.bytedance.sdk.component.adexpress.Qhi.cJ.cJ.Qhi();
        com.bytedance.sdk.openadsdk.core.video.cJ.Qhi.Qhi().cJ();
        initAnimationScale(context);
        iMK.cJ().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi();
                com.bytedance.sdk.openadsdk.Gm.ac.Qhi("android_act", false, new com.bytedance.sdk.openadsdk.Gm.cJ() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1.1
                    @Override // com.bytedance.sdk.openadsdk.Gm.cJ
                    public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("act", Qhi.cJ(context));
                            jSONObject.put("api_available", Qhi.cJ());
                            jSONObject.put("act_signals_callback_available", Qhi.ac());
                            jSONObject.put("act_event", Qhi.Qhi());
                        } catch (Throwable th2) {
                            ABk.Qhi("AsyncInitTask", "run: ", th2);
                        }
                        return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("android_act").cJ(jSONObject.toString());
                    }
                });
            }
        }, 10000L);
    }
}

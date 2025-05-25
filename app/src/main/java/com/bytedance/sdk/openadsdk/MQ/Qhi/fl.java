package com.bytedance.sdk.openadsdk.MQ.Qhi;

import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.core.ROR.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.bytedance.sdk.openadsdk.utils.lG;
import org.json.JSONObject;

/* compiled from: PAGMRCEventManager.java */
/* loaded from: classes.dex */
public class fl {
    public static void Qhi(final tP tPVar, final Qhi qhi, final Tgh.Qhi qhi2) {
        tPVar.Px();
        lG.ac(new com.bytedance.sdk.component.Sf.hm("mrc_report") { // from class: com.bytedance.sdk.openadsdk.MQ.Qhi.fl.1
            @Override // java.lang.Runnable
            public void run() {
                if (tPVar.VV()) {
                    if (tPVar.Ewb()) {
                        com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.Qhi(tPVar.Hf(), new ac.cJ("show_urls", tPVar));
                    } else {
                        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar);
                    }
                }
                String Qhi = js.Qhi(tPVar);
                JSONObject jSONObject = new JSONObject();
                Qhi qhi3 = qhi;
                if (qhi3 != null) {
                    try {
                        jSONObject.put("root_view", Qhi.Qhi(qhi3));
                        Tgh.Qhi qhi4 = qhi2;
                        if (qhi4 != null) {
                            int i10 = qhi4.Qhi;
                            if (i10 != -1) {
                                jSONObject.put("dynamic_show_type", i10);
                            }
                            int i11 = qhi2.cJ;
                            if (i11 != -1) {
                                jSONObject.put("ad_show_order", i11 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.cJ.ac.cJ(tPVar, Qhi, "mrc_show", jSONObject);
            }
        });
    }
}

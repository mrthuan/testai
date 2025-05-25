package com.bykv.vk.openvk.component.video.Qhi.cJ.fl;

import android.text.TextUtils;
import com.bytedance.sdk.component.cJ.Qhi.hpZ;
import com.bytedance.sdk.component.cJ.Qhi.iMK;
import com.bytedance.sdk.component.cJ.Qhi.zc;
import java.util.Map;

/* compiled from: NetworkSoureVolleyImpl.java */
/* loaded from: classes.dex */
public class fl implements cJ {
    private zc Qhi;

    public fl() {
        this.Qhi = null;
        this.Qhi = com.bykv.vk.openvk.component.video.api.ac.CJ();
    }

    @Override // com.bykv.vk.openvk.component.video.Qhi.cJ.fl.cJ
    public Qhi Qhi(Tgh tgh) {
        iMK.Qhi qhi = new iMK.Qhi();
        try {
            Map<String, String> map = tgh.f7171fl;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        String value = entry.getValue();
                        if (value == null) {
                            value = "";
                        }
                        qhi.cJ(key, value);
                    }
                }
            }
            hpZ Qhi = this.Qhi.Qhi(qhi.cJ(tgh.cJ).Qhi().Qhi("videoPreloadLowVersion").Qhi(6).cJ()).Qhi();
            Qhi.ac();
            return new ROR(Qhi, tgh);
        } catch (Throwable unused) {
            return null;
        }
    }
}

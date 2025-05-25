package com.bytedance.sdk.openadsdk.hm.Qhi;

import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractiveFinishMethod.java */
/* loaded from: classes.dex */
public class fl extends com.bytedance.sdk.component.Qhi.Tgh<JSONObject, JSONObject> {
    private final WeakReference<NFd> Qhi;

    public fl(NFd nFd) {
        this.Qhi = new WeakReference<>(nFd);
    }

    public static void Qhi(kYc kyc, NFd nFd) {
        kyc.Qhi("interactiveFinish", new fl(nFd));
    }

    @Override // com.bytedance.sdk.component.Qhi.Tgh
    public JSONObject Qhi(JSONObject jSONObject, com.bytedance.sdk.component.Qhi.ROR ror) {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<NFd> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            NFd nFd = this.Qhi.get();
            tP ac2 = nFd.ac();
            try {
                boolean z10 = true;
                int i10 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z10 = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int pF = ac2 != null ? ac2.pF() : 0;
                if (optInt >= 0 && pF >= 0) {
                    optInt = Math.min(optInt, pF);
                } else if (optInt < 0) {
                    optInt = pF >= 0 ? pF : 0;
                }
                if (z10) {
                    nFd.ac(optInt);
                } else {
                    i10 = -1;
                }
                jSONObject2.put("code", i10);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e10) {
                ABk.Qhi("InteractiveFinishMethod", e10.getMessage());
            }
        }
        return jSONObject2;
    }
}

package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: GtEqNode.java */
/* loaded from: classes.dex */
public class Tgh extends kYc {
    public Tgh() {
        super(com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.GT_EQ);
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        Object Qhi;
        Object Qhi2 = this.Qhi.Qhi(map);
        if (Qhi2 == null || (Qhi = this.cJ.Qhi(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.Qhi.cJ.fl.Qhi.fl.Qhi(Qhi2, (Number) Qhi)).booleanValue());
    }
}

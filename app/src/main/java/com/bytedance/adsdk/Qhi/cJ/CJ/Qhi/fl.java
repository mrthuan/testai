package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: EqualNode.java */
/* loaded from: classes.dex */
public class fl extends kYc {
    public fl() {
        super(com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.EQ);
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        Object Qhi = this.Qhi.Qhi(map);
        Object Qhi2 = this.cJ.Qhi(map);
        if (Qhi == null && Qhi2 == null) {
            return Boolean.TRUE;
        }
        if (Qhi == null && Qhi2 != null) {
            return Boolean.FALSE;
        }
        if (Qhi != null && Qhi2 == null) {
            return Boolean.FALSE;
        }
        if ((Qhi instanceof Number) && (Qhi2 instanceof Number)) {
            return Boolean.valueOf(com.bytedance.adsdk.Qhi.cJ.fl.Qhi.cJ.Qhi((Number) Qhi, (Number) Qhi2));
        }
        return Boolean.valueOf(Qhi.equals(Qhi2));
    }
}

package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: DoubleAmpNode.java */
/* loaded from: classes.dex */
public class cJ extends kYc {
    public cJ() {
        super(com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.DOUBLE_AMP);
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        boolean z10;
        if (com.bytedance.adsdk.Qhi.cJ.fl.cJ.Qhi(this.Qhi.Qhi(map)) && com.bytedance.adsdk.Qhi.cJ.fl.cJ.Qhi(this.cJ.Qhi(map))) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.kYc
    public String toString() {
        return cJ();
    }
}

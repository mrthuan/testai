package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: DoubleBarNode.java */
/* loaded from: classes.dex */
public class ac extends kYc {
    public ac() {
        super(com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.DOUBLE_BAR);
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        boolean z10;
        if (!com.bytedance.adsdk.Qhi.cJ.fl.cJ.Qhi(this.Qhi.Qhi(map)) && !com.bytedance.adsdk.Qhi.cJ.fl.cJ.Qhi(this.cJ.Qhi(map))) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.kYc
    public String toString() {
        return cJ();
    }
}

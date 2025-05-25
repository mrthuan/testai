package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: NumberNode.java */
/* loaded from: classes.dex */
public class hpZ implements com.bytedance.adsdk.Qhi.cJ.cJ.Qhi {
    private Number Qhi;

    public hpZ(String str) {
        if (str.indexOf(46) >= 0) {
            Float valueOf = Float.valueOf(str);
            this.Qhi = valueOf;
            if (Float.isInfinite(valueOf.floatValue())) {
                this.Qhi = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.Qhi = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.Qhi = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public String cJ() {
        return this.Qhi.toString();
    }

    public String toString() {
        return cJ();
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public com.bytedance.adsdk.Qhi.cJ.CJ.Sf Qhi() {
        return com.bytedance.adsdk.Qhi.cJ.CJ.hm.NUMBER;
    }
}

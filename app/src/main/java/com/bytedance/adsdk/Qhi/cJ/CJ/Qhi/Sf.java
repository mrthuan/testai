package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: KeywordNode.java */
/* loaded from: classes.dex */
public class Sf implements com.bytedance.adsdk.Qhi.cJ.cJ.Qhi {
    private final Object Qhi;

    public Sf(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.Qhi = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.Qhi = Boolean.FALSE;
        } else if (str.equalsIgnoreCase("null")) {
            this.Qhi = null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public String cJ() {
        Object obj = this.Qhi;
        if (obj != null) {
            return obj.toString();
        }
        return "NULL";
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.Qhi + "]";
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public com.bytedance.adsdk.Qhi.cJ.CJ.Sf Qhi() {
        return com.bytedance.adsdk.Qhi.cJ.CJ.hm.CONSTANT;
    }
}

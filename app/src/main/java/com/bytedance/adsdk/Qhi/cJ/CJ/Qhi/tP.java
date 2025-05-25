package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: PlusNode.java */
/* loaded from: classes.dex */
public class tP extends kYc {
    private static final ThreadLocal<StringBuilder> CJ = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.Qhi.cJ.cJ.Qhi.tP.1
        @Override // java.lang.ThreadLocal
        /* renamed from: Qhi */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public tP() {
        super(com.bytedance.adsdk.Qhi.cJ.CJ.Tgh.PLUS);
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        Object Qhi;
        Object Qhi2 = this.Qhi.Qhi(map);
        if (Qhi2 == null || (Qhi = this.cJ.Qhi(map)) == null) {
            return null;
        }
        if (!(Qhi2 instanceof String) && !(Qhi instanceof String)) {
            return com.bytedance.adsdk.Qhi.cJ.fl.Qhi.hm.Qhi((Number) Qhi2, (Number) Qhi);
        }
        StringBuilder sb2 = CJ.get();
        sb2.append(Qhi2);
        sb2.append(Qhi);
        String sb3 = sb2.toString();
        sb2.setLength(0);
        return sb3;
    }
}

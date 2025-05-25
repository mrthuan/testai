package com.bytedance.adsdk.Qhi.cJ.cJ.Qhi;

import androidx.activity.r;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: StringNode.java */
/* loaded from: classes.dex */
public class qMt implements com.bytedance.adsdk.Qhi.cJ.cJ.Qhi {
    private final String Qhi;

    public qMt(String str) {
        this.Qhi = str;
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public Object Qhi(Map<String, JSONObject> map) {
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public String cJ() {
        return r.g(new StringBuilder(OperatorName.SHOW_TEXT_LINE), this.Qhi, OperatorName.SHOW_TEXT_LINE);
    }

    public String toString() {
        return cJ();
    }

    @Override // com.bytedance.adsdk.Qhi.cJ.cJ.Qhi
    public com.bytedance.adsdk.Qhi.cJ.CJ.Sf Qhi() {
        return com.bytedance.adsdk.Qhi.cJ.CJ.hm.STRING;
    }
}

package com.bytedance.sdk.openadsdk.core.ROR;

import com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi;
import java.util.List;
import org.json.JSONObject;

/* compiled from: VastIcon.java */
/* loaded from: classes.dex */
public class cJ extends ac {
    private long Gm;
    private long WAv;

    public cJ(int i10, int i11, long j10, long j11, Qhi.EnumC0113Qhi enumC0113Qhi, Qhi.cJ cJVar, String str, List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> list, List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> list2, String str2) {
        super(i10, i11, enumC0113Qhi, cJVar, str, list, list2, str2);
        this.WAv = j10;
        this.Gm = j11;
        this.f8963hm = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.ROR.ac
    public JSONObject Qhi() {
        JSONObject Qhi = super.Qhi();
        if (Qhi != null) {
            Qhi.put("offset", this.WAv);
            Qhi.put("duration", this.Gm);
        }
        return Qhi;
    }

    public static cJ Qhi(JSONObject jSONObject) {
        ac cJ = ac.cJ(jSONObject);
        if (cJ == null) {
            return null;
        }
        return new cJ(cJ.Qhi, cJ.cJ, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), cJ.f8961ac, cJ.CJ, cJ.f8962fl, cJ.Tgh, cJ.ROR, cJ.Sf);
    }
}

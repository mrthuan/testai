package com.bytedance.sdk.openadsdk.cJ.Qhi;

import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TrackLinkResultSendListener.java */
/* loaded from: classes.dex */
public class iMK implements com.bytedance.sdk.openadsdk.Gm.cJ {
    private final com.bytedance.sdk.component.Tgh.Qhi.Tgh.fl Qhi;
    private final boolean cJ;

    public iMK(boolean z10, com.bytedance.sdk.component.Tgh.Qhi.Tgh.fl flVar) {
        this.Qhi = flVar;
        this.cJ = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.Gm.cJ
    public com.bytedance.sdk.openadsdk.Gm.Qhi.ac getLogStats() {
        int i10;
        if (this.Qhi == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.cJ);
        jSONObject.put(InMobiNetworkValues.URL, this.Qhi.cJ());
        int CJ = this.Qhi.CJ();
        if (CJ <= 0) {
            CJ = 0;
        }
        jSONObject.put("retry_times", CJ);
        jSONObject.put("ad_id", this.Qhi.Tgh());
        jSONObject.put("track_type", this.Qhi.fl());
        if (this.cJ) {
            if (this.Qhi.WAv()) {
                i10 = 3;
            } else if (this.Qhi.CJ() <= 0) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 4;
        }
        jSONObject.put("upload_scene", i10);
        String ROR = this.Qhi.ROR();
        if (!TextUtils.isEmpty(ROR)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : ROR.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String hm2 = this.Qhi.hm();
        if (!TextUtils.isEmpty(hm2)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : hm2.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi("track_link_result").cJ(jSONObject.toString());
    }
}

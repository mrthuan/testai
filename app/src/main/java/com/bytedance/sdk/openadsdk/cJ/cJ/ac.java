package com.bytedance.sdk.openadsdk.cJ.cJ;

import org.json.JSONObject;

/* compiled from: EventStartListenerWrapper.java */
/* loaded from: classes.dex */
public class ac implements cJ {
    cJ Qhi;

    @Override // com.bytedance.sdk.openadsdk.cJ.cJ.cJ
    public void Qhi(JSONObject jSONObject, long j10) {
        cJ cJVar = this.Qhi;
        if (cJVar != null) {
            cJVar.Qhi(jSONObject, j10);
        }
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j10);
    }
}

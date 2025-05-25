package com.bytedance.sdk.openadsdk.activity;

/* loaded from: classes.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.core.video.ac.cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Qhi(long r10, boolean r12) {
        /*
            r9 = this;
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r9.cJ
            com.bytedance.sdk.openadsdk.component.reward.view.ac r0 = r0.pM
            if (r0 == 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView r0 = r0.Qhi()
            if (r0 == 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r9.cJ
            com.bytedance.sdk.openadsdk.component.reward.view.ac r0 = r0.pM
            com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView r0 = r0.Qhi()
            com.bytedance.sdk.openadsdk.cJ.Sf r0 = r0.getAdShowTime()
            goto L1e
        L19:
            com.bytedance.sdk.openadsdk.cJ.Sf r0 = new com.bytedance.sdk.openadsdk.cJ.Sf
            r0.<init>()
        L1e:
            com.bytedance.sdk.openadsdk.component.reward.cJ.cJ r1 = r9.f8530ac
            if (r1 == 0) goto L38
            boolean r2 = r1 instanceof com.bytedance.sdk.openadsdk.component.reward.cJ.hm
            if (r2 == 0) goto L38
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r2 = r9.cJ
            boolean r3 = r2.cjC
            if (r3 != 0) goto L38
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r2 = r2.bxS
            com.bytedance.sdk.openadsdk.component.reward.cJ.hm r1 = (com.bytedance.sdk.openadsdk.component.reward.cJ.hm) r1
            android.widget.FrameLayout r1 = r1.NFd()
            r2.Qhi(r1, r0)
            goto L45
        L38:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r1 = r9.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r2 = r1.bxS
            com.bytedance.sdk.openadsdk.component.reward.view.ac r1 = r1.pM
            android.widget.FrameLayout r1 = r1.cJ()
            r2.Qhi(r1, r0)
        L45:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r9.cJ
            com.bytedance.sdk.openadsdk.component.reward.view.ac r0 = r0.pM
            if (r0 == 0) goto L80
            int r0 = r0.hm()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "dynamic_show_type"
            r7.put(r1, r0)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r9.cJ
            com.bytedance.sdk.openadsdk.component.reward.view.ac r0 = r0.pM
            r1 = 0
            org.json.JSONObject r0 = r0.Qhi(r1)
            if (r0 == 0) goto L80
            java.util.Iterator r1 = r0.keys()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.get(r2)     // Catch: org.json.JSONException -> L6c
            r7.put(r2, r3)     // Catch: org.json.JSONException -> L6c
            goto L6c
        L80:
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r9.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r0 = r0.bxS
            com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity$1 r1 = new com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity$1
            r1.<init>()
            r0.Qhi(r1)
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi r0 = r9.cJ
            com.bytedance.sdk.openadsdk.component.reward.Qhi.pA r3 = r0.bxS
            com.bytedance.sdk.openadsdk.component.reward.cJ.cJ r8 = r9.f8530ac
            r4 = r10
            r6 = r12
            boolean r10 = r3.Qhi(r4, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity.Qhi(long, boolean):boolean");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean kYc() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ac() {
    }
}

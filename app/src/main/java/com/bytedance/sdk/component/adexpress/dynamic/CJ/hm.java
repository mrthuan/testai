package com.bytedance.sdk.component.adexpress.dynamic.CJ;

import com.bytedance.sdk.component.adexpress.CJ.qMt;
import com.bytedance.sdk.component.adexpress.cJ.iMK;
import org.json.JSONObject;

/* compiled from: DynamicNativeParser.java */
/* loaded from: classes.dex */
public class hm implements WAv {
    private com.bytedance.sdk.component.adexpress.dynamic.fl.cJ Qhi;

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(iMK imk) {
        try {
            JSONObject ac2 = imk.ac();
            JSONObject jSONObject = new JSONObject(ac2.optString("template_Plugin"));
            JSONObject optJSONObject = ac2.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.ac.hm Qhi = new Sf(jSONObject, optJSONObject, ac2.optJSONObject("AdSize"), new JSONObject(ac2.optString("diff_template_Plugin"))).Qhi(imk.cJ(), imk.WAv(), optJSONObject.optDouble("score_exact_i18n"), optJSONObject.optString("comment_num_i18n"), imk);
            try {
                JSONObject jSONObject2 = new JSONObject(optJSONObject.optString("dynamic_creative"));
                Qhi.Qhi(jSONObject2.optString("color"));
                Qhi.Qhi(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.Qhi.Qhi(Qhi);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.CJ.WAv
    public void Qhi(com.bytedance.sdk.component.adexpress.dynamic.fl.cJ cJVar) {
        this.Qhi = cJVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.CJ.WAv
    public void Qhi(final iMK imk) {
        if (imk.zc() == 1) {
            cJ(imk);
        } else {
            qMt.Qhi(new com.bytedance.sdk.component.Sf.hm("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.CJ.hm.1
                @Override // java.lang.Runnable
                public void run() {
                    hm.this.cJ(imk);
                }
            }, 5);
        }
    }
}

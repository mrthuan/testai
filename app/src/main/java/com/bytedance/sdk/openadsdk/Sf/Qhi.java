package com.bytedance.sdk.openadsdk.Sf;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.utils.js;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsAppAdDownloadManager.java */
/* loaded from: classes.dex */
public class Qhi implements ac {
    private final tP Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final Map<String, com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl> f8511ac = new HashMap();
    private final cJ cJ;

    private Qhi(cJ cJVar, tP tPVar) {
        this.cJ = cJVar;
        this.Qhi = tPVar;
    }

    public static Qhi Qhi(cJ cJVar, tP tPVar) {
        return new Qhi(cJVar, tPVar);
    }

    @Override // com.bytedance.sdk.openadsdk.Sf.ac
    public void Qhi() {
        this.f8511ac.clear();
    }

    private tP Qhi(JSONObject jSONObject, String str) {
        String Qhi;
        if (jSONObject == null) {
            return null;
        }
        tP ac2 = tP.ac();
        ac2.ac(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            ac2.MQ(str);
        }
        if (this.Qhi == null) {
            return ac2;
        }
        String Qhi2 = ac2.pv() != null ? ac2.pv().Qhi() : null;
        if (TextUtils.isEmpty(Qhi2)) {
            return this.Qhi;
        }
        com.bytedance.sdk.openadsdk.core.model.ac pv = this.Qhi.pv();
        if (pv != null && Qhi2.equals(pv.Qhi())) {
            return this.Qhi;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (pv != null) {
            try {
                Qhi = pv.Qhi();
            } catch (JSONException unused) {
            }
        } else {
            Qhi = "null";
        }
        jSONObject2.put("lu", Qhi);
        jSONObject2.put("ju", Qhi2);
        tP tPVar = this.Qhi;
        com.bytedance.sdk.openadsdk.core.fl.Qhi(tPVar, js.Qhi(tPVar), -5, jSONObject2);
        if (pv != null && Qhi2.contains("play.google.com/store") && !Qhi2.contains(Constants.REFERRER)) {
            ac2.pv().Qhi(pv.Qhi());
        }
        return ac2;
    }

    @Override // com.bytedance.sdk.openadsdk.Sf.ac
    public void Qhi(Context context, JSONObject jSONObject, String str, int i10, boolean z10) {
        JSONObject optJSONObject;
        if (context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        Qhi(context, Qhi(optJSONObject, str), optJSONObject, i10, z10);
    }

    private void Qhi(Context context, tP tPVar, JSONObject jSONObject, int i10, boolean z10) {
        if (context == null || tPVar == null || tPVar.pv() == null || jSONObject == null || this.cJ == null || this.f8511ac.get(tPVar.pv().Qhi()) != null) {
            return;
        }
        String cJ = js.cJ(i10);
        if (TextUtils.isEmpty(cJ)) {
            return;
        }
        this.f8511ac.put(tPVar.pv().Qhi(), Qhi(context, tPVar, jSONObject, cJ, z10));
    }

    @Override // com.bytedance.sdk.openadsdk.Sf.ac
    public void Qhi(Context context, JSONObject jSONObject, String str) {
        tP tPVar;
        if (context == null || (tPVar = this.Qhi) == null) {
            return;
        }
        Tgh.Qhi(context, tPVar, str).CJ();
    }

    @Override // com.bytedance.sdk.openadsdk.Sf.ac
    public void Qhi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        Qhi(Qhi(optJSONObject, (String) null), optJSONObject);
    }

    private void Qhi(tP tPVar, JSONObject jSONObject) {
        if (this.cJ == null || tPVar == null || tPVar.pv() == null) {
            return;
        }
        String Qhi = tPVar.pv().Qhi();
        if (this.f8511ac.containsKey(Qhi)) {
            this.f8511ac.remove(Qhi);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.cJ.Qhi("app_ad_event", jSONObject2);
            } catch (JSONException e10) {
                ABk.Qhi("JsAppAdDownloadManager", e10.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl Qhi(Context context, tP tPVar, JSONObject jSONObject, String str, boolean z10) {
        com.bytedance.sdk.openadsdk.pA.Qhi.Qhi.fl Qhi = Tgh.Qhi(context, tPVar, str);
        Qhi.Qhi(true);
        return Qhi;
    }
}

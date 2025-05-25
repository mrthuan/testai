package com.bytedance.adsdk.ugeno.Qhi;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FindInvoker.java */
/* loaded from: classes.dex */
public class Qhi implements cJ {
    @Override // com.bytedance.adsdk.ugeno.Qhi.cJ
    /* renamed from: Qhi */
    public String cJ(Object[] objArr) {
        if (objArr != null && objArr.length == 3) {
            String valueOf = String.valueOf(objArr[0]);
            if (TextUtils.isEmpty(valueOf)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(valueOf);
                String valueOf2 = String.valueOf(objArr[1]);
                if (TextUtils.isEmpty(valueOf2)) {
                    return null;
                }
                return jSONObject.optString(valueOf2, String.valueOf(objArr[2]));
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}

package com.bytedance.sdk.component.Qhi;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Java2JsMsg.java */
/* loaded from: classes.dex */
public final class hpZ {
    private final Map<String, Object> Qhi = new ConcurrentHashMap();

    private hpZ() {
    }

    public static hpZ Qhi() {
        return new hpZ();
    }

    public String cJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.Qhi.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public hpZ Qhi(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.Qhi.put(str, obj);
        }
        return this;
    }
}

package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MediationInitConfigs.java */
/* loaded from: classes.dex */
public class WAv {
    public static final WAv Qhi = new WAv("");
    private final HashMap<String, Qhi> cJ = new HashMap<>();

    /* compiled from: MediationInitConfigs.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        public int CJ;
        public final String Qhi;

        /* renamed from: ac  reason: collision with root package name */
        public int f9163ac;
        public String cJ;

        /* renamed from: fl  reason: collision with root package name */
        public String f9164fl;

        public Qhi(JSONObject jSONObject) {
            this.Qhi = jSONObject.optString(NamingTable.TAG);
            this.cJ = jSONObject.optString("app_id");
            this.f9163ac = jSONObject.optInt("init_thread", 2);
            this.CJ = jSONObject.optInt("request_after_init", 2);
            this.f9164fl = jSONObject.optString("class_name");
        }
    }

    public WAv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    Qhi qhi = new Qhi(optJSONObject);
                    this.cJ.put(qhi.Qhi, qhi);
                }
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("MediationInitConfigs", e10.getMessage());
        }
    }
}

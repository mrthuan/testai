package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AutoTestModel.java */
/* loaded from: classes.dex */
public class Sf {
    private String Qhi;
    private List<String> cJ;

    public Sf(String str) {
        HashMap<String, Object> Qhi;
        this.Qhi = "";
        this.cJ = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            Qhi = new HashMap<>();
        } else {
            Qhi = Qhi(str);
        }
        try {
            this.Qhi = (String) Qhi.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) Qhi.get("auto_test_hosts"));
            this.cJ = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.cJ.add(jSONArray.optString(i10));
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.Qhi("AutoTestModel", e10.getMessage());
        }
    }

    public String Qhi() {
        return this.Qhi;
    }

    public List<String> cJ() {
        return this.cJ;
    }

    private static final HashMap<String, Object> Qhi(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                hashMap.put(optJSONObject.optString(NamingTable.TAG), optJSONObject.optString("value"));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}

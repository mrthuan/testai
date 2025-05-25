package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsConfiglInfo.java */
/* loaded from: classes.dex */
public class Sf {
    public static final Sf Qhi = new Sf(null);
    public static String cJ = "";
    public boolean CJ;
    public boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    public String f9161ac;

    /* renamed from: fl  reason: collision with root package name */
    public boolean f9162fl;

    public Sf(String str) {
        this.f9161ac = "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js";
        this.CJ = true;
        this.f9162fl = true;
        this.Tgh = true;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String optString = optJSONObject.optString(InMobiNetworkValues.URL, "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(optString)) {
                this.f9161ac = optString;
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.optString(i10));
            }
            this.CJ = arrayList.contains("load_finish");
            this.Tgh = arrayList.contains("load_fail");
            this.f9162fl = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}

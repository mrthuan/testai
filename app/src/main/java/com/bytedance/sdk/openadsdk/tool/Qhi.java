package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MaterialMetaTools.java */
/* loaded from: classes.dex */
public class Qhi {
    public static String Qhi(List<FilterWord> list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (FilterWord filterWord : list) {
                JSONObject Qhi = Qhi(filterWord);
                if (Qhi != null) {
                    jSONArray.put(Qhi);
                }
            }
            return jSONArray.toString();
        }
        return null;
    }

    public static List<FilterWord> Qhi(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                FilterWord Qhi = Qhi(jSONArray.optJSONObject(i10));
                if (Qhi != null && Qhi.isValid()) {
                    arrayList.add(Qhi);
                }
            }
        } catch (JSONException e10) {
            ABk.Qhi("MaterialMetaTools", e10.getMessage());
        }
        return arrayList;
    }

    private static FilterWord Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
            filterWord.setName(jSONObject.optString(NamingTable.TAG));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    FilterWord Qhi = Qhi(optJSONArray.optJSONObject(i10));
                    if (Qhi != null && Qhi.isValid()) {
                        filterWord.addOption(Qhi);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject Qhi(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookMediationAdapter.KEY_ID, filterWord.getId());
                jSONObject.put(NamingTable.TAG, filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    for (FilterWord filterWord2 : filterWord.getOptions()) {
                        jSONArray.put(Qhi(filterWord2));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

package com.bytedance.sdk.openadsdk.core.ugen;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.ugen.CJ.Tgh;
import com.bytedance.sdk.openadsdk.core.zc;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UgenUtils.java */
/* loaded from: classes.dex */
public class ac {
    private static String Qhi = "";

    public static JSONObject Qhi(tP tPVar, String str) {
        JSONObject mZ = tPVar.mZ();
        try {
            mZ.put("show_dislike", tPVar.rB());
            mZ.put("language", zc.Qhi());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String Tgh = hm.cJ().Tgh();
                int ROR = hm.cJ().ROR();
                jSONObject.put("app_name", Tgh);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(ROR)));
                mZ.put("open_app_info", jSONObject);
            }
            mZ.put("os", "Android");
            JSONArray cJ = cJ(tPVar);
            if (cJ != null) {
                mZ.put("dpa_data", cJ);
            }
        } catch (Throwable th2) {
            ABk.Qhi("UgenUtils", "parseUGenDataInfo exception", th2.getMessage());
        }
        return mZ;
    }

    private static JSONArray cJ(tP tPVar) {
        try {
            tP.Qhi es = tPVar.es();
            if (es != null) {
                JSONObject jSONObject = new JSONObject(es.WAv());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
                jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
                jSONObject2.putOpt("discount", Double.valueOf(jSONObject.optDouble("discount", 0.0d)));
                jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
                jSONObject2.putOpt(InMobiNetworkValues.DESCRIPTION, jSONObject.optString("dpa_description"));
                JSONArray optJSONArray = jSONObject.optJSONArray("dpa_images");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    jSONObject2.putOpt("image", optJSONArray.get(0));
                }
                jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
                jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
                jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
                jSONObject2.put("button_text", tPVar.ots());
                JSONArray jSONArray = new JSONArray();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
                if (optJSONArray2 != null) {
                    jSONArray.put(jSONObject2);
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        try {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i10);
                            jSONObject3.put("button_text", tPVar.ots());
                            jSONArray.put(jSONObject3);
                        } catch (Throwable unused) {
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean Qhi(tP tPVar) {
        return tPVar != null && tPVar.CQU() == 7;
    }

    public static String Qhi() {
        return Qhi;
    }

    public static JSONObject Qhi(tP tPVar, Tgh tgh) {
        JSONObject jSONObject;
        tgh.Qhi();
        Qhi = "";
        JSONObject jSONObject2 = null;
        try {
            tP.Qhi es = tPVar.es();
            String hpZ = tPVar.es() != null ? es.hpZ() : "";
            if (TextUtils.isEmpty(hpZ) && !TextUtils.isEmpty(es.pA()) && !TextUtils.isEmpty(es.fl())) {
                hpZ = com.bytedance.sdk.openadsdk.core.ugen.Qhi.cJ.Qhi().Qhi("ad", es.fl(), es.pA());
            }
            if (!TextUtils.isEmpty(hpZ)) {
                try {
                    jSONObject = new JSONObject(hpZ);
                    try {
                        try {
                            Qhi = "getTemplate success";
                            tgh.Qhi("local");
                            return jSONObject;
                        } catch (Throwable th2) {
                            jSONObject2 = jSONObject;
                            th = th2;
                            String str = "get template error " + th.getMessage();
                            Qhi = str;
                            tgh.Qhi(2, str, "local");
                            return jSONObject2;
                        }
                    } catch (JSONException unused) {
                        String concat = "parse json exception data is ".concat(String.valueOf(hpZ));
                        Qhi = concat;
                        tgh.Qhi(2, concat, "local");
                        return null;
                    }
                } catch (JSONException unused2) {
                    jSONObject = null;
                }
            } else {
                String str2 = "local data is null id is " + es.fl() + " md5 is " + es.pA();
                Qhi = str2;
                tgh.Qhi(3, str2, "net");
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

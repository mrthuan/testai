package com.bytedance.sdk.component.adexpress.dynamic.ac;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicCreative.java */
/* loaded from: classes.dex */
public class ac {
    private HashMap<String, Object> Qhi = new HashMap<>();
    private JSONObject cJ;

    public ac(JSONObject jSONObject) {
        this.cJ = jSONObject;
    }

    public Object Qhi(String str) {
        if (this.Qhi.containsKey(str)) {
            return this.Qhi.get(str);
        }
        return null;
    }

    public boolean cJ(String str) {
        return this.Qhi.containsKey(str);
    }

    public void Qhi() {
        Iterator<String> keys = this.cJ.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = this.cJ.opt(next);
            int i10 = 0;
            if (TextUtils.equals("image", next)) {
                if (opt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (i10 < jSONArray.length()) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                            if (optJSONObject != null) {
                                Iterator<String> keys2 = optJSONObject.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    Object opt2 = optJSONObject.opt(next2);
                                    this.Qhi.put(next + "." + i10 + "." + next2, opt2);
                                }
                            }
                            i10++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (opt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            Object opt3 = jSONObject.opt(next3);
                            if ((opt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i11 = 0; i11 < ((JSONArray) opt3).length(); i11++) {
                                    this.Qhi.put(next + "." + next3 + "." + i11, ((JSONArray) opt3).opt(i11));
                                }
                            } else if ((opt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> keys4 = ((JSONObject) opt3).keys();
                                while (keys4.hasNext()) {
                                    String next4 = keys4.next();
                                    Object opt4 = ((JSONObject) opt3).opt(next4);
                                    this.Qhi.put(next + "." + next3 + "." + next4, opt4);
                                }
                            } else if ((opt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                Qhi(next, next3, opt3);
                            } else {
                                this.Qhi.put(next + "." + next3, opt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(opt instanceof JSONObject)) {
                this.Qhi.put(next, opt);
                if (opt instanceof String) {
                    this.Qhi.put(next, opt);
                }
            } else if (opt != null) {
                JSONObject jSONObject2 = (JSONObject) opt;
                Iterator<String> keys5 = jSONObject2.keys();
                while (keys5.hasNext()) {
                    String next5 = keys5.next();
                    Object opt5 = jSONObject2.opt(next5);
                    this.Qhi.put(next + "." + next5, opt5);
                }
            }
        }
    }

    private void Qhi(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if ((opt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i10 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (i10 < jSONArray.length()) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                        Iterator<String> keys2 = optJSONObject.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            Object opt2 = optJSONObject.opt(next2);
                            HashMap<String, Object> hashMap = this.Qhi;
                            hashMap.put(str + "." + str2 + "." + next + "." + i10 + "." + next2, opt2);
                        }
                        i10++;
                    }
                }
            } else {
                HashMap<String, Object> hashMap2 = this.Qhi;
                hashMap2.put(str + "." + str2 + "." + next, opt);
            }
        }
    }
}

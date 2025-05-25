package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a  reason: collision with root package name */
    public final String f6175a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6176b;
    public final JSONObject c;

    public Purchase(String str, String str2) {
        this.f6175a = str;
        this.f6176b = str2;
        this.c = new JSONObject(str);
    }

    public final String a() {
        String optString = this.c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String c() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.f6175a, purchase.f6175a) && TextUtils.equals(this.f6176b, purchase.f6176b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6175a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f6175a));
    }
}

package com.bytedance.sdk.openadsdk.core.ROR;

import android.text.TextUtils;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ViewabilityVendor.java */
/* loaded from: classes.dex */
public class Gm {
    private final String CJ;
    private final String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final String f8940ac;
    private final URL cJ;

    private Gm(String str, String str2, String str3, String str4) {
        this.Qhi = str2;
        this.cJ = new URL(str);
        this.f8940ac = str3;
        this.CJ = str4;
    }

    public JSONObject CJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", "omid");
            jSONObject.put("javascriptResourceUrl", this.cJ.toString());
            if (!TextUtils.isEmpty(this.Qhi)) {
                jSONObject.put("vendorKey", this.Qhi);
            }
            if (!TextUtils.isEmpty(this.f8940ac)) {
                jSONObject.put("verificationParameters", this.f8940ac);
            }
            if (!TextUtils.isEmpty(this.CJ)) {
                jSONObject.put("verificationNotExecuted", this.CJ);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String Qhi() {
        return this.Qhi;
    }

    public URL ac() {
        return this.cJ;
    }

    public String cJ() {
        return this.f8940ac;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gm)) {
            return false;
        }
        Gm gm2 = (Gm) obj;
        if (!Qhi(this.Qhi, gm2.Qhi) || !Qhi(this.cJ, gm2.cJ) || !Qhi(this.f8940ac, gm2.f8940ac)) {
            return false;
        }
        return Qhi(this.CJ, gm2.CJ);
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.Qhi;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode = (this.cJ.hashCode() + (i10 * 31)) * 31;
        String str2 = this.f8940ac;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = (hashCode + i11) * 31;
        String str3 = this.CJ;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i13 + i12;
    }

    private boolean Qhi(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static Gm Qhi(String str, String str2, String str3, String str4, String str5) {
        if ("omid".equalsIgnoreCase(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new Gm(str2, str3, str4, str5);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Gm Qhi(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("apiFramework");
            String optString2 = jSONObject.optString("javascriptResourceUrl");
            if ("omid".equalsIgnoreCase(optString) && !TextUtils.isEmpty(optString2)) {
                return new Gm(optString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Set<Gm> Qhi(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray == null) {
            return hashSet;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                hashSet.add(Qhi(jSONArray.getJSONObject(i10)));
            } catch (Throwable unused) {
            }
        }
        return hashSet;
    }
}

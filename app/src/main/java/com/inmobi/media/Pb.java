package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import com.inmobi.unifiedId.InMobiUserDataTypes;
import java.util.HashMap;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Pb extends AbstractC1740na {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pb(String url, Ib ib2, String str, int i10, int i11, int i12) {
        super(url, ib2, str, i10, i11);
        kotlin.jvm.internal.g.e(url, "url");
        this.f14289p = i12;
    }

    @Override // com.inmobi.media.AbstractC1740na, com.inmobi.media.G8
    public final void f() {
        InMobiUserDataTypes inMobiUserDataTypes;
        InMobiUserDataTypes inMobiUserDataTypes2;
        String str;
        String str2;
        boolean z10;
        HashMap<String, String> hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        HashMap hashMap6;
        super.f();
        String.valueOf(S3.f14631a);
        HashMap a10 = AbstractC1855w9.a();
        HashMap hashMap7 = this.f14284k;
        if (hashMap7 != null) {
            hashMap7.put("mk-version", Ia.a());
            String str3 = I0.f14334a;
            if (str3 != null) {
                String str4 = (String) hashMap7.put("bundle-id", str3);
            }
            hashMap7.put("ua", Ha.k());
            hashMap7.put("ts", String.valueOf(System.currentTimeMillis()));
        }
        String str5 = this.f14286m;
        if (str5 != null && (hashMap6 = this.f14284k) != null) {
            String str6 = (String) hashMap6.put("account_id", str5);
        }
        Boolean c = Hb.f14332a.c();
        HashMap hashMap8 = this.f14284k;
        if (hashMap8 != null) {
            String str7 = (String) hashMap8.put("lat", (c == null || (r4 = c.toString()) == null) ? "true" : "true");
        }
        String str8 = (String) a10.get("u-age");
        if (str8 != null && (hashMap5 = this.f14284k) != null) {
            String str9 = (String) hashMap5.put("age", str8);
        }
        InMobiUserDataModel inMobiUserDataModel = S3.f14631a;
        if (inMobiUserDataModel == null || (inMobiUserDataTypes = inMobiUserDataModel.getEmailId()) == null || (inMobiUserDataTypes.getMd5() == null && inMobiUserDataTypes.getSha1() == null && inMobiUserDataTypes.getSha256() == null)) {
            inMobiUserDataTypes = null;
        }
        if (inMobiUserDataTypes != null && (hashMap4 = this.f14284k) != null) {
            String str10 = (String) hashMap4.put("email", String.valueOf(new C1722m5().a(inMobiUserDataTypes)));
        }
        InMobiUserDataModel inMobiUserDataModel2 = S3.f14631a;
        if (inMobiUserDataModel2 == null || (inMobiUserDataTypes2 = inMobiUserDataModel2.getPhoneNumber()) == null || (inMobiUserDataTypes2.getMd5() == null && inMobiUserDataTypes2.getSha1() == null && inMobiUserDataTypes2.getSha256() == null)) {
            inMobiUserDataTypes2 = null;
        }
        if (inMobiUserDataTypes2 != null && (hashMap3 = this.f14284k) != null) {
            String str11 = (String) hashMap3.put("phone", String.valueOf(new C1722m5().a(inMobiUserDataTypes2)));
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject b10 = N4.b();
        if (b10 != null) {
            try {
                if (b10.has("ufids")) {
                    JSONArray jSONArray2 = b10.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        if (jSONArray2.getJSONObject(i10).has("src")) {
                            str = jSONArray2.getJSONObject(i10).getString("src");
                        } else {
                            str = null;
                        }
                        if (jSONArray2.getJSONObject(i10).has("signature")) {
                            str2 = jSONArray2.getJSONObject(i10).getString("signature");
                        } else {
                            str2 = null;
                        }
                        if (System.currentTimeMillis() > jSONArray2.getJSONObject(i10).getLong("expiry")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (str != null && str2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", str);
                            jSONObject.put("signature", str2);
                            jSONObject.put("expired", z10);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException unused) {
                Objects.toString(b10);
            }
        }
        HashMap hashMap9 = this.f14284k;
        if (hashMap9 != null) {
            String jSONArray3 = jSONArray.toString();
            kotlin.jvm.internal.g.d(jSONArray3, "toString(...)");
            String str12 = (String) hashMap9.put("ufids", jSONArray3);
        }
        InMobiUserDataModel inMobiUserDataModel3 = S3.f14631a;
        if (inMobiUserDataModel3 != null) {
            hashMap = inMobiUserDataModel3.getExtras();
        } else {
            hashMap = null;
        }
        if (hashMap != null && (hashMap2 = this.f14284k) != null) {
            hashMap2.putAll(hashMap);
        }
    }
}

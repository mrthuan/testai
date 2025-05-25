package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Nb {
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.media.Ob a() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Nb.a():com.inmobi.media.Ob");
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static void a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        short s4;
        String message = error != null ? error.getMessage() : null;
        if (kotlin.jvm.internal.g.a(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s4 = 93;
        } else {
            s4 = kotlin.jvm.internal.g.a(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s4 >= 0) {
            LinkedHashMap B0 = kotlin.collections.q.B0(new Pair("errorCode", Short.valueOf(s4)));
            C1616eb c1616eb = C1616eb.f15034a;
            C1616eb.b("FetchCallbackFailure", B0, EnumC1686jb.f15238a);
        }
        AbstractC1574bb.a(new androidx.fragment.app.d(5, inMobiUnifiedIdInterface, jSONObject, error));
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i10);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        if (jSONArray.length() > 0) {
            jSONObject2.put("ufids", jSONArray);
            return jSONObject2;
        }
        return null;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArray2.getJSONObject(i10).getString("src");
                        kotlin.jvm.internal.g.b(string);
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i10);
                        kotlin.jvm.internal.g.d(jSONObject4, "getJSONObject(...)");
                        hashMap.put(string, jSONObject4);
                    }
                }
            } catch (JSONException unused) {
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String string2 = jSONArray3.getJSONObject(i11).getString("src");
                kotlin.jvm.internal.g.b(string2);
                JSONObject jSONObject5 = jSONArray3.getJSONObject(i11);
                kotlin.jvm.internal.g.d(jSONObject5, "getJSONObject(...)");
                hashMap.put(string2, jSONObject5);
            }
        }
        Collection<JSONObject> values = hashMap.values();
        kotlin.jvm.internal.g.d(values, "<get-values>(...)");
        for (JSONObject jSONObject6 : values) {
            jSONArray.put(jSONObject6);
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}

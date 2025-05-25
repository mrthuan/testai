package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C1N {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{24, 26, 9, 20, 14, 8, 30, 23, 100, 117, 102, 103, 125, 122, 115, Field.DOCPROPERTY, 74, Field.FORMCHECKBOX, Field.FORMTEXT, 76, 124, 86, Field.ADDIN, Field.AUTOTEXT};
    }

    public static List<C1F> A01(JSONArray jSONArray, JSONObject jSONObject, C1314Zs c1314Zs, C1R c1r) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (i10 == 0) {
                    A03(jSONObject2, jSONObject);
                }
                C1F A002 = C1F.A00(jSONObject2);
                c1r.A3j(A002, jSONObject2);
                arrayList.add(A002);
            } catch (JSONException e10) {
                c1314Zs.A07().AA0(A00(8, 7, 90), C8E.A2B, new C8F(e10));
            }
        }
        return arrayList;
    }

    public static void A03(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!next.equals(A00(15, 9, 109)) && !next.equals(A00(0, 8, 53)) && !jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}

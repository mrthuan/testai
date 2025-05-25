package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Po  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1054Po {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1053Pn A00(C1314Zs c1314Zs, JSONObject jSONObject, C05906f c05906f, JF jf2, PO po2, boolean z10) {
        boolean z11;
        String str;
        boolean z12 = z10;
        String A01 = A01(101, 3, 41);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String optString = jSONObject.optString(A01(51, 26, 104));
        arrayList3.add(optString);
        if (z12) {
            str = c05906f.A0R(optString);
            if (optString.equals(str)) {
                z12 = false;
                z11 = false;
            } else {
                z11 = z12;
            }
        } else {
            z11 = z12;
            str = optString;
        }
        jf2.A04(JE.A0P, null);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(A01(92, 4, 49));
            if (optJSONObject != null && optJSONObject.optString(A01) != null) {
                arrayList.add(optJSONObject.optString(A01));
                if (z11) {
                    optJSONObject.put(A01, c05906f.A0Q(optJSONObject.optString(A01)));
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(A01(77, 15, 113));
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    String optString2 = optJSONArray.optString(i10);
                    arrayList.add(optString2);
                    if (z11) {
                        optJSONArray.put(i10, c05906f.A0Q(optString2));
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 37));
            if (optJSONArray2 != null) {
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    A03(arrayList, arrayList2, optJSONArray2.optJSONObject(i11), c05906f, z11);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c05906f, z11);
            }
        } catch (JSONException unused) {
            po2.A04(C8E.A15, A01(0, 43, 35));
        }
        return new C1053Pn(jSONObject, str, arrayList, arrayList2, arrayList3, z12);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-87, -42, -42, -45, -42, -124, -40, -42, -59, -46, -41, -54, -45, -42, -47, -51, -46, -53, -124, -82, -73, -77, -78, -124, -51, -46, -124, -39, -44, -56, -59, -40, -55, -89, -59, -57, -52, -55, -56, -71, -42, -48, -41, -55, -57, -40, -43, -37, -39, -53, -46, 13, 34, 23, 10, 22, 18, 12, 8, Field.NUMCHARS, 13, 20, 8, 21, 10, 34, 14, Field.NUMWORDS, 8, 17, 29, 22, 21, 8, 30, Field.NUMWORDS, 21, 23, 32, 22, 17, 21, 19, 36, 22, 17, Field.NUMWORDS, 31, 19, 25, 23, Field.PAGEREF, -37, -43, -31, -32, -35, -31, -43, -37, -39, -33, -36, -42, -32, -45, -50, -49, -39, -55, -33, -36, -42};
    }

    public static void A03(ArrayList<String> imageUrls, ArrayList<String> videoUrls, JSONObject jSONObject, C05906f c05906f, boolean z10) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(96, 5, 51));
        if (optJSONObject != null) {
            String A01 = A01(101, 3, 41);
            if (optJSONObject.optString(A01) != null) {
                String optString = optJSONObject.optString(A01);
                imageUrls.add(optString);
                if (z10) {
                    optJSONObject.put(A01, c05906f.A0Q(optString));
                }
            }
        }
        String A012 = A01(104, 9, 41);
        if (!TextUtils.isEmpty(jSONObject.optString(A012))) {
            String optString2 = jSONObject.optString(A012);
            videoUrls.add(optString2);
            if (z10) {
                jSONObject.put(A012, c05906f.A0R(optString2));
            }
        }
    }
}

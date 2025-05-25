package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC06318g {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-74, -72, -85, -84, -59, -71, -86, -79, -59, -87, -89, -87, -82, -85, -35, -33, -46, -45, -20, -32, -47, -40, -20, -38, -50, -37, -50, -44, -46, -47, -20, -48, -50, -48, -43, -46, -54, -56, -54, -49, -52, -28, -31, -12, -27, -33, -13, -27, -12, 33, Field.AUTONUMOUT, 44, Field.PAGEREF, Field.DDEAUTO, 33, Field.GLOSSARY, Field.NUMWORDS, Field.PAGEREF, 42, -40, -61, -50, -41, -57};
    }

    public static String A01(C1313Zr c1313Zr) {
        return KJ.A00(c1313Zr).getString(A00(0, 14, 37), null);
    }

    public static Map<String, String> A02(C1313Zr c1313Zr) {
        String sdkCache = KJ.A00(c1313Zr).getString(A00(14, 22, 76), null);
        if (sdkCache == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(sdkCache);
            HashSet<String> hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2.getLong(A00(41, 8, 63)) + (jSONObject2.getInt(A00(49, 10, 123)) * 1000) < System.currentTimeMillis()) {
                    hashSet.add(next);
                } else {
                    hashMap.put(next, jSONObject2.getString(A00(59, 5, 33)));
                }
            }
            if (!hashSet.isEmpty()) {
                for (String sdkCache2 : hashSet) {
                    jSONObject.remove(sdkCache2);
                }
                A06(c1313Zr, jSONObject);
            }
            return hashMap;
        } catch (JSONException e10) {
            c1313Zr.A07().AA0(A00(36, 5, 38), C8E.A2U, new C8F(e10));
            return null;
        }
    }

    public static void A04(C1313Zr c1313Zr, String str) {
        KJ.A00(c1313Zr).edit().putString(A00(0, 14, 37), str).apply();
    }

    public static void A05(C1313Zr c1313Zr, String str) {
        if (str == null) {
            return;
        }
        String sdkCache = KJ.A00(c1313Zr).getString(A00(14, 22, 76), null);
        try {
            JSONObject jSONObject = sdkCache == null ? new JSONObject() : new JSONObject(sdkCache);
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(key);
                jSONObject3.put(A00(41, 8, 63), System.currentTimeMillis());
                jSONObject.put(key, jSONObject3);
            }
            A06(c1313Zr, jSONObject);
        } catch (JSONException e10) {
            c1313Zr.A07().AA0(A00(36, 5, 38), C8E.A2V, new C8F(e10));
        }
    }

    public static void A06(C1313Zr c1313Zr, JSONObject jSONObject) {
        KJ.A00(c1313Zr).edit().putString(A00(14, 22, 76), jSONObject.toString()).apply();
    }
}

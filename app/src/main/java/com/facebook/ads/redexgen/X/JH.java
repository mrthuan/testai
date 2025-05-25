package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class JH {
    public static byte[] A00;
    public static String[] A01 = {"U6KVOTsvyFGORVsRScrnzIfC22jYBwjX", "ILJfzAM", "mSXQ0Ybvz22qP9FTERotykvccOsLfkLX", "hexg7lZyOyIoqc3cfx0LJrY0JzPheGn9", "QO0W7SjBIJExYoWj8d5V4ATeE22xBdxq", "XgtJCrs", "K8cPCeEyVHoG5OOYDkeX6MTEK7uusLdi", "HRkIYlhxQwIghQfQLwcjnPshoo50TCUq"};
    public static final Map<String, String> A02;
    public static final Map<String, List<String>> A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].charAt(20) != 'n') {
                throw new RuntimeException();
            }
            A01[7] = "VCgIGVaZR6LUurcUp8PRnu67FREgo2FS";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            int i14 = (copyOfRange[i13] - i12) - 84;
            String[] strArr = A01;
            if (strArr[6].charAt(18) != strArr[4].charAt(18)) {
                String[] strArr2 = A01;
                strArr2[6] = "QUKDQrMYYXqh8JHMTaWZV6Ed8Qh6Q2ZU";
                strArr2[4] = "Ahd0Yp7BAsSR93JTUpDMLzcJNLS2OMnc";
                copyOfRange[i13] = (byte) i14;
                i13++;
            } else {
                copyOfRange[i13] = (byte) i14;
                i13++;
            }
        }
    }

    public static void A03() {
        A00 = new byte[]{33, Field.GOTOBUTTON, -25, -28, -9, -28, 20, Field.QUOTE, Field.NUMCHARS, Field.NUMCHARS, 19, 26, 7, 10, -4, -1, -6, 15, 4, 8, 0, -6, 8, 14, 9, -4, 8, 12, -4, 10, 11, -10, 11, 0, 4, -4, -10, 4, 10, 21, 24, -1, 6, 21, 14, 14, 5, 12, -1, 12, 15, 7, 7, 9, 14, 7};
    }

    static {
        A03();
        A03 = new HashMap();
        A02 = new HashMap();
    }

    public static String A01(String str) {
        return A02.get(str);
    }

    public static List<String> A02(C1314Zs c1314Zs, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (JSONException e10) {
                c1314Zs.A07().AA0(A00(39, 17, 76), C8E.A1C, new C8F(e10));
            }
        }
        return arrayList;
    }

    public static void A04(View view, JF jf2, JE je2) {
        view.addOnAttachStateChangeListener(new JG(jf2, je2));
    }

    public static void A05(C1314Zs c1314Zs, String str, long j10) {
        J7 adEventManager = c1314Zs.A09();
        JF jf2 = new JF(str, adEventManager);
        HashMap hashMap = new HashMap();
        hashMap.put(A00(24, 15, 67), C0956Lu.A06(j10));
        hashMap.put(A00(12, 12, 71), C0956Lu.A04(j10));
        jf2.A04(JE.A0D, hashMap);
    }

    public static void A06(C1314Zs c1314Zs, JSONObject jSONObject, long j10, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A00(2, 4, 47));
        if (optJSONObject == null) {
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(6, 6, 90));
        if (TextUtils.isEmpty(str) && optJSONArray != null) {
            A07(c1314Zs, optJSONObject, A02(c1314Zs, optJSONArray), j10, null);
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Map<String, List<String>> map = A03;
            if (A01[7].charAt(20) != 'n') {
                throw new RuntimeException();
            }
            A01[2] = "eRhlxr4ZIl29VB3yVqBFuzgoGteA2pMR";
            if (!map.containsKey(str)) {
                return;
            }
            A07(c1314Zs, optJSONObject, A03.get(str), j10, str);
        }
    }

    public static void A07(C1314Zs c1314Zs, JSONObject jSONObject, List<String> list, long j10, String str) {
        String A002 = A00(0, 2, 106);
        if (jSONObject.has(A002)) {
            String clientToken = jSONObject.optString(A002);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c1314Zs, clientToken, j10);
        }
    }

    public static void A08(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A02.put(str, str2);
    }

    public static void A09(String str, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean isEmpty = list.isEmpty();
        if (A01[7].charAt(20) != 'n') {
            throw new RuntimeException();
        }
        A01[2] = "Iv9PzV9ggO2VP5nzFrt9V6UHZMtP3qc2";
        if (isEmpty) {
            return;
        }
        A03.put(str, list);
    }

    public static boolean A0A(String str, JE je2) {
        return A0B(str, je2.A03());
    }

    public static boolean A0B(String str, String str2) {
        return A03.containsKey(str) && A03.get(str).contains(str2);
    }
}

package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04430l {
    public static byte[] A00;
    public static String[] A01 = {"jSoy8XspXCFqO9NWG0uega5zyBcMMpnv", "8I941vkvBihlhZSR3", "E0n4xhy7f55RdYtJKKgnHTy6BEjDvFXE", "Oow628hlFtykEPzM3xMW0Wh", "gjSfO6YGNNbsKn6TLZq3stDSfq2Vbbu6", "XJoMwGgC8l1BSQaiX90ZQnicuTGj509z", "JK4GcCSwzapE3gOVlVNykyUw2lU6lT6d", "8BqJ2MeWpSgEuyxwl"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {86, 115, Field.IMPORT, 126, 100, Field.IMPORT, 126, 121, 97, 118, 123, 126, 115, 118, 99, 114, 115, Field.IMPORT, 96, 126, 99, Byte.MAX_VALUE, 120, 98, 99, Field.IMPORT, 99, 120, 124, 114, 121, Field.SYMBOL, Field.NUMWORDS, 10, 19, 117, 116, 101, 116, 114, 101, 120, 126, Byte.MAX_VALUE, 78, 98, 101, 99, 120, Byte.MAX_VALUE, 118, 98, Field.FILLIN, 32, 56, Field.GLOSSARY, 34, Field.FILLIN, 42, Field.GLOSSARY, 58, Field.FILLIN, 33, 32, 17, 44, 43, Field.ASK, Field.GLOSSARY, 56, Field.FILLIN, 33, 60, Field.DDE, 60, Field.GLOSSARY, Field.DDEAUTO, Field.AUTONUMOUT, Field.MACROBUTTON, 58};
        if (A01[6].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "4DtSv1ItoT1AnjNkW";
        strArr[1] = "xsdhzuZMhKe1kPAxh";
        A00 = bArr;
    }

    static {
        A05();
    }

    public static EnumC04410j A00(JSONObject jSONObject) {
        return EnumC04410j.A00(jSONObject.optString(A02(52, 21, 9)));
    }

    public static C1492cn A01(C1314Zs c1314Zs, JSONObject jSONObject, String str) {
        return new C1492cn(jSONObject, c1314Zs, str);
    }

    public static Collection<String> A03(C1314Zs c1314Zs, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 86));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e10) {
            c1314Zs.A07().AA0(A02(73, 7, 26), C8E.A2C, new C8F(e10));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(jSONArray.optString(i10));
        }
        return hashSet;
    }

    public static boolean A06(C1314Zs c1314Zs, InterfaceC04420k interfaceC04420k, J7 j72) {
        EnumC04410j A7c = interfaceC04420k.A7c();
        if (A7c != null) {
            EnumC04410j invalidationBehavior = EnumC04410j.A03;
            if (A7c != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A7B = interfaceC04420k.A7B();
                if (A7B == null || A7B.isEmpty()) {
                    return false;
                }
                Iterator<String> it = A7B.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (AbstractC0936La.A04(c1314Zs, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC04410j invalidationBehavior2 = EnumC04410j.A02;
                if (packageInstalled != (A7c == invalidationBehavior2)) {
                    return false;
                }
                String clientToken = interfaceC04420k.A6r();
                if (!TextUtils.isEmpty(clientToken)) {
                    j72.AA7(clientToken, null);
                    return true;
                }
                c1314Zs.A07().AA0(A02(32, 3, 61), C8E.A0Z, new C8F(A02(0, 32, 80)));
                return true;
            }
        }
        return false;
    }
}

package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8J  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C8J {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, Field.AUTONUMOUT, 60, 60, Field.GOTOBUTTON, Field.AUTONUMLGL, 60, 123, 21, Field.USERADDRESS, Field.GLOSSARY, 44, Field.AUTONUMOUT, 41, 48, 123, 30, Field.DDE, Field.USERADDRESS, Field.AUTONUMLGL, Field.GLOSSARY, 34, Field.MACROBUTTON, Field.AUTONUMOUT, Field.FILLIN, Field.GOTOBUTTON, Field.GLOSSARY, 41, Field.DATA, 96, 119, 119, 106, 119, 32, 60, 60, 56, 23, 59, 60, 41, 60, 61, 59, 23, 43, Field.FILLIN, 44, Field.DDE, 98, 105, 120, 123, 99, 126, 103, 41, 56, 32, Field.AUTONUMLGL, Field.AUTONUM, 56, 61, 6, 42, 48, Field.QUOTE, 60, Field.IMPORT, 48, Field.PAGEREF, Field.AUTONUM, 48, Field.NUMWORDS, 48, Field.DDE, 41, 33, Field.DATA, Field.DDE, Field.EQ, Field.GOTOBUTTON, 60, Field.SYMBOL, 2, Field.DDEAUTO, Field.AUTONUMOUT, Field.FILLIN, 56};
    }

    public static JSONObject A01(C7j c7j, long j10, long j11, long j12, long j13, int i10, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j10);
                try {
                    jSONObject.put(A00(21, 8, 54), j11 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j12);
                        try {
                            jSONObject.put(A00(79, 11, 45), j13);
                            try {
                                jSONObject.put(A00(34, 16, 56), i10);
                                if (exc != null) {
                                    jSONObject.put(A00(29, 5, 117), exc.getMessage());
                                }
                            } catch (JSONException e10) {
                                e = e10;
                                c7j.A07().A3y(e);
                                return jSONObject;
                            }
                        } catch (JSONException e11) {
                            e = e11;
                        }
                    } catch (JSONException e12) {
                        e = e12;
                    }
                } catch (JSONException e13) {
                    e = e13;
                }
            } catch (JSONException e14) {
                e = e14;
            }
        } catch (JSONException e15) {
            e = e15;
        }
        return jSONObject;
    }

    public static void A03(C7j c7j, long j10, long j11, long j12, long j13, int i10, Exception exc) {
        C8F c8f = new C8F(A00(0, 21, 43));
        c8f.A05(1);
        c8f.A07(A01(c7j, j10, j11, j12, j13, i10, exc));
        c7j.A07().AAa(A00(50, 7, 124), C8E.A20, c8f);
    }
}

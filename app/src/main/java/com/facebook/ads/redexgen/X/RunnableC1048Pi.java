package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Pi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1048Pi implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ C1052Pm A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{13, 33, 59, 34, 42, 110, 32, 33, 58, 110, Field.USERADDRESS, Field.GLOSSARY, 60, 61, 43, 110, 61, 43, 60, 56, 43, 60, 110, Field.QUOTE, 43, 61, 61, Field.GLOSSARY, 41, 43, Field.NOTEREF, Byte.MAX_VALUE, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, Field.DDE, 125, 108, Byte.MAX_VALUE, 126, 100, 99, 106, Field.DDE, Field.FORMCHECKBOX, Field.GREETINGLINE, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.DDE, 100, 99, Field.DDE, 125, 98, 126, 121, 64, 104, 126, 126, 108, 106, 104, Field.DDE, Field.CONTROL, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.GREETINGLINE, 125, Field.FORMDROPDOWN, Field.AUTOTEXT, Field.AUTONUMLGL, Field.DATA, 36, 34, Field.EQ, 15, Field.AUTONUMOUT, Field.EQ, 36, Field.EQ, 14, 3, 10, 31, 58, 60};
    }

    public RunnableC1048Pi(C1052Pm c1052Pm, String str) {
        this.A00 = c1052Pm;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PO po2;
        String str;
        PO po3;
        if (KQ.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                str = this.A00.A05;
                if (str.equals(jSONObject.optString(A00(64, 7, 87)))) {
                    this.A00.A0C(EnumC1050Pk.A00(jSONObject.optString(A00(81, 4, 27))), jSONObject.optString(A00(71, 10, 49), A00(85, 2, 32)));
                    return;
                }
                po3 = this.A00.A04;
                po3.A04(C8E.A11, A00(0, 30, 47));
            } catch (JSONException e10) {
                po2 = this.A00.A04;
                po2.A04(C8E.A15, A00(30, 34, 108) + e10.getMessage());
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}

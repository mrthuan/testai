package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class WV implements J7 {
    public static J7 A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1313Zr A00;
    public final AnonymousClass91 A01;
    public final J6 A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{Field.GOTOBUTTON, 119, 100, 119, 124, 102, 60, Field.AUTONUM, 3, 3, 18, 26, 7, 3, 30, 25, 16, Field.CONTROL, 3, 24, Field.CONTROL, Field.NUMWORDS, 24, 16, Field.CONTROL, 22, 25, Field.CONTROL, 30, 25, 1, 22, Field.NUMWORDS, 30, 19, Field.CONTROL, Field.SECTIONPAGES, 100, 119, 117, 115, Field.CONTROL, Field.DOCPROPERTY, Field.GREETINGLINE, Field.DOCPROPERTY, Field.SECTIONPAGES, Field.AUTOTEXTLIST, Field.FORMDROPDOWN, 29, 16, 25, 12};
    }

    static {
        A03();
        A05 = WV.class.getSimpleName();
        A06 = false;
    }

    public WV(C1313Zr c1313Zr) {
        J5 dispatchCallback;
        this.A00 = c1313Zr;
        if (Io.A0T(c1313Zr)) {
            this.A01 = AbstractC06508z.A00(c1313Zr);
            dispatchCallback = JC.A00(c1313Zr, this.A01);
        } else {
            C0781Ef A01 = AbstractC06508z.A01(c1313Zr);
            dispatchCallback = JC.A01(c1313Zr, A01);
            this.A01 = A01;
        }
        this.A02 = new WY(c1313Zr, dispatchCallback);
        M8.A08.execute(new WX(this));
        A04(c1313Zr);
    }

    public static synchronized J7 A01(C1313Zr c1313Zr) {
        J7 j72;
        synchronized (WV.class) {
            if (A03 == null) {
                A03 = new WV(c1313Zr);
            }
            j72 = A03;
        }
        return j72;
    }

    public static synchronized void A04(C1313Zr c1313Zr) {
        synchronized (WV.class) {
            if (A06) {
                return;
            }
            c1313Zr.A03().AB3();
            A06 = true;
        }
    }

    private void A05(J4 j42) {
        if (!j42.A0A()) {
            Log.e(A05, A02(7, 29, 55) + j42.A06() + A02(0, 7, 82));
            return;
        }
        A06(j42);
        this.A01.AHh(j42, new WW(this, j42));
    }

    private void A06(J4 j42) {
        switch (J8.A00[j42.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C8F c8f = new C8F(new Exception(A02(36, 5, 86)));
                c8f.A05(1);
                try {
                    c8f.A07(new JSONObject().put(A02(48, 4, 41), j42.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A07().AA1(A02(41, 7, 112), C8E.A1H, c8f);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void A9t(String str, Map<String, String> data) {
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void A9v(String str, Map<String, String> data) {
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void A9w(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A07).A06(JH.A0A(str, JE.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void A9x(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A08).A06(JH.A0A(str, JE.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void A9z(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AA3(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AA6(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0D).A06(JH.A0A(str, JE.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AA7(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AA8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0F).A06(JH.A0A(str, JE.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AA9(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0K).A06(JH.A0A(str, JE.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAI(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0H).A06(JH.A0A(str, JE.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAK(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A0J).A06(JH.A0A(str, JE.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAL(String str, Map<String, String> data, String str2, J9 j92) {
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(j92).A02(JA.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAM(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        J4 adEvent = new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAQ(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0N).A06(JH.A0A(str, JE.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAR(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0O).A06(JH.A0A(str, JE.A0h)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAT(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(J9.A04).A02(JA.A0P).A06(JH.A0A(str, JE.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAU(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A04).A02(JA.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAY(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0Q).A06(JH.A0A(str, JE.A0m)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAZ(String str, Map<String, String> data) {
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AAb(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new J3().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J9.A05).A02(JA.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.J7
    public final void AEU(String str) {
        new SA(this.A00).execute(str);
    }
}

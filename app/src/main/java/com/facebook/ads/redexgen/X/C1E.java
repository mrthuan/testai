package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.ads.RewardData;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.Serializable;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C1E implements Serializable {
    public static String A0g = null;
    public static byte[] A0h = null;
    public static final long serialVersionUID = -8352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public RewardData A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public final int A0f;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 40);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0h = new byte[]{Field.HYPERLINK, 122, 107, Field.BARCODE, 102, 112, 106, 109, Field.BARCODE, 109, 122, 104, 126, 109, 123, 42, 13, 16, 23, 2, 15, 15, Field.INCLUDEPICTURE, 2, 19, 19, Field.INCLUDEPICTURE, 2, 13, 7, Field.INCLUDEPICTURE, 16, 8, 10, 19, Field.INCLUDEPICTURE, 23, 11, 6, Field.INCLUDEPICTURE, 2, 7, 77, 102, Field.SECTION, Field.BIDIOUTLINE, Field.HTMLCONTROL, 78, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, 15, Field.HTMLCONTROL, Field.FORMCHECKBOX, 74, 15, 78, Field.SHAPE, Field.SHAPE, 12, Field.EQ, 99, Field.AUTONUMOUT, 34, Field.IMPORT, 32, 43, 99, Field.IMPORT, 43, Field.ASK, 99, Field.PAGEREF, Field.AUTONUM, Field.GLOSSARY, Field.GLOSSARY, 99, 34, Field.FILLIN, 31, Field.FILLIN, Field.PAGEREF, 60, 108, 56, 36, 41, 108, Field.DDE, Field.DATA, 108, Field.DDEAUTO, Field.AUTONUMLGL, 108, Field.DATA, Field.QUOTE, 59, 34, 32, Field.QUOTE, Field.DDE, Field.DATA, Field.PAGEREF, 34, 43, 108, 56, 36, 41, 108, Field.DDE, 60, 60, 108, Field.DDE, 34, Field.DATA, 108, Field.PAGEREF, 34, Field.BARCODE, 56, Field.DDE, 34, 56, 32, Field.AUTONUMLGL, 108, 43, 41, 56, 108, Field.AUTONUMLGL, Field.QUOTE, Field.SYMBOL, Field.USERADDRESS, 108, Field.USERADDRESS, 41, 59, Field.DDE, Field.USERADDRESS, Field.DATA, 109, Byte.MAX_VALUE, Field.TOA, Field.FORMDROPDOWN, Field.ADVANCE, 6, Field.ADVANCE, Field.INCLUDEPICTURE, Field.ADDIN, Field.FORMCHECKBOX, Field.ADVANCE, Field.SECTIONPAGES, 6, Field.AUTOTEXT, Field.DOCPROPERTY, 6, Field.ADVANCE, Field.INCLUDEPICTURE, Field.FORMCHECKBOX, Field.SECTIONPAGES, Field.SHAPE, 6, 82, Field.TOA, 6, Field.INCLUDETEXT, Field.INCLUDEPICTURE, 6, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.INCLUDEPICTURE, Field.SECTIONPAGES, 7, Field.DATA, 42, Field.DATA, 20, Field.DDE, 34, Field.FILLIN, Field.BARCODE, Field.DDEAUTO, Field.SYMBOL, 20, Field.DATA, Field.FILLIN, 34, Field.DATA, 32, 56, 20, 36, Field.PAGEREF, 20, Field.DATA, Field.BARCODE, 42, 20, Field.DDEAUTO, Field.PAGEREF, 42, 41, Field.FILLIN, Field.DDEAUTO, Field.GLOSSARY, 96, 98, 110, 115, 98, 106, 100, 109, 106, 103, Field.USERADDRESS, 116, 102, 97, Field.BIDIOUTLINE, 98, 118, 119, 108, Field.BIDIOUTLINE, 113, 102, 103, 106, 113, 102, 96, 119, Field.QUOTE, 98, 96, 119, 106, 108, 109, Field.USERADDRESS, 98, 109, 103, 113, 108, 106, 103, Field.DDE, 106, 109, 119, 102, 109, 119, Field.DDE, 98, 96, 119, 106, 108, 109, Field.DDE, Field.DOCPROPERTY, 74, Field.FORMTEXT, Field.ADVANCE, Field.QUOTE, 115, 98, 96, 104, 98, 100, 102, Field.USERADDRESS, 96, 108, 110, Field.DDE, 98, 109, 103, 113, 108, 106, 103, Field.DDE, 117, 102, 109, 103, 106, 109, 100, Field.QUOTE, 106, 109, 119, 102, 109, 119, Field.SYMBOL, 44, 44, 115, 111, 98, 122, Field.DDE, 100, 108, 108, 100, 111, 102, Field.DDE, 96, 108, 110, 44, 112, 119, 108, 113, 102, 107, 105, 122, 103, 125, 123, 109, 100, Field.AUTOTEXT, Field.INCLUDETEXT, 77, Field.FILESIZE, Field.SECTIONPAGES, 115, Field.BIDIOUTLINE, 77, Field.GREETINGLINE, 77, Field.SECTION, Field.SHAPE, 7, 8, 13, 7, 15, 59, 0, 1, 8, 5, 29, 59, 8, 11, 3, 3, 13, 10, 3, 59, 9, 23, 1, 14, 11, 1, 9, 61, 11, 3, 0, 61, 4, 11, 14, 22, 7, 16, 11, 12, 5, 61, 7, 12, 3, 0, 14, 7, 6, 42, Field.ASK, 36, 103, Field.GLOSSARY, Field.DATA, 42, 44, 43, Field.ASK, Field.ASK, 34, 103, Field.DATA, Field.DDE, 58, 103, 32, Field.FILLIN, 61, 44, 59, 58, 61, 32, 61, 32, Field.DATA, Field.PAGEREF, 103, 42, Field.PAGEREF, 32, 42, 34, 44, Field.DDE, 110, Byte.MAX_VALUE, 104, 108, 121, 100, 123, 104, 82, 108, 126, 82, 110, 121, 108, 82, 104, 99, 108, 111, 97, 104, 105, Field.MACROBUTTON, 34, Field.AUTONUMLGL, Field.EQ, 36, Field.SYMBOL, Field.ASK, Field.AUTONUMLGL, 15, Field.EQ, Field.QUOTE, 15, Field.MACROBUTTON, 36, Field.EQ, 15, Field.AUTONUMLGL, Field.USERADDRESS, Field.EQ, Field.GOTOBUTTON, 60, Field.AUTONUMLGL, Field.AUTONUMOUT, 15, Field.USERADDRESS, Field.EQ, 36, Field.SYMBOL, Field.ASK, Field.AUTONUMLGL, 15, Field.GOTOBUTTON, Field.EQ, Field.USERADDRESS, Field.USERADDRESS, Field.AUTONUMLGL, 34, 43, 60, 41, 23, 43, 36, 33, 43, Field.QUOTE, 23, 44, Field.DDE, 36, 41, Field.EQ, 23, 36, Field.FILLIN, Field.GLOSSARY, Field.GLOSSARY, 33, Field.ASK, Field.GLOSSARY, 23, Field.PAGEREF, 59, 117, 98, 125, 78, 121, 120, 117, 116, 78, Byte.MAX_VALUE, 112, 103, 120, 118, 112, 101, 120, 126, Byte.MAX_VALUE, 78, 116, Byte.MAX_VALUE, 112, 115, 125, 116, 117, 18, 5, 26, 41, 30, 5, 41, 19, 24, 23, 20, 26, 19, 18, 110, 121, 102, Field.DOCPROPERTY, 98, 115, 104, 120, 99, 110, Field.DOCPROPERTY, 111, 100, 107, 104, 102, 111, 110, Field.SHAPE, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.LISTNUM, 86, 82, Field.HYPERLINK, 100, Field.NOTEREF, Field.SHAPE, 80, 100, Field.CONTROL, Field.LISTNUM, Field.SECTIONPAGES, Field.GREETINGLINE, Field.TOA, 100, Field.FORMDROPDOWN, Field.AUTOTEXT, 86, Field.CONTROL, 100, 78, Field.TOA, Field.CONTROL, 108, 103, 106, 123, 112, 121, 125, 108, 109, 86, 106, 121, 100, 108, 100, 100, 108, 103, 110, Field.ADVANCE, 123, 103, 106, 114, Field.ADVANCE, 99, 100, 120, Byte.MAX_VALUE, Field.ADVANCE, 120, Byte.MAX_VALUE, 121, 98, 101, 108, 108, 107, 118, 113, 100, 105, 105, Field.LISTNUM, 100, 107, 97, Field.LISTNUM, 98, 96, 113, Field.LISTNUM, 119, 96, 114, 100, 119, 97, Field.LISTNUM, 97, 96, 118, 102, 119, 108, 117, 113, 108, 106, 107, 10, 13, 16, 23, 2, 15, 15, 60, 2, 13, 7, 60, 4, 6, 23, 60, 17, 6, 20, 2, 17, 7, 60, 6, 13, 2, 1, 15, 6, 7, 5, 2, 24, 9, 30, 15, 9, Field.NUMCHARS, 24, Field.MACROBUTTON, Field.NUMWORDS, 9, 14, Field.MACROBUTTON, 5, 2, 31, 24, 13, 0, 0, Field.MACROBUTTON, 14, 25, 24, 24, 3, 2, 18, 21, 15, 30, 9, 8, 15, 18, 15, 18, 26, 23, 98, 123, Field.CONTROL, Byte.MAX_VALUE, 109, 106, Field.CONTROL, 97, 102, 123, 124, 105, 100, 100, Field.CONTROL, 106, 125, 124, 124, 103, 102, 58, Field.AUTONUMLGL, 32, 61, 34, Field.EQ, 17, 13, 0, 24, Field.AUTOTEXT, 6, 14, 14, 6, 13, 4, Field.AUTOTEXT, 2, 14, 12, 33, Field.QUOTE, Field.AUTONUMOUT, 14, Field.QUOTE, Field.AUTONUMOUT, Field.ASK, 48, Field.QUOTE, Field.AUTONUMLGL, 14, Field.GOTOBUTTON, Field.PAGEREF, 48, 14, Field.MACROBUTTON, 36, Field.PAGEREF, Field.PAGEREF, Field.USERADDRESS, Field.BARCODE, 14, Field.PAGEREF, Field.AUTONUMOUT, 41, Field.PAGEREF, Field.GLOSSARY, Field.DDE, 58, 0, Field.DDE, 58, Field.DATA, Field.USERADDRESS, Field.DDE, 59, 0, 59, 58, 44, 60, Field.DDE, Field.AUTONUM, Field.GLOSSARY, 43, Field.AUTONUM, 48, Field.EQ, Field.SHAPE, Field.ADDRESSBLOCK, 74, 112, Field.ADDRESSBLOCK, 74, Field.HYPERLINK, 78, Field.ADDRESSBLOCK, Field.MERGESEQ, 112, 74, Field.SECTION, 78, 77, Field.INCLUDEPICTURE, 74, Field.MERGESEQ, 33, Field.QUOTE, Field.AUTONUMOUT, 14, Field.QUOTE, Field.AUTONUMOUT, Field.ASK, 48, Field.QUOTE, Field.AUTONUMLGL, 14, Field.PAGEREF, 56, Field.PAGEREF, 61, Field.AUTONUMOUT, 124, 126, 105, Field.FORMDROPDOWN, 126, 105, 123, 109, 126, 104, Field.FORMDROPDOWN, 123, 109, 120, 111, 100, Field.FORMDROPDOWN, 109, 104, Field.FORMDROPDOWN, 110, 121, 120, 120, 99, 98, Field.FORMDROPDOWN, 120, 105, 116, 120, 41, Field.USERADDRESS, 43, Field.IMPORT, 58, 34, 4, 44, Field.MACROBUTTON, Field.USERADDRESS, Field.AUTONUMLGL, 4, Field.DATA, 48, Field.GOTOBUTTON, 43, 4, Field.GLOSSARY, Field.GOTOBUTTON, Field.AUTONUM, Field.USERADDRESS, 4, Field.USERADDRESS, Field.QUOTE, 56, Field.USERADDRESS, Field.USERADDRESS, Field.BARCODE, Field.DATA, 4, Field.DDE, Field.GOTOBUTTON, Field.BARCODE, Field.USERADDRESS, Field.AUTONUMOUT, 4, Field.BARCODE, Field.DDEAUTO, 41, 58, Field.GLOSSARY, Field.GOTOBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, 4, Field.USERADDRESS, Field.AUTONUMLGL, 58, Field.SYMBOL, Field.IMPORT, Field.USERADDRESS, Field.BARCODE, 105, 126, 106, 110, 126, 104, 111, Field.INCLUDETEXT, 114, Byte.MAX_VALUE, Field.INCLUDETEXT, Field.FORMDROPDOWN, Field.SECTION, Field.CONTROL, Field.INCLUDETEXT, 82, 105, Field.ADDIN, Field.INCLUDETEXT, Field.CONTROL, Field.HYPERLINK, Field.SECTIONPAGES, Field.FORMDROPDOWN, 82, 105, Field.SECTIONPAGES, Field.FORMDROPDOWN, 78, Field.SECTIONPAGES, 60, 43, Field.SYMBOL, Field.GLOSSARY, 60, 42, 43, 42, 17, 56, Field.FILLIN, 42, 43, 33, 24, 31, 25, 2, 5, 
        12, Field.AUTONUMOUT, 31, 4, Field.AUTONUMOUT, 8, 3, 14, 8, 0, Field.AUTONUMOUT, 12, 4, 4, 12, 7, 14, Field.AUTONUMOUT, Field.NUMWORDS, 7, 10, 18, Field.AUTONUMOUT, 10, 30, 31, 4, Field.AUTONUMOUT, 25, 14, 15, 2, 25, 14, 8, 31, 101, 122, 118, 100, 114, 113, 122, Byte.MAX_VALUE, 122, 103, 106, 76, 112, 123, 118, 112, 120, 76, 122, 125, 122, 103, 122, 114, Byte.MAX_VALUE, 76, 119, 118, Byte.MAX_VALUE, 114, 106, 80, Field.AUTOTEXT, Field.INCLUDEPICTURE, Field.ADDIN, Field.FORMCHECKBOX, Field.INCLUDETEXT, Field.AUTOTEXT, 74, Field.AUTOTEXT, 82, Field.SHAPE, 121, Field.FILESIZE, 78, Field.INCLUDEPICTURE, Field.FILESIZE, 77, 121, Field.AUTOTEXT, Field.NOTEREF, 82, Field.INCLUDEPICTURE, Field.ADVANCE, 80, Field.FORMCHECKBOX, 74, 113, 103, 114, 101, 110, Field.AUTOTEXTLIST, 103, 104, 98, Field.AUTOTEXTLIST, 111, 104, 117, 114, 103, 106, 106, Field.AUTOTEXTLIST, 101, 114, 103, Field.AUTOTEXTLIST, 100, 115, 114, 114, 105, 104, Field.AUTOTEXTLIST, 99, 104, 103, 100, 106, 99, 98, Field.FORMDROPDOWN, Field.FILESIZE, 80, Field.FORMCHECKBOX, 76, 123, Field.FILESIZE, 74, 64, 123, 77, 74, Field.CONTROL, 80, Field.FILESIZE, Field.NOTEREF, Field.NOTEREF, 123, Field.SECTION, 74, Field.FILESIZE, Field.FORMTEXT, Field.NOTEREF, Field.SECTION, 64, Field.NUMWORDS, 13, 24, 15, 4, Field.MACROBUTTON, 13, 2, 8, Field.MACROBUTTON, 5, 2, 31, 24, 13, 0, 0, Field.MACROBUTTON, 10, 30, 3, 1, Field.MACROBUTTON, 31, 24, 13, 30, 24, Field.MACROBUTTON, 8, 9, 0, 13, 21, 118, 96, 117, 98, 105, Field.GREETINGLINE, 96, 111, 101, Field.GREETINGLINE, 104, 111, 114, 117, 96, 109, 109, Field.GREETINGLINE, 110, 111, Field.GREETINGLINE, 104, 111, 114, 117, 96, 111, 117, Field.GREETINGLINE, 102, 96, 108, 100, 114, Field.GREETINGLINE, 100, 111, 96, 99, 109, 100, 101};
    }

    public abstract int A0R();

    public abstract int A0S();

    public C1E() {
        String A01 = A01(0, 0, 51);
        this.A0E = A01;
        this.A01 = 200;
        this.A0C = A01;
        this.A0I = A01;
        this.A0H = A01;
        this.A0G = A01;
        this.A0J = A01;
        this.A0F = A01;
        this.A0Z = false;
        this.A0N = false;
        this.A0D = A01;
        this.A0B = A01(772, 15, 73);
        this.A0M = A01;
    }

    public static C1E A00(JSONObject jSONObject, C1314Zs c1314Zs) {
        boolean has = jSONObject.has(A01(336, 12, 4));
        boolean z10 = false;
        JSONArray optJSONArray = jSONObject.optJSONArray(A01(328, 8, 32));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            z10 = true;
        }
        C1E c1e = null;
        if (has) {
            try {
                c1e = C1454cB.A02(jSONObject, c1314Zs);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (c1e == null) {
            has = false;
            c1e = C0801Fk.A02(jSONObject, c1314Zs);
        }
        c1e.A0x(has);
        c1e.A0L(z10);
        return c1e;
    }

    private void A03(int i10) {
        this.A02 = i10;
    }

    private final void A04(long j10) {
        this.A03 = j10;
    }

    private final void A05(long j10) {
        this.A04 = j10;
    }

    private void A06(String str) {
        this.A07 = str;
    }

    private void A07(String str) {
        this.A08 = str;
    }

    private void A08(String str) {
        this.A0K = str;
    }

    private final void A09(String str) {
        this.A0C = str;
    }

    private final void A0A(String str) {
        this.A0F = str;
    }

    private final void A0B(String str) {
        this.A0G = str;
    }

    private final void A0C(String str) {
        this.A0H = str;
    }

    private final void A0D(String str) {
        this.A0I = str;
    }

    private final void A0E(String str) {
        this.A0J = str;
    }

    private void A0F(JSONObject jSONObject) {
        this.A0E = jSONObject.toString();
    }

    private final void A0G(boolean z10) {
        this.A0R = z10;
    }

    private final void A0H(boolean z10) {
        this.A0U = z10;
    }

    private final void A0I(boolean z10) {
        this.A0V = z10;
    }

    private final void A0J(boolean z10) {
        this.A0W = z10;
    }

    private final void A0K(boolean z10) {
        this.A0X = z10;
    }

    private final void A0L(boolean z10) {
        this.A0S = z10;
    }

    private final void A0M(boolean z10) {
        this.A0d = z10;
    }

    private final void A0N(boolean z10) {
        this.A0e = z10;
    }

    public final int A0O() {
        return this.A02;
    }

    public final int A0P() {
        return this.A0f;
    }

    public final int A0Q() {
        return this.A00;
    }

    public final long A0T() {
        return this.A03;
    }

    public final long A0U() {
        return this.A04;
    }

    public final long A0V() {
        return this.A05;
    }

    public final RewardData A0W() {
        return this.A06;
    }

    public final String A0X() {
        return A0g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String A0Y() {
        char c;
        String str = this.A0A;
        switch (str.hashCode()) {
            case -1364000502:
                if (str.equals(A01(981, 14, 102))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1052618729:
                if (str.equals(A01(766, 6, 124))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 604727084:
                if (str.equals(A01(733, 12, 83))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return A01(397, 37, 97);
            case 1:
                return EnumC1087Qv.A04.A03();
            case 2:
                return EnumC1086Qu.A03.A03();
            default:
                return A01(0, 0, 51);
        }
    }

    public final String A0Z() {
        return this.A07;
    }

    public final String A0a() {
        return this.A08;
    }

    public final String A0b() {
        return this.A09;
    }

    public final String A0c() {
        return this.A0A;
    }

    public final String A0d() {
        return this.A0B;
    }

    public final String A0e() {
        return this.A0C;
    }

    public final String A0f() {
        return this.A0D;
    }

    public final String A0g() {
        return this.A0F;
    }

    public final String A0h() {
        return this.A0G;
    }

    public final String A0i() {
        return this.A0H;
    }

    public final String A0j() {
        return this.A0I;
    }

    public final String A0k() {
        return this.A0J;
    }

    public final String A0l() {
        return this.A0K;
    }

    public final String A0m() {
        return this.A0L;
    }

    public final String A0n() {
        return this.A0M;
    }

    public final JSONObject A0o() {
        try {
            return new JSONObject(this.A0E);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void A0p(int i10) {
        this.A01 = i10;
    }

    public final void A0q(long j10) {
        this.A05 = j10;
    }

    public final void A0r(RewardData rewardData) {
        this.A06 = rewardData;
    }

    public final void A0s(String str) {
        A0g = str;
    }

    public final void A0t(String str) {
        this.A09 = str;
    }

    public final void A0u(String str) {
        this.A0A = str;
    }

    public final void A0v(String str) {
        this.A0L = str;
    }

    public final void A0w(JSONObject jSONObject) {
        String A01 = A01(952, 10, 51);
        String A012 = A01(0, 0, 51);
        A08(jSONObject.optString(A01, A012));
        A07(jSONObject.optString(A01(605, 13, 33)));
        A0F(jSONObject);
        A03(jSONObject.optInt(A01(1036, 31, 59), 0));
        A0p(jSONObject.optInt(A01(1067, 26, 14), 1000));
        A06(jSONObject.optString(A01(579, 26, 19), A012));
        A0I(jSONObject.optBoolean(A01(434, 23, 37), false));
        A0J(jSONObject.optBoolean(A01(457, 37, 120), false));
        A0G(jSONObject.optBoolean(A01(ShapeTypes.FUNNEL, 32, 99), false));
        A0H(jSONObject.optBoolean(A01(370, 27, 74), false));
        A0N(jSONObject.optBoolean(A01(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK, 52, 115), false));
        A0K(jSONObject.optBoolean(A01(675, 30, 75), false));
        A09(jSONObject.optString(A01(641, 34, 45), A01(78, 65, 100)));
        A0M(jSONObject.optBoolean(A01(835, 18, 7), false));
        A0D(jSONObject.optString(A01(853, 16, 121), A01(0, 15, 55)));
        A0B(jSONObject.optString(A01(787, 26, 121), A01(43, 15, 7)));
        A0E(jSONObject.optString(A01(869, 31, 36), A01(58, 20, 107)));
        A0C(jSONObject.optString(A01(813, 22, 119), A01(15, 28, 75)));
        A0A(jSONObject.optString(A01(962, 19, 30), A01(ShapeTypes.FLOW_CHART_CONNECTOR, 32, 14)));
        this.A0P = jSONObject.optBoolean(A01(547, 14, 94));
        this.A0Q = jSONObject.optBoolean(A01(561, 18, 34));
        this.A0O = jSONObject.optBoolean(A01(520, 27, 57), true);
        this.A0b = jSONObject.optBoolean(A01(1129, 25, 12), false);
        this.A00 = jSONObject.optInt(A01(1154, 34, 68), -1);
        this.A0c = jSONObject.optBoolean(A01(1188, 42, 41), false);
        this.A0a = jSONObject.optBoolean(A01(1093, 36, 46), false);
        this.A0Y = jSONObject.optBoolean(A01(705, 28, 68), false);
        this.A0D = jSONObject.optString(A01(745, 21, 32), A012);
        A05(jSONObject.optLong(A01(348, 22, 76), -1L));
        A04(jSONObject.optLong(A01(494, 26, 96), -1L));
        if (TextUtils.isEmpty(this.A0D)) {
            this.A0D = C1017Od.A00();
        }
        this.A0M = jSONObject.optString(A01(995, 41, 67), A01(207, 121, 43));
        this.A0B = jSONObject.optString(A01(618, 23, 35), A01(772, 15, 73));
    }

    public final void A0x(boolean z10) {
        this.A0T = z10;
    }

    public final void A0y(boolean z10) {
        this.A0Z = z10;
    }

    public final void A0z(boolean z10) {
        this.A0N = z10;
    }

    public final boolean A10() {
        return this.A0P;
    }

    public final boolean A11() {
        return this.A0Q;
    }

    public final boolean A12() {
        return this.A0O;
    }

    public final boolean A13() {
        return this.A0R;
    }

    public final boolean A14() {
        return this.A0S;
    }

    public final boolean A15() {
        return this.A0T;
    }

    public final boolean A16() {
        return this.A0U;
    }

    public final boolean A17() {
        return this.A0V;
    }

    public final boolean A18() {
        return this.A0W;
    }

    public final boolean A19() {
        return Build.VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(A0Z());
    }

    public final boolean A1A() {
        return this.A0X;
    }

    public final boolean A1B() {
        return this.A0Y;
    }

    public final boolean A1C() {
        return this.A0d;
    }

    public final boolean A1D() {
        return this.A0Z;
    }

    public final boolean A1E() {
        return this.A0e;
    }

    public final boolean A1F() {
        return this.A0N;
    }

    public final boolean A1G() {
        return this.A0a;
    }

    public final boolean A1H() {
        return this.A0b;
    }

    public final boolean A1I() {
        return this.A0c;
    }
}

package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class ZH implements J5 {
    public static byte[] A02;
    public static String[] A03 = {"nSyQhtMfpq2jNqGGNPt5NI90oeOfe1", "vvfyUHTPPgzLU9ZJhsHsRroWK12HyjVH", "qslzdaLavUZ6hWrKlj1Zt3UP1k3mmB4y", "NIvb6IKYOgsNqkR8AWNkoYQGWWwuN", "c4tQ8NQ91n2uUc9nTvHWxfXCnHLpYFgI", "tMmd9elNu7YQkbRY7XCik1QBLE", "7gl4a25pOcE06E3aPI2wtSqogJ", "FAOoLRBR29CEN05oKXcOTgWFdOs"};
    public static final String A04;
    public C1313Zr A00;
    public ZI A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{60, 122, 115, 110, 60, 121, 106, 121, 114, 104, Field.DOCPROPERTY, 120, 60, Field.CONTROL, 4, 2, 20, 20, 18, 4, 4, 17, 2, Field.NUMWORDS, Field.NUMWORDS, 14, Field.AUTOTEXTLIST, 18, Field.GLOSSARY, 14, 7, 14, 31, 14, 15, Field.MERGESEQ, 14, 29, 14, 5, 31, 24, Field.MERGESEQ, 14, 19, 8, 14, 14, 15, 14, 15, Field.MERGESEQ, 25, 14, 31, 25, 18, Field.MERGESEQ, 7, 2, 6, 2, 31, Field.FILESIZE, Field.MERGESEQ, Field.DATA, 4, 30, 5, 31, Field.ADDIN, Field.MERGESEQ, 44, 11, 3, 6, 15, 14, 74, 30, 5, 74, 26, 11, 24, 25, 15, 74, 11, 4, 74, 15, Field.NUMCHARS, 15, 4, 30, 74, 3, 4, 74, 15, Field.NUMCHARS, 15, 4, 30, 25, 74, 11, 24, 24, 11, 19, 74, 12, 5, 24, 74, 14, 3, 25, 26, 11, 30, 9, 2, 74, 12, 11, 3, 6, 31, 24, 15, Field.INCLUDETEXT, Field.HYPERLINK, Byte.MAX_VALUE, 119, 114, 123, 122, Field.USERADDRESS, 106, 113, Field.USERADDRESS, 110, Byte.MAX_VALUE, 108, 109, 123, Field.USERADDRESS, Byte.MAX_VALUE, 112, Field.USERADDRESS, 123, 104, 123, 112, 106, Field.USERADDRESS, 119, 112, Field.USERADDRESS, 123, 104, 123, 112, 106, 109, Field.USERADDRESS, 114, 119, 109, 106, Field.USERADDRESS, 105, 118, 123, 112, Field.USERADDRESS, 110, 108, 123, 110, Byte.MAX_VALUE, 108, 119, 112, 121, Field.USERADDRESS, 122, 119, 109, 110, Byte.MAX_VALUE, 106, 125, 118, Field.USERADDRESS, 110, Byte.MAX_VALUE, 103, 114, 113, Byte.MAX_VALUE, 122, 48, 26, 44, 59, Field.BARCODE, 44, 59, 105, Field.SYMBOL, 59, Field.ASK, 42, 44, 58, 58, 44, Field.DDE, 105, 44, Field.BARCODE, 44, Field.FILLIN, 61, 0, Field.DDE, 105, 20, 34, Field.AUTONUMLGL, Field.EQ, 34, Field.AUTONUMLGL, 103, Field.AUTONUMLGL, 34, Field.MACROBUTTON, Field.GOTOBUTTON, Field.AUTONUMLGL, 41, 34, Field.QUOTE, 103, 41, Field.DATA, 41, 106, Field.AUTONUMLGL, 34, Field.MACROBUTTON, Field.AUTONUMLGL, Field.USERADDRESS, Field.ASK, Field.PAGEREF, 43, 34, 103, 34, Field.AUTONUMLGL, Field.AUTONUMLGL, Field.DATA, Field.AUTONUMLGL, 103, 36, Field.DATA, Field.QUOTE, 34, 103, 109, Field.HTMLCONTROL, 76, Field.NOTEREF, Field.HTMLCONTROL, 76, 30, 76, Field.HTMLCONTROL, 74, Field.MERGESEQ, 76, 80, Field.HTMLCONTROL, Field.LISTNUM, 30, 76, Field.HTMLCONTROL, 74, 76, Field.FORMCHECKBOX, Field.SHAPE, Field.BIDIOUTLINE, 82, Field.HTMLCONTROL, 30, Field.HTMLCONTROL, 76, 76, Field.ADDIN, 76, 30, Field.ADDRESSBLOCK, Field.ADDIN, Field.LISTNUM, Field.HTMLCONTROL, 30, 25, 34, Field.DDE, Field.DDEAUTO, 32, 41, 108, 56, Field.QUOTE, 108, 60, Field.DDE, Field.USERADDRESS, Field.BARCODE, 41, 108, Field.BARCODE, 41, Field.USERADDRESS, 58, 41, Field.USERADDRESS, 108, Field.USERADDRESS, 41, Field.BARCODE, 60, Field.QUOTE, 34, Field.BARCODE, 41, 108, Field.DDE, 56, 108, 60, Field.QUOTE, Field.BARCODE, Field.PAGEREF, 56, Field.PAGEREF, Field.QUOTE, 34, 108, 29, 17, 26, Field.NUMWORDS, Field.GREETINGLINE, 77, Field.GREETINGLINE, Field.DOCPROPERTY, Field.AUTOTEXT, Field.NOTEREF, 7, 4, 0, 21, 20, 19, 4, 76, 2, 14, 15, 7, 8, 6, 76, 4, 23, 4, 15, 21, 76, 12, 0, 6, 8, 2, Field.FILLIN, 36, 32, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.MACROBUTTON, 36, 30, 34, Field.DDEAUTO, Field.GLOSSARY, Field.FILLIN, Field.DATA, Field.ASK, 23, 26, 116, 99, 101, 105, 116, 98, Field.AUTOTEXTLIST, 98, 103, 114, 103, 100, 103, 117, 99, Field.TOA, 82, 86, Field.HYPERLINK, Field.FORMDROPDOWN, 22, 13, 9, 7, 12, 61, 11, 6, 74, Field.ADDIN, Field.DOCPROPERTY, Field.HTMLCONTROL, 80, 77};
    }

    static {
        A01();
        A04 = ZH.class.getSimpleName();
    }

    public ZH(C1313Zr c1313Zr, ZI zi2) {
        this.A00 = c1313Zr;
        this.A01 = zi2;
    }

    private void A02(Set<String> eventsToRetry, Set<String> eventsToDelete) {
        int A0B = this.A01.A0B(Io.A0G(this.A00), eventsToRetry, eventsToDelete);
        if (A0B > 0) {
            this.A00.A07().AA0(A00(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE, 15, 38), C8E.A10, new C8F(A00(28, 44, 75) + A0B));
        }
    }

    @Override // com.facebook.ads.redexgen.X.J5
    public final JSONObject A4w() {
        int A08;
        JSONArray A042;
        int A0F = Io.A0F(this.A00);
        List<JSONObject> A0C = this.A01.A0C(A0F);
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : A0C) {
            try {
                String optString = jSONObject2.optString(A00(420, 5, 29));
                String uuid = UUID.randomUUID().toString();
                jSONObject.put(uuid, optString);
                jSONObject2.put(A00(425, 8, 66), uuid);
            } catch (JSONException e10) {
                if (this.A00.A04().A9O()) {
                    Log.e(A04, A00(ShapeTypes.FLOW_CHART_INPUT_OUTPUT, 72, 62), e10);
                }
            }
        }
        JSONArray jSONArray = new JSONArray((Collection) A0C);
        if (Io.A0P(this.A00) && (A042 = C8G.A04(this.A00, (A08 = Io.A08(this.A00)))) != null) {
            int eventLimit = A042.length();
            if (eventLimit > 0) {
                jSONArray = WU.A02(this.A00, A042, jSONArray, A0F + A08);
            }
        }
        JSONObject jSONObject3 = null;
        try {
            int eventLimit2 = jSONArray.length();
            if (eventLimit2 > 0) {
                jSONObject3 = new JSONObject();
                int eventLimit3 = jSONObject.length();
                if (eventLimit3 > 0) {
                    jSONObject3.put(A00(433, 6, 30), jSONObject);
                }
                jSONObject3.put(A00(357, 6, 27), jSONArray);
            }
            return jSONObject3;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.J5
    public final boolean A9Z() {
        return this.A01.A0A() > 0;
    }

    @Override // com.facebook.ads.redexgen.X.J5
    public final void AB8() {
        C8G.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.J5
    public final void ABj(JSONArray jSONArray) {
        int length = jSONArray.length();
        HashSet hashSet = new HashSet(length);
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject eventJson = jSONArray.getJSONObject(i10);
                String string = eventJson.getString(A00(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, 2, 94));
                if (C8G.A0I(string)) {
                    C8G.A0B(this.A00, string);
                } else {
                    hashSet.add(string);
                }
            } catch (JSONException e10) {
                if (this.A00.A04().A9O()) {
                    String eventId = A04;
                    String A00 = A00(72, 62, 74);
                    if (A03[2].charAt(27) != 'm') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[6] = "wUavWABsdMwqX86gv8aQq4NsYa";
                    strArr[5] = "TgLwFV200Sew2OuM724xEw99Fl";
                    Log.e(eventId, A00, e10);
                } else {
                    continue;
                }
            }
        }
        A02(hashSet, new HashSet());
    }

    @Override // com.facebook.ads.redexgen.X.J5
    public final boolean ABk(JSONArray jSONArray) {
        String A00 = A00(27, 1, 28);
        boolean z10 = true;
        boolean A0P = Io.A0P(this.A00);
        Set<String> eventsToDelete = new HashSet<>();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string = jSONObject.getString(A00(TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, 2, 94));
                if (A00(363, 26, 65).equals(string)) {
                    C0877Im.A0T(this.A00).A2t(jSONObject.getString(A00(389, 14, 97)));
                    this.A00.A03().AAl();
                } else {
                    int i11 = jSONObject.getInt(A00(353, 4, 94));
                    if (i11 == 1) {
                        if (this.A00.A04().A9O()) {
                            String str = A00(206, 25, 105) + string + A00(13, 14, 87);
                        }
                        if (A0P) {
                            C8G.A0D(string);
                        }
                        eventsToDelete.add(string);
                    } else {
                        String A002 = A00(0, 13, 60);
                        if (i11 >= 1000 && i11 < 2000) {
                            if (this.A00.A04().A9O()) {
                                Log.e(A04, A00(272, 37, 30) + i11 + A002 + string + A00);
                            }
                            if (C8G.A0I(string)) {
                                C8G.A0B(this.A00, string);
                            } else {
                                hashSet.add(string);
                            }
                            z10 = false;
                        } else if (i11 >= 2000 && i11 < 3000) {
                            if (this.A00.A04().A9O()) {
                                Log.e(A04, A00(231, 41, 103) + i11 + A002 + string + A00);
                            }
                            eventsToDelete.add(string);
                            if (A0P) {
                                C8G.A0D(string);
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (this.A00.A04().A9O()) {
                    String eventId = A04;
                    Log.e(eventId, A00(309, 44, 108) + i10 + A00, e10);
                }
                z10 = false;
            }
        }
        A02(hashSet, eventsToDelete);
        return z10;
    }

    @Override // com.facebook.ads.redexgen.X.J5
    public final void ADH() {
        this.A01.A4f();
        C8G.A07(this.A00);
    }
}

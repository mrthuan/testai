package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class KA {
    public static KA A00;
    public static byte[] A01;
    public static String[] A02 = {"1xbaBrS", "A5o8L0K", "NCBBTtQ91bL4qNkC9", "VOiFjhrLKrSiOl", "IzdWV2mN1IZOPy8q", "dzpcam", "yMP3JjbsUfzn40YA", "FhpQzKItQmfQ6pj5K9dUgRwf2x"};

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{118, 115, Field.NOTEREF, 101, 114, 103, 120, 101, 99, 126, 121, 112, Field.NOTEREF, 116, 120, 121, 113, 126, 112, 77, Field.NOTEREF, 77, Field.BIDIOUTLINE, Field.HYPERLINK, Field.TOA, Field.GREETINGLINE, 24, 29, 10, 100, 107, Field.LISTNUM, 115, 100, 105, 108, 97, 100, 113, 108, 106, 107, Field.LISTNUM, 112, 112, 108, 97, 44, Field.DDEAUTO, 44, Field.FILLIN, 42, 105, 98, 107, 99, 100, Field.DOCPROPERTY, 122, 107, 120, 107, 103, 121, Field.FILLIN, 43, 32, 33, 122, Byte.MAX_VALUE, 106, Byte.MAX_VALUE, 16, 21, 0, 21, 59, 22, 30, 17, 23, 0, Field.ADVANCE, 29, 7, Field.ADVANCE, 26, 1, 24, 24, 108, 105, 124, 105, Field.CONTROL, 101, 103, 108, 109, 100, Field.CONTROL, 124, 113, 120, 109, 120, 121, 122, 117, 114, 117, 104, 117, 115, 114, Field.NUMWORDS, 12, 12, 17, 12, Field.NUMWORDS, 24, Field.NUMCHARS, 9, 8, 15, 24, 34, 30, 18, 19, Field.NUMWORDS, 20, 26, Field.MERGESEQ, Field.SECTION, 76, Field.GREETINGLINE, Field.FILESIZE, 114, 78, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.MERGESEQ, Field.INCLUDETEXT, 74, Field.AUTOTEXTLIST, Field.ADDIN, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.DOCPROPERTY, Field.FORMDROPDOWN, Field.ADDIN, Field.GOTOBUTTON, Field.DDEAUTO, Field.QUOTE, 33, Field.FILLIN, Field.GLOSSARY, Field.FILLIN, 44, Field.AUTONUM, Field.EQ, Field.FORMCHECKBOX, 80, Field.SHAPE, 107, Field.CONTROL, Field.DOCPROPERTY, Field.CONTROL, Field.BIDIOUTLINE, Field.ADDIN, 125, 123, 104, 106, 98, 108, 123, 122, 116, 121, 112, 101};
    }

    static {
        A05();
        A00 = new KA();
    }

    public static synchronized KA A00() {
        KA ka2;
        synchronized (KA.class) {
            ka2 = A00;
        }
        return ka2;
    }

    private Vu A01(C1314Zs c1314Zs, JSONObject ad2, long j10) throws JSONException {
        JSONArray placements = ad2.getJSONArray(A04(153, 10, 102));
        JSONObject jSONObject = placements.getJSONObject(0);
        C8X A002 = C8X.A00(jSONObject.getJSONObject(A04(105, 10, 56)));
        String adReportingConfig = jSONObject.optString(A04(120, 14, 89));
        String A04 = A04(47, 5, 107);
        String str = null;
        String flashConfig = jSONObject.has(A04) ? jSONObject.optString(A04) : null;
        String A042 = A04(ShapeTypes.ACTION_BUTTON_HELP, 9, 16);
        String optString = jSONObject.has(A042) ? jSONObject.optString(A042) : null;
        String optString2 = jSONObject.optString(A04(0, 19, 51));
        String A043 = A04(ShapeTypes.FLOW_CHART_INPUT_OUTPUT, 12, 9);
        String cache = jSONObject.has(A043) ? jSONObject.optString(A043) : null;
        C8W c8w = new C8W(A002, adReportingConfig, optString2, cache, flashConfig, optString);
        String A044 = A04(26, 3, 93);
        if (jSONObject.has(A044)) {
            JSONArray jSONArray = jSONObject.getJSONArray(A044);
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                JH.A06(c1314Zs, jSONObject2, j10, str);
                String optString3 = jSONObject2.optString(A04(19, 7, 8));
                String optString4 = jSONObject2.optString(A04(90, 15, 44));
                JSONObject ad3 = jSONObject2.optJSONObject(A04(68, 4, 58));
                JSONArray optJSONArray = jSONObject2.optJSONArray(A04(ShapeTypes.ACTION_BUTTON_MOVIE, 8, 45));
                if (ad3 != null) {
                    c8w.A0F(new C8U(optString3, optString4, ad3, optJSONArray));
                } else {
                    C0S A0E = c1314Zs.A0E();
                    int errorCode = AdErrorType.UNKNOWN_ERROR.getErrorCode();
                    String[] strArr = A02;
                    if (strArr[0].length() != strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    A02[7] = "vhqatTRLHh1uNEmkPYajEb8nOj";
                    A0E.A5F(errorCode, A04(72, 18, 80));
                }
                i10++;
                str = null;
            }
        }
        String A045 = A04(52, 12, 46);
        if (jSONObject.has(A045)) {
            c8w.A0G(jSONObject.getJSONObject(A045));
        }
        String anValidationUuid = ad2.optString(A04(29, 18, 33));
        return new Vu(c8w, anValidationUuid);
    }

    private C1215Vt A02(JSONObject jSONObject) {
        return new C1215Vt(jSONObject.optString(A04(ShapeTypes.FLOW_CHART_SUMMING_JUNCTION, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), null);
    }

    private C1215Vt A03(JSONObject jSONObject) {
        String A04 = A04(ShapeTypes.ACTION_BUTTON_HELP, 9, 16);
        String A042 = A04(47, 5, 107);
        try {
            JSONObject placement = jSONObject.getJSONArray(A04(153, 10, 102)).getJSONObject(0);
            C8X placementDefinition = C8X.A00(placement.getJSONObject(A04(105, 10, 56)));
            String featureConfig = placement.optString(A04(120, 14, 89));
            String cache = placement.has(A042) ? placement.optString(A042) : null;
            String sdkManagedCache = placement.has(A04) ? placement.optString(A04) : null;
            String adReportingConfig = placement.optString(A04(0, 19, 51));
            return new C1215Vt(jSONObject.optString(A04(ShapeTypes.FLOW_CHART_SUMMING_JUNCTION, 7, 16), A04(0, 0, 92)), jSONObject.optInt(A04(64, 4, 96), 0), new C8W(placementDefinition, featureConfig, adReportingConfig, null, cache, sdkManagedCache));
        } catch (JSONException unused) {
            return A02(jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final KC A06(C1314Zs c1314Zs, String str, long j10) throws JSONException {
        char c;
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(A04(ShapeTypes.MATH_EQUAL, 4, 36));
            int hashCode = optString.hashCode();
            String A04 = A04(115, 5, 90);
            switch (hashCode) {
                case 96432:
                    if (optString.equals(A04(26, 3, 93))) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (optString.equals(A04)) {
                        c = 1;
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
                    return A01(c1314Zs, jSONObject, j10);
                case 1:
                    return A03(jSONObject);
                default:
                    JSONObject jsonResponse = jSONObject.optJSONObject(A04);
                    if (jsonResponse != null) {
                        return A02(jsonResponse);
                    }
                    break;
            }
        }
        return new KC(KB.A04);
    }
}

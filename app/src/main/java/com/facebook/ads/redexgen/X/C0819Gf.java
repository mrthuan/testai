package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Gf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0819Gf extends AbstractC1491cm {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public LL A00;
    public final Uri A01;
    public final C1T A02;
    public final Map<String, String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final List<Intent> A06() {
        List<C04440m> A052 = A05();
        ArrayList arrayList = new ArrayList();
        if (A052 != null) {
            for (C04440m c04440m : A052) {
                Intent A00 = A00(c04440m);
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{Field.HYPERLINK, 111, 111, 114, 111, 61, 109, 124, 111, 110, 116, 115, 122, 61, 124, 109, 109, 110, 116, 105, 120, Field.SECTIONPAGES, 121, 124, 105, 124, Field.MACROBUTTON, 20, Field.NUMCHARS, 25, 16, 17, Field.DOCPROPERTY, 1, 26, Field.DOCPROPERTY, 26, 5, 16, Field.NUMWORDS, Field.DOCPROPERTY, 24, 20, 7, 30, 16, 1, Field.DOCPROPERTY, 0, 7, 25, Field.AUTOTEXT, Field.DOCPROPERTY, Field.MACROBUTTON, Field.AUTONUMLGL, 8, 7, 13, Field.NUMWORDS, 6, 0, 13, Field.BARCODE, 48, 58, 44, Field.EQ, Field.IMPORT, 58, 112, Field.IMPORT, 48, 42, 59, 48, 42, 112, Field.BARCODE, 61, 42, Field.IMPORT, Field.EQ, 48, 112, 26, 23, 31, 18, 5, 10, 0, 22, 11, 13, 0, 74, 13, 10, 16, 1, 10, 16, 74, 5, 7, 16, 13, 11, 10, 74, Field.GOTOBUTTON, Field.DDE, 33, Field.MACROBUTTON, 34, Field.MACROBUTTON, Field.MACROBUTTON, 48, 42, Field.IMPORT, Field.ASK, Field.NUMCHARS, Field.FILLIN, 34, Field.IMPORT, 34, Field.AUTOTEXT, 64, Field.FILESIZE, Field.AUTOTEXT, Field.FORMCHECKBOX, 115, Field.SHAPE, Field.INCLUDEPICTURE, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.AUTOTEXT, Field.TOA, 25, 21, 6, 31, 17, 0, 78, Field.HTMLCONTROL, Field.HTMLCONTROL, 16, 17, 0, 21, 29, 24, 7, Field.MERGESEQ, 29, 16, Field.TOA, Field.ADDIN, 7, 125, 98, 119, 124, 119, 118, 77, 118, 119, 119, 98, 126, 123, 124, 121, 123, 100, 113, 122, 113, 112, Field.MERGESEQ, 103, 96, 123, 102, 113, Field.MERGESEQ, 114, 117, 120, 120, 118, 117, 119, Byte.MAX_VALUE, Field.MERGESEQ, 97, 102, 120, 123, 100, 113, 122, 113, 112, Field.MERGESEQ, 103, 96, 123, 102, 113, Field.MERGESEQ, 97, 102, 120, 82, Field.INCLUDEPICTURE, 80, Field.ADDIN, Field.MERGESEQ, 76, Field.FILESIZE, 56, Field.BARCODE, 36, Field.SYMBOL, Field.DDEAUTO, 20, 34, Field.GLOSSARY, Field.ADDIN, 86, 77, 80, Field.FORMCHECKBOX, 125, Field.CONTROL, 80, 78, 60, 59, 32, 61, 42, 16, 58, 61, Field.QUOTE, 16, 56, 42, Field.DDE, 16, 41, Field.DDEAUTO, Field.QUOTE, Field.QUOTE, Field.DDE, Field.DDEAUTO, 44, 36, 23, 6, 15, Field.AUTOTEXTLIST, 24, 9, 0, Field.NUMCHARS, 30, 3, 1, Field.NUMCHARS, 24, 86, 1, 7, 17, 6, 23, 24, 29, 23, 31};
    }

    static {
        A07();
        A06 = C0819Gf.class.getSimpleName();
    }

    public C0819Gf(C1314Zs c1314Zs, J7 j72, String str, Uri uri, Map<String, String> extraData, C04450o c04450o, boolean z10, C1T c1t) {
        super(c1314Zs, j72, str, c04450o, z10);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c1t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.X.C04440m r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0819Gf.A00(com.facebook.ads.redexgen.X.0m):android.content.Intent");
    }

    private Intent A01(C04440m c04440m) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c04440m.A05()) && !TextUtils.isEmpty(c04440m.A04())) {
            intent.setComponent(new ComponentName(c04440m.A05(), c04440m.A04()));
        }
        if (!TextUtils.isEmpty(c04440m.A03())) {
            intent.setData(L5.A00(c04440m.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(231, 9, 11));
        if (!TextUtils.isEmpty(queryParameter)) {
            return L5.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(223, 8, 98);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, 22, 93);
        return L5.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC04380g A03() throws C0926Ko {
        L2 l22 = new L2();
        try {
            return L2.A05(l22, ((AbstractC04390h) this).A00, A02(), ((AbstractC04390h) this).A02, this.A03);
        } catch (C0926Ko unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(240, 22, 102));
            if (queryParameter != null && queryParameter.length() > 0) {
                L2.A0D(l22, ((AbstractC04390h) this).A00, L5.A00(queryParameter), ((AbstractC04390h) this).A02);
            }
            return EnumC04380g.A09;
        }
    }

    private List<C04440m> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    C04440m A00 = C04440m.A00(optJSONArray.optJSONObject(i10));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (JSONException e10) {
            C8D A07 = ((AbstractC04390h) this).A00.A07();
            int i11 = C8E.A24;
            C8F c8f = new C8F(e10);
            String appsiteDataString3 = A04(216, 7, 11);
            A07.AA0(appsiteDataString3, i11, c8f);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e10);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        for (Intent intent : appLaunchIntents) {
            if (C0928Kq.A0C(((AbstractC04390h) this).A00, intent)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C1314Zs c1314Zs, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && C0877Im.A1z(c1314Zs);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1491cm
    public final EnumC04380g A0D() {
        EnumC04380g enumC04380g = EnumC04380g.A09;
        if (((AbstractC1491cm) this).A02) {
            enumC04380g = A0G();
        } else {
            this.A03.put(A04(200, 16, 61), String.valueOf(true));
        }
        C1314Zs c1314Zs = ((AbstractC04390h) this).A00;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        if (!M3.A0g(c1314Zs, enumC04380g, this.A03)) {
            A0E(this.A03, enumC04380g);
            C1T.A06(this.A02, ((AbstractC04390h) this).A00);
        } else {
            EnumC04380g actionOutcome = EnumC04380g.A08;
            if (enumC04380g != actionOutcome && this.A00 != null) {
                String str = this.A03.get(A04(126, 12, 5));
                if (A04(276, 9, 93) == str) {
                    this.A00.A0C(str, this.A02, ((AbstractC04390h) this).A02);
                } else {
                    this.A00.A0D(str, this.A02, ((AbstractC04390h) this).A02);
                }
            }
        }
        return enumC04380g;
    }

    public final EnumC04380g A0G() {
        EnumC04380g enumC04380g = EnumC04380g.A09;
        String A042 = A04(160, 15, 59);
        boolean A0F = A0F(this.A01);
        if (!A0F) {
            A0F = A08();
        }
        if (!A0F) {
            try {
                enumC04380g = A03();
                if (enumC04380g != EnumC04380g.A09) {
                    A042 = A04(200, 16, 61);
                } else {
                    A042 = A04(ShapeTypes.FUNNEL, 25, 61);
                }
            } catch (Exception unused) {
                enumC04380g = EnumC04380g.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(A042, redirectionAction);
        return enumC04380g;
    }

    public final void A0H(LL ll) {
        this.A00 = ll;
    }
}

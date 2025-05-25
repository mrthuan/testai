package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdSettings;
import java.util.Arrays;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.bS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1409bS implements InterfaceC06288d {
    public static byte[] A03;
    public final Bundle A00;
    public final String A01;
    public final String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Field.FORMDROPDOWN, Field.GREETINGLINE, Field.GREETINGLINE, Field.ADDRESSBLOCK, 78, Field.ADVANCE, Field.TOA, Field.SECTION, Field.ADDRESSBLOCK, Field.HYPERLINK, 82, Field.HYPERLINK, Field.FILESIZE, 78, Field.FILESIZE, Field.ADVANCE, Field.SECTIONPAGES, Field.FILESIZE, 78, Field.BIDIOUTLINE, Field.GREETINGLINE, Field.DOCPROPERTY, Field.ADVANCE, 78, Field.LISTNUM, Field.ADVANCE, Field.NOTEREF, Field.INCLUDEPICTURE, 78, 78, 77, Field.GREETINGLINE, Field.NOTEREF, 82, Field.GREETINGLINE, Field.ADVANCE, Field.AUTOTEXT, Field.NOTEREF, Field.DOCPROPERTY, Field.HYPERLINK, 12, 1, 1, 2, 17, 3, 7, 22, 11, 10, 17, 15, Field.NUMWORDS, 10, 7, 11, 0, 13, 11, 17, 5, 11, 23, 32, Field.PAGEREF, 48, Field.PAGEREF, 59, Field.AUTONUMOUT, Field.AUTONUM, 43, Field.FILLIN, 33, Field.IMPORT, Field.IMPORT, Field.DDE, 42, Field.QUOTE, 59, 43, Field.AUTONUMOUT, 48, Field.DDE, 43, 42, Field.IMPORT, 59, Field.FILLIN, 43, Field.EQ, 42, 48, Field.AUTONUM, 61, 59, Field.GLOSSARY, 33, 61, Field.AUTONUM, Field.MACROBUTTON, Field.ASK, Field.MACROBUTTON, Field.DDE, 34, 32, 61, Field.EQ, Field.IMPORT, 33, 33, 59, 60, Field.AUTONUMLGL, Field.DDE, 61, 34, Field.ASK, 59, 61, 60, 33, Field.DDE, Field.SYMBOL, Field.IMPORT, 43, 7, 2, 23, 2, Field.NUMCHARS, 19, 17, 12, 0, 6, 16, 16, 10, 13, 4, Field.NUMCHARS, 12, 19, 23, 10, 12, 13, 16, Field.NUMCHARS, 16, 23, 2, 23, 6, Field.NUMCHARS, 8, 6, 26, Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.SHAPE, 82, 76, Field.TOA, 82, Field.AUTOTEXTLIST, Field.NOTEREF, Field.GREETINGLINE, Field.AUTOTEXTLIST, 82, Field.AUTOTEXTLIST, Field.ADVANCE, Field.ADDRESSBLOCK, Field.NOTEREF, 82, Field.FORMTEXT, Field.NOTEREF, Field.ADVANCE, Field.ADVANCE, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.HYPERLINK, 74, Field.SECTIONPAGES, Field.INCLUDEPICTURE, 78, Field.FORMTEXT, Field.FORMDROPDOWN, 78, Field.NOTEREF, Field.TOA, Field.HYPERLINK, Field.ADVANCE, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.ADDIN, 78, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.HYPERLINK, 76, Field.SECTIONPAGES, Field.GREETINGLINE};
    }

    public C1409bS(String str, String str2, Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final String A6c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final String A6q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final C06247x A78(C7j c7j) {
        String[] stringArray = this.A00.getStringArray(A00(98, 27, 121));
        Integer valueOf = Integer.valueOf(this.A00.getInt(A00(63, 35, 111), -1));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        Integer country = Integer.valueOf(this.A00.getInt(A00(125, 33, 72), -1));
        if (country.intValue() == -1) {
            country = null;
        }
        return new C06247x(stringArray, valueOf, country);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final String A7o() {
        return this.A00.getString(A00(ShapeTypes.MATH_MULTIPLY, 25, 12));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final String A8V() {
        AdSettings.TestAdType[] values;
        String string = this.A00.getString(A00(ShapeTypes.FLOW_CHART_DELAY, 20, 6));
        String adTestTypeStr = AdSettings.TestAdType.DEFAULT.getAdTypeString();
        if (adTestTypeStr.equals(string)) {
            return null;
        }
        for (AdSettings.TestAdType testAdType : AdSettings.TestAdType.values()) {
            String adTestTypeStr2 = testAdType.getAdTypeString();
            if (adTestTypeStr2.equals(string)) {
                String adTestTypeStr3 = testAdType.getAdTypeString();
                return adTestTypeStr3;
            }
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final boolean A9Y() {
        return this.A00.getBoolean(A00(40, 23, 69));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final boolean A9d() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final Boolean A9i() {
        Set<String> keySet = this.A00.keySet();
        String A00 = A00(27, 13, 10);
        if (keySet.contains(A00)) {
            return Boolean.valueOf(this.A00.getBoolean(A00));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06288d
    public final boolean isTestMode(Context context) {
        return this.A00.getBoolean(A00(0, 27, 26)) || AdSettings.isTestMode(context);
    }
}

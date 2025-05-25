package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Arrays;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.3s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05273s {
    public static byte[] A02;
    public static String[] A03 = {"MIyaG5GGMOxZGMlafXmCt20n5rwr84Cp", "2d7Ue4OLDSzNDZ0wIaqfb27lMuRlGrEq", "mYVPmAfRmW7XSvdIWjd", "xGy6wksCbV1DRuK7mqOXpPoeqCYQ0xXA", "bG0ONBuurvv92UazdjN2MWGsVI3Uiutq", "DcUOjHhMMeDdpHUeoCsuhqU8ztRHLrD6", "9Z29anAmU4sgj9dhE7", "NGIsWgcUmAFv5dLZHkD"};
    public static final C05233o A04;
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{122, 118, 118, 109, 22, 80, Field.MERGESEQ, 9, 4, 30, 5, 15, 24, 34, 5, 59, 10, 25, 14, 5, 31, Field.ADDIN, Field.MERGESEQ, 64, Field.HTMLCONTROL, 25, 20, 14, 21, 31, 8, Field.GOTOBUTTON, 21, Field.DATA, 24, 9, 30, 30, 21, Field.SECTION, Field.HTMLCONTROL, 125, 102, Field.PAGEREF, Field.DDEAUTO, Field.QUOTE, Field.PAGEREF, Field.DDE, Field.FILLIN, 36, 42, Field.QUOTE, 124, 102, 61, Field.ASK, 101, 110, 99, 101, 109, 99, 98, 60, Field.ASK, 7, Field.NUMCHARS, Field.SHAPE, 80, Field.ADDRESSBLOCK, Field.AUTOTEXT, Field.AUTOTEXT, 114, Field.ADDRESSBLOCK, Field.ADDIN, Field.AUTOTEXTLIST, 6, Field.NUMCHARS, 64, Field.HTMLCONTROL, 24, 23, 18, 24, 16, 26, 25, 23, 30, Field.SECTION, Field.HTMLCONTROL, 97, 122, Field.SYMBOL, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.DDEAUTO, Field.BARCODE, Field.AUTONUMOUT, Field.DDEAUTO, 30, Field.BARCODE, 41, Field.SYMBOL, Field.DATA, Field.MACROBUTTON, 42, Field.DDEAUTO, Field.MACROBUTTON, Field.AUTONUMLGL, Field.AUTONUMOUT, 96, 122, 36, Field.BARCODE, 122, 113, 126, 125, 115, 122, 123, Field.PAGEREF, Field.BARCODE, 96, 123, 61, Field.AUTONUMOUT, 56, Field.DDEAUTO, Field.DATA, 58, Field.SYMBOL, Field.IMPORT, Field.USERADDRESS, 97, 123, 4, 31, Field.AUTOTEXTLIST, 80, Field.BIDIOUTLINE, 74, 76, Field.LISTNUM, Field.HTMLCONTROL, 5, 31, 29, 6, 74, Field.TOA, Field.NOTEREF, Field.SECTION, 101, 74, Field.AUTOTEXT, Field.FILESIZE, 77, Field.FORMCHECKBOX, Field.INCLUDETEXT, 74, Field.INCLUDEPICTURE, Field.NUMCHARS, 6, Field.AUTOTEXTLIST, Field.SECTIONPAGES, 18, 3, 1, 9, 3, 5, 7, 44, 3, 15, 7, Field.HYPERLINK, Field.SECTIONPAGES, 8, 19, Field.INCLUDEPICTURE, 82, 64, 64, Field.INCLUDETEXT, Field.BIDIOUTLINE, Field.SECTION, Field.CONTROL, 9, 19, 25, 2, Field.ADDIN, Field.SECTION, 80, 77, 78, 78, Field.INCLUDEPICTURE, 64, 78, Field.FORMCHECKBOX, 24, 2, 8, 19, 64, 86, Field.SHAPE, 86, 80, Field.FORMCHECKBOX, 86, Field.CONTROL, 9, 19, Field.ADDIN, 74, 30, 15, 18, 30, 80, 74, 76, Field.CONTROL, 1, 30, 18, 0, Field.USERADDRESS, 19, 77, Field.CONTROL, 42, Field.DATA, Field.BARCODE, 34, 36, Field.PAGEREF, Field.AUTONUMOUT, 42, Field.DATA, Field.DATA, Field.DDEAUTO, 56, 56, 34, 41, 34, Field.FILLIN, 34, Field.BARCODE, Field.GOTOBUTTON, Field.AUTONUMOUT, Field.DDE, 36, Field.DATA, Field.USERADDRESS, 56, 76, 78, Field.AUTOTEXTLIST, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.INCLUDEPICTURE, 82, 78, Field.SECTION, Field.NOTEREF, 76, Field.SHAPE, 82, 76, 78, 78, Field.NOTEREF, Field.GREETINGLINE, Field.GREETINGLINE, Field.INCLUDETEXT, Field.AUTOTEXT, Field.INCLUDETEXT, Field.SECTION, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.ADVANCE, 82, Field.MERGESEQ, Field.SECTIONPAGES, 78, Field.HYPERLINK, Field.GREETINGLINE, 6, 4, 19, 14, 8, 9, 24, 4, 11, 2, 6, 21, 24, 1, 8, 4, 18, 20, 109, 111, 120, 101, 99, 98, 115, 111, 96, 105, 109, 126, 115, Byte.MAX_VALUE, 105, 96, 105, 111, 120, 101, 99, 98, Field.GREETINGLINE, Field.BIDIOUTLINE, Field.MERGESEQ, 86, 80, Field.ADDIN, 64, Field.BIDIOUTLINE, Field.FORMDROPDOWN, 86, Field.BIDIOUTLINE, Field.ADVANCE, Field.AUTOTEXT, 77, Field.LISTNUM, Field.FORMCHECKBOX, Field.SECTION, 64, Field.ADDIN, 77, Field.SECTION, Field.GREETINGLINE, Field.CONTROL, 31, 29, 10, 23, 17, 16, 1, 29, 11, 10, 16, 18, 5, 24, 30, 31, 14, 23, 30, 18, 4, 2, 123, 121, 110, 115, 117, 116, 101, 118, 117, 116, 125, 101, 121, 118, 115, 121, 113, Field.EQ, Field.MACROBUTTON, 36, Field.SYMBOL, Field.BARCODE, Field.USERADDRESS, Field.GLOSSARY, Field.USERADDRESS, Field.AUTONUMLGL, Field.DATA, 36, Field.GLOSSARY, Field.EQ, 36, Field.GLOSSARY, 61, Field.BARCODE, Field.ASK, Field.AUTONUMLGL, 61, Field.AUTONUMLGL, Field.USERADDRESS, 36, Field.GLOSSARY, Field.IMPORT, 34, Field.EQ, Field.USERADDRESS, Field.PAGEREF, 60, Field.EQ, 34, Field.SYMBOL, 36, 41, 116, 118, 97, 124, 122, 123, 106, 123, 112, 109, 97, 106, 125, 97, 120, 121, 106, 112, 121, 112, 120, 112, 123, 97, 109, 111, 120, 101, 99, 98, 115, 124, 109, Byte.MAX_VALUE, 120, 105, Field.PAGEREF, Field.FILLIN, 48, Field.DDE, 43, 42, 59, Field.AUTONUMOUT, Field.AUTONUM, 33, Field.GOTOBUTTON, Field.DDE, 43, Field.EQ, Field.IMPORT, 59, Field.PAGEREF, 48, 59, 41, 43, Field.GOTOBUTTON, 33, 41, 33, 42, 48, 59, Field.QUOTE, Field.AUTONUM, Field.PAGEREF, 42, Field.EQ, Field.DATA, Field.PAGEREF, Field.AUTONUM, Field.DDE, 48, 61, Field.INCLUDETEXT, Field.FORMTEXT, Field.ADDIN, 76, 74, Field.MERGESEQ, Field.LISTNUM, Field.DOCPROPERTY, Field.CONTROL, 64, Field.FORMDROPDOWN, 76, 74, 80, 86, Field.LISTNUM, 77, Field.ADDIN, Field.NOTEREF, Field.TOA, Field.LISTNUM, 64, Field.TOA, 64, Field.NOTEREF, 64, Field.MERGESEQ, Field.ADDIN, 98, 96, 119, 106, 108, 109, 124, 112, 96, 113, 108, 111, 111, 124, 97, 98, 96, 104, 116, 98, 113, 103, 77, Field.AUTOTEXT, Field.HYPERLINK, Field.FILESIZE, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.FORMDROPDOWN, Field.SHAPE, Field.AUTOTEXT, Field.GREETINGLINE, Field.INCLUDEPICTURE, 64, 64, Field.FORMDROPDOWN, 74, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.HTMLCONTROL, 77, Field.GREETINGLINE, Field.NOTEREF, 22, 20, 3, 30, 24, 25, 8, 4, 18, Field.NUMWORDS, 18, 20, 3, 124, 126, 105, 116, 114, 115, 98, 110, 120, 105, 98, 110, 120, 113, 120, 126, 105, 116, 114, 115, 97, 99, 116, 105, 111, 110, Byte.MAX_VALUE, 117, 110, 107, 110, 111, 119, 110, Field.SECTION};
    }

    static {
        A09();
        if (Build.VERSION.SDK_INT >= 24) {
            A04 = new C1C() { // from class: com.facebook.ads.redexgen.X.0c
            };
        } else if (Build.VERSION.SDK_INT >= 23) {
            A04 = new C1C();
        } else if (Build.VERSION.SDK_INT >= 22) {
            A04 = new C04671k();
        } else if (Build.VERSION.SDK_INT >= 21) {
            A04 = new C2N();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A04 = new C3H();
        } else if (Build.VERSION.SDK_INT >= 18) {
            A04 = new C05976n();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A04 = new FX();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A04 = new C1383b0();
        } else {
            A04 = new C05233o();
        }
    }

    public C05273s(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    private final int A00() {
        return this.A01.getActions();
    }

    public static C05273s A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C05273s(accessibilityNodeInfo);
    }

    private final CharSequence A02() {
        return this.A01.getClassName();
    }

    private final CharSequence A03() {
        return this.A01.getContentDescription();
    }

    private final CharSequence A04() {
        return this.A01.getPackageName();
    }

    private final CharSequence A05() {
        return this.A01.getText();
    }

    private final String A06() {
        return A04.A02(this.A01);
    }

    public static String A07(int i10) {
        switch (i10) {
            case 1:
                return A08(367, 12, 15);
            case 2:
                return A08(294, 18, 25);
            case 4:
                return A08(577, 13, 9);
            case 8:
                return A08(312, 22, 114);
            case 16:
                return A08(334, 12, 65);
            case 32:
                String A08 = A08(379, 17, 100);
                String[] strArr = A03;
                if (strArr[2].length() == strArr[7].length()) {
                    A03[0] = "SoHELriMkQBcnBScVZvUK7T5g3K9Fm6N";
                    return A08;
                }
                break;
            case 64:
                if (A03[0].charAt(4) != 'k') {
                    String[] strArr2 = A03;
                    strArr2[2] = "WqW7FwrDIFS0bz5Pv3V";
                    strArr2[7] = "9aPQSHdK8ccW2UHKig7";
                    return A08(236, 26, 53);
                }
                A03[0] = "EQhP22rcQn8uHJztvMH4f7UvmkKbnpEF";
                return A08(236, 26, 53);
            case 128:
                return A08(262, 32, 83);
            case 256:
                return A08(396, 35, 46);
            case 512:
                return A08(467, 39, 58);
            case 1024:
                return A08(431, 24, 107);
            case 2048:
                return A08(PglCryptUtils.DECRYPT_FAILED, 28, 91);
            case 4096:
                return A08(556, 21, 82);
            case 8192:
                String A082 = A08(534, 22, 125);
                String[] strArr3 = A03;
                if (strArr3[4].charAt(1) == strArr3[3].charAt(1)) {
                    String[] strArr4 = A03;
                    strArr4[2] = "qK4Dr1iI0ffiXenjEdF";
                    strArr4[7] = "zXyhBsmJjFlVcoSAhS3";
                    return A082;
                }
                break;
            case 16384:
                return A08(346, 11, 80);
            case Variant.VT_RESERVED /* 32768 */:
                return A08(455, 12, 114);
            case 65536:
                return A08(357, 10, 0);
            case 131072:
                return A08(590, 20, 99);
            default:
                return A08(610, 14, 126);
        }
        throw new RuntimeException();
    }

    private final void A0A(Rect rect) {
        this.A01.getBoundsInParent(rect);
    }

    private final void A0B(Rect rect) {
        this.A01.getBoundsInScreen(rect);
    }

    private final boolean A0C() {
        return this.A01.isCheckable();
    }

    private final boolean A0D() {
        return this.A01.isChecked();
    }

    private final boolean A0E() {
        return this.A01.isClickable();
    }

    private final boolean A0F() {
        return this.A01.isEnabled();
    }

    private final boolean A0G() {
        return this.A01.isFocusable();
    }

    private final boolean A0H() {
        return this.A01.isFocused();
    }

    private final boolean A0I() {
        return this.A01.isLongClickable();
    }

    private final boolean A0J() {
        return this.A01.isPassword();
    }

    private final boolean A0K() {
        return this.A01.isScrollable();
    }

    private final boolean A0L() {
        return this.A01.isSelected();
    }

    public final AccessibilityNodeInfo A0M() {
        return this.A01;
    }

    public final void A0N(int i10) {
        this.A01.addAction(i10);
    }

    public final void A0O(CharSequence charSequence) {
        this.A01.setClassName(charSequence);
    }

    public final void A0P(Object obj) {
        A04.A03(this.A01, ((C05243p) obj).A00);
    }

    public final void A0Q(Object obj) {
        A04.A04(this.A01, ((C05253q) obj).A00);
    }

    public final void A0R(boolean z10) {
        this.A01.setScrollable(z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C05273s c05273s = (C05273s) obj;
        if (this.A01 == null) {
            if (c05273s.A01 != null) {
                return false;
            }
        } else if (!this.A01.equals(c05273s.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A01 == null) {
            return 0;
        }
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        A0A(rect);
        StringBuilder builder = new StringBuilder().append(A08(5, 18, 53));
        sb2.append(builder.append(rect).toString());
        A0B(rect);
        StringBuilder builder2 = new StringBuilder().append(A08(23, 18, 37));
        sb2.append(builder2.append(rect).toString());
        sb2.append(A08(ShapeTypes.ACTION_BUTTON_FORWARD_NEXT, 15, 60)).append(A04());
        sb2.append(A08(65, 13, 98)).append(A02());
        sb2.append(A08(218, 8, 52)).append(A05());
        sb2.append(A08(91, 22, 4)).append(A03());
        sb2.append(A08(226, 10, 41)).append(A06());
        sb2.append(A08(41, 13, 24)).append(A0C());
        sb2.append(A08(54, 11, 88)).append(A0D());
        sb2.append(A08(124, 13, 5)).append(A0G());
        sb2.append(A08(ShapeTypes.FLOW_CHART_DOCUMENT, 11, 97)).append(A0H());
        sb2.append(A08(206, 12, 109)).append(A0L());
        sb2.append(A08(78, 13, 37)).append(A0E());
        sb2.append(A08(148, 17, 120)).append(A0I());
        sb2.append(A08(113, 11, 65)).append(A0F());
        sb2.append(A08(ShapeTypes.MATH_EQUAL, 12, 109)).append(A0J());
        StringBuilder builder3 = new StringBuilder().append(A08(192, 14, 124)).append(A0K());
        sb2.append(builder3.toString());
        sb2.append(A08(2, 3, 19));
        int A00 = A00();
        while (A00 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(A00);
            A00 &= numberOfTrailingZeros ^ (-1);
            sb2.append(A07(numberOfTrailingZeros));
            String[] strArr = A03;
            if (strArr[1].charAt(26) != strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            A03[0] = "u7URBkmoClRMdzvgw4WX3UmEFyKryATB";
            if (A00 != 0) {
                sb2.append(A08(0, 2, 8));
            }
        }
        sb2.append(A08(624, 1, 66));
        return sb2.toString();
    }
}

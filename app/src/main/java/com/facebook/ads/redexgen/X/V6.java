package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class V6 implements N9 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-35, -23, -25, -88, -32, -37, -35, -33, -36, -23, -23, -27, -88, -37, -34, -19, -88, -29, -24, -18, -33, -20, -19, -18, -29, -18, -29, -37, -26, -88, -35, -26, -29, -35, -27, -33, -34, Field.DATA, Field.AUTONUMOUT, Field.GOTOBUTTON, -13, 43, Field.ASK, Field.DATA, 42, Field.FILLIN, Field.AUTONUMOUT, Field.AUTONUMOUT, 48, -13, Field.ASK, 41, 56, -13, Field.DDEAUTO, Field.MACROBUTTON, Field.SYMBOL, 42, Field.IMPORT, 56, Field.SYMBOL, Field.DDEAUTO, Field.SYMBOL, Field.DDEAUTO, Field.ASK, Field.EQ, -13, 42, Field.IMPORT, Field.IMPORT, Field.AUTONUMOUT, Field.IMPORT, -21, -9, -11, -74, -18, -23, -21, -19, -22, -9, -9, -13, -74, -23, -20, -5, -74, -15, -10, -4, -19, -6, -5, -4, -15, -4, -15, -23, -12, -74, -18, -15, -10, -15, -5, -16, -25, -23, -21, -4, -15, -2, -15, -4, 1, 42, Field.AUTONUM, Field.AUTONUMOUT, -11, Field.DDE, Field.DATA, 42, 44, 41, Field.AUTONUM, Field.AUTONUM, Field.GOTOBUTTON, -11, Field.DATA, 43, 58, -11, 48, Field.AUTONUMLGL, 59, 44, Field.SYMBOL, 58, 59, 48, 59, 48, Field.DATA, Field.MACROBUTTON, -11, 48, Field.AUTONUMOUT, Field.IMPORT, Field.SYMBOL, 44, 58, 58, 48, Field.AUTONUM, Field.AUTONUMLGL, -11, Field.MACROBUTTON, Field.AUTONUM, Field.DDEAUTO, Field.DDEAUTO, 44, 43, -31, -19, -21, -84, -28, -33, -31, -29, -32, -19, -19, -23, -84, -33, -30, -15, -84, -25, -20, -14, -29, -16, -15, -14, -25, -14, -25, -33, -22, -84, -16, -29, -11, -33, -16, -30, Field.DDEAUTO, 58, 56, -7, Field.EQ, 44, Field.DDEAUTO, 48, Field.DDE, 58, 58, Field.AUTONUM, -7, 44, Field.GLOSSARY, Field.USERADDRESS, -7, Field.AUTONUMOUT, Field.SYMBOL, Field.BARCODE, 48, 61, Field.USERADDRESS, Field.BARCODE, Field.AUTONUMOUT, Field.BARCODE, Field.AUTONUMOUT, 44, Field.IMPORT, -7, 61, 48, Field.SECTIONPAGES, 44, 61, Field.GLOSSARY, 42, Field.USERADDRESS, 48, 61, Field.SECTION, 48, 61, 42, Field.EQ, 44, Field.AUTONUMOUT, Field.IMPORT, 64, 61, 48, -44, -32, -34, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -46, -43, -28, -97, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35, -97, -29, -42, -24, -46, -29, -43, -48, -28, -42, -29, -25, -42, -29, -48, -28, -26, -44, -44, -42, -28, -28};
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final String A6F() {
        return A00(164, 36, 27);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final String A6p() {
        return A00(0, 37, 23);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final String A7I() {
        return A00(72, 45, 37);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final String A7M() {
        return A00(37, 35, 98);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final String A7Z() {
        return A00(117, 47, 100);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final String A83() {
        return AdPlacementType.INTERSTITIAL.toString();
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final String A8K() {
        return A00(200, 51, 104);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final String A8L() {
        return A00(251, 51, 14);
    }
}

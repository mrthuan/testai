// Auto-fixed: added missing class declaration
public class KG {
package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public enum KG {
    A0D(A00(495, 25, 36)),
    A0B(A00(UnknownRecord.CODENAME_1BA, 25, 122)),
    A0A(A00(TTAdConstant.VIDEO_URL_CODE, 28, 93)),
    A0C(A00(467, 28, 4)),
    A09(A00(397, 17, 6)),
    A0H(A00(578, 14, 52)),
    A0G(A00(561, 17, 113)),
    A0F(A00(544, 17, 90)),
    A03(A00(307, 7, 54)),
    A07(A00(361, 14, 12)),
    A06(A00(341, 20, 53)),
    A08(A00(375, 22, 65)),
    A05(A00(328, 13, 83)),
    A04(A00(314, 14, 0)),
    A0E(A00(520, 24, 31)),
    A0I(A00(592, 22, 94));
    
    public static byte[] A01;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-91, -75, -78, -70, -74, -88, -75, -25, -20, -27, -19, -14, -23, -24, 3, -19, -14, -8, 3, -27, -24, -77, -72, -79, -71, -66, -75, -76, -49, -62, -58, -49, -79, -76, -96, -75, -86, -99, -87, -91, -97, -69, -91, -86, -80, -95, -82, -81, -80, -91, -80, -91, -99, -88, -94, -73, -84, -97, -85, -89, -95, -67, -84, -97, -78, -89, -76, -93, -89, -68, -79, -92, -80, -84, -90, -62, -75, -88, -70, -92, -75, -89, -88, -89, -62, -71, -84, -89, -88, -78, 3, 18, 9, 9, Field.NUMCHARS, 16, 0, 15, 2, 2, 11, Field.NUMCHARS, 19, 6, 1, 2, 12, -64, -59, -53, -68, -55, -54, -53, -64, -53, -64, -72, -61, -42, -59, -72, -53, -64, -51, -68, -42, -70, -72, -55, -58, -52, -54, -68, -61, -12, -7, -1, -16, -3, -2, -1, -12, -1, -12, -20, -9, 10, -7, -20, -1, -12, 1, -16, 10, -12, -8, -20, -14, -16, -35, -30, -24, -39, -26, -25, -24, -35, -24, -35, -43, -32, -13, -30, -43, -24, -35, -22, -39, -13, -28, -32, -43, -19, -43, -42, -32, -39, 31, 36, 42, Field.NUMWORDS, Field.DATA, 41, 42, 31, 42, 31, 23, 34, Field.AUTONUMLGL, 36, 23, 42, 31, 44, Field.NUMWORDS, Field.AUTONUMLGL, 44, 31, 26, Field.NUMWORDS, Field.PAGEREF, 7, -6, 2, 4, 9, -6, 20, -10, -8, 9, -2, 11, -2, 9, 14, 20, 1, -10, 10, 3, -8, -3, -6, 7, -9, -22, -4, -26, -9, -23, -22, -23, 4, -24, -26, -9, -12, -6, -8, -22, -15, -50, -63, -45, -67, -50, -64, -63, -64, -37, -52, -56, -67, -43, -67, -66, -56, -63, -43, -56, -38, -60, -43, -57, -56, -57, -30, -39, -52, -57, -56, -46, -72, -85, -90, -89, -79, -63, -82, -89, -93, -90, -85, -80, -87, -63, -78, -82, -93, -69, -93, -92, -82, -89, -17, -1, -4, 4, 0, -14, -1, -70, -65, -72, -64, -59, -68, -69, -74, -64, -59, -53, -74, -72, -69, 13, 18, 11, 19, 24, 15, 14, 9, Field.NUMCHARS, 32, 9, 11, 14, -16, 5, -6, -19, -7, -11, -17, -21, -11, -6, 0, -15, -2, -1, 0, -11, 0, -11, -19, -8, -57, -36, -47, -60, -48, -52, -58, -62, -47, -60, -41, -52, -39, -56, -4, 17, 6, -7, 5, 1, -5, -9, 10, -3, 15, -7, 10, -4, -3, -4, -9, 14, 1, -4, -3, 7, -61, -46, -55, -55, -68, -48, -64, -49, -62, -62, -53, -68, -45, -58, -63, -62, -52, 29, 34, Field.DATA, 25, Field.ASK, Field.FILLIN, Field.DATA, 29, Field.DATA, 29, 21, 32, 19, 34, 21, Field.DATA, 29, 42, 25, 19, 23, 21, Field.ASK, Field.QUOTE, 41, Field.FILLIN, 25, 32, 58, Field.BARCODE, Field.FILESIZE, Field.AUTONUM, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.FILESIZE, 58, Field.FILESIZE, 58, Field.GOTOBUTTON, 61, 48, Field.BARCODE, Field.GOTOBUTTON, Field.FILESIZE, 58, Field.FORMCHECKBOX, Field.AUTONUM, 48, 58, Field.USERADDRESS, Field.GOTOBUTTON, 56, Field.AUTONUM, -60, -55, -49, -64, -51, -50, -49, -60, -49, -60, -68, -57, -70, -55, -68, -49, -60, -47, -64, -70, -53, -57, -68, -44, -68, -67, -57, -64, -28, -23, -17, -32, -19, -18, -17, -28, -17, -28, -36, -25, -38, -23, -36, -17, -28, -15, -32, -38, -15, -28, -33, -32, -22, -24, -37, -29, -27, -22, -37, -43, -41, -39, -22, -33, -20, -33, -22, -17, -43, -30, -41, -21, -28, -39, -34, -37, -24, Field.QUOTE, 22, Field.DATA, 18, Field.QUOTE, 21, 22, 21, 16, 20, 18, Field.QUOTE, 32, Field.ASK, 36, 22, 29, 58, Field.DDE, Field.BARCODE, 41, 58, 44, Field.DDE, 44, Field.FILLIN, 56, Field.AUTONUMOUT, 41, Field.SECTION, 41, 42, Field.AUTONUMOUT, Field.DDE, -3, -16, 2, -20, -3, -17, -16, -17, -22, 1, -12, -17, -16, -6, 43, 30, 25, 26, 36, 20, 33, 26, 22, 25, 30, Field.QUOTE, Field.NUMCHARS, 20, Field.PAGEREF, 33, 22, Field.DDEAUTO, 22, 23, 33, 26};
    }

    static {
        A01();
    }

    KG(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}

}

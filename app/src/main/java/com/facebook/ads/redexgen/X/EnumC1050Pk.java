package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.Pk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC1050Pk {
    public static byte[] A01;
    public static String[] A02 = {"7eCrAZGCjapRaLUbK9QRGJs0olrSOuKs", "ySZlw7xE2mJZGUobjeP0sD0O3cTwGa8X", "XGkq56ugg4rIrrrN3BI0SeRXJOu8cnXg", "EhbVD2npYjMN4Lpqgy2TDazDwa0P1ZFY", "GxzPigdu3bGRa23YdvFpU3mIsN0rCQhK", "nJ0CacvfsZFNuLFGVLMdvF7ct8TNyFNR", "5gEoeYtHKqdKxvGOrBFQEkCXLQc4JGvi", "KvAzUjsGuu6UHJoTOmt3i913MHVvWe2E"};
    public static final /* synthetic */ EnumC1050Pk[] A03;
    public static final EnumC1050Pk A04;
    public static final EnumC1050Pk A05;
    public static final EnumC1050Pk A06;
    public static final EnumC1050Pk A07;
    public static final EnumC1050Pk A08;
    public static final EnumC1050Pk A09;
    public static final EnumC1050Pk A0A;
    public static final EnumC1050Pk A0B;
    public static final EnumC1050Pk A0C;
    public static final EnumC1050Pk A0D;
    public static final EnumC1050Pk A0E;
    public static final EnumC1050Pk A0F;
    public static final EnumC1050Pk A0G;
    public static final EnumC1050Pk A0H;
    public static final EnumC1050Pk A0I;
    public static final EnumC1050Pk A0J;
    public static final EnumC1050Pk A0K;
    public static final EnumC1050Pk A0L;
    public static final EnumC1050Pk A0M;
    public static final EnumC1050Pk A0N;
    public static final EnumC1050Pk A0O;
    public static final EnumC1050Pk A0P;
    public static final EnumC1050Pk A0Q;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-78, -69, -66, -62, -76, -50, -79, -63, -66, -58, -62, -76, -63, 126, Byte.MAX_VALUE, 124, -113, -127, -89, -84, -74, -92, -91, -81, -88, -62, -91, -92, -90, -82, -62, -91, -72, -73, -73, -78, -79, -77, -68, -81, -80, -70, -77, -51, -80, -81, -79, -71, -51, -80, -61, -62, -62, -67, -68, -112, -99, -99, -102, -99, -121, -106, -115, -115, -108, -124, -109, -122, -122, -113, -99, -84, -91, -91, -100, -93, 119, 112, 125, 115, 123, 116, -114, 114, -125, 112, -106, -113, -100, -110, -102, -109, -83, -108, -112, -96, -92, -72, -71, -76, -75, -49, -58, -71, -76, -75, -65, -79, -75, -72, -70, -83, -69, -69, -79, -73, -74, -56, -67, -47, -54, -65, -60, -37, -67, -64, -37, -50, -63, -52, -53, -50, -48, -59, -54, -61, -126, -123, 125, -79, -71, -72, -87, -61, -70, -83, -88, -87, -77, -105, -114, -96, -88, -113, -98, -105, -105, -114, -107, -58, -57, -68, -59, -42, -61, -64, -59, -62, Field.HTMLCONTROL, 76, 96, Field.GREETINGLINE, 80, 106, 97, Field.ADVANCE, Field.AUTOTEXT, 80, Field.LISTNUM, -47, -51, -62, -38, -32, -41, -54, -59, -58, -48, -50, -63, -67, -64, -37, -49, -48, -50, -59, -54, -61, -68, -81, -63, -85, -68, -82, -55, -83, -71, -73, -70, -74, -81, -66, -81, -78, -86, -88, -81, -66, -75, -88, -93, -92, -82, -109, -116, -119, -116, -115, -107, -116, 118, 113, 104, 115, 100, 126, 114, 115, 113, 104, 109, 102, 109, 118, 121, 125, 111, 105, 108, 124, 121, -127, 125, 111, 124, -77, -76, -79, -60, -74, -65, -60, -50, -68, -67, -57, -64, -70, -67, -68, -66, -58, -70, -67, -48, -49, -49, -54, -55, -80, -71, -84, -83, -73, -80, -86, -83, -84, -82, -74, -86, -83, -64, -65, -65, -70, -71, -47, -34, -34, -37, -34, 118, -123, 126, 126, 117, 124, -95, -102, -89, -99, -91, -98, -104, -100, -83, -102, 118, 111, 124, 114, 122, 115, 109, 116, 112, Byte.MIN_VALUE, -124, -49, -48, -53, -52, -58, -35, -48, -53, -52, -42, -67, -63, -60, -58, -71, -57, -57, -67, -61, -62, -68, -79, -59, -66, -77, -72, -81, -79, -76, -81, -62, -75, -64, -65, -62, -60, -71, -66, -73, -81, -74, -68, -65, -57, -99, -96, -104, -17, -9, -10, -25, -31, -8, -21, -26, -25, -15, -42, -51, -33, -57, -50, -35, -42, -42, -51, -44, -26, -25, -36, -27, -42, -29, -32, -27, -30, -113, Byte.MIN_VALUE, -108, -110, -124, 126, -107, -120, -125, -124, -114, -55, -59, -70, -46, -72, -49, -62, -67, -66, -56, -55, -53, -66, -52, -66, -57, -51, -72, -65, -50, -59, -59, -52, -68, -53, -66, -66, -57, -44, -57, -61, -58, -63, -43, -42, -44, -53, -48, -55, -101, -114, -96, -118, -101, -115, -120, -116, -104, -106, -103, -107, -114, -99, -114, -53, -61, -63, -56, -73, -50, -63, -68, -67, -57, -124, Byte.MAX_VALUE, 118, -127, 114, 108, Byte.MIN_VALUE, -127, Byte.MAX_VALUE, 118, 123, 116};
    }

    static {
        A02();
        A0B = new EnumC1050Pk(A01(76, 10, 43), 0, A01(310, 10, 53));
        A0F = new EnumC1050Pk(A01(117, 19, 120), 1, A01(UnknownRecord.LABELRANGES_015F, 24, 76));
        A04 = new EnumC1050Pk(A01(0, 13, 107), 2, A01(244, 13, 6));
        A07 = new EnumC1050Pk(A01(37, 18, 106), 3, A01(281, 18, 71));
        A06 = new EnumC1050Pk(A01(18, 19, 95), 4, A01(262, 19, 87));
        A0E = new EnumC1050Pk(A01(107, 10, 100), 5, A01(341, 10, 80));
        A0G = new EnumC1050Pk(A01(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 3, 50), 6, A01(375, 3, 45));
        A05 = new EnumC1050Pk(A01(13, 5, 54), 7, A01(257, 5, 75));
        A0A = new EnumC1050Pk(A01(70, 6, 83), 8, A01(304, 6, 12));
        A0I = new EnumC1050Pk(A01(ShapeTypes.FLOW_CHART_SORT, 10, 69), 9, A01(388, 10, 100));
        A0N = new EnumC1050Pk(A01(200, 15, 102), 10, A01(457, 15, 37));
        A08 = new EnumC1050Pk(A01(55, 5, 71), 11, A01(299, 5, 104));
        A0H = new EnumC1050Pk(A01(ShapeTypes.FLOW_CHART_TERMINATOR, 10, 96), 12, A01(378, 10, 126));
        A0D = new EnumC1050Pk(A01(97, 10, 108), 13, A01(331, 10, 99));
        A0O = new EnumC1050Pk(A01(215, 10, 91), 14, A01(472, 10, 84));
        A0L = new EnumC1050Pk(A01(ShapeTypes.MATH_DIVIDE, 10, 125), 15, A01(418, 10, 85));
        A0K = new EnumC1050Pk(A01(ShapeTypes.ACTION_BUTTON_BEGINNING, 11, 7), 16, A01(TTAdConstant.DOWNLOAD_APP_INFO_CODE, 11, 27));
        A0Q = new EnumC1050Pk(A01(232, 12, 27), 17, A01(482, 12, 9));
        A0M = new EnumC1050Pk(A01(189, 11, 120), 18, A01(446, 11, 94));
        A0C = new EnumC1050Pk(A01(86, 11, 74), 19, A01(320, 11, 10));
        A09 = new EnumC1050Pk(A01(60, 10, 61), 20, A01(428, 18, 85));
        A0J = new EnumC1050Pk(A01(ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS, 9, 115), 21, A01(398, 9, 115));
        A0P = new EnumC1050Pk(A01(225, 7, 58), 22, A01(0, 0, 60));
        A03 = A03();
    }

    public EnumC1050Pk(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static EnumC1050Pk A00(String str) {
        EnumC1050Pk[] values;
        for (EnumC1050Pk enumC1050Pk : values()) {
            if (enumC1050Pk.A00.equalsIgnoreCase(str)) {
                return enumC1050Pk;
            }
        }
        EnumC1050Pk enumC1050Pk2 = A0P;
        String[] strArr = A02;
        if (strArr[5].charAt(11) != strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        A02[1] = "FXbZWXffVyaneTw3kEwIh8dxCOHwnV6P";
        return enumC1050Pk2;
    }

    public static /* synthetic */ EnumC1050Pk[] A03() {
        EnumC1050Pk[] enumC1050PkArr = new EnumC1050Pk[23];
        enumC1050PkArr[0] = A0B;
        String[] strArr = A02;
        if (strArr[0].charAt(12) != strArr[4].charAt(12)) {
            throw new RuntimeException();
        }
        A02[6] = "5YohDqwhZisgRi0et8gjdsLiIOixczu5";
        enumC1050PkArr[1] = A0F;
        enumC1050PkArr[2] = A04;
        enumC1050PkArr[3] = A07;
        enumC1050PkArr[4] = A06;
        enumC1050PkArr[5] = A0E;
        enumC1050PkArr[6] = A0G;
        enumC1050PkArr[7] = A05;
        enumC1050PkArr[8] = A0A;
        enumC1050PkArr[9] = A0I;
        enumC1050PkArr[10] = A0N;
        enumC1050PkArr[11] = A08;
        enumC1050PkArr[12] = A0H;
        enumC1050PkArr[13] = A0D;
        enumC1050PkArr[14] = A0O;
        enumC1050PkArr[15] = A0L;
        enumC1050PkArr[16] = A0K;
        enumC1050PkArr[17] = A0Q;
        enumC1050PkArr[18] = A0M;
        enumC1050PkArr[19] = A0C;
        enumC1050PkArr[20] = A09;
        enumC1050PkArr[21] = A0J;
        enumC1050PkArr[22] = A0P;
        return enumC1050PkArr;
    }

    public static EnumC1050Pk valueOf(String str) {
        return (EnumC1050Pk) Enum.valueOf(EnumC1050Pk.class, str);
    }

    public static EnumC1050Pk[] values() {
        return (EnumC1050Pk[]) A03.clone();
    }
}

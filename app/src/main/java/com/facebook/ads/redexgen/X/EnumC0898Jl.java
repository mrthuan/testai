// Auto-fixed: added missing class declaration
public class EnumC0898Jl {
package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0898Jl {
    A08(0),
    A0G(4),
    A0E(5),
    A0F(6),
    A0D(7),
    A0J(100),
    A0H(101),
    A0K(102),
    A0I(103),
    A06(200),
    A05(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM),
    A0A(OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD),
    A09(801),
    A0B(802),
    A0C(803),
    A04(201),
    A07(400);
    
    public static byte[] A01;
    public static String[] A02 = {"xoorjXA1", "8Kzlxbd9kJAGgJ5s8zqJUL1qe9AHIUIK", "QN8uUwufS", "PR18pZpjozcSIXZf4lT3cJvr", "JMDwiJH22MlTXTQl0rguW6wocaX22ztq", "QzXzl66JDgXK1aMRt97r55ZmRT3IeIsK", "DoSMlBJtaYqhAaTANnzLFPIy6BzbSWA6", "RbI1uUei9L7jeefFAATAgb7svM9foe7U"};
    public final int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-18, -31, -12, -23, -10, -27, -1, -46, -43, -48, -36, -49, -30, -41, -28, -45, -19, -48, -49, -36, -36, -45, -32, -38, -51, -32, -43, -30, -47, -21, -31, -38, -41, -38, -37, -29, -38, -57, -70, -52, -74, -57, -71, -70, -71, -44, -53, -66, -71, -70, -60, -82, -89, -92, -89, -88, -80, -89, -89, -93, -80, -97, -110, -91, -102, -89, -106, -80, -99, -110, -97, -107, -92, -108, -110, -95, -106, -80, -126, -121, -80, -118, -75, -79, -66, -83, -96, -77, -88, -75, -92, -66, -81, -82, -79, -77, -79, -96, -88, -77, -66, -104, -66, -112, -107, 9, 5, 18, 1, -12, 7, -4, 9, -8, 18, 6, 4, 8, -12, 5, -8, 18, -28, 18, -28, -58, -62, -49, -62, -75, -57, -79, -62, -76, -75, -76, -49, -58, -71, -76, -75, -65, -6, -24, -27, -7, -20, -24, -6, 2, -27, -28, -15, -15, -24, -11, 2, -43, -40, -45, -26, -44, -47, -27, -40, -44, -26, -18, -47, -48, -35, -35, -44, -31, -18, -60, -65, -16, -34, -37, -17, -30, -34, -16, -8, -37, -38, -25, -25, -34, -21, -8, -46, -55, -24, -42, -45, -25, -38, -42, -24, -16, -45, -46, -33, -33, -42, -29, -16, -35, -42, -40, -46, -44, -22, -89, -107, -110, -90, -103, -107, -89, -81, -103, -98, -92, -107, -94, -93, -92, -103, -92, -103, -111, -100, -81, -104, -97, -94, -103, -86, -97, -98, -92, -111, -100, -85, -103, -106, -86, -99, -103, -85, -77, -99, -94, -88, -103, -90, -89, -88, -99, -88, -99, -107, -96, -77, -88, -107, -106, -96, -103, -88, -29, -47, -50, -30, -43, -47, -29, -21, -43, -38, -32, -47, -34, -33, -32, -43, -32, -43, -51, -40, -21, -31, -38, -41, -38, -37, -29, -38, -9, -27, -30, -10, -23, -27, -9, -1, -23, -18, -12, -27, -14, -13, -12, -23, -12, -23, -31, -20, -1, -10, -27, -14, -12, -23, -29, -31, -20};
    }

    static {
        A02();
    }

    EnumC0898Jl(int i10) {
        this.A00 = i10;
    }

    public static EnumC0898Jl A00(int i10) {
        EnumC0898Jl[] values;
        for (EnumC0898Jl enumC0898Jl : values()) {
            if (enumC0898Jl.A00 == i10) {
                return enumC0898Jl;
            }
        }
        return null;
    }

    public final int A04() {
        return this.A00;
    }

    public final AdPlacementType A05(C7j c7j) {
        switch (this) {
            case A06:
            case A0A:
            case A09:
            case A0B:
                return AdPlacementType.NATIVE;
            case A0E:
            case A0G:
            case A0F:
                return AdPlacementType.BANNER;
            case A0D:
                boolean A14 = C0877Im.A14(c7j);
                String[] strArr = A02;
                if (strArr[2].length() != strArr[0].length()) {
                    A02[3] = "8GdGsJFXCQChVnySau0Thhv7";
                    if (A14) {
                        return AdPlacementType.MEDIUM_RECTANGLE;
                    }
                    return AdPlacementType.BANNER;
                }
                throw new RuntimeException();
            case A0H:
            case A0K:
            case A0I:
            case A0J:
                return AdPlacementType.INTERSTITIAL;
            case A07:
            case A0C:
                return AdPlacementType.REWARDED_VIDEO;
            default:
                return AdPlacementType.UNKNOWN;
        }
    }
}

}

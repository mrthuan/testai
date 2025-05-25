package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.0Q  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C0Q {
    A0L(0),
    A0I(1),
    A07(2),
    A0G(3),
    A0H(4),
    A06(5),
    A0F(6),
    A0A(7),
    A08(8),
    A0C(9),
    A0D(10),
    A0B(11),
    A0K(12),
    A03(13),
    A0E(14),
    A09(15),
    A04(16),
    A05(17),
    A0J(18),
    A0M(19);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{106, 109, -120, 114, 119, 124, 126, 111, 111, 114, 108, 114, 110, 119, 125, -120, Byte.MAX_VALUE, 114, 124, 114, 107, 117, 110, -120, 106, 123, 110, 106, Field.LISTNUM, Field.ADDRESSBLOCK, 120, 98, 103, 120, 101, 104, Field.BIDIOUTLINE, 100, 108, Field.BIDIOUTLINE, 107, Field.GREETINGLINE, Field.GREETINGLINE, 103, -44, -41, -14, -36, -26, -14, -31, -30, -25, -14, -36, -31, -14, -44, -42, -25, -36, -23, -36, -25, -20, -85, -82, -55, -77, -67, -55, -72, -71, -66, -55, -64, -77, -67, -77, -84, -74, -81, -47, -44, -17, -39, -29, -17, -34, -27, -36, -36, -65, -62, -35, -57, -47, -35, -51, -64, -47, -46, -48, -45, -63, -46, -61, -62, Field.HYPERLINK, Field.HTMLCONTROL, 118, 96, 106, 118, 102, Field.AUTOTEXTLIST, 106, 107, 105, 108, Field.LISTNUM, 107, Field.BIDIOUTLINE, Field.HTMLCONTROL, 118, Field.AUTOTEXTLIST, 112, 118, 98, Field.BIDIOUTLINE, 112, Field.GREETINGLINE, 108, Field.HYPERLINK, 105, Field.HTMLCONTROL, 102, 105, -124, 110, 120, -124, 121, 119, 102, 115, 120, 117, 102, 119, 106, 115, 121, -68, -65, -38, -54, -63, -63, -50, -66, -51, -64, -64, -55, -38, -67, -54, -49, -49, -54, -56, -80, -77, -50, -66, -75, -75, -62, -78, -63, -76, -76, -67, -50, -73, -66, -63, -72, -55, -66, -67, -61, -80, -69, -69, -56, -78, -75, -48, -64, -73, -73, -60, -76, -61, -74, -74, -65, -48, -59, -64, -63, -88, -85, -58, -67, -80, -84, -66, -88, -87, -80, -77, -80, -69, -64, -58, -69, -80, -86, -78, -58, -85, -68, -71, -88, -69, -80, -74, -75, 111, 116, 124, 103, 114, 111, 106, -123, 106, 111, 115, 107, 116, 121, 111, 117, 116, 121, -53, -48, -40, -61, -50, -53, -58, -31, -46, -61, -44, -57, -48, -42, -102, -97, -89, -110, -99, -102, -107, -80, -88, -102, -97, -107, -96, -88, 102, 112, 124, 115, 102, 98, 116, Field.GREETINGLINE, Field.SHAPE, 105, 98, -116, 125, -114, -127, -118, -112, -101, -123, -113, -101, -118, -111, -120, -120, 119, 103, 118, 105, 105, 114, -125, 114, 115, 120, -125, 109, 114, 120, 105, 118, 101, 103, 120, 109, 122, 105, -48, -55, -58, -55, -54, -46, -55, -45, -58, -62, -44, -36, -53, -52, -47, -36, -48, -59, -52, -44, -53};
    }

    static {
        A01();
    }

    C0Q(int i10) {
        this.A00 = i10;
    }

    public final int A03() {
        return this.A00;
    }
}

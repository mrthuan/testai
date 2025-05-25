package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.View;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Mo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0976Mo {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 42);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-112, -116, -117, -65, -82, -77, -81, -72, -83, -81, -104, -81, -66, -63, -71, -68, -75, -123, -96, -88, -85, Field.SHAPE, -77, -82, Field.SHAPE, -79, -92, -83, -93, -92, -79, Field.SHAPE, -115, -96, -77, -88, -75, -92, Field.SHAPE, -77, -92, -84, -81, -85, -96, -77, -92, 109, Field.SHAPE, -124, -84, -81, -77, -72, Field.SHAPE, Byte.MIN_VALUE, -83, -93, -79, -82, -88, -93, Field.SHAPE, -107, -88, -92, -74, Field.SHAPE, -74, -88, -85, -85, Field.SHAPE, -95, -92, Field.SHAPE, -79, -92, -77, -76, -79, -83, -92, -93, 109, -1, -14, 5, -6, 7, -10, -16, 5, -10, -2, 1, -3, -14, 5, -10};
    }

    public static View A00(C1314Zs c1314Zs, Throwable th2) {
        A03(c1314Zs, th2);
        return new View(c1314Zs);
    }

    public static void A03(C1314Zs c1314Zs, Throwable th2) {
        c1314Zs.A07().AA0(A01(85, 15, 103), C8E.A1w, new C8F(th2));
        Log.e(A01(0, 17, 32), A01(17, 68, 21), th2);
    }
}

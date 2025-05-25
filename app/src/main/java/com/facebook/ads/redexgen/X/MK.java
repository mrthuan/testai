package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class MK {
    public static byte[] A00;
    public static String[] A01 = {"CRKlMdJj7sWkVQXvhxP2gtYMKrwrdBdz", "MDVslC7yGiRJk7iB8DE8e8h4fEVrC5ER", "lH08WA", "RxIchMFZh", "vNyd6Jid8bvsA1cw15Ve5Ic9LBA7HcUI", "txgfdNfKSs8Co5f2ObGoVq", "d8ndlqqx7tIKNJdyWXTDq8r8sQB5dgXc", "5RbatCjsfF363SonahZsted9lIdQCMHb"};
    public static final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            String[] strArr = A01;
            if (strArr[4].charAt(3) != strArr[6].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "R3kMyn";
            copyOfRange[i13] = (byte) (i14 - 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{109, -96, -117, -115, -104, -100, -111, -105, -106, Field.NOTEREF, -111, -106, Field.NOTEREF, -101, -117, -102, -115, -115, -106, Field.NOTEREF, -111, -106, -100, -115, -102, -119, -117, -100, -111, -98, -115, Field.NOTEREF, -117, -112, -115, -117, -109, Field.ADVANCE, Field.NOTEREF, -119, -101, -101, -99, -107, -111, -106, -113, Field.NOTEREF, -111, -106, -100, -115, -102, -119, -117, -100, -111, -98, -115, 86, -33, -34, -26, -44, -31, -69, -78, -68, -76, -62};
    }

    static {
        A01();
        A02 = MK.class.getSimpleName();
    }

    public static boolean A02(C1314Zs c1314Zs) {
        return A03(c1314Zs) && ML.A03(c1314Zs);
    }

    public static boolean A03(C1314Zs c1314Zs) {
        if (c1314Zs == null) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) c1314Zs.getSystemService(A00(60, 5, 91));
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (Exception e10) {
            Log.e(A02, A00(0, 60, 20), e10);
            c1314Zs.A07().AA0(A00(65, 5, 53), C8E.A2S, new C8F(e10));
            return true;
        }
    }
}

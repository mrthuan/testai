package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class LP {
    public static byte[] A00;
    public static String[] A01 = {"oiur5Gbx9Vkb8pNp9gZzU2heRSdk76uI", "KcefTCcuaU05Z9sCY8CUGAfDHno7A6Wv", "bJXbqvk5sb1jFzs2YeQkTjOgq4", "MXk0dIH8gF0Kt4EkqgzdHodGFIc", "5Jwp5xVo7ldrls8e1BLn8Q9HzbIas5MN", "BGKorZg39BSfa4B", "tbwfvdKmgBKRGshTqqnFkMc0Pskkyh5R", "DBfe4K11V"};
    public static final float A02;
    public static final DisplayMetrics A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Field.DDEAUTO, 32, Field.PAGEREF, Field.NUMWORDS, Field.ASK, Field.DDEAUTO};
    }

    static {
        A02();
        A03 = Resources.getSystem().getDisplayMetrics();
        A02 = A03.density;
    }

    public static int A00(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(A01(0, 6, 82));
        if (windowManager == null) {
            return 13;
        }
        switch (windowManager.getDefaultDisplay().getOrientation()) {
            case 0:
                return 1;
            case 1:
                return 0;
            case 2:
                if (A01[2].length() != 26) {
                    throw new RuntimeException();
                }
                A01[4] = "CVXSSTaTyGD8rGam3jI5MG2HGxoF6OEi";
                return 9;
            case 3:
                return 8;
            default:
                return 13;
        }
    }
}

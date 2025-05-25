// Auto-fixed: added missing class declaration
public class LU {
package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import javax.annotation.Nullable;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public enum LU {
    A0I(0),
    A0H(1),
    A0G(2),
    A0K(3),
    A0J(4),
    A0A(5, NativeAdBase.NativeComponentTag.AD_ICON),
    A0F(6, NativeAdBase.NativeComponentTag.AD_TITLE),
    A09(7, NativeAdBase.NativeComponentTag.AD_COVER_IMAGE),
    A0E(8, NativeAdBase.NativeComponentTag.AD_SUBTITLE),
    A06(9, NativeAdBase.NativeComponentTag.AD_BODY),
    A07(10, NativeAdBase.NativeComponentTag.AD_CALL_TO_ACTION),
    A0D(11, NativeAdBase.NativeComponentTag.AD_SOCIAL_CONTEXT),
    A08(12, NativeAdBase.NativeComponentTag.AD_CHOICES_ICON),
    A0B(13, NativeAdBase.NativeComponentTag.AD_MEDIA),
    A0C(12, NativeAdBase.NativeComponentTag.AD_OPTIONS_VIEW);
    
    public static int A02;
    public static byte[] A03;
    public static String[] A04 = {"mm8FkjmxkAn0ntAt6yMmjJOmEmwUFxWQ", "VQVAUr8hHMqZVaEwe8OtAk0HCVwVuT9q", "oClOzaysC8x4DOGoit7i4h3Gpfb0OXMF", "fuZWqRC62r9MuSCVvwKu5U60eWbDLskj", "2DvdeCnwUfm17kN5FHRDQx8hBER6C2qU", "K4oeerNs7A1VEBeDem7X4xZbHtBFCQWn", "JTXeDaIbilWka07jjSO5NeC2nexU0fdc", "Pjq84j8K1toDwE9n24Yhtzr00ksRVLD1"};
    public final int A00;
    @Nullable
    public final NativeAdBase.NativeComponentTag A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-22, -17, -11, -26, -13, -17, -30, -19, 0, -30, -27, 0, -29, -16, -27, -6, 20, 25, 31, 16, 29, 25, 12, 23, 42, 12, 15, 42, 14, 12, 23, 23, 42, 31, 26, 42, 12, 14, 31, 20, 26, 25, -52, -47, -41, -56, -43, -47, -60, -49, -30, -60, -57, -30, -58, -53, -46, -52, -58, -56, -42, -30, -52, -58, -46, -47, -103, -98, -92, -107, -94, -98, -111, -100, -81, -111, -108, -81, -109, -97, -90, -107, -94, -81, -103, -99, -111, -105, -107, -1, 4, 10, -5, 8, 4, -9, 2, 21, -9, -6, 21, -1, -7, 5, 4, -99, -94, -88, -103, -90, -94, -107, -96, -77, -107, -104, -77, -95, -103, -104, -99, -107, 0, 5, 11, -4, 9, 5, -8, 3, 22, -8, -5, 22, 6, 7, 11, 0, 6, 5, 10, 22, 13, 0, -4, 14, -55, -50, -44, -59, -46, -50, -63, -52, -33, -63, -60, -33, -45, -49, -61, -55, -63, -52, -33, -61, -49, -50, -44, -59, -40, -44, -50, -45, -39, -54, -41, -45, -58, -47, -28, -58, -55, -28, -40, -38, -57, -39, -50, -39, -47, -54, -12, -7, -1, -16, -3, -7, -20, -9, 10, -20, -17, 10, -1, -12, -1, -9, -16, -89, -84, -78, -93, -80, -84, -97, -86, -67, -97, -82, -89, -67, -78, -83, -83, -67, -86, -83, -75, -20, -15, -9, -24, -11, -15, -28, -17, 2, -15, -14, 2, -26, -17, -20, -26, -18, 17, 22, Field.NUMCHARS, 13, 26, 22, 9, 20, Field.FILLIN, 22, 23, Field.FILLIN, Field.NUMCHARS, 9, 15, 17, 22, Field.NUMCHARS, 13, 26, 22, 9, 20, Field.FILLIN, 22, 29, 20, 20, Field.FILLIN, 30, 17, 13, 31, -4, 1, 7, -8, 5, 1, -12, -1, 18, 10, 5, 2, 1, -6, 18, 7, -12, -6, 18, -10, -1, -12, 6, 6};
        String[] strArr = A04;
        if (strArr[0].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "5kHbeeIehC4HjRV2XKp0gKWNT0mjCFu0";
        strArr2[5] = "V77oNHMbviq5SbxHHLaqMPGHTmS2Clc8";
        A03 = bArr;
    }

    static {
        A02();
        A02 = -1593835521;
    }

    LU(int i10) {
        this.A00 = i10;
        this.A01 = null;
    }

    LU(int i10, NativeAdBase.NativeComponentTag nativeComponentTag) {
        this.A00 = i10;
        this.A01 = nativeComponentTag;
    }

    @Nullable
    public static LU A00(NativeAdBase.NativeComponentTag nativeComponentTag) {
        LU[] values;
        for (LU lu : values()) {
            if (lu.A01 == nativeComponentTag) {
                return lu;
            }
        }
        return null;
    }

    public static void A03(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
        LU internalTag = A00(nativeComponentTag);
        if (view != null && internalTag != null && Build.VERSION.SDK_INT > 4) {
            view.setTag(A02, nativeComponentTag);
        }
    }

    public static void A04(View view, LU lu) {
        if (view != null && lu != null && Build.VERSION.SDK_INT > 4) {
            view.setTag(A02, lu);
        }
    }

    public final int A06() {
        return this.A00;
    }
}

}

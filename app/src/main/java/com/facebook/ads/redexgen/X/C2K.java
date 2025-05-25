package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.RewardData;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2K  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2K {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-118, -113, -107, -96, -109, -105, -96, -109, -122, -104, -126, -109, -123, -96, -123, -126, -107, -126, -96, -110, -106, -126, -113, -107, -118, -107, -102, -96, -116, -122, -102, -92, -91, -93, -80, -93, -89, -80, -93, -106, -88, -110, -93, -107, -80, -107, -110, -91, -110, -80, -108, -90, -93, -93, -106, -97, -108, -86, -80, -100, -106, -86, -106, -105, -107, -94, -107, -103, -94, -107, -120, -102, -124, -107, -121, -94, -121, -124, -105, -124, -94, -116, -121, -94, -114, -120, -100};
    }

    public static Bundle A00(Bundle bundle, RewardData rewardData) {
        bundle.putString(A02(62, 25, 57), rewardData.getUserID());
        bundle.putString(A02(31, 31, 71), rewardData.getCurrency());
        bundle.putInt(A02(0, 31, 55), rewardData.getQuantity());
        return bundle;
    }

    public static RewardData A01(Bundle bundle) {
        String A02 = A02(62, 25, 57);
        if (!bundle.containsKey(A02)) {
            return null;
        }
        String string = bundle.getString(A02);
        String id2 = A02(31, 31, 71);
        String string2 = bundle.getString(id2);
        int i10 = bundle.getInt(A02(0, 31, 55), 0);
        String currency = A02(0, 0, 18);
        if (string == null) {
            string = currency;
        }
        if (string2 != null) {
            currency = string2;
        }
        return new RewardData(string, currency, i10);
    }
}

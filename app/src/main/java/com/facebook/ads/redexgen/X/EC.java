package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class EC implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ EL A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-54, -20, -3, -14, -8, -9, -87, -17, -14, -11, -18, -87, -11, -8, -22, -19, -14, -9, -16, -87, -17, -22, -14, -11, -18, -19, -73, -53, -10, -2, -11, -13, -10, -24, -21, -44, -24, -11, -24, -18, -20, -7};
    }

    public EC(EL el2) {
        this.A00 = el2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E1 e12;
        DownloadAction.Deserializer[] deserializerArr;
        Handler handler;
        if (KQ.A02(this)) {
            return;
        }
        try {
            e12 = this.A00.A09;
            deserializerArr = this.A00.A0E;
            DownloadAction[] actions = e12.A03(deserializerArr);
            handler = this.A00.A07;
            handler.post(new EB(this, actions));
        }
    }
}

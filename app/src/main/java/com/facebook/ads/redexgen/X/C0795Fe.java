package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0795Fe extends AbstractC1437bu {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C0795Fe(C1314Zs c1314Zs, C04761t c04761t) {
        super(c1314Zs, c04761t);
    }

    private C1429bm A00(Runnable runnable) {
        return new C1429bm(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0O() {
        AbstractC1460cH abstractC1460cH = (AbstractC1460cH) this.A01;
        abstractC1460cH.A00(this.A08.A00);
        abstractC1460cH.A01(this.A08.A01);
        abstractC1460cH.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1437bu
    public final void A0Q(InterfaceC04460p interfaceC04460p, C8W c8w, C8U c8u, C04771u c04771u) {
        C0806Fq c0806Fq = (C0806Fq) interfaceC04460p;
        C1430bn c1430bn = new C1430bn(this, c04771u, c0806Fq);
        if (C0877Im.A2S(this.A0B)) {
            Handler A0G = A0G();
            C8X A05 = c8w.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            A0G.postDelayed(c1430bn, A05.A05());
        }
        c0806Fq.A0J(this.A0B, A00(c1430bn), c04771u, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0Z(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A82() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC1460cH rewardedVideoAdapter = (AbstractC1460cH) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}

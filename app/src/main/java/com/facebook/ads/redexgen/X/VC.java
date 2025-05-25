package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class VC implements LG {
    public static byte[] A01;
    public static String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ VA A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public VC(VA va2) {
        this.A00 = va2;
    }

    public /* synthetic */ VC(VA va2, VH vh2) {
        this(va2);
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ABb() {
        boolean z10;
        boolean A0V;
        this.A00.A0a.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        z10 = this.A00.A0X;
        if (z10) {
            A0V = this.A00.A0V();
            String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (A0V) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0a.setToolbarActionMode(0);
    }

    @Override // com.facebook.ads.redexgen.X.LG
    public final void ADF(float f10) {
        boolean z10;
        C04581b c04581b;
        boolean z11;
        AbstractC1456cD abstractC1456cD;
        float A03;
        AbstractC1456cD abstractC1456cD2;
        AbstractC1456cD abstractC1456cD3;
        boolean z12;
        AbstractC1456cD abstractC1456cD4;
        boolean z13;
        AbstractC1456cD abstractC1456cD5;
        this.A00.A0O((int) f10);
        z10 = this.A00.A0Y;
        if (!z10) {
            c04581b = this.A00.A0J;
            this.A00.A0a.setProgress(100.0f * (1.0f - (f10 / c04581b.A07())));
            return;
        }
        z11 = this.A00.A0E;
        if (z11) {
            abstractC1456cD4 = this.A00.A0I;
            if (A02[6].charAt(27) != 'a') {
                throw new RuntimeException();
            }
            A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
            A03 = 1.0f - (f10 / abstractC1456cD4.A1P().A0E().A02());
            z13 = this.A00.A0H;
            if (z13 || A03 < 1.0f) {
                this.A00.A0H = false;
                abstractC1456cD5 = this.A00.A0I;
                this.A00.A0a.setToolbarActionMessage(abstractC1456cD5.A1T().A02().replace(A00(0, 6, 117), String.valueOf((int) f10)));
            } else {
                this.A00.A0H = true;
                MQ mq = this.A00.A0a;
                String A00 = A00(0, 0, 19);
                if (A02[3].length() != 16) {
                    mq.setToolbarActionMessage(A00);
                } else {
                    String[] strArr = A02;
                    strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                    strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                    mq.setToolbarActionMessage(A00);
                }
            }
        } else {
            abstractC1456cD = this.A00.A0I;
            A03 = 1.0f - (f10 / abstractC1456cD.A1P().A0E().A03());
        }
        this.A00.A0a.setProgress(100.0f * A03);
        abstractC1456cD2 = this.A00.A0I;
        abstractC1456cD3 = this.A00.A0I;
        float percentageOfReward = abstractC1456cD3.A1P().A0E().A03();
        boolean z14 = ((float) abstractC1456cD2.A1P().A0E().A02()) - f10 >= percentageOfReward;
        z12 = this.A00.A0H;
        if (!z12 && z14) {
            this.A00.A0a.setToolbarActionMode(1);
        }
    }
}

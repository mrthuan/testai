package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YF implements InterfaceC0723Bx {
    public static byte[] A04;
    public static String[] A05 = {"AiK3pMNNShJak6s4MDLMsY9qimC26KFX", "M3v5gYKO4WFk3hn1", "2bb5Udvw00t6fegOsnQl4tXMAy7GQwkC", "3", "dcu35K4BbIgCoJa", "BMLQYda91yK3g7bccAaGNV4e5Wl83Iq9", "nA", "RGGuL4yAG6ucZ0xM2RL0jO8aPQRkkz4r"};
    public static final C0 A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final YE A02;
    public final I4 A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-99, -104, -121};
        if (A05[5].charAt(3) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[7] = "7bqpxfmR5XZPxNNPiA9CZDDyjHiTp2U9";
        strArr[2] = "KfpMkYA6TjN2MknexbVN3Qli6xlYiONa";
        A04 = bArr;
    }

    static {
        A01();
        A06 = new YG();
        A07 = IK.A08(A00(0, 3, 5));
    }

    public YF() {
        this(0L);
    }

    public YF(long j10) {
        this.A01 = j10;
        this.A02 = new YE();
        this.A03 = new I4(2786);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A02.A5B(interfaceC0725Bz, new DH(0, 1));
        interfaceC0725Bz.A5u();
        interfaceC0725Bz.AG8(new C1284Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        int read = interfaceC0724By.read(this.A03.A00, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            this.A02.AEM(this.A01, true);
            if (A05[5].charAt(3) == 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "3";
            strArr[4] = "MtZ9V1bvQ7N7yp1";
            this.A00 = true;
        }
        this.A02.A4n(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void AG7(long j10, long j11) {
        this.A00 = false;
        this.A02.AG6();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        I4 i42 = new I4(10);
        int frameSize = 0;
        while (true) {
            interfaceC0724By.AEO(i42.A00, 0, 10);
            i42.A0Y(0);
            if (i42.A0G() != A07) {
                break;
            }
            i42.A0Z(3);
            int A0D = i42.A0D();
            frameSize += A0D + 10;
            interfaceC0724By.A3s(A0D);
        }
        interfaceC0724By.AFq();
        interfaceC0724By.A3s(frameSize);
        if (A05[1].length() == 16) {
            A05[0] = "tOwruLAkjfEjUTDr1GyBFqGyTAmtcW9W";
            int validFramesCount = frameSize;
            int i10 = 0;
            while (true) {
                interfaceC0724By.AEO(i42.A00, 0, 5);
                i42.A0Y(0);
                int headerPosition = i42.A0I();
                if (headerPosition != 2935) {
                    i10 = 0;
                    int headerPosition2 = A05[1].length();
                    if (headerPosition2 != 16) {
                        throw new RuntimeException();
                    }
                    A05[0] = "KHjFfqD3l504BCehGNYpAbtEvQEoYsdd";
                    interfaceC0724By.AFq();
                    validFramesCount++;
                    int headerPosition3 = validFramesCount - frameSize;
                    if (headerPosition3 >= 8192) {
                        return false;
                    }
                    interfaceC0724By.A3s(validFramesCount);
                } else {
                    i10++;
                    int headerPosition4 = A05[1].length();
                    if (headerPosition4 == 16) {
                        A05[0] = "LsSuBgAQvpKIYN4XhQWhBdLWOoSFJdWu";
                        if (i10 >= 4) {
                            return true;
                        }
                        int headerPosition5 = AV.A05(i42.A00);
                        if (headerPosition5 != -1) {
                            int i11 = headerPosition5 - 5;
                            String[] strArr = A05;
                            String str = strArr[7];
                            String str2 = strArr[2];
                            int headerPosition6 = str.charAt(2);
                            if (headerPosition6 == str2.charAt(2)) {
                                break;
                            }
                            A05[5] = "PITbGjnQaqQDwu6bC7Vc8Pqy2Vnu7Nmf";
                            interfaceC0724By.A3s(i11);
                        } else {
                            return false;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        throw new RuntimeException();
    }
}

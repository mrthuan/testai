package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class YC implements InterfaceC0723Bx {
    public static byte[] A04;
    public static String[] A05 = {"N3GpeYjJMdKFRv0SshHJKYsMOuO8p0tA", "wiC15XfKNpxiBv337rdfaN7iMk56huNL", "A3rsL6GYIxDIsUnc56leVSLnuuwWJE", "ZqwBdGbE4SmgDsULJVLTHbFOP2ezpJEQ", "xoPpoqfJCAQQdXeq5BVdnLmzIY6pHKhI", "B8ZA", "v1zw", "7spihzsXhr8LXNxcY6XClUbYBtHjjuHe"};
    public static final C0 A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final YB A02;
    public final I4 A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            if (A05[2].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "3ZPkzOiGV9NVnE4h3utFZ5OzDgmotOaN";
            strArr[1] = "eEVTlcljeWNjgsJMtw5K8hnVppEY0YPV";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Field.AUTOTEXT, Field.SECTIONPAGES, Field.AUTONUMLGL};
    }

    static {
        A01();
        A06 = new YD();
        A07 = IK.A08(A00(0, 3, 93));
    }

    public YC() {
        this(0L);
    }

    public YC(long j10) {
        this.A01 = j10;
        this.A02 = new YB(true);
        this.A03 = new I4(200);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A02.A5B(interfaceC0725Bz, new DH(0, 1));
        interfaceC0725Bz.A5u();
        interfaceC0725Bz.AG8(new C1284Yo(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        int read = interfaceC0724By.read(this.A03.A00, 0, 200);
        if (read == -1) {
            return -1;
        }
        this.A03.A0Y(0);
        this.A03.A0X(read);
        if (!this.A00) {
            YB yb2 = this.A02;
            long j10 = this.A01;
            String[] strArr = A05;
            String str = strArr[3];
            String str2 = strArr[1];
            int charAt = str.charAt(14);
            int bytesRead = str2.charAt(14);
            if (charAt == bytesRead) {
                throw new RuntimeException();
            }
            A05[6] = "35by";
            yb2.AEM(j10, true);
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
        I3 i32 = new I3(i42.A00);
        int startPosition = 0;
        while (true) {
            interfaceC0724By.AEO(i42.A00, 0, 10);
            i42.A0Y(0);
            if (i42.A0G() != A07) {
                break;
            }
            i42.A0Z(3);
            int A0D = i42.A0D();
            startPosition += A0D + 10;
            interfaceC0724By.A3s(A0D);
        }
        interfaceC0724By.AFq();
        interfaceC0724By.A3s(startPosition);
        int syncBytes = startPosition;
        int validFramesCount = 0;
        int i10 = 0;
        while (true) {
            interfaceC0724By.AEO(i42.A00, 0, 2);
            i42.A0Y(0);
            int headerPosition = 65526 & i42.A0I();
            if (headerPosition != 65520) {
                i10 = 0;
                validFramesCount = 0;
                interfaceC0724By.AFq();
                syncBytes++;
                int headerPosition2 = syncBytes - startPosition;
                if (headerPosition2 >= 8192) {
                    return false;
                }
                interfaceC0724By.A3s(syncBytes);
            } else {
                i10++;
                if (i10 >= 4 && validFramesCount > 188) {
                    return true;
                }
                interfaceC0724By.AEO(i42.A00, 0, 4);
                i32.A07(14);
                int headerPosition3 = i32.A04(13);
                if (headerPosition3 <= 6) {
                    return false;
                }
                interfaceC0724By.A3s(headerPosition3 - 6);
                validFramesCount += headerPosition3;
            }
        }
    }
}

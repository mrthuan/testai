package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Yj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1279Yj implements InterfaceC0723Bx {
    public static byte[] A0F;
    public static String[] A0G = {"zt1pBITgxzsmHMUWvaAytB5oIAm5U4mW", "7u7ZtLLpgpZX2JaKu3RBSVq4wIGxJUML", "IvG2IiuARv1bNydH7ZsGtUjBB55Zn0nQ", "kdo0JSRc9pvnigPvue4Xab18IyA3oBmw", "se0649YBVELxvg2u8qjfRL4a8hOqLiYD", "LLzBmDnTsaXnYpxdfV28zI1qxXqBoOSY", "SE3z471WcNKVQWc5YUCjUdJ92skp7xN1", "sOf0Ss8IsRLfs7RvuxpnH3345ckjOUQ1"};
    public static final C0 A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC0725Bz A06;
    public C1281Yl A07;
    public C1276Yg A08;
    public boolean A09;
    public final I4 A0C = new I4(4);
    public final I4 A0B = new I4(9);
    public final I4 A0E = new I4(11);
    public final I4 A0D = new I4();
    public final C1278Yi A0A = new C1278Yi();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{Field.AUTONUMLGL, Field.BARCODE, Field.PAGEREF};
    }

    static {
        A03();
        A0H = new C1280Yk();
        A0I = IK.A08(A01(0, 3, 2));
    }

    private I4 A00(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            this.A0D.A0b(new byte[Math.max(this.A0D.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC0724By.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        if (!this.A09) {
            this.A06.AG8(new C1284Yo(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 != -9223372036854775807L) {
            return;
        }
        this.A04 = this.A0A.A0D() == -9223372036854775807L ? -this.A05 : 0L;
    }

    private void A04(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        interfaceC0724By.AGq(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (interfaceC0724By.AEp(this.A0B.A00, 0, 9, true)) {
            this.A0B.A0Y(0);
            this.A0B.A0Z(4);
            int A0E = this.A0B.A0E();
            int flags = A0E & 4;
            boolean hasVideo = flags != 0;
            int flags2 = A0E & 1;
            boolean z10 = flags2 != 0;
            if (hasVideo && this.A07 == null) {
                this.A07 = new C1281Yl(this.A06.AHA(8, 1));
            }
            if (z10 && this.A08 == null) {
                this.A08 = new C1276Yg(this.A06.AHA(9, 2));
            }
            this.A06.A5u();
            int flags3 = this.A0B.A08();
            this.A00 = (flags3 - 9) + 4;
            this.A01 = 2;
            return true;
        }
        return false;
    }

    private boolean A06(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        boolean z10 = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            this.A07.A00(A00(interfaceC0724By), this.A04 + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC0724By), this.A04 + this.A05);
        } else {
            if (this.A03 == 18) {
                boolean wasConsumed = this.A09;
                if (!wasConsumed) {
                    C1278Yi c1278Yi = this.A0A;
                    I4 A00 = A00(interfaceC0724By);
                    long j10 = this.A05;
                    if (A0G[5].charAt(21) == 'w') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0G;
                    strArr[7] = "mj80KOMEu16tqWUXBnNHxeaKVPo5oU6C";
                    strArr[1] = "zxPOngcXIHhvnVp4vPZDAIcXSgjgtU2G";
                    c1278Yi.A00(A00, j10);
                    long A0D = this.A0A.A0D();
                    if (A0D != -9223372036854775807L) {
                        this.A06.AG8(new C1284Yo(A0D));
                        this.A09 = true;
                    }
                }
            }
            interfaceC0724By.AGq(this.A02);
            z10 = false;
        }
        String[] strArr2 = A0G;
        if (strArr2[3].charAt(30) != strArr2[0].charAt(30)) {
            throw new RuntimeException();
        }
        A0G[5] = "NAWWjYKyn9shN6r2ddcZ6FkIefXbre7e";
        this.A00 = 4;
        this.A01 = 2;
        return z10;
    }

    private boolean A07(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (interfaceC0724By.AEp(this.A0E.A00, 0, 11, true)) {
            this.A0E.A0Y(0);
            this.A03 = this.A0E.A0E();
            this.A02 = this.A0E.A0G();
            this.A05 = this.A0E.A0G();
            this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
            this.A0E.A0Z(3);
            this.A01 = 4;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        this.A06 = interfaceC0725Bz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        while (true) {
            switch (this.A01) {
                case 1:
                    boolean A05 = A05(interfaceC0724By);
                    if (A0G[2].charAt(16) == '7') {
                        String[] strArr = A0G;
                        strArr[3] = "lzNTxUwdPYSEX7KxXdfoU9Jel9TdPRmy";
                        strArr[0] = "dwxFKqzmLOpJEVaesL1sqXFx2quAiAmV";
                        if (A05) {
                            break;
                        } else {
                            return -1;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                case 2:
                    A04(interfaceC0724By);
                    break;
                case 3:
                    if (A07(interfaceC0724By)) {
                        break;
                    } else {
                        return -1;
                    }
                case 4:
                    if (!A06(interfaceC0724By)) {
                        break;
                    } else {
                        return 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void AG7(long j10, long j11) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        interfaceC0724By.AEO(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC0724By.AEO(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        interfaceC0724By.AEO(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int A08 = this.A0C.A08();
        interfaceC0724By.AFq();
        if (A0G[2].charAt(16) != '7') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "jHm5wQ2h5CdJRaHq01DeTIzeP75tyemy";
        strArr[0] = "1pZwakHop6oqeKEv01FiWhbI6ptDvumC";
        interfaceC0724By.A3s(A08);
        interfaceC0724By.AEO(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int dataOffset = this.A0C.A08();
        return dataOffset == 0;
    }
}

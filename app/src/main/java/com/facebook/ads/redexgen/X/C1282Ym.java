package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ym  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1282Ym implements InterfaceC0723Bx {
    public static byte[] A07;
    public static final C0 A08;
    public static final int A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public int A00;
    public int A01;
    public long A02;
    public C9 A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06 = new byte[1];

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{-64, 6, 18, 1, 13, 5, -64, 20, 25, 16, 5, -64, -60, -62, -30, -18, -13, -85, -117, -119, -87, -75, -70, -107, -65, -86, 114, 121, -91, -85, -94, -102, 86, -92, -91, -86, 86, -100, -97, -92, -102, 86, 119, -125, -120, 86, -98, -101, -105, -102, -101, -88, 100, -51, -16, -16, -23, -21, -27, -16, -92, -59, -47, -42, -92, -113, -76, -68, -89, -78, -81, -86, 102, -74, -89, -86, -86, -81, -76, -83, 102, -88, -81, -70, -71, 102, -84, -75, -72, 102, -84, -72, -89, -77, -85, 102, -82, -85, -89, -86, -85, -72, 102, -127, 117, -17, -38, -109, -89, -106, -101, -95, 97, 101, -103, -94, -94, -39, -19, -36, -31, -25, -89, -39, -27, -22, -91, -17, -38};
    }

    static {
        A05();
        A08 = new C1283Yn();
        A0C = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0D = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0A = IK.A0i(A03(12, 6, 113));
        A0B = IK.A0i(A03(18, 9, 56));
        A09 = A0D[8];
    }

    private int A00(int i10) throws A0 {
        if (A07(i10)) {
            return this.A05 ? A0D[i10] : A0C[i10];
        }
        throw new A0(A03(53, 12, 84) + (this.A05 ? A03(105, 2, 104) : A03(103, 2, 3)) + A03(0, 12, 112) + i10);
    }

    private int A01(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        interfaceC0724By.AFq();
        interfaceC0724By.AEO(this.A06, 0, 1);
        byte b10 = this.A06[0];
        if ((b10 & 131) <= 0) {
            return A00((b10 >> 3) & 15);
        }
        throw new A0(A03(65, 38, 22) + ((int) b10));
    }

    private int A02(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            try {
                this.A01 = A01(interfaceC0724By);
                this.A00 = this.A01;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int AFu = this.A03.AFu(interfaceC0724By, this.A00, true);
        if (AFu == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - AFu;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A03.AFw(this.A02, 1, this.A01, 0, null);
        this.A02 += 20000;
        return 0;
    }

    private void A04() {
        if (!this.A04) {
            this.A04 = true;
            this.A03.A69(Format.A06(null, this.A05 ? A03(117, 12, 72) : A03(107, 10, 2), null, -1, A09, 1, this.A05 ? 16000 : 8000, -1, null, null, 0, null));
        }
    }

    private boolean A06(int i10) {
        return !this.A05 && (i10 < 12 || i10 > 14);
    }

    private boolean A07(int i10) {
        return i10 >= 0 && i10 <= 15 && (A08(i10) || A06(i10));
    }

    private boolean A08(int i10) {
        return this.A05 && (i10 < 10 || i10 > 13);
    }

    private boolean A09(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        if (A0A(interfaceC0724By, A0A)) {
            this.A05 = false;
            interfaceC0724By.AGq(A0A.length);
            return true;
        } else if (A0A(interfaceC0724By, A0B)) {
            this.A05 = true;
            interfaceC0724By.AGq(A0B.length);
            return true;
        } else {
            return false;
        }
    }

    private boolean A0A(InterfaceC0724By interfaceC0724By, byte[] bArr) throws IOException, InterruptedException {
        interfaceC0724By.AFq();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC0724By.AEO(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void A9D(InterfaceC0725Bz interfaceC0725Bz) {
        interfaceC0725Bz.AG8(new C1284Yo(-9223372036854775807L));
        this.A03 = interfaceC0725Bz.AHA(0, 1);
        interfaceC0725Bz.A5u();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final int AEk(InterfaceC0724By interfaceC0724By, C4 c42) throws IOException, InterruptedException {
        if (interfaceC0724By.A86() != 0 || A09(interfaceC0724By)) {
            A04();
            return A02(interfaceC0724By);
        }
        throw new A0(A03(27, 26, 6));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final void AG7(long j10, long j11) {
        this.A02 = 0L;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0723Bx
    public final boolean AGs(InterfaceC0724By interfaceC0724By) throws IOException, InterruptedException {
        return A09(interfaceC0724By);
    }
}

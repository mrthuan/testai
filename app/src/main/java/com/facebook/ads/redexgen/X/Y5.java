package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class Y5 implements D3 {
    public static byte[] A0E;
    public static String[] A0F = {"MuM37mvTkzlYg2EyoGZNQeCtoH5o0amC", "mBjEqUiK3L9cxidSIeTlZKdFAvm", "XHnnymrKKOAQEyDjuW6Oc54SHnyt4GQm", "pkS5", "Uhg1", "yxzae7OE9DkPBU2323XK9iAPH766hQxt", "Bopy6Xk2MIHKC3K2u75K6Kfh", "uzVvOj5dUDYWkx4CAcwiCIxvqEsnaeE6"};
    public long A00;
    public long A01;
    public C9 A02;
    public D8 A03;
    public String A04;
    public boolean A05;
    public final DC A0B;
    public final boolean[] A0D = new boolean[3];
    public final D9 A0A = new D9(32, 128);
    public final D9 A08 = new D9(33, 128);
    public final D9 A06 = new D9(34, 128);
    public final D9 A07 = new D9(39, 128);
    public final D9 A09 = new D9(40, 128);
    public final I4 A0C = new I4();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{119, 97, 101, 100, -127, -108, -112, -109, -108, -95, 114, -117, -126, -107, -115, -126, Byte.MIN_VALUE, -111, -126, -127, 61, 126, -112, -115, -126, Byte.MIN_VALUE, -111, 124, -113, 126, -111, -122, -116, 124, -122, -127, Byte.MIN_VALUE, 61, -109, 126, -119, -110, -126, Field.CONTROL, 61, -79, -92, -97, -96, -86, 106, -93, -96, -79, -98};
    }

    static {
        A02();
    }

    public Y5(DC dc2) {
        this.A0B = dc2;
    }

    public static Format A00(String str, D9 d92, D9 d93, D9 d94) {
        byte[] csd = new byte[d92.A00 + d93.A00 + d94.A00];
        System.arraycopy(d92.A01, 0, csd, 0, d92.A00);
        System.arraycopy(d93.A01, 0, csd, d92.A00, d93.A00);
        System.arraycopy(d94.A01, 0, csd, d92.A00 + d93.A00, d94.A00);
        I5 i52 = new I5(d93.A01, 0, d93.A00);
        i52.A07(44);
        int i10 = i52.A05(3);
        i52.A06();
        i52.A07(88);
        i52.A07(8);
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i52.A0A()) {
                i11 += 89;
            }
            if (i52.A0A()) {
                i11 += 8;
            }
        }
        i52.A07(i11);
        if (i10 > 0) {
            i52.A07((8 - i10) * 2);
        }
        i52.A04();
        int chromaFormatIdc = i52.A04();
        if (chromaFormatIdc == 3) {
            i52.A06();
        }
        int picHeightInLumaSamples = i52.A04();
        int confWinLeftOffset = i52.A04();
        if (i52.A0A()) {
            int toSkip = i52.A04();
            int A04 = i52.A04();
            int subHeightC = i52.A04();
            int A042 = i52.A04();
            picHeightInLumaSamples -= (toSkip + A04) * ((chromaFormatIdc == 1 || chromaFormatIdc == 2) ? 2 : 1);
            confWinLeftOffset -= (subHeightC + A042) * (chromaFormatIdc == 1 ? 2 : 1);
        }
        i52.A04();
        i52.A04();
        int A043 = i52.A04();
        for (int i13 = i52.A0A() ? 0 : i10; i13 <= i10; i13++) {
            i52.A04();
            i52.A04();
            i52.A04();
        }
        i52.A04();
        i52.A04();
        i52.A04();
        i52.A04();
        i52.A04();
        i52.A04();
        if (i52.A0A() && i52.A0A()) {
            A05(i52);
        }
        i52.A07(2);
        if (i52.A0A()) {
            i52.A07(8);
            i52.A04();
            i52.A04();
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0F[5] = "beliyUp3I";
            i52.A06();
        }
        A06(i52);
        if (i52.A0A()) {
            int log2MaxPicOrderCntLsbMinus4 = 0;
            while (true) {
                int maxSubLayersMinus1 = i52.A04();
                if (A0F[6].length() == 30) {
                    A0F[2] = "DqswfFoquAR3l8kr9ImxEhUsB68HngNw";
                    if (log2MaxPicOrderCntLsbMinus4 >= maxSubLayersMinus1) {
                        break;
                    }
                    i52.A07(A043 + 4 + 1);
                    log2MaxPicOrderCntLsbMinus4++;
                } else {
                    A0F[5] = "eP05A5uOer10TfC46mqSQX";
                    if (log2MaxPicOrderCntLsbMinus4 >= maxSubLayersMinus1) {
                        break;
                    }
                    i52.A07(A043 + 4 + 1);
                    log2MaxPicOrderCntLsbMinus4++;
                }
            }
        }
        i52.A07(2);
        float f10 = 1.0f;
        if (i52.A0A() && i52.A0A()) {
            int log2MaxPicOrderCntLsbMinus42 = i52.A05(8);
            if (log2MaxPicOrderCntLsbMinus42 == 255) {
                int A05 = i52.A05(16);
                int A052 = i52.A05(16);
                if (A05 != 0 && A052 != 0) {
                    f10 = A05 / A052;
                }
            } else {
                float[] fArr = I0.A04;
                if (A0F[5].length() == 23) {
                    throw new RuntimeException();
                }
                A0F[5] = "lNxPCo9oIuhji7Gv";
                if (log2MaxPicOrderCntLsbMinus42 < fArr.length) {
                    f10 = I0.A04[log2MaxPicOrderCntLsbMinus42];
                } else {
                    Log.w(A01(0, 10, 26), A01(10, 35, 8) + log2MaxPicOrderCntLsbMinus42);
                }
            }
        }
        return Format.A03(str, A01(45, 10, 38), null, -1, -1, picHeightInLumaSamples, confWinLeftOffset, -1.0f, Collections.singletonList(csd), -1, f10, null);
    }

    private void A03(long j10, int i10, int i11, long j11) {
        if (this.A05) {
            this.A03.A02(j10, i10);
        } else {
            D9 d92 = this.A0A;
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0F[5] = "T4Iekhb";
            d92.A04(i11);
            this.A08.A04(i11);
            this.A06.A04(i11);
            if (this.A0A.A03() && this.A08.A03() && this.A06.A03()) {
                this.A02.A69(A00(this.A04, this.A0A, this.A08, this.A06));
                this.A05 = true;
            }
        }
        boolean A04 = this.A07.A04(i11);
        if (A0F[2].charAt(9) == '6') {
            throw new RuntimeException();
        }
        A0F[5] = "5wZyobeJENeWPOGTXoMwsZ";
        if (A04) {
            this.A0C.A0b(this.A07.A01, I0.A02(this.A07.A01, this.A07.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j11, this.A0C);
        }
        if (this.A09.A04(i11)) {
            this.A0C.A0b(this.A09.A01, I0.A02(this.A09.A01, this.A09.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j11, this.A0C);
        }
    }

    private void A04(long j10, int i10, int i11, long j11) {
        if (this.A05) {
            this.A03.A03(j10, i10, i11, j11);
        } else {
            this.A0A.A01(i11);
            this.A08.A01(i11);
            D9 d92 = this.A06;
            if (A0F[2].charAt(9) == '6') {
                throw new RuntimeException();
            }
            A0F[2] = "afSaij9DosEsjnR5OQlOdYTC4yKMsCpR";
            d92.A01(i11);
        }
        this.A07.A01(i11);
        this.A09.A01(i11);
    }

    public static void A05(I5 i52) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!i52.A0A()) {
                    i52.A04();
                } else {
                    int i13 = i10 << 1;
                    if (A0F[5].length() == 23) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[7] = "Trv63JQRohtZ2guXV2KCLZkCXYmgTsG4";
                    strArr[0] = "BkNV2uBmbZiRokG0PRq1Sv9g32SKHwb9";
                    int sizeId = Math.min(64, 1 << (i13 + 4));
                    if (i10 > 1) {
                        i52.A03();
                    }
                    for (int i14 = 0; i14 < sizeId; i14++) {
                        i52.A03();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    public static void A06(I5 i52) {
        int A04 = i52.A04();
        boolean z10 = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < A04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                z10 = i52.A0A();
            }
            if (z10) {
                i52.A06();
                i52.A04();
                for (int i10 = 0; i10 <= numNegativePics; i10++) {
                    if (i52.A0A()) {
                        i52.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = i52.A04();
                int A042 = i52.A04();
                numNegativePics = previousNumDeltaPocs + A042;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    i52.A04();
                    i52.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < A042; numShortTermRefPicSets2++) {
                    i52.A04();
                    i52.A06();
                }
            }
        }
    }

    private void A07(byte[] bArr, int i10, int i11) {
        if (this.A05) {
            this.A03.A04(bArr, i10, i11);
        } else {
            this.A0A.A02(bArr, i10, i11);
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A09.A02(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A4n(I4 i42) {
        while (i42.A04() > 0) {
            int A06 = i42.A06();
            int A07 = i42.A07();
            byte[] bArr = i42.A00;
            long j10 = this.A01;
            int offset = i42.A04();
            this.A01 = j10 + offset;
            C9 c92 = this.A02;
            int offset2 = i42.A04();
            c92.AFv(i42, offset2);
            while (A06 < A07) {
                int A04 = I0.A04(bArr, A06, A07, this.A0D);
                if (A04 == A07) {
                    A07(bArr, A06, A07);
                    return;
                }
                int bytesWrittenPastPosition = I0.A00(bArr, A04);
                int i10 = A04 - A06;
                if (i10 > 0) {
                    A07(bArr, A06, A04);
                }
                int i11 = A07 - A04;
                long j11 = this.A01 - i11;
                int offset3 = i10 < 0 ? -i10 : 0;
                A03(j11, i11, offset3, this.A00);
                long absolutePosition = this.A00;
                A04(j11, i11, bytesWrittenPastPosition, absolutePosition);
                A06 = A04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A5B(InterfaceC0725Bz interfaceC0725Bz, DH dh2) {
        dh2.A05();
        this.A04 = dh2.A04();
        this.A02 = interfaceC0725Bz.AHA(dh2.A03(), 2);
        this.A03 = new D8(this.A02);
        this.A0B.A03(interfaceC0725Bz, dh2);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEM(long j10, boolean z10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AG6() {
        I0.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}

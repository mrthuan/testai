package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class Y7 implements D3 {
    public static byte[] A0D;
    public static String[] A0E = {"U6xxaTgwnpyvNF7dBrF7jy8H0ccYS7uh", "pwqCU4MsG0tpC07kMa2Cozx", "ro9PG3kfplkcrc4zDf47Uz", "tgqRKbRXEgm18AdaPVJDwdGzzx4woeSa", "ILDgXZMCDuz6PSZvyES1oo4T", "cxVIvU", "tSDqSS", "Q0WPqxsOUB7bJ5SYfd3WG"};
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C9 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final D4 A0B = new D4(128);

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = copyOfRange[i13];
            String[] strArr = A0E;
            if (strArr[3].charAt(9) == strArr[0].charAt(9)) {
                throw new RuntimeException();
            }
            A0E[7] = "RfqzANvJ1I6uK4DDRBmzx";
            copyOfRange[i13] = (byte) ((b10 ^ i12) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{Field.AUTONUMLGL, 42, Field.FILLIN, Field.ASK, 44, 108, Field.DDEAUTO, Field.MACROBUTTON, Field.ASK, 36, 113};
    }

    static {
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(D4 d42, String str) {
        byte[] copyOf = Arrays.copyOf(d42.A02, d42.A00);
        int i10 = copyOf[4] & 255;
        int firstByte = copyOf[5] & 255;
        int i11 = (i10 << 4) | (firstByte >> 4);
        int i12 = ((firstByte & 15) << 8) | (copyOf[6] & 255);
        float f10 = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                int frameRateExtensionD = i12 * 4;
                float f11 = frameRateExtensionD;
                int frameRateExtensionD2 = i11 * 3;
                f10 = f11 / frameRateExtensionD2;
                break;
            case 3:
                int frameRateExtensionD3 = i12 * 16;
                float f12 = frameRateExtensionD3;
                int frameRateExtensionD4 = i11 * 9;
                f10 = f12 / frameRateExtensionD4;
                break;
            case 4:
                int frameRateExtensionD5 = i12 * 121;
                float f13 = frameRateExtensionD5;
                int frameRateExtensionD6 = i11 * 100;
                f10 = f13 / frameRateExtensionD6;
                break;
        }
        Format A03 = Format.A03(str, A01(0, 11, 36), null, -1, -1, i11, i12, -1.0f, Collections.singletonList(copyOf), -1, f10, null);
        long j10 = 0;
        int i13 = (copyOf[7] & 15) - 1;
        if (i13 >= 0 && i13 < A0F.length) {
            double d10 = A0F[i13];
            int aspectRatioCode = d42.A01;
            int i14 = (copyOf[aspectRatioCode + 9] & 96) >> 5;
            int aspectRatioCode2 = copyOf[aspectRatioCode + 9] & 31;
            if (i14 != aspectRatioCode2) {
                double d11 = i14 + 1.0d;
                int thirdByte = aspectRatioCode2 + 1;
                String[] strArr = A0E;
                String str2 = strArr[5];
                String str3 = strArr[6];
                int length = str2.length();
                int frameRateExtensionD7 = str3.length();
                if (length != frameRateExtensionD7) {
                    throw new RuntimeException();
                }
                A0E[7] = "NpF2DYCqOiHWIi5aD2n7H";
                d10 *= d11 / thirdByte;
            }
            j10 = (long) (1000000.0d / d10);
        }
        return Pair.create(A03, Long.valueOf(j10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (r3 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r21.A07 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
        r5 = r21.A09;
        r14 = r21.A05;
        r15 = r21.A03;
        r5 = r5 ? 1 : 0;
        r14.AFw(r15, r5, ((int) (r21.A04 - r21.A02)) - r4, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
        if (r3 != false) goto L36;
     */
    @Override // com.facebook.ads.redexgen.X.D3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4n(com.facebook.ads.redexgen.X.I4 r22) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Y7.A4n(com.facebook.ads.redexgen.X.I4):void");
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A5B(InterfaceC0725Bz interfaceC0725Bz, DH dh2) {
        dh2.A05();
        this.A06 = dh2.A04();
        this.A05 = interfaceC0725Bz.AHA(dh2.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEM(long j10, boolean z10) {
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AG6() {
        I0.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class YJ extends AbstractC0745Ct {
    public static byte[] A01;
    public static String[] A02 = {"9zUE1kBCLrpctXUh4di4teUCMMnlOwHm", "hxL5RrPmAhc7c6Sqok7geqGtoBQuG54z", "7qxsi95CwX1d32mD6PhTx1jG463xSlTg", "ROqSYZWleG9mDiFvnXHBa66Bw", "byItOkkTBkpZWV9t1cXQ", "rK61A2vaMRzsIHVSYP2n5X", "FfCvZ6O62JH3XUMkSbfnO7", "CFRLGqs9mpPSc58Q2JPSfTLdlWu7MMes"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-26, 7, 12, 10, -16, 4, -13, -8, -2, -66, -2, -1, 4, 2};
    }

    static {
        A02();
        A03 = IK.A08(A01(0, 4, 83));
        A04 = new byte[]{Field.AUTOTEXT, 112, 117, 115, Field.NOTEREF, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i10;
        int i11;
        int frames = bArr[0] & 255;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                i10 = 1;
                break;
            case 1:
            case 2:
                i10 = 2;
                break;
            default:
                int toc2 = bArr[1];
                i10 = toc2 & 63;
                break;
        }
        int config = frames >> 3;
        int frames2 = config & 3;
        if (config >= 16) {
            i11 = 2500 << frames2;
        } else if (config >= 12) {
            int length = frames2 & 1;
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int frames3 = str.length();
            int toc3 = str2.length();
            if (frames3 != toc3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "3r7DJYLfzRYqaRlcvCuDWA";
            strArr2[5] = "1ZUf0xo6oEwAlYAqSthqXk";
            i11 = Constants.CP_MAC_ROMAN << length;
        } else if (frames2 == 3) {
            i11 = 60000;
        } else {
            i11 = Constants.CP_MAC_ROMAN << frames2;
        }
        return i10 * i11;
    }

    private void A03(List<byte[]> initializationData, int i10) {
        initializationData.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i10 * 1000000000) / 48000).array());
    }

    public static boolean A04(I4 i42) {
        if (i42.A04() < A04.length) {
            return false;
        }
        byte[] bArr = new byte[A04.length];
        byte[] header = A04;
        i42.A0c(bArr, 0, header.length);
        byte[] header2 = A04;
        return Arrays.equals(bArr, header2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final long A07(I4 i42) {
        return A04(A00(i42.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final boolean A0A(I4 i42, long j10, C0744Cs c0744Cs) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(i42.A00, i42.A07());
            int i10 = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            A03(arrayList, 3840);
            c0744Cs.A00 = Format.A07(null, A01(4, 10, 75), null, -1, -1, i10, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean headerPacket = i42.A08() == A03;
        String[] strArr = A02;
        if (strArr[2].charAt(8) != strArr[0].charAt(8)) {
            String[] strArr2 = A02;
            strArr2[2] = "JHJxUYNn6gdFJmATsQeXbTNgPw95NmiQ";
            strArr2[0] = "1OX1ZlBLBQsnobg1X9ALf0NdaXPdAO6N";
            i42.A0Y(0);
            return headerPacket;
        }
        throw new RuntimeException();
    }
}

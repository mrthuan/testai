package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class EZ implements InterfaceC1270Ya {
    public static byte[] A03;
    public static String[] A04 = {"hDr4AhOelyV4M87pxxzrySU8", "ag02JsPBw1CSC6lAevKl8ElSb7ghegxm", "8KgIWPNY6Gpuv5I23X99L6M1", "BC5znNfWRALdfcPg4enkL0n", "sH1sq28fUh4pGPjb57fY53htTKBjXus7", "cCA6T6hrJ6nKn0yn0LF0tCx", "oJ6ugJrvZKDALziksWoJHm", "OeXUOmYCRuSHACW5UkCDsaSWUNhRh"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        String[] strArr = A04;
        if (strArr[5].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A04[4] = "eDFZ3Zqg0xNSdShrMJsmVraFmK4fXi8F";
        A03 = new byte[]{48, 60, Field.FORMDROPDOWN, Field.FORMCHECKBOX, Field.CONTROL, 76, Field.PAGEREF, 97, 100, 113, 100, Field.PAGEREF, 118, 108, Byte.MAX_VALUE, 96, Field.PAGEREF, 104, 108, 118, 104, 100, 113, 102, 109, Field.BARCODE, Field.PAGEREF, 26, Field.DDEAUTO, Field.USERADDRESS, Field.PAGEREF, 31, 41, 41, Field.FILLIN, 41, Field.USERADDRESS};
    }

    static {
        A02();
    }

    public EZ(long[] jArr, long[] jArr2, long j10) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j10;
    }

    public static EZ A00(long j10, long j11, C3 c32, I4 i42) {
        int A0E;
        long j12 = j11;
        i42.A0Z(10);
        int numFrames = i42.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = c32.A03;
        long A0F = IK.A0F(numFrames, (sampleRate >= 32000 ? 1152 : 576) * 1000000, sampleRate);
        int A0I = i42.A0I();
        int numFrames2 = i42.A0I();
        int A0I2 = i42.A0I();
        i42.A0Z(2);
        long j13 = j12 + c32.A02;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int scale = 0; scale < A0I; scale++) {
            jArr[scale] = (scale * A0F) / A0I;
            jArr2[scale] = Math.max(j12, j13);
            switch (A0I2) {
                case 1:
                    A0E = i42.A0E();
                    break;
                case 2:
                    A0E = i42.A0I();
                    break;
                case 3:
                    A0E = i42.A0G();
                    break;
                case 4:
                    A0E = i42.A0H();
                    break;
                default:
                    return null;
            }
            j12 += A0E * numFrames2;
        }
        if (j10 != -1 && j10 != j12) {
            Log.w(A01(27, 10, 54), A01(2, 25, ShapeTypes.VERTICAL_SCROLL) + j10 + A01(0, 2, 102) + j12);
        }
        return new EZ(jArr, jArr2, A0F);
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        int A0B = IK.A0B(this.A02, j10, true, true);
        C7 c72 = new C7(this.A02[A0B], this.A01[A0B]);
        int tableIndex = (c72.A01 > j10 ? 1 : (c72.A01 == j10 ? 0 : -1));
        if (tableIndex < 0) {
            int tableIndex2 = this.A02.length;
            if (A0B != tableIndex2 - 1) {
                int tableIndex3 = A0B + 1;
                long j11 = this.A02[tableIndex3];
                int tableIndex4 = A0B + 1;
                C7 nextSeekPoint = new C7(j11, this.A01[tableIndex4]);
                return new C5(c72, nextSeekPoint);
            }
        }
        return new C5(c72);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1270Ya
    public final long A8W(long j10) {
        return this.A02[IK.A0B(this.A01, j10, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return true;
    }
}

package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class EY implements InterfaceC1270Ya {
    public static byte[] A05;
    public static String[] A06 = {"Xr6CfYARiXWi1tHF5rKzHnV8sizRHMyX", "wJO", "vhv6fx1WvUjVUT42a865NPYV6nOkfSqv", "ykO1A1PT3jL3Q8zq7D2WaGEX54xmjF9S", OperatorName.SET_LINE_JOINSTYLE, "GNQC5jQwe2bl4DeUZLcdaEx2Qf8zZlwn", "pCroGV0GNScuUwFSTYQpDpdwc2fRC0On", "UPhRQNGhO5dHFWFW9SQSP3jiGA6NTJBd"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{Field.ADVANCE, Field.HYPERLINK, 9, 24, 31, 22, 113, Field.AUTONUMLGL, 48, Field.PAGEREF, 48, 113, 34, 56, 43, Field.AUTONUMOUT, 113, 60, 56, 34, 60, 48, Field.PAGEREF, Field.GOTOBUTTON, Field.SYMBOL, 107, 113, Field.AUTONUMOUT, 5, 2, 11, Field.BARCODE, 9, 9, 7, 9, 30};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        double d10;
        if (A9h()) {
            long A0E = IK.A0E(j10, 0L, this.A03);
            double d11 = (A0E * 100.0d) / this.A03;
            if (d11 <= 0.0d) {
                d10 = 0.0d;
            } else if (d11 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i10 = (int) d11;
                double d12 = this.A04[i10];
                d10 = (((i10 == 99 ? 256.0d : this.A04[i10 + 1]) - d12) * (d11 - i10)) + d12;
            }
            return new C5(new C7(A0E, this.A02 + IK.A0E(Math.round((d10 / 256.0d) * this.A01), this.A00, this.A01 - 1)));
        }
        return new C5(new C7(0L, this.A02 + this.A00));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1270Ya
    public final long A8W(long j10) {
        long j11 = j10 - this.A02;
        if (!A9h() || j11 <= this.A00) {
            return 0L;
        }
        double d10 = (j11 * 256.0d) / this.A01;
        int A0B = IK.A0B(this.A04, (long) d10, true, true);
        long A00 = A00(A0B);
        long j12 = this.A04[A0B];
        long A002 = A00(A0B + 1);
        long j13 = A0B == 99 ? 256L : this.A04[A0B + 1];
        return Math.round((A002 - A00) * (j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12))) + A00;
    }

    static {
        A03();
    }

    public EY(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public EY(long j10, int i10, long j11, long j12, long[] jArr) {
        this.A02 = j10;
        this.A00 = i10;
        this.A03 = j11;
        this.A01 = j12;
        this.A04 = jArr;
    }

    private long A00(int i10) {
        return (this.A03 * i10) / 100;
    }

    public static EY A01(long durationUs, long dataSize, C3 c32, I4 i42) {
        int A0H;
        int i10 = c32.A04;
        int i11 = c32.A03;
        int A08 = i42.A08();
        if ((A08 & 1) != 1 || (A0H = i42.A0H()) == 0) {
            return null;
        }
        long A0F = IK.A0F(A0H, i10 * 1000000, i11);
        int i12 = A08 & 6;
        if (A06[4].length() != 20) {
            A06[4] = "W327rNxAr1Lp0kX";
            if (i12 != 6) {
                return new EY(dataSize, c32.A02, A0F);
            }
            long A0H2 = i42.A0H();
            long[] jArr = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                long A0E = i42.A0E();
                String[] strArr = A06;
                String str = strArr[6];
                String str2 = strArr[2];
                int charAt = str.charAt(6);
                int i14 = str2.charAt(6);
                if (charAt == i14) {
                    throw new RuntimeException();
                }
                A06[7] = "SFqGi8tygZ59FROXyWZkbYPPfUMGUQ5V";
                jArr[i13] = A0E;
            }
            if (durationUs != -1 && durationUs != dataSize + A0H2) {
                Log.w(A02(27, 10, 64), A02(2, 25, 125) + durationUs + A02(0, 2, 84) + (dataSize + A0H2));
            }
            return new EY(dataSize, c32.A02, A0F, A0H2, jArr);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return this.A04 != null;
    }
}

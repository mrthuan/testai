package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: assets/audience_network.dex */
public final class YH extends AbstractC0745Ct {
    public static byte[] A05;
    public static String[] A06 = {"CfiERA", "aqzXLhx7II0vO15jWMUzXt7FO8HYio", "dQDUGs", "rXJ7u9pv7eoczgkakx2iUXR9KJyxjBER", "IxZhnB", "GbKHkLTg9xu9ykL3hBwLplXSwxhS4HIM", "Fj9fDEC3pUeWSTLe", "BpYov1BGFgNJjphL"};
    public int A00;
    public C0747Cv A01;
    public C0749Cx A02;
    public C0751Cz A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final C0747Cv A02(I4 i42) throws IOException {
        if (this.A03 == null) {
            this.A03 = D0.A04(i42);
            return null;
        } else if (this.A02 == null) {
            this.A02 = D0.A03(i42);
            return null;
        } else {
            byte[] bArr = new byte[i42.A07()];
            System.arraycopy(i42.A00, 0, bArr, 0, i42.A07());
            C0750Cy[] A0C = D0.A0C(i42, this.A03.A05);
            return new C0747Cv(this.A03, this.A02, bArr, A0C, D0.A00(A0C.length - 1));
        }
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{117, 97, 112, 125, 123, 59, 98, 123, 102, 118, 125, 103};
    }

    static {
        A04();
    }

    public static int A00(byte b10, int i10, int i11) {
        return (b10 >> i11) & (FunctionEval.FunctionID.EXTERNAL_FUNC >>> (8 - i10));
    }

    public static int A01(byte b10, C0747Cv c0747Cv) {
        if (!c0747Cv.A04[A00(b10, c0747Cv.A00, 1)].A03) {
            C0751Cz c0751Cz = c0747Cv.A02;
            String[] strArr = A06;
            String str = strArr[4];
            String str2 = strArr[2];
            int length = str.length();
            int modeNumber = str2.length();
            if (length != modeNumber) {
                throw new RuntimeException();
            }
            A06[6] = "By5V";
            int modeNumber2 = c0751Cz.A03;
            return modeNumber2;
        }
        int modeNumber3 = c0747Cv.A02.A04;
        return modeNumber3;
    }

    public static void A05(I4 i42, long j10) {
        i42.A0X(i42.A07() + 4);
        i42.A00[i42.A07() - 4] = (byte) (j10 & 255);
        i42.A00[i42.A07() - 3] = (byte) ((j10 >>> 8) & 255);
        i42.A00[i42.A07() - 2] = (byte) ((j10 >>> 16) & 255);
        i42.A00[i42.A07() - 1] = (byte) (255 & (j10 >>> 24));
    }

    public static boolean A06(I4 i42) {
        try {
            return D0.A0A(1, i42, true);
        } catch (A0 unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final long A07(I4 i42) {
        int i10 = 0;
        if ((i42.A00[0] & 1) == 1) {
            return -1L;
        }
        byte[] bArr = i42.A00;
        if (A06[6].length() != 5) {
            A06[7] = "dvcdmR";
            int samplesInPacket = A01(bArr[0], this.A01);
            if (this.A04) {
                int packetBlockSize = this.A00;
                i10 = (packetBlockSize + samplesInPacket) / 4;
            }
            A05(i42, i10);
            this.A04 = true;
            this.A00 = samplesInPacket;
            return i10;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final void A08(long j10) {
        super.A08(j10);
        this.A04 = j10 != 0;
        this.A00 = this.A03 != null ? this.A03.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final boolean A0A(I4 i42, long j10, C0744Cs c0744Cs) throws IOException, InterruptedException {
        if (this.A01 == null) {
            this.A01 = A02(i42);
            if (this.A01 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            c0744Cs.A00 = Format.A07(null, A03(0, 12, 66), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class YM extends AbstractC0745Ct {
    public static byte[] A02;
    public static String[] A03 = {"P4OcMr", "yzGUgjKhy2TcBuT81YWAaiS5", "V9Tib6IfMi4NOqM1D0u830Y2yBdPdBt7", "OFAtjnGVyOXYsjxgv2tUilfsOLsGPVA2", "mLmiaTwnnACP94", "cQZMgeBNGwnvvvB3OnriOOb2AFb6ME4P", "wxDgqbrpyTXZpGk4hb9UcFKfmJ4Jr8rC", "ZIsPCe9SsRFytxGe4XrO3tcn"};
    public YN A00;
    public C0856Hr A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {34, Field.AUTONUM, Field.FILLIN, 42, 44, 108, Field.PAGEREF, Field.GLOSSARY, 34, 32};
        String[] strArr = A03;
        if (strArr[2].charAt(3) == strArr[3].charAt(3)) {
            throw new RuntimeException();
        }
        A03[0] = "xoHdp6";
        A02 = bArr;
    }

    static {
        A03();
    }

    private int A00(I4 i42) {
        int value = (i42.A00[2] & 255) >> 4;
        switch (value) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int blockSizeCode = 576 << (value - 2);
                return blockSizeCode;
            case 6:
            case 7:
                i42.A0Z(4);
                i42.A0O();
                int value2 = value == 6 ? i42.A0E() : i42.A0I();
                i42.A0Y(0);
                int blockSizeCode2 = value2 + 1;
                return blockSizeCode2;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode3 = 256 << (value - 8);
                return blockSizeCode3;
            default:
                return -1;
        }
    }

    public static boolean A04(I4 i42) {
        if (i42.A04() >= 5 && i42.A0E() == 127) {
            int i10 = (i42.A0M() > 1179402563L ? 1 : (i42.A0M() == 1179402563L ? 0 : -1));
            String[] strArr = A03;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[4] = "cSF3Iph02w2lMO";
            if (i10 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final long A07(I4 i42) {
        if (!A05(i42.A00)) {
            return -1L;
        }
        return A00(i42);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            if (A03[5].charAt(28) != 'M') {
                throw new RuntimeException();
            }
            A03[5] = "Lwh1jCIc51N2CryTcfCaB8rWVU2cMDKL";
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0745Ct
    public final boolean A0A(I4 i42, long j10, C0744Cs c0744Cs) throws IOException, InterruptedException {
        byte[] bArr = i42.A00;
        if (this.A01 == null) {
            this.A01 = new C0856Hr(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, i42.A07());
            data[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(data);
            c0744Cs.A00 = Format.A07(null, A02(0, 10, 37), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, singletonList, null, 0, null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.A00 = new YN(this);
            this.A00.A01(i42);
            return true;
        } else if (!A05(bArr)) {
            return true;
        } else {
            if (this.A00 != null) {
                this.A00.A00(j10);
                c0744Cs.A01 = this.A00;
            }
            return false;
        }
    }
}

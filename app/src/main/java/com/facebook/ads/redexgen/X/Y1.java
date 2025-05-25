package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class Y1 implements DI {
    public static byte[] A0C;
    public static String[] A0D = {"dPoS8ir9YmCy1uQJIUom9RDvTe3XGwYa", "l0lwv2mLMBwIq41tHmV8ebPMigm2cPny", "3Vedj4HjY1Vy1h02zmvRTXoLyhzHWWtt", "FOcBY2kYLrpUeUKUAiAxljySmjgLjk6W", "ALj39rIBTGPBuuonTGTEnDBkGBpQhD2Z", "L897rBZtJXzoOwLre61GOmvLlU41bkCQ", "6efybmxQl5NXzOSuCJSu8aqAxjRTcf4e", "c"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public IG A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final D3 A0A;
    public final I3 A0B = new I3(new byte[10]);
    public int A03 = 0;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{110, Field.QUOTE, 33, 60, 43, 110, 44, Field.IMPORT, 58, 43, 61, Field.ASK, 19, 5, 36, 19, 23, 18, 19, 4, 64, 123, 112, 109, 101, 112, 118, 97, 112, 113, Field.AUTONUMLGL, 102, 97, 116, 103, 97, Field.AUTONUMLGL, 118, 122, 113, 112, Field.AUTONUMLGL, 101, 103, 112, 115, 124, 109, Field.GLOSSARY, Field.AUTONUMLGL, 3, 56, Field.MACROBUTTON, Field.DDEAUTO, Field.ASK, Field.MACROBUTTON, Field.AUTONUMLGL, 34, Field.MACROBUTTON, Field.GOTOBUTTON, 118, Field.PAGEREF, 34, Field.IMPORT, 36, 34, 118, Field.BARCODE, 56, Field.GOTOBUTTON, Field.BARCODE, Field.AUTONUMLGL, Field.IMPORT, 34, Field.SYMBOL, 36, 118, 36, Field.MACROBUTTON, Field.IMPORT, Field.GOTOBUTTON, Field.BARCODE, 56, Field.EQ, 118, Field.MACROBUTTON, Field.DDEAUTO, 34, Field.MACROBUTTON, 56, Field.GOTOBUTTON, Field.MACROBUTTON, Field.GOTOBUTTON, 118, Field.USERADDRESS, Field.MACROBUTTON, Field.IMPORT, Field.GOTOBUTTON, Field.MACROBUTTON, 36, 96, Field.HTMLCONTROL, 80, 77, Field.FILESIZE, 80, 86, Field.SECTION, 80, Field.ADDIN, 21, Field.FORMTEXT, Field.SECTION, Field.ADVANCE, Field.FORMCHECKBOX, Field.SECTION, 21, Field.BIDIOUTLINE, Field.HTMLCONTROL, Field.ADDIN, Field.BIDIOUTLINE, 86, Field.ADVANCE, Field.SECTION, Field.LISTNUM, Field.FORMCHECKBOX, 15, 21, 80, 77, Field.FILESIZE, 80, 86, Field.SECTION, 80, Field.ADDIN, 21};
    }

    static {
        A02();
    }

    public Y1(D3 d32) {
        this.A0A = d32;
    }

    private void A01() {
        this.A0B.A07(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0B.A08(4);
            this.A0B.A08(1);
            long pts = this.A0B.A04(15) << 15;
            long A04 = (this.A0B.A04(3) << 30) | pts;
            this.A0B.A08(1);
            long pts2 = this.A0B.A04(15);
            long j10 = A04 | pts2;
            this.A0B.A08(1);
            if (!this.A09 && this.A07) {
                this.A0B.A08(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A0B.A08(1);
                this.A05.A07((pts3 << 30) | (this.A0B.A04(15) << 15) | this.A0B.A04(15));
                this.A09 = true;
            }
            long A07 = this.A05.A07(j10);
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[0] = "6AogH8RWxNyij6hxqSYa8P9zwf4Mdgm0";
            strArr2[4] = "6tyuKewD4n9B0EZuYotj001PJTEDYfzK";
            this.A04 = A07;
        }
    }

    private void A03(int i10) {
        this.A03 = i10;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A07(0);
        int A04 = this.A0B.A04(24);
        if (A04 != 1) {
            Log.w(A00(11, 9, 107), A00(20, 30, 8) + A04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A08(8);
        int A042 = this.A0B.A04(16);
        this.A0B.A08(5);
        boolean A0F = this.A0B.A0F();
        int packetLength = A0D[3].charAt(26);
        if (packetLength != 49) {
            A0D[3] = "JrJOHM6OOBIhOvjU9AJKw7oOnpU1hHPD";
            this.A06 = A0F;
            this.A0B.A08(2);
            this.A08 = this.A0B.A0F();
            this.A07 = this.A0B.A0F();
            this.A0B.A08(6);
            int startCodePrefix = this.A0B.A04(8);
            this.A01 = startCodePrefix;
            if (A042 == 0) {
                this.A02 = -1;
            } else {
                int startCodePrefix2 = A042 + 6;
                int packetLength2 = startCodePrefix2 - 9;
                int startCodePrefix3 = this.A01;
                this.A02 = packetLength2 - startCodePrefix3;
            }
            return true;
        }
        throw new RuntimeException();
    }

    private boolean A05(I4 i42, byte[] bArr, int i10) {
        int min = Math.min(i42.A04(), i10 - this.A00);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            i42.A0Z(min);
        } else {
            int bytesToRead = this.A00;
            i42.A0c(bArr, bytesToRead, min);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A4o(I4 i42, boolean z10) throws A0 {
        int readLength;
        if (z10) {
            int i10 = this.A03;
            String A00 = A00(11, 9, 107);
            switch (i10) {
                case 2:
                    Log.w(A00, A00(50, 50, 75));
                    break;
                case 3:
                    if (this.A02 != -1) {
                        Log.w(A00, A00(100, 37, 40) + this.A02 + A00(0, 11, 83));
                    }
                    this.A0A.AEL();
                    break;
            }
            A03(1);
        }
        while (i42.A04() > 0) {
            switch (this.A03) {
                case 0:
                    i42.A0Z(i42.A04());
                    break;
                case 1:
                    if (!A05(i42, this.A0B.A00, 9)) {
                        break;
                    } else {
                        readLength = A04() ? 2 : 0;
                        A03(readLength);
                        break;
                    }
                case 2:
                    if (A05(i42, this.A0B.A00, Math.min(10, this.A01)) && A05(i42, null, this.A01)) {
                        A01();
                        this.A0A.AEM(this.A04, this.A06);
                        A03(3);
                        break;
                    }
                    break;
                case 3:
                    int A04 = i42.A04();
                    readLength = this.A02 != -1 ? A04 - this.A02 : 0;
                    if (readLength > 0) {
                        A04 -= readLength;
                        i42.A0X(i42.A06() + A04);
                    }
                    this.A0A.A4n(i42);
                    if (this.A02 == -1) {
                        break;
                    } else {
                        this.A02 -= A04;
                        if (this.A02 != 0) {
                            break;
                        } else {
                            this.A0A.AEL();
                            A03(1);
                            break;
                        }
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void A9F(IG ig2, InterfaceC0725Bz interfaceC0725Bz, DH dh2) {
        this.A05 = ig2;
        this.A0A.A5B(interfaceC0725Bz, dh2);
    }

    @Override // com.facebook.ads.redexgen.X.DI
    public final void AG6() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AG6();
    }
}

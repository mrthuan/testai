package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Yg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1276Yg extends CB {
    public static byte[] A05;
    public static String[] A06 = {"lGyDkwtSGWnyBDNx8VCH6YS5wU7hPdWQ", "PgowCxsSC8EJKJT6apDR", "LPWWnTonb9RlyYc30tl", "RtHeIiqAKzH58z", "0jwO409h5d63SGevyEOv", "LIh4yarHvfESg0ILrv8Z9A7hNJPgMM", "W4YWO", "dzZdewsfodUdBsfR1Ihh4NImnUsz5jl1"};
    public int A00;
    public int A01;
    public boolean A02;
    public final I4 A03;
    public final I4 A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        String[] strArr = A06;
        if (strArr[0].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        A06[5] = "sxdlVolwhrQkkfqceIwrm1GozpbCc1";
        A05 = new byte[]{-34, -15, -20, -19, -9, -88, -18, -9, -6, -11, -23, -4, -88, -10, -9, -4, -88, -5, -3, -8, -8, -9, -6, -4, -19, -20, -62, -88, Field.FORMCHECKBOX, 58, Field.AUTONUMLGL, Field.AUTONUM, 64, 0, Field.GOTOBUTTON, Field.FORMCHECKBOX, Field.AUTONUMOUT};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.CB
    public final void A0B(I4 i42, long j10) throws A0 {
        int A0E = i42.A0E();
        long A09 = j10 + (i42.A09() * 1000);
        if (A0E == 0 && !this.A02) {
            I4 i43 = new I4(new byte[i42.A04()]);
            i42.A0c(i43.A00, 0, i42.A04());
            IM A00 = IM.A00(i43);
            this.A01 = A00.A02;
            super.A00.A69(Format.A03(null, A00(28, 9, 125), null, -1, -1, A00.A03, A00.A01, -1.0f, A00.A04, -1, A00.A00, null));
            this.A02 = true;
        } else if (A0E == 1 && this.A02) {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = 4 - this.A01;
            int i11 = 0;
            while (i42.A04() > 0) {
                i42.A0c(this.A03.A00, i10, this.A01);
                this.A03.A0Y(0);
                int A0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AFv(this.A04, 4);
                super.A00.AFv(i42, A0H);
                i11 = i11 + 4 + A0H;
            }
            super.A00.AFw(A09, this.A00 == 1 ? 1 : 0, i11, 0, null);
        }
    }

    static {
        A01();
    }

    public C1276Yg(C9 c92) {
        super(c92);
        this.A04 = new I4(I0.A03);
        this.A03 = new I4(4);
    }

    @Override // com.facebook.ads.redexgen.X.CB
    public final boolean A0C(I4 i42) throws C1277Yh {
        int A0E = i42.A0E();
        int header = A0E >> 4;
        int frameType = header & 15;
        int i10 = A0E & 15;
        if (i10 == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new C1277Yh(A00(0, 28, 52) + i10);
    }
}

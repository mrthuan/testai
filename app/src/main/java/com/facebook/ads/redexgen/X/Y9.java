package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: assets/audience_network.dex */
public final class Y9 implements D3 {
    public static String[] A0B = {"TkW4Q2bBhnlky9L9gBU", "OTtOSrO8lVqNeqK", "gcjHC84cFmamxiMmHt5S5U5SPqj2XSpW", "Eloewij7dvh3sVfNoP7", "E9u", "xu3KlcDOtb935QSXm64jbOFXCY3bMbik", "6zPY9SaXzyiNpOJlUeuvKLKV0DJoJqs2", "Dk4E9liU2bPMCrD"};
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Format A06;
    public C9 A07;
    public String A08;
    public final String A0A;
    public final I4 A09 = new I4(new byte[18]);
    public int A02 = 0;

    public Y9(String str) {
        this.A0A = str;
    }

    private void A00() {
        byte[] bArr = this.A09.A00;
        if (this.A06 == null) {
            this.A06 = B6.A03(bArr, this.A08, this.A0A, null);
            this.A07.A69(this.A06);
        }
        this.A01 = B6.A01(bArr);
        this.A04 = (int) ((B6.A02(bArr) * 1000000) / this.A06.A0C);
    }

    private boolean A01(I4 i42) {
        while (i42.A04() > 0) {
            this.A03 <<= 8;
            this.A03 |= i42.A0E();
            if (B6.A07(this.A03)) {
                this.A09.A00[0] = (byte) ((this.A03 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                this.A09.A00[1] = (byte) ((this.A03 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                this.A09.A00[2] = (byte) ((this.A03 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                this.A09.A00[3] = (byte) (this.A03 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                this.A00 = 4;
                this.A03 = 0;
                return true;
            }
        }
        return false;
    }

    private boolean A02(I4 i42, byte[] bArr, int i10) {
        int min = Math.min(i42.A04(), i10 - this.A00);
        int bytesToRead = this.A00;
        i42.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i10;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A4n(I4 i42) {
        while (i42.A04() > 0) {
            switch (this.A02) {
                case 0:
                    boolean A01 = A01(i42);
                    String[] strArr = A0B;
                    if (strArr[6].charAt(16) == strArr[2].charAt(16)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0B;
                    strArr2[6] = "vJJySpYpY4s5PRD1UwRc4UjNF5kKIFhq";
                    strArr2[2] = "Xw64JjLsN3sWfRs1lIaFUfhIxGI92G0x";
                    if (!A01) {
                        break;
                    } else {
                        this.A02 = 1;
                        break;
                    }
                case 1:
                    if (!A02(i42, this.A09.A00, 18)) {
                        break;
                    } else {
                        A00();
                        this.A09.A0Y(0);
                        this.A07.AFv(this.A09, 18);
                        this.A02 = 2;
                        break;
                    }
                case 2:
                    int min = Math.min(i42.A04(), this.A01 - this.A00);
                    this.A07.AFv(i42, min);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + min;
                    int i10 = this.A00;
                    int bytesToRead2 = this.A01;
                    if (i10 != bytesToRead2) {
                        break;
                    } else {
                        this.A07.AFw(this.A05, 1, this.A01, 0, null);
                        this.A05 += this.A04;
                        this.A02 = 0;
                        break;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A5B(InterfaceC0725Bz interfaceC0725Bz, DH dh2) {
        dh2.A05();
        this.A08 = dh2.A04();
        this.A07 = interfaceC0725Bz.AHA(dh2.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEL() {
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AEM(long j10, boolean z10) {
        this.A05 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void AG6() {
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }
}

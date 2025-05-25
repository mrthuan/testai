package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class Y6 implements D3 {
    public static byte[] A0E;
    public long A00;
    public long A01;
    public C9 A02;
    public D7 A03;
    public String A04;
    public boolean A05;
    public final DC A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final D9 A08 = new D9(7, 128);
    public final D9 A06 = new D9(8, 128);
    public final D9 A07 = new D9(6, 128);
    public final I4 A0A = new I4();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{Field.AUTONUM, 41, 36, Field.PAGEREF, Field.GLOSSARY, 111, 33, Field.AUTONUM, Field.QUOTE};
    }

    public Y6(DC dc2, boolean z10, boolean z11) {
        this.A09 = dc2;
        this.A0B = z10;
        this.A0C = z11;
    }

    private void A02(long j10, int i10, int i11, long j11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A04(i11);
            this.A06.A04(i11);
            if (!this.A05) {
                if (this.A08.A03() && this.A06.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    arrayList.add(Arrays.copyOf(this.A06.A01, this.A06.A00));
                    C0864Hz A06 = I0.A06(this.A08.A01, 3, this.A08.A00);
                    C0863Hy ppsData = I0.A05(this.A06.A01, 3, this.A06.A00);
                    this.A02.A69(Format.A03(this.A04, A00(0, 9, 121), null, -1, -1, A06.A06, A06.A02, -1.0f, arrayList, -1, A06.A00, null));
                    this.A05 = true;
                    this.A03.A05(A06);
                    this.A03.A04(ppsData);
                    this.A08.A00();
                    this.A06.A00();
                }
            } else if (this.A08.A03()) {
                this.A03.A05(I0.A06(this.A08.A01, 3, this.A08.A00));
                this.A08.A00();
            } else if (this.A06.A03()) {
                this.A03.A04(I0.A05(this.A06.A01, 3, this.A06.A00));
                this.A06.A00();
            }
        }
        if (this.A07.A04(i11)) {
            int unescapedLength = I0.A02(this.A07.A01, this.A07.A00);
            this.A0A.A0b(this.A07.A01, unescapedLength);
            this.A0A.A0Y(4);
            this.A09.A02(j11, this.A0A);
        }
        this.A03.A02(j10, i10);
    }

    private void A03(long j10, int i10, long j11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i10);
            this.A06.A01(i10);
        }
        this.A07.A01(i10);
        this.A03.A03(j10, i10, j11);
    }

    private void A04(byte[] bArr, int i10, int i11) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i10, i11);
            this.A06.A02(bArr, i10, i11);
        }
        this.A07.A02(bArr, i10, i11);
        this.A03.A06(bArr, i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A4n(I4 i42) {
        int A06 = i42.A06();
        int A07 = i42.A07();
        byte[] bArr = i42.A00;
        long j10 = this.A01;
        int offset = i42.A04();
        this.A01 = j10 + offset;
        C9 c92 = this.A02;
        int offset2 = i42.A04();
        c92.AFv(i42, offset2);
        while (true) {
            int A04 = I0.A04(bArr, A06, A07, this.A0D);
            if (A04 == A07) {
                A04(bArr, A06, A07);
                return;
            }
            int lengthToNalUnit = I0.A01(bArr, A04);
            int i10 = A04 - A06;
            if (i10 > 0) {
                A04(bArr, A06, A04);
            }
            int i11 = A07 - A04;
            long j11 = this.A01 - i11;
            int offset3 = i10 < 0 ? -i10 : 0;
            A02(j11, i11, offset3, this.A00);
            A03(j11, lengthToNalUnit, this.A00);
            A06 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.D3
    public final void A5B(InterfaceC0725Bz interfaceC0725Bz, DH dh2) {
        dh2.A05();
        this.A04 = dh2.A04();
        this.A02 = interfaceC0725Bz.AHA(dh2.A03(), 2);
        this.A03 = new D7(this.A02, this.A0B, this.A0C);
        this.A09.A03(interfaceC0725Bz, dh2);
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
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
